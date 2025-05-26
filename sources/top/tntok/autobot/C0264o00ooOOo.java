package top.tntok.autobot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o00ooOOo  reason: case insensitive filesystem */
public class C0264o00ooOOo extends i1LlIiLL1 {
    public final boolean i1LIL11l;
    public final boolean iiI1L1iI;

    /* renamed from: top.tntok.autobot.o00ooOOo$iiI1L1iI */
    public class iiI1L1iI implements C0347o0OO0oOo {
        public final ExecutorService iiI1L1iI = Executors.newCachedThreadPool();

        public void i1LIL11l() {
            try {
                this.iiI1L1iI.shutdown();
                this.iiI1L1iI.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }

        public void iiI1L1iI(Runnable runnable) {
            this.iiI1L1iI.submit(runnable);
        }
    }

    public C0264o00ooOOo(boolean z, boolean z2) {
        this.iiI1L1iI = z;
        this.i1LIL11l = z2;
    }

    public static i1LlIiLL1 iiIliillii() {
        return new C0264o00ooOOo(false, true);
    }

    public static C0346o0OO0oOO iilLil1i11I1(C0346o0OO0oOO o0oo0ooo) {
        if (o0oo0ooo instanceof C0270o00ooo0) {
            ((C0270o00ooo0) o0oo0ooo).IliiLiLliIl(new iiI1L1iI());
        }
        return o0oo0ooo;
    }

    public static i1LlIiLL1 il1LilLllii() {
        return new C0264o00ooOOo(true, false);
    }

    public C0346o0OO0oOO i1LIL11l(C0402o0OOoooO o0oooooo, Class<?>[] clsArr) throws C0136o00O0oo {
        C0346o0OO0oOO i1LIL11l2 = super.i1LIL11l(o0oooooo, clsArr);
        if (this.iiI1L1iI) {
            return iilLil1i11I1(i1LIL11l2);
        }
        return i1LIL11l2;
    }

    public C0346o0OO0oOO iiI1L1iI(C0402o0OOoooO o0oooooo, Class<?> cls) throws Throwable {
        C0346o0OO0oOO iiI1L1iI2 = super.iiI1L1iI(o0oooooo, cls);
        if (this.i1LIL11l) {
            return iilLil1i11I1(iiI1L1iI2);
        }
        return iiI1L1iI2;
    }
}
