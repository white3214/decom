package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class o0OOO0 extends ili11iILI1l {
    public final transient int[] I11lLL1;
    public final transient byte[][] iilLil1i11I1;

    public o0OOO0(IiILIlLLiIL iiILIlLLiIL, int i) {
        super((byte[]) null);
        C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, (long) i);
        o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = o0ooo00.illlI1lLIL;
            int i6 = o0ooo00.i1LIL11l;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                o0ooo00 = o0ooo00.iilLil1i11I1;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.iilLil1i11I1 = new byte[i4][];
        this.I11lLL1 = new int[(i4 * 2)];
        o0OOO00 o0ooo002 = iiILIlLLiIL.i1LIL11l;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.iilLil1i11I1;
            bArr[i7] = o0ooo002.iiI1L1iI;
            int i8 = o0ooo002.illlI1lLIL;
            int i9 = o0ooo002.i1LIL11l;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.I11lLL1;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            o0ooo002.il1LilLllii = true;
            i7++;
            o0ooo002 = o0ooo002.iilLil1i11I1;
        }
    }

    private Object writeReplace() {
        return Iiiiii1l1I1L1();
    }

    public boolean IIIlll1lll(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > illiiliIILI() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int IillLillLLIii = IillLillLLIii(i);
        while (i3 > 0) {
            if (IillLillLLIii == 0) {
                i4 = 0;
            } else {
                i4 = this.I11lLL1[IillLillLLIii - 1];
            }
            int min = Math.min(i3, ((this.I11lLL1[IillLillLLIii] - i4) + i4) - i);
            int[] iArr = this.I11lLL1;
            byte[][] bArr2 = this.iilLil1i11I1;
            if (!C0485o0Ooooo.iiI1L1iI(bArr2[IillLillLLIii], (i - i4) + iArr[bArr2.length + IillLillLLIii], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            IillLillLLIii++;
        }
        return true;
    }

    public ili11iILI1l IILiIL1i11Li() {
        return Iiiiii1l1I1L1().IILiIL1i11Li();
    }

    public ili11iILI1l IIi1l1i(int i) {
        return Iiiiii1l1I1L1().IIi1l1i(i);
    }

    public ili11iILI1l IIlL1llI1() {
        return Iiiiii1l1I1L1().IIlL1llI1();
    }

    public ili11iILI1l IIlLill() {
        return Iiiiii1l1I1L1().IIlLill();
    }

    public ili11iILI1l IIllllLiIlIl(int i, int i2) {
        return Iiiiii1l1I1L1().IIllllLiIlIl(i, i2);
    }

    public String IL1lILLLL1L() {
        return Iiiiii1l1I1L1().IL1lILLLL1L();
    }

    public String ILiLII1ILi() {
        return Iiiiii1l1I1L1().ILiLII1ILi();
    }

    public ili11iILI1l Ii1liIIIiLi(ili11iILI1l ili11iili1l) {
        return Iiiiii1l1I1L1().Ii1liIIIiLi(ili11iili1l);
    }

    public void IiIl11II(IiILIlLLiIL iiILIlLLiIL) {
        int length = this.iilLil1i11I1.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.I11lLL1;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            o0OOO00 o0ooo00 = new o0OOO00(this.iilLil1i11I1[i], i3, (i3 + i4) - i2, true, false);
            o0OOO00 o0ooo002 = iiILIlLLiIL.i1LIL11l;
            if (o0ooo002 == null) {
                o0ooo00.I11lLL1 = o0ooo00;
                o0ooo00.iilLil1i11I1 = o0ooo00;
                iiILIlLLiIL.i1LIL11l = o0ooo00;
            } else {
                o0ooo002.I11lLL1.illlI1lLIL(o0ooo00);
            }
            i++;
            i2 = i4;
        }
        iiILIlLLiIL.illlI1lLIL += (long) i2;
    }

    public ili11iILI1l IiiIlLl1il1i() {
        return Iiiiii1l1I1L1().IiiIlLl1il1i();
    }

    public final ili11iILI1l Iiiiii1l1I1L1() {
        return new ili11iILI1l(i1LiiIlIL1I());
    }

    public final int IillLillLLIii(int i) {
        int binarySearch = Arrays.binarySearch(this.I11lLL1, 0, this.iilLil1i11I1.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    public boolean IilliIIIlI1ll(int i, ili11iILI1l ili11iili1l, int i2, int i3) {
        int i4;
        if (i < 0 || i > illiiliIILI() - i3) {
            return false;
        }
        int IillLillLLIii = IillLillLLIii(i);
        while (i3 > 0) {
            if (IillLillLLIii == 0) {
                i4 = 0;
            } else {
                i4 = this.I11lLL1[IillLillLLIii - 1];
            }
            int min = Math.min(i3, ((this.I11lLL1[IillLillLLIii] - i4) + i4) - i);
            int[] iArr = this.I11lLL1;
            byte[][] bArr = this.iilLil1i11I1;
            if (!ili11iili1l.IIIlll1lll(i2, bArr[IillLillLLIii], (i - i4) + iArr[bArr.length + IillLillLLIii], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            IillLillLLIii++;
        }
        return true;
    }

    public void Il1llillili(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.iilLil1i11I1.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.I11lLL1;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.iilLil1i11I1[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ili11iILI1l) {
            ili11iILI1l ili11iili1l = (ili11iILI1l) obj;
            if (ili11iili1l.illiiliIILI() != illiiliIILI() || !IilliIIIlI1ll(0, ili11iili1l, 0, illiiliIILI())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.i1LIL11l;
        if (i != 0) {
            return i;
        }
        int length = this.iilLil1i11I1.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.iilLil1i11I1[i2];
            int[] iArr = this.I11lLL1;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.i1LIL11l = i4;
        return i4;
    }

    public ili11iILI1l i111iLiiIIill(ili11iILI1l ili11iili1l) {
        return Iiiiii1l1I1L1().i111iLiiIIill(ili11iili1l);
    }

    public byte[] i11liIIl11Ii1() {
        return i1LiiIlIL1I();
    }

    public byte i1L1lLllLLlIi(int i) {
        int i2;
        C0485o0Ooooo.i1LIL11l((long) this.I11lLL1[this.iilLil1i11I1.length - 1], (long) i, 1);
        int IillLillLLIii = IillLillLLIii(i);
        if (IillLillLLIii == 0) {
            i2 = 0;
        } else {
            i2 = this.I11lLL1[IillLillLLIii - 1];
        }
        int[] iArr = this.I11lLL1;
        byte[][] bArr = this.iilLil1i11I1;
        return bArr[IillLillLLIii][(i - i2) + iArr[bArr.length + IillLillLLIii]];
    }

    public String i1LIL11l() {
        return Iiiiii1l1I1L1().i1LIL11l();
    }

    public byte[] i1LiiIlIL1I() {
        int[] iArr = this.I11lLL1;
        byte[][] bArr = this.iilLil1i11I1;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.I11lLL1;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.iilLil1i11I1[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public int i1iI1iiLL1(byte[] bArr, int i) {
        return Iiiiii1l1I1L1().i1iI1iiLL1(bArr, i);
    }

    public int i1iiLIil1ILi(byte[] bArr, int i) {
        return Iiiiii1l1I1L1().i1iiLIil1ILi(bArr, i);
    }

    public ili11iILI1l iLlIllll() {
        return Iiiiii1l1I1L1().iLlIllll();
    }

    public ByteBuffer iiI1L1iI() {
        return ByteBuffer.wrap(i1LiiIlIL1I()).asReadOnlyBuffer();
    }

    public String illi1LIILLiL(Charset charset) {
        return Iiiiii1l1I1L1().illi1LIILLiL(charset);
    }

    public int illiiliIILI() {
        return this.I11lLL1[this.iilLil1i11I1.length - 1];
    }

    public String illlI1lLIL() {
        return Iiiiii1l1I1L1().illlI1lLIL();
    }

    public String toString() {
        return Iiiiii1l1I1L1().toString();
    }
}
