package top.tntok.autobot;

import java.io.InputStream;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0Oooo0  reason: case insensitive filesystem */
public class C0479o0Oooo0 extends InputStream {
    public static final int iilLil1i11I1 = -1;
    public final byte[] i1LIL11l;
    public int iiIliillii;
    public int il1LilLllii;
    public final int illlI1lLIL;

    public C0479o0Oooo0(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.i1LIL11l = bArr;
        this.il1LilLllii = 0;
        this.illlI1lLIL = bArr.length;
        this.iiIliillii = 0;
    }

    public int available() {
        int i = this.il1LilLllii;
        int i2 = this.illlI1lLIL;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public void mark(int i) {
        this.iiIliillii = this.il1LilLllii;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        int i = this.il1LilLllii;
        if (i >= this.illlI1lLIL) {
            return -1;
        }
        byte[] bArr = this.i1LIL11l;
        this.il1LilLllii = i + 1;
        return bArr[i] & i1IL1lILl1L1I.iiI1L1iI;
    }

    public void reset() {
        this.il1LilLllii = this.iiIliillii;
    }

    public long skip(long j) {
        if (j >= 0) {
            int i = this.illlI1lLIL;
            int i2 = this.il1LilLllii;
            long j2 = (long) (i - i2);
            if (j >= j2) {
                j = j2;
            }
            this.il1LilLllii = (int) (((long) i2) + j);
            return j;
        }
        throw new IllegalArgumentException("Skipping backward is not supported");
    }

    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr);
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.il1LilLllii;
        int i4 = this.illlI1lLIL;
        if (i3 >= i4) {
            return -1;
        }
        int i5 = i4 - i3;
        if (i2 >= i5) {
            i2 = i5;
        }
        if (i2 <= 0) {
            return 0;
        }
        System.arraycopy(this.i1LIL11l, i3, bArr, i, i2);
        this.il1LilLllii += i2;
        return i2;
    }

    public C0479o0Oooo0(byte[] bArr, int i) {
        Objects.requireNonNull(bArr);
        if (i >= 0) {
            this.i1LIL11l = bArr;
            int min = Math.min(i, bArr.length > 0 ? bArr.length : i);
            this.il1LilLllii = min;
            this.illlI1lLIL = bArr.length;
            this.iiIliillii = min;
            return;
        }
        throw new IllegalArgumentException("offset cannot be negative");
    }

    public C0479o0Oooo0(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        } else if (i2 >= 0) {
            this.i1LIL11l = bArr;
            int min = Math.min(i, bArr.length > 0 ? bArr.length : i);
            this.il1LilLllii = min;
            this.illlI1lLIL = Math.min(min + i2, bArr.length);
            this.iiIliillii = this.il1LilLllii;
        } else {
            throw new IllegalArgumentException("length cannot be negative");
        }
    }
}
