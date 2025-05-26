package top.tntok.autobot;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;

@Deprecated
/* renamed from: top.tntok.autobot.o0Ooo0Oo  reason: case insensitive filesystem */
public class C0470o0Ooo0Oo {
    public static final int I11lLL1 = 5;
    public static final int IiIIlIL = 20;
    @Deprecated
    public static final long iLLLILIiLi1Ii = 3000;
    public static final long iiIliillii = 1000;
    public static final long iilLil1i11I1 = 5500;
    @Deprecated
    public static final long il1LilLllii = 10000;
    public static final String illlI1lLIL = "o0Ooo0Oo";
    public final ILiI1LilIi i1LIL11l = ILiI1LilIi.i1LIL11l();
    public final C0473o0Ooo0oO iiI1L1iI;

    public C0470o0Ooo0Oo(C0473o0Ooo0oO o0ooo0oo) {
        this.iiI1L1iI = o0ooo0oo;
    }

    public boolean I11lLL1(int i, int i2, int i3) throws C0472o0Ooo0o0 {
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        return i111iLiiIIill().i1iI1iiLL1(i1iiLIil1ILi.centerX(), i1iiLIil1ILi.centerY(), i, i2, i3, true);
    }

    public boolean I1I11Il1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isClickable();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean I1IIIi1i1ILl() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isScrollable();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public int I1iIiIi() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.getChildCount();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public final AccessibilityNodeInfo I1l1iIll1lIi1(AccessibilityNodeInfo accessibilityNodeInfo) {
        while (accessibilityNodeInfo != null) {
            accessibilityNodeInfo = accessibilityNodeInfo.getParent();
            if (accessibilityNodeInfo != null && accessibilityNodeInfo.isScrollable()) {
                return accessibilityNodeInfo;
            }
        }
        return null;
    }

    public boolean IIIlll1lll() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().I1iIiIi(i11liIIl11Ii1.centerX(), i11liIIl11Ii1.centerY());
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IILiIL1i11Li() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().I1iIiIi(i11liIIl11Ii1.left + 5, i11liIIl11Ii1.top + 5);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IIi1l1i(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        if (i1iiLIil1ILi.height() <= 10) {
            return false;
        }
        return i111iLiiIIill().I1I11Il1(i1iiLIil1ILi.centerX(), i1iiLIil1ILi.top + 5, i1iiLIil1ILi.centerX(), i1iiLIil1ILi.bottom - 5, i);
    }

    public boolean IIlL1llI1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isFocusable();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IIlLill(MotionEvent.PointerCoords[]... pointerCoordsArr) {
        return i111iLiiIIill().iL1LIlIlI(pointerCoordsArr);
    }

    public boolean IIllllLiIlIl(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        if (i1iiLIil1ILi.width() <= 10) {
            return false;
        }
        return i111iLiiIIill().I1I11Il1(i1iiLIil1ILi.right - 5, i1iiLIil1ILi.centerY(), i1iiLIil1ILi.left + 5, i1iiLIil1ILi.centerY(), i);
    }

    public boolean IL111l1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isFocused();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IL1IiilLlLI() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().I1iIiIi(i11liIIl11Ii1.right - 5, i11liIIl11Ii1.bottom - 5);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public String IL1lILLLL1L() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return i1iLlIill1I(iilLiIIIi11i.getContentDescription());
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean ILiLII1ILi(long j) {
        C0447o0OoOOo.IiiL1llIIi(Long.valueOf(j));
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = 0;
        while (j2 <= j) {
            if (iilLiIIIi11i(0) == null) {
                return true;
            }
            j2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (j > 0) {
                SystemClock.sleep(1000);
            }
        }
        return false;
    }

    public String ILl1iII11Ll1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            String i1iLlIill1I = i1iLlIill1I(iilLiIIIi11i.getText());
            String.format("getText() = %s", new Object[]{i1iLlIill1I});
            return i1iLlIill1I;
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean ILllI11(int i, int i2) throws C0472o0Ooo0o0 {
        if (i < 0) {
            i = 1;
        } else if (i > 100) {
            i = 100;
        }
        float f = ((float) i) / 100.0f;
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            if (i11liIIl11Ii1.width() > 40) {
                return iliilLllIl1(new Point(i11liIIl11Ii1.centerX() - 20, i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() + 20, i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() - ((int) (((float) (i11liIIl11Ii1.width() / 2)) * f)), i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() + ((int) (((float) (i11liIIl11Ii1.width() / 2)) * f)), i11liIIl11Ii1.centerY()), i2);
            }
            throw new IllegalStateException("Object width is too small for operation");
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public String Ii1liIIIiLi() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return i1iLlIill1I(iilLiIIIi11i.getPackageName());
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IiIIlIL() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return i1LiiIlIL1I(0);
    }

    public boolean IiiIlLl1il1i(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        if (i1iiLIil1ILi.width() <= 10) {
            return false;
        }
        return i111iLiiIIill().I1I11Il1(i1iiLIil1ILi.left + 5, i1iiLIil1ILi.centerY(), i1iiLIil1ILi.right - 5, i1iiLIil1ILi.centerY(), i);
    }

    public Rect IiiL1llIIi() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect rect = new Rect();
            iilLiIIIi11i.getBoundsInScreen(rect);
            return rect;
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public C0309o0O0o00o IilL11ii1I1Il() {
        return C0527o0oOOO0o.I1iIiIi().iilLil1i11I1().il1LilLllii();
    }

    public boolean IilliIIIlI1ll() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isSelected();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean IliiLiLliIl() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isChecked();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public o00OO000 i111iLiiIIill() {
        return C0527o0oOOO0o.I1iIiIi().iilLil1i11I1().illlI1lLIL();
    }

    public final Rect i11liIIl11Ii1(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        int iILiI1lll = C0527o0oOOO0o.I1iIiIi().iILiI1lll();
        int IiIIlIL2 = C0527o0oOOO0o.I1iIiIi().IiIIlIL();
        Rect iiI1L1iI2 = I1iIiIi.iiI1L1iI(accessibilityNodeInfo, iILiI1lll, IiIIlIL2);
        AccessibilityNodeInfo I1l1iIll1lIi1 = I1l1iIll1lIi1(accessibilityNodeInfo);
        if (I1l1iIll1lIi1 != null && !iiI1L1iI2.intersect(I1iIiIi.iiI1L1iI(I1l1iIll1lIi1, iILiI1lll, IiIIlIL2))) {
            return new Rect();
        }
        return iiI1L1iI2;
    }

    public String i1L1lLllLLlIi() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            String i1iLlIill1I = i1iLlIill1I(iilLiIIIi11i.getClassName());
            String.format("getClassName() = %s", new Object[]{i1iLlIill1I});
            return i1iLlIill1I;
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean i1LIL11l() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().il1LilLllii(i11liIIl11Ii1.centerX(), i11liIIl11Ii1.centerY(), this.i1LIL11l.iiI1L1iI());
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean i1LiiIlIL1I(long j) {
        C0447o0OoOOo.IiiL1llIIi(Long.valueOf(j));
        if (iilLiIIIi11i(j) != null) {
            return true;
        }
        return false;
    }

    public boolean i1iI1iiLL1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isEnabled();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public final String i1iLlIill1I(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public Rect i1iiLIil1ILi() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return i11liIIl11Ii1(iilLiIIIi11i);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public C0470o0Ooo0Oo iILiI1lll(C0473o0Ooo0oO o0ooo0oo) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo);
        return new C0470o0Ooo0Oo(iiLIIiIli().il1LilLllii(o0ooo0oo));
    }

    public C0470o0Ooo0Oo iL1LIlIlI(C0473o0Ooo0oO o0ooo0oo) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo);
        return new C0470o0Ooo0Oo(iiLIIiIli().IilL11ii1I1Il(o0ooo0oo));
    }

    public boolean iLLLILIiLi1Ii(C0470o0Ooo0Oo o0ooo0oo, int i) throws C0472o0Ooo0o0 {
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        Rect i1iiLIil1ILi2 = o0ooo0oo.i1iiLIil1ILi();
        return i111iLiiIIill().i1iI1iiLL1(i1iiLIil1ILi.centerX(), i1iiLIil1ILi.centerY(), i1iiLIil1ILi2.centerX(), i1iiLIil1ILi2.centerY(), i, true);
    }

    public boolean iLlIllll(int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        Rect i1iiLIil1ILi = i1iiLIil1ILi();
        if (i1iiLIil1ILi.height() <= 10) {
            return false;
        }
        return i111iLiiIIill().I1I11Il1(i1iiLIil1ILi.centerX(), i1iiLIil1ILi.bottom - 5, i1iiLIil1ILi.centerX(), i1iiLIil1ILi.top + 5, i);
    }

    public void iiI1L1iI() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            i111iLiiIIill().I1iIiIi(i11liIIl11Ii1.left + 20, i11liIIl11Ii1.centerY());
            C0470o0Ooo0Oo o0ooo0oo = new C0470o0Ooo0Oo(new C0473o0Ooo0oO().iILiI1lll("Select all"));
            if (o0ooo0oo.i1LiiIlIL1I(50)) {
                o0ooo0oo.i1LIL11l();
            }
            SystemClock.sleep(250);
            i111iLiiIIill().I1l1iIll1lIi1(67, 0);
            return;
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean iiIliillii() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().iilLil1i11I1(i11liIIl11Ii1.right - 5, i11liIIl11Ii1.bottom - 5);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public final C0473o0Ooo0oO iiLIIiIli() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return new C0473o0Ooo0oO(this.iiI1L1iI);
    }

    public boolean iiiiI1iILL11I() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isCheckable();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public AccessibilityNodeInfo iilLiIIIi11i(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        long j2 = 0;
        while (j2 <= j && (accessibilityNodeInfo = IilL11ii1I1Il().iLLLILIiLi1Ii(iiLIIiIli())) == null) {
            C0527o0oOOO0o.I1iIiIi().i1iLlIill1I();
            j2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (j > 0) {
                SystemClock.sleep(1000);
            }
        }
        return accessibilityNodeInfo;
    }

    public boolean iilLil1i11I1() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().iilLil1i11I1(i11liIIl11Ii1.left + 5, i11liIIl11Ii1.top + 5);
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean il1LilLllii(long j) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(Long.valueOf(j));
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            return i111iLiiIIill().iiIliillii(i11liIIl11Ii1.centerX(), i11liIIl11Ii1.centerY(), this.i1LIL11l.iiI1L1iI());
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean il1l1IlL() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            return iilLiIIIi11i.isLongClickable();
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean iliilLllIl1(Point point, Point point2, Point point3, Point point4, int i) {
        int i2;
        Point point5 = point;
        Point point6 = point2;
        Point point7 = point3;
        Point point8 = point4;
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        int i3 = point7.x;
        int i4 = point5.x;
        float f = (float) ((i3 - i4) / i2);
        int i5 = point7.y;
        int i6 = point5.y;
        float f2 = (float) ((i5 - i6) / i2);
        int i7 = point8.x;
        int i8 = point6.x;
        float f3 = (float) ((i7 - i8) / i2);
        int i9 = point8.y;
        int i10 = point6.y;
        float f4 = (float) ((i9 - i10) / i2);
        int i11 = i2 + 2;
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i11];
        MotionEvent.PointerCoords[] pointerCoordsArr2 = new MotionEvent.PointerCoords[i11];
        int i12 = 0;
        while (true) {
            int i13 = i2 + 1;
            if (i12 < i13) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                float f5 = (float) i4;
                pointerCoords.x = f5;
                float f6 = (float) i6;
                pointerCoords.y = f6;
                pointerCoords.pressure = 1.0f;
                pointerCoords.size = 1.0f;
                pointerCoordsArr[i12] = pointerCoords;
                MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords();
                float f7 = (float) i8;
                pointerCoords2.x = f7;
                float f8 = (float) i10;
                pointerCoords2.y = f8;
                pointerCoords2.pressure = 1.0f;
                pointerCoords2.size = 1.0f;
                pointerCoordsArr2[i12] = pointerCoords2;
                i4 = (int) (f5 + f);
                i6 = (int) (f6 + f2);
                i8 = (int) (f7 + f3);
                i10 = (int) (f8 + f4);
                i12++;
            } else {
                MotionEvent.PointerCoords pointerCoords3 = new MotionEvent.PointerCoords();
                pointerCoords3.x = (float) point7.x;
                pointerCoords3.y = (float) point7.y;
                pointerCoords3.pressure = 1.0f;
                pointerCoords3.size = 1.0f;
                pointerCoordsArr[i13] = pointerCoords3;
                MotionEvent.PointerCoords pointerCoords4 = new MotionEvent.PointerCoords();
                pointerCoords4.x = (float) point8.x;
                pointerCoords4.y = (float) point8.y;
                pointerCoords4.pressure = 1.0f;
                pointerCoords4.size = 1.0f;
                pointerCoordsArr2[i13] = pointerCoords4;
                return IIlLill(pointerCoordsArr, pointerCoordsArr2);
            }
        }
    }

    public boolean illi1LIILLiL(String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(str);
        iiI1L1iI();
        return i111iLiiIIill().ILl1iII11Ll1(str);
    }

    public boolean illiiliIILI(int i, int i2) throws C0472o0Ooo0o0 {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        float f = ((float) i) / 100.0f;
        AccessibilityNodeInfo iilLiIIIi11i = iilLiIIIi11i(this.i1LIL11l.iilLil1i11I1());
        if (iilLiIIIi11i != null) {
            Rect i11liIIl11Ii1 = i11liIIl11Ii1(iilLiIIIi11i);
            if (i11liIIl11Ii1.width() > 40) {
                return iliilLllIl1(new Point(i11liIIl11Ii1.centerX() - ((int) (((float) (i11liIIl11Ii1.width() / 2)) * f)), i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() + ((int) (((float) (i11liIIl11Ii1.width() / 2)) * f)), i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() - 20, i11liIIl11Ii1.centerY()), new Point(i11liIIl11Ii1.centerX() + 20, i11liIIl11Ii1.centerY()), i2);
            }
            throw new IllegalStateException("Object width is too small for operation");
        }
        throw new C0472o0Ooo0o0(iiLIIiIli().toString());
    }

    public boolean illlI1lLIL() throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return il1LilLllii(iilLil1i11I1);
    }
}
