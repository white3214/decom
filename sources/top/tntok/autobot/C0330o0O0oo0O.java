package top.tntok.autobot;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0452o0OoOo00;

/* renamed from: top.tntok.autobot.o0O0oo0O  reason: case insensitive filesystem */
public final class C0330o0O0oo0O {
    public static final Executor I11lLL1 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0487o0OooooO.IILiIL1i11Li("OkHttp ConnectionPool", true));
    public static final /* synthetic */ boolean iLLLILIiLi1Ii = false;
    public final long i1LIL11l;
    public final int iiI1L1iI;
    public final C0397o0OOooO0 iiIliillii = new C0397o0OOooO0();
    public boolean iilLil1i11I1;
    public final Deque<C0315o0O0o0oO> il1LilLllii = new ArrayDeque();
    public final Runnable illlI1lLIL = new C0316o0O0o0oo(this);

    public C0330o0O0oo0O(int i, long j, TimeUnit timeUnit) {
        this.iiI1L1iI = i;
        this.i1LIL11l = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    public synchronized int I11lLL1() {
        int i;
        i = 0;
        for (C0315o0O0o0oO o0o0o0oo : this.il1LilLllii) {
            if (o0o0o0oo.iL1LIlIlI.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final int IiIIlIL(C0315o0O0o0oO o0o0o0oo, long j) {
        List<Reference<C0452o0OoOo00>> list = o0o0o0oo.iL1LIlIlI;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C0292o0O0O0oO.I1iIiIi().ILl1iII11Ll1("A connection to " + o0o0o0oo.i1LIL11l().iiI1L1iI().iILiI1lll() + " was leaked. Did you forget to close a response body?", ((C0452o0OoOo00.i1LIL11l) reference).iiI1L1iI);
                list.remove(i);
                o0o0o0oo.IiiL1llIIi = true;
                if (list.isEmpty()) {
                    o0o0o0oo.i111iLiiIIill = j - this.i1LIL11l;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public boolean IiiL1llIIi(ILl1iII11Ll1 iLl1iII11Ll1, C0452o0OoOo00 o0oooo00, @Nullable List<o0OO0OoO> list, boolean z) {
        for (C0315o0O0o0oO next : this.il1LilLllii) {
            if ((!z || next.i111iLiiIIill()) && next.IL1lILLLL1L(iLl1iII11Ll1, list)) {
                o0oooo00.iiI1L1iI(next);
                return true;
            }
        }
        return false;
    }

    public long i1LIL11l(long j) {
        synchronized (this) {
            try {
                C0315o0O0o0oO o0o0o0oo = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C0315o0O0o0oO next : this.il1LilLllii) {
                    if (IiIIlIL(next, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = j - next.i111iLiiIIill;
                        if (j3 > j2) {
                            o0o0o0oo = next;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.i1LIL11l;
                if (j2 < j4) {
                    if (i <= this.iiI1L1iI) {
                        if (i > 0) {
                            long j5 = j4 - j2;
                            return j5;
                        } else if (i2 > 0) {
                            return j4;
                        } else {
                            this.iilLil1i11I1 = false;
                            return -1;
                        }
                    }
                }
                this.il1LilLllii.remove(o0o0o0oo);
                C0487o0OooooO.IiIIlIL(o0o0o0oo.illlI1lLIL());
                return 0;
            } finally {
                while (true) {
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void iLLLILIiLi1Ii() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.i1LIL11l(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0330o0O0oo0O.iLLLILIiLi1Ii():void");
    }

    public synchronized int iiIliillii() {
        return this.il1LilLllii.size();
    }

    public void iilLiIIIi11i(C0315o0O0o0oO o0o0o0oo) {
        if (!this.iilLil1i11I1) {
            this.iilLil1i11I1 = true;
            I11lLL1.execute(this.illlI1lLIL);
        }
        this.il1LilLllii.add(o0o0o0oo);
    }

    public void iilLil1i11I1() {
        ArrayList<C0315o0O0o0oO> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                Iterator<C0315o0O0o0oO> it = this.il1LilLllii.iterator();
                while (it.hasNext()) {
                    C0315o0O0o0oO next = it.next();
                    if (next.iL1LIlIlI.isEmpty()) {
                        next.IiiL1llIIi = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        for (C0315o0O0o0oO illlI1lLIL2 : arrayList) {
            C0487o0OooooO.IiIIlIL(illlI1lLIL2.illlI1lLIL());
        }
    }

    public boolean il1LilLllii(C0315o0O0o0oO o0o0o0oo) {
        if (o0o0o0oo.IiiL1llIIi || this.iiI1L1iI == 0) {
            this.il1LilLllii.remove(o0o0o0oo);
            return true;
        }
        notifyAll();
        return false;
    }

    public void illlI1lLIL(o0OO0OoO o0oo0ooo, IOException iOException) {
        if (o0oo0ooo.i1LIL11l().type() != Proxy.Type.DIRECT) {
            ILl1iII11Ll1 iiI1L1iI2 = o0oo0ooo.iiI1L1iI();
            iiI1L1iI2.IiIIlIL().connectFailed(iiI1L1iI2.iILiI1lll().IIllllLiIlIl(), o0oo0ooo.i1LIL11l().address(), iOException);
        }
        this.iiIliillii.i1LIL11l(o0oo0ooo);
    }
}
