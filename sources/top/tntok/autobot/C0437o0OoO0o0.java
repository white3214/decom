package top.tntok.autobot;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.List;
import org.junit.runner.notification.RunListener;

/* renamed from: top.tntok.autobot.o0OoO0o0  reason: case insensitive filesystem */
public class C0437o0OoO0o0 extends RunListener {
    public final PrintStream iiI1L1iI;

    public C0437o0OoO0o0(C0171o00OoOoO o00ooooo) {
        this(o00ooooo.i1LIL11l());
    }

    public void I11lLL1(C0009OooO0oO oooO0oO) {
        this.iiI1L1iI.append(C0089o000Ooo.il1LilLllii);
    }

    public void I1iIiIi(o0OO000 o0oo000) {
        List<o00O0O> iilLiIIIi11i = o0oo000.iilLiIIIi11i();
        if (!iilLiIIIi11i.isEmpty()) {
            int i = 1;
            if (iilLiIIIi11i.size() == 1) {
                PrintStream IiiL1llIIi = IiiL1llIIi();
                IiiL1llIIi.println("There was " + iilLiIIIi11i.size() + " failure:");
            } else {
                PrintStream IiiL1llIIi2 = IiiL1llIIi();
                IiiL1llIIi2.println("There were " + iilLiIIIi11i.size() + " failures:");
            }
            for (o00O0O iILiI1lll : iilLiIIIi11i) {
                iILiI1lll(iILiI1lll, "" + i);
                i++;
            }
        }
    }

    public void IL1lILLLL1L(long j) {
        IiiL1llIIi().println();
        PrintStream IiiL1llIIi = IiiL1llIIi();
        IiiL1llIIi.println("Time: " + iilLiIIIi11i(j));
    }

    public final PrintStream IiiL1llIIi() {
        return this.iiI1L1iI;
    }

    public void i1L1lLllLLlIi(o0OO000 o0oo000) {
        String str;
        if (o0oo000.i1L1lLllLLlIi()) {
            IiiL1llIIi().println();
            IiiL1llIIi().print("OK");
            PrintStream IiiL1llIIi = IiiL1llIIi();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(o0oo000.iILiI1lll());
            sb.append(" test");
            if (o0oo000.iILiI1lll() == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(")");
            IiiL1llIIi.println(sb.toString());
        } else {
            IiiL1llIIi().println();
            IiiL1llIIi().println("FAILURES!!!");
            PrintStream IiiL1llIIi2 = IiiL1llIIi();
            IiiL1llIIi2.println("Tests run: " + o0oo000.iILiI1lll() + ",  Failures: " + o0oo000.IiIIlIL());
        }
        IiiL1llIIi().println();
    }

    public void i1LIL11l(o00O0O o00o0o) {
        this.iiI1L1iI.append('E');
    }

    public void iILiI1lll(o00O0O o00o0o, String str) {
        PrintStream IiiL1llIIi = IiiL1llIIi();
        IiiL1llIIi.println(str + ") " + o00o0o.il1LilLllii());
        IiiL1llIIi().print(o00o0o.iilLil1i11I1());
    }

    public void iiIliillii(o0OO000 o0oo000) {
        IL1lILLLL1L(o0oo000.I1iIiIi());
        I1iIiIi(o0oo000);
        i1L1lLllLLlIi(o0oo000);
    }

    public String iilLiIIIi11i(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    public void il1LilLllii(C0009OooO0oO oooO0oO) {
        this.iiI1L1iI.append('I');
    }

    public C0437o0OoO0o0(PrintStream printStream) {
        this.iiI1L1iI = printStream;
    }
}
