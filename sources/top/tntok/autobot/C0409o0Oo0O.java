package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.o0Oo0O  reason: case insensitive filesystem */
public class C0409o0Oo0O extends C0303o0O0OoOo {
    public OutputStream i1LIL11l;

    public C0409o0Oo0O(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.i1LIL11l = outputStream2;
    }

    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.i1LIL11l.close();
        }
    }

    public void flush() throws IOException {
        super.flush();
        this.i1LIL11l.flush();
    }

    public synchronized void write(byte[] bArr) throws IOException {
        super.write(bArr);
        this.i1LIL11l.write(bArr);
    }

    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        this.i1LIL11l.write(bArr, i, i2);
    }

    public synchronized void write(int i) throws IOException {
        super.write(i);
        this.i1LIL11l.write(i);
    }
}
