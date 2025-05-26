package top.tntok.autobot;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class o000OOoO implements C0361o0OOOo0 {
    public final Iiii1LiI11i i1LIL11l;
    public boolean iiIliillii;
    public final CRC32 iilLil1i11I1 = new CRC32();
    public final ILIlL1Il1IIli il1LilLllii;
    public final Deflater illlI1lLIL;

    public o000OOoO(C0361o0OOOo0 o0oooo0) {
        if (o0oooo0 != null) {
            Deflater deflater = new Deflater(-1, true);
            this.illlI1lLIL = deflater;
            Iiii1LiI11i illlI1lLIL2 = C0249o00oo00O.illlI1lLIL(o0oooo0);
            this.i1LIL11l = illlI1lLIL2;
            this.il1LilLllii = new ILIlL1Il1IIli(illlI1lLIL2, deflater);
            i111iLiiIIill();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i != 0) {
            i1LIL11l(iiILIlLLiIL, j);
            this.il1LilLllii.I1iIiIi(iiILIlLLiIL, j);
        }
    }

    public void close() throws IOException {
        if (!this.iiIliillii) {
            try {
                this.il1LilLllii.i1LIL11l();
                il1LilLllii();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.illlI1lLIL.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.i1LIL11l.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.iiIliillii = true;
            if (th != null) {
                C0485o0Ooooo.iilLil1i11I1(th);
            }
        }
    }

    public void flush() throws IOException {
        this.il1LilLllii.flush();
    }

    public final void i111iLiiIIill() {
        IiILIlLLiIL illlI1lLIL2 = this.i1LIL11l.illlI1lLIL();
        illlI1lLIL2.IiiIIil1l(8075);
        illlI1lLIL2.IillLillLLIii(8);
        illlI1lLIL2.IillLillLLIii(0);
        illlI1lLIL2.iilLil1i11I1(0);
        illlI1lLIL2.IillLillLLIii(0);
        illlI1lLIL2.IillLillLLIii(0);
    }

    public final void i1LIL11l(IiILIlLLiIL iiILIlLLiIL, long j) {
        o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
            this.iilLil1i11I1.update(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
            j -= (long) min;
            o0ooo00 = o0ooo00.iilLil1i11I1;
        }
    }

    public final Deflater iiI1L1iI() {
        return this.illlI1lLIL;
    }

    public final void il1LilLllii() throws IOException {
        this.i1LIL11l.i1LiiIlIL1I((int) this.iilLil1i11I1.getValue());
        this.i1LIL11l.i1LiiIlIL1I((int) this.illlI1lLIL.getBytesRead());
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }
}
