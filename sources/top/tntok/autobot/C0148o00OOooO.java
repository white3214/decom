package top.tntok.autobot;

import java.io.PrintStream;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.iiI1L1iI;

/* renamed from: top.tntok.autobot.o00OOooO  reason: case insensitive filesystem */
public class C0148o00OOooO {
    public final iiI1L1iI iiI1L1iI = new iiI1L1iI();

    public static o0OO000 IiiL1llIIi(i1LlIiLL1 i1lliill1, Class<?>... clsArr) {
        return new C0148o00OOooO().iilLil1i11I1(i1lliill1, clsArr);
    }

    public static i1LlIiLL1 i1LIL11l() {
        return new i1LlIiLL1();
    }

    public static o0OO000 iILiI1lll(Class<?>... clsArr) {
        return IiiL1llIIi(i1LIL11l(), clsArr);
    }

    public static void il1LilLllii(String... strArr) {
        System.exit(new C0148o00OOooO().I1iIiIi(new C0319o0O0oO0O(), strArr).i1L1lLllLLlIi() ^ true ? 1 : 0);
    }

    public o0OO000 I11lLL1(C0328o0O0oo o0o0oo) {
        return iLLLILIiLi1Ii(o0o0oo.iLLLILIiLi1Ii());
    }

    public o0OO000 I1iIiIi(C0171o00OoOoO o00ooooo, String... strArr) {
        PrintStream i1LIL11l = o00ooooo.i1LIL11l();
        i1LIL11l.println("JUnit version " + C0492o0o000O0.iiI1L1iI());
        C0147o00OOoo I11lLL1 = C0147o00OOoo.I11lLL1(strArr);
        iiI1L1iI(new C0437o0OoO0o0(o00ooooo));
        return I11lLL1(I11lLL1.illlI1lLIL(i1LIL11l()));
    }

    public o0OO000 IiIIlIL(C0532o0oOo0o0 o0ooo0o0) {
        return iLLLILIiLi1Ii(new o00OOO(o0ooo0o0));
    }

    public o0OO000 iLLLILIiLi1Ii(C0346o0OO0oOO o0oo0ooo) {
        o0OO000 o0oo000 = new o0OO000();
        RunListener I11lLL1 = o0oo000.I11lLL1();
        this.iiI1L1iI.illlI1lLIL(I11lLL1);
        try {
            this.iiI1L1iI.IiiL1llIIi(o0oo0ooo.iiI1L1iI());
            o0oo0ooo.i1LIL11l(this.iiI1L1iI);
            this.iiI1L1iI.iilLiIIIi11i(o0oo000);
            return o0oo000;
        } finally {
            iiIliillii(I11lLL1);
        }
    }

    public void iiI1L1iI(RunListener runListener) {
        this.iiI1L1iI.il1LilLllii(runListener);
    }

    public void iiIliillii(RunListener runListener) {
        this.iiI1L1iI.iL1LIlIlI(runListener);
    }

    public o0OO000 iilLiIIIi11i(Class<?>... clsArr) {
        return iilLil1i11I1(i1LIL11l(), clsArr);
    }

    public o0OO000 iilLil1i11I1(i1LlIiLL1 i1lliill1, Class<?>... clsArr) {
        return I11lLL1(C0328o0O0oo.illlI1lLIL(i1lliill1, clsArr));
    }

    public String illlI1lLIL() {
        return C0492o0o000O0.iiI1L1iI();
    }
}
