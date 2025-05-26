package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

public class iillllIL extends C0270o00ooo0<C0436o0OoO0o> {
    public static C0419o0Oo0OoO I11lLL1 = new o0O0o000();
    public static final ThreadLocal<C0344o0OO0o0O> iLLLILIiLi1Ii = new ThreadLocal<>();
    public final ConcurrentMap<C0436o0OoO0o, C0009OooO0oO> iilLil1i11I1 = new ConcurrentHashMap();

    public class i1LIL11l extends o0O0oo00 {
        public final /* synthetic */ C0436o0OoO0o iiI1L1iI;

        public i1LIL11l(C0436o0OoO0o o0ooo0o) {
            this.iiI1L1iI = o0ooo0o;
        }

        public Object i1LIL11l() throws Throwable {
            return iillllIL.this.illiiliIILI(this.iiI1L1iI);
        }
    }

    public class iiI1L1iI extends C0374o0OOo00o {
        public final /* synthetic */ C0436o0OoO0o iiI1L1iI;

        public iiI1L1iI(C0436o0OoO0o o0ooo0o) {
            this.iiI1L1iI = o0ooo0o;
        }

        public void iiI1L1iI() throws Throwable {
            iillllIL.this.iLlIllll(this.iiI1L1iI).iiI1L1iI();
        }
    }

    public iillllIL(Class<?> cls) throws C0136o00O0oo {
        super(cls);
    }

    public final C0374o0OOo00o I1Ii1ILliII(C0436o0OoO0o o0ooo0o, Object obj, C0374o0OOo00o o0ooo00o) {
        C0344o0OO0o0O o0oo0o0o = new C0344o0OO0o0O();
        iLLLILIiLi1Ii.set(o0oo0o0o);
        try {
            List<C0429o0Oo0ooO> illi1LIILLiL = illi1LIILLiL(obj);
            for (C0183o00Ooooo next : Il1llillili(obj)) {
                if (next instanceof C0429o0Oo0ooO) {
                    if (!illi1LIILLiL.contains(next)) {
                    }
                }
                o0oo0o0o.iiI1L1iI(next);
            }
            for (C0429o0Oo0ooO i1LIL11l2 : illi1LIILLiL) {
                o0oo0o0o.i1LIL11l(i1LIL11l2);
            }
            iLLLILIiLi1Ii.remove();
            return o0oo0o0o.illlI1lLIL(o0ooo0o, iL1LIlIlI(o0ooo0o), obj, o0ooo00o);
        } catch (Throwable th) {
            iLLLILIiLi1Ii.remove();
            throw th;
        }
    }

    public C0374o0OOo00o I1LiILiLLIl1l(C0436o0OoO0o o0ooo0o, Object obj, C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = iiLIIiIli().I1iIiIi(Before.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new o0OO0oO0(o0ooo00o, I1iIiIi, obj);
    }

    public void I1LiliILi1lI1(List<Throwable> list) {
        C0345o0OO0o0o.iiIliillii.IiIIlIL(iiLIIiIli(), list);
    }

    public final void I1i1iiiI(List<Throwable> list) {
        if (iiLIIiIli().i1L1lLllLLlIi() != null) {
            list.addAll(I11lLL1.iiI1L1iI(iiLIIiIli()));
        }
    }

    public void I1iIiIi(List<Throwable> list) {
        super.I1iIiIi(list);
        I1i1iiiI(list);
        IiiIIil1l(list);
        Iiiiii1l1I1L1(list);
        iLILliI1(list);
        I1LiliILi1lI1(list);
        i1i1111LLILli(list);
    }

    public final long IIi1l1i(Test test) {
        if (test == null) {
            return 0;
        }
        return test.timeout();
    }

    public List<C0436o0OoO0o> IIlLill() {
        return iiLIIiIli().I1iIiIi(Test.class);
    }

    public final boolean IIllllLiIlIl() {
        if (iiLIIiIli().i1L1lLllLLlIi().getConstructors().length == 1) {
            return true;
        }
        return false;
    }

    public C0374o0OOo00o ILiLII1ILi(C0436o0OoO0o o0ooo0o, Object obj, C0374o0OOo00o o0ooo00o) {
        Class<? extends Throwable> i1iLlIill1I = i1iLlIill1I((Test) o0ooo0o.iiI1L1iI(Test.class));
        if (i1iLlIill1I != null) {
            return new C0048OooooOO(o0ooo00o, i1iLlIill1I);
        }
        return o0ooo00o;
    }

    public void ILiliIiI(List<Throwable> list) {
        il1l1IlL(Test.class, false, list);
    }

    /* renamed from: ILllI11 */
    public C0009OooO0oO iL1LIlIlI(C0436o0OoO0o o0ooo0o) {
        C0009OooO0oO oooO0oO = this.iilLil1i11I1.get(o0ooo0o);
        if (oooO0oO != null) {
            return oooO0oO;
        }
        C0009OooO0oO iLLLILIiLi1Ii2 = C0009OooO0oO.iLLLILIiLi1Ii(iiLIIiIli().i1L1lLllLLlIi(), IillLillLLIii(o0ooo0o), o0ooo0o.i1LIL11l());
        this.iilLil1i11I1.putIfAbsent(o0ooo0o, iLLLILIiLi1Ii2);
        return iLLLILIiLi1Ii2;
    }

    /* renamed from: IiIl11II */
    public void i1iiLIil1ILi(C0436o0OoO0o o0ooo0o, org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0009OooO0oO ILllI11 = iL1LIlIlI(o0ooo0o);
        if (ILl1iII11Ll1(o0ooo0o)) {
            iii1l1ii.IiIIlIL(ILllI11);
        } else {
            iiiiI1iILL11I(new iiI1L1iI(o0ooo0o), ILllI11, iii1l1ii);
        }
    }

    public void IiiIIil1l(List<Throwable> list) {
        if (iiLIIiIli().IilL11ii1I1Il()) {
            list.add(new Exception("The inner class " + iiLIIiIli().IL1lILLLL1L() + " is not static."));
        }
    }

    /* renamed from: IiiIlLl1il1i */
    public boolean ILl1iII11Ll1(C0436o0OoO0o o0ooo0o) {
        if (o0ooo0o.iiI1L1iI(Ignore.class) != null) {
            return true;
        }
        return false;
    }

    public void Iiiiii1l1I1L1(List<Throwable> list) {
        iLIIl1IliLlLI(list);
        iLiI1Llil(list);
    }

    public String IillLillLLIii(C0436o0OoO0o o0ooo0o) {
        return o0ooo0o.iiIliillii();
    }

    public List<C0183o00Ooooo> Il1llillili(Object obj) {
        illlI1lLIL illli1llil = new illlI1lLIL((iiI1L1iI) null);
        Class<Rule> cls = Rule.class;
        Class<C0183o00Ooooo> cls2 = C0183o00Ooooo.class;
        iiLIIiIli().iiIliillii(obj, cls, cls2, illli1llil);
        iiLIIiIli().il1LilLllii(obj, cls, cls2, illli1llil);
        return illli1llil.iiI1L1iI;
    }

    public List<C0436o0OoO0o> i111iLiiIIill() {
        return IIlLill();
    }

    public C0374o0OOo00o i1LiiIlIL1I(C0436o0OoO0o o0ooo0o, Object obj) {
        return new C0140o00OO0o(o0ooo0o, obj);
    }

    public final void i1i1111LLILli(List<Throwable> list) {
        C0345o0OO0o0o.I11lLL1.IiIIlIL(iiLIIiIli(), list);
    }

    public final Class<? extends Throwable> i1iLlIill1I(Test test) {
        if (test == null || test.expected() == Test.iiI1L1iI.class) {
            return null;
        }
        return test.expected();
    }

    public C0374o0OOo00o iLI1L1l1li(C0436o0OoO0o o0ooo0o, Object obj, C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = iiLIIiIli().I1iIiIi(After.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new o0OO0o(o0ooo00o, I1iIiIi, obj);
    }

    public void iLIIl1IliLlLI(List<Throwable> list) {
        if (!IIllllLiIlIl()) {
            list.add(new Exception("Test class should have exactly one public constructor"));
        }
    }

    @Deprecated
    public void iLILliI1(List<Throwable> list) {
        il1l1IlL(After.class, false, list);
        il1l1IlL(Before.class, false, list);
        ILiliIiI(list);
        if (IIlLill().isEmpty()) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void iLiI1Llil(List<Throwable> list) {
        if (!iiLIIiIli().IilL11ii1I1Il() && IIllllLiIlIl() && iiLIIiIli().iL1LIlIlI().getParameterTypes().length != 0) {
            list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
        }
    }

    public C0374o0OOo00o iLlIllll(C0436o0OoO0o o0ooo0o) {
        try {
            Object iiI1L1iI2 = new i1LIL11l(o0ooo0o).iiI1L1iI();
            return IL1IiilLlLI(I1Ii1ILliII(o0ooo0o, iiI1L1iI2, iLI1L1l1li(o0ooo0o, iiI1L1iI2, I1LiILiLLIl1l(o0ooo0o, iiI1L1iI2, illi1IL1(o0ooo0o, iiI1L1iI2, ILiLII1ILi(o0ooo0o, iiI1L1iI2, i1LiiIlIL1I(o0ooo0o, iiI1L1iI2)))))));
        } catch (Throwable th) {
            return new C0053Ooooooo(th);
        }
    }

    public Object iliilLllIl1() throws Exception {
        return iiLIIiIli().iL1LIlIlI().newInstance((Object[]) null);
    }

    @Deprecated
    public C0374o0OOo00o illi1IL1(C0436o0OoO0o o0ooo0o, Object obj, C0374o0OOo00o o0ooo00o) {
        long IIi1l1i = IIi1l1i((Test) o0ooo0o.iiI1L1iI(Test.class));
        if (IIi1l1i <= 0) {
            return o0ooo00o;
        }
        return C0451o0OoOo0.illlI1lLIL().il1LilLllii(IIi1l1i, TimeUnit.MILLISECONDS).illlI1lLIL(o0ooo00o);
    }

    public List<C0429o0Oo0ooO> illi1LIILLiL(Object obj) {
        illlI1lLIL illli1llil = new illlI1lLIL((iiI1L1iI) null);
        Class<Rule> cls = Rule.class;
        Class<C0429o0Oo0ooO> cls2 = C0429o0Oo0ooO.class;
        iiLIIiIli().iiIliillii(obj, cls, cls2, illli1llil);
        iiLIIiIli().il1LilLllii(obj, cls, cls2, illli1llil);
        return illli1llil.iiI1L1iI;
    }

    public Object illiiliIILI(C0436o0OoO0o o0ooo0o) throws Exception {
        return iliilLllIl1();
    }

    public static class illlI1lLIL<T> implements C0178o00OooO<T> {
        public final List<T> iiI1L1iI;

        public illlI1lLIL() {
            this.iiI1L1iI = new ArrayList();
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, T t) {
            C0344o0OO0o0O o0oo0o0o;
            Rule rule = (Rule) o000oo00.iiI1L1iI(Rule.class);
            if (!(rule == null || (o0oo0o0o = (C0344o0OO0o0O) iillllIL.iLLLILIiLi1Ii.get()) == null)) {
                o0oo0o0o.iilLil1i11I1(t, rule.order());
            }
            this.iiI1L1iI.add(t);
        }

        public /* synthetic */ illlI1lLIL(iiI1L1iI iii1l1ii) {
            this();
        }
    }

    public iillllIL(C0418o0Oo0Oo0 o0oo0oo0) throws C0136o00O0oo {
        super(o0oo0oo0);
    }
}
