package top.tntok.autobot;

import java.io.IOException;
import java.io.Reader;

public class iil1ILLLi11 extends Reader {
    public static final int I11lLL1 = -1;
    public final Reader i1LIL11l;
    public int iiIliillii;
    public final int iilLil1i11I1;
    public int il1LilLllii = -1;
    public int illlI1lLIL = 0;

    public iil1ILLLi11(Reader reader, int i) throws IOException {
        this.i1LIL11l = reader;
        this.iilLil1i11I1 = i;
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public void mark(int i) throws IOException {
        int i2 = this.illlI1lLIL;
        this.iiIliillii = i - i2;
        this.il1LilLllii = i2;
        this.i1LIL11l.mark(i);
    }

    public int read() throws IOException {
        int i = this.illlI1lLIL;
        if (i >= this.iilLil1i11I1) {
            return -1;
        }
        int i2 = this.il1LilLllii;
        if (i2 >= 0 && i - i2 >= this.iiIliillii) {
            return -1;
        }
        this.illlI1lLIL = i + 1;
        return this.i1LIL11l.read();
    }

    public void reset() throws IOException {
        this.illlI1lLIL = this.il1LilLllii;
        this.i1LIL11l.reset();
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read != -1) {
                cArr[i + i3] = (char) read;
                i3++;
            } else if (i3 == 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }
}
