package top.tntok.autobot;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Iil1LL1IlIIli {
    public static final Object iiI1L1iI = I11lLL1("end of array");

    public class iiI1L1iI {
        public final /* synthetic */ String iiI1L1iI;

        public iiI1L1iI(String str) {
            this.iiI1L1iI = str;
        }

        public String toString() {
            return this.iiI1L1iI;
        }
    }

    public static Object I11lLL1(String str) {
        return new iiI1L1iI(str);
    }

    public final void i1LIL11l(String str, Object obj, Object obj2, boolean z) throws i1LiiIlIL1I {
        String str2;
        if (obj != obj2) {
            if (!Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
                String str3 = "";
                if (str == null) {
                    str2 = str3;
                } else {
                    str2 = str + ": ";
                }
                if (z) {
                    str3 = str2;
                }
                if (obj == null) {
                    Il1llillili.ILiliIiI(str3 + "expected array was null");
                }
                if (obj2 == null) {
                    Il1llillili.ILiliIiI(str3 + "actual array was null");
                }
                int length = Array.getLength(obj2);
                int length2 = Array.getLength(obj);
                if (length != length2) {
                    str2 = str2 + "array lengths differed, expected.length=" + length2 + " actual.length=" + length + "; ";
                }
                int min = Math.min(length, length2);
                for (int i = 0; i < min; i++) {
                    Object obj3 = Array.get(obj, i);
                    Object obj4 = Array.get(obj2, i);
                    if (!iilLil1i11I1(obj3) || !iilLil1i11I1(obj4)) {
                        try {
                            illlI1lLIL(obj3, obj4);
                        } catch (AssertionError e) {
                            throw new i1LiiIlIL1I(str2, e, i);
                        }
                    } else {
                        try {
                            i1LIL11l(str, obj3, obj4, false);
                        } catch (i1LiiIlIL1I e2) {
                            e2.iiI1L1iI(i);
                            throw e2;
                        } catch (AssertionError e3) {
                            throw new i1LiiIlIL1I(str2, e3, i);
                        }
                    }
                }
                if (length != length2) {
                    try {
                        Il1llillili.i1iiLIil1ILi(iiIliillii(obj, length2, min), iiIliillii(obj2, length, min));
                    } catch (AssertionError e4) {
                        throw new i1LiiIlIL1I(str2, e4, min);
                    }
                }
            }
        }
    }

    public void iiI1L1iI(String str, Object obj, Object obj2) throws i1LiiIlIL1I {
        i1LIL11l(str, obj, obj2, true);
    }

    public final Object iiIliillii(Object obj, int i, int i2) {
        if (i2 >= i) {
            return iiI1L1iI;
        }
        Object obj2 = Array.get(obj, i2);
        if (!iilLil1i11I1(obj2)) {
            return obj2;
        }
        return I11lLL1(il1LilLllii(obj2.getClass()) + "[" + Array.getLength(obj2) + "]");
    }

    public final boolean iilLil1i11I1(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return false;
        }
        return true;
    }

    public final String il1LilLllii(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (!componentType.isArray()) {
            return componentType.getName();
        }
        return il1LilLllii(componentType) + C0109o000oo00.i1L1lLllLLlIi;
    }

    public abstract void illlI1lLIL(Object obj, Object obj2);
}
