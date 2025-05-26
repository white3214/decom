package top.tntok.autobot;

public class o0OO000o {

    public class i1LIL11l extends IlLLlIi1iI1li<Object> {
        public final /* synthetic */ String i1LIL11l;

        public i1LIL11l(String str) {
            this.i1LIL11l = str;
        }

        public boolean i1LIL11l(Object obj) {
            if (!obj.toString().contains(this.i1LIL11l) || !o0OO000o.iiI1L1iI(1).i1LIL11l(obj)) {
                return false;
            }
            return true;
        }

        public void illlI1lLIL(OooO0o oooO0o) {
            oooO0o.iiIliillii("has single failure containing " + this.i1LIL11l);
        }
    }

    public class iiI1L1iI extends C0460o0OoOoo0<C0475o0OooO0> {
        public final /* synthetic */ int il1LilLllii;

        public iiI1L1iI(int i) {
            this.il1LilLllii = i;
        }

        /* renamed from: I11lLL1 */
        public boolean iilLil1i11I1(C0475o0OooO0 o0oooo0) {
            if (o0oooo0.iiI1L1iI() == this.il1LilLllii) {
                return true;
            }
            return false;
        }

        public void illlI1lLIL(OooO0o oooO0o) {
            oooO0o.iiIliillii("has " + this.il1LilLllii + " failures");
        }
    }

    public class il1LilLllii extends C0460o0OoOoo0<C0475o0OooO0> {
        public final /* synthetic */ String il1LilLllii;

        public il1LilLllii(String str) {
            this.il1LilLllii = str;
        }

        /* renamed from: I11lLL1 */
        public boolean iilLil1i11I1(C0475o0OooO0 o0oooo0) {
            if (o0oooo0.iiI1L1iI() <= 0 || !o0oooo0.toString().contains(this.il1LilLllii)) {
                return false;
            }
            return true;
        }

        public void illlI1lLIL(OooO0o oooO0o) {
            oooO0o.iiIliillii("has failure containing " + this.il1LilLllii);
        }
    }

    public class illlI1lLIL extends C0460o0OoOoo0<C0475o0OooO0> {
        public final /* synthetic */ C0175o00Ooo00 il1LilLllii;

        public illlI1lLIL(C0175o00Ooo00 o00ooo00) {
            this.il1LilLllii = o00ooo00;
        }

        /* renamed from: I11lLL1 */
        public boolean iilLil1i11I1(C0475o0OooO0 o0oooo0) {
            if (o0oooo0.iiI1L1iI() != 1 || !this.il1LilLllii.i1LIL11l(o0oooo0.i1LIL11l().get(0).i1LIL11l())) {
                return false;
            }
            return true;
        }

        public void illlI1lLIL(OooO0o oooO0o) {
            oooO0o.iiIliillii("has failure with exception matching ");
            this.il1LilLllii.illlI1lLIL(oooO0o);
        }
    }

    public static C0175o00Ooo00<C0475o0OooO0> i1LIL11l(String str) {
        return new il1LilLllii(str);
    }

    public static C0175o00Ooo00<C0475o0OooO0> iiI1L1iI(int i) {
        return new iiI1L1iI(i);
    }

    public static C0175o00Ooo00<C0475o0OooO0> iiIliillii() {
        return iiI1L1iI(0);
    }

    public static C0175o00Ooo00<C0475o0OooO0> il1LilLllii(C0175o00Ooo00<Throwable> o00ooo00) {
        return new illlI1lLIL(o00ooo00);
    }

    public static C0175o00Ooo00<Object> illlI1lLIL(String str) {
        return new i1LIL11l(str);
    }
}
