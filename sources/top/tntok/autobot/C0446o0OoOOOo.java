package top.tntok.autobot;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o0OoOOOo  reason: case insensitive filesystem */
public class C0446o0OoOOOo {
    public static final C0446o0OoOOOo il1LilLllii = new iiI1L1iI();
    public long i1LIL11l;
    public boolean iiI1L1iI;
    public long illlI1lLIL;

    public static long I11lLL1(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        if (j2 != 0 && j >= j2) {
            return j2;
        }
        return j;
    }

    public C0446o0OoOOOo IiIIlIL(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.illlI1lLIL = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void IiiL1llIIi(Object obj) throws InterruptedIOException {
        try {
            boolean iilLil1i11I1 = iilLil1i11I1();
            long iilLiIIIi11i = iilLiIIIi11i();
            long j = 0;
            if (iilLil1i11I1 || iilLiIIIi11i != 0) {
                long nanoTime = System.nanoTime();
                if (iilLil1i11I1 && iilLiIIIi11i != 0) {
                    iilLiIIIi11i = Math.min(iilLiIIIi11i, il1LilLllii() - nanoTime);
                } else if (iilLil1i11I1) {
                    iilLiIIIi11i = il1LilLllii() - nanoTime;
                }
                if (iilLiIIIi11i > 0) {
                    long j2 = iilLiIIIi11i / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (iilLiIIIi11i - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= iilLiIIIi11i) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C0446o0OoOOOo i1LIL11l() {
        this.illlI1lLIL = 0;
        return this;
    }

    public void iLLLILIiLi1Ii() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.iiI1L1iI && this.i1LIL11l - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C0446o0OoOOOo iiI1L1iI() {
        this.iiI1L1iI = false;
        return this;
    }

    public C0446o0OoOOOo iiIliillii(long j) {
        this.iiI1L1iI = true;
        this.i1LIL11l = j;
        return this;
    }

    public long iilLiIIIi11i() {
        return this.illlI1lLIL;
    }

    public boolean iilLil1i11I1() {
        return this.iiI1L1iI;
    }

    public long il1LilLllii() {
        if (this.iiI1L1iI) {
            return this.i1LIL11l;
        }
        throw new IllegalStateException("No deadline");
    }

    public final C0446o0OoOOOo illlI1lLIL(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + j);
        } else if (timeUnit != null) {
            return iiIliillii(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOOOo$iiI1L1iI */
    public class iiI1L1iI extends C0446o0OoOOOo {
        public void iLLLILIiLi1Ii() throws IOException {
        }

        public C0446o0OoOOOo iiIliillii(long j) {
            return this;
        }

        public C0446o0OoOOOo IiIIlIL(long j, TimeUnit timeUnit) {
            return this;
        }
    }
}
