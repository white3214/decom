package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o000o0O0  reason: case insensitive filesystem */
public final class C0098o000o0O0 {
    public static final byte I11lLL1 = 4;
    public static final byte I1iIiIi = 0;
    public static final byte I1l1iIll1lIi1 = 32;
    public static final byte IL1lILLLL1L = 1;
    public static final String[] ILl1iII11Ll1 = new String[64];
    public static final byte Ii1liIIIiLi = 8;
    public static final byte IiIIlIL = 6;
    public static final byte IiiL1llIIi = 8;
    public static final byte IilL11ii1I1Il = 32;
    public static final byte i111iLiiIIill = 4;
    public static final byte i1L1lLllLLlIi = 1;
    public static final int i1LIL11l = 16384;
    public static final String[] i1iiLIil1ILi = new String[256];
    public static final byte iILiI1lll = 9;
    public static final byte iL1LIlIlI = 4;
    public static final byte iLLLILIiLi1Ii = 5;
    public static final ili11iILI1l iiI1L1iI = ili11iILI1l.IiiL1llIIi("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final byte iiIliillii = 2;
    public static final String[] iiLIIiIli = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final byte iilLiIIIi11i = 7;
    public static final byte iilLil1i11I1 = 3;
    public static final byte il1LilLllii = 1;
    public static final byte illlI1lLIL = 0;

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = i1iiLIil1ILi;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C0487o0OooooO.Ii1liIIIiLi("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = ILl1iII11Ll1;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = ILl1iII11Ll1;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = ILl1iII11Ll1;
            if (i < strArr4.length) {
                if (strArr4[i] == null) {
                    strArr4[i] = i1iiLIil1ILi[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static String i1LIL11l(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String[] strArr = iiLIIiIli;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            str = C0487o0OooooO.Ii1liIIIiLi("0x%02x", Byte.valueOf(b));
        }
        String iiI1L1iI2 = iiI1L1iI(b, b2);
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        return C0487o0OooooO.Ii1liIIIiLi("%s 0x%08x %5d %-13s %s", str2, Integer.valueOf(i), Integer.valueOf(i2), str, iiI1L1iI2);
    }

    public static String iiI1L1iI(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    return "ACK";
                }
                return i1iiLIil1ILi[b2];
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = ILl1iII11Ll1;
                if (b2 < strArr.length) {
                    str = strArr[b2];
                } else {
                    str = i1iiLIil1ILi[b2];
                }
                if (b == 5 && (b2 & 4) != 0) {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b != 0 || (b2 & 32) == 0) {
                    return str;
                }
                return str.replace("PRIORITY", "COMPRESSED");
            }
        }
        return i1iiLIil1ILi[b2];
    }

    public static IOException il1LilLllii(String str, Object... objArr) throws IOException {
        throw new IOException(C0487o0OooooO.Ii1liIIIiLi(str, objArr));
    }

    public static IllegalArgumentException illlI1lLIL(String str, Object... objArr) {
        throw new IllegalArgumentException(C0487o0OooooO.Ii1liIIIiLi(str, objArr));
    }
}
