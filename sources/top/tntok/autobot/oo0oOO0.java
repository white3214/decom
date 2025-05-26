package top.tntok.autobot;

import java.io.IOException;

public class oo0oOO0 extends IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public oo0oOO0(int i, Throwable th) {
        super(i1LIL11l(i, th), th);
        this.index = i;
    }

    public static String i1LIL11l(int i, Throwable th) {
        String str;
        String str2 = "Null";
        if (th == null) {
            str = str2;
        } else {
            str = th.getClass().getSimpleName();
        }
        if (th != null) {
            str2 = th.getMessage();
        }
        return String.format("%s #%,d: %s", new Object[]{str, Integer.valueOf(i), str2});
    }

    public int iiI1L1iI() {
        return this.index;
    }
}
