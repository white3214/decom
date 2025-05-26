package top.tntok.autobot;

import java.util.List;
import org.junit.runner.notification.RunListener;

/* renamed from: top.tntok.autobot.o00Oo0  reason: case insensitive filesystem */
public class C0151o00Oo0 {
    public final List<o00O0O> iiI1L1iI;

    public C0151o00Oo0(List<o00O0O> list) {
        this.iiI1L1iI = list;
    }

    public o0OO000 iiI1L1iI() {
        o0OO000 o0oo000 = new o0OO000();
        RunListener I11lLL1 = o0oo000.I11lLL1();
        for (o00O0O i1LIL11l : this.iiI1L1iI) {
            try {
                I11lLL1.i1LIL11l(i1LIL11l);
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return o0oo000;
    }
}
