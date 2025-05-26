package top.tntok.autobot;

import java.util.Arrays;

public final class o0OOOO {
    public static final int I11lLL1 = 5;
    public static final int IiIIlIL = 7;
    public static final int iLLLILIiLi1Ii = 6;
    public static final int iiIliillii = 2;
    public static final int iilLiIIIi11i = 10;
    public static final int iilLil1i11I1 = 4;
    public static final int il1LilLllii = 1;
    public static final int illlI1lLIL = 65535;
    public final int[] i1LIL11l = new int[10];
    public int iiI1L1iI;

    public int I11lLL1(int i) {
        if ((this.iiI1L1iI & 32) != 0) {
            return this.i1LIL11l[5];
        }
        return i;
    }

    public boolean IiIIlIL(int i) {
        if (((1 << i) & this.iiI1L1iI) != 0) {
            return true;
        }
        return false;
    }

    public o0OOOO IiiL1llIIi(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.i1LIL11l;
            if (i < iArr.length) {
                this.iiI1L1iI = (1 << i) | this.iiI1L1iI;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public int i1LIL11l(int i) {
        return this.i1LIL11l[i];
    }

    public int iILiI1lll() {
        return Integer.bitCount(this.iiI1L1iI);
    }

    public int iLLLILIiLi1Ii(int i) {
        if ((this.iiI1L1iI & 64) != 0) {
            return this.i1LIL11l[6];
        }
        return i;
    }

    public void iiI1L1iI() {
        this.iiI1L1iI = 0;
        Arrays.fill(this.i1LIL11l, 0);
    }

    public int iiIliillii() {
        if ((this.iiI1L1iI & 128) != 0) {
            return this.i1LIL11l[7];
        }
        return 65535;
    }

    public void iilLiIIIi11i(o0OOOO o0oooo) {
        for (int i = 0; i < 10; i++) {
            if (o0oooo.IiIIlIL(i)) {
                IiiL1llIIi(i, o0oooo.i1LIL11l(i));
            }
        }
    }

    public int iilLil1i11I1(int i) {
        if ((this.iiI1L1iI & 16) != 0) {
            return this.i1LIL11l[4];
        }
        return i;
    }

    public int il1LilLllii() {
        if ((this.iiI1L1iI & 2) != 0) {
            return this.i1LIL11l[1];
        }
        return -1;
    }

    public boolean illlI1lLIL(boolean z) {
        int i;
        if ((this.iiI1L1iI & 4) != 0) {
            i = this.i1LIL11l[2];
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }
}
