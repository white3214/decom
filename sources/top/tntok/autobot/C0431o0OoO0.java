package top.tntok.autobot;

import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o0OoO0  reason: case insensitive filesystem */
public class C0431o0OoO0 extends Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final TimeUnit timeUnit;
    private final long timeout;

    public C0431o0OoO0(long j, TimeUnit timeUnit2) {
        super(String.format("test timed out after %d %s", new Object[]{Long.valueOf(j), timeUnit2.name().toLowerCase()}));
        this.timeUnit = timeUnit2;
        this.timeout = j;
    }

    public long i1LIL11l() {
        return this.timeout;
    }

    public TimeUnit iiI1L1iI() {
        return this.timeUnit;
    }
}
