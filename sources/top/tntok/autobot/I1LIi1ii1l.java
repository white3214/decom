package top.tntok.autobot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.ILLL1LlLLilL;
import top.tntok.autobot.o00OO00O;

public final class I1LIi1ii1l implements o00OO00O {
    @Nullable
    public final o00OO0 iiI1L1iI;

    public class iiI1L1iI implements C0370o0OOOooO {
        public boolean i1LIL11l;
        public final /* synthetic */ Iiii1LiI11i iiIliillii;
        public final /* synthetic */ I1lilLill1I il1LilLllii;
        public final /* synthetic */ ILL1iL1LiiI illlI1lLIL;

        public iiI1L1iI(ILL1iL1LiiI iLL1iL1LiiI, I1lilLill1I i1lilLill1I, Iiii1LiI11i iiii1LiI11i) {
            this.illlI1lLIL = iLL1iL1LiiI;
            this.il1LilLllii = i1lilLill1I;
            this.iiIliillii = iiii1LiI11i;
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            try {
                long IIlllIIi1ii = this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, j);
                if (IIlllIIi1ii == -1) {
                    if (!this.i1LIL11l) {
                        this.i1LIL11l = true;
                        this.iiIliillii.close();
                    }
                    return -1;
                }
                iiILIlLLiIL.iILlLIlli(this.iiIliillii.illlI1lLIL(), iiILIlLLiIL.iLLi1LIi() - IIlllIIi1ii, IIlllIIi1ii);
                this.iiIliillii.IIlL1llI1();
                return IIlllIIi1ii;
            } catch (IOException e) {
                if (!this.i1LIL11l) {
                    this.i1LIL11l = true;
                    this.il1LilLllii.iiI1L1iI();
                }
                throw e;
            }
        }

        public void close() throws IOException {
            if (!this.i1LIL11l && !C0487o0OooooO.i111iLiiIIill(this, 100, TimeUnit.MILLISECONDS)) {
                this.i1LIL11l = true;
                this.il1LilLllii.iiI1L1iI();
            }
            this.illlI1lLIL.close();
        }

        public C0446o0OoOOOo timeout() {
            return this.illlI1lLIL.timeout();
        }
    }

    public I1LIi1ii1l(@Nullable o00OO0 o00oo0) {
        this.iiI1L1iI = o00oo0;
    }

    public static boolean iiIliillii(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || C0223o00oO00o.IliiLiLliIl.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static C0337o0O0oooO iilLil1i11I1(C0337o0O0oooO o0o0oooo) {
        if (o0o0oooo == null || o0o0oooo.iiI1L1iI() == null) {
            return o0o0oooo;
        }
        return o0o0oooo.I1IILIil1lLlL().i1LIL11l((o0O) null).illlI1lLIL();
    }

    public static boolean il1LilLllii(String str) {
        if ("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static C0094o000o000 illlI1lLIL(C0094o000o000 o000o000, C0094o000o000 o000o0002) {
        C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
        int I1iIiIi = o000o000.I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            String iLLLILIiLi1Ii = o000o000.iLLLILIiLi1Ii(i);
            String IL1lILLLL1L = o000o000.IL1lILLLL1L(i);
            if ((!"Warning".equalsIgnoreCase(iLLLILIiLi1Ii) || !IL1lILLLL1L.startsWith(C0022OooOoo.IliiLiLliIl)) && (il1LilLllii(iLLLILIiLi1Ii) || !iiIliillii(iLLLILIiLi1Ii) || o000o0002.il1LilLllii(iLLLILIiLi1Ii) == null)) {
                C0139o00OO00o.iiI1L1iI.i1LIL11l(iii1l1ii, iLLLILIiLi1Ii, IL1lILLLL1L);
            }
        }
        int I1iIiIi2 = o000o0002.I1iIiIi();
        for (int i2 = 0; i2 < I1iIiIi2; i2++) {
            String iLLLILIiLi1Ii2 = o000o0002.iLLLILIiLi1Ii(i2);
            if (!il1LilLllii(iLLLILIiLi1Ii2) && iiIliillii(iLLLILIiLi1Ii2)) {
                C0139o00OO00o.iiI1L1iI.i1LIL11l(iii1l1ii, iLLLILIiLi1Ii2, o000o0002.IL1lILLLL1L(i2));
            }
        }
        return iii1l1ii.IiIIlIL();
    }

    public final C0337o0O0oooO i1LIL11l(I1lilLill1I i1lilLill1I, C0337o0O0oooO o0o0oooo) throws IOException {
        C0361o0OOOo0 i1LIL11l;
        if (i1lilLill1I == null || (i1LIL11l = i1lilLill1I.i1LIL11l()) == null) {
            return o0o0oooo;
        }
        iiI1L1iI iii1l1ii = new iiI1L1iI(o0o0oooo.iiI1L1iI().IL11lll11(), i1lilLill1I, C0249o00oo00O.illlI1lLIL(i1LIL11l));
        return o0o0oooo.I1IILIil1lLlL().i1LIL11l(new C0318o0O0oO0(o0o0oooo.ilLIlL1ILi("Content-Type"), o0o0oooo.iiI1L1iI().I1LiILiLLIl1l(), C0249o00oo00O.il1LilLllii(iii1l1ii))).illlI1lLIL();
    }

    public C0337o0O0oooO iiI1L1iI(o00OO00O.iiI1L1iI iii1l1ii) throws IOException {
        C0337o0O0oooO o0o0oooo;
        o00OO0 o00oo0 = this.iiI1L1iI;
        if (o00oo0 != null) {
            o0o0oooo = o00oo0.i1LIL11l(iii1l1ii.iiI1L1iI());
        } else {
            o0o0oooo = null;
        }
        ILLL1LlLLilL illlI1lLIL = new ILLL1LlLLilL.iiI1L1iI(System.currentTimeMillis(), iii1l1ii.iiI1L1iI(), o0o0oooo).illlI1lLIL();
        C0333o0O0ooO0 o0o0ooo0 = illlI1lLIL.iiI1L1iI;
        C0337o0O0oooO o0o0oooo2 = illlI1lLIL.i1LIL11l;
        o00OO0 o00oo02 = this.iiI1L1iI;
        if (o00oo02 != null) {
            o00oo02.iilLil1i11I1(illlI1lLIL);
        }
        if (o0o0oooo != null && o0o0oooo2 == null) {
            C0487o0OooooO.I11lLL1(o0o0oooo.iiI1L1iI());
        }
        if (o0o0ooo0 == null && o0o0oooo2 == null) {
            return new C0337o0O0oooO.iiI1L1iI().Ii1liIIIiLi(iii1l1ii.iiI1L1iI()).IL1lILLLL1L(C0297o0O0Oo.HTTP_1_1).I11lLL1(504).iILiI1lll("Unsatisfiable Request (only-if-cached)").i1LIL11l(C0487o0OooooO.il1LilLllii).IilL11ii1I1Il(-1).iL1LIlIlI(System.currentTimeMillis()).illlI1lLIL();
        }
        if (o0o0ooo0 == null) {
            return o0o0oooo2.I1IILIil1lLlL().il1LilLllii(iilLil1i11I1(o0o0oooo2)).illlI1lLIL();
        }
        try {
            C0337o0O0oooO IiIIlIL = iii1l1ii.IiIIlIL(o0o0ooo0);
            if (IiIIlIL == null && o0o0oooo != null) {
            }
            if (o0o0oooo2 != null) {
                if (IiIIlIL.IiIl11II() == 304) {
                    C0337o0O0oooO illlI1lLIL2 = o0o0oooo2.I1IILIil1lLlL().iilLiIIIi11i(illlI1lLIL(o0o0oooo2.I1lLLLlliILlI(), IiIIlIL.I1lLLLlliILlI())).IilL11ii1I1Il(IiIIlIL.ilLilIL()).iL1LIlIlI(IiIIlIL.II1l1IliI1Li1()).il1LilLllii(iilLil1i11I1(o0o0oooo2)).I1iIiIi(iilLil1i11I1(IiIIlIL)).illlI1lLIL();
                    IiIIlIL.iiI1L1iI().close();
                    this.iiI1L1iI.iiI1L1iI();
                    this.iiI1L1iI.illlI1lLIL(o0o0oooo2, illlI1lLIL2);
                    return illlI1lLIL2;
                }
                C0487o0OooooO.I11lLL1(o0o0oooo2.iiI1L1iI());
            }
            C0337o0O0oooO illlI1lLIL3 = IiIIlIL.I1IILIil1lLlL().il1LilLllii(iilLil1i11I1(o0o0oooo2)).I1iIiIi(iilLil1i11I1(IiIIlIL)).illlI1lLIL();
            if (this.iiI1L1iI != null) {
                if (C0104o000o0oo.illlI1lLIL(illlI1lLIL3) && ILLL1LlLLilL.iiI1L1iI(illlI1lLIL3, o0o0ooo0)) {
                    return i1LIL11l(this.iiI1L1iI.il1LilLllii(illlI1lLIL3), illlI1lLIL3);
                }
                if (C0106o000oOoo.iiI1L1iI(o0o0ooo0.I11lLL1())) {
                    try {
                        this.iiI1L1iI.iiIliillii(o0o0ooo0);
                    } catch (IOException unused) {
                    }
                }
            }
            return illlI1lLIL3;
        } finally {
            if (o0o0oooo != null) {
                C0487o0OooooO.I11lLL1(o0o0oooo.iiI1L1iI());
            }
        }
    }
}
