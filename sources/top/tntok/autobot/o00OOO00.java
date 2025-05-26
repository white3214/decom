package top.tntok.autobot;

public class o00OOO00 extends C0015OooOOoo<Object> {
    public final Class<?> i1LIL11l;
    public final Class<?> illlI1lLIL;

    public o00OOO00(Class<?> cls) {
        this.i1LIL11l = cls;
        this.illlI1lLIL = iLLLILIiLi1Ii(cls);
    }

    public static <T> C0175o00Ooo00<T> I11lLL1(Class<?> cls) {
        return new o00OOO00(cls);
    }

    public static Class<?> iLLLILIiLi1Ii(Class<?> cls) {
        if (Boolean.TYPE.equals(cls)) {
            return Boolean.class;
        }
        if (Byte.TYPE.equals(cls)) {
            return Byte.class;
        }
        if (Character.TYPE.equals(cls)) {
            return Character.class;
        }
        if (Double.TYPE.equals(cls)) {
            return Double.class;
        }
        if (Float.TYPE.equals(cls)) {
            return Float.class;
        }
        if (Integer.TYPE.equals(cls)) {
            return Integer.class;
        }
        if (Long.TYPE.equals(cls)) {
            return Long.class;
        }
        if (Short.TYPE.equals(cls)) {
            return Short.class;
        }
        return cls;
    }

    public static <T> C0175o00Ooo00<T> iilLil1i11I1(Class<T> cls) {
        return new o00OOO00(cls);
    }

    public boolean iiIliillii(Object obj, OooO0o oooO0o) {
        if (obj == null) {
            oooO0o.iiIliillii("null");
            return false;
        } else if (this.illlI1lLIL.isInstance(obj)) {
            return true;
        } else {
            OooO0o iiI1L1iI = oooO0o.iiI1L1iI(obj);
            iiI1L1iI.iiIliillii(" is a " + obj.getClass().getName());
            return false;
        }
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("an instance of ").iiIliillii(this.i1LIL11l.getName());
    }
}
