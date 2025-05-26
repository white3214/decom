package top.tntok.autobot;

import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: top.tntok.autobot.o00O0ooo  reason: case insensitive filesystem */
public class C0138o00O0ooo extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public C0138o00O0ooo(List<Throwable> list) {
        this.fErrors = list;
    }

    public List<Throwable> iiI1L1iI() {
        return this.fErrors;
    }

    public C0138o00O0ooo(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public C0138o00O0ooo(String str) {
        this(new Exception(str));
    }
}
