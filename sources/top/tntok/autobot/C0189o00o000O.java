package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Deprecated
/* renamed from: top.tntok.autobot.o00o000O  reason: case insensitive filesystem */
public class C0189o00o000O {
    public C0417o0Oo0Oo i1LIL11l;
    public final List<Throwable> iiI1L1iI = new ArrayList();

    public C0189o00o000O(C0417o0Oo0Oo o0oo0oo) {
        this.i1LIL11l = o0oo0oo;
    }

    public void i1LIL11l() {
        iilLil1i11I1(After.class, false);
        iilLil1i11I1(Before.class, false);
        Class<Test> cls = Test.class;
        iilLil1i11I1(cls, false);
        if (this.i1LIL11l.i1LIL11l(cls).size() == 0) {
            this.iiI1L1iI.add(new Exception("No runnable methods"));
        }
    }

    public void iiI1L1iI() throws C0138o00O0ooo {
        if (!this.iiI1L1iI.isEmpty()) {
            throw new C0138o00O0ooo(this.iiI1L1iI);
        }
    }

    public void iiIliillii() {
        iilLil1i11I1(BeforeClass.class, true);
        iilLil1i11I1(AfterClass.class, true);
    }

    public final void iilLil1i11I1(Class<? extends Annotation> cls, boolean z) {
        String str;
        for (Method next : this.i1LIL11l.i1LIL11l(cls)) {
            if (Modifier.isStatic(next.getModifiers()) != z) {
                if (z) {
                    str = "should";
                } else {
                    str = "should not";
                }
                List<Throwable> list = this.iiI1L1iI;
                list.add(new Exception("Method " + next.getName() + "() " + str + " be static"));
            }
            if (!Modifier.isPublic(next.getDeclaringClass().getModifiers())) {
                List<Throwable> list2 = this.iiI1L1iI;
                list2.add(new Exception("Class " + next.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(next.getModifiers())) {
                List<Throwable> list3 = this.iiI1L1iI;
                list3.add(new Exception("Method " + next.getName() + " should be public"));
            }
            if (next.getReturnType() != Void.TYPE) {
                List<Throwable> list4 = this.iiI1L1iI;
                list4.add(new Exception("Method " + next.getName() + "should have a return type of void"));
            }
            if (next.getParameterTypes().length != 0) {
                List<Throwable> list5 = this.iiI1L1iI;
                list5.add(new Exception("Method " + next.getName() + " should have no parameters"));
            }
        }
    }

    public void il1LilLllii() {
        try {
            this.i1LIL11l.il1LilLllii();
        } catch (Exception e) {
            this.iiI1L1iI.add(new Exception("Test class should have public zero-argument constructor", e));
        }
    }

    public List<Throwable> illlI1lLIL() {
        il1LilLllii();
        iiIliillii();
        i1LIL11l();
        return this.iiI1L1iI;
    }
}
