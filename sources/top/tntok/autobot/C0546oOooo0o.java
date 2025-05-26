package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: top.tntok.autobot.oOooo0o  reason: case insensitive filesystem */
public class C0546oOooo0o extends C0346o0OO0oOO implements o000OO0O, C0367o0OOOoOo {
    public C0417o0Oo0Oo i1LIL11l;
    public final List<Method> iiI1L1iI = IiiL1llIIi();

    /* renamed from: top.tntok.autobot.oOooo0o$i1LIL11l */
    public class i1LIL11l implements Comparator<Method> {
        public final /* synthetic */ C0369o0OOOoo0 i1LIL11l;

        public i1LIL11l(C0369o0OOOoo0 o0ooooo0) {
            this.i1LIL11l = o0ooooo0;
        }

        /* renamed from: iiI1L1iI */
        public int compare(Method method, Method method2) {
            return this.i1LIL11l.compare(C0546oOooo0o.this.I1iIiIi(method), C0546oOooo0o.this.I1iIiIi(method2));
        }
    }

    /* renamed from: top.tntok.autobot.oOooo0o$iiI1L1iI */
    public class iiI1L1iI implements Runnable {
        public final /* synthetic */ org.junit.runner.notification.iiI1L1iI iiI1L1iI;

        public iiI1L1iI(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
            this.iiI1L1iI = iii1l1ii;
        }

        public void run() {
            C0546oOooo0o.this.i1L1lLllLLlIi(this.iiI1L1iI);
        }
    }

    public C0546oOooo0o(Class<?> cls) throws C0138o00O0ooo {
        this.i1LIL11l = new C0417o0Oo0Oo(cls);
        Ii1liIIIiLi();
    }

    public Annotation[] I11lLL1() {
        return this.i1LIL11l.iiIliillii().getAnnotations();
    }

    public C0009OooO0oO I1iIiIi(Method method) {
        return C0009OooO0oO.iLLLILIiLi1Ii(iilLiIIIi11i().iiIliillii(), i111iLiiIIill(method), iL1LIlIlI(method));
    }

    public final void IL1lILLLL1L(org.junit.runner.notification.iiI1L1iI iii1l1ii, C0009OooO0oO oooO0oO, Throwable th) {
        iii1l1ii.iILiI1lll(oooO0oO);
        iii1l1ii.iilLil1i11I1(new o00O0O(oooO0oO, th));
        iii1l1ii.iLLLILIiLi1Ii(oooO0oO);
    }

    public void Ii1liIIIiLi() throws C0138o00O0ooo {
        C0189o00o000O o00o000o = new C0189o00o000O(this.i1LIL11l);
        o00o000o.illlI1lLIL();
        o00o000o.iiI1L1iI();
    }

    public String IiIIlIL() {
        return iilLiIIIi11i().iilLil1i11I1();
    }

    public List<Method> IiiL1llIIi() {
        return this.i1LIL11l.iLLLILIiLi1Ii();
    }

    public C0425o0Oo0oO0 IilL11ii1I1Il(Method method) {
        return new C0425o0Oo0oO0(method, this.i1LIL11l);
    }

    public String i111iLiiIIill(Method method) {
        return method.getName();
    }

    public void i1L1lLllLLlIi(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        for (Method iILiI1lll : this.iiI1L1iI) {
            iILiI1lll(iILiI1lll, iii1l1ii);
        }
    }

    public void i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        new iiiILl1iIIIli(iii1l1ii, this.i1LIL11l, iiI1L1iI(), new iiI1L1iI(iii1l1ii)).il1LilLllii();
    }

    public void iILiI1lll(Method method, org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0009OooO0oO I1iIiIi = I1iIiIi(method);
        try {
            new C0182o00OoooO(iLLLILIiLi1Ii(), IilL11ii1I1Il(method), iii1l1ii, I1iIiIi).i1LIL11l();
        } catch (InvocationTargetException e) {
            IL1lILLLL1L(iii1l1ii, I1iIiIi, e.getCause());
        } catch (Exception e2) {
            IL1lILLLL1L(iii1l1ii, I1iIiIi, e2);
        }
    }

    public Annotation[] iL1LIlIlI(Method method) {
        return method.getAnnotations();
    }

    public Object iLLLILIiLi1Ii() throws Exception {
        return iilLiIIIi11i().il1LilLllii().newInstance((Object[]) null);
    }

    public C0009OooO0oO iiI1L1iI() {
        C0009OooO0oO iilLil1i11I1 = C0009OooO0oO.iilLil1i11I1(IiIIlIL(), I11lLL1());
        for (Method I1iIiIi : this.iiI1L1iI) {
            iilLil1i11I1.iiI1L1iI(I1iIiIi(I1iIiIi));
        }
        return iilLil1i11I1;
    }

    public void iiIliillii(o000O0O o000o0o) throws C0529o0oOOo {
        Iterator<Method> it = this.iiI1L1iI.iterator();
        while (it.hasNext()) {
            if (!o000o0o.iiIliillii(I1iIiIi(it.next()))) {
                it.remove();
            }
        }
        if (this.iiI1L1iI.isEmpty()) {
            throw new C0529o0oOOo();
        }
    }

    public C0417o0Oo0Oo iilLiIIIi11i() {
        return this.i1LIL11l;
    }

    public void il1LilLllii(C0369o0OOOoo0 o0ooooo0) {
        Collections.sort(this.iiI1L1iI, new i1LIL11l(o0ooooo0));
    }
}
