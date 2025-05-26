package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Deprecated
/* renamed from: top.tntok.autobot.o0Oo0oO0  reason: case insensitive filesystem */
public class C0425o0Oo0oO0 {
    public C0417o0Oo0Oo i1LIL11l;
    public final Method iiI1L1iI;

    public C0425o0Oo0oO0(Method method, C0417o0Oo0Oo o0oo0oo) {
        this.iiI1L1iI = method;
        this.i1LIL11l = o0oo0oo;
    }

    public boolean I11lLL1() {
        if (this.iiI1L1iI.getAnnotation(Ignore.class) != null) {
            return true;
        }
        return false;
    }

    public List<Method> i1LIL11l() {
        return this.i1LIL11l.i1LIL11l(After.class);
    }

    public boolean iLLLILIiLi1Ii(Throwable th) {
        return !il1LilLllii().isAssignableFrom(th.getClass());
    }

    public boolean iiI1L1iI() {
        if (il1LilLllii() != null) {
            return true;
        }
        return false;
    }

    public long iiIliillii() {
        Test test = (Test) this.iiI1L1iI.getAnnotation(Test.class);
        if (test == null) {
            return 0;
        }
        return test.timeout();
    }

    public void iilLil1i11I1(Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        this.iiI1L1iI.invoke(obj, (Object[]) null);
    }

    public Class<? extends Throwable> il1LilLllii() {
        Test test = (Test) this.iiI1L1iI.getAnnotation(Test.class);
        if (test == null || test.expected() == Test.iiI1L1iI.class) {
            return null;
        }
        return test.expected();
    }

    public List<Method> illlI1lLIL() {
        return this.i1LIL11l.i1LIL11l(Before.class);
    }
}
