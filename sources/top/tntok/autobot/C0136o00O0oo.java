package top.tntok.autobot;

import java.util.Arrays;
import java.util.List;

/* renamed from: top.tntok.autobot.o00O0oo  reason: case insensitive filesystem */
public class C0136o00O0oo extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public C0136o00O0oo(List<Throwable> list) {
        this.fErrors = list;
    }

    public List<Throwable> iiI1L1iI() {
        return this.fErrors;
    }

    public C0136o00O0oo(Throwable th) {
        this((List<Throwable>) Arrays.asList(new Throwable[]{th}));
    }

    public C0136o00O0oo(String str) {
        this((Throwable) new Exception(str));
    }
}
