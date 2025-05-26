package top.tntok.autobot;

import java.io.IOException;
import java.net.ProtocolException;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.o00OO00O;

public final class ilLILlL implements o00OO00O {
    public final boolean iiI1L1iI;

    public ilLILlL(boolean z) {
        this.iiI1L1iI = z;
    }

    public C0337o0O0oooO iiI1L1iI(o00OO00O.iiI1L1iI iii1l1ii) throws IOException {
        boolean z;
        C0337o0O0oooO o0o0oooo;
        C0549oooOO0 ooooo0 = (C0549oooOO0) iii1l1ii;
        C0045Ooooo00 iilLiIIIi11i = ooooo0.iilLiIIIi11i();
        C0333o0O0ooO0 iiI1L1iI2 = ooooo0.iiI1L1iI();
        long currentTimeMillis = System.currentTimeMillis();
        iilLiIIIi11i.I1l1iIll1lIi1(iiI1L1iI2);
        C0337o0O0oooO.iiI1L1iI iii1l1ii2 = null;
        if (!C0106o000oOoo.i1LIL11l(iiI1L1iI2.I11lLL1()) || iiI1L1iI2.iiI1L1iI() == null) {
            iilLiIIIi11i.IiiL1llIIi();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(iiI1L1iI2.illlI1lLIL("Expect"))) {
                iilLiIIIi11i.I11lLL1();
                iilLiIIIi11i.IL1lILLLL1L();
                iii1l1ii2 = iilLiIIIi11i.I1iIiIi(true);
                z = true;
            } else {
                z = false;
            }
            if (iii1l1ii2 != null) {
                iilLiIIIi11i.IiiL1llIIi();
                if (!iilLiIIIi11i.illlI1lLIL().i111iLiiIIill()) {
                    iilLiIIIi11i.iilLiIIIi11i();
                }
            } else if (iiI1L1iI2.iiI1L1iI().iLLLILIiLi1Ii()) {
                iilLiIIIi11i.I11lLL1();
                iiI1L1iI2.iiI1L1iI().iilLiIIIi11i(C0249o00oo00O.illlI1lLIL(iilLiIIIi11i.il1LilLllii(iiI1L1iI2, true)));
            } else {
                Iiii1LiI11i illlI1lLIL = C0249o00oo00O.illlI1lLIL(iilLiIIIi11i.il1LilLllii(iiI1L1iI2, false));
                iiI1L1iI2.iiI1L1iI().iilLiIIIi11i(illlI1lLIL);
                illlI1lLIL.close();
            }
        }
        if (iiI1L1iI2.iiI1L1iI() == null || !iiI1L1iI2.iiI1L1iI().iLLLILIiLi1Ii()) {
            iilLiIIIi11i.iilLil1i11I1();
        }
        if (!z) {
            iilLiIIIi11i.IL1lILLLL1L();
        }
        if (iii1l1ii2 == null) {
            iii1l1ii2 = iilLiIIIi11i.I1iIiIi(false);
        }
        C0337o0O0oooO illlI1lLIL2 = iii1l1ii2.Ii1liIIIiLi(iiI1L1iI2).iLLLILIiLi1Ii(iilLiIIIi11i.illlI1lLIL().iiI1L1iI()).IilL11ii1I1Il(currentTimeMillis).iL1LIlIlI(System.currentTimeMillis()).illlI1lLIL();
        int IiIl11II = illlI1lLIL2.IiIl11II();
        if (IiIl11II == 100) {
            illlI1lLIL2 = iilLiIIIi11i.I1iIiIi(false).Ii1liIIIiLi(iiI1L1iI2).iLLLILIiLi1Ii(iilLiIIIi11i.illlI1lLIL().iiI1L1iI()).IilL11ii1I1Il(currentTimeMillis).iL1LIlIlI(System.currentTimeMillis()).illlI1lLIL();
            IiIl11II = illlI1lLIL2.IiIl11II();
        }
        iilLiIIIi11i.i1L1lLllLLlIi(illlI1lLIL2);
        if (!this.iiI1L1iI || IiIl11II != 101) {
            o0o0oooo = illlI1lLIL2.I1IILIil1lLlL().i1LIL11l(iilLiIIIi11i.iILiI1lll(illlI1lLIL2)).illlI1lLIL();
        } else {
            o0o0oooo = illlI1lLIL2.I1IILIil1lLlL().i1LIL11l(C0487o0OooooO.il1LilLllii).illlI1lLIL();
        }
        if ("close".equalsIgnoreCase(o0o0oooo.i11iLLllliI().illlI1lLIL("Connection")) || "close".equalsIgnoreCase(o0o0oooo.ilLIlL1ILi("Connection"))) {
            iilLiIIIi11i.iilLiIIIi11i();
        }
        if ((IiIl11II != 204 && IiIl11II != 205) || o0o0oooo.iiI1L1iI().I1LiILiLLIl1l() <= 0) {
            return o0o0oooo;
        }
        throw new ProtocolException("HTTP " + IiIl11II + " had non-zero Content-Length: " + o0o0oooo.iiI1L1iI().I1LiILiLLIl1l());
    }
}
