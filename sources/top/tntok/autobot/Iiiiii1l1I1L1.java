package top.tntok.autobot;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.ParametersSuppliedBy;
import top.tntok.autobot.o0O0OOOo;

public class Iiiiii1l1I1L1 {
    public final List<C0265o00ooOo> i1LIL11l;
    public final List<o0O0OOOo> iiI1L1iI;
    public final C0418o0Oo0Oo0 illlI1lLIL;

    public Iiiiii1l1I1L1(List<o0O0OOOo> list, List<C0265o00ooOo> list2, C0418o0Oo0Oo0 o0oo0oo0) {
        this.i1LIL11l = list2;
        this.iiI1L1iI = list;
        this.illlI1lLIL = o0oo0oo0;
    }

    public static Iiiiii1l1I1L1 iiI1L1iI(Method method, C0418o0Oo0Oo0 o0oo0oo0) {
        List<C0265o00ooOo> IL1lILLLL1L = C0265o00ooOo.IL1lILLLL1L(o0oo0oo0.iL1LIlIlI());
        IL1lILLLL1L.addAll(C0265o00ooOo.I1iIiIi(method));
        return new Iiiiii1l1I1L1(new ArrayList(), IL1lILLLL1L, o0oo0oo0);
    }

    public Object[] I11lLL1(boolean z) throws o0O0OOOo.i1LIL11l {
        int size = this.iiI1L1iI.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.iiI1L1iI.get(i).i1LIL11l();
        }
        return objArr;
    }

    public C0265o00ooOo I1iIiIi() {
        return this.i1LIL11l.get(0);
    }

    public final int IiIIlIL() {
        return C0265o00ooOo.IL1lILLLL1L(this.illlI1lLIL.iL1LIlIlI()).size();
    }

    public final C0267o00ooOoO IiiL1llIIi(C0265o00ooOo o00oooo) throws Exception {
        ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) o00oooo.iiIliillii(ParametersSuppliedBy.class);
        if (parametersSuppliedBy != null) {
            return illlI1lLIL(parametersSuppliedBy.value());
        }
        return new I1I11Il1(this.illlI1lLIL);
    }

    public List<o0O0OOOo> i1L1lLllLLlIi() throws Throwable {
        C0265o00ooOo I1iIiIi = I1iIiIi();
        List<o0O0OOOo> iiI1L1iI2 = IiiL1llIIi(I1iIiIi).iiI1L1iI(I1iIiIi);
        if (iiI1L1iI2.isEmpty()) {
            return il1LilLllii(I1iIiIi);
        }
        return iiI1L1iI2;
    }

    public Iiiiii1l1I1L1 i1LIL11l(o0O0OOOo o0o0oooo) {
        ArrayList arrayList = new ArrayList(this.iiI1L1iI);
        arrayList.add(o0o0oooo);
        List<C0265o00ooOo> list = this.i1LIL11l;
        return new Iiiiii1l1I1L1(arrayList, list.subList(1, list.size()), this.illlI1lLIL);
    }

    public boolean iILiI1lll() {
        return this.i1LIL11l.isEmpty();
    }

    public Object[] iLLLILIiLi1Ii() throws o0O0OOOo.i1LIL11l {
        return iiIliillii(0, IiIIlIL());
    }

    public Object[] iiIliillii(int i, int i2) throws o0O0OOOo.i1LIL11l {
        Object[] objArr = new Object[(i2 - i)];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.iiI1L1iI.get(i3).illlI1lLIL();
        }
        return objArr;
    }

    public Object[] iilLiIIIi11i() throws o0O0OOOo.i1LIL11l {
        return iiIliillii(IiIIlIL(), this.iiI1L1iI.size());
    }

    public Object[] iilLil1i11I1() throws o0O0OOOo.i1LIL11l {
        return iiIliillii(0, this.iiI1L1iI.size());
    }

    public final List<o0O0OOOo> il1LilLllii(C0265o00ooOo o00oooo) {
        Class<?> IiIIlIL = o00oooo.IiIIlIL();
        if (IiIIlIL.isEnum()) {
            return new C0035OoooO(IiIIlIL).iiI1L1iI(o00oooo);
        }
        if (IiIIlIL.equals(Boolean.class) || IiIIlIL.equals(Boolean.TYPE)) {
            return new iLLlLIIliLl().iiI1L1iI(o00oooo);
        }
        return Collections.emptyList();
    }

    public final C0267o00ooOoO illlI1lLIL(Class<? extends C0267o00ooOoO> cls) throws Exception {
        Constructor[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 1 || !parameterTypes[0].equals(C0418o0Oo0Oo0.class)) {
                i++;
            } else {
                return (C0267o00ooOoO) constructor.newInstance(new Object[]{this.illlI1lLIL});
            }
        }
        return (C0267o00ooOoO) cls.newInstance();
    }
}
