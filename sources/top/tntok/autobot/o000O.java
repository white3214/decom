package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class o000O extends o000OO00<o000O> {
    public final Field iiI1L1iI;

    public o000O(Field field) {
        if (field != null) {
            this.iiI1L1iI = field;
            if (IiIIlIL()) {
                try {
                    field.setAccessible(true);
                } catch (SecurityException unused) {
                }
            }
        } else {
            throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
        }
    }

    public Field I1iIiIi() {
        return this.iiI1L1iI;
    }

    /* renamed from: i1L1lLllLLlIi */
    public boolean iilLiIIIi11i(o000O o000o) {
        return o000o.iiIliillii().equals(iiIliillii());
    }

    public Annotation[] i1LIL11l() {
        return this.iiI1L1iI.getAnnotations();
    }

    public Object iILiI1lll(Object obj) throws IllegalArgumentException, IllegalAccessException {
        return this.iiI1L1iI.get(obj);
    }

    public boolean iLLLILIiLi1Ii() {
        return false;
    }

    public <T extends Annotation> T iiI1L1iI(Class<T> cls) {
        return this.iiI1L1iI.getAnnotation(cls);
    }

    public String iiIliillii() {
        return I1iIiIi().getName();
    }

    public Class<?> iilLil1i11I1() {
        return this.iiI1L1iI.getType();
    }

    public int il1LilLllii() {
        return this.iiI1L1iI.getModifiers();
    }

    public Class<?> illlI1lLIL() {
        return this.iiI1L1iI.getDeclaringClass();
    }

    public String toString() {
        return this.iiI1L1iI.toString();
    }
}
