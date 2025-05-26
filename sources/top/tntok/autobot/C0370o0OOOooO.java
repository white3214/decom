package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: top.tntok.autobot.o0OOOooO  reason: case insensitive filesystem */
public interface C0370o0OOOooO extends Closeable {
    long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException;

    void close() throws IOException;

    C0446o0OoOOOo timeout();
}
