package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OoO0o  reason: case insensitive filesystem */
public class C0436o0OoO0o extends o000OO00<C0436o0OoO0o> {
    public final Method iiI1L1iI;

    /* renamed from: top.tntok.autobot.o0OoO0o$iiI1L1iI */
    public class iiI1L1iI extends o0O0oo00 {
        public final /* synthetic */ Object[] i1LIL11l;
        public final /* synthetic */ Object iiI1L1iI;

        public iiI1L1iI(Object obj, Object[] objArr) {
            this.iiI1L1iI = obj;
            this.i1LIL11l = objArr;
        }

        public Object i1LIL11l() throws Throwable {
            return C0436o0OoO0o.this.iiI1L1iI.invoke(this.iiI1L1iI, this.i1LIL11l);
        }
    }

    public C0436o0OoO0o(Method method) {
        if (method != null) {
            this.iiI1L1iI = method;
            if (IiIIlIL()) {
                try {
                    method.setAccessible(true);
                } catch (SecurityException unused) {
                }
            }
        } else {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
    }

    public Method I1iIiIi() {
        return this.iiI1L1iI;
    }

    public void I1l1iIll1lIi1(boolean z, List<Throwable> list) {
        String str;
        if (IiiL1llIIi() != z) {
            if (z) {
                str = "should";
            } else {
                str = "should not";
            }
            list.add(new Exception("Method " + this.iiI1L1iI.getName() + "() " + str + " be static"));
        }
        if (!IiIIlIL()) {
            list.add(new Exception("Method " + this.iiI1L1iI.getName() + "() should be public"));
        }
        if (this.iiI1L1iI.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.iiI1L1iI.getName() + "() should be void"));
        }
    }

    public Class<?> IL1lILLLL1L() {
        return this.iiI1L1iI.getReturnType();
    }

    @Deprecated
    public boolean Ii1liIIIiLi(Type type) {
        if (i1L1lLllLLlIi().length != 0 || !(type instanceof Class) || !((Class) type).isAssignableFrom(this.iiI1L1iI.getReturnType())) {
            return false;
        }
        return true;
    }

    public void IilL11ii1I1Il(List<Throwable> list) {
        new C0225o00oO0O0(this.iiI1L1iI).iiI1L1iI(list);
    }

    public boolean equals(Object obj) {
        if (!C0436o0OoO0o.class.isInstance(obj)) {
            return false;
        }
        return ((C0436o0OoO0o) obj).iiI1L1iI.equals(this.iiI1L1iI);
    }

    public int hashCode() {
        return this.iiI1L1iI.hashCode();
    }

    /* renamed from: i111iLiiIIill */
    public boolean iilLiIIIi11i(C0436o0OoO0o o0ooo0o) {
        if (!o0ooo0o.iiIliillii().equals(iiIliillii()) || o0ooo0o.i1L1lLllLLlIi().length != i1L1lLllLLlIi().length) {
            return false;
        }
        for (int i = 0; i < o0ooo0o.i1L1lLllLLlIi().length; i++) {
            if (!o0ooo0o.i1L1lLllLLlIi()[i].equals(i1L1lLllLLlIi()[i])) {
                return false;
            }
        }
        return true;
    }

    public final Class<?>[] i1L1lLllLLlIi() {
        return this.iiI1L1iI.getParameterTypes();
    }

    public Annotation[] i1LIL11l() {
        return this.iiI1L1iI.getAnnotations();
    }

    public Object iL1LIlIlI(Object obj, Object... objArr) throws Throwable {
        return new iiI1L1iI(obj, objArr).iiI1L1iI();
    }

    public boolean iLLLILIiLi1Ii() {
        return this.iiI1L1iI.isBridge();
    }

    public <T extends Annotation> T iiI1L1iI(Class<T> cls) {
        return this.iiI1L1iI.getAnnotation(cls);
    }

    public String iiIliillii() {
        return this.iiI1L1iI.getName();
    }

    public void iiLIIiIli(boolean z, List<Throwable> list) {
        I1l1iIll1lIi1(z, list);
        if (this.iiI1L1iI.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.iiI1L1iI.getName() + " should have no parameters"));
        }
    }

    public Class<?> iilLil1i11I1() {
        return IL1lILLLL1L();
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
