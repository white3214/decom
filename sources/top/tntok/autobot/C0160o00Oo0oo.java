package top.tntok.autobot;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: top.tntok.autobot.o00Oo0oo  reason: case insensitive filesystem */
public class C0160o00Oo0oo implements Iterator<String>, Closeable {
    public final BufferedReader i1LIL11l;
    public boolean il1LilLllii = false;
    public String illlI1lLIL;

    public C0160o00Oo0oo(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        } else if (reader instanceof BufferedReader) {
            this.i1LIL11l = (BufferedReader) reader;
        } else {
            this.i1LIL11l = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void i1LIL11l(C0160o00Oo0oo o00oo0oo) {
        C0130o00O0o00.I1iIiIi(o00oo0oo);
    }

    public String I1LiILiLLIl1l() {
        if (hasNext()) {
            String str = this.illlI1lLIL;
            this.illlI1lLIL = null;
            return str;
        }
        throw new NoSuchElementException("No more lines");
    }

    /* renamed from: IiIl11II */
    public String next() {
        return I1LiILiLLIl1l();
    }

    public void close() throws IOException {
        this.il1LilLllii = true;
        this.illlI1lLIL = null;
        C0130o00O0o00.IiIIlIL(this.i1LIL11l);
    }

    public boolean hasNext() {
        String readLine;
        if (this.illlI1lLIL != null) {
            return true;
        }
        if (this.il1LilLllii) {
            return false;
        }
        do {
            try {
                readLine = this.i1LIL11l.readLine();
                if (readLine == null) {
                    this.il1LilLllii = true;
                    return false;
                }
            } catch (IOException e) {
                C0130o00O0o00.i1L1lLllLLlIi(this, new C0159o00Oo0oO(e));
                throw new IllegalStateException(e);
            }
        } while (!il1LilLllii(readLine));
        this.illlI1lLIL = readLine;
        return true;
    }

    public boolean il1LilLllii(String str) {
        return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }
}
