package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0O0oOOO  reason: case insensitive filesystem */
public final class C0323o0O0oOOO implements C0348o0OO0oo0 {
    public final Object iiI1L1iI;

    /* renamed from: top.tntok.autobot.o0O0oOOO$iiI1L1iI */
    public static final class iiI1L1iI {
        public static final Method iiI1L1iI;

        static {
            Method method = null;
            try {
                method = I1LLLIIll.iiI1L1iI("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", (Class[]) null);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
            }
            iiI1L1iI = method;
        }
    }

    public C0323o0O0oOOO(Object obj) {
        this.iiI1L1iI = obj;
    }

    public List<String> iiI1L1iI() {
        if (iiI1L1iI.iiI1L1iI != null) {
            try {
                return (List) iiI1L1iI.iiI1L1iI.invoke(this.iiI1L1iI, (Object[]) null);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.emptyList();
    }
}
