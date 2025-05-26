package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: top.tntok.autobot.o00ooOo  reason: case insensitive filesystem */
public class C0265o00ooOo {
    public static final Map<Class<?>, Class<?>> illlI1lLIL = iiI1L1iI();
    public final Annotation[] i1LIL11l;
    public final Class<?> iiI1L1iI;

    public C0265o00ooOo(Class<?> cls, Annotation[] annotationArr) {
        this.iiI1L1iI = cls;
        this.i1LIL11l = annotationArr;
    }

    public static ArrayList<C0265o00ooOo> I1iIiIi(Method method) {
        return i1L1lLllLLlIi(method.getParameterTypes(), method.getParameterAnnotations());
    }

    public static List<C0265o00ooOo> IL1lILLLL1L(Constructor<?> constructor) {
        return i1L1lLllLLlIi(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    public static ArrayList<C0265o00ooOo> i1L1lLllLLlIi(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<C0265o00ooOo> arrayList = new ArrayList<>();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new C0265o00ooOo(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }

    public static <T> void iILiI1lll(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    public static Map<Class<?>, Class<?>> iiI1L1iI() {
        HashMap hashMap = new HashMap();
        iILiI1lll(hashMap, Boolean.TYPE, Boolean.class);
        iILiI1lll(hashMap, Byte.TYPE, Byte.class);
        iILiI1lll(hashMap, Short.TYPE, Short.class);
        iILiI1lll(hashMap, Character.TYPE, Character.class);
        iILiI1lll(hashMap, Integer.TYPE, Integer.class);
        iILiI1lll(hashMap, Long.TYPE, Long.class);
        iILiI1lll(hashMap, Float.TYPE, Float.class);
        iILiI1lll(hashMap, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(hashMap);
    }

    public <T extends Annotation> T I11lLL1(Class<T> cls) {
        for (Annotation next : iLLLILIiLi1Ii()) {
            if (cls.isInstance(next)) {
                return (Annotation) cls.cast(next);
            }
        }
        return null;
    }

    public Class<?> IiIIlIL() {
        return this.iiI1L1iI;
    }

    public final boolean IiiL1llIIi(Class<?> cls, Class<?> cls2) {
        Map<Class<?>, Class<?>> map = illlI1lLIL;
        if (map.containsKey(cls2)) {
            return cls.isAssignableFrom(map.get(cls2));
        }
        return false;
    }

    public boolean i1LIL11l(Class<?> cls) {
        if (this.iiI1L1iI.isAssignableFrom(cls) || IiiL1llIIi(this.iiI1L1iI, cls)) {
            return true;
        }
        return false;
    }

    public List<Annotation> iLLLILIiLi1Ii() {
        return Arrays.asList(this.i1LIL11l);
    }

    public <T extends Annotation> T iiIliillii(Class<T> cls) {
        return iilLil1i11I1(this.i1LIL11l, cls, 3);
    }

    public boolean iilLiIIIi11i(Class<? extends Annotation> cls) {
        if (I11lLL1(cls) != null) {
            return true;
        }
        return false;
    }

    public final <T extends Annotation> T iilLil1i11I1(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return (Annotation) cls.cast(annotation);
            }
            T iilLil1i11I1 = iilLil1i11I1(annotation.annotationType().getAnnotations(), cls, i - 1);
            if (iilLil1i11I1 != null) {
                return (Annotation) cls.cast(iilLil1i11I1);
            }
        }
        return null;
    }

    public boolean il1LilLllii(Class<?> cls) {
        if (cls.isAssignableFrom(this.iiI1L1iI) || IiiL1llIIi(cls, this.iiI1L1iI) || i1LIL11l(cls)) {
            return true;
        }
        return false;
    }

    public boolean illlI1lLIL(Object obj) {
        if (obj != null) {
            return i1LIL11l(obj.getClass());
        }
        if (!this.iiI1L1iI.isPrimitive()) {
            return true;
        }
        return false;
    }
}
