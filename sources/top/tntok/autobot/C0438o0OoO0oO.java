package top.tntok.autobot;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theory;

/* renamed from: top.tntok.autobot.o0OoO0oO  reason: case insensitive filesystem */
public class C0438o0OoO0oO extends iillllIL {
    public C0438o0OoO0oO(Class<?> cls) throws C0136o00O0oo {
        super(cls);
    }

    public void I1iIiIi(List<Throwable> list) {
        super.I1iIiIi(list);
        IIlllIIi1ii(list);
        IllLlI1IiIL(list);
    }

    public List<C0436o0OoO0o> IIlLill() {
        ArrayList arrayList = new ArrayList(super.IIlLill());
        List<C0436o0OoO0o> I1iIiIi = iiLIIiIli().I1iIiIi(Theory.class);
        arrayList.removeAll(I1iIiIi);
        arrayList.addAll(I1iIiIi);
        return arrayList;
    }

    public final void IIlllIIi1ii(List<Throwable> list) {
        for (Field field : iiLIIiIli().i1L1lLllLLlIi().getDeclaredFields()) {
            if (field.getAnnotation(DataPoint.class) != null || field.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    public void ILiliIiI(List<Throwable> list) {
        for (C0436o0OoO0o next : IIlLill()) {
            if (next.iiI1L1iI(Theory.class) != null) {
                next.I1l1iIll1lIi1(false, list);
                next.IilL11ii1I1Il(list);
            } else {
                next.iiLIIiIli(false, list);
            }
            Iterator<C0265o00ooOo> it = C0265o00ooOo.I1iIiIi(next.I1iIiIi()).iterator();
            while (it.hasNext()) {
                ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) it.next().iiIliillii(ParametersSuppliedBy.class);
                if (parametersSuppliedBy != null) {
                    ilLIlL1ILi(parametersSuppliedBy.value(), list);
                }
            }
        }
    }

    public void Iiiiii1l1I1L1(List<Throwable> list) {
        iLIIl1IliLlLI(list);
    }

    public final void IllLlI1IiIL(List<Throwable> list) {
        for (Method method : iiLIIiIli().i1L1lLllLLlIi().getDeclaredMethods()) {
            if (method.getAnnotation(DataPoint.class) != null || method.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    public C0374o0OOo00o iLlIllll(C0436o0OoO0o o0ooo0o) {
        return new iiI1L1iI(o0ooo0o, iiLIIiIli());
    }

    public final void ilLIlL1ILi(Class<? extends C0267o00ooOoO> cls, List<Throwable> list) {
        Constructor[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length != 0 && !parameterTypes[0].equals(C0418o0Oo0Oo0.class)) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
        }
    }

    public C0438o0OoO0oO(C0418o0Oo0Oo0 o0oo0oo0) throws C0136o00O0oo {
        super(o0oo0oo0);
    }

    /* renamed from: top.tntok.autobot.o0OoO0oO$iiI1L1iI */
    public static class iiI1L1iI extends C0374o0OOo00o {
        public final C0436o0OoO0o i1LIL11l;
        public int iiI1L1iI = 0;
        public List<iLILliI1> il1LilLllii = new ArrayList();
        public final C0418o0Oo0Oo0 illlI1lLIL;

        /* renamed from: top.tntok.autobot.o0OoO0oO$iiI1L1iI$i1LIL11l */
        public class i1LIL11l extends C0374o0OOo00o {
            public final /* synthetic */ C0436o0OoO0o i1LIL11l;
            public final /* synthetic */ Iiiiii1l1I1L1 iiI1L1iI;
            public final /* synthetic */ Object illlI1lLIL;

            public i1LIL11l(Iiiiii1l1I1L1 iiiiii1l1I1L1, C0436o0OoO0o o0ooo0o, Object obj) {
                this.iiI1L1iI = iiiiii1l1I1L1;
                this.i1LIL11l = o0ooo0o;
                this.illlI1lLIL = obj;
            }

            public void iiI1L1iI() throws Throwable {
                Object[] iilLiIIIi11i = this.iiI1L1iI.iilLiIIIi11i();
                if (!iiI1L1iI.this.iLLLILIiLi1Ii()) {
                    I1LiliILi1lI1.iiIliillii(iilLiIIIi11i);
                }
                this.i1LIL11l.iL1LIlIlI(this.illlI1lLIL, iilLiIIIi11i);
            }
        }

        public iiI1L1iI(C0436o0OoO0o o0ooo0o, C0418o0Oo0Oo0 o0oo0oo0) {
            this.i1LIL11l = o0ooo0o;
            this.illlI1lLIL = o0oo0oo0;
        }

        public final C0374o0OOo00o I11lLL1(C0436o0OoO0o o0ooo0o, Iiiiii1l1I1L1 iiiiii1l1I1L1, Object obj) {
            return new i1LIL11l(iiiiii1l1I1L1, o0ooo0o, obj);
        }

        public void IiIIlIL(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length == 0) {
                throw th;
            }
            throw new C0268o00ooOoo(th, this.i1LIL11l.iiIliillii(), objArr);
        }

        public void IiiL1llIIi(Iiiiii1l1I1L1 iiiiii1l1I1L1) throws Throwable {
            new C0004iiI1L1iI(il1LilLllii(), iiiiii1l1I1L1).iLlIllll(this.i1LIL11l).iiI1L1iI();
        }

        public void iILiI1lll(Iiiiii1l1I1L1 iiiiii1l1I1L1) throws Throwable {
            for (o0O0OOOo i1LIL11l2 : iiiiii1l1I1L1.i1L1lLllLLlIi()) {
                iilLiIIIi11i(iiiiii1l1I1L1.i1LIL11l(i1LIL11l2));
            }
        }

        public final boolean iLLLILIiLi1Ii() {
            Theory theory = (Theory) this.i1LIL11l.I1iIiIi().getAnnotation(Theory.class);
            if (theory == null) {
                return false;
            }
            return theory.nullsAccepted();
        }

        public void iiI1L1iI() throws Throwable {
            boolean z;
            iilLiIIIi11i(Iiiiii1l1I1L1.iiI1L1iI(this.i1LIL11l.I1iIiIi(), il1LilLllii()));
            if (this.i1LIL11l.iiI1L1iI(Theory.class) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.iiI1L1iI == 0 && z) {
                Il1llillili.ILiliIiI("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.il1LilLllii);
            }
        }

        public void iiIliillii(iLILliI1 ilillii1) {
            this.il1LilLllii.add(ilillii1);
        }

        public void iilLiIIIi11i(Iiiiii1l1I1L1 iiiiii1l1I1L1) throws Throwable {
            if (!iiiiii1l1I1L1.iILiI1lll()) {
                iILiI1lll(iiiiii1l1I1L1);
            } else {
                IiiL1llIIi(iiiiii1l1I1L1);
            }
        }

        public void iilLil1i11I1() {
            this.iiI1L1iI++;
        }

        public final C0418o0Oo0Oo0 il1LilLllii() {
            return this.illlI1lLIL;
        }

        /* renamed from: top.tntok.autobot.o0OoO0oO$iiI1L1iI$iiI1L1iI  reason: collision with other inner class name */
        public class C0004iiI1L1iI extends iillllIL {
            public final /* synthetic */ Iiiiii1l1I1L1 IiIIlIL;

            /* renamed from: top.tntok.autobot.o0OoO0oO$iiI1L1iI$iiI1L1iI$iiI1L1iI  reason: collision with other inner class name */
            public class C0005iiI1L1iI extends C0374o0OOo00o {
                public final /* synthetic */ C0374o0OOo00o iiI1L1iI;

                public C0005iiI1L1iI(C0374o0OOo00o o0ooo00o) {
                    this.iiI1L1iI = o0ooo00o;
                }

                public void iiI1L1iI() throws Throwable {
                    try {
                        this.iiI1L1iI.iiI1L1iI();
                        iiI1L1iI.this.iilLil1i11I1();
                    } catch (iLILliI1 e) {
                        iiI1L1iI.this.iiIliillii(e);
                    } catch (Throwable th) {
                        C0004iiI1L1iI iii1l1ii = C0004iiI1L1iI.this;
                        iiI1L1iI iii1l1ii2 = iiI1L1iI.this;
                        iii1l1ii2.IiIIlIL(th, iii1l1ii.IiIIlIL.I11lLL1(iii1l1ii2.iLLLILIiLi1Ii()));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0004iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0, Iiiiii1l1I1L1 iiiiii1l1I1L1) throws C0136o00O0oo {
                super(o0oo0oo0);
                this.IiIIlIL = iiiiii1l1I1L1;
            }

            public C0374o0OOo00o i1LiiIlIL1I(C0436o0OoO0o o0ooo0o, Object obj) {
                return iiI1L1iI.this.I11lLL1(o0ooo0o, this.IiIIlIL, obj);
            }

            public C0374o0OOo00o iLlIllll(C0436o0OoO0o o0ooo0o) {
                return new C0005iiI1L1iI(super.iLlIllll(o0ooo0o));
            }

            public Object iliilLllIl1() throws Exception {
                Object[] iLLLILIiLi1Ii = this.IiIIlIL.iLLLILIiLi1Ii();
                if (!iiI1L1iI.this.iLLLILIiLi1Ii()) {
                    I1LiliILi1lI1.iiIliillii(iLLLILIiLi1Ii);
                }
                return iiLIIiIli().iL1LIlIlI().newInstance(iLLLILIiLi1Ii);
            }

            public void I1iIiIi(List<Throwable> list) {
            }
        }
    }
}
