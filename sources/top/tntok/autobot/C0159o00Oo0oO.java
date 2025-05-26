package top.tntok.autobot;

import java.io.IOException;
import java.util.function.Consumer;

/* renamed from: top.tntok.autobot.o00Oo0oO  reason: case insensitive filesystem */
public final /* synthetic */ class C0159o00Oo0oO implements Consumer {
    public final /* synthetic */ IOException iiI1L1iI;

    public /* synthetic */ C0159o00Oo0oO(IOException iOException) {
        this.iiI1L1iI = iOException;
    }

    public final void accept(Object obj) {
        this.iiI1L1iI.addSuppressed((IOException) obj);
    }
}
