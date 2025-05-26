package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.ClassRule;
import org.junit.Rule;

/* renamed from: top.tntok.autobot.o0OO0o0o  reason: case insensitive filesystem */
public class C0345o0OO0o0o {
    public static final C0345o0OO0o0o I11lLL1 = iLLLILIiLi1Ii().iiIliillii().iilLil1i11I1(new iilLil1i11I1()).iilLil1i11I1(new I11lLL1()).iilLil1i11I1(new IiIIlIL()).il1LilLllii();
    public static final C0345o0OO0o0o iiIliillii = iLLLILIiLi1Ii().iilLil1i11I1(new iilLil1i11I1()).iilLil1i11I1(new I11lLL1()).iilLil1i11I1(new il1LilLllii()).il1LilLllii();
    public static final C0345o0OO0o0o iilLil1i11I1 = il1LilLllii().iiIliillii().iilLil1i11I1(new illlI1lLIL()).iilLil1i11I1(new iLLLILIiLi1Ii()).iilLil1i11I1(new I11lLL1()).iilLil1i11I1(new iilLiIIIi11i()).il1LilLllii();
    public static final C0345o0OO0o0o il1LilLllii = il1LilLllii().iilLil1i11I1(new illlI1lLIL()).iilLil1i11I1(new iLLLILIiLi1Ii()).iilLil1i11I1(new I11lLL1()).iilLil1i11I1(new iiIliillii()).il1LilLllii();
    public final boolean i1LIL11l;
    public final Class<? extends Annotation> iiI1L1iI;
    public final List<IiiL1llIIi> illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OO0o0o$I11lLL1 */
    public static final class I11lLL1 implements IiiL1llIIi {
        public I11lLL1() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!o000oo00.IiIIlIL()) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must be public."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$IiIIlIL */
    public static final class IiIIlIL implements IiiL1llIIi {
        public IiIIlIL() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C0345o0OO0o0o.iilLil1i11I1(o000oo00)) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must return an implementation of MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$IiiL1llIIi */
    public interface IiiL1llIIi {
        void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list);
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$i1LIL11l */
    public static class i1LIL11l {
        public boolean i1LIL11l;
        public final Class<? extends Annotation> iiI1L1iI;
        public final List<IiiL1llIIi> illlI1lLIL;

        public i1LIL11l iiIliillii() {
            this.i1LIL11l = true;
            return this;
        }

        public i1LIL11l iilLil1i11I1(IiiL1llIIi iiiL1llIIi) {
            this.illlI1lLIL.add(iiiL1llIIi);
            return this;
        }

        public C0345o0OO0o0o il1LilLllii() {
            return new C0345o0OO0o0o(this);
        }

        public i1LIL11l(Class<? extends Annotation> cls) {
            this.iiI1L1iI = cls;
            this.i1LIL11l = false;
            this.illlI1lLIL = new ArrayList();
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$iLLLILIiLi1Ii */
    public static final class iLLLILIiLi1Ii implements IiiL1llIIi {
        public iLLLILIiLi1Ii() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!o000oo00.IiiL1llIIi()) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must be static."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$iiIliillii */
    public static final class iiIliillii implements IiiL1llIIi {
        public iiIliillii() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C0345o0OO0o0o.I11lLL1(o000oo00)) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must implement TestRule."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$iilLiIIIi11i */
    public static final class iilLiIIIi11i implements IiiL1llIIi {
        public iilLiIIIi11i() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C0345o0OO0o0o.I11lLL1(o000oo00)) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must return an implementation of TestRule."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$iilLil1i11I1 */
    public static final class iilLil1i11I1 implements IiiL1llIIi {
        public iilLil1i11I1() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean z;
            String str;
            boolean iiI1L1iI = C0345o0OO0o0o.iiIliillii(o000oo00);
            if (o000oo00.iiI1L1iI(ClassRule.class) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!o000oo00.IiiL1llIIi()) {
                return;
            }
            if (iiI1L1iI || !z) {
                if (C0345o0OO0o0o.iiIliillii(o000oo00)) {
                    str = "must not be static.";
                } else {
                    str = "must not be static or it must be annotated with @ClassRule.";
                }
                list.add(new C0490o0o0000o(o000oo00, cls, str));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$il1LilLllii */
    public static final class il1LilLllii implements IiiL1llIIi {
        public il1LilLllii() {
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C0345o0OO0o0o.iilLil1i11I1(o000oo00)) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must implement MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0o$illlI1lLIL */
    public static final class illlI1lLIL implements IiiL1llIIi {
        public illlI1lLIL() {
        }

        public final boolean i1LIL11l(o000OO00<?> o000oo00) {
            return Modifier.isPublic(o000oo00.illlI1lLIL().getModifiers());
        }

        public void iiI1L1iI(o000OO00<?> o000oo00, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!i1LIL11l(o000oo00)) {
                list.add(new C0490o0o0000o(o000oo00, cls, "must be declared in a public class."));
            }
        }
    }

    public C0345o0OO0o0o(i1LIL11l i1lil11l) {
        this.iiI1L1iI = i1lil11l.iiI1L1iI;
        this.i1LIL11l = i1lil11l.i1LIL11l;
        this.illlI1lLIL = i1lil11l.illlI1lLIL;
    }

    public static boolean I11lLL1(o000OO00<?> o000oo00) {
        return C0429o0Oo0ooO.class.isAssignableFrom(o000oo00.iilLil1i11I1());
    }

    public static i1LIL11l iLLLILIiLi1Ii() {
        return new i1LIL11l(Rule.class);
    }

    public static boolean iiIliillii(o000OO00<?> o000oo00) {
        return C0183o00Ooooo.class.isAssignableFrom(o000oo00.iilLil1i11I1());
    }

    public static boolean iilLil1i11I1(o000OO00<?> o000oo00) {
        if (iiIliillii(o000oo00) || I11lLL1(o000oo00)) {
            return true;
        }
        return false;
    }

    public static i1LIL11l il1LilLllii() {
        return new i1LIL11l(ClassRule.class);
    }

    public void IiIIlIL(C0418o0Oo0Oo0 o0oo0oo0, List<Throwable> list) {
        List<o000OO00> list2;
        if (this.i1LIL11l) {
            list2 = o0oo0oo0.I1iIiIi(this.iiI1L1iI);
        } else {
            list2 = o0oo0oo0.IiIIlIL(this.iiI1L1iI);
        }
        for (o000OO00 iilLiIIIi11i2 : list2) {
            iilLiIIIi11i(iilLiIIIi11i2, list);
        }
    }

    public final void iilLiIIIi11i(o000OO00<?> o000oo00, List<Throwable> list) {
        for (IiiL1llIIi iiI1L1iI2 : this.illlI1lLIL) {
            iiI1L1iI2.iiI1L1iI(o000oo00, this.iiI1L1iI, list);
        }
    }
}
