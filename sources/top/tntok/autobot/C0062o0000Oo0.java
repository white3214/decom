package top.tntok.autobot;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: top.tntok.autobot.o0000Oo0  reason: case insensitive filesystem */
public class C0062o0000Oo0 extends IOException {
    private static final long serialVersionUID = 8881893724388807504L;
    private final Throwable cause;

    public C0062o0000Oo0() {
        this((String) null, (Throwable) null);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.cause != null) {
            printStream.println("Caused by:");
            this.cause.printStackTrace(printStream);
        }
    }

    public C0062o0000Oo0(String str) {
        this(str, (Throwable) null);
    }

    public C0062o0000Oo0(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.cause != null) {
            printWriter.println("Caused by:");
            this.cause.printStackTrace(printWriter);
        }
    }
}
