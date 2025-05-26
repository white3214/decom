package top.tntok.autobot;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

/* renamed from: top.tntok.autobot.o0O0Oooo  reason: case insensitive filesystem */
public class C0307o0O0Oooo extends o000Oo0 {
    public C0307o0O0Oooo(Collection<Writer> collection) {
        super(collection);
    }

    public void close() throws IOException {
        try {
            super.close();
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(char[] cArr) throws IOException {
        try {
            int ILiLII1ILi = C0130o00O0o00.ILiLII1ILi(cArr);
            i1LIL11l(ILiLII1ILi);
            super.write(cArr);
            iiI1L1iI(ILiLII1ILi);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public C0307o0O0Oooo(Writer... writerArr) {
        super(writerArr);
    }

    public Writer append(char c) throws IOException {
        try {
            i1LIL11l(1);
            super.append(c);
            iiI1L1iI(1);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            super.write(cArr, i, i2);
            iiI1L1iI(i2);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int iLlIllll = C0130o00O0o00.iLlIllll(charSequence);
            i1LIL11l(iLlIllll);
            super.append(charSequence);
            iiI1L1iI(iLlIllll);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(int i) throws IOException {
        try {
            i1LIL11l(1);
            super.write(i);
            iiI1L1iI(1);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        int i3 = i2 - i;
        try {
            i1LIL11l(i3);
            super.append(charSequence, i, i2);
            iiI1L1iI(i3);
        } catch (IOException e) {
            il1LilLllii(e);
        }
        return this;
    }

    public void write(String str) throws IOException {
        try {
            int iLlIllll = C0130o00O0o00.iLlIllll(str);
            i1LIL11l(iLlIllll);
            super.write(str);
            iiI1L1iI(iLlIllll);
        } catch (IOException e) {
            il1LilLllii(e);
        }
    }

    public void write(String str, int i, int i2) throws IOException {
        try {
            i1LIL11l(i2);
            super.write(str, i, i2);
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
