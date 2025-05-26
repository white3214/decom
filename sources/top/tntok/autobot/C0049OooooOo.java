package top.tntok.autobot;

/* renamed from: top.tntok.autobot.OooooOo  reason: case insensitive filesystem */
public class C0049OooooOo implements C0429o0Oo0ooO {
    public String i1LIL11l = "Expected test to throw %s";
    public final C0051Oooooo0 iiI1L1iI = new C0051Oooooo0();

    /* renamed from: top.tntok.autobot.OooooOo$iiI1L1iI */
    public class iiI1L1iI extends C0374o0OOo00o {
        public final C0374o0OOo00o iiI1L1iI;

        public iiI1L1iI(C0374o0OOo00o o0ooo00o) {
            this.iiI1L1iI = o0ooo00o;
        }

        public void iiI1L1iI() throws Throwable {
            try {
                this.iiI1L1iI.iiI1L1iI();
                if (C0049OooooOo.this.I1iIiIi()) {
                    C0049OooooOo.this.IiIIlIL();
                }
            } catch (Throwable th) {
                C0049OooooOo.this.iILiI1lll(th);
            }
        }
    }

    @Deprecated
    public static C0049OooooOo IL1lILLLL1L() {
        return new C0049OooooOo();
    }

    public void I11lLL1(String str) {
        iLLLILIiLi1Ii(I1i1LilILi.IiIIlIL(str));
    }

    public final boolean I1iIiIi() {
        return this.iiI1L1iI.iilLil1i11I1();
    }

    public final void IiIIlIL() throws AssertionError {
        Il1llillili.ILiliIiI(i1L1lLllLLlIi());
    }

    public final String i1L1lLllLLlIi() {
        String IL1lILLLL1L = C0384o0OOoO0.IL1lILLLL1L(this.iiI1L1iI.illlI1lLIL());
        return String.format(this.i1LIL11l, new Object[]{IL1lILLLL1L});
    }

    public final void iILiI1lll(Throwable th) throws Throwable {
        if (I1iIiIi()) {
            Il1llillili.Il1llillili(th, this.iiI1L1iI.illlI1lLIL());
            return;
        }
        throw th;
    }

    public C0049OooooOo iL1LIlIlI(String str) {
        this.i1LIL11l = str;
        return this;
    }

    public void iLLLILIiLi1Ii(C0175o00Ooo00<String> o00ooo00) {
        iiIliillii(C0440o0OoOO.iLLLILIiLi1Ii(o00ooo00));
    }

    public C0374o0OOo00o iiI1L1iI(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO) {
        return new iiI1L1iI(o0ooo00o);
    }

    public void iiIliillii(C0175o00Ooo00<?> o00ooo00) {
        this.iiI1L1iI.iiI1L1iI(o00ooo00);
    }

    public void iilLil1i11I1(C0175o00Ooo00<?> o00ooo00) {
        iiIliillii(C0442o0OoOO0o.iLLLILIiLi1Ii(o00ooo00));
    }

    public void il1LilLllii(Class<? extends Throwable> cls) {
        iiIliillii(I1i1LilILi.ILl1iII11Ll1(cls));
    }

    @Deprecated
    public C0049OooooOo IiiL1llIIi() {
        return this;
    }

    @Deprecated
    public C0049OooooOo iilLiIIIi11i() {
        return this;
    }
}
