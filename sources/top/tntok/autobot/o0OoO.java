package top.tntok.autobot;

public class o0OoO implements Runnable {
    public final long i1LIL11l;
    public final Thread iiI1L1iI;

    public o0OoO(Thread thread, long j) {
        this.iiI1L1iI = thread;
        this.i1LIL11l = j;
    }

    public static Thread i1LIL11l(long j) {
        return illlI1lLIL(Thread.currentThread(), j);
    }

    public static void iiI1L1iI(long j) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis() + j;
        do {
            Thread.sleep(j);
            j = currentTimeMillis - System.currentTimeMillis();
        } while (j > 0);
    }

    public static void il1LilLllii(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    public static Thread illlI1lLIL(Thread thread, long j) {
        if (j <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new o0OoO(thread, j), o0OoO.class.getSimpleName());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public void run() {
        try {
            iiI1L1iI(this.i1LIL11l);
            this.iiI1L1iI.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
