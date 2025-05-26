package top.tntok.autobot;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;

/* renamed from: top.tntok.autobot.o0OOOooo  reason: case insensitive filesystem */
public class C0371o0OOOooo extends I1I11Il1 {
    public C0371o0OOOooo(C0418o0Oo0Oo0 o0oo0oo0) {
        super(o0oo0oo0);
    }

    public Collection<C0436o0OoO0o> I1iIiIi(C0265o00ooOo o00oooo) {
        Collection<C0436o0OoO0o> I1iIiIi = super.I1iIiIi(o00oooo);
        String value = ((FromDataPoints) o00oooo.I11lLL1(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (C0436o0OoO0o next : I1iIiIi) {
            if (Arrays.asList(((DataPoint) next.iiI1L1iI(DataPoint.class)).value()).contains(value)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<C0436o0OoO0o> IiiL1llIIi(C0265o00ooOo o00oooo) {
        Collection<C0436o0OoO0o> IiiL1llIIi = super.IiiL1llIIi(o00oooo);
        String value = ((FromDataPoints) o00oooo.I11lLL1(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (C0436o0OoO0o next : IiiL1llIIi) {
            if (Arrays.asList(((DataPoints) next.iiI1L1iI(DataPoints.class)).value()).contains(value)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<Field> iILiI1lll(C0265o00ooOo o00oooo) {
        Collection<Field> iILiI1lll = super.iILiI1lll(o00oooo);
        String value = ((FromDataPoints) o00oooo.I11lLL1(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field next : iILiI1lll) {
            if (Arrays.asList(((DataPoint) next.getAnnotation(DataPoint.class)).value()).contains(value)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<Field> iilLiIIIi11i(C0265o00ooOo o00oooo) {
        Collection<Field> iilLiIIIi11i = super.iilLiIIIi11i(o00oooo);
        String value = ((FromDataPoints) o00oooo.I11lLL1(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field next : iilLiIIIi11i) {
            if (Arrays.asList(((DataPoints) next.getAnnotation(DataPoints.class)).value()).contains(value)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
