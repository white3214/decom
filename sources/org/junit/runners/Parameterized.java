package org.junit.runners;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import top.tntok.autobot.C0009OooO0oO;
import top.tntok.autobot.C0141o00OO0o0;
import top.tntok.autobot.C0271o00ooo00;
import top.tntok.autobot.C0346o0OO0oOO;
import top.tntok.autobot.C0418o0Oo0Oo0;
import top.tntok.autobot.C0436o0OoO0o;
import top.tntok.autobot.C0540o0ooOOO0;
import top.tntok.autobot.I11lLL1L11Lil;
import top.tntok.autobot.iLILliI1;
import top.tntok.autobot.o00O0O;

public class Parameterized extends Suite {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AfterParam {
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BeforeParam {
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameters {
        String name() default "{index}";
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseParametersRunnerFactory {
        Class<? extends C0271o00ooo00> value() default I11lLL1L11Lil.class;
    }

    public static class i1LIL11l extends C0346o0OO0oOO {
        public final iLILliI1 i1LIL11l;
        public final C0009OooO0oO iiI1L1iI;

        public i1LIL11l(C0418o0Oo0Oo0 o0oo0oo0, String str, iLILliI1 ilillii1) {
            Class<?> i1L1lLllLLlIi = o0oo0oo0.i1L1lLllLLlIi();
            this.iiI1L1iI = C0009OooO0oO.I11lLL1(i1L1lLllLLlIi, str + "() assumption violation");
            this.i1LIL11l = ilillii1;
        }

        public void i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
            iii1l1ii.iiIliillii(new o00O0O(this.iiI1L1iI, this.i1LIL11l));
        }

        public C0009OooO0oO iiI1L1iI() {
            return this.iiI1L1iI;
        }
    }

    public static class illlI1lLIL {
        public static final C0271o00ooo00 iilLil1i11I1 = new I11lLL1L11Lil();
        public final C0436o0OoO0o i1LIL11l;
        public final C0418o0Oo0Oo0 iiI1L1iI;
        public final C0346o0OO0oOO iiIliillii;
        public final int il1LilLllii;
        public final List<Object> illlI1lLIL;

        public static C0436o0OoO0o IiIIlIL(C0418o0Oo0Oo0 o0oo0oo0) throws Exception {
            for (C0436o0OoO0o next : o0oo0oo0.I1iIiIi(Parameters.class)) {
                if (next.IiiL1llIIi() && next.IiIIlIL()) {
                    return next;
                }
            }
            throw new Exception("No public static parameters method on class " + o0oo0oo0.IL1lILLLL1L());
        }

        public static Object[] IiiL1llIIi(Object obj) {
            if (obj instanceof Object[]) {
                return (Object[]) obj;
            }
            return new Object[]{obj};
        }

        public static Exception iILiI1lll(C0418o0Oo0Oo0 o0oo0oo0, C0436o0OoO0o o0ooo0o) throws Exception {
            return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", new Object[]{o0oo0oo0.IL1lILLLL1L(), o0ooo0o.iiIliillii()}));
        }

        public static List<Object> illlI1lLIL(C0418o0Oo0Oo0 o0oo0oo0, C0436o0OoO0o o0ooo0o) throws Throwable {
            Object iL1LIlIlI = o0ooo0o.iL1LIlIlI((Object) null, new Object[0]);
            if (iL1LIlIlI instanceof List) {
                return (List) iL1LIlIlI;
            }
            if (iL1LIlIlI instanceof Collection) {
                return new ArrayList((Collection) iL1LIlIlI);
            }
            if (iL1LIlIlI instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object add : (Iterable) iL1LIlIlI) {
                    arrayList.add(add);
                }
                return arrayList;
            } else if (iL1LIlIlI instanceof Object[]) {
                return Arrays.asList((Object[]) iL1LIlIlI);
            } else {
                throw iILiI1lll(o0oo0oo0, o0ooo0o);
            }
        }

        public final C0540o0ooOOO0 I11lLL1(C0418o0Oo0Oo0 o0oo0oo0, String str, int i, Object[] objArr) {
            String format = MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr);
            return new C0540o0ooOOO0("[" + format + "]", o0oo0oo0, Arrays.asList(objArr));
        }

        public final List<C0540o0ooOOO0> iLLLILIiLi1Ii(Iterable<Object> iterable, String str) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object iilLil1i11I12 : iterable) {
                arrayList.add(iilLil1i11I1(str, i, iilLil1i11I12));
                i++;
            }
            return arrayList;
        }

        public final List<C0346o0OO0oOO> iiIliillii(Iterable<Object> iterable, String str, C0271o00ooo00 o00ooo00) throws Exception {
            try {
                List<C0540o0ooOOO0> iLLLILIiLi1Ii = iLLLILIiLi1Ii(iterable, str);
                ArrayList arrayList = new ArrayList();
                for (C0540o0ooOOO0 iiI1L1iI2 : iLLLILIiLi1Ii) {
                    arrayList.add(o00ooo00.iiI1L1iI(iiI1L1iI2));
                }
                return arrayList;
            } catch (ClassCastException unused) {
                throw iILiI1lll(this.iiI1L1iI, this.i1LIL11l);
            }
        }

        public final C0271o00ooo00 iilLiIIIi11i() throws InstantiationException, IllegalAccessException {
            UseParametersRunnerFactory useParametersRunnerFactory = (UseParametersRunnerFactory) this.iiI1L1iI.iiI1L1iI(UseParametersRunnerFactory.class);
            if (useParametersRunnerFactory == null) {
                return iilLil1i11I1;
            }
            return (C0271o00ooo00) useParametersRunnerFactory.value().newInstance();
        }

        public final C0540o0ooOOO0 iilLil1i11I1(String str, int i, Object obj) {
            return I11lLL1(this.iiI1L1iI, str, i, IiiL1llIIi(obj));
        }

        public final List<C0346o0OO0oOO> il1LilLllii() throws Exception {
            C0346o0OO0oOO o0oo0ooo = this.iiIliillii;
            if (o0oo0ooo != null) {
                return Collections.singletonList(o0oo0ooo);
            }
            return Collections.unmodifiableList(iiIliillii(this.illlI1lLIL, ((Parameters) this.i1LIL11l.iiI1L1iI(Parameters.class)).name(), iilLiIIIi11i()));
        }

        public illlI1lLIL(Class<?> cls) throws Throwable {
            List<Object> list;
            i1LIL11l i1lil11l;
            C0418o0Oo0Oo0 o0oo0oo0 = new C0418o0Oo0Oo0(cls);
            this.iiI1L1iI = o0oo0oo0;
            C0436o0OoO0o IiIIlIL = IiIIlIL(o0oo0oo0);
            this.i1LIL11l = IiIIlIL;
            try {
                list = illlI1lLIL(o0oo0oo0, IiIIlIL);
                i1lil11l = null;
            } catch (iLILliI1 e) {
                List<Object> emptyList = Collections.emptyList();
                i1LIL11l i1lil11l2 = new i1LIL11l(this.iiI1L1iI, this.i1LIL11l.iiIliillii(), e);
                list = emptyList;
                i1lil11l = i1lil11l2;
            }
            this.illlI1lLIL = list;
            this.iiIliillii = i1lil11l;
            this.il1LilLllii = !list.isEmpty() ? IiiL1llIIi(list.get(0)).length : 0;
        }
    }

    public Parameterized(Class<?> cls) throws Throwable {
        this(cls, new illlI1lLIL(cls));
    }

    public final void ILllI11(Integer num) throws C0141o00OO0o0 {
        ArrayList arrayList = new ArrayList();
        i1iLlIill1I(BeforeParam.class, num, arrayList);
        i1iLlIill1I(AfterParam.class, num, arrayList);
        if (!arrayList.isEmpty()) {
            throw new C0141o00OO0o0(iiLIIiIli().i1L1lLllLLlIi(), arrayList);
        }
    }

    public final void i1iLlIill1I(Class<? extends Annotation> cls, Integer num, List<Throwable> list) {
        int length;
        for (C0436o0OoO0o next : iiLIIiIli().I1iIiIi(cls)) {
            next.I1l1iIll1lIi1(true, list);
            if (!(num == null || (length = next.I1iIiIi().getParameterTypes().length) == 0 || length == num.intValue())) {
                list.add(new Exception("Method " + next.iiIliillii() + "() should have 0 or " + num + " parameter(s)"));
            }
        }
    }

    public Parameterized(Class<?> cls, illlI1lLIL illli1llil) throws Exception {
        super(cls, (List<C0346o0OO0oOO>) illli1llil.il1LilLllii());
        ILllI11(Integer.valueOf(illli1llil.il1LilLllii));
    }
}
