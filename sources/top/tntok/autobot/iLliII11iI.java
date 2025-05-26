package top.tntok.autobot;

import java.io.IOException;
import java.util.List;
import top.tntok.autobot.C0333o0O0ooO0;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.o00OO00O;

public final class iLliII11iI implements o00OO00O {
    public final ii1ILilI1IL iiI1L1iI;

    public iLliII11iI(ii1ILilI1IL ii1ilili1il) {
        this.iiI1L1iI = ii1ilili1il;
    }

    public final String i1LIL11l(List<I1iIiIl1Ll> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            I1iIiIl1Ll i1iIiIl1Ll = list.get(i);
            sb.append(i1iIiIl1Ll.iLLLILIiLi1Ii());
            sb.append('=');
            sb.append(i1iIiIl1Ll.I1l1iIll1lIi1());
        }
        return sb.toString();
    }

    public C0337o0O0oooO iiI1L1iI(o00OO00O.iiI1L1iI iii1l1ii) throws IOException {
        C0333o0O0ooO0 iiI1L1iI2 = iii1l1ii.iiI1L1iI();
        C0333o0O0ooO0.iiI1L1iI iLLLILIiLi1Ii = iiI1L1iI2.iLLLILIiLi1Ii();
        C0334o0O0ooOO iiI1L1iI3 = iiI1L1iI2.iiI1L1iI();
        if (iiI1L1iI3 != null) {
            C0179o00OooO0 i1LIL11l = iiI1L1iI3.i1LIL11l();
            if (i1LIL11l != null) {
                iLLLILIiLi1Ii.iLLLILIiLi1Ii("Content-Type", i1LIL11l.toString());
            }
            long iiI1L1iI4 = iiI1L1iI3.iiI1L1iI();
            if (iiI1L1iI4 != -1) {
                iLLLILIiLi1Ii.iLLLILIiLi1Ii("Content-Length", Long.toString(iiI1L1iI4));
                iLLLILIiLi1Ii.i1L1lLllLLlIi("Transfer-Encoding");
            } else {
                iLLLILIiLi1Ii.iLLLILIiLi1Ii("Transfer-Encoding", "chunked");
                iLLLILIiLi1Ii.i1L1lLllLLlIi("Content-Length");
            }
        }
        boolean z = false;
        if (iiI1L1iI2.illlI1lLIL("Host") == null) {
            iLLLILIiLi1Ii.iLLLILIiLi1Ii("Host", C0487o0OooooO.I1l1iIll1lIi1(iiI1L1iI2.IiiL1llIIi(), false));
        }
        if (iiI1L1iI2.illlI1lLIL("Connection") == null) {
            iLLLILIiLi1Ii.iLLLILIiLi1Ii("Connection", "Keep-Alive");
        }
        if (iiI1L1iI2.illlI1lLIL("Accept-Encoding") == null && iiI1L1iI2.illlI1lLIL("Range") == null) {
            iLLLILIiLi1Ii.iLLLILIiLi1Ii("Accept-Encoding", "gzip");
            z = true;
        }
        List<I1iIiIl1Ll> iiI1L1iI5 = this.iiI1L1iI.iiI1L1iI(iiI1L1iI2.IiiL1llIIi());
        if (!iiI1L1iI5.isEmpty()) {
            iLLLILIiLi1Ii.iLLLILIiLi1Ii("Cookie", i1LIL11l(iiI1L1iI5));
        }
        if (iiI1L1iI2.illlI1lLIL("User-Agent") == null) {
            iLLLILIiLi1Ii.iLLLILIiLi1Ii("User-Agent", C0491o0o000O.iiI1L1iI());
        }
        C0337o0O0oooO IiIIlIL = iii1l1ii.IiIIlIL(iLLLILIiLi1Ii.i1LIL11l());
        C0104o000o0oo.IiiL1llIIi(this.iiI1L1iI, iiI1L1iI2.IiiL1llIIi(), IiIIlIL.I1lLLLlliILlI());
        C0337o0O0oooO.iiI1L1iI Ii1liIIIiLi = IiIIlIL.I1IILIil1lLlL().Ii1liIIIiLi(iiI1L1iI2);
        if (z && "gzip".equalsIgnoreCase(IiIIlIL.ilLIlL1ILi("Content-Encoding")) && C0104o000o0oo.illlI1lLIL(IiIIlIL)) {
            C0083o000Oo00 o000oo00 = new C0083o000Oo00(IiIIlIL.iiI1L1iI().IL11lll11());
            Ii1liIIIiLi.iilLiIIIi11i(IiIIlIL.I1lLLLlliILlI().iilLiIIIi11i().IiiL1llIIi("Content-Encoding").IiiL1llIIi("Content-Length").IiIIlIL());
            Ii1liIIIiLi.i1LIL11l(new C0318o0O0oO0(IiIIlIL.ilLIlL1ILi("Content-Type"), -1, C0249o00oo00O.il1LilLllii(o000oo00)));
        }
        return Ii1liIIIiLi.illlI1lLIL();
    }
}
