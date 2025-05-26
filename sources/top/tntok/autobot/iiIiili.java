package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class iiIiili extends iillllIL {
    public final Object[] IiIIlIL;
    public final String iilLiIIIi11i;

    public enum i1LIL11l {
        CONSTRUCTOR,
        FIELD
    }

    public static /* synthetic */ class iiI1L1iI {
        public static final /* synthetic */ int[] iiI1L1iI;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                top.tntok.autobot.iiIiili$i1LIL11l[] r0 = top.tntok.autobot.iiIiili.i1LIL11l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iiI1L1iI = r0
                top.tntok.autobot.iiIiili$i1LIL11l r1 = top.tntok.autobot.iiIiili.i1LIL11l.CONSTRUCTOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = iiI1L1iI     // Catch:{ NoSuchFieldError -> 0x001d }
                top.tntok.autobot.iiIiili$i1LIL11l r1 = top.tntok.autobot.iiIiili.i1LIL11l.FIELD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iiIiili.iiI1L1iI.<clinit>():void");
        }
    }

    public class il1LilLllii extends o0OO0oO0 {
        public il1LilLllii(C0374o0OOo00o o0ooo00o, List<C0436o0OoO0o> list) {
            super(o0ooo00o, list, (Object) null);
        }

        public void i1LIL11l(C0436o0OoO0o o0ooo0o) throws Throwable {
            Object[] objArr;
            if (o0ooo0o.I1iIiIi().getParameterTypes().length == 0) {
                objArr = null;
            } else {
                objArr = iiIiili.this.IiIIlIL;
            }
            o0ooo0o.iL1LIlIlI((Object) null, objArr);
        }
    }

    public class illlI1lLIL extends o0OO0o {
        public illlI1lLIL(C0374o0OOo00o o0ooo00o, List<C0436o0OoO0o> list) {
            super(o0ooo00o, list, (Object) null);
        }

        public void i1LIL11l(C0436o0OoO0o o0ooo0o) throws Throwable {
            Object[] objArr;
            if (o0ooo0o.I1iIiIi().getParameterTypes().length == 0) {
                objArr = null;
            } else {
                objArr = iiIiili.this.IiIIlIL;
            }
            o0ooo0o.iL1LIlIlI((Object) null, objArr);
        }
    }

    public iiIiili(C0540o0ooOOO0 o0ooooo0) throws C0136o00O0oo {
        super(o0ooooo0.illlI1lLIL());
        this.IiIIlIL = o0ooooo0.i1LIL11l().toArray(new Object[o0ooooo0.i1LIL11l().size()]);
        this.iilLiIIIi11i = o0ooooo0.iiI1L1iI();
    }

    public void I1LiliILi1lI1(List<Throwable> list) {
        super.I1LiliILi1lI1(list);
        if (I1lLLLlliILlI() == i1LIL11l.FIELD) {
            List<o000O> ilIILlI1l11i = ilIILlI1l11i();
            int size = ilIILlI1l11i.size();
            int[] iArr = new int[size];
            for (o000O I1iIiIi : ilIILlI1l11i) {
                int value = ((Parameterized.Parameter) I1iIiIi.I1iIiIi().getAnnotation(Parameterized.Parameter.class)).value();
                if (value < 0 || value > ilIILlI1l11i.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + value + ". @Parameter fields counted: " + ilIILlI1l11i.size() + ". Please use an index between 0 and " + (ilIILlI1l11i.size() - 1) + "."));
                } else {
                    iArr[value] = iArr[value] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }

    public Annotation[] I1l1iIll1lIi1() {
        Annotation[] I1l1iIll1lIi1 = super.I1l1iIll1lIi1();
        Annotation[] annotationArr = new Annotation[(I1l1iIll1lIi1.length - 1)];
        int i = 0;
        for (Annotation annotation : I1l1iIll1lIi1) {
            if (!annotation.annotationType().equals(RunWith.class)) {
                annotationArr[i] = annotation;
                i++;
            }
        }
        return annotationArr;
    }

    public final i1LIL11l I1lLLLlliILlI() {
        if (IIL1Ll1I111()) {
            return i1LIL11l.FIELD;
        }
        return i1LIL11l.CONSTRUCTOR;
    }

    public final boolean IIL1Ll1I111() {
        return !ilIILlI1l11i().isEmpty();
    }

    public final C0374o0OOo00o IL11lll11(C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = iiLIIiIli().I1iIiIi(Parameterized.BeforeParam.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new il1LilLllii(o0ooo00o, I1iIiIi);
    }

    public C0374o0OOo00o IiiL1llIIi(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        return iiLl11ILL(IL11lll11(iilLiIIIi11i(iii1l1ii)));
    }

    public void Iiiiii1l1I1L1(List<Throwable> list) {
        iLIIl1IliLlLI(list);
        if (I1lLLLlliILlI() != i1LIL11l.CONSTRUCTOR) {
            iLiI1Llil(list);
        }
    }

    public String IilL11ii1I1Il() {
        return this.iilLiIIIi11i;
    }

    public String IillLillLLIii(C0436o0OoO0o o0ooo0o) {
        return o0ooo0o.iiIliillii() + IilL11ii1I1Il();
    }

    public final Object IllLlI1IiIL() throws Exception {
        return iiLIIiIli().iL1LIlIlI().newInstance(this.IiIIlIL);
    }

    public final C0374o0OOo00o iiLl11ILL(C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = iiLIIiIli().I1iIiIi(Parameterized.AfterParam.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new illlI1lLIL(o0ooo00o, I1iIiIi);
    }

    public final List<o000O> ilIILlI1l11i() {
        return iiLIIiIli().IiIIlIL(Parameterized.Parameter.class);
    }

    public final Object ilLIlL1ILi() throws Exception {
        List<o000O> ilIILlI1l11i = ilIILlI1l11i();
        if (ilIILlI1l11i.size() == this.IiIIlIL.length) {
            Object newInstance = iiLIIiIli().i1L1lLllLLlIi().newInstance();
            for (o000O I1iIiIi : ilIILlI1l11i) {
                Field I1iIiIi2 = I1iIiIi.I1iIiIi();
                int value = ((Parameterized.Parameter) I1iIiIi2.getAnnotation(Parameterized.Parameter.class)).value();
                try {
                    I1iIiIi2.set(newInstance, this.IiIIlIL[value]);
                } catch (IllegalAccessException e) {
                    IllegalAccessException illegalAccessException = new IllegalAccessException("Cannot set parameter '" + I1iIiIi2.getName() + "'. Ensure that the field '" + I1iIiIi2.getName() + "' is public.");
                    illegalAccessException.initCause(e);
                    throw illegalAccessException;
                } catch (IllegalArgumentException e2) {
                    throw new Exception(iiLIIiIli().IL1lILLLL1L() + ": Trying to set " + I1iIiIi2.getName() + " with the value " + this.IiIIlIL[value] + " that is not the right type (" + this.IiIIlIL[value].getClass().getSimpleName() + " instead of " + I1iIiIi2.getType().getSimpleName() + ").", e2);
                }
            }
            return newInstance;
        }
        throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + ilIILlI1l11i.size() + ", available parameters: " + this.IiIIlIL.length + ".");
    }

    public Object iliilLllIl1() throws Exception {
        i1LIL11l I1lLLLlliILlI = I1lLLLlliILlI();
        int i = iiI1L1iI.iiI1L1iI[I1lLLLlliILlI.ordinal()];
        if (i == 1) {
            return IllLlI1IiIL();
        }
        if (i == 2) {
            return ilLIlL1ILi();
        }
        throw new IllegalStateException("The injection type " + I1lLLLlliILlI + " is not supported.");
    }
}
