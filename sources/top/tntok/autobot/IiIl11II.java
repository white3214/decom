package top.tntok.autobot;

@Deprecated
public class IiIl11II {
    public static void I11lLL1(int i, int i2) {
        i1L1lLllLLlIi((String) null, i, i2);
    }

    public static void I1I11Il1(Object obj, Object obj2) {
        i1iI1iiLL1((String) null, obj, obj2);
    }

    public static void I1IIIi1i1ILl(String str, Object obj, Object obj2) {
        if (obj != obj2) {
            iliilLllIl1(str, obj, obj2);
        }
    }

    public static void I1iIiIi(String str, float f, float f2, float f3) {
        if (Float.compare(f, f2) != 0 && Math.abs(f - f2) > f3) {
            IIlLill(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    public static void I1l1iIll1lIi1(String str, boolean z, boolean z2) {
        iL1LIlIlI(str, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public static void IIIlll1lll(boolean z) {
        IilliIIIlI1ll((String) null, z);
    }

    public static void IILiIL1i11Li(String str) {
        if (str == null) {
            throw new IillLillLLIii();
        }
        throw new IillLillLLIii(str);
    }

    public static void IIlL1llI1(Object obj) {
        if (obj != null) {
            IL111l1("Expected: <null> but was: " + obj.toString(), obj);
        }
    }

    public static void IIlLill(String str, Object obj, Object obj2) {
        IILiIL1i11Li(ILllI11(str, obj, obj2));
    }

    public static void IL111l1(String str, Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        IilliIIIlI1ll(str, z);
    }

    public static void IL1IiilLlLI() {
        IILiIL1i11Li((String) null);
    }

    public static void IL1lILLLL1L(String str, long j, long j2) {
        iL1LIlIlI(str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static void ILl1iII11Ll1(boolean z, boolean z2) {
        I1l1iIll1lIi1((String) null, z, z2);
    }

    public static String ILllI11(String str, Object obj, Object obj2) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }

    public static void Ii1liIIIiLi(String str, String str2, String str3) {
        if (str2 != null || str3 != null) {
            if (str2 == null || !str2.equals(str3)) {
                if (str == null) {
                    str = "";
                }
                throw new I11ll11L1IiII(str, str2, str3);
            }
        }
    }

    public static void IiIIlIL(Object obj, Object obj2) {
        iL1LIlIlI((String) null, obj, obj2);
    }

    public static void IiiL1llIIi(String str, char c, char c2) {
        iL1LIlIlI(str, Character.valueOf(c), Character.valueOf(c2));
    }

    public static void IilL11ii1I1Il(String str, short s, short s2) {
        iL1LIlIlI(str, Short.valueOf(s), Short.valueOf(s2));
    }

    public static void IilliIIIlI1ll(String str, boolean z) {
        if (!z) {
            IILiIL1i11Li(str);
        }
    }

    public static void IliiLiLliIl(String str, Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IilliIIIlI1ll(str, z);
    }

    public static void i111iLiiIIill(String str, String str2) {
        Ii1liIIIiLi((String) null, str, str2);
    }

    public static void i11liIIl11Ii1(boolean z) {
        i1iiLIil1ILi((String) null, z);
    }

    public static void i1L1lLllLLlIi(String str, int i, int i2) {
        iL1LIlIlI(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void i1iI1iiLL1(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            illiiliIILI(str);
        }
    }

    public static void i1iiLIil1ILi(String str, boolean z) {
        IilliIIIlI1ll(str, !z);
    }

    public static void iILiI1lll(String str, double d, double d2, double d3) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > d3) {
            IIlLill(str, Double.valueOf(d), Double.valueOf(d2));
        }
    }

    public static void iL1LIlIlI(String str, Object obj, Object obj2) {
        if (obj != null || obj2 != null) {
            if (obj == null || !obj.equals(obj2)) {
                IIlLill(str, obj, obj2);
            }
        }
    }

    public static void iLLLILIiLi1Ii(long j, long j2) {
        IL1lILLLL1L((String) null, j, j2);
    }

    public static void iiI1L1iI(byte b, byte b2) {
        iilLiIIIi11i((String) null, b, b2);
    }

    public static void iiIliillii(double d, double d2, double d3) {
        iILiI1lll((String) null, d, d2, d3);
    }

    public static void iiLIIiIli(short s, short s2) {
        IilL11ii1I1Il((String) null, s, s2);
    }

    public static void iiiiI1iILL11I(Object obj) {
        IliiLiLliIl((String) null, obj);
    }

    public static void iilLiIIIi11i(String str, byte b, byte b2) {
        iL1LIlIlI(str, Byte.valueOf(b), Byte.valueOf(b2));
    }

    public static void iilLil1i11I1(float f, float f2, float f3) {
        I1iIiIi((String) null, f, f2, f3);
    }

    public static void il1LilLllii(char c, char c2) {
        IiiL1llIIi((String) null, c, c2);
    }

    public static void il1l1IlL(Object obj, Object obj2) {
        I1IIIi1i1ILl((String) null, obj, obj2);
    }

    public static void iliilLllIl1(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        IILiIL1i11Li(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void illiiliIILI(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        IILiIL1i11Li(str2 + "expected not same");
    }
}
