package top.tntok.autobot;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public abstract class iLLLILIiLi1Ii extends FilterReader {
    public iLLLILIiLi1Ii(Reader reader) {
        super(reader);
    }

    public abstract boolean iiI1L1iI(int i);

    public int read() throws IOException {
        int read;
        do {
            read = this.in.read();
        } while (iiI1L1iI(read));
        return read;
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read == -1) {
            return -1;
        }
        int i3 = i - 1;
        for (int i4 = i; i4 < i + read; i4++) {
            if (!iiI1L1iI(cArr[i4]) && (i3 = i3 + 1) < i4) {
                cArr[i3] = cArr[i4];
            }
        }
        return (i3 - i) + 1;
    }
}
