package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

public class OooO0OO extends OutputStream {
    public final InheritableThreadLocal<OutputStream> i1LIL11l = new InheritableThreadLocal<>();

    public void close() throws IOException {
        C0130o00O0o00.IiIIlIL(this.i1LIL11l.get());
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.i1LIL11l.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public OutputStream iiI1L1iI(OutputStream outputStream) {
        OutputStream outputStream2 = this.i1LIL11l.get();
        this.i1LIL11l.set(outputStream);
        return outputStream2;
    }

    public void write(int i) throws IOException {
        OutputStream outputStream = this.i1LIL11l.get();
        if (outputStream != null) {
            outputStream.write(i);
        }
    }
}
