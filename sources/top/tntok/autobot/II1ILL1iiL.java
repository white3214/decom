package top.tntok.autobot;

import java.util.Objects;

public class II1ILL1iiL {
    public int i1LIL11l;
    public final byte[] iiI1L1iI;
    public int il1LilLllii;
    public int illlI1lLIL;

    public II1ILL1iiL(int i) {
        this.iiI1L1iI = new byte[i];
        this.i1LIL11l = 0;
        this.illlI1lLIL = 0;
        this.il1LilLllii = 0;
    }

    public boolean I11lLL1() {
        if (this.il1LilLllii < this.iiI1L1iI.length) {
            return true;
        }
        return false;
    }

    public boolean IiIIlIL(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset: " + i);
        } else if (i2 < 0 || i2 > this.iiI1L1iI.length) {
            throw new IllegalArgumentException("Invalid length: " + i2);
        } else if (i2 < this.il1LilLllii) {
            return false;
        } else {
            int i3 = this.i1LIL11l;
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr2 = this.iiI1L1iI;
                if (bArr2[i3] != bArr[i4 + i]) {
                    return false;
                }
                i3++;
                if (i3 == bArr2.length) {
                    i3 = 0;
                }
            }
            return true;
        }
    }

    public void IiiL1llIIi(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset: " + i);
        } else if (i2 < 0 || i2 > this.iiI1L1iI.length) {
            throw new IllegalArgumentException("Invalid length: " + i2);
        } else {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("The supplied byte array contains only ");
                sb.append(bArr.length);
                sb.append(" bytes, but offset, and length would require ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.il1LilLllii >= i2) {
                int i4 = 0;
                while (i4 < i2) {
                    int i5 = i + 1;
                    byte[] bArr2 = this.iiI1L1iI;
                    int i6 = this.i1LIL11l;
                    bArr[i] = bArr2[i6];
                    this.il1LilLllii--;
                    int i7 = i6 + 1;
                    this.i1LIL11l = i7;
                    if (i7 == bArr2.length) {
                        this.i1LIL11l = 0;
                    }
                    i4++;
                    i = i5;
                }
            } else {
                throw new IllegalStateException("Currently, there are only " + this.il1LilLllii + "in the buffer, not " + i2);
            }
        }
    }

    public void i1LIL11l(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Invalid length: " + i2);
        } else if (this.il1LilLllii + i2 <= this.iiI1L1iI.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = this.iiI1L1iI;
                int i4 = this.illlI1lLIL;
                bArr2[i4] = bArr[i + i3];
                int i5 = i4 + 1;
                this.illlI1lLIL = i5;
                if (i5 == bArr2.length) {
                    this.illlI1lLIL = 0;
                }
            }
            this.il1LilLllii += i2;
        } else {
            throw new IllegalStateException("No space available");
        }
    }

    public boolean iLLLILIiLi1Ii(int i) {
        if (this.il1LilLllii + i <= this.iiI1L1iI.length) {
            return true;
        }
        return false;
    }

    public void iiI1L1iI(byte b) {
        int i = this.il1LilLllii;
        byte[] bArr = this.iiI1L1iI;
        if (i < bArr.length) {
            int i2 = this.illlI1lLIL;
            bArr[i2] = b;
            this.il1LilLllii = i + 1;
            int i3 = i2 + 1;
            this.illlI1lLIL = i3;
            if (i3 == bArr.length) {
                this.illlI1lLIL = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException("No space available");
    }

    public int iiIliillii() {
        return this.iiI1L1iI.length - this.il1LilLllii;
    }

    public byte iilLiIIIi11i() {
        int i = this.il1LilLllii;
        if (i > 0) {
            byte[] bArr = this.iiI1L1iI;
            int i2 = this.i1LIL11l;
            byte b = bArr[i2];
            this.il1LilLllii = i - 1;
            int i3 = i2 + 1;
            this.i1LIL11l = i3;
            if (i3 == bArr.length) {
                this.i1LIL11l = 0;
            }
            return b;
        }
        throw new IllegalStateException("No bytes available.");
    }

    public boolean iilLil1i11I1() {
        if (this.il1LilLllii > 0) {
            return true;
        }
        return false;
    }

    public int il1LilLllii() {
        return this.il1LilLllii;
    }

    public void illlI1lLIL() {
        this.i1LIL11l = 0;
        this.illlI1lLIL = 0;
        this.il1LilLllii = 0;
    }

    public II1ILL1iiL() {
        this(8192);
    }
}
