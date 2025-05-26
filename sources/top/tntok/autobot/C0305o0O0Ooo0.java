package top.tntok.autobot;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: top.tntok.autobot.o0O0Ooo0  reason: case insensitive filesystem */
public abstract class C0305o0O0Ooo0 extends FilterReader {
    public C0305o0O0Ooo0(Reader reader) {
        super(reader);
    }

    public void close() throws IOException {
        try {
            this.in.close();
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public synchronized void mark(int i) throws IOException {
        try {
            this.in.mark(i);
        } catch (IOException e) {
            il1LilLllii(e);
        }
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

    public boolean ready() throws IOException {
        try {
            return this.in.ready();
        } catch (IOException e) {
            il1LilLllii(e);
            return false;
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

    public int read(char[] cArr) throws IOException {
        try {
            i1LIL11l(C0130o00O0o00.ILiLII1ILi(cArr));
            int read = this.in.read(cArr);
            iiI1L1iI(read);
            return read;
        } catch (IOException e) {
            il1LilLllii(e);
            return -1;
        }
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            int read = this.in.read(cArr, i, i2);
            iiI1L1iI(read);
            return read;
        } catch (IOException e) {
            il1LilLllii(e);
            return -1;
        }
    }

    public int read(CharBuffer charBuffer) throws IOException {
        try {
            i1LIL11l(C0130o00O0o00.iLlIllll(charBuffer));
            int read = this.in.read(charBuffer);
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
