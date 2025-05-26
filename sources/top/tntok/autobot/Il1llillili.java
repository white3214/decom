package top.tntok.autobot;

public class Il1llillili {
    public static void I11lLL1(String str, Object[] objArr, Object[] objArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, objArr, objArr2);
    }

    public static void I1I11Il1(String str, long j, long j2) {
        if (j != j2) {
            iLI1L1l1li(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public static void I1IIIi1i1ILl(boolean z) {
        il1l1IlL((String) null, z);
    }

    public static void I1Ii1ILliII(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        ILiliIiI(str2 + "expected not same");
    }

    public static void I1LiILiLLIl1l(String str, Object obj) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        ILiliIiI(str2 + "expected null, but was:<" + obj + ">");
    }

    public static void I1LiliILi1lI1(String str, boolean z) {
        if (!z) {
            ILiliIiI(str);
        }
    }

    public static void I1i1iiiI() {
        ILiliIiI((String) null);
    }

    public static void I1iIiIi(float[] fArr, float[] fArr2, float f) {
        il1LilLllii((String) null, fArr, fArr2, f);
    }

    public static void I1l1iIll1lIi1(double d, double d2, double d3) {
        iiiiI1iILL11I((String) null, d, d2, d3);
    }

    public static boolean I1lLLLlliILlI(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static void IIIlll1lll(float f, float f2, float f3) {
        iliilLllIl1((String) null, f, f2, f3);
    }

    public static String IIL1Ll1I111(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        return str2 + "<" + str + ">";
    }

    public static void IILiIL1i11Li(Object obj, Object obj2) {
        ILllI11((String) null, obj, obj2);
    }

    public static void IIi1l1i(Object obj, Object obj2) {
        IIllllLiIlIl((String) null, obj, obj2);
    }

    @Deprecated
    public static void IIlL1llI1(String str, Object[] objArr, Object[] objArr2) {
        I11lLL1(str, objArr, objArr2);
    }

    public static void IIlLill(String str, double d, double d2, double d3) {
        if (!IiiIIil1l(d, d2, d3)) {
            iLiI1Llil(str, Double.valueOf(d2));
        }
    }

    public static boolean IIlllIIi1ii(float f, float f2, float f3) {
        if (Float.compare(f, f2) != 0 && Math.abs(f - f2) > f3) {
            return true;
        }
        return false;
    }

    public static void IIllllLiIlIl(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            I1Ii1ILliII(str);
        }
    }

    @Deprecated
    public static void IL111l1(Object[] objArr, Object[] objArr2) {
        iL1LIlIlI(objArr, objArr2);
    }

    public static void IL1IiilLlLI(long j, long j2) {
        illiiliIILI((String) null, j, j2);
    }

    public static void IL1lILLLL1L(long[] jArr, long[] jArr2) {
        iilLil1i11I1((String) null, jArr, jArr2);
    }

    public static void ILiLII1ILi(String str, Object obj, Object obj2) {
        if (obj != obj2) {
            illi1IL1(str, obj, obj2);
        }
    }

    public static void ILiliIiI(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    public static void ILl1iII11Ll1(long j, long j2) {
        I1I11Il1((String) null, j, j2);
    }

    public static void ILllI11(String str, Object obj, Object obj2) {
        if (iLIIl1IliLlLI(obj, obj2)) {
            iLiI1Llil(str, obj2);
        }
    }

    public static void Ii1liIIIiLi(boolean[] zArr, boolean[] zArr2) {
        IiIIlIL((String) null, zArr, zArr2);
    }

    public static void IiIIlIL(String str, boolean[] zArr, boolean[] zArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, zArr, zArr2);
    }

    @Deprecated
    public static <T> void IiIl11II(String str, T t, C0175o00Ooo00<? super T> o00ooo00) {
        C0174o00Ooo0.i1LIL11l(str, t, o00ooo00);
    }

    public static boolean IiiIIil1l(double d, double d2, double d3) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > d3) {
            return true;
        }
        return false;
    }

    public static void IiiIlLl1il1i(Object obj) {
        iLlIllll((String) null, obj);
    }

    public static void IiiL1llIIi(char[] cArr, char[] cArr2) {
        i1LIL11l((String) null, cArr, cArr2);
    }

    public static <T extends Throwable> T Iiiiii1l1I1L1(String str, Class<T> cls, C0444o0OoOOO0 o0ooooo0) {
        try {
            o0ooooo0.run();
            throw new AssertionError(i1i1111LLILli(str) + String.format("expected %s to be thrown, but nothing was thrown", new Object[]{ilLIlL1ILi(cls)}));
        } catch (Throwable th) {
            if (cls.isInstance(th)) {
                return th;
            }
            String ilLIlL1ILi = ilLIlL1ILi(cls);
            Class<?> cls2 = th.getClass();
            String ilLIlL1ILi2 = ilLIlL1ILi(cls2);
            if (ilLIlL1ILi.equals(ilLIlL1ILi2)) {
                ilLIlL1ILi2 = ilLIlL1ILi2 + "@" + Integer.toHexString(System.identityHashCode(cls2));
                ilLIlL1ILi = ilLIlL1ILi + "@" + Integer.toHexString(System.identityHashCode(cls));
            }
            AssertionError assertionError = new AssertionError(i1i1111LLILli(str) + IllLlI1IiIL("unexpected exception type thrown;", ilLIlL1ILi, ilLIlL1ILi2));
            assertionError.initCause(th);
            throw assertionError;
        }
    }

    @Deprecated
    public static void IilL11ii1I1Il(double d, double d2) {
        i11liIIl11Ii1((String) null, d, d2);
    }

    public static <T extends Throwable> T IillLillLLIii(Class<T> cls, C0444o0OoOOO0 o0ooooo0) {
        return Iiiiii1l1I1L1((String) null, cls, o0ooooo0);
    }

    public static void IilliIIIlI1ll(double d, double d2, double d3) {
        IIlLill((String) null, d, d2, d3);
    }

    @Deprecated
    public static <T> void Il1llillili(T t, C0175o00Ooo00<? super T> o00ooo00) {
        IiIl11II("", t, o00ooo00);
    }

    public static void IliiLiLliIl(String str, float f, float f2, float f3) {
        if (IIlllIIi1ii(f, f2, f3)) {
            iLI1L1l1li(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    public static String IllLlI1IiIL(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !str2.equals(str)) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (iLIIl1IliLlLI(valueOf, valueOf2)) {
            return str2 + "expected: " + IIL1Ll1I111(obj, valueOf) + " but was: " + IIL1Ll1I111(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    public static void i111iLiiIIill(short[] sArr, short[] sArr2) {
        iLLLILIiLi1Ii((String) null, sArr, sArr2);
    }

    @Deprecated
    public static void i11liIIl11Ii1(String str, double d, double d2) {
        ILiliIiI("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
    }

    public static void i1L1lLllLLlIi(int[] iArr, int[] iArr2) {
        iiIliillii((String) null, iArr, iArr2);
    }

    public static void i1LIL11l(String str, char[] cArr, char[] cArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, cArr, cArr2);
    }

    public static void i1LiiIlIL1I(Object obj, Object obj2) {
        ILiLII1ILi((String) null, obj, obj2);
    }

    public static String i1i1111LLILli(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return str + ": ";
    }

    public static void i1iI1iiLL1(String str, Object obj, Object obj2) {
        if (!iLIIl1IliLlLI(obj, obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                iLI1L1l1li(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            throw new iiiL1LIIllL(str, (String) obj, (String) obj2);
        }
    }

    public static void i1iLlIill1I(Object obj) {
        illi1LIILLiL((String) null, obj);
    }

    public static void i1iiLIil1ILi(Object obj, Object obj2) {
        i1iI1iiLL1((String) null, obj, obj2);
    }

    public static void iILiI1lll(double[] dArr, double[] dArr2, double d) {
        illlI1lLIL((String) null, dArr, dArr2, d);
    }

    public static void iL1LIlIlI(Object[] objArr, Object[] objArr2) {
        I11lLL1((String) null, objArr, objArr2);
    }

    public static void iLI1L1l1li(String str, Object obj, Object obj2) {
        ILiliIiI(IllLlI1IiIL(str, obj, obj2));
    }

    public static boolean iLIIl1IliLlLI(Object obj, Object obj2) {
        if (obj != null) {
            return I1lLLLlliILlI(obj, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void iLILliI1(boolean z) {
        I1LiliILi1lI1((String) null, z);
    }

    public static void iLLLILIiLi1Ii(String str, short[] sArr, short[] sArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, sArr, sArr2);
    }

    public static void iLiI1Llil(String str, Object obj) {
        String str2;
        if (str != null) {
            str2 = str + ". ";
        } else {
            str2 = "Values should be different. ";
        }
        ILiliIiI(str2 + "Actual: " + obj);
    }

    public static void iLlIllll(String str, Object obj) {
        if (obj != null) {
            I1LiILiLLIl1l(str, obj);
        }
    }

    public static void iiI1L1iI(String str, byte[] bArr, byte[] bArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, bArr, bArr2);
    }

    public static void iiIliillii(String str, int[] iArr, int[] iArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, iArr, iArr2);
    }

    public static void iiLIIiIli(float f, float f2, float f3) {
        IliiLiLliIl((String) null, f, f2, f3);
    }

    public static void iiiiI1iILL11I(String str, double d, double d2, double d3) {
        if (IiiIIil1l(d, d2, d3)) {
            iLI1L1l1li(str, Double.valueOf(d), Double.valueOf(d2));
        }
    }

    public static void iilLiIIIi11i(byte[] bArr, byte[] bArr2) {
        iiI1L1iI((String) null, bArr, bArr2);
    }

    public static void iilLil1i11I1(String str, long[] jArr, long[] jArr2) throws i1LiiIlIL1I {
        ilIILlI1l11i(str, jArr, jArr2);
    }

    public static void il1LilLllii(String str, float[] fArr, float[] fArr2, float f) throws i1LiiIlIL1I {
        new C0134o00O0oOO(f).iiI1L1iI(str, fArr, fArr2);
    }

    public static void il1l1IlL(String str, boolean z) {
        I1LiliILi1lI1(str, !z);
    }

    public static void ilIILlI1l11i(String str, Object obj, Object obj2) throws i1LiiIlIL1I {
        new C0044OoooOoo().iiI1L1iI(str, obj, obj2);
    }

    public static String ilLIlL1ILi(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return cls.getName();
        }
        return canonicalName;
    }

    public static void iliilLllIl1(String str, float f, float f2, float f3) {
        if (!IIlllIIi1ii(f, f2, f3)) {
            iLiI1Llil(str, Float.valueOf(f2));
        }
    }

    public static void illi1IL1(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        ILiliIiI(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void illi1LIILLiL(String str, Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        I1LiliILi1lI1(str, z);
    }

    public static void illiiliIILI(String str, long j, long j2) {
        if (j == j2) {
            iLiI1Llil(str, Long.valueOf(j2));
        }
    }

    public static void illlI1lLIL(String str, double[] dArr, double[] dArr2, double d) throws i1LiiIlIL1I {
        new C0134o00O0oOO(d).iiI1L1iI(str, dArr, dArr2);
    }
}
