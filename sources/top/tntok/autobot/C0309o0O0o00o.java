package top.tntok.autobot;

import android.app.UiAutomation;
import android.os.SystemClock;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: top.tntok.autobot.o0O0o00o  reason: case insensitive filesystem */
public class C0309o0O0o00o {
    public static final String IiIIlIL = "o0O0o00o";
    public static final boolean IiiL1llIIi;
    public static final boolean iilLiIIIi11i;
    public int I11lLL1 = 0;
    public final Object i1LIL11l = new Object();
    public String iLLLILIiLi1Ii = "";
    public final C0467o0Ooo00o iiI1L1iI;
    public int iiIliillii = 0;
    public int iilLil1i11I1 = 0;
    public int il1LilLllii = 0;
    public String illlI1lLIL = null;

    /* renamed from: top.tntok.autobot.o0O0o00o$iiI1L1iI */
    public class iiI1L1iI implements UiAutomation.OnAccessibilityEventListener {
        public iiI1L1iI() {
        }

        public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            synchronized (C0309o0O0o00o.this.i1LIL11l) {
                try {
                    int eventType = accessibilityEvent.getEventType();
                    if (eventType != 32) {
                        if (eventType == 131072) {
                            if (!(accessibilityEvent.getText() == null || accessibilityEvent.getText().size() <= 0 || accessibilityEvent.getText().get(0) == null)) {
                                String unused = C0309o0O0o00o.this.iLLLILIiLi1Ii = accessibilityEvent.getText().get(0).toString();
                            }
                            if (C0309o0O0o00o.iilLiIIIi11i) {
                                String unused2 = C0309o0O0o00o.IiIIlIL;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Last text selection reported: ");
                                sb.append(C0309o0O0o00o.this.iLLLILIiLi1Ii);
                            }
                        }
                    } else if (!(accessibilityEvent.getText() == null || accessibilityEvent.getText().size() <= 0 || accessibilityEvent.getText().get(0) == null)) {
                        String unused3 = C0309o0O0o00o.this.illlI1lLIL = accessibilityEvent.getText().get(0).toString();
                    }
                    C0309o0O0o00o.this.i1LIL11l.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        String simpleName = C0309o0O0o00o.class.getSimpleName();
        iilLiIIIi11i = Log.isLoggable(simpleName, 3);
        IiiL1llIIi = Log.isLoggable(simpleName, 2);
    }

    public C0309o0O0o00o(C0467o0Ooo00o o0ooo00o) {
        this.iiI1L1iI = o0ooo00o;
        o0ooo00o.iILiI1lll(new iiI1L1iI());
    }

    public void I11lLL1() {
        this.iiI1L1iI.IL1lILLLL1L();
        synchronized (this.i1LIL11l) {
            this.iLLLILIiLi1Ii = "";
        }
    }

    public AccessibilityNodeInfo I1iIiIi() {
        return this.iiI1L1iI.iiIliillii();
    }

    public final AccessibilityNodeInfo I1l1iIll1lIi1(C0473o0Ooo0oO o0ooo0oo, AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        AccessibilityNodeInfo accessibilityNodeInfo2;
        if (!o0ooo0oo.il1l1IlL()) {
            accessibilityNodeInfo2 = ILl1iII11Ll1(o0ooo0oo, accessibilityNodeInfo);
        } else if (o0ooo0oo.ILl1iII11Ll1().il1l1IlL()) {
            accessibilityNodeInfo2 = I1l1iIll1lIi1(o0ooo0oo.ILl1iII11Ll1(), accessibilityNodeInfo, false);
            IilL11ii1I1Il();
        } else {
            accessibilityNodeInfo2 = ILl1iII11Ll1(o0ooo0oo.ILl1iII11Ll1(), accessibilityNodeInfo);
        }
        if (accessibilityNodeInfo2 == null) {
            if (iilLiIIIi11i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Container selector not found: ");
                sb.append(o0ooo0oo.IL1lILLLL1L(false));
            }
            return null;
        }
        if (o0ooo0oo.IilliIIIlI1ll()) {
            accessibilityNodeInfo2 = iiLIIiIli(o0ooo0oo.i1iI1iiLL1(), accessibilityNodeInfo2, z);
            if (z) {
                String.format("Counted %d instances of: %s", new Object[]{Integer.valueOf(this.il1LilLllii), o0ooo0oo});
                return null;
            } else if (accessibilityNodeInfo2 == null) {
                if (iilLiIIIi11i) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Pattern selector not found: ");
                    sb2.append(o0ooo0oo.IL1lILLLL1L(false));
                }
                return null;
            }
        }
        if ((o0ooo0oo.il1l1IlL() || o0ooo0oo.IilliIIIlI1ll()) && (o0ooo0oo.IL111l1() || o0ooo0oo.I1IIIi1i1ILl())) {
            accessibilityNodeInfo2 = ILl1iII11Ll1(o0ooo0oo, accessibilityNodeInfo2);
        }
        if (accessibilityNodeInfo2 == null) {
            if (iilLiIIIi11i) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Object Not Found for selector ");
                sb3.append(o0ooo0oo);
            }
            return null;
        }
        String.format("Matched selector: %s <<==>> [%s]", new Object[]{o0ooo0oo, accessibilityNodeInfo2});
        return accessibilityNodeInfo2;
    }

    public String IL1lILLLL1L() {
        this.iiI1L1iI.IL1lILLLL1L();
        AccessibilityNodeInfo Ii1liIIIiLi = Ii1liIIIiLi();
        if (Ii1liIIIiLi == null || Ii1liIIIiLi.getPackageName() == null) {
            return null;
        }
        return Ii1liIIIiLi.getPackageName().toString();
    }

    public final AccessibilityNodeInfo ILl1iII11Ll1(C0473o0Ooo0oO o0ooo0oo, AccessibilityNodeInfo accessibilityNodeInfo) {
        return IiiL1llIIi(o0ooo0oo, accessibilityNodeInfo, 0);
    }

    public AccessibilityNodeInfo Ii1liIIIiLi() {
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        for (int i = 0; i < 4; i++) {
            accessibilityNodeInfo = this.iiI1L1iI.iiIliillii();
            if (accessibilityNodeInfo != null) {
                return accessibilityNodeInfo;
            }
            if (i < 3) {
                SystemClock.sleep(250);
            }
        }
        return accessibilityNodeInfo;
    }

    public AccessibilityNodeInfo IiIIlIL(C0473o0Ooo0oO o0ooo0oo, boolean z) {
        this.iiI1L1iI.IL1lILLLL1L();
        IilL11ii1I1Il();
        if (iilLiIIIi11i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Searching: ");
            sb.append(o0ooo0oo);
        }
        synchronized (this.i1LIL11l) {
            try {
                AccessibilityNodeInfo Ii1liIIIiLi = Ii1liIIIiLi();
                if (Ii1liIIIiLi == null) {
                    return null;
                }
                AccessibilityNodeInfo I1l1iIll1lIi1 = I1l1iIll1lIi1(new C0473o0Ooo0oO(o0ooo0oo), Ii1liIIIiLi, z);
                return I1l1iIll1lIi1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AccessibilityNodeInfo IiiL1llIIi(C0473o0Ooo0oO o0ooo0oo, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        if (o0ooo0oo.IIlLill(accessibilityNodeInfo, i)) {
            if (iilLiIIIi11i) {
                iILiI1lll(String.format("%s", new Object[]{o0ooo0oo.IL1lILLLL1L(false)}));
            }
            if (o0ooo0oo.IILiIL1i11Li()) {
                return accessibilityNodeInfo;
            }
            if (o0ooo0oo.IL111l1()) {
                this.iilLil1i11I1++;
                o0ooo0oo = o0ooo0oo.iiLIIiIli();
                if (o0ooo0oo == null) {
                    return null;
                }
            } else if (o0ooo0oo.I1IIIi1i1ILl()) {
                this.iilLil1i11I1++;
                o0ooo0oo = o0ooo0oo.IliiLiLliIl();
                if (o0ooo0oo == null || (accessibilityNodeInfo = accessibilityNodeInfo.getParent()) == null) {
                    return null;
                }
            }
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
            if (child == null) {
                String.format("AccessibilityNodeInfo returned a null child (%d of %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(childCount)});
                if (!z) {
                    String.format("parent = %s", new Object[]{accessibilityNodeInfo.toString()});
                }
                z = true;
            } else if (child.isVisibleToUser()) {
                AccessibilityNodeInfo IiiL1llIIi2 = IiiL1llIIi(o0ooo0oo, child, i2);
                if (IiiL1llIIi2 != null) {
                    return IiiL1llIIi2;
                }
            } else if (IiiL1llIIi) {
                String.format("Skipping invisible child: %s", new Object[]{child.toString()});
            }
        }
        return null;
    }

    public final void IilL11ii1I1Il() {
        this.il1LilLllii = 0;
        this.iiIliillii = 0;
        this.iilLil1i11I1 = 0;
        this.I11lLL1 = 0;
    }

    public int i111iLiiIIill(C0473o0Ooo0oO o0ooo0oo) {
        IiIIlIL(o0ooo0oo, true);
        return this.il1LilLllii;
    }

    @Deprecated
    public String i1L1lLllLLlIi() {
        String str;
        this.iiI1L1iI.IL1lILLLL1L();
        synchronized (this.i1LIL11l) {
            str = this.illlI1lLIL;
        }
        return str;
    }

    public final String iILiI1lll(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.iilLil1i11I1;
            if (i2 >= i) {
                break;
            }
            sb.append(". . ");
            i2++;
        }
        if (i > 0) {
            sb.append(String.format(". . [%d]: %s", new Object[]{Integer.valueOf(this.il1LilLllii), str}));
        } else {
            sb.append(String.format(". . [%d]: %s", new Object[]{Integer.valueOf(this.il1LilLllii), str}));
        }
        return sb.toString();
    }

    public String iL1LIlIlI() {
        this.iiI1L1iI.IL1lILLLL1L();
        synchronized (this.i1LIL11l) {
            try {
                if (this.iLLLILIiLi1Ii.length() <= 0) {
                    return null;
                }
                String str = this.iLLLILIiLi1Ii;
                return str;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AccessibilityNodeInfo iLLLILIiLi1Ii(C0473o0Ooo0oO o0ooo0oo) {
        return IiIIlIL(o0ooo0oo, false);
    }

    public final AccessibilityNodeInfo iiLIIiIli(C0473o0Ooo0oO o0ooo0oo, AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        if (!o0ooo0oo.IilliIIIlI1ll()) {
            return null;
        }
        if (z) {
            this.iiIliillii = -1;
        } else {
            this.iiIliillii = o0ooo0oo.i1iiLIil1ILi();
        }
        C0473o0Ooo0oO i1iI1iiLL1 = o0ooo0oo.i1iI1iiLL1();
        if (i1iI1iiLL1 == null) {
            return null;
        }
        int i = this.iilLil1i11I1 + 1;
        this.iilLil1i11I1 = i;
        this.I11lLL1 = i;
        return iilLiIIIi11i(i1iI1iiLL1, accessibilityNodeInfo, 0, i1iI1iiLL1);
    }

    public final AccessibilityNodeInfo iilLiIIIi11i(C0473o0Ooo0oO o0ooo0oo, AccessibilityNodeInfo accessibilityNodeInfo, int i, C0473o0Ooo0oO o0ooo0oo2) {
        if (o0ooo0oo.IIlLill(accessibilityNodeInfo, i)) {
            if (!o0ooo0oo.IILiIL1i11Li()) {
                if (iilLiIIIi11i) {
                    iILiI1lll(String.format("%s", new Object[]{o0ooo0oo.IL1lILLLL1L(false)}));
                }
                if (o0ooo0oo.IL111l1()) {
                    this.iilLil1i11I1++;
                    o0ooo0oo = o0ooo0oo.iiLIIiIli();
                    if (o0ooo0oo == null) {
                        return null;
                    }
                } else if (o0ooo0oo.I1IIIi1i1ILl()) {
                    this.iilLil1i11I1++;
                    o0ooo0oo = o0ooo0oo.IliiLiLliIl();
                    if (o0ooo0oo == null || (accessibilityNodeInfo = accessibilityNodeInfo.getParent()) == null) {
                        return null;
                    }
                }
            } else if (this.iiIliillii == 0) {
                if (iilLiIIIi11i) {
                    iILiI1lll(String.format("%s", new Object[]{o0ooo0oo.IL1lILLLL1L(false)}));
                }
                return accessibilityNodeInfo;
            } else {
                if (iilLiIIIi11i) {
                    iILiI1lll(String.format("%s", new Object[]{o0ooo0oo.IL1lILLLL1L(false)}));
                }
                this.il1LilLllii++;
                this.iiIliillii--;
                this.iilLil1i11I1 = this.I11lLL1;
                o0ooo0oo = o0ooo0oo2;
            }
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
            if (child == null) {
                String.format("AccessibilityNodeInfo returned a null child (%d of %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(childCount)});
                if (!z) {
                    String.format("parent = %s", new Object[]{accessibilityNodeInfo.toString()});
                }
                z = true;
            } else if (child.isVisibleToUser()) {
                AccessibilityNodeInfo iilLiIIIi11i2 = iilLiIIIi11i(o0ooo0oo, child, i2, o0ooo0oo2);
                if (iilLiIIIi11i2 != null) {
                    return iilLiIIIi11i2;
                }
            } else if (iilLiIIIi11i) {
                String.format("Skipping invisible child: %s", new Object[]{child.toString()});
            }
        }
        return null;
    }
}
