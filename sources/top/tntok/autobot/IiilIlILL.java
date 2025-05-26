package top.tntok.autobot;

import java.util.ArrayList;

public class IiilIlILL<T> extends C0450o0OoOo<T> {
    public final C0175o00Ooo00<? super T> il1LilLllii;

    public static final class i1LIL11l<X> {
        public final C0175o00Ooo00<? super X> iiI1L1iI;

        public i1LIL11l(C0175o00Ooo00<? super X> o00ooo00) {
            this.iiI1L1iI = o00ooo00;
        }

        public IiilIlILL<X> iiI1L1iI(C0175o00Ooo00<? super X> o00ooo00) {
            return new IiilIlILL(this.iiI1L1iI).IiIIlIL(o00ooo00);
        }
    }

    public static final class iiI1L1iI<X> {
        public final C0175o00Ooo00<? super X> iiI1L1iI;

        public iiI1L1iI(C0175o00Ooo00<? super X> o00ooo00) {
            this.iiI1L1iI = o00ooo00;
        }

        public IiilIlILL<X> iiI1L1iI(C0175o00Ooo00<? super X> o00ooo00) {
            return new IiilIlILL(this.iiI1L1iI).iilLil1i11I1(o00ooo00);
        }
    }

    public IiilIlILL(C0175o00Ooo00<? super T> o00ooo00) {
        this.il1LilLllii = o00ooo00;
    }

    public static <LHS> iiI1L1iI<LHS> I11lLL1(C0175o00Ooo00<? super LHS> o00ooo00) {
        return new iiI1L1iI<>(o00ooo00);
    }

    public static <LHS> i1LIL11l<LHS> iLLLILIiLi1Ii(C0175o00Ooo00<? super LHS> o00ooo00) {
        return new i1LIL11l<>(o00ooo00);
    }

    public IiilIlILL<T> IiIIlIL(C0175o00Ooo00<? super T> o00ooo00) {
        return new IiilIlILL<>(new IIllllLiIlIl(iilLiIIIi11i(o00ooo00)));
    }

    public boolean iiIliillii(T t, OooO0o oooO0o) {
        if (this.il1LilLllii.i1LIL11l(t)) {
            return true;
        }
        this.il1LilLllii.il1LilLllii(t, oooO0o);
        return false;
    }

    public final ArrayList<C0175o00Ooo00<? super T>> iilLiIIIi11i(C0175o00Ooo00<? super T> o00ooo00) {
        ArrayList<C0175o00Ooo00<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.il1LilLllii);
        arrayList.add(o00ooo00);
        return arrayList;
    }

    public IiilIlILL<T> iilLil1i11I1(C0175o00Ooo00<? super T> o00ooo00) {
        return new IiilIlILL<>(new i1iI1iiLL1(iilLiIIIi11i(o00ooo00)));
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.i1LIL11l(this.il1LilLllii);
    }
}
