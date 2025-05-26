package top.tntok.autobot;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class iiiILIiIi extends FilterOutputStream {
    public static final int illlI1lLIL = 4096;
    public final int i1LIL11l;

    public iiiILIiIi(OutputStream outputStream, int i) {
        super(outputStream);
        if (i > 0) {
            this.i1LIL11l = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.i1LIL11l);
            this.out.write(bArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public iiiILIiIi(OutputStream outputStream) {
        this(outputStream, 4096);
    }
}
