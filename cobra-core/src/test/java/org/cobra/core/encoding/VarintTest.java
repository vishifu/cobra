package org.cobra.core.varint;

import org.cobra.commons.Jvm;
import org.cobra.core.bytes.OnHeapBytes;
import org.cobra.core.encoding.Varint;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VarintTest {

    private byte[] bytes;
    private OnHeapBytes onHeapBytes;

    static Varint varint;

    @BeforeAll
    static void setupOnce() {
        varint = Jvm.varint();
    }

    @BeforeEach
    void setUp() {
        bytes = new byte[20];
        onHeapBytes = OnHeapBytes.createLog2Align(8);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write_read_int() throws IOException {
        int[] vs = new int[]{0, 1, 4200, -4200, 34250, -34250, 654435, -654435};

        /* write to byte[] */
        for (int i32 : vs) {
            varint.writeVarInt(bytes, 0, i32);
            int ret = varint.readVarInt(bytes, 0);
            if (ret != i32) {
                Assertions.fail(i32 + " != " + ret);
            }
        }

        /* write to ByteBuffer */
        ByteBuffer buf = ByteBuffer.allocate(20);
        for (int i32 : vs) {
            buf.rewind();
            varint.writeVarInt(buf, i32);

            buf.rewind();
            int ret = varint.readVarInt(buf);
            if (ret != i32) {
                Assertions.fail(i32 + " != " + ret);
            }
        }

        /* write to stream */
        for (int i32 : vs) {
            ByteArrayOutputStream os = new ByteArrayOutputStream(20);
            varint.writeVarInt(os, i32);

            ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
            int ret = varint.readVarInt(is);

            if (i32 != ret) {
                Assertions.fail(i32 + " != " + ret);
            }
        }

        /* write to memory address */
        long memAddr = Jvm.osMemory().allocate(20);
        for (int i32 : vs) {
            long afterWriteAddr = varint.writeVarInt(memAddr, i32);
            int ret = varint.readVarInt(memAddr);

            assertEquals(memAddr + varint.sizeOfVarint(i32), afterWriteAddr);

            if (ret != i32) {
                Assertions.fail(i32 + " != " + ret);
            }
        }

        /* write to heap bytes */
        for (int i32 : vs) {
            onHeapBytes.rewind();
            varint.writeVarInt(onHeapBytes, i32);

            onHeapBytes.rewind();
            int ret = varint.readVarInt(onHeapBytes);
            if (ret != i32) {
                Assertions.fail(i32 + " != " + ret);
            }
        }

    }

    @Test
    void write_read_long() throws IOException {
        long[] ls = new long[]{0, 1, -1, 30, -30, 128, 500, 15536, -15536, (1L << 45), -(1L << 25)};
        /* write to byte[] */
        for (long l : ls) {
            varint.writeVarLong(bytes, 0, l);
            long ret = varint.readVarLong(bytes, 0);
            if (ret != l) {
                Assertions.fail(l + " != " + ret);
            }
        }

        /* write to ByteBuffer */
        ByteBuffer buf = ByteBuffer.allocate(20);
        for (long l : ls) {
            buf.rewind();
            varint.writeVarLong(buf, l);

            buf.rewind();
            long ret = varint.readVarLong(buf);
            if (ret != l) {
                Assertions.fail(l + " != " + ret);
            }
        }

        /* write to stream */
        for (long l : ls) {
            ByteArrayOutputStream os = new ByteArrayOutputStream(20);
            varint.writeVarLong(os, l);

            ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
            long ret = varint.readVarLong(is);
            if (ret != l) {
                Assertions.fail(l + " != " + ret);
            }
        }

        /* write to heap bytes */
        for (long l : ls) {
            onHeapBytes.rewind();
            varint.writeVarLong(onHeapBytes, l);

            onHeapBytes.rewind();
            long ret = varint.readVarLong(onHeapBytes);
            if (ret != l) {
                Assertions.fail(l + " != " + ret);
            }
        }

        /* write to memory address */
        long memAddr = Jvm.osMemory().allocate(20);
        for (long l : ls) {
            long afterWriteAddr = varint.writeVarLong(memAddr, l);
            long ret = varint.readVarLong(memAddr);
            if (ret != l) {
                Assertions.fail(l + " != " + ret);
            }
            assertEquals(memAddr + varint.sizeOfVarint(l), afterWriteAddr);
        }
    }

    @Test
    void test()  {
        varint.writeVarInt(bytes,0, 15);
        System.out.println(Arrays.toString(bytes));
    }

}