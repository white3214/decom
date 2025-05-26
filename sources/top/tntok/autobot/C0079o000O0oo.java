package top.tntok.autobot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o000O0oo  reason: case insensitive filesystem */
public class C0079o000O0oo extends C0446o0OoOOOo {
    public C0446o0OoOOOo iiIliillii;

    public C0079o000O0oo(C0446o0OoOOOo o0oooooo) {
        if (o0oooooo != null) {
            this.iiIliillii = o0oooooo;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final C0079o000O0oo I1iIiIi(C0446o0OoOOOo o0oooooo) {
        if (o0oooooo != null) {
            this.iiIliillii = o0oooooo;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public C0446o0OoOOOo IiIIlIL(long j, TimeUnit timeUnit) {
        return this.iiIliillii.IiIIlIL(j, timeUnit);
    }

    public C0446o0OoOOOo i1LIL11l() {
        return this.iiIliillii.i1LIL11l();
    }

    public final C0446o0OoOOOo iILiI1lll() {
        return this.iiIliillii;
    }

    public void iLLLILIiLi1Ii() throws IOException {
        this.iiIliillii.iLLLILIiLi1Ii();
    }

    public C0446o0OoOOOo iiI1L1iI() {
        return this.iiIliillii.iiI1L1iI();
    }

    public C0446o0OoOOOo iiIliillii(long j) {
        return this.iiIliillii.iiIliillii(j);
    }

    public long iilLiIIIi11i() {
        return this.iiIliillii.iilLiIIIi11i();
    }

    public boolean iilLil1i11I1() {
        return this.iiIliillii.iilLil1i11I1();
    }

    public long il1LilLllii() {
        return this.iiIliillii.il1LilLllii();
    }
}
