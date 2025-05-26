package top.tntok.autobot;

import java.util.Comparator;

/* renamed from: top.tntok.autobot.o0O0oo  reason: case insensitive filesystem */
public abstract class C0328o0O0oo {

    /* renamed from: top.tntok.autobot.o0O0oo$iiI1L1iI */
    public class iiI1L1iI extends C0328o0O0oo {
        public final /* synthetic */ C0346o0OO0oOO iiI1L1iI;

        public iiI1L1iI(C0346o0OO0oOO o0oo0ooo) {
            this.iiI1L1iI = o0oo0ooo;
        }

        public C0346o0OO0oOO iLLLILIiLi1Ii() {
            return this.iiI1L1iI;
        }
    }

    public static C0328o0O0oo IiIIlIL(Class<?> cls, String str) {
        return iiI1L1iI(cls).iilLil1i11I1(C0009OooO0oO.I11lLL1(cls, str));
    }

    public static C0328o0O0oo IiiL1llIIi(C0346o0OO0oOO o0oo0ooo) {
        return new iiI1L1iI(o0oo0ooo);
    }

    public static C0328o0O0oo i1LIL11l(Class<?> cls) {
        return new iLLIiIIi(cls, false);
    }

    public static C0328o0O0oo iiI1L1iI(Class<?> cls) {
        return new iLLIiIIi(cls);
    }

    public static C0328o0O0oo iiIliillii(Class<?> cls, Throwable th) {
        return IiiL1llIIi(new C0040OoooOOO(cls, th));
    }

    public static C0328o0O0oo il1LilLllii(Class<?>... clsArr) {
        return illlI1lLIL(C0148o00OOooO.i1LIL11l(), clsArr);
    }

    public static C0328o0O0oo illlI1lLIL(i1LlIiLL1 i1lliill1, Class<?>... clsArr) {
        try {
            return IiiL1llIIi(i1lliill1.i1LIL11l(new IliiLiLliIl(), clsArr));
        } catch (C0136o00O0oo e) {
            return IiiL1llIIi(new C0040OoooOOO((Throwable) e, clsArr));
        }
    }

    public C0328o0O0oo I11lLL1(o000O0O o000o0o) {
        return new o000O0Oo(this, o000o0o);
    }

    public C0328o0O0oo iILiI1lll(Comparator<C0009OooO0oO> comparator) {
        return new C0368o0OOOoo(this, comparator);
    }

    public abstract C0346o0OO0oOO iLLLILIiLi1Ii();

    public C0328o0O0oo iilLiIIIi11i(C0261o00ooO0o o00ooo0o) {
        return new C0257o00ooO(this, o00ooo0o);
    }

    public C0328o0O0oo iilLil1i11I1(C0009OooO0oO oooO0oO) {
        return I11lLL1(o000O0O.il1LilLllii(oooO0oO));
    }
}
