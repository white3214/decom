package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOOOoo  reason: case insensitive filesystem */
public abstract class C0359o0OOOOoo<T> extends IlLLlIi1iI1li<T> {
    public final Iterable<C0175o00Ooo00<? super T>> i1LIL11l;

    public C0359o0OOOOoo(Iterable<C0175o00Ooo00<? super T>> iterable) {
        this.i1LIL11l = iterable;
    }

    public abstract boolean i1LIL11l(Object obj);

    public void iiIliillii(OooO0o oooO0o, String str) {
        oooO0o.illlI1lLIL("(", " " + str + " ", ")", this.i1LIL11l);
    }

    public boolean iilLil1i11I1(Object obj, boolean z) {
        for (C0175o00Ooo00<? super T> i1LIL11l2 : this.i1LIL11l) {
            if (i1LIL11l2.i1LIL11l(obj) == z) {
                return z;
            }
        }
        return !z;
    }

    public abstract void illlI1lLIL(OooO0o oooO0o);
}
