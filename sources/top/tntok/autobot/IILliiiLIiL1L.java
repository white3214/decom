package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;
import top.tntok.autobot.o000O00O;

public abstract class IILliiiLIiL1L implements o000O00O {
    public abstract o000O0O i1LIL11l(List<Class<?>> list);

    public o000O0O iiI1L1iI(o000O0 o000o0) throws o000O00O.iiI1L1iI {
        try {
            return i1LIL11l(illlI1lLIL(o000o0.iiI1L1iI()));
        } catch (ClassNotFoundException e) {
            throw new o000O00O.iiI1L1iI(e);
        }
    }

    public final List<Class<?>> illlI1lLIL(String str) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String i1LIL11l : str.split(",")) {
            arrayList.add(I1LLLIIll.i1LIL11l(i1LIL11l, getClass()));
        }
        return arrayList;
    }
}
