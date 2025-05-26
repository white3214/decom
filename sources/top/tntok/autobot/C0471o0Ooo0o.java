package top.tntok.autobot;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

@Deprecated
/* renamed from: top.tntok.autobot.o0Ooo0o  reason: case insensitive filesystem */
public class C0471o0Ooo0o extends C0482o0OoooO0 {
    public static final int I1iIiIi = 55;
    public static final double IL1lILLLL1L = 0.1d;
    public static final int i1L1lLllLLlIi = 5;
    public static final String iILiI1lll = "o0Ooo0o";
    public static int iL1LIlIlI = 30;
    public double IiiL1llIIi = 0.1d;
    public boolean iilLiIIIi11i = true;

    public C0471o0Ooo0o(C0473o0Ooo0oO o0ooo0oo) {
        super(o0ooo0oo);
    }

    public C0471o0Ooo0o I1IILIil1lLlL() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        this.iilLiIIIi11i = false;
        return this;
    }

    public boolean I1Ii1ILliII(int i) throws C0472o0Ooo0o0 {
        int i2;
        int centerY;
        int i3;
        int centerY2;
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        sb.append("scrollBackward() on selector = ");
        sb.append(iiLIIiIli());
        AccessibilityNodeInfo iilLiIIIi11i2 = iilLiIIIi11i(10000);
        if (iilLiIIIi11i2 != null) {
            Rect rect = new Rect();
            iilLiIIIi11i2.getBoundsInScreen(rect);
            if (this.iilLiIIIi11i) {
                int height = (int) (((double) rect.height()) * I1LiILiLLIl1l());
                i2 = rect.centerX();
                centerY = rect.top + height;
                i3 = rect.centerX();
                centerY2 = rect.bottom - height;
            } else {
                int width = (int) (((double) rect.width()) * I1LiILiLLIl1l());
                i2 = rect.left + width;
                centerY = rect.centerY();
                i3 = rect.right - width;
                centerY2 = rect.centerY();
            }
            return i111iLiiIIill().IilL11ii1I1Il(i2, centerY, i3, centerY2, i);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public double I1LiILiLLIl1l() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return this.IiiL1llIIi;
    }

    public boolean I1LiliILi1lI1(C0470o0Ooo0Oo o0ooo0oo) throws C0472o0Ooo0o0 {
        Rect IiiL1llIIi2 = o0ooo0oo.IiiL1llIIi();
        Rect i1iiLIil1ILi = o0ooo0oo.i1iiLIil1ILi();
        boolean z = true;
        if (i1iiLIil1ILi.width() * i1iiLIil1ILi.height() == IiiL1llIIi2.width() * IiiL1llIIi2.height()) {
            return true;
        }
        boolean z2 = this.iilLiIIIi11i;
        if (!z2 ? IiiL1llIIi2.left != i1iiLIil1ILi.left : IiiL1llIIi2.top != i1iiLIil1ILi.top) {
            z = false;
        }
        if (z2) {
            if (z) {
                return iLlIllll(10);
            }
            return IIi1l1i(10);
        } else if (z) {
            return IIllllLiIlIl(10);
        } else {
            return IiiIlLl1il1i(10);
        }
    }

    public boolean I1i1iiiI(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        return iIiL11iL(i, 5);
    }

    public boolean I1lLLLlliILlI(String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(str);
        return ilIILlI1l11i(new C0473o0Ooo0oO().Il1llillili(str));
    }

    public boolean IIL1Ll1I111(C0470o0Ooo0Oo o0ooo0oo) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo.iiLIIiIli());
        return ilIILlI1l11i(o0ooo0oo.iiLIIiIli());
    }

    public boolean IIlllIIi1ii(String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(str);
        return ilIILlI1l11i(new C0473o0Ooo0oO().IiiL1llIIi(str));
    }

    public boolean IL11lll11(int i, int i2) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder();
        sb.append("scrollToBeginning() on selector = ");
        sb.append(iiLIIiIli());
        for (int i3 = 0; i3 < i && I1Ii1ILliII(i2); i3++) {
        }
        return true;
    }

    public C0471o0Ooo0o ILIiLLLL1iiii(int i) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        iL1LIlIlI = i;
        return this;
    }

    public C0470o0Ooo0Oo ILiliIiI(C0473o0Ooo0oO o0ooo0oo, String str, boolean z) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str, Boolean.valueOf(z));
        if (str != null) {
            if (z) {
                ilIILlI1l11i(new C0473o0Ooo0oO().iILiI1lll(str));
            }
            return super.Il1llillili(o0ooo0oo, str);
        }
        throw new C0472o0Ooo0o0("for description= \"" + str + "\"");
    }

    public C0470o0Ooo0Oo IiIl11II(C0473o0Ooo0oO o0ooo0oo, int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, Integer.valueOf(i));
        return new C0470o0Ooo0Oo(C0473o0Ooo0oO.IIi1l1i(iiLIIiIli(), C0473o0Ooo0oO.illi1LIILLiL(o0ooo0oo).IL1IiilLlLI(i)));
    }

    public boolean IiiIIil1l() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return ilLIlL1ILi(5);
    }

    public C0470o0Ooo0Oo IillLillLLIii(C0473o0Ooo0oO o0ooo0oo, String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str);
        return iLiI1Llil(o0ooo0oo, str, true);
    }

    public C0470o0Ooo0Oo Il1llillili(C0473o0Ooo0oO o0ooo0oo, String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str);
        return ILiliIiI(o0ooo0oo, str, true);
    }

    public boolean IllLlI1IiIL() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return ilLIlL1ILi(55);
    }

    public C0471o0Ooo0o i1L1llI1LlL1l(double d) {
        C0447o0OoOOo.IiiL1llIIi(Double.valueOf(d));
        this.IiiL1llIIi = d;
        return this;
    }

    public boolean i1i1111LLILli() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return I1Ii1ILliII(5);
    }

    public boolean iILlLIlli(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        return iIiL11iL(i, 55);
    }

    public boolean iIiL11iL(int i, int i2) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2));
        for (int i3 = 0; i3 < i && ilLIlL1ILi(i2); i3++) {
        }
        return true;
    }

    public int iLI1L1l1li() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return iL1LIlIlI;
    }

    public boolean iLIIl1IliLlLI(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        return IL11lll11(i, 5);
    }

    public boolean iLILliI1(C0473o0Ooo0oO o0ooo0oo) {
        if (IilL11ii1I1Il().iLLLILIiLi1Ii(o0ooo0oo) != null) {
            return true;
        }
        return false;
    }

    public C0470o0Ooo0Oo iLiI1Llil(C0473o0Ooo0oO o0ooo0oo, String str, boolean z) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str, Boolean.valueOf(z));
        if (str != null) {
            if (z) {
                ilIILlI1l11i(new C0473o0Ooo0oO().Il1llillili(str));
            }
            return super.IillLillLLIii(o0ooo0oo, str);
        }
        throw new C0472o0Ooo0o0("for text= \"" + str + "\"");
    }

    public boolean iiLl11ILL(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        return IL11lll11(i, 55);
    }

    public boolean ilIILlI1l11i(C0473o0Ooo0oO o0ooo0oo) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo);
        C0473o0Ooo0oO il1LilLllii = iiLIIiIli().il1LilLllii(o0ooo0oo);
        if (iLILliI1(il1LilLllii)) {
            return true;
        }
        iiLl11ILL(iL1LIlIlI);
        if (iLILliI1(il1LilLllii)) {
            return true;
        }
        for (int i = 0; i < iL1LIlIlI; i++) {
            boolean IllLlI1IiIL = IllLlI1IiIL();
            if (iLILliI1(il1LilLllii)) {
                return true;
            }
            if (!IllLlI1IiIL) {
                return false;
            }
        }
        return false;
    }

    public boolean ilLIlL1ILi(int i) throws C0472o0Ooo0o0 {
        int i2;
        int centerY;
        int i3;
        int centerY2;
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        sb.append("scrollForward() on selector = ");
        sb.append(iiLIIiIli());
        AccessibilityNodeInfo iilLiIIIi11i2 = iilLiIIIi11i(10000);
        if (iilLiIIIi11i2 != null) {
            Rect rect = new Rect();
            iilLiIIIi11i2.getBoundsInScreen(rect);
            if (this.iilLiIIIi11i) {
                int height = (int) (((double) rect.height()) * I1LiILiLLIl1l());
                i2 = rect.centerX();
                centerY = rect.bottom - height;
                i3 = rect.centerX();
                centerY2 = rect.top + height;
            } else {
                int width = (int) (((double) rect.width()) * I1LiILiLLIl1l());
                i2 = rect.right - width;
                centerY = rect.centerY();
                i3 = rect.left + width;
                centerY2 = rect.centerY();
            }
            return i111iLiiIIill().IilL11ii1I1Il(i2, centerY, i3, centerY2, i);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public C0471o0Ooo0o ilLIlLiIILl1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        this.iilLiIIIi11i = true;
        return this;
    }

    public boolean illi1IL1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return I1Ii1ILliII(55);
    }
}
