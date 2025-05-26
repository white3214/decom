package top.tntok.autobot;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o00Oo0o  reason: case insensitive filesystem */
public abstract class C0157o00Oo0o extends FilterInputStream implements IlI1Ill1lIL1 {
    public final long i1LIL11l;
    public boolean il1LilLllii;
    public long illlI1lLIL;

    public C0157o00Oo0o(InputStream inputStream, long j) {
        super(inputStream);
        this.i1LIL11l = j;
    }

    public void close() throws IOException {
        this.il1LilLllii = true;
        super.close();
    }

    public final void i1LIL11l() throws IOException {
        long j = this.illlI1lLIL;
        long j2 = this.i1LIL11l;
        if (j > j2) {
            il1LilLllii(j2, j);
        }
    }

    public boolean iiI1L1iI() throws IOException {
        return this.il1LilLllii;
    }

    public abstract void il1LilLllii(long j, long j2) throws IOException;

    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.illlI1lLIL++;
            i1LIL11l();
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.illlI1lLIL += (long) read;
            i1LIL11l();
        }
        return read;
    }
}
