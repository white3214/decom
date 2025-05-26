package top.tntok.autobot;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: top.tntok.autobot.OooOOo0  reason: case insensitive filesystem */
public final class C0014OooOOo0 {
    public Thread i1LIL11l;
    public final i11ILLI1I iiI1L1iI;
    public final BlockingQueue<OooOOOO> illlI1lLIL = new ArrayBlockingQueue(16);

    public C0014OooOOo0(i11ILLI1I i11illi1i) {
        this.iiI1L1iI = i11illi1i;
    }

    public void I11lLL1() {
        Thread thread = this.i1LIL11l;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public void i1LIL11l() throws InterruptedException {
        Thread thread = this.i1LIL11l;
        if (thread != null) {
            thread.join();
        }
    }

    public void iiIliillii(OooOOOO oooOOOO) {
        if (!this.illlI1lLIL.offer(oooOOOO)) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("fJdCyR+NkvldgUfBG42S8EqdRNAZjIi0\n", "OPI0oHzospQ=\n") + oooOOOO.iLLLILIiLi1Ii());
        }
    }

    public void iilLil1i11I1() {
        Thread thread = new Thread(new C0012OooOOOo(this), C0387o0OOoO0o.iiI1L1iI("/tsKJAJ9MkHu0Qo0\n", "nbRkUHASXmw=\n"));
        this.i1LIL11l = thread;
        thread.start();
    }

    public final void il1LilLllii() throws IOException, InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            this.iiI1L1iI.i1LIL11l(this.illlI1lLIL.take());
        }
    }

    public final /* synthetic */ void illlI1lLIL() {
        String str;
        String str2;
        try {
            il1LilLllii();
            str = "8zEe7/aPxJDSJxvn8o/EjtI6DOPnypeJ2CQY4/E=\n";
            str2 = "t1RohpXq5P0=\n";
        } catch (IOException | InterruptedException unused) {
            str = "wre1Z1rOMjXjobBvXs4yK+O8p2tLi2Es6aKza10=\n";
            str2 = "htLDDjmrElg=\n";
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("dQ8wIoJYdCpUGTUqhlh0NFQEIi6THSczXho2LoU=\n", "MWpGS+E9VEc=\n"));
            throw th;
        }
        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI(str, str2));
    }
}
