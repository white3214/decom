package top.tntok.autobot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: top.tntok.autobot.o00OooOO  reason: case insensitive filesystem */
public abstract class C0180o00OooOO extends C0328o0O0oo {
    public volatile C0346o0OO0oOO i1LIL11l;
    public final Lock iiI1L1iI = new ReentrantLock();

    public abstract C0346o0OO0oOO I1iIiIi();

    public final C0346o0OO0oOO iLLLILIiLi1Ii() {
        if (this.i1LIL11l == null) {
            this.iiI1L1iI.lock();
            try {
                if (this.i1LIL11l == null) {
                    this.i1LIL11l = I1iIiIi();
                }
            } finally {
                this.iiI1L1iI.unlock();
            }
        }
        return this.i1LIL11l;
    }
}
