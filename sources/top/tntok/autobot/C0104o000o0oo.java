package top.tntok.autobot;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import top.tntok.autobot.C0094o000o000;

/* renamed from: top.tntok.autobot.o000o0oo  reason: case insensitive filesystem */
public final class C0104o000o0oo {
    public static final ili11iILI1l i1LIL11l = ili11iILI1l.IiiL1llIIi("\t ,=");
    public static final ili11iILI1l iiI1L1iI = ili11iILI1l.IiiL1llIIi("\"\\");

    public static List<I1I1liIIL> I11lLL1(C0094o000o000 o000o000, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < o000o000.I1iIiIi(); i++) {
            if (str.equalsIgnoreCase(o000o000.iLLLILIiLi1Ii(i))) {
                iilLil1i11I1(arrayList, new IiILIlLLiIL().illiiliIILI(o000o000.IL1lILLLL1L(i)));
            }
        }
        return arrayList;
    }

    public static int I1iIiIi(IiILIlLLiIL iiILIlLLiIL, byte b) {
        int i = 0;
        while (!iiILIlLLiIL.Il1llillili() && iiILIlLLiIL.ilLIlLiIILl1(0) == b) {
            i++;
            iiILIlLLiIL.readByte();
        }
        return i;
    }

    public static C0094o000o000 I1l1iIll1lIi1(C0094o000o000 o000o000, C0094o000o000 o000o0002) {
        Set<String> Ii1liIIIiLi = Ii1liIIIiLi(o000o0002);
        if (Ii1liIIIiLi.isEmpty()) {
            return C0487o0OooooO.illlI1lLIL;
        }
        C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
        int I1iIiIi = o000o000.I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            String iLLLILIiLi1Ii = o000o000.iLLLILIiLi1Ii(i);
            if (Ii1liIIIiLi.contains(iLLLILIiLi1Ii)) {
                iii1l1ii.i1LIL11l(iLLLILIiLi1Ii, o000o000.IL1lILLLL1L(i));
            }
        }
        return iii1l1ii.IiIIlIL();
    }

    public static int IL1lILLLL1L(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    public static boolean ILl1iII11Ll1(C0337o0O0oooO o0o0oooo, C0094o000o000 o000o000, C0333o0O0ooO0 o0o0ooo0) {
        for (String next : IilL11ii1I1Il(o0o0oooo)) {
            if (!Objects.equals(o000o000.iL1LIlIlI(next), o0o0ooo0.il1LilLllii(next))) {
                return false;
            }
        }
        return true;
    }

    public static Set<String> Ii1liIIIiLi(C0094o000o000 o000o000) {
        Set<String> emptySet = Collections.emptySet();
        int I1iIiIi = o000o000.I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            if ("Vary".equalsIgnoreCase(o000o000.iLLLILIiLi1Ii(i))) {
                String IL1lILLLL1L = o000o000.IL1lILLLL1L(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : IL1lILLLL1L.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    public static String IiIIlIL(IiILIlLLiIL iiILIlLLiIL) {
        if (iiILIlLLiIL.readByte() == 34) {
            IiILIlLLiIL iiILIlLLiIL2 = new IiILIlLLiIL();
            while (true) {
                long I11lLL1 = iiILIlLLiIL.I11lLL1(iiI1L1iI);
                if (I11lLL1 == -1) {
                    return null;
                }
                if (iiILIlLLiIL.ilLIlLiIILl1(I11lLL1) == 34) {
                    iiILIlLLiIL2.I1iIiIi(iiILIlLLiIL, I11lLL1);
                    iiILIlLLiIL.readByte();
                    return iiILIlLLiIL2.illi1IL1();
                } else if (iiILIlLLiIL.iLLi1LIi() == I11lLL1 + 1) {
                    return null;
                } else {
                    iiILIlLLiIL2.I1iIiIi(iiILIlLLiIL, I11lLL1);
                    iiILIlLLiIL.readByte();
                    iiILIlLLiIL2.I1iIiIi(iiILIlLLiIL, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void IiiL1llIIi(ii1ILilI1IL ii1ilili1il, C0109o000oo00 o000oo00, C0094o000o000 o000o000) {
        if (ii1ilili1il != ii1ILilI1IL.iiI1L1iI) {
            List<I1iIiIl1Ll> IiiL1llIIi = I1iIiIl1Ll.IiiL1llIIi(o000oo00, o000o000);
            if (!IiiL1llIIi.isEmpty()) {
                ii1ilili1il.i1LIL11l(o000oo00, IiiL1llIIi);
            }
        }
    }

    public static Set<String> IilL11ii1I1Il(C0337o0O0oooO o0o0oooo) {
        return Ii1liIIIiLi(o0o0oooo.I1lLLLlliILlI());
    }

    public static long i111iLiiIIill(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int i1L1lLllLLlIi(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long i1LIL11l(C0337o0O0oooO o0o0oooo) {
        return iiI1L1iI(o0o0oooo.I1lLLLlliILlI());
    }

    public static String iILiI1lll(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static boolean iL1LIlIlI(IiILIlLLiIL iiILIlLLiIL) {
        boolean z = false;
        while (!iiILIlLLiIL.Il1llillili()) {
            byte ilLIlLiIILl1 = iiILIlLLiIL.ilLIlLiIILl1(0);
            if (ilLIlLiIILl1 != 44) {
                if (ilLIlLiIILl1 != 32 && ilLIlLiIILl1 != 9) {
                    break;
                }
                iiILIlLLiIL.readByte();
            } else {
                iiILIlLLiIL.readByte();
                z = true;
            }
        }
        return z;
    }

    public static int iLLLILIiLi1Ii(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long iiI1L1iI(C0094o000o000 o000o000) {
        return i111iLiiIIill(o000o000.il1LilLllii("Content-Length"));
    }

    public static boolean iiIliillii(C0337o0O0oooO o0o0oooo) {
        return il1LilLllii(o0o0oooo.I1lLLLlliILlI());
    }

    public static C0094o000o000 iiLIIiIli(C0337o0O0oooO o0o0oooo) {
        return I1l1iIll1lIi1(o0o0oooo.iIiL11iL().i11iLLllliI().iiIliillii(), o0o0oooo.I1lLLLlliILlI());
    }

    public static String iilLiIIIi11i(IiILIlLLiIL iiILIlLLiIL) {
        try {
            long I11lLL1 = iiILIlLLiIL.I11lLL1(i1LIL11l);
            if (I11lLL1 == -1) {
                I11lLL1 = iiILIlLLiIL.iLLi1LIi();
            }
            if (I11lLL1 != 0) {
                return iiILIlLLiIL.iL1LIlIlI(I11lLL1);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void iilLil1i11I1(List<I1I1liIIL> list, IiILIlLLiIL iiILIlLLiIL) {
        String iilLiIIIi11i;
        int I1iIiIi;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    iL1LIlIlI(iiILIlLLiIL);
                    str2 = iilLiIIIi11i(iiILIlLLiIL);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean iL1LIlIlI = iL1LIlIlI(iiILIlLLiIL);
                iilLiIIIi11i = iilLiIIIi11i(iiILIlLLiIL);
                if (iilLiIIIi11i != null) {
                    I1iIiIi = I1iIiIi(iiILIlLLiIL, i1IL1lILl1L1I.iilLil1i11I1);
                    boolean iL1LIlIlI2 = iL1LIlIlI(iiILIlLLiIL);
                    if (iL1LIlIlI || (!iL1LIlIlI2 && !iiILIlLLiIL.Il1llillili())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int I1iIiIi2 = I1iIiIi + I1iIiIi(iiILIlLLiIL, i1IL1lILl1L1I.iilLil1i11I1);
                        while (true) {
                            if (iilLiIIIi11i == null) {
                                iilLiIIIi11i = iilLiIIIi11i(iiILIlLLiIL);
                                if (iL1LIlIlI(iiILIlLLiIL)) {
                                    continue;
                                    break;
                                }
                                I1iIiIi2 = I1iIiIi(iiILIlLLiIL, i1IL1lILl1L1I.iilLil1i11I1);
                            }
                            if (I1iIiIi2 == 0) {
                                continue;
                                break;
                            } else if (I1iIiIi2 <= 1 && !iL1LIlIlI(iiILIlLLiIL)) {
                                if (iiILIlLLiIL.Il1llillili() || iiILIlLLiIL.ilLIlLiIILl1(0) != 34) {
                                    str = iilLiIIIi11i(iiILIlLLiIL);
                                } else {
                                    str = IiIIlIL(iiILIlLLiIL);
                                }
                                if (str == null || ((String) linkedHashMap.put(iilLiIIIi11i, str)) != null) {
                                    return;
                                }
                                if (iL1LIlIlI(iiILIlLLiIL) || iiILIlLLiIL.Il1llillili()) {
                                    iilLiIIIi11i = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new I1I1liIIL(str2, (Map<String, String>) linkedHashMap));
                        str2 = iilLiIIIi11i;
                    }
                } else if (iiILIlLLiIL.Il1llillili()) {
                    list.add(new I1I1liIIL(str2, (Map<String, String>) Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            list.add(new I1I1liIIL(str2, (Map<String, String>) Collections.singletonMap((Object) null, iilLiIIIi11i + iILiI1lll('=', I1iIiIi))));
        }
    }

    public static boolean il1LilLllii(C0094o000o000 o000o000) {
        return Ii1liIIIiLi(o000o000).contains("*");
    }

    public static boolean illlI1lLIL(C0337o0O0oooO o0o0oooo) {
        if (o0o0oooo.i11iLLllliI().I11lLL1().equals("HEAD")) {
            return false;
        }
        int IiIl11II = o0o0oooo.IiIl11II();
        if (((IiIl11II >= 100 && IiIl11II < 200) || IiIl11II == 204 || IiIl11II == 304) && i1LIL11l(o0o0oooo) == -1 && !"chunked".equalsIgnoreCase(o0o0oooo.ilLIlL1ILi("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }
}
