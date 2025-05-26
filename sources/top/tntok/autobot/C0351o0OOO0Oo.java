package top.tntok.autobot;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0OOO0Oo  reason: case insensitive filesystem */
public class C0351o0OOO0Oo extends Reader {
    public Reader i1LIL11l;
    public Iterator<? extends Reader> illlI1lLIL;

    public C0351o0OOO0Oo(Iterable<? extends Reader> iterable) {
        Objects.requireNonNull(iterable, "readers");
        this.illlI1lLIL = iterable.iterator();
        this.i1LIL11l = iiI1L1iI();
    }

    public void close() throws IOException {
        this.illlI1lLIL = null;
        this.i1LIL11l = null;
    }

    public final Reader iiI1L1iI() {
        if (this.illlI1lLIL.hasNext()) {
            return (Reader) this.illlI1lLIL.next();
        }
        return null;
    }

    public int read() throws IOException {
        int i = -1;
        while (true) {
            Reader reader = this.i1LIL11l;
            if (reader == null || (i = reader.read()) != -1) {
                return i;
            }
            this.i1LIL11l = iiI1L1iI();
        }
        return i;
    }

    public C0351o0OOO0Oo(Reader... readerArr) {
        this((Iterable<? extends Reader>) Arrays.asList(readerArr));
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        Objects.requireNonNull(cArr, "cbuf");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        while (true) {
            Reader reader = this.i1LIL11l;
            if (reader == null) {
                break;
            }
            int read = reader.read(cArr, i, i2);
            if (read == -1) {
                this.i1LIL11l = iiI1L1iI();
            } else {
                i3 += read;
                i += read;
                i2 -= read;
                if (i2 <= 0) {
                    break;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
