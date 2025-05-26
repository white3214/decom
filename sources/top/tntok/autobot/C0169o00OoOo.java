package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;

/* renamed from: top.tntok.autobot.o00OoOo  reason: case insensitive filesystem */
public class C0169o00OoOo {

    /* renamed from: top.tntok.autobot.o00OoOo$i1LIL11l */
    public static final class i1LIL11l {
        public static final C0348o0OO0oo0 iiI1L1iI = i1LIL11l(iiI1L1iI.iiI1L1iI("getRuntimeMXBean"));

        public static final C0348o0OO0oo0 i1LIL11l(Object obj) {
            if (obj != null) {
                return new C0323o0O0oOOO(obj);
            }
            return new oo000o();
        }
    }

    /* renamed from: top.tntok.autobot.o00OoOo$iiI1L1iI */
    public static final class iiI1L1iI {
        public static final Class<?> iiI1L1iI;

        static {
            Class<?> cls;
            try {
                cls = I1LLLIIll.iiI1L1iI("java.lang.management.ManagementFactory");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            iiI1L1iI = cls;
        }

        public static Object iiI1L1iI(String str) {
            Class<?> cls = iiI1L1iI;
            if (cls != null) {
                try {
                    return cls.getMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: top.tntok.autobot.o00OoOo$illlI1lLIL */
    public static final class illlI1lLIL {
        public static final C0439o0OoO0oo iiI1L1iI = i1LIL11l(iiI1L1iI.iiI1L1iI("getThreadMXBean"));

        public static final C0439o0OoO0oo i1LIL11l(Object obj) {
            if (obj != null) {
                return new C0325o0O0oOo0(obj);
            }
            return new C0226o00oO0o();
        }
    }

    public static C0439o0OoO0oo i1LIL11l() {
        return illlI1lLIL.iiI1L1iI;
    }

    public static C0348o0OO0oo0 iiI1L1iI() {
        return i1LIL11l.iiI1L1iI;
    }
}
