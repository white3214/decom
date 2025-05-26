package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.o0OoOO00  reason: case insensitive filesystem */
public abstract class C0441o0OoOO00 extends OutputStream {
    public final int i1LIL11l;
    public boolean il1LilLllii;
    public long illlI1lLIL;

    public C0441o0OoOO00(int i) {
        this.i1LIL11l = i;
    }

    public void I1LiILiLLIl1l() {
        this.il1LilLllii = false;
        this.illlI1lLIL = 0;
    }

    public abstract void IIL1Ll1I111() throws IOException;

    public boolean IiIl11II() {
        if (this.illlI1lLIL > ((long) this.i1LIL11l)) {
            return true;
        }
        return false;
    }

    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        il1LilLllii().close();
    }

    public void flush() throws IOException {
        il1LilLllii().flush();
    }

    public int i111iLiiIIill() {
        return this.i1LIL11l;
    }

    public long i1LIL11l() {
        return this.illlI1lLIL;
    }

    public void iiI1L1iI(int i) throws IOException {
        if (!this.il1LilLllii && this.illlI1lLIL + ((long) i) > ((long) this.i1LIL11l)) {
            this.il1LilLllii = true;
            IIL1Ll1I111();
        }
    }

    public abstract OutputStream il1LilLllii() throws IOException;

    public void ilLIlL1ILi(long j) {
        this.illlI1lLIL = j;
    }

    public void write(int i) throws IOException {
        iiI1L1iI(1);
        il1LilLllii().write(i);
        this.illlI1lLIL++;
    }

    public void write(byte[] bArr) throws IOException {
        iiI1L1iI(bArr.length);
        il1LilLllii().write(bArr);
        this.illlI1lLIL += (long) bArr.length;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        iiI1L1iI(i2);
        il1LilLllii().write(bArr, i, i2);
        this.illlI1lLIL += (long) i2;
    }
}
