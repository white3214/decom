package top.tntok.autobot;

import top.tntok.autobot.OooO0o;

/* renamed from: top.tntok.autobot.o0OoOo  reason: case insensitive filesystem */
public abstract class C0450o0OoOo<T> extends IlLLlIi1iI1li<T> {
    public static final C0547oo0oOOo illlI1lLIL = new C0547oo0oOOo("matchesSafely", 2, 0);
    public final Class<?> i1LIL11l;

    public C0450o0OoOo(Class<?> cls) {
        this.i1LIL11l = cls;
    }

    public final boolean i1LIL11l(Object obj) {
        if (obj == null || !this.i1LIL11l.isInstance(obj) || !iiIliillii(obj, new OooO0o.iiI1L1iI())) {
            return false;
        }
        return true;
    }

    public abstract boolean iiIliillii(T t, OooO0o oooO0o);

    public final void il1LilLllii(Object obj, OooO0o oooO0o) {
        if (obj == null || !this.i1LIL11l.isInstance(obj)) {
            super.il1LilLllii(obj, oooO0o);
        } else {
            iiIliillii(obj, oooO0o);
        }
    }

    public C0450o0OoOo(C0547oo0oOOo oo0oooo) {
        this.i1LIL11l = oo0oooo.illlI1lLIL(getClass());
    }

    public C0450o0OoOo() {
        this(illlI1lLIL);
    }
}
