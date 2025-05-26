package top.tntok.autobot;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.FixMethodOrder;

/* renamed from: top.tntok.autobot.o00o0000  reason: case insensitive filesystem */
public class C0188o00o0000 {
    public static final Comparator<Method> i1LIL11l = new i1LIL11l();
    public static final Comparator<Method> iiI1L1iI = new iiI1L1iI();

    /* renamed from: top.tntok.autobot.o00o0000$i1LIL11l */
    public class i1LIL11l implements Comparator<Method> {
        /* renamed from: iiI1L1iI */
        public int compare(Method method, Method method2) {
            int compareTo = method.getName().compareTo(method2.getName());
            if (compareTo != 0) {
                return compareTo;
            }
            return method.toString().compareTo(method2.toString());
        }
    }

    /* renamed from: top.tntok.autobot.o00o0000$iiI1L1iI */
    public class iiI1L1iI implements Comparator<Method> {
        /* renamed from: iiI1L1iI */
        public int compare(Method method, Method method2) {
            int hashCode = method.getName().hashCode();
            int hashCode2 = method2.getName().hashCode();
            if (hashCode == hashCode2) {
                return C0188o00o0000.i1LIL11l.compare(method, method2);
            }
            if (hashCode < hashCode2) {
                return -1;
            }
            return 1;
        }
    }

    public static Comparator<Method> i1LIL11l(FixMethodOrder fixMethodOrder) {
        if (fixMethodOrder == null) {
            return iiI1L1iI;
        }
        return fixMethodOrder.value().iiI1L1iI();
    }

    public static Method[] iiI1L1iI(Class<?> cls) {
        Comparator<Method> i1LIL11l2 = i1LIL11l((FixMethodOrder) cls.getAnnotation(FixMethodOrder.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (i1LIL11l2 != null) {
            Arrays.sort(declaredMethods, i1LIL11l2);
        }
        return declaredMethods;
    }
}
