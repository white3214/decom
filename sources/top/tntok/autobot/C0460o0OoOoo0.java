package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OoOoo0  reason: case insensitive filesystem */
public abstract class C0460o0OoOoo0<T> extends IlLLlIi1iI1li<T> {
    public static final C0547oo0oOOo illlI1lLIL = new C0547oo0oOOo("matchesSafely", 1, 0);
    public final Class<?> i1LIL11l;

    public C0460o0OoOoo0() {
        this(illlI1lLIL);
    }

    public final boolean i1LIL11l(Object obj) {
        if (obj == null || !this.i1LIL11l.isInstance(obj) || !iilLil1i11I1(obj)) {
            return false;
        }
        return true;
    }

    public void iiIliillii(T t, OooO0o oooO0o) {
        super.il1LilLllii(t, oooO0o);
    }

    public abstract boolean iilLil1i11I1(T t);

    public final void il1LilLllii(Object obj, OooO0o oooO0o) {
        if (obj == null) {
            super.il1LilLllii((Object) null, oooO0o);
        } else if (!this.i1LIL11l.isInstance(obj)) {
            oooO0o.iiIliillii("was a ").iiIliillii(obj.getClass().getName()).iiIliillii(" (").iiI1L1iI(obj).iiIliillii(")");
        } else {
            iiIliillii(obj, oooO0o);
        }
    }

    public C0460o0OoOoo0(Class<?> cls) {
        this.i1LIL11l = cls;
    }

    public C0460o0OoOoo0(C0547oo0oOOo oo0oooo) {
        this.i1LIL11l = oo0oooo.illlI1lLIL(getClass());
    }
}
