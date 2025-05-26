package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0O0oOo0  reason: case insensitive filesystem */
public final class C0325o0O0oOo0 implements C0439o0OoO0oo {
    public final Object iiI1L1iI;

    /* renamed from: top.tntok.autobot.o0O0oOo0$iiI1L1iI */
    public static final class iiI1L1iI {
        public static final Method i1LIL11l;
        public static final Method iiI1L1iI;
        public static final String illlI1lLIL = "Unable to access ThreadMXBean";

        static {
            Method method;
            Method method2 = null;
            try {
                Class<?> iiI1L1iI2 = I1LLLIIll.iiI1L1iI("java.lang.management.ThreadMXBean");
                method = iiI1L1iI2.getMethod("getThreadCpuTime", new Class[]{Long.TYPE});
                try {
                    method2 = iiI1L1iI2.getMethod("isThreadCpuTimeSupported", (Class[]) null);
                } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused2) {
                method = null;
            }
            iiI1L1iI = method;
            i1LIL11l = method2;
        }
    }

    public C0325o0O0oOo0(Object obj) {
        this.iiI1L1iI = obj;
    }

    public long i1LIL11l(long j) {
        Method method = iiI1L1iI.iiI1L1iI;
        if (method != null) {
            try {
                return ((Long) method.invoke(this.iiI1L1iI, new Object[]{Long.valueOf(j)})).longValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new UnsupportedOperationException(iiI1L1iI.illlI1lLIL, e);
            }
        } else {
            throw new UnsupportedOperationException(iiI1L1iI.illlI1lLIL);
        }
    }

    public boolean iiI1L1iI() {
        Method method = iiI1L1iI.i1LIL11l;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(this.iiI1L1iI, (Object[]) null)).booleanValue();
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            return false;
        }
    }
}
