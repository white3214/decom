package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: top.tntok.autobot.o00oO000  reason: case insensitive filesystem */
public class C0221o00oO000 extends o0000OO0 {

    /* renamed from: top.tntok.autobot.o00oO000$iiI1L1iI */
    public static class iiI1L1iI implements C0481o0OoooO {
        public C0115o000ooo iiI1L1iI;

        public iiI1L1iI(C0115o000ooo o000ooo) {
            this.iiI1L1iI = o000ooo;
        }

        public String i1LIL11l() {
            return this.iiI1L1iI.I11lLL1().get(C0387o0OOoO0o.iiI1L1iI("VcBrL8OF7opC1nU+\n", "Nq8FW6brmqc=\n"));
        }

        public long iiI1L1iI() {
            try {
                return Long.parseLong(this.iiI1L1iI.I11lLL1().get(C0387o0OOoO0o.iiI1L1iI("U/0ut3usr1Nc9y6kaqo=\n", "MJJAwx7C234=\n")));
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public int iiIliillii() {
            return (int) iiI1L1iI();
        }

        public String il1LilLllii() {
            return C0387o0OOoO0o.iiI1L1iI("Sa1FeeM=\n", "HPkDVNsrPnM=\n");
        }

        public InputStream illlI1lLIL() throws IOException {
            return this.iiI1L1iI.illlI1lLIL();
        }
    }

    public C0221o00oO000(o00000O o00000o) {
        super(o00000o);
    }

    public static final boolean I1IIIi1i1ILl(C0115o000ooo o000ooo) {
        if (o000ooo.IiIIlIL() != C0288o0O00o0.POST || !C0060o0000OOo.Ii1liIIIiLi(new iiI1L1iI(o000ooo))) {
            return false;
        }
        return true;
    }

    public List<o00000O0> IIIlll1lll(C0115o000ooo o000ooo) throws C0062o0000Oo0 {
        return iiiiI1iILL11I(new iiI1L1iI(o000ooo));
    }

    public Map<String, List<o00000O0>> IilliIIIlI1ll(C0115o000ooo o000ooo) throws C0062o0000Oo0 {
        return i11liIIl11Ii1(new iiI1L1iI(o000ooo));
    }

    public C0058o00000oO il1l1IlL(C0115o000ooo o000ooo) throws C0062o0000Oo0, IOException {
        return super.i1L1lLllLLlIi(new iiI1L1iI(o000ooo));
    }
}
