package top.tntok.autobot;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.Suite;

/* renamed from: top.tntok.autobot.o00Ooo0O  reason: case insensitive filesystem */
public class C0176o00Ooo0O {
    public static final String i1LIL11l = "malformed JUnit 3 test class: ";
    public final C0177o00Ooo0o iiI1L1iI;

    /* renamed from: top.tntok.autobot.o00Ooo0O$iiI1L1iI */
    public class iiI1L1iI extends C0328o0O0oo {
        public final /* synthetic */ List iiI1L1iI;

        /* renamed from: top.tntok.autobot.o00Ooo0O$iiI1L1iI$iiI1L1iI  reason: collision with other inner class name */
        public class C0002iiI1L1iI extends Suite {
            public C0002iiI1L1iI(Class cls, List list) throws C0136o00O0oo {
                super((Class<?>) cls, (List<C0346o0OO0oOO>) list);
            }
        }

        public iiI1L1iI(List list) {
            this.iiI1L1iI = list;
        }

        public C0346o0OO0oOO iLLLILIiLi1Ii() {
            try {
                return new C0002iiI1L1iI((Class) null, this.iiI1L1iI);
            } catch (C0136o00O0oo e) {
                return new C0040OoooOOO((Class<?>) null, (Throwable) e);
            }
        }
    }

    public C0176o00Ooo0O(File file) {
        this.iiI1L1iI = C0177o00Ooo0o.i1LIL11l(file);
    }

    public static C0176o00Ooo0O iILiI1lll(File file) {
        return new C0176o00Ooo0O(file);
    }

    @Deprecated
    public static C0176o00Ooo0O iiIliillii(String str) {
        return iILiI1lll(new File(str));
    }

    public o0OO000 I11lLL1(Class<?> cls) {
        return iLLLILIiLi1Ii(C0328o0O0oo.iiI1L1iI(cls));
    }

    public o0OO000 IiIIlIL(C0328o0O0oo o0o0oo, C0148o00OOooO o00ooooo) {
        o00ooooo.iiI1L1iI(this.iiI1L1iI.iilLil1i11I1());
        return o00ooooo.iLLLILIiLi1Ii(iilLiIIIi11i(o0o0oo).iLLLILIiLi1Ii());
    }

    public List<C0009OooO0oO> IiiL1llIIi(C0328o0O0oo o0o0oo) {
        return illlI1lLIL(iilLiIIIi11i(o0o0oo));
    }

    public final C0328o0O0oo i1LIL11l(List<C0009OooO0oO> list) {
        ArrayList arrayList = new ArrayList();
        for (C0009OooO0oO iiI1L1iI2 : list) {
            arrayList.add(iiI1L1iI(iiI1L1iI2));
        }
        return new iiI1L1iI(arrayList);
    }

    public o0OO000 iLLLILIiLi1Ii(C0328o0O0oo o0o0oo) {
        return IiIIlIL(o0o0oo, new C0148o00OOooO());
    }

    public final C0346o0OO0oOO iiI1L1iI(C0009OooO0oO oooO0oO) {
        if (oooO0oO.toString().equals("TestSuite with 0 tests")) {
            return Suite.IIlLill();
        }
        if (oooO0oO.toString().startsWith(i1LIL11l)) {
            return new o00OOO((C0532o0oOo0o0) new C0432o0OoO000(iilLil1i11I1(oooO0oO)));
        }
        Class<?> Ii1liIIIiLi = oooO0oO.Ii1liIIIiLi();
        if (Ii1liIIIiLi != null) {
            String i111iLiiIIill = oooO0oO.i111iLiiIIill();
            if (i111iLiiIIill == null) {
                return C0328o0O0oo.iiI1L1iI(Ii1liIIIiLi).iLLLILIiLi1Ii();
            }
            return C0328o0O0oo.IiIIlIL(Ii1liIIIiLi, i111iLiiIIill).iLLLILIiLi1Ii();
        }
        throw new RuntimeException("Can't build a runner from description [" + oooO0oO + "]");
    }

    public C0328o0O0oo iilLiIIIi11i(C0328o0O0oo o0o0oo) {
        if (o0o0oo instanceof C0368o0OOOoo) {
            return o0o0oo;
        }
        List<C0009OooO0oO> illlI1lLIL = illlI1lLIL(o0o0oo);
        Collections.sort(illlI1lLIL, this.iiI1L1iI.IiiL1llIIi());
        return i1LIL11l(illlI1lLIL);
    }

    public final Class<?> iilLil1i11I1(C0009OooO0oO oooO0oO) {
        try {
            return Class.forName(oooO0oO.toString().replace(i1LIL11l, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void il1LilLllii(C0009OooO0oO oooO0oO, C0009OooO0oO oooO0oO2, List<C0009OooO0oO> list) {
        if (!oooO0oO2.i1L1lLllLLlIi().isEmpty()) {
            Iterator<C0009OooO0oO> it = oooO0oO2.i1L1lLllLLlIi().iterator();
            while (it.hasNext()) {
                il1LilLllii(oooO0oO2, it.next(), list);
            }
        } else if (oooO0oO2.toString().equals("warning(junit.framework.TestSuite$1)")) {
            list.add(C0009OooO0oO.iilLil1i11I1(i1LIL11l + oooO0oO, new Annotation[0]));
        } else {
            list.add(oooO0oO2);
        }
    }

    public final List<C0009OooO0oO> illlI1lLIL(C0328o0O0oo o0o0oo) {
        ArrayList arrayList = new ArrayList();
        il1LilLllii((C0009OooO0oO) null, o0o0oo.iLLLILIiLi1Ii().iiI1L1iI(), arrayList);
        return arrayList;
    }
}
