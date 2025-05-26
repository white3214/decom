package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: top.tntok.autobot.o0OOoo0o  reason: case insensitive filesystem */
public class C0395o0OOoo0o extends o00OOO {
    public C0395o0OOoo0o(Class<?> cls) throws Throwable {
        super(I1iIiIi(cls));
    }

    public static C0532o0oOo0o0 I1iIiIi(Class<?> cls) throws Throwable {
        try {
            Method method = cls.getMethod(il11iII1.i1LIL11l, (Class[]) null);
            if (Modifier.isStatic(method.getModifiers())) {
                return (C0532o0oOo0o0) method.invoke((Object) null, (Object[]) null);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
