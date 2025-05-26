package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0OOo0o0  reason: case insensitive filesystem */
public final class C0380o0OOo0o0 extends IOException {
    public final C0039OoooOO0 errorCode;

    public C0380o0OOo0o0(C0039OoooOO0 ooooOO0) {
        super("stream was reset: " + ooooOO0);
        this.errorCode = ooooOO0;
    }
}
