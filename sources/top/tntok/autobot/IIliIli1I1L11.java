package top.tntok.autobot;

public abstract class IIliIli1I1L11<T> {
    public static final illlI1lLIL<Object> iiI1L1iI = new illlI1lLIL<>();

    public static final class i1LIL11l<T> extends IIliIli1I1L11<T> {
        public final T i1LIL11l;
        public final OooO0o illlI1lLIL;

        public <U> IIliIli1I1L11<U> iiI1L1iI(il1LilLllii<? super T, U> il1lillllii) {
            return il1lillllii.iiI1L1iI(this.i1LIL11l, this.illlI1lLIL);
        }

        public boolean il1LilLllii(C0175o00Ooo00<T> o00ooo00, String str) {
            if (o00ooo00.i1LIL11l(this.i1LIL11l)) {
                return true;
            }
            this.illlI1lLIL.iiIliillii(str);
            o00ooo00.il1LilLllii(this.i1LIL11l, this.illlI1lLIL);
            return false;
        }

        public i1LIL11l(T t, OooO0o oooO0o) {
            super();
            this.i1LIL11l = t;
            this.illlI1lLIL = oooO0o;
        }
    }

    public interface il1LilLllii<I, O> {
        IIliIli1I1L11<O> iiI1L1iI(I i, OooO0o oooO0o);
    }

    public static final class illlI1lLIL<T> extends IIliIli1I1L11<T> {
        public illlI1lLIL() {
            super();
        }

        public <U> IIliIli1I1L11<U> iiI1L1iI(il1LilLllii<? super T, U> il1lillllii) {
            return IIliIli1I1L11.iiIliillii();
        }

        public boolean il1LilLllii(C0175o00Ooo00<T> o00ooo00, String str) {
            return false;
        }
    }

    public static <T> IIliIli1I1L11<T> i1LIL11l(T t, OooO0o oooO0o) {
        return new i1LIL11l(t, oooO0o);
    }

    public static <T> IIliIli1I1L11<T> iiIliillii() {
        return iiI1L1iI;
    }

    public abstract <U> IIliIli1I1L11<U> iiI1L1iI(il1LilLllii<? super T, U> il1lillllii);

    public final <U> IIliIli1I1L11<U> iilLil1i11I1(il1LilLllii<? super T, U> il1lillllii) {
        return iiI1L1iI(il1lillllii);
    }

    public abstract boolean il1LilLllii(C0175o00Ooo00<T> o00ooo00, String str);

    public final boolean illlI1lLIL(C0175o00Ooo00<T> o00ooo00) {
        return il1LilLllii(o00ooo00, "");
    }

    public IIliIli1I1L11() {
    }
}
