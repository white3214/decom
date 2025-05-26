package top.tntok.autobot;

import java.io.PrintStream;

/* renamed from: top.tntok.autobot.o0Oo  reason: case insensitive filesystem */
public class C0403o0Oo extends il11iII1 {
    public static final int I11lLL1 = 0;
    public static final int IiIIlIL = 2;
    public static final int iLLLILIiLi1Ii = 1;
    public oo0oO0 iilLil1i11I1;

    public C0403o0Oo() {
        this(System.out);
    }

    public static C0428o0Oo0oo0 IIlLill(C0532o0oOo0o0 o0ooo0o0) {
        return new C0403o0Oo().IilliIIIlI1ll(o0ooo0o0);
    }

    public static void IL1IiilLlLI(String[] strArr) {
        try {
            if (!new C0403o0Oo().illi1LIILLiL(strArr).i111iLiiIIill()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    public static void iliilLllIl1(Class<? extends C0534o0oOoo00> cls) {
        IIlLill(new C0432o0OoO000((Class<?>) cls));
    }

    public static void illiiliIILI(C0532o0oOo0o0 o0ooo0o0) {
        new C0403o0Oo().IIIlll1lll(o0ooo0o0, true);
    }

    public C0428o0Oo0oo0 I1IIIi1i1ILl() {
        return new C0428o0Oo0oo0();
    }

    public C0428o0Oo0oo0 IIIlll1lll(C0532o0oOo0o0 o0ooo0o0, boolean z) {
        C0428o0Oo0oo0 I1IIIi1i1ILl = I1IIIi1i1ILl();
        I1IIIi1i1ILl.illlI1lLIL(this.iilLil1i11I1);
        long currentTimeMillis = System.currentTimeMillis();
        o0ooo0o0.i1LIL11l(I1IIIi1i1ILl);
        this.iilLil1i11I1.IiIIlIL(I1IIIi1i1ILl, System.currentTimeMillis() - currentTimeMillis);
        IILiIL1i11Li(z);
        return I1IIIi1i1ILl;
    }

    public void IILiIL1i11Li(boolean z) {
        if (z) {
            this.iilLil1i11I1.Ii1liIIIiLi();
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    public C0428o0Oo0oo0 ILllI11(String str, String str2, boolean z) throws Exception {
        return IIIlll1lll(C0432o0OoO000.I11lLL1(Ii1liIIIiLi(str).asSubclass(C0534o0oOoo00.class), str2), z);
    }

    public C0428o0Oo0oo0 IilliIIIlI1ll(C0532o0oOo0o0 o0ooo0o0) {
        return IIIlll1lll(o0ooo0o0, false);
    }

    public void i1iLlIill1I(oo0oO0 oo0oo0) {
        this.iilLil1i11I1 = oo0oo0;
    }

    public void iiLIIiIli(String str) {
        System.err.println(str);
        System.exit(1);
    }

    public C0428o0Oo0oo0 illi1LIILLiL(String[] strArr) throws Exception {
        String str = "";
        String str2 = str;
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                str = IiIIlIL(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                String str3 = strArr[i];
                int lastIndexOf = str3.lastIndexOf(46);
                String substring = str3.substring(0, lastIndexOf);
                str2 = str3.substring(lastIndexOf + 1);
                str = substring;
            } else if (strArr[i].equals("-v")) {
                PrintStream printStream = System.err;
                printStream.println("JUnit " + C0492o0o000O0.iiI1L1iI() + " by Kent Beck and Erich Gamma");
            } else {
                str = strArr[i];
            }
            i++;
        }
        if (!str.equals("")) {
            try {
                if (!str2.equals("")) {
                    return ILllI11(str, str2, z);
                }
                return IIIlll1lll(i111iLiiIIill(str), z);
            } catch (Exception e) {
                throw new Exception("Could not create and run test suite: " + e);
            }
        } else {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
    }

    public C0403o0Oo(PrintStream printStream) {
        this(new oo0oO0(printStream));
    }

    public C0403o0Oo(oo0oO0 oo0oo0) {
        this.iilLil1i11I1 = oo0oo0;
    }

    public void I1I11Il1(String str) {
    }

    public void IIlL1llI1(String str) {
    }

    public void i1iI1iiLL1(int i, C0532o0oOo0o0 o0ooo0o0, Throwable th) {
    }
}
