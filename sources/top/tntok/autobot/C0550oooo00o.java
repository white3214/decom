package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0337o0O0oooO;

/* renamed from: top.tntok.autobot.oooo00o  reason: case insensitive filesystem */
public final class C0550oooo00o implements C0046Ooooo0o {
    public static final int I1iIiIi = 4;
    public static final int IL1lILLLL1L = 6;
    public static final int IiIIlIL = 0;
    public static final int IiiL1llIIi = 2;
    public static final int i1L1lLllLLlIi = 5;
    public static final int iILiI1lll = 3;
    public static final int iL1LIlIlI = 262144;
    public static final int iilLiIIIi11i = 1;
    public long I11lLL1 = 262144;
    public final C0240o00oOoOO i1LIL11l;
    public C0094o000o000 iLLLILIiLi1Ii;
    public final Iiii1LiI11i iiIliillii;
    public int iilLil1i11I1 = 0;
    public final ILL1iL1LiiI il1LilLllii;
    public final C0315o0O0o0oO illlI1lLIL;

    /* renamed from: top.tntok.autobot.oooo00o$I11lLL1 */
    public class I11lLL1 extends i1LIL11l {
        public boolean iiIliillii;

        public I11lLL1() {
            super();
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.illlI1lLIL) {
                throw new IllegalStateException("closed");
            } else if (this.iiIliillii) {
                return -1;
            } else {
                long IIlllIIi1ii = super.IIlllIIi1ii(iiILIlLLiIL, j);
                if (IIlllIIi1ii != -1) {
                    return IIlllIIi1ii;
                }
                this.iiIliillii = true;
                iiI1L1iI();
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.illlI1lLIL) {
                if (!this.iiIliillii) {
                    iiI1L1iI();
                }
                this.illlI1lLIL = true;
            }
        }
    }

    /* renamed from: top.tntok.autobot.oooo00o$i1LIL11l */
    public abstract class i1LIL11l implements C0370o0OOOooO {
        public final C0079o000O0oo i1LIL11l;
        public boolean illlI1lLIL;

        public i1LIL11l() {
            this.i1LIL11l = new C0079o000O0oo(C0550oooo00o.this.il1LilLllii.timeout());
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            try {
                return C0550oooo00o.this.il1LilLllii.IIlllIIi1ii(iiILIlLLiIL, j);
            } catch (IOException e) {
                C0550oooo00o.this.illlI1lLIL.I1l1iIll1lIi1();
                iiI1L1iI();
                throw e;
            }
        }

        public final void iiI1L1iI() {
            if (C0550oooo00o.this.iilLil1i11I1 != 6) {
                if (C0550oooo00o.this.iilLil1i11I1 == 5) {
                    C0550oooo00o.this.iiLIIiIli(this.i1LIL11l);
                    int unused = C0550oooo00o.this.iilLil1i11I1 = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C0550oooo00o.this.iilLil1i11I1);
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    /* renamed from: top.tntok.autobot.oooo00o$iiIliillii */
    public class iiIliillii extends i1LIL11l {
        public long iiIliillii;

        public iiIliillii(long j) {
            super();
            this.iiIliillii = j;
            if (j == 0) {
                iiI1L1iI();
            }
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.illlI1lLIL) {
                long j2 = this.iiIliillii;
                if (j2 == 0) {
                    return -1;
                }
                long IIlllIIi1ii = super.IIlllIIi1ii(iiILIlLLiIL, Math.min(j2, j));
                if (IIlllIIi1ii != -1) {
                    long j3 = this.iiIliillii - IIlllIIi1ii;
                    this.iiIliillii = j3;
                    if (j3 == 0) {
                        iiI1L1iI();
                    }
                    return IIlllIIi1ii;
                }
                C0550oooo00o.this.illlI1lLIL.I1l1iIll1lIi1();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                iiI1L1iI();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.illlI1lLIL) {
                if (this.iiIliillii != 0 && !C0487o0OooooO.i111iLiiIIill(this, 100, TimeUnit.MILLISECONDS)) {
                    C0550oooo00o.this.illlI1lLIL.I1l1iIll1lIi1();
                    iiI1L1iI();
                }
                this.illlI1lLIL = true;
            }
        }
    }

    /* renamed from: top.tntok.autobot.oooo00o$iilLil1i11I1 */
    public final class iilLil1i11I1 implements C0361o0OOOo0 {
        public final C0079o000O0oo i1LIL11l;
        public boolean illlI1lLIL;

        public iilLil1i11I1() {
            this.i1LIL11l = new C0079o000O0oo(C0550oooo00o.this.iiIliillii.timeout());
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (!this.illlI1lLIL) {
                C0487o0OooooO.iilLil1i11I1(iiILIlLLiIL.iLLi1LIi(), 0, j);
                C0550oooo00o.this.iiIliillii.I1iIiIi(iiILIlLLiIL, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.illlI1lLIL) {
                this.illlI1lLIL = true;
                C0550oooo00o.this.iiLIIiIli(this.i1LIL11l);
                int unused = C0550oooo00o.this.iilLil1i11I1 = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.illlI1lLIL) {
                C0550oooo00o.this.iiIliillii.flush();
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    /* renamed from: top.tntok.autobot.oooo00o$il1LilLllii */
    public class il1LilLllii extends i1LIL11l {
        public static final long IiIIlIL = -1;
        public boolean I11lLL1 = true;
        public final C0109o000oo00 iiIliillii;
        public long iilLil1i11I1 = -1;

        public il1LilLllii(C0109o000oo00 o000oo00) {
            super();
            this.iiIliillii = o000oo00;
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.illlI1lLIL) {
                throw new IllegalStateException("closed");
            } else if (!this.I11lLL1) {
                return -1;
            } else {
                long j2 = this.iilLil1i11I1;
                if (j2 == 0 || j2 == -1) {
                    i1LIL11l();
                    if (!this.I11lLL1) {
                        return -1;
                    }
                }
                long IIlllIIi1ii = super.IIlllIIi1ii(iiILIlLLiIL, Math.min(j, this.iilLil1i11I1));
                if (IIlllIIi1ii != -1) {
                    this.iilLil1i11I1 -= IIlllIIi1ii;
                    return IIlllIIi1ii;
                }
                C0550oooo00o.this.illlI1lLIL.I1l1iIll1lIi1();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                iiI1L1iI();
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.illlI1lLIL) {
                if (this.I11lLL1 && !C0487o0OooooO.i111iLiiIIill(this, 100, TimeUnit.MILLISECONDS)) {
                    C0550oooo00o.this.illlI1lLIL.I1l1iIll1lIi1();
                    iiI1L1iI();
                }
                this.illlI1lLIL = true;
            }
        }

        public final void i1LIL11l() throws IOException {
            if (this.iilLil1i11I1 != -1) {
                C0550oooo00o.this.il1LilLllii.i1iI1iiLL1();
            }
            try {
                this.iilLil1i11I1 = C0550oooo00o.this.il1LilLllii.I1i1iiiI();
                String trim = C0550oooo00o.this.il1LilLllii.i1iI1iiLL1().trim();
                if (this.iilLil1i11I1 < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.iilLil1i11I1 + trim + "\"");
                } else if (this.iilLil1i11I1 == 0) {
                    this.I11lLL1 = false;
                    C0550oooo00o oooo00o = C0550oooo00o.this;
                    C0094o000o000 unused = oooo00o.iLLLILIiLi1Ii = oooo00o.IIlL1llI1();
                    C0104o000o0oo.IiiL1llIIi(C0550oooo00o.this.i1LIL11l.I1iIiIi(), this.iiIliillii, C0550oooo00o.this.iLLLILIiLi1Ii);
                    iiI1L1iI();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
    }

    /* renamed from: top.tntok.autobot.oooo00o$illlI1lLIL */
    public final class illlI1lLIL implements C0361o0OOOo0 {
        public final C0079o000O0oo i1LIL11l;
        public boolean illlI1lLIL;

        public illlI1lLIL() {
            this.i1LIL11l = new C0079o000O0oo(C0550oooo00o.this.iiIliillii.timeout());
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (this.illlI1lLIL) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C0550oooo00o.this.iiIliillii.IL111l1(j);
                C0550oooo00o.this.iiIliillii.illiiliIILI(C0130o00O0o00.IiIIlIL);
                C0550oooo00o.this.iiIliillii.I1iIiIi(iiILIlLLiIL, j);
                C0550oooo00o.this.iiIliillii.illiiliIILI(C0130o00O0o00.IiIIlIL);
            }
        }

        public synchronized void close() throws IOException {
            if (!this.illlI1lLIL) {
                this.illlI1lLIL = true;
                C0550oooo00o.this.iiIliillii.illiiliIILI("0\r\n\r\n");
                C0550oooo00o.this.iiLIIiIli(this.i1LIL11l);
                int unused = C0550oooo00o.this.iilLil1i11I1 = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.illlI1lLIL) {
                C0550oooo00o.this.iiIliillii.flush();
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    public C0550oooo00o(C0240o00oOoOO o00ooooo, C0315o0O0o0oO o0o0o0oo, ILL1iL1LiiI iLL1iL1LiiI, Iiii1LiI11i iiii1LiI11i) {
        this.i1LIL11l = o00ooooo;
        this.illlI1lLIL = o0o0o0oo;
        this.il1LilLllii = iLL1iL1LiiI;
        this.iiIliillii = iiii1LiI11i;
    }

    public void I11lLL1(C0333o0O0ooO0 o0o0ooo0) throws IOException {
        il1l1IlL(o0o0ooo0.iiIliillii(), C0335o0O0ooo.iiI1L1iI(o0o0ooo0, this.illlI1lLIL.i1LIL11l().i1LIL11l().type()));
    }

    public final C0370o0OOOooO I1I11Il1() {
        if (this.iilLil1i11I1 == 4) {
            this.iilLil1i11I1 = 5;
            this.illlI1lLIL.I1l1iIll1lIi1();
            return new I11lLL1();
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public final C0094o000o000 IIlL1llI1() throws IOException {
        C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
        while (true) {
            String i1iI1iiLL1 = i1iI1iiLL1();
            if (i1iI1iiLL1.length() == 0) {
                return iii1l1ii.IiIIlIL();
            }
            C0139o00OO00o.iiI1L1iI.iiI1L1iI(iii1l1ii, i1iI1iiLL1);
        }
    }

    public void IL111l1(C0337o0O0oooO o0o0oooo) throws IOException {
        long i1LIL11l2 = C0104o000o0oo.i1LIL11l(o0o0oooo);
        if (i1LIL11l2 != -1) {
            C0370o0OOOooO iiiiI1iILL11I = iiiiI1iILL11I(i1LIL11l2);
            C0487o0OooooO.IilliIIIlI1ll(iiiiI1iILL11I, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            iiiiI1iILL11I.close();
        }
    }

    public boolean ILl1iII11Ll1() {
        if (this.iilLil1i11I1 == 6) {
            return true;
        }
        return false;
    }

    public C0094o000o000 IiIIlIL() {
        if (this.iilLil1i11I1 == 6) {
            C0094o000o000 o000o000 = this.iLLLILIiLi1Ii;
            if (o000o000 != null) {
                return o000o000;
            }
            return C0487o0OooooO.illlI1lLIL;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public C0337o0O0oooO.iiI1L1iI IiiL1llIIi(boolean z) throws IOException {
        String str;
        int i = this.iilLil1i11I1;
        if (i == 1 || i == 3) {
            try {
                C0375o0OOo0O i1LIL11l2 = C0375o0OOo0O.i1LIL11l(i1iI1iiLL1());
                C0337o0O0oooO.iiI1L1iI iilLiIIIi11i2 = new C0337o0O0oooO.iiI1L1iI().IL1lILLLL1L(i1LIL11l2.iiI1L1iI).I11lLL1(i1LIL11l2.i1LIL11l).iILiI1lll(i1LIL11l2.illlI1lLIL).iilLiIIIi11i(IIlL1llI1());
                if (z && i1LIL11l2.i1LIL11l == 100) {
                    return null;
                }
                if (i1LIL11l2.i1LIL11l == 100) {
                    this.iilLil1i11I1 = 3;
                    return iilLiIIIi11i2;
                }
                this.iilLil1i11I1 = 4;
                return iilLiIIIi11i2;
            } catch (EOFException e) {
                C0315o0O0o0oO o0o0o0oo = this.illlI1lLIL;
                if (o0o0o0oo != null) {
                    str = o0o0o0oo.i1LIL11l().iiI1L1iI().iILiI1lll().ILllI11();
                } else {
                    str = "unknown";
                }
                throw new IOException("unexpected end of stream on " + str, e);
            }
        } else {
            throw new IllegalStateException("state: " + this.iilLil1i11I1);
        }
    }

    public final C0361o0OOOo0 IliiLiLliIl() {
        if (this.iilLil1i11I1 == 1) {
            this.iilLil1i11I1 = 2;
            return new iilLil1i11I1();
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public final C0370o0OOOooO i11liIIl11Ii1(C0109o000oo00 o000oo00) {
        if (this.iilLil1i11I1 == 4) {
            this.iilLil1i11I1 = 5;
            return new il1LilLllii(o000oo00);
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public void i1LIL11l() {
        C0315o0O0o0oO o0o0o0oo = this.illlI1lLIL;
        if (o0o0o0oo != null) {
            o0o0o0oo.I11lLL1();
        }
    }

    public final String i1iI1iiLL1() throws IOException {
        String IiiIlLl1il1i = this.il1LilLllii.IiiIlLl1il1i(this.I11lLL1);
        this.I11lLL1 -= (long) IiiIlLl1il1i.length();
        return IiiIlLl1il1i;
    }

    public final C0361o0OOOo0 i1iiLIil1ILi() {
        if (this.iilLil1i11I1 == 1) {
            this.iilLil1i11I1 = 2;
            return new illlI1lLIL();
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public C0370o0OOOooO iLLLILIiLi1Ii(C0337o0O0oooO o0o0oooo) {
        if (!C0104o000o0oo.illlI1lLIL(o0o0oooo)) {
            return iiiiI1iILL11I(0);
        }
        if ("chunked".equalsIgnoreCase(o0o0oooo.ilLIlL1ILi("Transfer-Encoding"))) {
            return i11liIIl11Ii1(o0o0oooo.i11iLLllliI().IiiL1llIIi());
        }
        long i1LIL11l2 = C0104o000o0oo.i1LIL11l(o0o0oooo);
        if (i1LIL11l2 != -1) {
            return iiiiI1iILL11I(i1LIL11l2);
        }
        return I1I11Il1();
    }

    public void iiIliillii() throws IOException {
        this.iiIliillii.flush();
    }

    public final void iiLIIiIli(C0079o000O0oo o000o0oo) {
        C0446o0OoOOOo iILiI1lll2 = o000o0oo.iILiI1lll();
        o000o0oo.I1iIiIi(C0446o0OoOOOo.il1LilLllii);
        iILiI1lll2.iiI1L1iI();
        iILiI1lll2.i1LIL11l();
    }

    public final C0370o0OOOooO iiiiI1iILL11I(long j) {
        if (this.iilLil1i11I1 == 4) {
            this.iilLil1i11I1 = 5;
            return new iiIliillii(j);
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public long iilLiIIIi11i(C0337o0O0oooO o0o0oooo) {
        if (!C0104o000o0oo.illlI1lLIL(o0o0oooo)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(o0o0oooo.ilLIlL1ILi("Transfer-Encoding"))) {
            return -1;
        }
        return C0104o000o0oo.i1LIL11l(o0o0oooo);
    }

    public void iilLil1i11I1() throws IOException {
        this.iiIliillii.flush();
    }

    public C0361o0OOOo0 il1LilLllii(C0333o0O0ooO0 o0o0ooo0, long j) throws IOException {
        if (o0o0ooo0.iiI1L1iI() != null && o0o0ooo0.iiI1L1iI().iLLLILIiLi1Ii()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(o0o0ooo0.illlI1lLIL("Transfer-Encoding"))) {
            return i1iiLIil1ILi();
        } else {
            if (j != -1) {
                return IliiLiLliIl();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void il1l1IlL(C0094o000o000 o000o000, String str) throws IOException {
        if (this.iilLil1i11I1 == 0) {
            this.iiIliillii.illiiliIILI(str).illiiliIILI(C0130o00O0o00.IiIIlIL);
            int I1iIiIi2 = o000o000.I1iIiIi();
            for (int i = 0; i < I1iIiIi2; i++) {
                this.iiIliillii.illiiliIILI(o000o000.iLLLILIiLi1Ii(i)).illiiliIILI(": ").illiiliIILI(o000o000.IL1lILLLL1L(i)).illiiliIILI(C0130o00O0o00.IiIIlIL);
            }
            this.iiIliillii.illiiliIILI(C0130o00O0o00.IiIIlIL);
            this.iilLil1i11I1 = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.iilLil1i11I1);
    }

    public C0315o0O0o0oO illlI1lLIL() {
        return this.illlI1lLIL;
    }
}
