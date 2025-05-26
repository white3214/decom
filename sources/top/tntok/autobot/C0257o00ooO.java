package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00ooO  reason: case insensitive filesystem */
public class C0257o00ooO extends C0180o00OooOO {
    public final C0261o00ooO0o il1LilLllii;
    public final C0328o0O0oo illlI1lLIL;

    public C0257o00ooO(C0328o0O0oo o0o0oo, C0261o00ooO0o o00ooo0o) {
        this.illlI1lLIL = o0o0oo;
        this.il1LilLllii = o00ooo0o;
    }

    public C0346o0OO0oOO I1iIiIi() {
        C0346o0OO0oOO iLLLILIiLi1Ii = this.illlI1lLIL.iLLLILIiLi1Ii();
        try {
            this.il1LilLllii.i1LIL11l(iLLLILIiLi1Ii);
            return iLLLILIiLi1Ii;
        } catch (o00OO0OO e) {
            return new C0040OoooOOO(this.il1LilLllii.getClass(), (Throwable) e);
        }
    }
}
