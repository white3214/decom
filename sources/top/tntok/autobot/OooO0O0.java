package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;

public class OooO0O0 extends InputStream {
    public final InheritableThreadLocal<InputStream> i1LIL11l = new InheritableThreadLocal<>();

    public void close() throws IOException {
        C0130o00O0o00.IiIIlIL(this.i1LIL11l.get());
    }

    public InputStream iiI1L1iI(InputStream inputStream) {
        InputStream inputStream2 = this.i1LIL11l.get();
        this.i1LIL11l.set(inputStream);
        return inputStream2;
    }

    public int read() throws IOException {
        InputStream inputStream = this.i1LIL11l.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
