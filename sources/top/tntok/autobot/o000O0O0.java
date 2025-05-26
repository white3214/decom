package top.tntok.autobot;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public final class o000O0O0 extends C0334o0O0ooOO {
    public static final C0179o00OooO0 illlI1lLIL = C0179o00OooO0.illlI1lLIL("application/x-www-form-urlencoded");
    public final List<String> i1LIL11l;
    public final List<String> iiI1L1iI;

    public static final class iiI1L1iI {
        public final List<String> i1LIL11l;
        public final List<String> iiI1L1iI;
        @Nullable
        public final Charset illlI1lLIL;

        public iiI1L1iI() {
            this((Charset) null);
        }

        public iiI1L1iI i1LIL11l(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.iiI1L1iI.add(C0109o000oo00.illlI1lLIL(str, C0109o000oo00.IilL11ii1I1Il, true, false, true, true, this.illlI1lLIL));
                this.i1LIL11l.add(C0109o000oo00.illlI1lLIL(str2, C0109o000oo00.IilL11ii1I1Il, true, false, true, true, this.illlI1lLIL));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public iiI1L1iI iiI1L1iI(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.iiI1L1iI.add(C0109o000oo00.illlI1lLIL(str, C0109o000oo00.IilL11ii1I1Il, false, false, true, true, this.illlI1lLIL));
                this.i1LIL11l.add(C0109o000oo00.illlI1lLIL(str2, C0109o000oo00.IilL11ii1I1Il, false, false, true, true, this.illlI1lLIL));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public o000O0O0 illlI1lLIL() {
            return new o000O0O0(this.iiI1L1iI, this.i1LIL11l);
        }

        public iiI1L1iI(@Nullable Charset charset) {
            this.iiI1L1iI = new ArrayList();
            this.i1LIL11l = new ArrayList();
            this.illlI1lLIL = charset;
        }
    }

    public o000O0O0(List<String> list, List<String> list2) {
        this.iiI1L1iI = C0487o0OooooO.iiLIIiIli(list);
        this.i1LIL11l = C0487o0OooooO.iiLIIiIli(list2);
    }

    public String I1iIiIi(int i) {
        return C0109o000oo00.I1I11Il1(IiiL1llIIi(i), true);
    }

    public String IL1lILLLL1L(int i) {
        return C0109o000oo00.I1I11Il1(iILiI1lll(i), true);
    }

    public String IiiL1llIIi(int i) {
        return this.iiI1L1iI.get(i);
    }

    public int i1L1lLllLLlIi() {
        return this.iiI1L1iI.size();
    }

    public C0179o00OooO0 i1LIL11l() {
        return illlI1lLIL;
    }

    public String iILiI1lll(int i) {
        return this.i1LIL11l.get(i);
    }

    public final long iL1LIlIlI(@Nullable Iiii1LiI11i iiii1LiI11i, boolean z) {
        IiILIlLLiIL iiILIlLLiIL;
        if (z) {
            iiILIlLLiIL = new IiILIlLLiIL();
        } else {
            iiILIlLLiIL = iiii1LiI11i.illlI1lLIL();
        }
        int size = this.iiI1L1iI.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                iiILIlLLiIL.IillLillLLIii(38);
            }
            iiILIlLLiIL.illiiliIILI(this.iiI1L1iI.get(i));
            iiILIlLLiIL.IillLillLLIii(61);
            iiILIlLLiIL.illiiliIILI(this.i1LIL11l.get(i));
        }
        if (!z) {
            return 0;
        }
        long iLLi1LIi = iiILIlLLiIL.iLLi1LIi();
        iiILIlLLiIL.IIL1Ll1I111();
        return iLLi1LIi;
    }

    public long iiI1L1iI() {
        return iL1LIlIlI((Iiii1LiI11i) null, true);
    }

    public void iilLiIIIi11i(Iiii1LiI11i iiii1LiI11i) throws IOException {
        iL1LIlIlI(iiii1LiI11i, false);
    }
}
