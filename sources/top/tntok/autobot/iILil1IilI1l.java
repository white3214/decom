package top.tntok.autobot;

public final class iILil1IilI1l {
    public static int i1LIL11l(byte b) {
        return b & i1IL1lILl1L1I.iiI1L1iI;
    }

    public static float iiI1L1iI(short s) {
        if (s == Short.MAX_VALUE) {
            return 1.0f;
        }
        return ((float) s) / 32768.0f;
    }

    public static float il1LilLllii(short s) {
        int illlI1lLIL = illlI1lLIL(s);
        if (illlI1lLIL == 65535) {
            return 1.0f;
        }
        return ((float) illlI1lLIL) / 65536.0f;
    }

    public static int illlI1lLIL(short s) {
        return s & 65535;
    }
}
