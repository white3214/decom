package top.tntok.autobot;

import java.util.concurrent.TimeUnit;

public final class o0O0o00O extends C0446o0OoOOOo {
    public long I11lLL1;
    public long iLLLILIiLi1Ii;
    public C0446o0OoOOOo iiIliillii;
    public boolean iilLil1i11I1;

    public void I1iIiIi(C0446o0OoOOOo o0oooooo) {
        long j;
        this.iiIliillii = o0oooooo;
        boolean iilLil1i11I12 = o0oooooo.iilLil1i11I1();
        this.iilLil1i11I1 = iilLil1i11I12;
        if (iilLil1i11I12) {
            j = o0oooooo.il1LilLllii();
        } else {
            j = -1;
        }
        this.I11lLL1 = j;
        long iilLiIIIi11i = o0oooooo.iilLiIIIi11i();
        this.iLLLILIiLi1Ii = iilLiIIIi11i;
        o0oooooo.IiIIlIL(C0446o0OoOOOo.I11lLL1(iilLiIIIi11i, iilLiIIIi11i()), TimeUnit.NANOSECONDS);
        if (this.iilLil1i11I1 && iilLil1i11I1()) {
            o0oooooo.iiIliillii(Math.min(il1LilLllii(), this.I11lLL1));
        } else if (iilLil1i11I1()) {
            o0oooooo.iiIliillii(il1LilLllii());
        }
    }

    public void iILiI1lll() {
        this.iiIliillii.IiIIlIL(this.iLLLILIiLi1Ii, TimeUnit.NANOSECONDS);
        if (this.iilLil1i11I1) {
            this.iiIliillii.iiIliillii(this.I11lLL1);
        } else {
            this.iiIliillii.iiI1L1iI();
        }
    }
}
