package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class iLLlLL1i1ILl1 extends InputStream {
    public final InputStream i1LIL11l;
    public boolean iiIliillii;
    public final int il1LilLllii;
    public final II1ILL1iiL illlI1lLIL;

    public iLLlLL1i1ILl1(InputStream inputStream, int i) {
        if (i > 0) {
            Objects.requireNonNull(inputStream, "inputStream");
            this.i1LIL11l = inputStream;
            this.illlI1lLIL = new II1ILL1iiL(i);
            this.il1LilLllii = i;
            this.iiIliillii = false;
            return;
        }
        throw new IllegalArgumentException("Invalid bufferSize: " + i);
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
        this.iiIliillii = true;
        this.illlI1lLIL.illlI1lLIL();
    }

    public boolean i1LIL11l(int i) throws IOException {
        if (this.illlI1lLIL.il1LilLllii() < i) {
            iiI1L1iI();
        }
        return this.illlI1lLIL.iilLil1i11I1();
    }

    public void iiI1L1iI() throws IOException {
        if (!this.iiIliillii) {
            int iiIliillii2 = this.illlI1lLIL.iiIliillii();
            byte[] bArr = new byte[iiIliillii2];
            while (iiIliillii2 > 0) {
                int read = this.i1LIL11l.read(bArr, 0, iiIliillii2);
                if (read == -1) {
                    this.iiIliillii = true;
                    return;
                } else if (read > 0) {
                    this.illlI1lLIL.i1LIL11l(bArr, 0, read);
                    iiIliillii2 -= read;
                }
            }
        }
    }

    public int read() throws IOException {
        if (!i1LIL11l(1)) {
            return -1;
        }
        return this.illlI1lLIL.iilLiIIIi11i() & i1IL1lILl1L1I.iiI1L1iI;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "Buffer");
        if (i < 0) {
            throw new IllegalArgumentException("Offset must not be negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Length must not be negative");
        } else if (!i1LIL11l(i2)) {
            return -1;
        } else {
            int min = Math.min(i2, this.illlI1lLIL.il1LilLllii());
            for (int i3 = 0; i3 < min; i3++) {
                bArr[i + i3] = this.illlI1lLIL.iilLiIIIi11i();
            }
            return min;
        }
    }

    public iLLlLL1i1ILl1(InputStream inputStream) {
        this(inputStream, 8192);
    }
}
