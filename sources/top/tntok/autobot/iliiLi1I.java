package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

public class iliiLi1I extends OutputStream {
    public final IOException i1LIL11l;

    public iliiLi1I(IOException iOException) {
        this.i1LIL11l = iOException;
    }

    public void close() throws IOException {
        throw this.i1LIL11l;
    }

    public void flush() throws IOException {
        throw this.i1LIL11l;
    }

    public void write(int i) throws IOException {
        throw this.i1LIL11l;
    }

    public iliiLi1I() {
        this(new IOException("Broken output stream"));
    }
}
