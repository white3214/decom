package top.tntok.autobot;

import java.io.IOException;
import java.util.Objects;

public final /* synthetic */ class o00O00O {
    public static /* synthetic */ void i1LIL11l(oOO00O ooo00o, oOO00O ooo00o2, Object obj) throws IOException {
        ooo00o.accept(obj);
        ooo00o2.accept(obj);
    }

    public static oOO00O iiI1L1iI(oOO00O ooo00o, oOO00O ooo00o2) {
        Objects.requireNonNull(ooo00o2);
        return new o00O00(ooo00o, ooo00o2);
    }
}
