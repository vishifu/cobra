package org.cobra.core.encoding;

public class Zigzag {

    public static int encode(int n) {
        return (n << 1) ^ (n >> 31);
    }

    public static long encode(long n) {
        return (n << 1) ^ (n >> 61);
    }

    public static int decode(int n) {
        return (n >>> 1) ^ -(n & 1);
    }

    public static long decode(long n) {
        return (n >>> 1) ^ -(n & 1);
    }

}
