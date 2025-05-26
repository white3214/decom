package top.tntok.autobot;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: top.tntok.autobot.o0OoOoO0  reason: case insensitive filesystem */
public abstract class C0456o0OoOoO0<T> extends IlLLlIi1iI1li<T> {
    public Class<?> i1LIL11l;

    public C0456o0OoOoO0() {
        this.i1LIL11l = iiIliillii(getClass());
    }

    public static Class<?> iiIliillii(Class<?> cls) {
        while (true) {
            Class<? super Object> cls2 = cls;
            if (cls2 != Object.class) {
                for (Method method : C0188o00o0000.iiI1L1iI(cls2)) {
                    if (iilLil1i11I1(method)) {
                        return method.getParameterTypes()[0];
                    }
                }
                cls2 = cls2.getSuperclass();
            } else {
                throw new Error("Cannot determine correct type for matchesSafely() method.");
            }
        }
    }

    public static boolean iilLil1i11I1(Method method) {
        if (!"matchesSafely".equals(method.getName()) || method.getParameterTypes().length != 1 || method.isSynthetic()) {
            return false;
        }
        return true;
    }

    public abstract boolean I11lLL1(T t);

    public final boolean i1LIL11l(Object obj) {
        if (obj == null || !this.i1LIL11l.isInstance(obj) || !I11lLL1(obj)) {
            return false;
        }
        return true;
    }

    public C0456o0OoOoO0(Class<T> cls) {
        this.i1LIL11l = cls;
    }
}
