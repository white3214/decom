package top.tntok.autobot;

import java.io.IOException;
import java.util.function.Consumer;

public final /* synthetic */ class o000O000 implements Consumer {
    public final /* synthetic */ Exception iiI1L1iI;

    public /* synthetic */ o000O000(Exception exc) {
        this.iiI1L1iI = exc;
    }

    public final void accept(Object obj) {
        this.iiI1L1iI.addSuppressed((IOException) obj);
    }
}
