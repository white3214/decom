package top.tntok.autobot;

import top.tntok.autobot.IiILIlLLiIL;

/* renamed from: top.tntok.autobot.o0o00OO0  reason: case insensitive filesystem */
public final class C0503o0o00OO0 {
    public static final int I11lLL1 = 8;
    public static final int I1iIiIi = 8;
    public static final int I1l1iIll1lIi1 = 127;
    public static final int IL1lILLLL1L = 10;
    public static final int ILl1iII11Ll1 = 1005;
    public static final int Ii1liIIIiLi = 126;
    public static final int IiIIlIL = 127;
    public static final int IiiL1llIIi = 1;
    public static final long IilL11ii1I1Il = 65535;
    public static final long i111iLiiIIill = 123;
    public static final int i1L1lLllLLlIi = 9;
    public static final int i1LIL11l = 128;
    public static final int iILiI1lll = 2;
    public static final long iL1LIlIlI = 125;
    public static final int iLLLILIiLi1Ii = 128;
    public static final String iiI1L1iI = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int iiIliillii = 16;
    public static final int iiLIIiIli = 1001;
    public static final int iilLiIIIi11i = 0;
    public static final int iilLil1i11I1 = 15;
    public static final int il1LilLllii = 32;
    public static final int illlI1lLIL = 64;

    public C0503o0o00OO0() {
        throw new AssertionError("No instances.");
    }

    public static String i1LIL11l(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    public static String iiI1L1iI(String str) {
        return ili11iILI1l.IiiL1llIIi(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").IILiIL1i11Li().i1LIL11l();
    }

    public static void il1LilLllii(int i) {
        String i1LIL11l2 = i1LIL11l(i);
        if (i1LIL11l2 != null) {
            throw new IllegalArgumentException(i1LIL11l2);
        }
    }

    public static void illlI1lLIL(IiILIlLLiIL.illlI1lLIL illli1llil, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = illli1llil.iilLil1i11I1;
            int i2 = illli1llil.I11lLL1;
            int i3 = illli1llil.iLLLILIiLi1Ii;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (illli1llil.i1LIL11l() != -1);
    }
}
