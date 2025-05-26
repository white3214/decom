package top.tntok.autobot;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class oo0OOoo extends FilterInputStream {
    public oo0OOoo(InputStream inputStream) {
        super(inputStream);
    }

    public int available() throws IOException {
        try {
            return super.available();
        } catch (IOException e) {
            il1LilLllii(e);
            return 0;
        }
    }

    public void close() throws IOException {
        C0130o00O0o00.iilLiIIIi11i(this.in, new C0302o0O0OoO0(this));
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() throws IOException {
        int i = 1;
        try {
            i1LIL11l(1);
            int read = this.in.read();
            if (read == -1) {
                i = -1;
            }
            iiI1L1iI(i);
            return read;
        } catch (IOException e) {
            il1LilLllii(e);
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        try {
            this.in.reset();
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public long skip(long j) throws IOException {
        try {
            return this.in.skip(j);
        } catch (IOException e) {
            il1LilLllii(e);
            return 0;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            i1LIL11l(C0130o00O0o00.i1LiiIlIL1I(bArr));
            int read = this.in.read(bArr);
            iiI1L1iI(read);
            return read;
        } catch (IOException e) {
            il1LilLllii(e);
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            int read = this.in.read(bArr, i, i2);
            iiI1L1iI(read);
            return read;
        } catch (IOException e) {
            il1LilLllii(e);
            return -1;
        }
    }

    public void i1LIL11l(int i) throws IOException {
    }

    public void iiI1L1iI(int i) throws IOException {
    }

    public void il1LilLllii(IOException iOException) throws IOException {
        throw iOException;
    }
}
