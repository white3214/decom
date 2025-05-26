package top.tntok.autobot;

import java.util.concurrent.Semaphore;

/* renamed from: top.tntok.autobot.o00oo0O  reason: case insensitive filesystem */
public final /* synthetic */ class C0250o00oo0O implements Runnable {
    public final /* synthetic */ Semaphore i1LIL11l;
    public final /* synthetic */ C0254o00oo0o iiI1L1iI;

    public /* synthetic */ C0250o00oo0O(C0254o00oo0o o00oo0o, Semaphore semaphore) {
        this.iiI1L1iI = o00oo0o;
        this.i1LIL11l = semaphore;
    }

    public final void run() {
        this.iiI1L1iI.iLLLILIiLi1Ii(this.i1LIL11l);
    }
}
