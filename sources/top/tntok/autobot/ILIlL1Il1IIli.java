package top.tntok.autobot;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class ILIlL1Il1IIli implements C0361o0OOOo0 {
    public final Iiii1LiI11i i1LIL11l;
    public boolean il1LilLllii;
    public final Deflater illlI1lLIL;

    public ILIlL1Il1IIli(C0361o0OOOo0 o0oooo0, Deflater deflater) {
        this(C0249o00oo00O.illlI1lLIL(o0oooo0), deflater);
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, j);
        while (j > 0) {
            o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
            int min = (int) Math.min(j, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
            this.illlI1lLIL.setInput(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
            iiI1L1iI(false);
            long j2 = (long) min;
            iiILIlLLiIL.illlI1lLIL -= j2;
            int i = o0ooo00.i1LIL11l + min;
            o0ooo00.i1LIL11l = i;
            if (i == o0ooo00.illlI1lLIL) {
                iiILIlLLiIL.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            }
            j -= j2;
        }
    }

    public void close() throws IOException {
        if (!this.il1LilLllii) {
            try {
                i1LIL11l();
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
            this.il1LilLllii = true;
            if (th != null) {
                C0485o0Ooooo.iilLil1i11I1(th);
            }
        }
    }

    public void flush() throws IOException {
        iiI1L1iI(true);
        this.i1LIL11l.flush();
    }

    public void i1LIL11l() throws IOException {
        this.illlI1lLIL.finish();
        iiI1L1iI(false);
    }

    @IgnoreJRERequirement
    public final void iiI1L1iI(boolean z) throws IOException {
        o0OOO00 iiIiili;
        int i;
        IiILIlLLiIL illlI1lLIL2 = this.i1LIL11l.illlI1lLIL();
        while (true) {
            iiIiili = illlI1lLIL2.iiIiili(1);
            if (z) {
                Deflater deflater = this.illlI1lLIL;
                byte[] bArr = iiIiili.iiI1L1iI;
                int i2 = iiIiili.illlI1lLIL;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.illlI1lLIL;
                byte[] bArr2 = iiIiili.iiI1L1iI;
                int i3 = iiIiili.illlI1lLIL;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                iiIiili.illlI1lLIL += i;
                illlI1lLIL2.illlI1lLIL += (long) i;
                this.i1LIL11l.IIlL1llI1();
            } else if (this.illlI1lLIL.needsInput()) {
                break;
            }
        }
        if (iiIiili.i1LIL11l == iiIiili.illlI1lLIL) {
            illlI1lLIL2.i1LIL11l = iiIiili.i1LIL11l();
            o0OOO00o.iiI1L1iI(iiIiili);
        }
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.i1LIL11l + ")";
    }

    public ILIlL1Il1IIli(Iiii1LiI11i iiii1LiI11i, Deflater deflater) {
        if (iiii1LiI11i == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.i1LIL11l = iiii1LiI11i;
            this.illlI1lLIL = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }
}
