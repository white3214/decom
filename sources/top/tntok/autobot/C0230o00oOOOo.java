package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o00oOOOo  reason: case insensitive filesystem */
public class C0230o00oOOOo extends InputStream {
    public final boolean I11lLL1;
    public final long i1LIL11l;
    public final boolean iLLLILIiLi1Ii;
    public long iiIliillii;
    public boolean iilLil1i11I1;
    public long il1LilLllii;
    public long illlI1lLIL;

    public C0230o00oOOOo() {
        this(0, true, false);
    }

    public int available() {
        long j = this.i1LIL11l - this.illlI1lLIL;
        if (j <= 0) {
            return 0;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public void close() throws IOException {
        this.iilLil1i11I1 = false;
        this.illlI1lLIL = 0;
        this.il1LilLllii = -1;
    }

    public int i111iLiiIIill() {
        return 0;
    }

    public long i1LIL11l() {
        return this.illlI1lLIL;
    }

    public final int iiI1L1iI() throws EOFException {
        this.iilLil1i11I1 = true;
        if (!this.I11lLL1) {
            return -1;
        }
        throw new EOFException();
    }

    public long il1LilLllii() {
        return this.i1LIL11l;
    }

    public synchronized void mark(int i) {
        if (this.iLLLILIiLi1Ii) {
            this.il1LilLllii = this.illlI1lLIL;
            this.iiIliillii = (long) i;
        } else {
            throw new UnsupportedOperationException("Mark not supported");
        }
    }

    public boolean markSupported() {
        return this.iLLLILIiLi1Ii;
    }

    public int read() throws IOException {
        if (!this.iilLil1i11I1) {
            long j = this.illlI1lLIL;
            if (j == this.i1LIL11l) {
                return iiI1L1iI();
            }
            this.illlI1lLIL = j + 1;
            return i111iLiiIIill();
        }
        throw new IOException("Read after end of file");
    }

    public synchronized void reset() throws IOException {
        if (this.iLLLILIiLi1Ii) {
            long j = this.il1LilLllii;
            if (j < 0) {
                throw new IOException("No position has been marked");
            } else if (this.illlI1lLIL <= this.iiIliillii + j) {
                this.illlI1lLIL = j;
                this.iilLil1i11I1 = false;
            } else {
                throw new IOException("Marked position [" + this.il1LilLllii + "] is no longer valid - passed the read limit [" + this.iiIliillii + "]");
            }
        } else {
            throw new UnsupportedOperationException("Mark not supported");
        }
    }

    public long skip(long j) throws IOException {
        if (!this.iilLil1i11I1) {
            long j2 = this.illlI1lLIL;
            long j3 = this.i1LIL11l;
            if (j2 == j3) {
                return (long) iiI1L1iI();
            }
            long j4 = j2 + j;
            this.illlI1lLIL = j4;
            if (j4 <= j3) {
                return j;
            }
            long j5 = j - (j4 - j3);
            this.illlI1lLIL = j3;
            return j5;
        }
        throw new IOException("Skip after end of file");
    }

    public C0230o00oOOOo(long j) {
        this(j, true, false);
    }

    public C0230o00oOOOo(long j, boolean z, boolean z2) {
        this.il1LilLllii = -1;
        this.i1LIL11l = j;
        this.iLLLILIiLi1Ii = z;
        this.I11lLL1 = z2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.iilLil1i11I1) {
            long j = this.illlI1lLIL;
            long j2 = this.i1LIL11l;
            if (j == j2) {
                return iiI1L1iI();
            }
            long j3 = j + ((long) i2);
            this.illlI1lLIL = j3;
            if (j3 > j2) {
                i2 -= (int) (j3 - j2);
                this.illlI1lLIL = j2;
            }
            IiIl11II(bArr, i, i2);
            return i2;
        }
        throw new IOException("Read after end of file");
    }

    public void IiIl11II(byte[] bArr, int i, int i2) {
    }
}
