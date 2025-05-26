package top.tntok.autobot;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0Oo0OOo  reason: case insensitive filesystem */
public class C0416o0Oo0OOo {
    public List<C0534o0oOoo00> i1LIL11l = new ArrayList();
    public ClassLoader iiI1L1iI;
    public i1LIL11l illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0Oo0OOo$i1LIL11l */
    public interface i1LIL11l {
        boolean i1LIL11l(Class<?> cls);

        boolean iiI1L1iI(Method method);
    }

    /* renamed from: top.tntok.autobot.o0Oo0OOo$iiI1L1iI */
    public class iiI1L1iI extends C0469o0Ooo0O0 {
        public final /* synthetic */ String IiIIlIL;

        public iiI1L1iI(String str) {
            this.IiIIlIL = str;
        }

        public void IiiIlLl1il1i() {
            C0534o0oOoo00.IILiIL1i11Li(this.IiIIlIL);
        }
    }

    public C0416o0Oo0OOo(ClassLoader classLoader, i1LIL11l i1lil11l) {
        this.iiI1L1iI = classLoader;
        this.illlI1lLIL = i1lil11l;
    }

    public void i1LIL11l(String str) throws ClassNotFoundException {
        String str2;
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str2 = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
        } else {
            str2 = null;
        }
        illlI1lLIL(str, str2);
    }

    public void iiI1L1iI(Class<?> cls, String str) {
        if (this.illlI1lLIL.i1LIL11l(cls)) {
            try {
                C0534o0oOoo00 o0oooo00 = (C0534o0oOoo00) cls.newInstance();
                o0oooo00.iLlIllll(str);
                this.i1LIL11l.add(o0oooo00);
            } catch (InstantiationException unused) {
                List<C0534o0oOoo00> list = this.i1LIL11l;
                list.add(iiIliillii(cls, "InstantiationException: could not instantiate test class. Class: " + cls.getName()));
            } catch (IllegalAccessException unused2) {
                List<C0534o0oOoo00> list2 = this.i1LIL11l;
                list2.add(iiIliillii(cls, "IllegalAccessException: could not instantiate test class. Class: " + cls.getName()));
            }
        } else {
            throw new RuntimeException("Test class must be derived from UiAutomatorTestCase");
        }
    }

    public final C0469o0Ooo0O0 iiIliillii(Class<?> cls, String str) {
        iiI1L1iI iii1l1ii = new iiI1L1iI(str);
        iii1l1ii.iLlIllll(cls.getName());
        return iii1l1ii;
    }

    public List<C0534o0oOoo00> iilLil1i11I1() {
        return Collections.unmodifiableList(this.i1LIL11l);
    }

    public void il1LilLllii(List<String> list) throws ClassNotFoundException {
        for (String i1LIL11l2 : list) {
            i1LIL11l(i1LIL11l2);
        }
    }

    public void illlI1lLIL(String str, String str2) throws ClassNotFoundException {
        Class<?> loadClass = this.iiI1L1iI.loadClass(str);
        if (str2 != null) {
            iiI1L1iI(loadClass, str2);
            return;
        }
        for (Method method : loadClass.getMethods()) {
            if (this.illlI1lLIL.iiI1L1iI(method)) {
                iiI1L1iI(loadClass, method.getName());
            }
        }
    }
}
