package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoo  reason: case insensitive filesystem */
public class C0392o0OOoo extends C0402o0OOoooO {
    public boolean IiIIlIL(Class<?> cls) {
        try {
            cls.getMethod(il11iII1.i1LIL11l, (Class[]) null);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public C0346o0OO0oOO il1LilLllii(Class<?> cls) throws Throwable {
        if (IiIIlIL(cls)) {
            return new C0395o0OOoo0o(cls);
        }
        return null;
    }
}
