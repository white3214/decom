package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.validator.ValidateWith;

public final class IIi1l1i implements C0419o0Oo0OoO {
    public static final List<i1LIL11l<?>> iiI1L1iI = Arrays.asList(new i1LIL11l[]{new illlI1lLIL(), new iiIliillii(), new il1LilLllii()});

    public static abstract class i1LIL11l<T extends illiiliIILI> {
        public static final illi1LIILLiL iiI1L1iI = new illi1LIILLiL();

        public i1LIL11l() {
        }

        public final List<Exception> i1LIL11l(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotationType : t.i1LIL11l()) {
                ValidateWith validateWith = (ValidateWith) annotationType.annotationType().getAnnotation(ValidateWith.class);
                if (validateWith != null) {
                    arrayList.addAll(illlI1lLIL(iiI1L1iI.iiI1L1iI(validateWith), t));
                }
            }
            return arrayList;
        }

        public abstract Iterable<T> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0);

        public List<Exception> il1LilLllii(C0418o0Oo0Oo0 o0oo0oo0) {
            ArrayList arrayList = new ArrayList();
            for (illiiliIILI i1LIL11l : iiI1L1iI(o0oo0oo0)) {
                arrayList.addAll(i1LIL11l(i1LIL11l));
            }
            return arrayList;
        }

        public abstract List<Exception> illlI1lLIL(i1iLlIill1I i1illiill1i, T t);
    }

    public static class iiIliillii extends i1LIL11l<C0436o0OoO0o> {
        public iiIliillii() {
            super();
        }

        public Iterable<C0436o0OoO0o> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0) {
            return o0oo0oo0.iILiI1lll();
        }

        /* renamed from: iiIliillii */
        public List<Exception> illlI1lLIL(i1iLlIill1I i1illiill1i, C0436o0OoO0o o0ooo0o) {
            return i1illiill1i.illlI1lLIL(o0ooo0o);
        }
    }

    public static class il1LilLllii extends i1LIL11l<o000O> {
        public il1LilLllii() {
            super();
        }

        public Iterable<o000O> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0) {
            return o0oo0oo0.iLLLILIiLi1Ii();
        }

        /* renamed from: iiIliillii */
        public List<Exception> illlI1lLIL(i1iLlIill1I i1illiill1i, o000O o000o) {
            return i1illiill1i.i1LIL11l(o000o);
        }
    }

    public static class illlI1lLIL extends i1LIL11l<C0418o0Oo0Oo0> {
        public illlI1lLIL() {
            super();
        }

        public Iterable<C0418o0Oo0Oo0> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0) {
            return Collections.singletonList(o0oo0oo0);
        }

        /* renamed from: iiIliillii */
        public List<Exception> illlI1lLIL(i1iLlIill1I i1illiill1i, C0418o0Oo0Oo0 o0oo0oo0) {
            return i1illiill1i.iiI1L1iI(o0oo0oo0);
        }
    }

    public List<Exception> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0) {
        ArrayList arrayList = new ArrayList();
        for (i1LIL11l<?> il1LilLllii2 : iiI1L1iI) {
            arrayList.addAll(il1LilLllii2.il1LilLllii(o0oo0oo0));
        }
        return arrayList;
    }
}
