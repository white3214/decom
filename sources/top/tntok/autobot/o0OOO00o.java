package top.tntok.autobot;

import javax.annotation.Nullable;

public final class o0OOO00o {
    @Nullable
    public static o0OOO00 i1LIL11l = null;
    public static final long iiI1L1iI = 65536;
    public static long illlI1lLIL;

    public static o0OOO00 i1LIL11l() {
        synchronized (o0OOO00o.class) {
            try {
                o0OOO00 o0ooo00 = i1LIL11l;
                if (o0ooo00 == null) {
                    return new o0OOO00();
                }
                i1LIL11l = o0ooo00.iilLil1i11I1;
                o0ooo00.iilLil1i11I1 = null;
                illlI1lLIL -= 8192;
                return o0ooo00;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static void iiI1L1iI(o0OOO00 o0ooo00) {
        if (o0ooo00.iilLil1i11I1 != null || o0ooo00.I11lLL1 != null) {
            throw new IllegalArgumentException();
        } else if (!o0ooo00.il1LilLllii) {
            synchronized (o0OOO00o.class) {
                try {
                    long j = illlI1lLIL;
                    if (j + 8192 <= iiI1L1iI) {
                        illlI1lLIL = j + 8192;
                        o0ooo00.iilLil1i11I1 = i1LIL11l;
                        o0ooo00.illlI1lLIL = 0;
                        o0ooo00.i1LIL11l = 0;
                        i1LIL11l = o0ooo00;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
