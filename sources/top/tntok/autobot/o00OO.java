package top.tntok.autobot;

import java.lang.reflect.Array;

public class o00OO<T> extends IlLLlIi1iI1li<T> {
    public final Object i1LIL11l;

    public o00OO(T t) {
        this.i1LIL11l = t;
    }

    public static boolean I11lLL1(Object obj, Object obj2) {
        if (!iilLil1i11I1(obj, obj2) || !iiIliillii(obj, obj2)) {
            return false;
        }
        return true;
    }

    public static <T> C0175o00Ooo00<T> IiIIlIL(T t) {
        return new o00OO(t);
    }

    public static boolean IiiL1llIIi(Object obj) {
        return obj.getClass().isArray();
    }

    public static boolean iLLLILIiLi1Ii(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj2 == null || !IiiL1llIIi(obj)) {
            return obj.equals(obj2);
        } else {
            if (!IiiL1llIIi(obj2) || !I11lLL1(obj, obj2)) {
                return false;
            }
            return true;
        }
    }

    public static boolean iiIliillii(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!iLLLILIiLi1Ii(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    public static C0175o00Ooo00<Object> iilLiIIIi11i(Object obj) {
        return new o00OO(obj);
    }

    public static boolean iilLil1i11I1(Object obj, Object obj2) {
        if (Array.getLength(obj) == Array.getLength(obj2)) {
            return true;
        }
        return false;
    }

    public boolean i1LIL11l(Object obj) {
        return iLLLILIiLi1Ii(obj, this.i1LIL11l);
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiI1L1iI(this.i1LIL11l);
    }
}
