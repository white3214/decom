package top.tntok.autobot;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: top.tntok.autobot.o0O0OooO  reason: case insensitive filesystem */
public class C0306o0O0OooO extends FilterWriter {
    public C0306o0O0OooO(Writer writer) {
        super(writer);
    }

    public void close() throws IOException {
        C0130o00O0o00.iilLiIIIi11i(this.out, new C0304o0O0Ooo(this));
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

    public Writer append(char c) throws IOException {
        try {
            i1LIL11l(1);
            this.out.append(c);
            iiI1L1iI(1);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(char[] cArr) throws IOException {
        try {
            int ILiLII1ILi = C0130o00O0o00.ILiLII1ILi(cArr);
            i1LIL11l(ILiLII1ILi);
            this.out.write(cArr);
            iiI1L1iI(ILiLII1ILi);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        int i3 = i2 - i;
        try {
            i1LIL11l(i3);
            this.out.append(charSequence, i, i2);
            iiI1L1iI(i3);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            this.out.write(cArr, i, i2);
            iiI1L1iI(i2);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int iLlIllll = C0130o00O0o00.iLlIllll(charSequence);
            i1LIL11l(iLlIllll);
            this.out.append(charSequence);
            iiI1L1iI(iLlIllll);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(String str) throws IOException {
        try {
            int iLlIllll = C0130o00O0o00.iLlIllll(str);
            i1LIL11l(iLlIllll);
            this.out.write(str);
            iiI1L1iI(iLlIllll);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(String str, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            this.out.write(str, i, i2);
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
