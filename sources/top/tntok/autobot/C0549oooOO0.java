package top.tntok.autobot;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.o00OO00O;

/* renamed from: top.tntok.autobot.oooOO0  reason: case insensitive filesystem */
public final class C0549oooOO0 implements o00OO00O.iiI1L1iI {
    public final int I11lLL1;
    public final int IiIIlIL;
    public final C0452o0OoOo00 i1LIL11l;
    public final int iLLLILIiLi1Ii;
    public final List<o00OO00O> iiI1L1iI;
    public final C0333o0O0ooO0 iiIliillii;
    public int iilLiIIIi11i;
    public final iiIIl1I iilLil1i11I1;
    public final int il1LilLllii;
    @Nullable
    public final C0045Ooooo00 illlI1lLIL;

    public C0549oooOO0(List<o00OO00O> list, C0452o0OoOo00 o0oooo00, @Nullable C0045Ooooo00 ooooo00, int i, C0333o0O0ooO0 o0o0ooo0, iiIIl1I iiiil1i, int i2, int i3, int i4) {
        this.iiI1L1iI = list;
        this.i1LIL11l = o0oooo00;
        this.illlI1lLIL = ooooo00;
        this.il1LilLllii = i;
        this.iiIliillii = o0o0ooo0;
        this.iilLil1i11I1 = iiiil1i;
        this.I11lLL1 = i2;
        this.iLLLILIiLi1Ii = i3;
        this.IiIIlIL = i4;
    }

    public o00OO00O.iiI1L1iI I11lLL1(int i, TimeUnit timeUnit) {
        return new C0549oooOO0(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1, C0487o0OooooO.iiIliillii("timeout", (long) i, timeUnit), this.iLLLILIiLi1Ii, this.IiIIlIL);
    }

    public C0337o0O0oooO IiIIlIL(C0333o0O0ooO0 o0o0ooo0) throws IOException {
        return IiiL1llIIi(o0o0ooo0, this.i1LIL11l, this.illlI1lLIL);
    }

    public C0337o0O0oooO IiiL1llIIi(C0333o0O0ooO0 o0o0ooo0, C0452o0OoOo00 o0oooo00, @Nullable C0045Ooooo00 ooooo00) throws IOException {
        if (this.il1LilLllii < this.iiI1L1iI.size()) {
            this.iilLiIIIi11i++;
            C0045Ooooo00 ooooo002 = this.illlI1lLIL;
            if (ooooo002 != null && !ooooo002.illlI1lLIL().i1iiLIil1ILi(o0o0ooo0.IiiL1llIIi())) {
                throw new IllegalStateException("network interceptor " + this.iiI1L1iI.get(this.il1LilLllii - 1) + " must retain the same host and port");
            } else if (this.illlI1lLIL == null || this.iilLiIIIi11i <= 1) {
                C0549oooOO0 ooooo0 = new C0549oooOO0(this.iiI1L1iI, o0oooo00, ooooo00, this.il1LilLllii + 1, o0o0ooo0, this.iilLil1i11I1, this.I11lLL1, this.iLLLILIiLi1Ii, this.IiIIlIL);
                o00OO00O o00oo00o = this.iiI1L1iI.get(this.il1LilLllii);
                C0337o0O0oooO iiI1L1iI2 = o00oo00o.iiI1L1iI(ooooo0);
                if (ooooo00 != null && this.il1LilLllii + 1 < this.iiI1L1iI.size() && ooooo0.iilLiIIIi11i != 1) {
                    throw new IllegalStateException("network interceptor " + o00oo00o + " must call proceed() exactly once");
                } else if (iiI1L1iI2 == null) {
                    throw new NullPointerException("interceptor " + o00oo00o + " returned null");
                } else if (iiI1L1iI2.iiI1L1iI() != null) {
                    return iiI1L1iI2;
                } else {
                    throw new IllegalStateException("interceptor " + o00oo00o + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.iiI1L1iI.get(this.il1LilLllii - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public iiIIl1I call() {
        return this.iilLil1i11I1;
    }

    public int i1LIL11l() {
        return this.IiIIlIL;
    }

    public C0452o0OoOo00 iILiI1lll() {
        return this.i1LIL11l;
    }

    public int iLLLILIiLi1Ii() {
        return this.iLLLILIiLi1Ii;
    }

    public C0333o0O0ooO0 iiI1L1iI() {
        return this.iiIliillii;
    }

    public int iiIliillii() {
        return this.I11lLL1;
    }

    public C0045Ooooo00 iilLiIIIi11i() {
        C0045Ooooo00 ooooo00 = this.illlI1lLIL;
        if (ooooo00 != null) {
            return ooooo00;
        }
        throw new IllegalStateException();
    }

    public o00OO00O.iiI1L1iI iilLil1i11I1(int i, TimeUnit timeUnit) {
        return new C0549oooOO0(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1, this.I11lLL1, C0487o0OooooO.iiIliillii("timeout", (long) i, timeUnit), this.IiIIlIL);
    }

    public o00OO00O.iiI1L1iI il1LilLllii(int i, TimeUnit timeUnit) {
        return new C0549oooOO0(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1, this.I11lLL1, this.iLLLILIiLi1Ii, C0487o0OooooO.iiIliillii("timeout", (long) i, timeUnit));
    }

    @Nullable
    public ILILl1IL1Iil illlI1lLIL() {
        C0045Ooooo00 ooooo00 = this.illlI1lLIL;
        if (ooooo00 != null) {
            return ooooo00.illlI1lLIL();
        }
        return null;
    }
}
