package top.tntok.autobot;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class iILIIiil extends FilterWriter {
    public static final int illlI1lLIL = 4096;
    public final int i1LIL11l;

    public iILIIiil(Writer writer, int i) {
        super(writer);
        if (i > 0) {
            this.i1LIL11l = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.i1LIL11l);
            this.out.write(cArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public iILIIiil(Writer writer) {
        this(writer, 4096);
    }
}
