package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

public class i1iiii1i11ll extends OutputStream {
    public static final i1iiii1i11ll i1LIL11l = new i1iiii1i11ll();

    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    public void write(int i) throws IOException {
        throw new IOException("write(" + i + ") failed: stream is closed");
    }
}
