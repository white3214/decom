package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o00O00o  reason: case insensitive filesystem */
public class C0120o00O00o extends C0062o0000Oo0 {
    private static final long serialVersionUID = 1749796615868477269L;
    private final IOException cause;

    public C0120o00O00o(String str, IOException iOException) {
        super(str);
        this.cause = iOException;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
