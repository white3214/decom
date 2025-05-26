package top.tntok.autobot;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.o0O0OoOo  reason: case insensitive filesystem */
public class C0303o0O0OoOo extends FilterOutputStream {
    public C0303o0O0OoOo(OutputStream outputStream) {
        super(outputStream);
    }

    public void close() throws IOException {
        C0130o00O0o00.iilLiIIIi11i(this.out, new C0301o0O0OoO(this));
    }

    public void flush() throws IOException {
        try {
            this.out.flush();
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(int i) throws IOException {
        try {
            i1LIL11l(1);
            this.out.write(i);
            iiI1L1iI(1);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(byte[] bArr) throws IOException {
        try {
            int i1LiiIlIL1I = C0130o00O0o00.i1LiiIlIL1I(bArr);
            i1LIL11l(i1LiiIlIL1I);
            this.out.write(bArr);
            iiI1L1iI(i1LiiIlIL1I);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            this.out.write(bArr, i, i2);
            iiI1L1iI(i2);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void i1LIL11l(int i) throws IOException {
    }

    public void iiI1L1iI(int i) throws IOException {
    }

    public void il1LilLllii(IOException iOException) throws IOException {
        throw iOException;
    }
}
