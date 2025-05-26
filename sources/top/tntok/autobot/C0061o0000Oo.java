package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0000Oo  reason: case insensitive filesystem */
public class C0061o0000Oo extends IOException {
    private static final long serialVersionUID = -7047616958165584154L;
    private final C0062o0000Oo0 cause;

    public C0061o0000Oo(C0062o0000Oo0 o0000oo0) {
        this.cause = o0000oo0;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
