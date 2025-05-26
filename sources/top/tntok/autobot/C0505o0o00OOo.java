package top.tntok.autobot;

import java.io.IOException;
import java.util.Random;
import top.tntok.autobot.IiILIlLLiIL;

/* renamed from: top.tntok.autobot.o0o00OOo  reason: case insensitive filesystem */
public final class C0505o0o00OOo {
    public final iiI1L1iI I11lLL1 = new iiI1L1iI();
    public final byte[] IiIIlIL;
    public final Random i1LIL11l;
    public boolean iLLLILIiLi1Ii;
    public final boolean iiI1L1iI;
    public boolean iiIliillii;
    public final IiILIlLLiIL.illlI1lLIL iilLiIIIi11i;
    public final IiILIlLLiIL iilLil1i11I1 = new IiILIlLLiIL();
    public final IiILIlLLiIL il1LilLllii;
    public final Iiii1LiI11i illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0o00OOo$iiI1L1iI */
    public final class iiI1L1iI implements C0361o0OOOo0 {
        public int i1LIL11l;
        public boolean iiIliillii;
        public boolean il1LilLllii;
        public long illlI1lLIL;

        public iiI1L1iI() {
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            boolean z;
            if (!this.iiIliillii) {
                C0505o0o00OOo.this.iilLil1i11I1.I1iIiIi(iiILIlLLiIL, j);
                if (!this.il1LilLllii || this.illlI1lLIL == -1 || C0505o0o00OOo.this.iilLil1i11I1.iLLi1LIi() <= this.illlI1lLIL - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long I1lLLLlliILlI = C0505o0o00OOo.this.iilLil1i11I1.I1lLLLlliILlI();
                if (I1lLLLlliILlI > 0 && !z) {
                    C0505o0o00OOo.this.il1LilLllii(this.i1LIL11l, I1lLLLlliILlI, this.il1LilLllii, false);
                    this.il1LilLllii = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            if (!this.iiIliillii) {
                C0505o0o00OOo o0o00ooo = C0505o0o00OOo.this;
                o0o00ooo.il1LilLllii(this.i1LIL11l, o0o00ooo.iilLil1i11I1.iLLi1LIi(), this.il1LilLllii, true);
                this.iiIliillii = true;
                C0505o0o00OOo.this.iLLLILIiLi1Ii = false;
                return;
            }
            throw new IOException("closed");
        }

        public void flush() throws IOException {
            if (!this.iiIliillii) {
                C0505o0o00OOo o0o00ooo = C0505o0o00OOo.this;
                o0o00ooo.il1LilLllii(this.i1LIL11l, o0o00ooo.iilLil1i11I1.iLLi1LIi(), this.il1LilLllii, false);
                this.il1LilLllii = false;
                return;
            }
            throw new IOException("closed");
        }

        public C0446o0OoOOOo timeout() {
            return C0505o0o00OOo.this.illlI1lLIL.timeout();
        }
    }

    public C0505o0o00OOo(boolean z, Iiii1LiI11i iiii1LiI11i, Random random) {
        byte[] bArr;
        if (iiii1LiI11i == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.iiI1L1iI = z;
            this.illlI1lLIL = iiii1LiI11i;
            this.il1LilLllii = iiii1LiI11i.illlI1lLIL();
            this.i1LIL11l = random;
            IiILIlLLiIL.illlI1lLIL illli1llil = null;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.IiIIlIL = bArr;
            this.iilLiIIIi11i = z ? new IiILIlLLiIL.illlI1lLIL() : illli1llil;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    public void i1LIL11l(int i, ili11iILI1l ili11iili1l) throws IOException {
        ili11iILI1l ili11iili1l2 = ili11iILI1l.iiIliillii;
        if (!(i == 0 && ili11iili1l == null)) {
            if (i != 0) {
                C0503o0o00OO0.il1LilLllii(i);
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            iiILIlLLiIL.IiiIIil1l(i);
            if (ili11iili1l != null) {
                iiILIlLLiIL.ILiLII1ILi(ili11iili1l);
            }
            ili11iili1l2 = iiILIlLLiIL.IL1IiilLlLI();
        }
        try {
            illlI1lLIL(8, ili11iili1l2);
        } finally {
            this.iiIliillii = true;
        }
    }

    public C0361o0OOOo0 iiI1L1iI(int i, long j) {
        if (!this.iLLLILIiLi1Ii) {
            this.iLLLILIiLi1Ii = true;
            iiI1L1iI iii1l1ii = this.I11lLL1;
            iii1l1ii.i1LIL11l = i;
            iii1l1ii.illlI1lLIL = j;
            iii1l1ii.il1LilLllii = true;
            iii1l1ii.iiIliillii = false;
            return iii1l1ii;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public void iiIliillii(ili11iILI1l ili11iili1l) throws IOException {
        illlI1lLIL(9, ili11iili1l);
    }

    public void iilLil1i11I1(ili11iILI1l ili11iili1l) throws IOException {
        illlI1lLIL(10, ili11iili1l);
    }

    public void il1LilLllii(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.iiIliillii) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.il1LilLllii.IillLillLLIii(i);
            if (this.iiI1L1iI) {
                i2 = 128;
            }
            if (j <= 125) {
                this.il1LilLllii.IillLillLLIii(((int) j) | i2);
            } else if (j <= C0503o0o00OO0.IilL11ii1I1Il) {
                this.il1LilLllii.IillLillLLIii(i2 | C0503o0o00OO0.Ii1liIIIiLi);
                this.il1LilLllii.IiiIIil1l((int) j);
            } else {
                this.il1LilLllii.IillLillLLIii(i2 | 127);
                this.il1LilLllii.IilliIIIlI1ll(j);
            }
            if (this.iiI1L1iI) {
                this.i1LIL11l.nextBytes(this.IiIIlIL);
                this.il1LilLllii.iiIliillii(this.IiIIlIL);
                if (j > 0) {
                    long iLLi1LIi = this.il1LilLllii.iLLi1LIi();
                    this.il1LilLllii.I1iIiIi(this.iilLil1i11I1, j);
                    this.il1LilLllii.iLlI1iL1lIIL(this.iilLiIIIi11i);
                    this.iilLiIIIi11i.i111iLiiIIill(iLLi1LIi);
                    C0503o0o00OO0.illlI1lLIL(this.iilLiIIIi11i, this.IiIIlIL);
                    this.iilLiIIIi11i.close();
                }
            } else {
                this.il1LilLllii.I1iIiIi(this.iilLil1i11I1, j);
            }
            this.illlI1lLIL.I1LiliILi1lI1();
            return;
        }
        throw new IOException("closed");
    }

    public final void illlI1lLIL(int i, ili11iILI1l ili11iili1l) throws IOException {
        if (!this.iiIliillii) {
            int illiiliIILI = ili11iili1l.illiiliIILI();
            if (((long) illiiliIILI) <= 125) {
                this.il1LilLllii.IillLillLLIii(i | 128);
                if (this.iiI1L1iI) {
                    this.il1LilLllii.IillLillLLIii(illiiliIILI | 128);
                    this.i1LIL11l.nextBytes(this.IiIIlIL);
                    this.il1LilLllii.iiIliillii(this.IiIIlIL);
                    if (illiiliIILI > 0) {
                        long iLLi1LIi = this.il1LilLllii.iLLi1LIi();
                        this.il1LilLllii.ILiLII1ILi(ili11iili1l);
                        this.il1LilLllii.iLlI1iL1lIIL(this.iilLiIIIi11i);
                        this.iilLiIIIi11i.i111iLiiIIill(iLLi1LIi);
                        C0503o0o00OO0.illlI1lLIL(this.iilLiIIIi11i, this.IiIIlIL);
                        this.iilLiIIIi11i.close();
                    }
                } else {
                    this.il1LilLllii.IillLillLLIii(illiiliIILI);
                    this.il1LilLllii.ILiLII1ILi(ili11iili1l);
                }
                this.illlI1lLIL.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }
}
