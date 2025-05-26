package top.tntok.autobot;

import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o0OOo0Oo  reason: case insensitive filesystem */
public class C0378o0OOo0Oo implements C0429o0Oo0ooO {
    public volatile long i1LIL11l;
    public final i1LIL11l iiI1L1iI;
    public volatile long illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OOo0Oo$i1LIL11l */
    public static class i1LIL11l {
        public long iiI1L1iI() {
            return System.nanoTime();
        }
    }

    /* renamed from: top.tntok.autobot.o0OOo0Oo$illlI1lLIL */
    public class illlI1lLIL extends C0522o0oO0O00 {
        public illlI1lLIL() {
        }

        public void I11lLL1(Throwable th, C0009OooO0oO oooO0oO) {
            C0378o0OOo0Oo.this.IiiL1llIIi();
            C0378o0OOo0Oo o0ooo0oo = C0378o0OOo0Oo.this;
            o0ooo0oo.iiIliillii(o0ooo0oo.I11lLL1(), th, oooO0oO);
        }

        public void IiIIlIL(C0009OooO0oO oooO0oO) {
            C0378o0OOo0Oo o0ooo0oo = C0378o0OOo0Oo.this;
            o0ooo0oo.iilLil1i11I1(o0ooo0oo.I11lLL1(), oooO0oO);
        }

        public void i1L1lLllLLlIi(C0009OooO0oO oooO0oO) {
            C0378o0OOo0Oo.this.iilLiIIIi11i();
        }

        public void iILiI1lll(i1i1111LLILli i1i1111llilli, C0009OooO0oO oooO0oO) {
            C0378o0OOo0Oo.this.IiiL1llIIi();
            C0378o0OOo0Oo o0ooo0oo = C0378o0OOo0Oo.this;
            o0ooo0oo.IiIIlIL(o0ooo0oo.I11lLL1(), i1i1111llilli, oooO0oO);
        }

        public void iL1LIlIlI(C0009OooO0oO oooO0oO) {
            C0378o0OOo0Oo.this.IiiL1llIIi();
            C0378o0OOo0Oo o0ooo0oo = C0378o0OOo0Oo.this;
            o0ooo0oo.iILiI1lll(o0ooo0oo.I11lLL1(), oooO0oO);
        }
    }

    public C0378o0OOo0Oo() {
        this(new i1LIL11l());
    }

    public final long I11lLL1() {
        if (this.i1LIL11l != 0) {
            long j = this.illlI1lLIL;
            if (j == 0) {
                j = this.iiI1L1iI.iiI1L1iI();
            }
            return j - this.i1LIL11l;
        }
        throw new IllegalStateException("Test has not started");
    }

    public final void IiiL1llIIi() {
        this.illlI1lLIL = this.iiI1L1iI.iiI1L1iI();
    }

    public long iLLLILIiLi1Ii(TimeUnit timeUnit) {
        return timeUnit.convert(I11lLL1(), TimeUnit.NANOSECONDS);
    }

    public final C0374o0OOo00o iiI1L1iI(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO) {
        return new illlI1lLIL().iiI1L1iI(o0ooo00o, oooO0oO);
    }

    public final void iilLiIIIi11i() {
        this.i1LIL11l = this.iiI1L1iI.iiI1L1iI();
        this.illlI1lLIL = 0;
    }

    public C0378o0OOo0Oo(i1LIL11l i1lil11l) {
        this.iiI1L1iI = i1lil11l;
    }

    public void iILiI1lll(long j, C0009OooO0oO oooO0oO) {
    }

    public void iilLil1i11I1(long j, C0009OooO0oO oooO0oO) {
    }

    public void IiIIlIL(long j, i1i1111LLILli i1i1111llilli, C0009OooO0oO oooO0oO) {
    }

    public void iiIliillii(long j, Throwable th, C0009OooO0oO oooO0oO) {
    }
}
