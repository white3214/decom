package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o00OoOoo  reason: case insensitive filesystem */
public class C0172o00OoOoo extends oo0OOoo {
    public C0172o00OoOoo(InputStream inputStream) {
        super(inputStream);
    }

    public boolean markSupported() {
        return false;
    }

    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public void mark(int i) {
    }
}
