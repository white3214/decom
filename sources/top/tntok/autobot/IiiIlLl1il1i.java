package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

public class IiiIlLl1il1i<T extends Appendable> extends OutputStream {
    public final T i1LIL11l;

    public IiiIlLl1il1i(T t) {
        this.i1LIL11l = t;
    }

    public T iiI1L1iI() {
        return this.i1LIL11l;
    }

    public void write(int i) throws IOException {
        this.i1LIL11l.append((char) i);
    }
}
