package top.tntok.autobot;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import top.tntok.autobot.o0O0OOOo;

public class I1I11Il1 extends C0267o00ooOoO {
    public final C0418o0Oo0Oo0 iiI1L1iI;

    public static class i1LIL11l extends o0O0OOOo {
        public final C0436o0OoO0o iiI1L1iI;

        public String i1LIL11l() throws o0O0OOOo.i1LIL11l {
            return this.iiI1L1iI.iiIliillii();
        }

        public Object illlI1lLIL() throws o0O0OOOo.i1LIL11l {
            boolean z = false;
            try {
                return this.iiI1L1iI.iL1LIlIlI((Object) null, new Object[0]);
            } catch (IllegalArgumentException unused) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (Throwable th) {
                DataPoint dataPoint = (DataPoint) this.iiI1L1iI.iiI1L1iI(DataPoint.class);
                if (dataPoint == null || !I1I11Il1.IL1lILLLL1L(dataPoint.ignoredExceptions(), th)) {
                    z = true;
                }
                I1LiliILi1lI1.IiIIlIL(z);
                throw new o0O0OOOo.i1LIL11l(th);
            }
        }

        public i1LIL11l(C0436o0OoO0o o0ooo0o) {
            this.iiI1L1iI = o0ooo0o;
        }
    }

    public I1I11Il1(C0418o0Oo0Oo0 o0oo0oo0) {
        this.iiI1L1iI = o0oo0oo0;
    }

    public static boolean IL1lILLLL1L(Class<?>[] clsArr, Object obj) {
        for (Class<?> isAssignableFrom : clsArr) {
            if (isAssignableFrom.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final void I11lLL1(C0265o00ooOo o00oooo, List<o0O0OOOo> list) throws Throwable {
        for (C0436o0OoO0o next : IiiL1llIIi(o00oooo)) {
            Class<?> IL1lILLLL1L = next.IL1lILLLL1L();
            if ((IL1lILLLL1L.isArray() && o00oooo.il1LilLllii(IL1lILLLL1L.getComponentType())) || Iterable.class.isAssignableFrom(IL1lILLLL1L)) {
                try {
                    il1LilLllii(IL1lILLLL1L, o00oooo, next.iiIliillii(), list, next.iL1LIlIlI((Object) null, new Object[0]));
                } catch (Throwable th) {
                    DataPoints dataPoints = (DataPoints) next.iiI1L1iI(DataPoints.class);
                    if (dataPoints == null || !IL1lILLLL1L(dataPoints.ignoredExceptions(), th)) {
                        throw th;
                    }
                    return;
                }
            }
        }
    }

    public Collection<C0436o0OoO0o> I1iIiIi(C0265o00ooOo o00oooo) {
        return this.iiI1L1iI.I1iIiIi(DataPoint.class);
    }

    public final void IiIIlIL(C0265o00ooOo o00oooo, List<o0O0OOOo> list) {
        for (C0436o0OoO0o next : I1iIiIi(o00oooo)) {
            if (o00oooo.i1LIL11l(next.iilLil1i11I1())) {
                list.add(new i1LIL11l(next));
            }
        }
    }

    public Collection<C0436o0OoO0o> IiiL1llIIi(C0265o00ooOo o00oooo) {
        return this.iiI1L1iI.I1iIiIi(DataPoints.class);
    }

    public final Object i1L1lLllLLlIi(Field field) {
        try {
            return field.get((Object) null);
        } catch (IllegalArgumentException unused) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        }
    }

    public Collection<Field> iILiI1lll(C0265o00ooOo o00oooo) {
        List<o000O> IiIIlIL = this.iiI1L1iI.IiIIlIL(DataPoint.class);
        ArrayList arrayList = new ArrayList();
        for (o000O I1iIiIi : IiIIlIL) {
            arrayList.add(I1iIiIi.I1iIiIi());
        }
        return arrayList;
    }

    public final void iLLLILIiLi1Ii(C0265o00ooOo o00oooo, List<o0O0OOOo> list) {
        for (Field next : iILiI1lll(o00oooo)) {
            Object i1L1lLllLLlIi = i1L1lLllLLlIi(next);
            if (o00oooo.illlI1lLIL(i1L1lLllLLlIi)) {
                list.add(o0O0OOOo.iiI1L1iI(next.getName(), i1L1lLllLLlIi));
            }
        }
    }

    public List<o0O0OOOo> iiI1L1iI(C0265o00ooOo o00oooo) throws Throwable {
        ArrayList arrayList = new ArrayList();
        iLLLILIiLi1Ii(o00oooo, arrayList);
        iilLil1i11I1(o00oooo, arrayList);
        IiIIlIL(o00oooo, arrayList);
        I11lLL1(o00oooo, arrayList);
        return arrayList;
    }

    public final void iiIliillii(C0265o00ooOo o00oooo, String str, List<o0O0OOOo> list, Iterable<?> iterable) {
        int i = 0;
        for (Object next : iterable) {
            if (o00oooo.illlI1lLIL(next)) {
                list.add(o0O0OOOo.iiI1L1iI(str + "[" + i + "]", next));
            }
            i++;
        }
    }

    public Collection<Field> iilLiIIIi11i(C0265o00ooOo o00oooo) {
        List<o000O> IiIIlIL = this.iiI1L1iI.IiIIlIL(DataPoints.class);
        ArrayList arrayList = new ArrayList();
        for (o000O I1iIiIi : IiIIlIL) {
            arrayList.add(I1iIiIi.I1iIiIi());
        }
        return arrayList;
    }

    public final void iilLil1i11I1(C0265o00ooOo o00oooo, List<o0O0OOOo> list) {
        for (Field next : iilLiIIIi11i(o00oooo)) {
            il1LilLllii(next.getType(), o00oooo, next.getName(), list, i1L1lLllLLlIi(next));
        }
    }

    public final void il1LilLllii(Class<?> cls, C0265o00ooOo o00oooo, String str, List<o0O0OOOo> list, Object obj) {
        if (cls.isArray()) {
            illlI1lLIL(o00oooo, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            iiIliillii(o00oooo, str, list, (Iterable) obj);
        }
    }

    public final void illlI1lLIL(C0265o00ooOo o00oooo, String str, List<o0O0OOOo> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (o00oooo.illlI1lLIL(obj2)) {
                list.add(o0O0OOOo.iiI1L1iI(str + "[" + i + "]", obj2));
            }
        }
    }
}
