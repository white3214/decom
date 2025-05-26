package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o0Ooo  reason: case insensitive filesystem */
public class C0462o0Ooo extends InputStream {
    public boolean i1LIL11l = false;
    public final InputStream iiIliillii;
    public final boolean iilLil1i11I1;
    public boolean il1LilLllii = false;
    public boolean illlI1lLIL = false;

    public C0462o0Ooo(InputStream inputStream, boolean z) {
        this.iiIliillii = inputStream;
        this.iilLil1i11I1 = z;
    }

    public void close() throws IOException {
        super.close();
        this.iiIliillii.close();
    }

    public final int i1LIL11l() throws IOException {
        boolean z;
        boolean z2;
        int read = this.iiIliillii.read();
        boolean z3 = false;
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.il1LilLllii = z;
        if (z) {
            return read;
        }
        if (read == 10) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.i1LIL11l = z2;
        if (read == 13) {
            z3 = true;
        }
        this.illlI1lLIL = z3;
        return read;
    }

    public final int iiI1L1iI(boolean z) {
        if (z || !this.iilLil1i11I1 || this.i1LIL11l) {
            return -1;
        }
        this.i1LIL11l = true;
        return 10;
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("Mark notsupported");
    }

    public int read() throws IOException {
        boolean z = this.illlI1lLIL;
        if (this.il1LilLllii) {
            return iiI1L1iI(z);
        }
        int i1LIL11l2 = i1LIL11l();
        if (this.il1LilLllii) {
            return iiI1L1iI(z);
        }
        if (this.illlI1lLIL) {
            return 10;
        }
        if (!z || !this.i1LIL11l) {
            return i1LIL11l2;
        }
        return read();
    }
}
