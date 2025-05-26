package top.tntok.autobot;

import java.nio.ByteOrder;

public final class i1II1iL {
    public static ByteOrder iiI1L1iI(String str) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (byteOrder.toString().equals(str)) {
            return byteOrder;
        }
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (byteOrder2.toString().equals(str)) {
            return byteOrder2;
        }
        throw new IllegalArgumentException("Unsupported byte order setting: " + str + ", expected one of " + byteOrder2 + ", " + byteOrder);
    }
}
