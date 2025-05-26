package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.o0Oo0O0O  reason: case insensitive filesystem */
public class C0412o0Oo0O0O extends oo0OOoo {
    public final OutputStream i1LIL11l;
    public final boolean illlI1lLIL;

    public C0412o0Oo0O0O(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.illlI1lLIL) {
                this.i1LIL11l.close();
            }
        }
    }

    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.i1LIL11l.write(read);
        }
        return read;
    }

    public C0412o0Oo0O0O(InputStream inputStream, OutputStream outputStream, boolean z) {
        super(inputStream);
        this.i1LIL11l = outputStream;
        this.illlI1lLIL = z;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.i1LIL11l.write(bArr, i, read);
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        int read = super.read(bArr);
        if (read != -1) {
            this.i1LIL11l.write(bArr, 0, read);
        }
        return read;
    }
}
