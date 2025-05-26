package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import top.tntok.autobot.C0094o000o000;

/* renamed from: top.tntok.autobot.o0O0oooO  reason: case insensitive filesystem */
public final class C0337o0O0oooO implements Closeable {
    public final C0094o000o000 I11lLL1;
    public final long I1iIiIi;
    @Nullable
    public volatile i1I1l11IL IL1lILLLL1L;
    @Nullable
    public final C0337o0O0oooO IiIIlIL;
    @Nullable
    public final C0337o0O0oooO IiiL1llIIi;
    @Nullable
    public final C0045Ooooo00 i1L1lLllLLlIi;
    public final C0333o0O0ooO0 i1LIL11l;
    public final long iILiI1lll;
    @Nullable
    public final o0O iLLLILIiLi1Ii;
    public final String iiIliillii;
    @Nullable
    public final C0337o0O0oooO iilLiIIIi11i;
    @Nullable
    public final C0082o000Oo iilLil1i11I1;
    public final int il1LilLllii;
    public final C0297o0O0Oo illlI1lLIL;

    public C0337o0O0oooO(iiI1L1iI iii1l1ii) {
        this.i1LIL11l = iii1l1ii.iiI1L1iI;
        this.illlI1lLIL = iii1l1ii.i1LIL11l;
        this.il1LilLllii = iii1l1ii.illlI1lLIL;
        this.iiIliillii = iii1l1ii.il1LilLllii;
        this.iilLil1i11I1 = iii1l1ii.iiIliillii;
        this.I11lLL1 = iii1l1ii.iilLil1i11I1.IiIIlIL();
        this.iLLLILIiLi1Ii = iii1l1ii.I11lLL1;
        this.IiIIlIL = iii1l1ii.iLLLILIiLi1Ii;
        this.iilLiIIIi11i = iii1l1ii.IiIIlIL;
        this.IiiL1llIIi = iii1l1ii.iilLiIIIi11i;
        this.iILiI1lll = iii1l1ii.IiiL1llIIi;
        this.I1iIiIi = iii1l1ii.iILiI1lll;
        this.i1L1lLllLLlIi = iii1l1ii.I1iIiIi;
    }

    public iiI1L1iI I1IILIil1lLlL() {
        return new iiI1L1iI(this);
    }

    @Nullable
    public C0082o000Oo I1LiILiLLIl1l() {
        return this.iilLil1i11I1;
    }

    public C0094o000o000 I1lLLLlliILlI() {
        return this.I11lLL1;
    }

    public long II1l1IliI1Li1() {
        return this.I1iIiIi;
    }

    @Nullable
    public String IIL1Ll1I111(String str, @Nullable String str2) {
        String il1LilLllii2 = this.I11lLL1.il1LilLllii(str);
        if (il1LilLllii2 != null) {
            return il1LilLllii2;
        }
        return str2;
    }

    public C0094o000o000 IIlLLll1ll1() throws IOException {
        C0045Ooooo00 ooooo00 = this.i1L1lLllLLlIi;
        if (ooooo00 != null) {
            return ooooo00.Ii1liIIIiLi();
        }
        throw new IllegalStateException("trailers not available");
    }

    public boolean IL11lll11() {
        int i = this.il1LilLllii;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    @Nullable
    public C0337o0O0oooO ILIiLLLL1iiii() {
        return this.IiiL1llIIi;
    }

    public int IiIl11II() {
        return this.il1LilLllii;
    }

    public void close() {
        o0O o0o = this.iLLLILIiLi1Ii;
        if (o0o != null) {
            o0o.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public List<I1I1liIIL> i111iLiiIIill() {
        String str;
        int i = this.il1LilLllii;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C0104o000o0oo.I11lLL1(I1lLLLlliILlI(), str);
    }

    public C0333o0O0ooO0 i11iLLllliI() {
        return this.i1LIL11l;
    }

    public C0297o0O0Oo i1L1llI1LlL1l() {
        return this.illlI1lLIL;
    }

    public i1I1l11IL i1LIL11l() {
        i1I1l11IL i1i1l11il = this.IL1lILLLL1L;
        if (i1i1l11il != null) {
            return i1i1l11il;
        }
        i1I1l11IL I1iIiIi2 = i1I1l11IL.I1iIiIi(this.I11lLL1);
        this.IL1lILLLL1L = I1iIiIi2;
        return I1iIiIi2;
    }

    public String iILlLIlli() {
        return this.iiIliillii;
    }

    @Nullable
    public C0337o0O0oooO iIiL11iL() {
        return this.IiIIlIL;
    }

    @Nullable
    public o0O iiI1L1iI() {
        return this.iLLLILIiLi1Ii;
    }

    public boolean iiLl11ILL() {
        int i = this.il1LilLllii;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case Il1lL1lLIL.il1LilLllii:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    @Nullable
    public C0337o0O0oooO il1LilLllii() {
        return this.iilLiIIIi11i;
    }

    public List<String> ilIILlI1l11i(String str) {
        return this.I11lLL1.iL1LIlIlI(str);
    }

    @Nullable
    public String ilLIlL1ILi(String str) {
        return IIL1Ll1I111(str, (String) null);
    }

    public o0O ilLIlLiIILl1(long j) throws IOException {
        ILL1iL1LiiI IiiL1llIIi2 = this.iLLLILIiLi1Ii.IL11lll11().IiiL1llIIi();
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        IiiL1llIIi2.iLIIl1IliLlLI(j);
        iiILIlLLiIL.IILiIL1i11Li(IiiL1llIIi2, Math.min(j, IiiL1llIIi2.iLlIllll().iLLi1LIi()));
        return o0O.IIL1Ll1I111(this.iLLLILIiLi1Ii.ilLIlL1ILi(), iiILIlLLiIL.iLLi1LIi(), iiILIlLLiIL);
    }

    public long ilLilIL() {
        return this.iILiI1lll;
    }

    public String toString() {
        return "Response{protocol=" + this.illlI1lLIL + ", code=" + this.il1LilLllii + ", message=" + this.iiIliillii + ", url=" + this.i1LIL11l.IiiL1llIIi() + '}';
    }

    /* renamed from: top.tntok.autobot.o0O0oooO$iiI1L1iI */
    public static class iiI1L1iI {
        @Nullable
        public o0O I11lLL1;
        @Nullable
        public C0045Ooooo00 I1iIiIi;
        @Nullable
        public C0337o0O0oooO IiIIlIL;
        public long IiiL1llIIi;
        @Nullable
        public C0297o0O0Oo i1LIL11l;
        public long iILiI1lll;
        @Nullable
        public C0337o0O0oooO iLLLILIiLi1Ii;
        @Nullable
        public C0333o0O0ooO0 iiI1L1iI;
        @Nullable
        public C0082o000Oo iiIliillii;
        @Nullable
        public C0337o0O0oooO iilLiIIIi11i;
        public C0094o000o000.iiI1L1iI iilLil1i11I1;
        public String il1LilLllii;
        public int illlI1lLIL;

        public iiI1L1iI() {
            this.illlI1lLIL = -1;
            this.iilLil1i11I1 = new C0094o000o000.iiI1L1iI();
        }

        public iiI1L1iI I11lLL1(int i) {
            this.illlI1lLIL = i;
            return this;
        }

        public iiI1L1iI I1iIiIi(@Nullable C0337o0O0oooO o0o0oooo) {
            if (o0o0oooo != null) {
                iilLil1i11I1("networkResponse", o0o0oooo);
            }
            this.iLLLILIiLi1Ii = o0o0oooo;
            return this;
        }

        public iiI1L1iI IL1lILLLL1L(C0297o0O0Oo o0o0oo) {
            this.i1LIL11l = o0o0oo;
            return this;
        }

        public iiI1L1iI Ii1liIIIiLi(C0333o0O0ooO0 o0o0ooo0) {
            this.iiI1L1iI = o0o0ooo0;
            return this;
        }

        public iiI1L1iI IiIIlIL(String str, String str2) {
            this.iilLil1i11I1.iILiI1lll(str, str2);
            return this;
        }

        public void IiiL1llIIi(C0045Ooooo00 ooooo00) {
            this.I1iIiIi = ooooo00;
        }

        public iiI1L1iI IilL11ii1I1Il(long j) {
            this.IiiL1llIIi = j;
            return this;
        }

        public iiI1L1iI i111iLiiIIill(String str) {
            this.iilLil1i11I1.IiiL1llIIi(str);
            return this;
        }

        public iiI1L1iI i1L1lLllLLlIi(@Nullable C0337o0O0oooO o0o0oooo) {
            if (o0o0oooo != null) {
                iiIliillii(o0o0oooo);
            }
            this.iilLiIIIi11i = o0o0oooo;
            return this;
        }

        public iiI1L1iI i1LIL11l(@Nullable o0O o0o) {
            this.I11lLL1 = o0o;
            return this;
        }

        public iiI1L1iI iILiI1lll(String str) {
            this.il1LilLllii = str;
            return this;
        }

        public iiI1L1iI iL1LIlIlI(long j) {
            this.iILiI1lll = j;
            return this;
        }

        public iiI1L1iI iLLLILIiLi1Ii(@Nullable C0082o000Oo o000oo) {
            this.iiIliillii = o000oo;
            return this;
        }

        public iiI1L1iI iiI1L1iI(String str, String str2) {
            this.iilLil1i11I1.i1LIL11l(str, str2);
            return this;
        }

        public final void iiIliillii(C0337o0O0oooO o0o0oooo) {
            if (o0o0oooo.iLLLILIiLi1Ii != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public iiI1L1iI iilLiIIIi11i(C0094o000o000 o000o000) {
            this.iilLil1i11I1 = o000o000.iilLiIIIi11i();
            return this;
        }

        public final void iilLil1i11I1(String str, C0337o0O0oooO o0o0oooo) {
            if (o0o0oooo.iLLLILIiLi1Ii != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (o0o0oooo.IiIIlIL != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (o0o0oooo.iilLiIIIi11i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (o0o0oooo.IiiL1llIIi != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public iiI1L1iI il1LilLllii(@Nullable C0337o0O0oooO o0o0oooo) {
            if (o0o0oooo != null) {
                iilLil1i11I1("cacheResponse", o0o0oooo);
            }
            this.IiIIlIL = o0o0oooo;
            return this;
        }

        public C0337o0O0oooO illlI1lLIL() {
            if (this.iiI1L1iI == null) {
                throw new IllegalStateException("request == null");
            } else if (this.i1LIL11l == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.illlI1lLIL < 0) {
                throw new IllegalStateException("code < 0: " + this.illlI1lLIL);
            } else if (this.il1LilLllii != null) {
                return new C0337o0O0oooO(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public iiI1L1iI(C0337o0O0oooO o0o0oooo) {
            this.illlI1lLIL = -1;
            this.iiI1L1iI = o0o0oooo.i1LIL11l;
            this.i1LIL11l = o0o0oooo.illlI1lLIL;
            this.illlI1lLIL = o0o0oooo.il1LilLllii;
            this.il1LilLllii = o0o0oooo.iiIliillii;
            this.iiIliillii = o0o0oooo.iilLil1i11I1;
            this.iilLil1i11I1 = o0o0oooo.I11lLL1.iilLiIIIi11i();
            this.I11lLL1 = o0o0oooo.iLLLILIiLi1Ii;
            this.iLLLILIiLi1Ii = o0o0oooo.IiIIlIL;
            this.IiIIlIL = o0o0oooo.iilLiIIIi11i;
            this.iilLiIIIi11i = o0o0oooo.IiiL1llIIi;
            this.IiiL1llIIi = o0o0oooo.iILiI1lll;
            this.iILiI1lll = o0o0oooo.I1iIiIi;
            this.I1iIiIi = o0o0oooo.i1L1lLllLLlIi;
        }
    }
}
