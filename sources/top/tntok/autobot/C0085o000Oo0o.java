package top.tntok.autobot;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: top.tntok.autobot.o000Oo0o  reason: case insensitive filesystem */
public class C0085o000Oo0o implements Executor {
    public final Handler iiI1L1iI;

    public C0085o000Oo0o(Handler handler) {
        this.iiI1L1iI = handler;
    }

    public void execute(Runnable runnable) {
        if (!this.iiI1L1iI.post(runnable)) {
            throw new RejectedExecutionException(this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("obtuD27VZaj1u3NIPdl/q+8=\n", "gdIdLx29ENw=\n"));
        }
    }
}
