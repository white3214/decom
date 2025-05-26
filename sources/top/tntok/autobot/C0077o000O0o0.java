package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o000O0o0  reason: case insensitive filesystem */
public abstract class C0077o000O0o0 implements C0361o0OOOo0 {
    public final C0361o0OOOo0 i1LIL11l;

    public C0077o000O0o0(C0361o0OOOo0 o0oooo0) {
        if (o0oooo0 != null) {
            this.i1LIL11l = o0oooo0;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        this.i1LIL11l.I1iIiIi(iiILIlLLiIL, j);
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public void flush() throws IOException {
        this.i1LIL11l.flush();
    }

    public final C0361o0OOOo0 iiI1L1iI() {
        return this.i1LIL11l;
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.i1LIL11l.toString() + ")";
    }
}
