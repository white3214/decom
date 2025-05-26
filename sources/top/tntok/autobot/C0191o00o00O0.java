package top.tntok.autobot;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o00o00O0  reason: case insensitive filesystem */
public class C0191o00o00O0 extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public C0191o00o00O0(List<Throwable> list) {
        if (!list.isEmpty()) {
            this.fErrors = new ArrayList(list.size());
            for (Throwable next : list) {
                if (next instanceof iLILliI1) {
                    next = new C0426o0Oo0oOo((iLILliI1) next);
                }
                this.fErrors.add(next);
            }
            return;
        }
        throw new IllegalArgumentException("List of Throwables must not be empty");
    }

    public static void iiI1L1iI(List<Throwable> list) throws Exception {
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                throw C0449o0OoOOoO.iL1LIlIlI(list.get(0));
            }
            throw new C0192o00o00Oo(list);
        }
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", new Object[]{Integer.valueOf(this.fErrors.size())}));
        for (Throwable next : this.fErrors) {
            sb.append(String.format("%n  %s(%s)", new Object[]{next.getClass().getName(), next.getMessage()}));
        }
        return sb.toString();
    }

    public List<Throwable> i1LIL11l() {
        return Collections.unmodifiableList(this.fErrors);
    }

    public void printStackTrace() {
        for (Throwable printStackTrace : this.fErrors) {
            printStackTrace.printStackTrace();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        for (Throwable printStackTrace : this.fErrors) {
            printStackTrace.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        for (Throwable printStackTrace : this.fErrors) {
            printStackTrace.printStackTrace(printWriter);
        }
    }
}
