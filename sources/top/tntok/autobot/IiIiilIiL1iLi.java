package top.tntok.autobot;

import java.io.IOException;
import java.io.Writer;

public class IiIiilIiL1iLi extends Writer {
    public final IOException i1LIL11l;

    public IiIiilIiL1iLi(IOException iOException) {
        this.i1LIL11l = iOException;
    }

    public void close() throws IOException {
        throw this.i1LIL11l;
    }

    public void flush() throws IOException {
        throw this.i1LIL11l;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        throw this.i1LIL11l;
    }

    public IiIiilIiL1iLi() {
        this(new IOException("Broken writer"));
    }
}
