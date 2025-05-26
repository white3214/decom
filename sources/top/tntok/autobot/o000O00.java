package top.tntok.autobot;

import top.tntok.autobot.o000O00O;

public class o000O00 {
    public static o000O0O i1LIL11l(String str, o000O0 o000o0) throws o000O00O.iiI1L1iI {
        return il1LilLllii(str).iiI1L1iI(o000o0);
    }

    public static o000O0O iiI1L1iI(Class<? extends o000O00O> cls, o000O0 o000o0) throws o000O00O.iiI1L1iI {
        return illlI1lLIL(cls).iiI1L1iI(o000o0);
    }

    public static o000O0O iiIliillii(C0328o0O0oo o0o0oo, String str) throws o000O00O.iiI1L1iI {
        String[] strArr;
        C0009OooO0oO iiI1L1iI = o0o0oo.iLLLILIiLi1Ii().iiI1L1iI();
        if (str.contains("=")) {
            strArr = str.split("=", 2);
        } else {
            strArr = new String[]{str, ""};
        }
        return i1LIL11l(strArr[0], new o000O0(iiI1L1iI, strArr[1]));
    }

    public static o000O00O il1LilLllii(String str) throws o000O00O.iiI1L1iI {
        try {
            return illlI1lLIL(I1LLLIIll.iiI1L1iI(str).asSubclass(o000O00O.class));
        } catch (Exception e) {
            throw new o000O00O.iiI1L1iI(e);
        }
    }

    public static o000O00O illlI1lLIL(Class<? extends o000O00O> cls) throws o000O00O.iiI1L1iI {
        try {
            return (o000O00O) cls.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception e) {
            throw new o000O00O.iiI1L1iI(e);
        }
    }
}
