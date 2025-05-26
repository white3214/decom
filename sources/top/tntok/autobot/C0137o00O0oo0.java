package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: top.tntok.autobot.o00O0oo0  reason: case insensitive filesystem */
public final class C0137o00O0oo0 implements C0370o0OOOooO {
    public final ILL1iL1LiiI i1LIL11l;
    public boolean iiIliillii;
    public int il1LilLllii;
    public final Inflater illlI1lLIL;

    public C0137o00O0oo0(C0370o0OOOooO o0oooooo, Inflater inflater) {
        this(C0249o00oo00O.il1LilLllii(o0oooooo), inflater);
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        o0OOO00 iiIiili;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.iiIliillii) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean iiI1L1iI = iiI1L1iI();
                try {
                    iiIiili = iiILIlLLiIL.iiIiili(1);
                    int inflate = this.illlI1lLIL.inflate(iiIiili.iiI1L1iI, iiIiili.illlI1lLIL, (int) Math.min(j, (long) (8192 - iiIiili.illlI1lLIL)));
                    if (inflate > 0) {
                        iiIiili.illlI1lLIL += inflate;
                        long j2 = (long) inflate;
                        iiILIlLLiIL.illlI1lLIL += j2;
                        return j2;
                    } else if (this.illlI1lLIL.finished()) {
                        break;
                    } else if (this.illlI1lLIL.needsDictionary()) {
                        break;
                    } else if (iiI1L1iI) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            i1LIL11l();
            if (iiIiili.i1LIL11l != iiIiili.illlI1lLIL) {
                return -1;
            }
            iiILIlLLiIL.i1LIL11l = iiIiili.i1LIL11l();
            o0OOO00o.iiI1L1iI(iiIiili);
            return -1;
        }
    }

    public void close() throws IOException {
        if (!this.iiIliillii) {
            this.illlI1lLIL.end();
            this.iiIliillii = true;
            this.i1LIL11l.close();
        }
    }

    public final void i1LIL11l() throws IOException {
        int i = this.il1LilLllii;
        if (i != 0) {
            int remaining = i - this.illlI1lLIL.getRemaining();
            this.il1LilLllii -= remaining;
            this.i1LIL11l.skip((long) remaining);
        }
    }

    public final boolean iiI1L1iI() throws IOException {
        if (!this.illlI1lLIL.needsInput()) {
            return false;
        }
        i1LIL11l();
        if (this.illlI1lLIL.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.i1LIL11l.Il1llillili()) {
            return true;
        } else {
            o0OOO00 o0ooo00 = this.i1LIL11l.illlI1lLIL().i1LIL11l;
            int i = o0ooo00.illlI1lLIL;
            int i2 = o0ooo00.i1LIL11l;
            int i3 = i - i2;
            this.il1LilLllii = i3;
            this.illlI1lLIL.setInput(o0ooo00.iiI1L1iI, i2, i3);
            return false;
        }
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }

    public C0137o00O0oo0(ILL1iL1LiiI iLL1iL1LiiI, Inflater inflater) {
        if (iLL1iL1LiiI == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.i1LIL11l = iLL1iL1LiiI;
            this.illlI1lLIL = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }
}
