package top.tntok.autobot;

import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.oo0oOOo  reason: case insensitive filesystem */
public class C0547oo0oOOo {
    public final int i1LIL11l;
    public final String iiI1L1iI;
    public final int illlI1lLIL;

    public C0547oo0oOOo(String str, int i, int i2) {
        this.iiI1L1iI = str;
        this.i1LIL11l = i;
        this.illlI1lLIL = i2;
    }

    public Class<?> i1LIL11l(Method method) {
        return method.getParameterTypes()[this.illlI1lLIL];
    }

    public boolean iiI1L1iI(Method method) {
        if (!method.getName().equals(this.iiI1L1iI) || method.getParameterTypes().length != this.i1LIL11l || method.isSynthetic()) {
            return false;
        }
        return true;
    }

    public Class<?> illlI1lLIL(Class<?> cls) {
        while (true) {
            Class<? super Object> cls2 = cls;
            if (cls2 != Object.class) {
                for (Method method : cls2.getDeclaredMethods()) {
                    if (iiI1L1iI(method)) {
                        return i1LIL11l(method);
                    }
                }
                cls2 = cls2.getSuperclass();
            } else {
                throw new Error("Cannot determine correct type for " + this.iiI1L1iI + "() method.");
            }
        }
    }
}
