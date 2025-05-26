package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0OOoO0  reason: case insensitive filesystem */
public class C0384o0OOoO0 extends iiL1l1iLliL {
    public final Appendable i1LIL11l;

    public C0384o0OOoO0() {
        this(new StringBuilder());
    }

    public static String IL1lILLLL1L(o0OOO0O0 o0ooo0o0) {
        return new C0384o0OOoO0().i1LIL11l(o0ooo0o0).toString();
    }

    public static String i1L1lLllLLlIi(o0OOO0O0 o0ooo0o0) {
        return IL1lILLLL1L(o0ooo0o0);
    }

    public void I11lLL1(char c) {
        try {
            this.i1LIL11l.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public void iLLLILIiLi1Ii(String str) {
        try {
            this.i1LIL11l.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.i1LIL11l.toString();
    }

    public C0384o0OOoO0(Appendable appendable) {
        this.i1LIL11l = appendable;
    }
}
