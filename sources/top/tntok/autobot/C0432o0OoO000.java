package top.tntok.autobot;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import top.tntok.autobot.C0528o0oOOOoo;

/* renamed from: top.tntok.autobot.o0OoO000  reason: case insensitive filesystem */
public class C0432o0OoO000 implements C0532o0oOo0o0 {
    public Vector<C0532o0oOo0o0> i1LIL11l;
    public String iiI1L1iI;

    /* renamed from: top.tntok.autobot.o0OoO000$iiI1L1iI */
    public class iiI1L1iI extends C0534o0oOoo00 {
        public final /* synthetic */ String i1LIL11l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiI1L1iI(String str, String str2) {
            super(str);
            this.i1LIL11l = str2;
        }

        public void IiiIlLl1il1i() {
            C0534o0oOoo00.IILiIL1i11Li(this.i1LIL11l);
        }
    }

    public C0432o0OoO000() {
        this.i1LIL11l = new Vector<>(10);
    }

    public static C0532o0oOo0o0 I11lLL1(Class<?> cls, String str) {
        Object obj;
        try {
            Constructor<?> IiIIlIL = IiIIlIL(cls);
            try {
                if (IiIIlIL.getParameterTypes().length == 0) {
                    obj = IiIIlIL.newInstance((Object[]) null);
                    if (obj instanceof C0534o0oOoo00) {
                        ((C0534o0oOoo00) obj).iLlIllll(str);
                    }
                } else {
                    obj = IiIIlIL.newInstance(new Object[]{str});
                }
                return (C0532o0oOo0o0) obj;
            } catch (InstantiationException e) {
                return Ii1liIIIiLi("Cannot instantiate test case: " + str + " (" + C0449o0OoOOoO.I11lLL1(e) + ")");
            } catch (InvocationTargetException e2) {
                return Ii1liIIIiLi("Exception in constructor: " + str + " (" + C0449o0OoOOoO.I11lLL1(e2.getTargetException()) + ")");
            } catch (IllegalAccessException e3) {
                return Ii1liIIIiLi("Cannot access test case: " + str + " (" + C0449o0OoOOoO.I11lLL1(e3) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return Ii1liIIIiLi("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    public static C0532o0oOo0o0 Ii1liIIIiLi(String str) {
        return new iiI1L1iI("warning", str);
    }

    public static Constructor<?> IiIIlIL(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(new Class[]{String.class});
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor((Class[]) null);
        }
    }

    public void I1iIiIi(String str) {
        this.iiI1L1iI = str;
    }

    public final C0532o0oOo0o0 IL1lILLLL1L(Class<?> cls) {
        Class<C0534o0oOoo00> cls2 = C0534o0oOoo00.class;
        if (cls2.isAssignableFrom(cls)) {
            return new C0432o0OoO000((Class<?>) cls.asSubclass(cls2));
        }
        return Ii1liIIIiLi(cls.getCanonicalName() + " does not extend TestCase");
    }

    public final boolean IiiL1llIIi(Method method) {
        if (method.getParameterTypes().length != 0 || !method.getName().startsWith(C0528o0oOOOoo.iilLil1i11I1.I1iIiIi) || !method.getReturnType().equals(Void.TYPE)) {
            return false;
        }
        return true;
    }

    public Enumeration<C0532o0oOo0o0> i111iLiiIIill() {
        return this.i1LIL11l.elements();
    }

    public C0532o0oOo0o0 i1L1lLllLLlIi(int i) {
        return this.i1LIL11l.get(i);
    }

    public void i1LIL11l(C0428o0Oo0oo0 o0oo0oo0) {
        Iterator<C0532o0oOo0o0> it = this.i1LIL11l.iterator();
        while (it.hasNext()) {
            C0532o0oOo0o0 next = it.next();
            if (!o0oo0oo0.i1L1lLllLLlIi()) {
                iILiI1lll(next, o0oo0oo0);
            } else {
                return;
            }
        }
    }

    public void iILiI1lll(C0532o0oOo0o0 o0ooo0o0, C0428o0Oo0oo0 o0oo0oo0) {
        o0ooo0o0.i1LIL11l(o0oo0oo0);
    }

    public int iL1LIlIlI() {
        return this.i1LIL11l.size();
    }

    public String iLLLILIiLi1Ii() {
        return this.iiI1L1iI;
    }

    public void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0) {
        this.i1LIL11l.add(o0ooo0o0);
    }

    public void iiIliillii(Class<? extends C0534o0oOoo00> cls) {
        iiI1L1iI(new C0432o0OoO000((Class<?>) cls));
    }

    public final boolean iilLiIIIi11i(Method method) {
        if (!IiiL1llIIi(method) || !Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        return true;
    }

    public final void iilLil1i11I1(Class<?> cls) {
        this.iiI1L1iI = cls.getName();
        try {
            IiIIlIL(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                iiI1L1iI(Ii1liIIIiLi("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 = cls; C0532o0oOo0o0.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                for (Method il1LilLllii : C0188o00o0000.iiI1L1iI(cls2)) {
                    il1LilLllii(il1LilLllii, arrayList, cls);
                }
            }
            if (this.i1LIL11l.size() == 0) {
                iiI1L1iI(Ii1liIIIiLi("No tests found in " + cls.getName()));
            }
        } catch (NoSuchMethodException unused) {
            iiI1L1iI(Ii1liIIIiLi("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public final void il1LilLllii(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (!list.contains(name)) {
            if (iilLiIIIi11i(method)) {
                list.add(name);
                iiI1L1iI(I11lLL1(cls, name));
            } else if (IiiL1llIIi(method)) {
                iiI1L1iI(Ii1liIIIiLi("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
            }
        }
    }

    public int illlI1lLIL() {
        Iterator<C0532o0oOo0o0> it = this.i1LIL11l.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().illlI1lLIL();
        }
        return i;
    }

    public String toString() {
        if (iLLLILIiLi1Ii() != null) {
            return iLLLILIiLi1Ii();
        }
        return super.toString();
    }

    public C0432o0OoO000(Class<?> cls) {
        this.i1LIL11l = new Vector<>(10);
        iilLil1i11I1(cls);
    }

    public C0432o0OoO000(Class<? extends C0534o0oOoo00> cls, String str) {
        this((Class<?>) cls);
        I1iIiIi(str);
    }

    public C0432o0OoO000(String str) {
        this.i1LIL11l = new Vector<>(10);
        I1iIiIi(str);
    }

    public C0432o0OoO000(Class<?>... clsArr) {
        this.i1LIL11l = new Vector<>(10);
        for (Class<?> IL1lILLLL1L : clsArr) {
            iiI1L1iI(IL1lILLLL1L(IL1lILLLL1L));
        }
    }

    public C0432o0OoO000(Class<? extends C0534o0oOoo00>[] clsArr, String str) {
        this((Class<?>[]) clsArr);
        I1iIiIi(str);
    }
}
