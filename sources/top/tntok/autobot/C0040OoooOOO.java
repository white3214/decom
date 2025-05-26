package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import org.junit.runner.notification.iiI1L1iI;

/* renamed from: top.tntok.autobot.OoooOOO  reason: case insensitive filesystem */
public class C0040OoooOOO extends C0346o0OO0oOO {
    public final String i1LIL11l;
    public final List<Throwable> iiI1L1iI;

    public C0040OoooOOO(Class<?> cls, Throwable th) {
        this(th, (Class<?>[]) new Class[]{cls});
    }

    public final C0009OooO0oO I11lLL1() {
        return C0009OooO0oO.iilLiIIIi11i(this.i1LIL11l, "initializationError", new Annotation[0]);
    }

    public final String IiIIlIL(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls : clsArr) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(cls.getName());
        }
        return sb.toString();
    }

    public void i1LIL11l(iiI1L1iI iii1l1ii) {
        for (Throwable iilLiIIIi11i : this.iiI1L1iI) {
            iilLiIIIi11i(iilLiIIIi11i, iii1l1ii);
        }
    }

    public final List<Throwable> iLLLILIiLi1Ii(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return iLLLILIiLi1Ii(th.getCause());
        }
        if (th instanceof C0141o00OO0o0) {
            return Collections.singletonList(th);
        }
        if (th instanceof C0136o00O0oo) {
            return ((C0136o00O0oo) th).iiI1L1iI();
        }
        if (th instanceof C0138o00O0ooo) {
            return ((C0138o00O0ooo) th).iiI1L1iI();
        }
        return Collections.singletonList(th);
    }

    public C0009OooO0oO iiI1L1iI() {
        C0009OooO0oO iilLil1i11I1 = C0009OooO0oO.iilLil1i11I1(this.i1LIL11l, new Annotation[0]);
        for (Throwable next : this.iiI1L1iI) {
            iilLil1i11I1.iiI1L1iI(I11lLL1());
        }
        return iilLil1i11I1;
    }

    public final void iilLiIIIi11i(Throwable th, iiI1L1iI iii1l1ii) {
        C0009OooO0oO I11lLL1 = I11lLL1();
        iii1l1ii.iILiI1lll(I11lLL1);
        iii1l1ii.iilLil1i11I1(new o00O0O(I11lLL1, th));
        iii1l1ii.iLLLILIiLi1Ii(I11lLL1);
    }

    public C0040OoooOOO(Throwable th, Class<?>... clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            throw new NullPointerException("Test classes cannot be null or empty");
        }
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException("Test class cannot be null");
            }
        }
        this.i1LIL11l = IiIIlIL(clsArr);
        this.iiI1L1iI = iLLLILIiLi1Ii(th);
    }
}
