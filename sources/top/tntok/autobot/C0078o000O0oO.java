package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o000O0oO  reason: case insensitive filesystem */
public abstract class C0078o000O0oO implements C0370o0OOOooO {
    public final C0370o0OOOooO i1LIL11l;

    public C0078o000O0oO(C0370o0OOOooO o0oooooo) {
        if (o0oooooo != null) {
            this.i1LIL11l = o0oooooo;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        return this.i1LIL11l.IIlllIIi1ii(iiILIlLLiIL, j);
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public final C0370o0OOOooO iiI1L1iI() {
        return this.i1LIL11l;
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.i1LIL11l.toString() + ")";
    }
}
