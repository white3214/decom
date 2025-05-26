package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0o00O0O  reason: case insensitive filesystem */
public class C0501o0o00O0O extends IOException {
    private static final long serialVersionUID = 1;
    private final I1lILLiiI1iI code;
    private final String reason;

    public C0501o0o00O0O(I1lILLiiI1iI i1lILLiiI1iI, String str) {
        this(i1lILLiiI1iI, str, (Exception) null);
    }

    public String i1LIL11l() {
        return this.reason;
    }

    public I1lILLiiI1iI iiI1L1iI() {
        return this.code;
    }

    public C0501o0o00O0O(I1lILLiiI1iI i1lILLiiI1iI, String str, Exception exc) {
        super(i1lILLiiI1iI + ": " + str, exc);
        this.code = i1lILLiiI1iI;
        this.reason = str;
    }

    public C0501o0o00O0O(Exception exc) {
        this(I1lILLiiI1iI.InternalServerError, exc.toString(), exc);
    }
}
