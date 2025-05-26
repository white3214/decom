package top.tntok.autobot;

import java.io.IOException;
import java.io.Writer;

public class i11ii1IIIii extends Writer {
    public static final i11ii1IIIii i1LIL11l = new i11ii1IIIii();

    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        throw new IOException("write(" + new String(cArr) + ", " + i + ", " + i2 + ") failed: stream is closed");
    }

    public void close() throws IOException {
    }
}
