package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Deprecated
/* renamed from: top.tntok.autobot.o0Oo0Oo  reason: case insensitive filesystem */
public class C0417o0Oo0Oo {
    public final Class<?> iiI1L1iI;

    public C0417o0Oo0Oo(Class<?> cls) {
        this.iiI1L1iI = cls;
    }

    public final List<Class<?>> I11lLL1(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            arrayList.add(cls2);
        }
        return arrayList;
    }

    public final boolean IiIIlIL(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < method2.getParameterTypes().length; i++) {
            if (!method2.getParameterTypes()[i].equals(method.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    public final boolean IiiL1llIIi(Class<? extends Annotation> cls) {
        if (cls.equals(Before.class) || cls.equals(BeforeClass.class)) {
            return true;
        }
        return false;
    }

    public List<Method> i1LIL11l(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> iiI1L1iI2 : I11lLL1(this.iiI1L1iI)) {
            for (Method method : C0188o00o0000.iiI1L1iI(iiI1L1iI2)) {
                if (method.getAnnotation(cls) != null && !iilLiIIIi11i(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (IiiL1llIIi(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public List<Method> iLLLILIiLi1Ii() {
        return i1LIL11l(Test.class);
    }

    public List<Method> iiI1L1iI() {
        return i1LIL11l(AfterClass.class);
    }

    public Class<?> iiIliillii() {
        return this.iiI1L1iI;
    }

    public final boolean iilLiIIIi11i(Method method, List<Method> list) {
        for (Method IiIIlIL : list) {
            if (IiIIlIL(method, IiIIlIL)) {
                return true;
            }
        }
        return false;
    }

    public String iilLil1i11I1() {
        return this.iiI1L1iI.getName();
    }

    public Constructor<?> il1LilLllii() throws SecurityException, NoSuchMethodException {
        return this.iiI1L1iI.getConstructor((Class[]) null);
    }

    public List<Method> illlI1lLIL() {
        return i1LIL11l(BeforeClass.class);
    }
}
