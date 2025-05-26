package top.tntok.autobot;

import java.util.Arrays;

public class i1iI1iiLL1<T> extends C0015OooOOoo<T> {
    public final Iterable<C0175o00Ooo00<? super T>> i1LIL11l;

    public i1iI1iiLL1(Iterable<C0175o00Ooo00<? super T>> iterable) {
        this.i1LIL11l = iterable;
    }

    @SafeVarargs
    public static <T> C0175o00Ooo00<T> I11lLL1(C0175o00Ooo00<? super T>... o00ooo00Arr) {
        return iilLil1i11I1(Arrays.asList(o00ooo00Arr));
    }

    public static <T> C0175o00Ooo00<T> iilLil1i11I1(Iterable<C0175o00Ooo00<? super T>> iterable) {
        return new i1iI1iiLL1(iterable);
    }

    public boolean iiIliillii(Object obj, OooO0o oooO0o) {
        for (C0175o00Ooo00 next : this.i1LIL11l) {
            if (!next.i1LIL11l(obj)) {
                oooO0o.i1LIL11l(next).iiIliillii(" ");
                next.il1LilLllii(obj, oooO0o);
                return false;
            }
        }
        return true;
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.illlI1lLIL("(", " and ", ")", this.i1LIL11l);
    }
}
