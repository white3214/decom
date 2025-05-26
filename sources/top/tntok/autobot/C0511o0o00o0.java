package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o0o00o0  reason: case insensitive filesystem */
public class C0511o0o00o0 extends InputStream {
    public final boolean I11lLL1;
    public boolean i1LIL11l = false;
    public boolean iiIliillii = false;
    public final InputStream iilLil1i11I1;
    public boolean il1LilLllii = false;
    public boolean illlI1lLIL = false;

    public C0511o0o00o0(InputStream inputStream, boolean z) {
        this.iilLil1i11I1 = inputStream;
        this.I11lLL1 = z;
    }

    public void close() throws IOException {
        super.close();
        this.iilLil1i11I1.close();
    }

    public final int i1LIL11l() throws IOException {
        boolean z;
        boolean z2;
        int read = this.iilLil1i11I1.read();
        boolean z3 = false;
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.iiIliillii = z;
        if (z) {
            return read;
        }
        if (read == 13) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.i1LIL11l = z2;
        if (read == 10) {
            z3 = true;
        }
        this.illlI1lLIL = z3;
        return read;
    }

    public final int iiI1L1iI() {
        if (!this.I11lLL1) {
            return -1;
        }
        boolean z = this.illlI1lLIL;
        if (!z && !this.i1LIL11l) {
            this.i1LIL11l = true;
            return 13;
        } else if (z) {
            return -1;
        } else {
            this.i1LIL11l = false;
            this.illlI1lLIL = true;
            return 10;
        }
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("Mark not supported");
    }

    public int read() throws IOException {
        if (this.iiIliillii) {
            return iiI1L1iI();
        }
        if (this.il1LilLllii) {
            this.il1LilLllii = false;
            return 10;
        }
        boolean z = this.i1LIL11l;
        int i1LIL11l2 = i1LIL11l();
        if (this.iiIliillii) {
            return iiI1L1iI();
        }
        if (i1LIL11l2 != 10 || z) {
            return i1LIL11l2;
        }
        this.il1LilLllii = true;
        return 13;
    }
}
