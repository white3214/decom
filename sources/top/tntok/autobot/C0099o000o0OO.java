package top.tntok.autobot;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.o00OO00O;

/* renamed from: top.tntok.autobot.o000o0OO  reason: case insensitive filesystem */
public final class C0099o000o0OO implements C0046Ooooo0o {
    public static final String I1iIiIi = "te";
    public static final String IL1lILLLL1L = "upgrade";
    public static final String IiIIlIL = "host";
    public static final String IiiL1llIIi = "proxy-connection";
    public static final List<String> i111iLiiIIill = C0487o0OooooO.ILl1iII11Ll1("connection", IiIIlIL, iilLiIIIi11i, IiiL1llIIi, I1iIiIi, iILiI1lll, i1L1lLllLLlIi, "upgrade");
    public static final String i1L1lLllLLlIi = "encoding";
    public static final String iILiI1lll = "transfer-encoding";
    public static final List<String> iL1LIlIlI = C0487o0OooooO.ILl1iII11Ll1("connection", IiIIlIL, iilLiIIIi11i, IiiL1llIIi, I1iIiIi, iILiI1lll, i1L1lLllLLlIi, "upgrade", C0090o000Ooo0.iilLil1i11I1, C0090o000Ooo0.I11lLL1, C0090o000Ooo0.iLLLILIiLi1Ii, C0090o000Ooo0.IiIIlIL);
    public static final String iLLLILIiLi1Ii = "connection";
    public static final String iilLiIIIi11i = "keep-alive";
    public volatile boolean I11lLL1;
    public final o00OO00O.iiI1L1iI i1LIL11l;
    public volatile C0102o000o0o0 iiIliillii;
    public final C0297o0O0Oo iilLil1i11I1;
    public final C0097o000o0O il1LilLllii;
    public final C0315o0O0o0oO illlI1lLIL;

    public C0099o000o0OO(C0240o00oOoOO o00ooooo, C0315o0O0o0oO o0o0o0oo, o00OO00O.iiI1L1iI iii1l1ii, C0097o000o0O o000o0o) {
        this.illlI1lLIL = o0o0o0oo;
        this.i1LIL11l = iii1l1ii;
        this.il1LilLllii = o000o0o;
        List<C0297o0O0Oo> I1I11Il1 = o00ooooo.I1I11Il1();
        C0297o0O0Oo o0o0oo = C0297o0O0Oo.H2_PRIOR_KNOWLEDGE;
        this.iilLil1i11I1 = !I1I11Il1.contains(o0o0oo) ? C0297o0O0Oo.HTTP_2 : o0o0oo;
    }

    public static C0337o0O0oooO.iiI1L1iI iILiI1lll(C0094o000o000 o000o000, C0297o0O0Oo o0o0oo) throws IOException {
        C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
        int I1iIiIi2 = o000o000.I1iIiIi();
        C0375o0OOo0O o0ooo0o = null;
        for (int i = 0; i < I1iIiIi2; i++) {
            String iLLLILIiLi1Ii2 = o000o000.iLLLILIiLi1Ii(i);
            String IL1lILLLL1L2 = o000o000.IL1lILLLL1L(i);
            if (iLLLILIiLi1Ii2.equals(C0090o000Ooo0.iiIliillii)) {
                o0ooo0o = C0375o0OOo0O.i1LIL11l("HTTP/1.1 " + IL1lILLLL1L2);
            } else if (!i111iLiiIIill.contains(iLLLILIiLi1Ii2)) {
                C0139o00OO00o.iiI1L1iI.i1LIL11l(iii1l1ii, iLLLILIiLi1Ii2, IL1lILLLL1L2);
            }
        }
        if (o0ooo0o != null) {
            return new C0337o0O0oooO.iiI1L1iI().IL1lILLLL1L(o0o0oo).I11lLL1(o0ooo0o.i1LIL11l).iILiI1lll(o0ooo0o.illlI1lLIL).iilLiIIIi11i(iii1l1ii.IiIIlIL());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<C0090o000Ooo0> iiI1L1iI(C0333o0O0ooO0 o0o0ooo0) {
        C0094o000o000 iiIliillii2 = o0o0ooo0.iiIliillii();
        ArrayList arrayList = new ArrayList(iiIliillii2.I1iIiIi() + 4);
        arrayList.add(new C0090o000Ooo0(C0090o000Ooo0.IiiL1llIIi, o0o0ooo0.I11lLL1()));
        arrayList.add(new C0090o000Ooo0(C0090o000Ooo0.iILiI1lll, C0335o0O0ooo.illlI1lLIL(o0o0ooo0.IiiL1llIIi())));
        String illlI1lLIL2 = o0o0ooo0.illlI1lLIL("Host");
        if (illlI1lLIL2 != null) {
            arrayList.add(new C0090o000Ooo0(C0090o000Ooo0.i1L1lLllLLlIi, illlI1lLIL2));
        }
        arrayList.add(new C0090o000Ooo0(C0090o000Ooo0.I1iIiIi, o0o0ooo0.IiiL1llIIi().illi1LIILLiL()));
        int I1iIiIi2 = iiIliillii2.I1iIiIi();
        for (int i = 0; i < I1iIiIi2; i++) {
            String lowerCase = iiIliillii2.iLLLILIiLi1Ii(i).toLowerCase(Locale.US);
            if (!iL1LIlIlI.contains(lowerCase) || (lowerCase.equals(I1iIiIi) && iiIliillii2.IL1lILLLL1L(i).equals("trailers"))) {
                arrayList.add(new C0090o000Ooo0(lowerCase, iiIliillii2.IL1lILLLL1L(i)));
            }
        }
        return arrayList;
    }

    public void I11lLL1(C0333o0O0ooO0 o0o0ooo0) throws IOException {
        boolean z;
        if (this.iiIliillii == null) {
            if (o0o0ooo0.iiI1L1iI() != null) {
                z = true;
            } else {
                z = false;
            }
            this.iiIliillii = this.il1LilLllii.II1l1IliI1Li1(iiI1L1iI(o0o0ooo0), z);
            if (!this.I11lLL1) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.iiIliillii.IL1lILLLL1L().IiIIlIL((long) this.i1LIL11l.iLLLILIiLi1Ii(), timeUnit);
                this.iiIliillii.i1iiLIil1ILi().IiIIlIL((long) this.i1LIL11l.i1LIL11l(), timeUnit);
                return;
            }
            this.iiIliillii.iilLil1i11I1(C0039OoooOO0.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public C0094o000o000 IiIIlIL() throws IOException {
        return this.iiIliillii.I1l1iIll1lIi1();
    }

    public C0337o0O0oooO.iiI1L1iI IiiL1llIIi(boolean z) throws IOException {
        C0337o0O0oooO.iiI1L1iI iILiI1lll2 = iILiI1lll(this.iiIliillii.IilL11ii1I1Il(), this.iilLil1i11I1);
        if (!z || C0139o00OO00o.iiI1L1iI.il1LilLllii(iILiI1lll2) != 100) {
            return iILiI1lll2;
        }
        return null;
    }

    public void i1LIL11l() {
        this.I11lLL1 = true;
        if (this.iiIliillii != null) {
            this.iiIliillii.iilLil1i11I1(C0039OoooOO0.CANCEL);
        }
    }

    public C0370o0OOOooO iLLLILIiLi1Ii(C0337o0O0oooO o0o0oooo) {
        return this.iiIliillii.iILiI1lll();
    }

    public void iiIliillii() throws IOException {
        this.iiIliillii.IiiL1llIIi().close();
    }

    public long iilLiIIIi11i(C0337o0O0oooO o0o0oooo) {
        return C0104o000o0oo.i1LIL11l(o0o0oooo);
    }

    public void iilLil1i11I1() throws IOException {
        this.il1LilLllii.flush();
    }

    public C0361o0OOOo0 il1LilLllii(C0333o0O0ooO0 o0o0ooo0, long j) {
        return this.iiIliillii.IiiL1llIIi();
    }

    public C0315o0O0o0oO illlI1lLIL() {
        return this.illlI1lLIL;
    }
}
