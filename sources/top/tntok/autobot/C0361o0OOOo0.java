package top.tntok.autobot;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: top.tntok.autobot.o0OOOo0  reason: case insensitive filesystem */
public interface C0361o0OOOo0 extends Closeable, Flushable {
    void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;

    C0446o0OoOOOo timeout();
}
