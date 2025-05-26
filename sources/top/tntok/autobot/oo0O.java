package top.tntok.autobot;

import java.util.ArrayList;

public class oo0O<T> extends C0450o0OoOo<Iterable<? super T>> {
    public final C0175o00Ooo00<? super T> il1LilLllii;

    public oo0O(C0175o00Ooo00<? super T> o00ooo00) {
        this.il1LilLllii = o00ooo00;
    }

    public static <T> C0175o00Ooo00<Iterable<? super T>> I11lLL1(C0175o00Ooo00<? super T> o00ooo00) {
        return new oo0O(o00ooo00);
    }

    @SafeVarargs
    public static <T> C0175o00Ooo00<Iterable<T>> IiIIlIL(C0175o00Ooo00<? super T>... o00ooo00Arr) {
        ArrayList arrayList = new ArrayList(o00ooo00Arr.length);
        for (C0175o00Ooo00<? super T> oo0o : o00ooo00Arr) {
            arrayList.add(new oo0O(oo0o));
        }
        return i1iI1iiLL1.iilLil1i11I1(arrayList);
    }

    @SafeVarargs
    public static <T> C0175o00Ooo00<Iterable<T>> iLLLILIiLi1Ii(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T iilLil1i11I1 : tArr) {
            arrayList.add(iilLil1i11I1(iilLil1i11I1));
        }
        return i1iI1iiLL1.iilLil1i11I1(arrayList);
    }

    public static <T> C0175o00Ooo00<Iterable<? super T>> iilLil1i11I1(T t) {
        return new oo0O(o00OO.IiIIlIL(t));
    }

    /* renamed from: IiiL1llIIi */
    public boolean iiIliillii(Iterable<? super T> iterable, OooO0o oooO0o) {
        if (iilLiIIIi11i(iterable)) {
            oooO0o.iiIliillii("was empty");
            return false;
        }
        for (Object i1LIL11l : iterable) {
            if (this.il1LilLllii.i1LIL11l(i1LIL11l)) {
                return true;
            }
        }
        oooO0o.iiIliillii("mismatches were: [");
        boolean z = false;
        for (Object next : iterable) {
            if (z) {
                oooO0o.iiIliillii(", ");
            }
            this.il1LilLllii.il1LilLllii(next, oooO0o);
            z = true;
        }
        oooO0o.iiIliillii("]");
        return false;
    }

    public final boolean iilLiIIIi11i(Iterable<? super T> iterable) {
        return !iterable.iterator().hasNext();
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("a collection containing ").i1LIL11l(this.il1LilLllii);
    }
}
