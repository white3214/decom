package top.tntok.autobot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.OrderWith;

/* renamed from: top.tntok.autobot.o0OOoooO  reason: case insensitive filesystem */
public abstract class C0402o0OOoooO {
    public final Set<Class<?>> iiI1L1iI = new HashSet();

    public final List<C0346o0OO0oOO> I11lLL1(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> iLLLILIiLi1Ii : clsArr) {
            C0346o0OO0oOO iLLLILIiLi1Ii2 = iLLLILIiLi1Ii(iLLLILIiLi1Ii);
            if (iLLLILIiLi1Ii2 != null) {
                arrayList.add(iLLLILIiLi1Ii2);
            }
        }
        return arrayList;
    }

    public final void i1LIL11l(C0346o0OO0oOO o0oo0ooo) throws o00OO0OO {
        C0009OooO0oO iiI1L1iI2 = o0oo0ooo.iiI1L1iI();
        OrderWith orderWith = (OrderWith) iiI1L1iI2.iILiI1lll(OrderWith.class);
        if (orderWith != null) {
            C0261o00ooO0o.illlI1lLIL(orderWith.value(), iiI1L1iI2).i1LIL11l(o0oo0ooo);
        }
    }

    public C0346o0OO0oOO iLLLILIiLi1Ii(Class<?> cls) {
        try {
            C0346o0OO0oOO il1LilLllii = il1LilLllii(cls);
            if (il1LilLllii != null) {
                i1LIL11l(il1LilLllii);
            }
            return il1LilLllii;
        } catch (Throwable th) {
            return new C0040OoooOOO(cls, th);
        }
    }

    public Class<?> iiI1L1iI(Class<?> cls) throws C0136o00O0oo {
        if (this.iiI1L1iI.add(cls)) {
            return cls;
        }
        throw new C0136o00O0oo(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", new Object[]{cls.getName()}));
    }

    public List<C0346o0OO0oOO> iiIliillii(Class<?> cls, List<Class<?>> list) throws C0136o00O0oo {
        return iilLil1i11I1(cls, (Class[]) list.toArray(new Class[0]));
    }

    public List<C0346o0OO0oOO> iilLil1i11I1(Class<?> cls, Class<?>[] clsArr) throws C0136o00O0oo {
        iiI1L1iI(cls);
        try {
            return I11lLL1(clsArr);
        } finally {
            illlI1lLIL(cls);
        }
    }

    public abstract C0346o0OO0oOO il1LilLllii(Class<?> cls) throws Throwable;

    public void illlI1lLIL(Class<?> cls) {
        this.iiI1L1iI.remove(cls);
    }
}
