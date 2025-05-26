package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.runners.Suite;
import top.tntok.autobot.C0009OooO0oO;
import top.tntok.autobot.C0136o00O0oo;
import top.tntok.autobot.C0402o0OOoooO;
import top.tntok.autobot.C0529o0oOOo;
import top.tntok.autobot.o000O0O;

public class Categories extends Suite {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ExcludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface IncludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    public Categories(Class<?> cls, C0402o0OOoooO o0oooooo) throws C0136o00O0oo {
        super(cls, o0oooooo);
        try {
            iiIliillii(iiI1L1iI.I11lLL1(ILiLII1ILi(cls), IiiIlLl1il1i(cls), i1LiiIlIL1I(cls), IIllllLiIlIl(cls)));
        } catch (C0529o0oOOo e) {
            throw new C0136o00O0oo((Throwable) e);
        }
    }

    public static Set<Class<?>> IIi1l1i(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return Collections.emptySet();
        }
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException("has null category");
            }
        }
        if (clsArr.length == 1) {
            return Collections.singleton(clsArr[0]);
        }
        return new LinkedHashSet(Arrays.asList(clsArr));
    }

    public static Set<Class<?>> IIllllLiIlIl(Class<?> cls) {
        Class[] clsArr;
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        if (excludeCategory == null) {
            clsArr = null;
        } else {
            clsArr = excludeCategory.value();
        }
        return IIi1l1i(clsArr);
    }

    public static boolean ILiLII1ILi(Class<?> cls) {
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        if (includeCategory == null || includeCategory.matchAny()) {
            return true;
        }
        return false;
    }

    public static Set<Class<?>> IiiIlLl1il1i(Class<?> cls) {
        Class[] clsArr;
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        if (includeCategory == null) {
            clsArr = null;
        } else {
            clsArr = includeCategory.value();
        }
        return IIi1l1i(clsArr);
    }

    public static Set<Class<?>> Il1llillili(Class<?> cls) {
        if (cls == null) {
            return Collections.emptySet();
        }
        return Collections.singleton(cls);
    }

    public static boolean i1LiiIlIL1I(Class<?> cls) {
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        if (excludeCategory == null || excludeCategory.matchAny()) {
            return true;
        }
        return false;
    }

    public static boolean iLlIllll(Set<Class<?>> set, Class<?> cls) {
        for (Class<?> isAssignableFrom : set) {
            if (cls.isAssignableFrom(isAssignableFrom)) {
                return true;
            }
        }
        return false;
    }

    public static class iiI1L1iI extends o000O0O {
        public final Set<Class<?>> i1LIL11l;
        public final boolean iiIliillii;
        public final boolean il1LilLllii;
        public final Set<Class<?>> illlI1lLIL;

        @Deprecated
        public iiI1L1iI(Class<?> cls, Class<?> cls2) {
            this.il1LilLllii = true;
            this.iiIliillii = true;
            this.i1LIL11l = Categories.Il1llillili(cls);
            this.illlI1lLIL = Categories.Il1llillili(cls2);
        }

        public static iiI1L1iI I11lLL1(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new iiI1L1iI(z, set, z2, set2);
        }

        public static iiI1L1iI IL1lILLLL1L(boolean z, Class<?>... clsArr) {
            return new iiI1L1iI(z, clsArr, true, (Class<?>[]) null);
        }

        public static Class<?>[] IiIIlIL(C0009OooO0oO oooO0oO) {
            if (oooO0oO == null) {
                return new Class[0];
            }
            Category category = (Category) oooO0oO.iILiI1lll(Category.class);
            if (category == null) {
                return new Class[0];
            }
            return category.value();
        }

        public static iiI1L1iI IiiL1llIIi(boolean z, Class<?>... clsArr) {
            return new iiI1L1iI(true, (Class<?>[]) null, z, clsArr);
        }

        public static C0009OooO0oO IilL11ii1I1Il(C0009OooO0oO oooO0oO) {
            Class<?> Ii1liIIIiLi = oooO0oO.Ii1liIIIiLi();
            if (Ii1liIIIiLi == null) {
                return null;
            }
            return C0009OooO0oO.illlI1lLIL(Ii1liIIIiLi);
        }

        public static iiI1L1iI i1L1lLllLLlIi(Class<?> cls) {
            return IL1lILLLL1L(true, cls);
        }

        public static iiI1L1iI iILiI1lll(Class<?>... clsArr) {
            return IiiL1llIIi(true, clsArr);
        }

        public static iiI1L1iI iL1LIlIlI(Class<?>... clsArr) {
            return IL1lILLLL1L(true, clsArr);
        }

        public static Set<Class<?>> iLLLILIiLi1Ii(Set<Class<?>> set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                linkedHashSet.addAll(set);
            }
            linkedHashSet.remove((Object) null);
            return linkedHashSet;
        }

        public static iiI1L1iI iilLiIIIi11i(Class<?> cls) {
            return IiiL1llIIi(true, cls);
        }

        public static Set<Class<?>> iilLil1i11I1(C0009OooO0oO oooO0oO) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, IiIIlIL(oooO0oO));
            Collections.addAll(hashSet, IiIIlIL(IilL11ii1I1Il(oooO0oO)));
            return hashSet;
        }

        public final boolean I1iIiIi(C0009OooO0oO oooO0oO) {
            Set<Class<?>> iilLil1i11I1 = iilLil1i11I1(oooO0oO);
            if (iilLil1i11I1.isEmpty()) {
                return this.i1LIL11l.isEmpty();
            }
            if (!this.illlI1lLIL.isEmpty()) {
                if (this.iiIliillii) {
                    if (Ii1liIIIiLi(iilLil1i11I1, this.illlI1lLIL)) {
                        return false;
                    }
                } else if (i111iLiiIIill(iilLil1i11I1, this.illlI1lLIL)) {
                    return false;
                }
            }
            if (this.i1LIL11l.isEmpty()) {
                return true;
            }
            if (this.il1LilLllii) {
                return Ii1liIIIiLi(iilLil1i11I1, this.i1LIL11l);
            }
            return i111iLiiIIill(iilLil1i11I1, this.i1LIL11l);
        }

        public final boolean Ii1liIIIiLi(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> illi1LIILLiL : set2) {
                if (Categories.iLlIllll(set, illi1LIILLiL)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i111iLiiIIill(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> illi1LIILLiL : set2) {
                if (!Categories.iLlIllll(set, illi1LIILLiL)) {
                    return false;
                }
            }
            return true;
        }

        public String i1LIL11l() {
            return toString();
        }

        public boolean iiIliillii(C0009OooO0oO oooO0oO) {
            if (I1iIiIi(oooO0oO)) {
                return true;
            }
            Iterator<C0009OooO0oO> it = oooO0oO.i1L1lLllLLlIi().iterator();
            while (it.hasNext()) {
                if (iiIliillii(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("categories ");
            if (this.i1LIL11l.isEmpty()) {
                obj = "[all]";
            } else {
                obj = this.i1LIL11l;
            }
            sb.append(obj);
            if (!this.illlI1lLIL.isEmpty()) {
                sb.append(" - ");
                sb.append(this.illlI1lLIL);
            }
            return sb.toString();
        }

        public iiI1L1iI(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.il1LilLllii = z;
            this.iiIliillii = z2;
            this.i1LIL11l = iLLLILIiLi1Ii(set);
            this.illlI1lLIL = iLLLILIiLi1Ii(set2);
        }

        public iiI1L1iI(boolean z, Class<?>[] clsArr, boolean z2, Class<?>[] clsArr2) {
            this.il1LilLllii = z;
            this.iiIliillii = z2;
            this.i1LIL11l = Categories.IIi1l1i(clsArr);
            this.illlI1lLIL = Categories.IIi1l1i(clsArr2);
        }
    }
}
