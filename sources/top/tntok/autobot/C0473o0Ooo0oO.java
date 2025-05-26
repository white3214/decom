package top.tntok.autobot;

import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: top.tntok.autobot.o0Ooo0oO  reason: case insensitive filesystem */
public class C0473o0Ooo0oO {
    public static final int I11lLL1 = 5;
    public static final int I1I11Il1 = 25;
    public static final int I1IIIi1i1ILl = 30;
    public static final int I1iIiIi = 11;
    public static final int I1l1iIll1lIi1 = 18;
    public static final int IIlL1llI1 = 27;
    public static final int IL111l1 = 28;
    public static final int IL1lILLLL1L = 13;
    public static final int ILl1iII11Ll1 = 20;
    public static final int Ii1liIIIiLi = 16;
    public static final int IiIIlIL = 7;
    public static final int IiiL1llIIi = 9;
    public static final int IilL11ii1I1Il = 17;
    public static final int IilliIIIlI1ll = 31;
    public static final int IliiLiLliIl = 24;
    public static final int i111iLiiIIill = 15;
    public static final int i11liIIl11Ii1 = 22;
    public static final int i1L1lLllLLlIi = 12;
    public static final int i1LIL11l = 0;
    public static final int i1iI1iiLL1 = 26;
    public static final int i1iiLIil1ILi = 21;
    public static final int iILiI1lll = 10;
    public static final int iL1LIlIlI = 14;
    public static final int iLLLILIiLi1Ii = 6;
    public static final int iiIliillii = 3;
    public static final int iiLIIiIli = 19;
    public static final int iiiiI1iILL11I = 23;
    public static final int iilLiIIIi11i = 8;
    public static final int iilLil1i11I1 = 4;
    public static final int il1LilLllii = 2;
    public static final int il1l1IlL = 29;
    public static final int illlI1lLIL = 1;
    public SparseArray<Object> iiI1L1iI = new SparseArray<>();

    public C0473o0Ooo0oO() {
    }

    public static C0473o0Ooo0oO IIi1l1i(C0473o0Ooo0oO o0ooo0oo, C0473o0Ooo0oO o0ooo0oo2) {
        return new C0473o0Ooo0oO(new C0473o0Ooo0oO().iilLiIIIi11i(o0ooo0oo).IIllllLiIlIl(o0ooo0oo2));
    }

    public static C0473o0Ooo0oO illi1LIILLiL(C0473o0Ooo0oO o0ooo0oo) {
        if (!o0ooo0oo.IilliIIIlI1ll()) {
            return new C0473o0Ooo0oO().IIllllLiIlIl(o0ooo0oo);
        }
        return o0ooo0oo;
    }

    public C0473o0Ooo0oO I11lLL1(String str) {
        return iiI1L1iI(26, Pattern.compile(str));
    }

    public Pattern I1I11Il1(int i) {
        return (Pattern) this.iiI1L1iI.get(i, (Object) null);
    }

    public boolean I1IIIi1i1ILl() {
        if (this.iiI1L1iI.indexOfKey(22) < 0) {
            return false;
        }
        return true;
    }

    public C0473o0Ooo0oO I1iIiIi(String str) {
        return iiI1L1iI(27, Pattern.compile(str));
    }

    public boolean I1l1iIll1lIi1(int i) {
        return ((Boolean) this.iiI1L1iI.get(i, Boolean.FALSE)).booleanValue();
    }

    public C0473o0Ooo0oO IIIlll1lll(int i) {
        return iiI1L1iI(8, Integer.valueOf(i));
    }

    public boolean IILiIL1i11Li() {
        if (this.iiI1L1iI.indexOfKey(19) >= 0 || this.iiI1L1iI.indexOfKey(22) >= 0) {
            return false;
        }
        return true;
    }

    public String IIlL1llI1(int i) {
        return (String) this.iiI1L1iI.get(i, (Object) null);
    }

    public boolean IIlLill(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        int size = this.iiI1L1iI.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = this.iiI1L1iI.keyAt(i2);
            switch (keyAt) {
                case 1:
                    CharSequence text = accessibilityNodeInfo.getText();
                    if (text != null && text.toString().contentEquals(IIlL1llI1(keyAt))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    CharSequence text2 = accessibilityNodeInfo.getText();
                    if (text2 != null && text2.toString().toLowerCase().startsWith(IIlL1llI1(keyAt).toLowerCase())) {
                        break;
                    } else {
                        return false;
                    }
                case 3:
                    CharSequence text3 = accessibilityNodeInfo.getText();
                    if (text3 != null && text3.toString().toLowerCase().contains(IIlL1llI1(keyAt).toLowerCase())) {
                        break;
                    } else {
                        return false;
                    }
                case 4:
                    CharSequence className = accessibilityNodeInfo.getClassName();
                    if (className != null && className.toString().contentEquals(IIlL1llI1(keyAt))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 5:
                    CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription != null && contentDescription.toString().contentEquals(IIlL1llI1(keyAt))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 6:
                    CharSequence contentDescription2 = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription2 != null && contentDescription2.toString().toLowerCase().startsWith(IIlL1llI1(keyAt).toLowerCase())) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 7:
                    CharSequence contentDescription3 = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription3 != null && contentDescription3.toString().toLowerCase().contains(IIlL1llI1(keyAt).toLowerCase())) {
                        break;
                    } else {
                        return false;
                    }
                case 8:
                    if (i == i11liIIl11Ii1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 10:
                    if (accessibilityNodeInfo.isEnabled() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 11:
                    if (accessibilityNodeInfo.isFocused() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 12:
                    if (accessibilityNodeInfo.isFocusable() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 13:
                    if (accessibilityNodeInfo.isScrollable() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 14:
                    if (accessibilityNodeInfo.isClickable() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 15:
                    if (accessibilityNodeInfo.isChecked() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 16:
                    if (accessibilityNodeInfo.isSelected() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case I1l1iIll1lIi1 /*18*/:
                    CharSequence packageName = accessibilityNodeInfo.getPackageName();
                    if (packageName != null && packageName.toString().contentEquals(IIlL1llI1(keyAt))) {
                        break;
                    } else {
                        return false;
                    }
                case 24:
                    if (accessibilityNodeInfo.isLongClickable() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 25:
                    CharSequence text4 = accessibilityNodeInfo.getText();
                    if (text4 != null && I1I11Il1(keyAt).matcher(text4).matches()) {
                        break;
                    } else {
                        return false;
                    }
                case 26:
                    CharSequence className2 = accessibilityNodeInfo.getClassName();
                    if (className2 != null && I1I11Il1(keyAt).matcher(className2).matches()) {
                        break;
                    } else {
                        return false;
                    }
                case 27:
                    CharSequence contentDescription4 = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription4 != null && I1I11Il1(keyAt).matcher(contentDescription4).matches()) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 28:
                    CharSequence packageName2 = accessibilityNodeInfo.getPackageName();
                    if (packageName2 != null && I1I11Il1(keyAt).matcher(packageName2).matches()) {
                        break;
                    } else {
                        return false;
                    }
                case 29:
                    String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
                    if (viewIdResourceName != null && viewIdResourceName.toString().contentEquals(IIlL1llI1(keyAt))) {
                        break;
                    } else {
                        return false;
                    }
                case 30:
                    if (accessibilityNodeInfo.isCheckable() == I1l1iIll1lIi1(keyAt)) {
                        break;
                    } else {
                        return false;
                    }
                case 31:
                    String viewIdResourceName2 = accessibilityNodeInfo.getViewIdResourceName();
                    if (viewIdResourceName2 != null && I1I11Il1(keyAt).matcher(viewIdResourceName2).matches()) {
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return illiiliIILI();
    }

    public final C0473o0Ooo0oO IIllllLiIlIl(C0473o0Ooo0oO o0ooo0oo) {
        return iiI1L1iI(21, o0ooo0oo);
    }

    public boolean IL111l1() {
        if (this.iiI1L1iI.indexOfKey(19) < 0) {
            return false;
        }
        return true;
    }

    public C0473o0Ooo0oO IL1IiilLlLI(int i) {
        return iiI1L1iI(9, Integer.valueOf(i));
    }

    public String IL1lILLLL1L(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0473o0Ooo0oO.class.getSimpleName() + "[");
        int size = this.iiI1L1iI.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int keyAt = this.iiI1L1iI.keyAt(i);
            switch (keyAt) {
                case 1:
                    sb.append("TEXT=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 2:
                    sb.append("START_TEXT=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 3:
                    sb.append("CONTAINS_TEXT=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 4:
                    sb.append("CLASS=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 5:
                    sb.append("DESCRIPTION=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 6:
                    sb.append("START_DESCRIPTION=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 7:
                    sb.append("CONTAINS_DESCRIPTION=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 8:
                    sb.append("INDEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 9:
                    sb.append("INSTANCE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 10:
                    sb.append("ENABLED=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 11:
                    sb.append("FOCUSED=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 12:
                    sb.append("FOCUSABLE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 13:
                    sb.append("SCROLLABLE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 14:
                    sb.append("CLICKABLE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 15:
                    sb.append("CHECKED=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 16:
                    sb.append("SELECTED=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 17:
                    sb.append("ID=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case I1l1iIll1lIi1 /*18*/:
                    sb.append("PACKAGE NAME=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 19:
                    if (!z) {
                        sb.append("CHILD[..]");
                        break;
                    } else {
                        sb.append("CHILD=");
                        sb.append(this.iiI1L1iI.valueAt(i));
                        break;
                    }
                case 20:
                    if (!z) {
                        sb.append("CONTAINER[..]");
                        break;
                    } else {
                        sb.append("CONTAINER=");
                        sb.append(this.iiI1L1iI.valueAt(i));
                        break;
                    }
                case 21:
                    if (!z) {
                        sb.append("PATTERN[..]");
                        break;
                    } else {
                        sb.append("PATTERN=");
                        sb.append(this.iiI1L1iI.valueAt(i));
                        break;
                    }
                case 22:
                    if (!z) {
                        sb.append("PARENT[..]");
                        break;
                    } else {
                        sb.append("PARENT=");
                        sb.append(this.iiI1L1iI.valueAt(i));
                        break;
                    }
                case 23:
                    sb.append("COUNT=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 24:
                    sb.append("LONG_CLICKABLE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 25:
                    sb.append("TEXT_REGEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 26:
                    sb.append("CLASS_REGEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 27:
                    sb.append("DESCRIPTION_REGEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 28:
                    sb.append("PACKAGE_NAME_REGEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 29:
                    sb.append("RESOURCE_ID=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 30:
                    sb.append("CHECKABLE=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                case 31:
                    sb.append("RESOURCE_ID_REGEX=");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
                default:
                    sb.append("UNDEFINED=" + keyAt + " ");
                    sb.append(this.iiI1L1iI.valueAt(i));
                    break;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public C0473o0Ooo0oO ILiLII1ILi(boolean z) {
        return iiI1L1iI(16, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO ILl1iII11Ll1() {
        C0473o0Ooo0oO o0ooo0oo = (C0473o0Ooo0oO) this.iiI1L1iI.get(20, (Object) null);
        if (o0ooo0oo != null) {
            return new C0473o0Ooo0oO(o0ooo0oo);
        }
        return null;
    }

    public C0473o0Ooo0oO ILllI11(String str) {
        return iiI1L1iI(18, str);
    }

    public C0473o0Ooo0oO Ii1liIIIiLi(boolean z) {
        return iiI1L1iI(11, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO IiIIlIL() {
        C0473o0Ooo0oO o0ooo0oo = new C0473o0Ooo0oO();
        o0ooo0oo.iiI1L1iI = this.iiI1L1iI.clone();
        if (IL111l1()) {
            o0ooo0oo.iiI1L1iI.put(19, new C0473o0Ooo0oO(iiLIIiIli()));
        }
        if (I1IIIi1i1ILl()) {
            o0ooo0oo.iiI1L1iI.put(22, new C0473o0Ooo0oO(IliiLiLliIl()));
        }
        if (IilliIIIlI1ll()) {
            o0ooo0oo.iiI1L1iI.put(21, new C0473o0Ooo0oO(i1iI1iiLL1()));
        }
        return o0ooo0oo;
    }

    public C0473o0Ooo0oO IiIl11II(String str) {
        return iiI1L1iI(3, str);
    }

    public C0473o0Ooo0oO IiiIlLl1il1i(String str) {
        return iiI1L1iI(29, str);
    }

    public C0473o0Ooo0oO IiiL1llIIi(String str) {
        return iiI1L1iI(5, str);
    }

    public C0473o0Ooo0oO Iiiiii1l1I1L1(String str) {
        return iiI1L1iI(2, str);
    }

    public C0473o0Ooo0oO IilL11ii1I1Il(C0473o0Ooo0oO o0ooo0oo) {
        return iiI1L1iI(22, o0ooo0oo);
    }

    public C0473o0Ooo0oO IillLillLLIii(String str) {
        return iiI1L1iI(25, Pattern.compile(str));
    }

    public boolean IilliIIIlI1ll() {
        if (this.iiI1L1iI.indexOfKey(21) < 0) {
            return false;
        }
        return true;
    }

    public C0473o0Ooo0oO Il1llillili(String str) {
        return iiI1L1iI(1, str);
    }

    public C0473o0Ooo0oO IliiLiLliIl() {
        C0473o0Ooo0oO o0ooo0oo = (C0473o0Ooo0oO) this.iiI1L1iI.get(22, (Object) null);
        if (o0ooo0oo != null) {
            return new C0473o0Ooo0oO(o0ooo0oo);
        }
        return null;
    }

    public C0473o0Ooo0oO i111iLiiIIill(boolean z) {
        return iiI1L1iI(12, Boolean.valueOf(z));
    }

    public int i11liIIl11Ii1(int i) {
        return ((Integer) this.iiI1L1iI.get(i, 0)).intValue();
    }

    public C0473o0Ooo0oO i1L1lLllLLlIi(String str) {
        return iiI1L1iI(6, str);
    }

    public C0473o0Ooo0oO i1LIL11l(boolean z) {
        return iiI1L1iI(30, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO i1LiiIlIL1I(boolean z) {
        return iiI1L1iI(13, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO i1iI1iiLL1() {
        C0473o0Ooo0oO o0ooo0oo = (C0473o0Ooo0oO) this.iiI1L1iI.get(21, (Object) null);
        if (o0ooo0oo != null) {
            return new C0473o0Ooo0oO(o0ooo0oo);
        }
        return null;
    }

    public C0473o0Ooo0oO i1iLlIill1I(String str) {
        return iiI1L1iI(28, Pattern.compile(str));
    }

    public int i1iiLIil1ILi() {
        return i11liIIl11Ii1(9);
    }

    public C0473o0Ooo0oO iILiI1lll(String str) {
        return iiI1L1iI(7, str);
    }

    public C0473o0Ooo0oO iL1LIlIlI(boolean z) {
        return iiI1L1iI(10, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO iLLLILIiLi1Ii(boolean z) {
        return iiI1L1iI(14, Boolean.valueOf(z));
    }

    public C0473o0Ooo0oO iLlIllll(String str) {
        return iiI1L1iI(31, Pattern.compile(str));
    }

    public final C0473o0Ooo0oO iiI1L1iI(int i, Object obj) {
        C0473o0Ooo0oO o0ooo0oo = new C0473o0Ooo0oO(this);
        if (i == 19 || i == 22) {
            o0ooo0oo.iiiiI1iILL11I().iiI1L1iI.put(i, obj);
        } else {
            o0ooo0oo.iiI1L1iI.put(i, obj);
        }
        return o0ooo0oo;
    }

    public <T> C0473o0Ooo0oO iiIliillii(Class<T> cls) {
        return iiI1L1iI(4, cls.getName());
    }

    public C0473o0Ooo0oO iiLIIiIli() {
        C0473o0Ooo0oO o0ooo0oo = (C0473o0Ooo0oO) this.iiI1L1iI.get(19, (Object) null);
        if (o0ooo0oo != null) {
            return new C0473o0Ooo0oO(o0ooo0oo);
        }
        return null;
    }

    public final C0473o0Ooo0oO iiiiI1iILL11I() {
        if (this.iiI1L1iI.indexOfKey(19) >= 0) {
            C0473o0Ooo0oO o0ooo0oo = (C0473o0Ooo0oO) this.iiI1L1iI.get(19);
            if (o0ooo0oo.iiiiI1iILL11I() == null) {
                return o0ooo0oo;
            }
            return o0ooo0oo.iiiiI1iILL11I();
        } else if (this.iiI1L1iI.indexOfKey(22) < 0) {
            return this;
        } else {
            C0473o0Ooo0oO o0ooo0oo2 = (C0473o0Ooo0oO) this.iiI1L1iI.get(22);
            if (o0ooo0oo2.iiiiI1iILL11I() == null) {
                return o0ooo0oo2;
            }
            return o0ooo0oo2.iiiiI1iILL11I();
        }
    }

    public final C0473o0Ooo0oO iilLiIIIi11i(C0473o0Ooo0oO o0ooo0oo) {
        return iiI1L1iI(20, o0ooo0oo);
    }

    public C0473o0Ooo0oO iilLil1i11I1(String str) {
        return iiI1L1iI(4, str);
    }

    public C0473o0Ooo0oO il1LilLllii(C0473o0Ooo0oO o0ooo0oo) {
        return iiI1L1iI(19, o0ooo0oo);
    }

    public boolean il1l1IlL() {
        if (this.iiI1L1iI.indexOfKey(20) < 0) {
            return false;
        }
        return true;
    }

    public C0473o0Ooo0oO iliilLllIl1(boolean z) {
        return iiI1L1iI(24, Boolean.valueOf(z));
    }

    public final boolean illiiliIILI() {
        int i;
        int i2;
        if (this.iiI1L1iI.indexOfKey(9) >= 0) {
            i = ((Integer) this.iiI1L1iI.get(9)).intValue();
        } else {
            i = 0;
        }
        if (this.iiI1L1iI.indexOfKey(23) >= 0) {
            i2 = ((Integer) this.iiI1L1iI.get(23)).intValue();
        } else {
            i2 = 0;
        }
        if (i == i2) {
            return true;
        }
        if (i > i2) {
            this.iiI1L1iI.put(23, Integer.valueOf(i2 + 1));
        }
        return false;
    }

    public C0473o0Ooo0oO illlI1lLIL(boolean z) {
        return iiI1L1iI(15, Boolean.valueOf(z));
    }

    public String toString() {
        return IL1lILLLL1L(true);
    }

    public C0473o0Ooo0oO(C0473o0Ooo0oO o0ooo0oo) {
        this.iiI1L1iI = o0ooo0oo.IiIIlIL().iiI1L1iI;
    }
}
