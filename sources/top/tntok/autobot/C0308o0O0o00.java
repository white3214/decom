package top.tntok.autobot;

import java.io.IOException;
import java.util.List;

/* renamed from: top.tntok.autobot.o0O0o00  reason: case insensitive filesystem */
public interface C0308o0O0o00 {
    public static final C0308o0O0o00 iiI1L1iI = new iiI1L1iI();

    boolean i1LIL11l(int i, List<C0090o000Ooo0> list, boolean z);

    boolean iiI1L1iI(int i, List<C0090o000Ooo0> list);

    void il1LilLllii(int i, C0039OoooOO0 ooooOO0);

    boolean illlI1lLIL(int i, ILL1iL1LiiI iLL1iL1LiiI, int i2, boolean z) throws IOException;

    /* renamed from: top.tntok.autobot.o0O0o00$iiI1L1iI */
    public class iiI1L1iI implements C0308o0O0o00 {
        public boolean i1LIL11l(int i, List<C0090o000Ooo0> list, boolean z) {
            return true;
        }

        public boolean iiI1L1iI(int i, List<C0090o000Ooo0> list) {
            return true;
        }

        public boolean illlI1lLIL(int i, ILL1iL1LiiI iLL1iL1LiiI, int i2, boolean z) throws IOException {
            iLL1iL1LiiI.skip((long) i2);
            return true;
        }

        public void il1LilLllii(int i, C0039OoooOO0 ooooOO0) {
        }
    }
}
