package top.tntok.autobot;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* renamed from: top.tntok.autobot.o0Oo0OO0  reason: case insensitive filesystem */
public class C0414o0Oo0OO0 extends C0305o0O0Ooo0 {
    public final Writer i1LIL11l;
    public final boolean illlI1lLIL;

    public C0414o0Oo0OO0(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.illlI1lLIL) {
                this.i1LIL11l.close();
            }
        }
    }

    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.i1LIL11l.write(read);
        }
        return read;
    }

    public C0414o0Oo0OO0(Reader reader, Writer writer, boolean z) {
        super(reader);
        this.i1LIL11l = writer;
        this.illlI1lLIL = z;
    }

    public int read(char[] cArr) throws IOException {
        int read = super.read(cArr);
        if (read != -1) {
            this.i1LIL11l.write(cArr, 0, read);
        }
        return read;
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read != -1) {
            this.i1LIL11l.write(cArr, i, read);
        }
        return read;
    }

    /* JADX INFO: finally extract failed */
    public int read(CharBuffer charBuffer) throws IOException {
        int position = charBuffer.position();
        int read = super.read(charBuffer);
        if (read != -1) {
            int position2 = charBuffer.position();
            int limit = charBuffer.limit();
            try {
                charBuffer.position(position).limit(position2);
                this.i1LIL11l.append(charBuffer);
                charBuffer.position(position2).limit(limit);
            } catch (Throwable th) {
                charBuffer.position(position2).limit(limit);
                throw th;
            }
        }
        return read;
    }
}
