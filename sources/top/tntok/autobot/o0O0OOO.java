package top.tntok.autobot;

public final class o0O0OOO {
    public final i1iiLIil1ILi i1LIL11l;
    public final C0363o0OOOo0O iiI1L1iI;

    public o0O0OOO(C0363o0OOOo0O o0oooo0o, i1iiLIil1ILi i1iiliil1ili) {
        this.iiI1L1iI = o0oooo0o;
        this.i1LIL11l = i1iiliil1ili;
    }

    public static o0O0OOO iiI1L1iI(C0363o0OOOo0O o0oooo0o, i1iiLIil1ILi i1iiliil1ili, C0363o0OOOo0O o0oooo0o2) {
        if (!o0oooo0o.equals(o0oooo0o2) || i1iiliil1ili != null) {
            i1iiliil1ili = i1iiLIil1ILi.iLLLILIiLi1Ii(o0oooo0o2).iiIliillii(i1iiliil1ili).iiIliillii(i1iiLIil1ILi.I11lLL1(o0oooo0o));
        }
        return new o0O0OOO(o0oooo0o, i1iiliil1ili);
    }

    public C0363o0OOOo0O i1LIL11l() {
        return this.iiI1L1iI;
    }

    public C0293o0O0O0oo illlI1lLIL(o0O0OOO0 o0o0ooo0) {
        if (!this.iiI1L1iI.equals(o0o0ooo0.i1LIL11l())) {
            return null;
        }
        C0293o0O0O0oo iiI1L1iI2 = o0o0ooo0.iiI1L1iI();
        i1iiLIil1ILi i1iiliil1ili = this.i1LIL11l;
        if (i1iiliil1ili != null) {
            return i1iiliil1ili.iiI1L1iI(iiI1L1iI2);
        }
        return iiI1L1iI2;
    }
}
