package top.tntok.autobot;

import javax.annotation.Nullable;

public final class o0OOO00 {
    public static final int IiIIlIL = 1024;
    public static final int iLLLILIiLi1Ii = 8192;
    public o0OOO00 I11lLL1;
    public int i1LIL11l;
    public final byte[] iiI1L1iI;
    public boolean iiIliillii;
    public o0OOO00 iilLil1i11I1;
    public boolean il1LilLllii;
    public int illlI1lLIL;

    public o0OOO00() {
        this.iiI1L1iI = new byte[8192];
        this.iiIliillii = true;
        this.il1LilLllii = false;
    }

    public final void I11lLL1(o0OOO00 o0ooo00, int i) {
        if (o0ooo00.iiIliillii) {
            int i2 = o0ooo00.illlI1lLIL;
            if (i2 + i > 8192) {
                if (!o0ooo00.il1LilLllii) {
                    int i3 = o0ooo00.i1LIL11l;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = o0ooo00.iiI1L1iI;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        o0ooo00.illlI1lLIL -= o0ooo00.i1LIL11l;
                        o0ooo00.i1LIL11l = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.iiI1L1iI, this.i1LIL11l, o0ooo00.iiI1L1iI, o0ooo00.illlI1lLIL, i);
            o0ooo00.illlI1lLIL += i;
            this.i1LIL11l += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public final o0OOO00 i1LIL11l() {
        o0OOO00 o0ooo00;
        o0OOO00 o0ooo002 = this.iilLil1i11I1;
        if (o0ooo002 != this) {
            o0ooo00 = o0ooo002;
        } else {
            o0ooo00 = null;
        }
        o0OOO00 o0ooo003 = this.I11lLL1;
        o0ooo003.iilLil1i11I1 = o0ooo002;
        this.iilLil1i11I1.I11lLL1 = o0ooo003;
        this.iilLil1i11I1 = null;
        this.I11lLL1 = null;
        return o0ooo00;
    }

    public final void iiI1L1iI() {
        int i;
        o0OOO00 o0ooo00 = this.I11lLL1;
        if (o0ooo00 == this) {
            throw new IllegalStateException();
        } else if (o0ooo00.iiIliillii) {
            int i2 = this.illlI1lLIL - this.i1LIL11l;
            int i3 = 8192 - o0ooo00.illlI1lLIL;
            if (o0ooo00.il1LilLllii) {
                i = 0;
            } else {
                i = o0ooo00.i1LIL11l;
            }
            if (i2 <= i3 + i) {
                I11lLL1(o0ooo00, i2);
                i1LIL11l();
                o0OOO00o.iiI1L1iI(this);
            }
        }
    }

    public final o0OOO00 iiIliillii(int i) {
        o0OOO00 o0ooo00;
        if (i <= 0 || i > this.illlI1lLIL - this.i1LIL11l) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            o0ooo00 = il1LilLllii();
        } else {
            o0ooo00 = o0OOO00o.i1LIL11l();
            System.arraycopy(this.iiI1L1iI, this.i1LIL11l, o0ooo00.iiI1L1iI, 0, i);
        }
        o0ooo00.illlI1lLIL = o0ooo00.i1LIL11l + i;
        this.i1LIL11l += i;
        this.I11lLL1.illlI1lLIL(o0ooo00);
        return o0ooo00;
    }

    public final o0OOO00 iilLil1i11I1() {
        return new o0OOO00((byte[]) this.iiI1L1iI.clone(), this.i1LIL11l, this.illlI1lLIL, false, true);
    }

    public final o0OOO00 il1LilLllii() {
        this.il1LilLllii = true;
        return new o0OOO00(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL, true, false);
    }

    public final o0OOO00 illlI1lLIL(o0OOO00 o0ooo00) {
        o0ooo00.I11lLL1 = this;
        o0ooo00.iilLil1i11I1 = this.iilLil1i11I1;
        this.iilLil1i11I1.I11lLL1 = o0ooo00;
        this.iilLil1i11I1 = o0ooo00;
        return o0ooo00;
    }

    public o0OOO00(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.iiI1L1iI = bArr;
        this.i1LIL11l = i;
        this.illlI1lLIL = i2;
        this.il1LilLllii = z;
        this.iiIliillii = z2;
    }
}
