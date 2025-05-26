package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;

public class ILI1Iil1li extends InputStream {
    public final InputStream i1LIL11l;
    public long iiIliillii;
    public boolean iilLil1i11I1;
    public long il1LilLllii;
    public final long illlI1lLIL;

    public ILI1Iil1li(InputStream inputStream, long j) {
        this.il1LilLllii = 0;
        this.iiIliillii = -1;
        this.iilLil1i11I1 = true;
        this.illlI1lLIL = j;
        this.i1LIL11l = inputStream;
    }

    public int available() throws IOException {
        long j = this.illlI1lLIL;
        if (j < 0 || this.il1LilLllii < j) {
            return this.i1LIL11l.available();
        }
        return 0;
    }

    public void close() throws IOException {
        if (this.iilLil1i11I1) {
            this.i1LIL11l.close();
        }
    }

    public void i1LIL11l(boolean z) {
        this.iilLil1i11I1 = z;
    }

    public boolean iiI1L1iI() {
        return this.iilLil1i11I1;
    }

    public synchronized void mark(int i) {
        this.i1LIL11l.mark(i);
        this.iiIliillii = this.il1LilLllii;
    }

    public boolean markSupported() {
        return this.i1LIL11l.markSupported();
    }

    public int read() throws IOException {
        long j = this.illlI1lLIL;
        if (j >= 0 && this.il1LilLllii >= j) {
            return -1;
        }
        int read = this.i1LIL11l.read();
        this.il1LilLllii++;
        return read;
    }

    public synchronized void reset() throws IOException {
        this.i1LIL11l.reset();
        this.il1LilLllii = this.iiIliillii;
    }

    public long skip(long j) throws IOException {
        long j2 = this.illlI1lLIL;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.il1LilLllii);
        }
        long skip = this.i1LIL11l.skip(j);
        this.il1LilLllii += skip;
        return skip;
    }

    public String toString() {
        return this.i1LIL11l.toString();
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.illlI1lLIL;
        if (j >= 0 && this.il1LilLllii >= j) {
            return -1;
        }
        int read = this.i1LIL11l.read(bArr, i, (int) (j >= 0 ? Math.min((long) i2, j - this.il1LilLllii) : (long) i2));
        if (read == -1) {
            return -1;
        }
        this.il1LilLllii += (long) read;
        return read;
    }

    public ILI1Iil1li(InputStream inputStream) {
        this(inputStream, -1);
    }
}
