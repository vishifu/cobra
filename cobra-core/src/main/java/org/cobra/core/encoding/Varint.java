package org.cobra.core.encoding;

import org.cobra.commons.Jvm;
import org.cobra.core.bytes.SequencedBytes;
import org.cobra.core.memory.OSMemory;
import org.cobra.core.objects.BlobInput;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

@SuppressWarnings("DuplicatedCode")
public class Varint {

    private static final OSMemory memory = Jvm.osMemory();

    public static final Varint INSTANCE = new Varint();

    public static final String ATTEMPT_TO_READ_NULL_AS_INTEGER = "Attempt to read null value as Integer";
    public static final String ATTEMPT_TO_READ_NULL_AS_LONG = "Attempt to read null as Long";

    private Varint() {
        // Prevent constructor
        // Please use INSTANCE
    }

    public void writeVarInt(byte[] data, int pos, int value) {
        int ui32 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui32 & 0x7f);
            ui32 >>= 7;
            if (ui32 != 0) {
                b0 = setMsbContinuation(b0);
            }
            data[pos++] = b0;
        } while (ui32 != 0);
    }

    public int readVarInt(byte[] data, int pos) {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = data[pos++];
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui32);
    }

    public void writeVarInt(ByteBuffer buffer, int value) {
        int ui32 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui32 & 0x7f);
            ui32 >>= 7;
            if (ui32 > 0) {
                b0 = setMsbContinuation(b0);
            }
            buffer.put(b0);
        } while (ui32 > 0);
    }

    public void writeVarInt(OutputStream output, int value) throws IOException {
        int ui32 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui32 & 0x7f);
            ui32 >>= 7;
            if (ui32 != 0) {
                b0 = setMsbContinuation(b0);
            }
            output.write(b0);
        } while (ui32 > 0);
    }

    public long writeVarInt(long address, int value) {
        long ui32 = Zigzag.encode(value);

        do {
            byte b = (byte) (ui32 & 0x7f);
            ui32 >>= 7;
            if (ui32 > 0) {
                b = setMsbContinuation(b);
            }
            memory.writeByte(address++, b);
        } while (ui32 > 0);

        return address;
    }

    public void writeVarInt(SequencedBytes bytes, int value) {
        long ui32 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui32 & 0x7f);
            ui32 >>= 7;
            if (ui32 != 0) {
                b0 = setMsbContinuation(b0);
            }
            bytes.write(b0);
        } while (ui32 != 0);
    }


    public int readVarInt(ByteBuffer buffer) {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = buffer.get();
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }
        return Zigzag.decode(ui32);
    }

    public int readVarInt(InputStream input) throws IOException {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = safeReadByte(input);
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }
        return Zigzag.decode(ui32);
    }

    public int readVarInt(BlobInput input) throws IOException {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = safeReadByte(input);
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }
        return Zigzag.decode(ui32);
    }

    public int readVarInt(long address) {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = memory.readByte(address++);
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }
        return Zigzag.decode(ui32);
    }

    public int readVarInt(SequencedBytes bytes) {
        int ui32 = 0, shift = 0;
        while (true) {
            byte b0 = bytes.read();
            ui32 |= (b0 & 0x7f) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }
        return Zigzag.decode(ui32);
    }

    public void writeVarLong(byte[] data, int pos, long value) {
        long ui64 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui64 & 0x7f);
            ui64 >>= 7;
            if (ui64 != 0) {
                b0 = setMsbContinuation(b0);
            }
            data[pos++] = b0;
        } while (ui64 != 0);
    }

    public void writeVarLong(ByteBuffer buffer, long value) {
        long ui64 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui64 & 0x7f);
            ui64 >>= 7;
            if (ui64 != 0) {
                b0 = setMsbContinuation(b0);
            }
            buffer.put(b0);
        } while (ui64 != 0);
    }

    public void writeVarLong(OutputStream os, long value) throws IOException {
        long ui64 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui64 & 0x7f);
            ui64 >>= 7;
            if (ui64 != 0) {
                b0 = setMsbContinuation(b0);
            }
            os.write(b0);
        } while (ui64 != 0);
    }

    public long writeVarLong(long address, long value) {
        long ui64 = Zigzag.encode(value);
        do {
            byte b0 = (byte) (ui64 & 0x7f);
            ui64 >>= 7;
            if (ui64 != 0) {
                b0 = setMsbContinuation(b0);
            }
            memory.writeByte(address++, b0);
        } while (ui64 != 0);
        return address;
    }

    public void writeVarLong(SequencedBytes bytes, long val) {
        long ui64 = Zigzag.encode(val);
        do {
            byte b0 = (byte) (ui64 & 0x7f);
            ui64 >>= 7;
            if (ui64 != 0) {
                b0 = setMsbContinuation(b0);
            }
            bytes.write(b0);
        } while (ui64 != 0);
    }

    public long readVarLong(byte[] data, int pos) {
        long ui32 = 0;
        int shift = 0;
        while (true) {
            byte b0 = data[pos++];
            ui32 |= (b0 & 0x7fL) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui32);
    }

    public long readVarLong(ByteBuffer buffer) {
        long ui64 = 0;
        int shift = 0;
        while (true) {
            byte b0 = buffer.get();
            ui64 |= (b0 & 0x7fL) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui64);
    }

    public long readVarLong(InputStream input) throws IOException {
        long ui64 = 0;
        int shift = 0;
        while (true) {
            byte b0 = safeReadByte(input);
            ui64 |= (b0 & 0x7fL) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui64);
    }

    public long readVarLong(long address) {
        long ui64 = 0;
        int shift = 0;
        while (true) {
            byte b0 = memory.readByte(address++);
            ui64 |= (b0 & 0x7fL) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui64);
    }

    public long readVarLong(SequencedBytes bytes) {
        long ui64 = 0;
        int shift = 0;
        while (true) {
            byte b0 = bytes.read();
            ui64 |= (b0 & 0x7fL) << shift;
            shift += 7;

            if ((b0 & 0x80) == 0) {
                break;
            }
        }

        return Zigzag.decode(ui64);
    }

    public int sizeOfVarint(int i32) {
        int ui32 = Zigzag.encode(i32);
        int sizeof = 0;
        do {
            sizeof++;
            ui32 >>= 7;
        } while (ui32 > 0);

        return sizeof;
    }

    public int sizeOfVarint(long i64) {
        long ui64 = Zigzag.encode(i64);
        int sizeof = 0;
        do {
            sizeof++;
            ui64 >>= 7;
        } while (ui64 > 0);

        return sizeof;
    }

    private static byte setMsbContinuation(byte b) {
        return (byte) (b | 0x80);
    }

    private static byte safeReadByte(InputStream is) throws IOException {
        int i = is.read();
        if (i == -1)
            throw new EOFException("Unexpected end of stream");

        return (byte) i;
    }

    private static byte safeReadByte(BlobInput blobInput) throws IOException {
        int i = blobInput.read();
        if (i == -1)
            throw new EOFException("Unexpected end of blob-input");

        return (byte) i;
    }
}
