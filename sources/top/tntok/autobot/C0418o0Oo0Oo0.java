package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.BeforeClass;

/* renamed from: top.tntok.autobot.o0Oo0Oo0  reason: case insensitive filesystem */
public class C0418o0Oo0Oo0 implements illiiliIILI {
    public static final il1LilLllii iiIliillii = new il1LilLllii((iiI1L1iI) null);
    public static final illlI1lLIL il1LilLllii = new illlI1lLIL((iiI1L1iI) null);
    public final Map<Class<? extends Annotation>, List<C0436o0OoO0o>> i1LIL11l;
    public final Class<?> iiI1L1iI;
    public final Map<Class<? extends Annotation>, List<o000O>> illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0Oo0Oo0$i1LIL11l */
    public class i1LIL11l implements C0178o00OooO<T> {
        public final /* synthetic */ List iiI1L1iI;

        public i1LIL11l(List list) {
            this.iiI1L1iI = list;
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, T t) {
            this.iiI1L1iI.add(t);
        }
    }

    /* renamed from: top.tntok.autobot.o0Oo0Oo0$iiI1L1iI */
    public class iiI1L1iI implements C0178o00OooO<T> {
        public final /* synthetic */ List iiI1L1iI;

        public iiI1L1iI(List list) {
            this.iiI1L1iI = list;
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, T t) {
            this.iiI1L1iI.add(t);
        }
    }

    /* renamed from: top.tntok.autobot.o0Oo0Oo0$il1LilLllii */
    public static class il1LilLllii implements Comparator<C0436o0OoO0o> {
        public il1LilLllii() {
        }

        /* renamed from: iiI1L1iI */
        public int compare(C0436o0OoO0o o0ooo0o, C0436o0OoO0o o0ooo0o2) {
            return C0188o00o0000.i1LIL11l.compare(o0ooo0o.I1iIiIi(), o0ooo0o2.I1iIiIi());
        }

        public /* synthetic */ il1LilLllii(iiI1L1iI iii1l1ii) {
            this();
        }
    }

    /* renamed from: top.tntok.autobot.o0Oo0Oo0$illlI1lLIL */
    public static class illlI1lLIL implements Comparator<Field> {
        public illlI1lLIL() {
        }

        /* renamed from: iiI1L1iI */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }

        public /* synthetic */ illlI1lLIL(iiI1L1iI iii1l1ii) {
            this();
        }
    }

    public C0418o0Oo0Oo0(Class<?> cls) {
        this.iiI1L1iI = cls;
        if (cls == null || cls.getConstructors().length <= 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            i1iiLIil1ILi(linkedHashMap, linkedHashMap2);
            this.i1LIL11l = iiLIIiIli(linkedHashMap);
            this.illlI1lLIL = iiLIIiIli(linkedHashMap2);
            return;
        }
        throw new IllegalArgumentException("Test class can only have one constructor");
    }

    public static boolean ILl1iII11Ll1(Class<? extends Annotation> cls) {
        if (cls.equals(Before.class) || cls.equals(BeforeClass.class)) {
            return true;
        }
        return false;
    }

    public static List<Class<?>> Ii1liIIIiLi(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            arrayList.add(cls2);
        }
        return arrayList;
    }

    public static Field[] i111iLiiIIill(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, il1LilLllii);
        return declaredFields;
    }

    public static <T extends o000OO00<T>> Map<Class<? extends Annotation>, List<T>> iiLIIiIli(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put((Class) next.getKey(), Collections.unmodifiableList((List) next.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static <T> List<T> iilLiIIIi11i(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static <T extends o000OO00<T>> void illlI1lLIL(T t, Map<Class<? extends Annotation>, List<T>> map) {
        Annotation[] i1LIL11l2 = t.i1LIL11l();
        int length = i1LIL11l2.length;
        int i = 0;
        while (i < length) {
            Class<? extends Annotation> annotationType = i1LIL11l2[i].annotationType();
            List<? extends Annotation> iilLiIIIi11i = iilLiIIIi11i(map, annotationType, true);
            o000OO00 I11lLL1 = t.I11lLL1(iilLiIIIi11i);
            if (I11lLL1 != null) {
                if (ILl1iII11Ll1(annotationType)) {
                    iilLiIIIi11i.add(0, I11lLL1);
                } else {
                    iilLiIIIi11i.add(I11lLL1);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public <T> List<T> I11lLL1(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        il1LilLllii(obj, cls, cls2, new iiI1L1iI(arrayList));
        return arrayList;
    }

    public List<C0436o0OoO0o> I1iIiIi(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(iilLiIIIi11i(this.i1LIL11l, cls, false));
    }

    public boolean I1l1iIll1lIi1() {
        return Modifier.isPublic(this.iiI1L1iI.getModifiers());
    }

    public String IL1lILLLL1L() {
        Class<?> cls = this.iiI1L1iI;
        if (cls == null) {
            return "null";
        }
        return cls.getName();
    }

    public List<o000O> IiIIlIL(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(iilLiIIIi11i(this.illlI1lLIL, cls, false));
    }

    public <T> List<T> IiiL1llIIi(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        iiIliillii(obj, cls, cls2, new i1LIL11l(arrayList));
        return arrayList;
    }

    public boolean IilL11ii1I1Il() {
        if (!this.iiI1L1iI.isMemberClass() || Modifier.isStatic(this.iiI1L1iI.getModifiers())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.iiI1L1iI == ((C0418o0Oo0Oo0) obj).iiI1L1iI) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Class<?> cls = this.iiI1L1iI;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public Class<?> i1L1lLllLLlIi() {
        return this.iiI1L1iI;
    }

    public Annotation[] i1LIL11l() {
        Class<?> cls = this.iiI1L1iI;
        if (cls == null) {
            return new Annotation[0];
        }
        return cls.getAnnotations();
    }

    public void i1iiLIil1ILi(Map<Class<? extends Annotation>, List<C0436o0OoO0o>> map, Map<Class<? extends Annotation>, List<o000O>> map2) {
        for (Class next : Ii1liIIIiLi(this.iiI1L1iI)) {
            for (Method o0ooo0o : C0188o00o0000.iiI1L1iI(next)) {
                illlI1lLIL(new C0436o0OoO0o(o0ooo0o), map);
            }
            for (Field o000o : i111iLiiIIill(next)) {
                illlI1lLIL(new o000O(o000o), map2);
            }
        }
    }

    public List<C0436o0OoO0o> iILiI1lll() {
        List<C0436o0OoO0o> iilLil1i11I1 = iilLil1i11I1(this.i1LIL11l);
        Collections.sort(iilLil1i11I1, iiIliillii);
        return iilLil1i11I1;
    }

    public Constructor<?> iL1LIlIlI() {
        Constructor<?>[] constructors = this.iiI1L1iI.getConstructors();
        Il1llillili.ILl1iII11Ll1(1, (long) constructors.length);
        return constructors[0];
    }

    public List<o000O> iLLLILIiLi1Ii() {
        return iilLil1i11I1(this.illlI1lLIL);
    }

    public <T extends Annotation> T iiI1L1iI(Class<T> cls) {
        Class<?> cls2 = this.iiI1L1iI;
        if (cls2 == null) {
            return null;
        }
        return cls2.getAnnotation(cls);
    }

    public <T> void iiIliillii(Object obj, Class<? extends Annotation> cls, Class<T> cls2, C0178o00OooO<T> o00oooo) {
        for (C0436o0OoO0o next : I1iIiIi(cls)) {
            try {
                if (cls2.isAssignableFrom(next.IL1lILLLL1L())) {
                    o00oooo.iiI1L1iI(next, cls2.cast(next.iL1LIlIlI(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + next.iiIliillii(), th);
            }
        }
    }

    public final <T> List<T> iilLil1i11I1(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List<T> addAll : map.values()) {
            linkedHashSet.addAll(addAll);
        }
        return new ArrayList(linkedHashSet);
    }

    public <T> void il1LilLllii(Object obj, Class<? extends Annotation> cls, Class<T> cls2, C0178o00OooO<T> o00oooo) {
        for (o000O next : IiIIlIL(cls)) {
            try {
                Object iILiI1lll = next.iILiI1lll(obj);
                if (cls2.isInstance(iILiI1lll)) {
                    o00oooo.iiI1L1iI(next, cls2.cast(iILiI1lll));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
    }
}
