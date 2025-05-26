package top.tntok.autobot;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* renamed from: top.tntok.autobot.o0Oo0oo  reason: case insensitive filesystem */
public final class C0427o0Oo0oo implements Runnable {
    public final List<o0OO00O> i1LIL11l;
    public final long iiI1L1iI;
    public volatile boolean iiIliillii;
    public ThreadFactory il1LilLllii;
    public Thread illlI1lLIL;

    public C0427o0Oo0oo() {
        this(10000);
    }

    public synchronized void I11lLL1() throws Exception {
        iLLLILIiLi1Ii(this.iiI1L1iI);
    }

    public long i1LIL11l() {
        return this.iiI1L1iI;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|8|9|10|(2:13|11)|21|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void iLLLILIiLi1Ii(long r2) throws java.lang.Exception {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.iiIliillii     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r1.iiIliillii = r0     // Catch:{ all -> 0x0013 }
            java.lang.Thread r0 = r1.illlI1lLIL     // Catch:{ InterruptedException -> 0x0015 }
            r0.interrupt()     // Catch:{ InterruptedException -> 0x0015 }
            java.lang.Thread r0 = r1.illlI1lLIL     // Catch:{ InterruptedException -> 0x0015 }
            r0.join(r2)     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x001c
        L_0x0013:
            r2 = move-exception
            goto L_0x003c
        L_0x0015:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0013 }
            r2.interrupt()     // Catch:{ all -> 0x0013 }
        L_0x001c:
            java.util.List<top.tntok.autobot.o0OO00O> r2 = r1.i1LIL11l     // Catch:{ all -> 0x0013 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0013 }
        L_0x0022:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0013 }
            top.tntok.autobot.o0OO00O r3 = (top.tntok.autobot.o0OO00O) r3     // Catch:{ all -> 0x0013 }
            r3.iiIliillii()     // Catch:{ all -> 0x0013 }
            goto L_0x0022
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "Monitor is not running"
            r2.<init>(r3)     // Catch:{ all -> 0x0013 }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x003c:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0427o0Oo0oo.iLLLILIiLi1Ii(long):void");
    }

    public void iiI1L1iI(o0OO00O o0oo00o) {
        if (o0oo00o != null) {
            this.i1LIL11l.add(o0oo00o);
        }
    }

    public synchronized void iiIliillii(ThreadFactory threadFactory) {
        this.il1LilLllii = threadFactory;
    }

    public synchronized void iilLil1i11I1() throws Exception {
        try {
            if (!this.iiIliillii) {
                for (o0OO00O I1iIiIi : this.i1LIL11l) {
                    I1iIiIi.I1iIiIi();
                }
                this.iiIliillii = true;
                ThreadFactory threadFactory = this.il1LilLllii;
                if (threadFactory != null) {
                    this.illlI1lLIL = threadFactory.newThread(this);
                } else {
                    this.illlI1lLIL = new Thread(this);
                }
                this.illlI1lLIL.start();
            } else {
                throw new IllegalStateException("Monitor is already running");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void il1LilLllii(o0OO00O o0oo00o) {
        if (o0oo00o != null) {
            do {
            } while (this.i1LIL11l.remove(o0oo00o));
        }
    }

    public Iterable<o0OO00O> illlI1lLIL() {
        return this.i1LIL11l;
    }

    public void run() {
        while (this.iiIliillii) {
            for (o0OO00O i1LIL11l2 : this.i1LIL11l) {
                i1LIL11l2.i1LIL11l();
            }
            if (this.iiIliillii) {
                try {
                    Thread.sleep(this.iiI1L1iI);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    public C0427o0Oo0oo(long j) {
        this.i1LIL11l = new CopyOnWriteArrayList();
        this.illlI1lLIL = null;
        this.iiIliillii = false;
        this.iiI1L1iI = j;
    }

    public C0427o0Oo0oo(long j, o0OO00O... o0oo00oArr) {
        this(j);
        if (o0oo00oArr != null) {
            for (o0OO00O iiI1L1iI2 : o0oo00oArr) {
                iiI1L1iI(iiI1L1iI2);
            }
        }
    }
}
