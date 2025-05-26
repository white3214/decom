package top.tntok.autobot;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import javax.annotation.Nullable;
import top.tntok.autobot.C0317o0O0oO;
import top.tntok.autobot.C0337o0O0oooO;

/* renamed from: top.tntok.autobot.Ooooo00  reason: case insensitive filesystem */
public final class C0045Ooooo00 {
    public final iiIIl1I i1LIL11l;
    public final C0452o0OoOo00 iiI1L1iI;
    public final C0046Ooooo0o iiIliillii;
    public boolean iilLil1i11I1;
    public final C0047OooooO0 il1LilLllii;
    public final C0042OoooOo0 illlI1lLIL;

    /* renamed from: top.tntok.autobot.Ooooo00$i1LIL11l */
    public final class i1LIL11l extends C0078o000O0oO {
        public boolean iiIliillii;
        public boolean iilLil1i11I1;
        public long il1LilLllii;
        public final long illlI1lLIL;

        public i1LIL11l(C0370o0OOOooO o0oooooo, long j) {
            super(o0oooooo);
            this.illlI1lLIL = j;
            if (j == 0) {
                i1LIL11l((IOException) null);
            }
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (!this.iilLil1i11I1) {
                try {
                    long IIlllIIi1ii = iiI1L1iI().IIlllIIi1ii(iiILIlLLiIL, j);
                    if (IIlllIIi1ii == -1) {
                        i1LIL11l((IOException) null);
                        return -1;
                    }
                    long j2 = this.il1LilLllii + IIlllIIi1ii;
                    long j3 = this.illlI1lLIL;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.illlI1lLIL + " bytes but received " + j2);
                        }
                    }
                    this.il1LilLllii = j2;
                    if (j2 == j3) {
                        i1LIL11l((IOException) null);
                    }
                    return IIlllIIi1ii;
                } catch (IOException e) {
                    throw i1LIL11l(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.iilLil1i11I1) {
                this.iilLil1i11I1 = true;
                try {
                    super.close();
                    i1LIL11l((IOException) null);
                } catch (IOException e) {
                    throw i1LIL11l(e);
                }
            }
        }

        @Nullable
        public IOException i1LIL11l(@Nullable IOException iOException) {
            if (this.iiIliillii) {
                return iOException;
            }
            this.iiIliillii = true;
            return C0045Ooooo00.this.iiI1L1iI(this.il1LilLllii, true, false, iOException);
        }
    }

    /* renamed from: top.tntok.autobot.Ooooo00$iiI1L1iI */
    public final class iiI1L1iI extends C0077o000O0o0 {
        public long iiIliillii;
        public boolean iilLil1i11I1;
        public long il1LilLllii;
        public boolean illlI1lLIL;

        public iiI1L1iI(C0361o0OOOo0 o0oooo0, long j) {
            super(o0oooo0);
            this.il1LilLllii = j;
        }

        @Nullable
        private IOException i1LIL11l(@Nullable IOException iOException) {
            if (this.illlI1lLIL) {
                return iOException;
            }
            this.illlI1lLIL = true;
            return C0045Ooooo00.this.iiI1L1iI(this.iiIliillii, false, true, iOException);
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            if (!this.iilLil1i11I1) {
                long j2 = this.il1LilLllii;
                if (j2 == -1 || this.iiIliillii + j <= j2) {
                    try {
                        super.I1iIiIi(iiILIlLLiIL, j);
                        this.iiIliillii += j;
                    } catch (IOException e) {
                        throw i1LIL11l(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.il1LilLllii + " bytes but received " + (this.iiIliillii + j));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.iilLil1i11I1) {
                this.iilLil1i11I1 = true;
                long j = this.il1LilLllii;
                if (j == -1 || this.iiIliillii == j) {
                    try {
                        super.close();
                        i1LIL11l((IOException) null);
                    } catch (IOException e) {
                        throw i1LIL11l(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw i1LIL11l(e);
            }
        }
    }

    public C0045Ooooo00(C0452o0OoOo00 o0oooo00, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0, C0047OooooO0 oooooO0, C0046Ooooo0o ooooo0o) {
        this.iiI1L1iI = o0oooo00;
        this.i1LIL11l = iiiil1i;
        this.illlI1lLIL = ooooOo0;
        this.il1LilLllii = oooooO0;
        this.iiIliillii = ooooo0o;
    }

    public void I11lLL1() throws IOException {
        try {
            this.iiIliillii.iilLil1i11I1();
        } catch (IOException e) {
            this.illlI1lLIL.iL1LIlIlI(this.i1LIL11l, e);
            i111iLiiIIill(e);
            throw e;
        }
    }

    @Nullable
    public C0337o0O0oooO.iiI1L1iI I1iIiIi(boolean z) throws IOException {
        try {
            C0337o0O0oooO.iiI1L1iI IiiL1llIIi = this.iiIliillii.IiiL1llIIi(z);
            if (IiiL1llIIi != null) {
                C0139o00OO00o.iiI1L1iI.I11lLL1(IiiL1llIIi, this);
            }
            return IiiL1llIIi;
        } catch (IOException e) {
            this.illlI1lLIL.iiLIIiIli(this.i1LIL11l, e);
            i111iLiiIIill(e);
            throw e;
        }
    }

    public void I1l1iIll1lIi1(C0333o0O0ooO0 o0o0ooo0) throws IOException {
        try {
            this.illlI1lLIL.Ii1liIIIiLi(this.i1LIL11l);
            this.iiIliillii.I11lLL1(o0o0ooo0);
            this.illlI1lLIL.i111iLiiIIill(this.i1LIL11l, o0o0ooo0);
        } catch (IOException e) {
            this.illlI1lLIL.iL1LIlIlI(this.i1LIL11l, e);
            i111iLiiIIill(e);
            throw e;
        }
    }

    public void IL1lILLLL1L() {
        this.illlI1lLIL.i1iiLIil1ILi(this.i1LIL11l);
    }

    public C0094o000o000 Ii1liIIIiLi() throws IOException {
        return this.iiIliillii.IiIIlIL();
    }

    public C0317o0O0oO.iilLil1i11I1 IiIIlIL() throws SocketException {
        this.iiI1L1iI.iL1LIlIlI();
        return this.iiIliillii.illlI1lLIL().IilL11ii1I1Il(this);
    }

    public void IiiL1llIIi() {
        this.iiI1L1iI.I11lLL1(this, true, false, (IOException) null);
    }

    public void IilL11ii1I1Il() {
        iiI1L1iI(-1, true, true, (IOException) null);
    }

    public void i111iLiiIIill(IOException iOException) {
        this.il1LilLllii.iLLLILIiLi1Ii();
        this.iiIliillii.illlI1lLIL().iiiiI1iILL11I(iOException);
    }

    public void i1L1lLllLLlIi(C0337o0O0oooO o0o0oooo) {
        this.illlI1lLIL.ILl1iII11Ll1(this.i1LIL11l, o0o0oooo);
    }

    public void i1LIL11l() {
        this.iiIliillii.i1LIL11l();
    }

    public o0O iILiI1lll(C0337o0O0oooO o0o0oooo) throws IOException {
        try {
            this.illlI1lLIL.I1l1iIll1lIi1(this.i1LIL11l);
            String ilLIlL1ILi = o0o0oooo.ilLIlL1ILi("Content-Type");
            long iilLiIIIi11i = this.iiIliillii.iilLiIIIi11i(o0o0oooo);
            return new C0318o0O0oO0(ilLIlL1ILi, iilLiIIIi11i, C0249o00oo00O.il1LilLllii(new i1LIL11l(this.iiIliillii.iLLLILIiLi1Ii(o0o0oooo), iilLiIIIi11i)));
        } catch (IOException e) {
            this.illlI1lLIL.iiLIIiIli(this.i1LIL11l, e);
            i111iLiiIIill(e);
            throw e;
        }
    }

    public void iL1LIlIlI() {
        this.iiI1L1iI.iL1LIlIlI();
    }

    public boolean iLLLILIiLi1Ii() {
        return this.iilLil1i11I1;
    }

    @Nullable
    public IOException iiI1L1iI(long j, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            i111iLiiIIill(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.illlI1lLIL.iL1LIlIlI(this.i1LIL11l, iOException);
            } else {
                this.illlI1lLIL.i1L1lLllLLlIi(this.i1LIL11l, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.illlI1lLIL.iiLIIiIli(this.i1LIL11l, iOException);
            } else {
                this.illlI1lLIL.IilL11ii1I1Il(this.i1LIL11l, j);
            }
        }
        return this.iiI1L1iI.I11lLL1(this, z2, z, iOException);
    }

    public void iiIliillii() {
        this.iiIliillii.i1LIL11l();
        this.iiI1L1iI.I11lLL1(this, true, true, (IOException) null);
    }

    public void iilLiIIIi11i() {
        this.iiIliillii.illlI1lLIL().I1l1iIll1lIi1();
    }

    public void iilLil1i11I1() throws IOException {
        try {
            this.iiIliillii.iiIliillii();
        } catch (IOException e) {
            this.illlI1lLIL.iL1LIlIlI(this.i1LIL11l, e);
            i111iLiiIIill(e);
            throw e;
        }
    }

    public C0361o0OOOo0 il1LilLllii(C0333o0O0ooO0 o0o0ooo0, boolean z) throws IOException {
        this.iilLil1i11I1 = z;
        long iiI1L1iI2 = o0o0ooo0.iiI1L1iI().iiI1L1iI();
        this.illlI1lLIL.IL1lILLLL1L(this.i1LIL11l);
        return new iiI1L1iI(this.iiIliillii.il1LilLllii(o0o0ooo0, iiI1L1iI2), iiI1L1iI2);
    }

    public C0315o0O0o0oO illlI1lLIL() {
        return this.iiIliillii.illlI1lLIL();
    }
}
