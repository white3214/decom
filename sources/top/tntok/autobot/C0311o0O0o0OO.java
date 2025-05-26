package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0O0o0OO  reason: case insensitive filesystem */
public class C0311o0O0o0OO extends InputStream {
    public final boolean i1LIL11l;
    public final RandomAccessFile illlI1lLIL;

    public C0311o0O0o0OO(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }

    public int available() throws IOException {
        long iiI1L1iI = iiI1L1iI();
        if (iiI1L1iI > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) iiI1L1iI;
    }

    public void close() throws IOException {
        super.close();
        if (this.i1LIL11l) {
            this.illlI1lLIL.close();
        }
    }

    public final void i111iLiiIIill(long j) throws IOException {
        this.illlI1lLIL.seek(j);
    }

    public RandomAccessFile i1LIL11l() {
        return this.illlI1lLIL;
    }

    public long iiI1L1iI() throws IOException {
        return this.illlI1lLIL.length() - this.illlI1lLIL.getFilePointer();
    }

    public boolean il1LilLllii() {
        return this.i1LIL11l;
    }

    public int read() throws IOException {
        return this.illlI1lLIL.read();
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        long filePointer = this.illlI1lLIL.getFilePointer();
        long length = this.illlI1lLIL.length();
        if (filePointer >= length) {
            return 0;
        }
        long j2 = j + filePointer;
        if (j2 > length) {
            j2 = length - 1;
        }
        if (j2 > 0) {
            i111iLiiIIill(j2);
        }
        return this.illlI1lLIL.getFilePointer() - filePointer;
    }

    public C0311o0O0o0OO(RandomAccessFile randomAccessFile, boolean z) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.illlI1lLIL = randomAccessFile;
        this.i1LIL11l = z;
    }

    public int read(byte[] bArr) throws IOException {
        return this.illlI1lLIL.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.illlI1lLIL.read(bArr, i, i2);
    }
}
