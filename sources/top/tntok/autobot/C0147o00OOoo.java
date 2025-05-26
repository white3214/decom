package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import top.tntok.autobot.o000O00O;

/* renamed from: top.tntok.autobot.o00OOoo  reason: case insensitive filesystem */
public class C0147o00OOoo {
    public final List<Class<?>> i1LIL11l = new ArrayList();
    public final List<String> iiI1L1iI = new ArrayList();
    public final List<Throwable> illlI1lLIL = new ArrayList();

    /* renamed from: top.tntok.autobot.o00OOoo$iiI1L1iI */
    public static class iiI1L1iI extends Exception {
        private static final long serialVersionUID = 1;

        public iiI1L1iI(String str) {
            super(str);
        }
    }

    public static C0147o00OOoo I11lLL1(String[] strArr) {
        C0147o00OOoo o00oooo = new C0147o00OOoo();
        o00oooo.iLLLILIiLi1Ii(strArr);
        return o00oooo;
    }

    public String[] IiIIlIL(String... strArr) {
        String str;
        int i = 0;
        while (true) {
            if (i == strArr.length) {
                break;
            }
            String str2 = strArr[i];
            if (str2.equals("--")) {
                return i1LIL11l(strArr, i + 1, strArr.length);
            }
            if (!str2.startsWith("--")) {
                return i1LIL11l(strArr, i, strArr.length);
            }
            if (str2.startsWith("--filter=") || str2.equals("--filter")) {
                if (str2.equals("--filter")) {
                    i++;
                    if (i >= strArr.length) {
                        List<Throwable> list = this.illlI1lLIL;
                        list.add(new iiI1L1iI(str2 + " value not specified"));
                        break;
                    }
                    str = strArr[i];
                } else {
                    str = str2.substring(str2.indexOf(61) + 1);
                }
                this.iiI1L1iI.add(str);
            } else {
                List<Throwable> list2 = this.illlI1lLIL;
                list2.add(new iiI1L1iI("JUnit knows nothing about the " + str2 + " option"));
            }
            i++;
        }
        return new String[0];
    }

    public final String[] i1LIL11l(String[] strArr, int i, int i2) {
        String[] strArr2 = new String[(i2 - i)];
        for (int i3 = i; i3 != i2; i3++) {
            strArr2[i3 - i] = strArr[i3];
        }
        return strArr2;
    }

    public final void iLLLILIiLi1Ii(String[] strArr) {
        iilLiIIIi11i(IiIIlIL(strArr));
    }

    public final C0328o0O0oo iiI1L1iI(C0328o0O0oo o0o0oo) {
        try {
            for (String iiIliillii : this.iiI1L1iI) {
                o0o0oo = o0o0oo.I11lLL1(o000O00.iiIliillii(o0o0oo, iiIliillii));
            }
            return o0o0oo;
        } catch (o000O00O.iiI1L1iI e) {
            return il1LilLllii(e);
        }
    }

    public List<Class<?>> iiIliillii() {
        return Collections.unmodifiableList(this.i1LIL11l);
    }

    public void iilLiIIIi11i(String[] strArr) {
        for (String str : strArr) {
            try {
                this.i1LIL11l.add(I1LLLIIll.iiI1L1iI(str));
            } catch (ClassNotFoundException e) {
                this.illlI1lLIL.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }

    public List<String> iilLil1i11I1() {
        return Collections.unmodifiableList(this.iiI1L1iI);
    }

    public final C0328o0O0oo il1LilLllii(Throwable th) {
        return C0328o0O0oo.iiIliillii(C0147o00OOoo.class, th);
    }

    public C0328o0O0oo illlI1lLIL(i1LlIiLL1 i1lliill1) {
        if (!this.illlI1lLIL.isEmpty()) {
            return il1LilLllii(new C0136o00O0oo(this.illlI1lLIL));
        }
        List<Class<?>> list = this.i1LIL11l;
        return iiI1L1iI(C0328o0O0oo.illlI1lLIL(i1lliill1, (Class[]) list.toArray(new Class[list.size()])));
    }
}
