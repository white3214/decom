package top.tntok.autobot;

import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o0O0oO0  reason: case insensitive filesystem */
public final class C0318o0O0oO0 extends o0O {
    public final ILL1iL1LiiI iiIliillii;
    public final long il1LilLllii;
    @Nullable
    public final String illlI1lLIL;

    public C0318o0O0oO0(@Nullable String str, long j, ILL1iL1LiiI iLL1iL1LiiI) {
        this.illlI1lLIL = str;
        this.il1LilLllii = j;
        this.iiIliillii = iLL1iL1LiiI;
    }

    public long I1LiILiLLIl1l() {
        return this.il1LilLllii;
    }

    public ILL1iL1LiiI IL11lll11() {
        return this.iiIliillii;
    }

    public C0179o00OooO0 ilLIlL1ILi() {
        String str = this.illlI1lLIL;
        if (str != null) {
            return C0179o00OooO0.il1LilLllii(str);
        }
        return null;
    }
}
