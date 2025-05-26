package top.tntok.autobot;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: top.tntok.autobot.o0OoOo0  reason: case insensitive filesystem */
public class C0451o0OoOo0 extends C0374o0OOo00o {
    public final TimeUnit i1LIL11l;
    public final C0374o0OOo00o iiI1L1iI;
    public final long illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OoOo0$i1LIL11l */
    public static class i1LIL11l {
        public TimeUnit i1LIL11l;
        public long iiI1L1iI;

        public i1LIL11l il1LilLllii(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            } else if (timeUnit != null) {
                this.iiI1L1iI = j;
                this.i1LIL11l = timeUnit;
                return this;
            } else {
                throw new NullPointerException("TimeUnit cannot be null");
            }
        }

        public C0451o0OoOo0 illlI1lLIL(C0374o0OOo00o o0ooo00o) {
            if (o0ooo00o != null) {
                return new C0451o0OoOo0(this, o0ooo00o);
            }
            throw new NullPointerException("statement cannot be null");
        }

        public i1LIL11l() {
            this.iiI1L1iI = 0;
            this.i1LIL11l = TimeUnit.SECONDS;
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOo0$illlI1lLIL */
    public class illlI1lLIL implements Callable<Throwable> {
        public final CountDownLatch iiI1L1iI;

        public illlI1lLIL() {
            this.iiI1L1iI = new CountDownLatch(1);
        }

        /* renamed from: i1LIL11l */
        public Throwable call() throws Exception {
            try {
                this.iiI1L1iI.countDown();
                C0451o0OoOo0.this.iiI1L1iI.iiI1L1iI();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }

        public void iiI1L1iI() throws InterruptedException {
            this.iiI1L1iI.await();
        }
    }

    public static i1LIL11l illlI1lLIL() {
        return new i1LIL11l();
    }

    public void iiI1L1iI() throws Throwable {
        illlI1lLIL illli1llil = new illlI1lLIL();
        FutureTask futureTask = new FutureTask(illli1llil);
        Thread thread = new Thread(futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        illli1llil.iiI1L1iI();
        Throwable iiIliillii = iiIliillii(futureTask, thread);
        if (iiIliillii != null) {
            throw iiIliillii;
        }
    }

    public final Throwable iiIliillii(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            long j = this.illlI1lLIL;
            if (j > 0) {
                return futureTask.get(j, this.i1LIL11l);
            }
            return futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return il1LilLllii(thread);
        }
    }

    public final Exception il1LilLllii(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        C0431o0OoO0 o0ooo0 = new C0431o0OoO0(this.illlI1lLIL, this.i1LIL11l);
        if (stackTrace != null) {
            o0ooo0.setStackTrace(stackTrace);
            thread.interrupt();
        }
        return o0ooo0;
    }

    @Deprecated
    public C0451o0OoOo0(C0374o0OOo00o o0ooo00o, long j) {
        this(illlI1lLIL().il1LilLllii(j, TimeUnit.MILLISECONDS), o0ooo00o);
    }

    public C0451o0OoOo0(i1LIL11l i1lil11l, C0374o0OOo00o o0ooo00o) {
        this.iiI1L1iI = o0ooo00o;
        this.illlI1lLIL = i1lil11l.iiI1L1iI;
        this.i1LIL11l = i1lil11l.i1LIL11l;
    }
}
