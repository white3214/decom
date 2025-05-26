package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: top.tntok.autobot.o00OoooO  reason: case insensitive filesystem */
public class C0182o00OoooO {
    public final org.junit.runner.notification.iiI1L1iI i1LIL11l;
    public final Object iiI1L1iI;
    public C0425o0Oo0oO0 il1LilLllii;
    public final C0009OooO0oO illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00OoooO$i1LIL11l */
    public class i1LIL11l implements Runnable {
        public i1LIL11l() {
        }

        public void run() {
            C0182o00OoooO.this.I11lLL1();
        }
    }

    /* renamed from: top.tntok.autobot.o00OoooO$iiI1L1iI */
    public class iiI1L1iI implements Runnable {
        public final /* synthetic */ long iiI1L1iI;

        /* renamed from: top.tntok.autobot.o00OoooO$iiI1L1iI$iiI1L1iI  reason: collision with other inner class name */
        public class C0003iiI1L1iI implements Callable<Object> {
            public C0003iiI1L1iI() {
            }

            public Object call() throws Exception {
                C0182o00OoooO.this.I11lLL1();
                return null;
            }
        }

        public iiI1L1iI(long j) {
            this.iiI1L1iI = j;
        }

        public void run() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future submit = newSingleThreadExecutor.submit(new C0003iiI1L1iI());
            newSingleThreadExecutor.shutdown();
            try {
                long j = this.iiI1L1iI;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!newSingleThreadExecutor.awaitTermination(j, timeUnit)) {
                    newSingleThreadExecutor.shutdownNow();
                }
                submit.get(0, timeUnit);
            } catch (TimeoutException unused) {
                C0182o00OoooO.this.iiI1L1iI(new C0431o0OoO0(this.iiI1L1iI, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                C0182o00OoooO.this.iiI1L1iI(e);
            }
        }
    }

    public C0182o00OoooO(Object obj, C0425o0Oo0oO0 o0oo0oo0, org.junit.runner.notification.iiI1L1iI iii1l1ii, C0009OooO0oO oooO0oO) {
        this.iiI1L1iI = obj;
        this.i1LIL11l = iii1l1ii;
        this.illlI1lLIL = oooO0oO;
        this.il1LilLllii = o0oo0oo0;
    }

    public void I11lLL1() {
        try {
            this.il1LilLllii.iilLil1i11I1(this.iiI1L1iI);
            if (this.il1LilLllii.iiI1L1iI()) {
                iiI1L1iI(new AssertionError("Expected exception: " + this.il1LilLllii.il1LilLllii().getName()));
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof iLILliI1)) {
                if (!this.il1LilLllii.iiI1L1iI()) {
                    iiI1L1iI(targetException);
                } else if (this.il1LilLllii.iLLLILIiLi1Ii(targetException)) {
                    iiI1L1iI(new Exception("Unexpected exception, expected<" + this.il1LilLllii.il1LilLllii().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
                }
            }
        } catch (Throwable th) {
            iiI1L1iI(th);
        }
    }

    public void i1LIL11l() {
        if (this.il1LilLllii.I11lLL1()) {
            this.i1LIL11l.IiIIlIL(this.illlI1lLIL);
            return;
        }
        this.i1LIL11l.iILiI1lll(this.illlI1lLIL);
        try {
            long iiIliillii = this.il1LilLllii.iiIliillii();
            if (iiIliillii > 0) {
                iLLLILIiLi1Ii(iiIliillii);
            } else {
                iilLil1i11I1();
            }
        } finally {
            this.i1LIL11l.iLLLILIiLi1Ii(this.illlI1lLIL);
        }
    }

    public final void iLLLILIiLi1Ii(long j) {
        iiIliillii(new iiI1L1iI(j));
    }

    public void iiI1L1iI(Throwable th) {
        this.i1LIL11l.iilLil1i11I1(new o00O0O(this.illlI1lLIL, th));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iiIliillii(java.lang.Runnable r2) {
        /*
            r1 = this;
            r1.il1LilLllii()     // Catch:{ ooOO -> 0x0006, Exception -> 0x000c }
            r2.run()     // Catch:{ ooOO -> 0x0006, Exception -> 0x000c }
        L_0x0006:
            r1.illlI1lLIL()
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            goto L_0x0014
        L_0x000c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x000a }
            java.lang.String r0 = "test should never throw an exception to this level"
            r2.<init>(r0)     // Catch:{ all -> 0x000a }
            throw r2     // Catch:{ all -> 0x000a }
        L_0x0014:
            r1.illlI1lLIL()
            throw r2
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0182o00OoooO.iiIliillii(java.lang.Runnable):void");
    }

    public void iilLil1i11I1() {
        iiIliillii(new i1LIL11l());
    }

    public final void il1LilLllii() throws C0548ooOO {
        try {
            for (Method invoke : this.il1LilLllii.illlI1lLIL()) {
                invoke.invoke(this.iiI1L1iI, (Object[]) null);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (iLILliI1 unused) {
            throw new C0548ooOO();
        } catch (Throwable th) {
            iiI1L1iI(th);
            throw new C0548ooOO();
        }
    }

    public final void illlI1lLIL() {
        for (Method invoke : this.il1LilLllii.i1LIL11l()) {
            try {
                invoke.invoke(this.iiI1L1iI, (Object[]) null);
            } catch (InvocationTargetException e) {
                iiI1L1iI(e.getTargetException());
            } catch (Throwable th) {
                iiI1L1iI(th);
            }
        }
    }
}
