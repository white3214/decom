package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0O0o0Oo  reason: case insensitive filesystem */
public class C0312o0O0o0Oo extends InputStream {
    public static final int iLLLILIiLi1Ii = 1024;
    public boolean I11lLL1;
    public final Reader i1LIL11l;
    public final ByteBuffer iiIliillii;
    public CoderResult iilLil1i11I1;
    public final CharBuffer il1LilLllii;
    public final CharsetEncoder illlI1lLIL;

    public C0312o0O0o0Oo(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public final void iiI1L1iI() throws IOException {
        CoderResult coderResult;
        if (!this.I11lLL1 && ((coderResult = this.iilLil1i11I1) == null || coderResult.isUnderflow())) {
            this.il1LilLllii.compact();
            int position = this.il1LilLllii.position();
            int read = this.i1LIL11l.read(this.il1LilLllii.array(), position, this.il1LilLllii.remaining());
            if (read == -1) {
                this.I11lLL1 = true;
            } else {
                this.il1LilLllii.position(position + read);
            }
            this.il1LilLllii.flip();
        }
        this.iiIliillii.compact();
        this.iilLil1i11I1 = this.illlI1lLIL.encode(this.il1LilLllii, this.iiIliillii, this.I11lLL1);
        this.iiIliillii.flip();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i2 > 0) {
            if (!this.iiIliillii.hasRemaining()) {
                iiI1L1iI();
                if (this.I11lLL1 && !this.iiIliillii.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.iiIliillii.remaining(), i2);
                this.iiIliillii.get(bArr, i, min);
                i += min;
                i2 -= min;
                i3 += min;
            }
        }
        if (i3 != 0 || !this.I11lLL1) {
            return i3;
        }
        return -1;
    }

    public C0312o0O0o0Oo(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.i1LIL11l = reader;
        this.illlI1lLIL = charsetEncoder;
        CharBuffer allocate = CharBuffer.allocate(i);
        this.il1LilLllii = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.iiIliillii = allocate2;
        allocate2.flip();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0312o0O0o0Oo(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>((java.io.Reader) r2, (java.nio.charset.CharsetEncoder) r3, (int) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0312o0O0o0Oo.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read() throws IOException {
        while (!this.iiIliillii.hasRemaining()) {
            iiI1L1iI();
            if (this.I11lLL1 && !this.iiIliillii.hasRemaining()) {
                return -1;
            }
        }
        return this.iiIliillii.get() & i1IL1lILl1L1I.iiI1L1iI;
    }

    public C0312o0O0o0Oo(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    public C0312o0O0o0Oo(Reader reader, String str, int i) {
        this(reader, Charset.forName(str), i);
    }

    public C0312o0O0o0Oo(Reader reader, String str) {
        this(reader, str, 1024);
    }

    @Deprecated
    public C0312o0O0o0Oo(Reader reader) {
        this(reader, Charset.defaultCharset());
    }
}
