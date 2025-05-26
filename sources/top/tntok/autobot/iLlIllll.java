package top.tntok.autobot;

import java.io.IOException;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;

public class iLlIllll<T extends Appendable> extends Writer {
    public final T i1LIL11l;

    public iLlIllll(T t) {
        this.i1LIL11l = t;
    }

    public T iiI1L1iI() {
        return this.i1LIL11l;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        Objects.requireNonNull(cArr, "Character array is missing");
        if (i2 < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.i1LIL11l.append(cArr[i + i3]);
        }
    }

    public Writer append(char c) throws IOException {
        this.i1LIL11l.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) throws IOException {
        this.i1LIL11l.append(charSequence);
        return this;
    }

    public void write(int i) throws IOException {
        this.i1LIL11l.append((char) i);
    }

    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.i1LIL11l.append(charSequence, i, i2);
        return this;
    }

    public void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str, "String is missing");
        this.i1LIL11l.append(str, i, i2 + i);
    }

    public void close() throws IOException {
    }

    public void flush() throws IOException {
    }
}
