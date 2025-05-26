package top.tntok.autobot;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;

public class oo0oO0 implements C0423o0Oo0o0o {
    public int i1LIL11l = 0;
    public PrintStream iiI1L1iI;

    public oo0oO0(PrintStream printStream) {
        this.iiI1L1iI = printStream;
    }

    public String I11lLL1(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    public void I1iIiIi(Enumeration<C0422o0Oo0o0O> enumeration, int i, String str) {
        if (i != 0) {
            if (i == 1) {
                PrintStream iLLLILIiLi1Ii = iLLLILIiLi1Ii();
                iLLLILIiLi1Ii.println("There was " + i + " " + str + ":");
            } else {
                PrintStream iLLLILIiLi1Ii2 = iLLLILIiLi1Ii();
                iLLLILIiLi1Ii2.println("There were " + i + " " + str + "s:");
            }
            int i2 = 1;
            while (enumeration.hasMoreElements()) {
                iilLiIIIi11i(enumeration.nextElement(), i2);
                i2++;
            }
        }
    }

    public void IL1lILLLL1L(C0428o0Oo0oo0 o0oo0oo0) {
        I1iIiIi(o0oo0oo0.IiIIlIL(), o0oo0oo0.iLLLILIiLi1Ii(), "failure");
    }

    public void Ii1liIIIiLi() {
        iLLLILIiLi1Ii().println();
        iLLLILIiLi1Ii().println("<RETURN> to continue");
    }

    public synchronized void IiIIlIL(C0428o0Oo0oo0 o0oo0oo0, long j) {
        i111iLiiIIill(j);
        i1L1lLllLLlIi(o0oo0oo0);
        IL1lILLLL1L(o0oo0oo0);
        iL1LIlIlI(o0oo0oo0);
    }

    public void IiiL1llIIi(C0422o0Oo0o0O o0oo0o0o, int i) {
        PrintStream iLLLILIiLi1Ii = iLLLILIiLi1Ii();
        iLLLILIiLi1Ii.print(i + ") " + o0oo0o0o.i1LIL11l());
    }

    public void i111iLiiIIill(long j) {
        iLLLILIiLi1Ii().println();
        PrintStream iLLLILIiLi1Ii = iLLLILIiLi1Ii();
        iLLLILIiLi1Ii.println("Time: " + I11lLL1(j));
    }

    public void i1L1lLllLLlIi(C0428o0Oo0oo0 o0oo0oo0) {
        I1iIiIi(o0oo0oo0.I11lLL1(), o0oo0oo0.iilLil1i11I1(), "error");
    }

    public void i1LIL11l(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
        iLLLILIiLi1Ii().print("E");
    }

    public void iILiI1lll(C0422o0Oo0o0O o0oo0o0o) {
        iLLLILIiLi1Ii().print(il11iII1.IiiL1llIIi(o0oo0o0o.iiIliillii()));
    }

    public void iL1LIlIlI(C0428o0Oo0oo0 o0oo0oo0) {
        String str;
        if (o0oo0oo0.i111iLiiIIill()) {
            iLLLILIiLi1Ii().println();
            iLLLILIiLi1Ii().print("OK");
            PrintStream iLLLILIiLi1Ii = iLLLILIiLi1Ii();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(o0oo0oo0.iILiI1lll());
            sb.append(" test");
            if (o0oo0oo0.iILiI1lll() == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(")");
            iLLLILIiLi1Ii.println(sb.toString());
        } else {
            iLLLILIiLi1Ii().println();
            iLLLILIiLi1Ii().println("FAILURES!!!");
            PrintStream iLLLILIiLi1Ii2 = iLLLILIiLi1Ii();
            iLLLILIiLi1Ii2.println("Tests run: " + o0oo0oo0.iILiI1lll() + ",  Failures: " + o0oo0oo0.iLLLILIiLi1Ii() + ",  Errors: " + o0oo0oo0.iilLil1i11I1());
        }
        iLLLILIiLi1Ii().println();
    }

    public PrintStream iLLLILIiLi1Ii() {
        return this.iiI1L1iI;
    }

    public void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, IillLillLLIii iillLillLLIii) {
        iLLLILIiLi1Ii().print("F");
    }

    public void iiIliillii(C0532o0oOo0o0 o0ooo0o0) {
        iLLLILIiLi1Ii().print(".");
        int i = this.i1LIL11l;
        this.i1LIL11l = i + 1;
        if (i >= 40) {
            iLLLILIiLi1Ii().println();
            this.i1LIL11l = 0;
        }
    }

    public void iilLiIIIi11i(C0422o0Oo0o0O o0oo0o0o, int i) {
        IiiL1llIIi(o0oo0o0o, i);
        iILiI1lll(o0oo0o0o);
    }

    public void iilLil1i11I1(C0532o0oOo0o0 o0ooo0o0) {
    }
}
