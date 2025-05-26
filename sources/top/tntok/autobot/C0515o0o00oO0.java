package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* renamed from: top.tntok.autobot.o0o00oO0  reason: case insensitive filesystem */
public class C0515o0o00oO0 extends OutputStream {
    public static final int I11lLL1 = 1024;
    public final Writer i1LIL11l;
    public final ByteBuffer iiIliillii;
    public final CharBuffer iilLil1i11I1;
    public final boolean il1LilLllii;
    public final CharsetDecoder illlI1lLIL;

    public C0515o0o00oO0(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    public static void iiI1L1iI(Charset charset) {
        boolean z;
        if (C0514o0o00oO.iILiI1lll.equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            CharBuffer allocate2 = CharBuffer.allocate(3);
            int length = bytes.length;
            int i = 0;
            while (i < length) {
                allocate.put(bytes[i]);
                allocate.flip();
                if (i == length - 1) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    newDecoder.decode(allocate, allocate2, z);
                    allocate.compact();
                    i++;
                } catch (IllegalArgumentException unused) {
                    throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                }
            }
            allocate2.rewind();
            if (!"vés".equals(allocate2.toString())) {
                throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
        }
    }

    public void close() throws IOException {
        il1LilLllii(true);
        i1LIL11l();
        this.i1LIL11l.close();
    }

    public void flush() throws IOException {
        i1LIL11l();
        this.i1LIL11l.flush();
    }

    public final void i1LIL11l() throws IOException {
        if (this.iilLil1i11I1.position() > 0) {
            this.i1LIL11l.write(this.iilLil1i11I1.array(), 0, this.iilLil1i11I1.position());
            this.iilLil1i11I1.rewind();
        }
    }

    public final void il1LilLllii(boolean z) throws IOException {
        CoderResult decode;
        this.iiIliillii.flip();
        while (true) {
            decode = this.illlI1lLIL.decode(this.iiIliillii, this.iilLil1i11I1, z);
            if (!decode.isOverflow()) {
                break;
            }
            i1LIL11l();
        }
        if (decode.isUnderflow()) {
            this.iiIliillii.compact();
            return;
        }
        throw new IOException("Unexpected coder result");
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.iiIliillii.remaining());
            this.iiIliillii.put(bArr, i, min);
            il1LilLllii(false);
            i2 -= min;
            i += min;
        }
        if (this.il1LilLllii) {
            i1LIL11l();
        }
    }

    public C0515o0o00oO0(Writer writer, CharsetDecoder charsetDecoder, int i, boolean z) {
        this.iiIliillii = ByteBuffer.allocate(128);
        iiI1L1iI(charsetDecoder.charset());
        this.i1LIL11l = writer;
        this.illlI1lLIL = charsetDecoder;
        this.il1LilLllii = z;
        this.iilLil1i11I1 = CharBuffer.allocate(i);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0515o0o00oO0(java.io.Writer r2, java.nio.charset.Charset r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r3 = r3.onUnmappableCharacter(r0)
            java.lang.String r0 = "?"
            java.nio.charset.CharsetDecoder r3 = r3.replaceWith(r0)
            r1.<init>((java.io.Writer) r2, (java.nio.charset.CharsetDecoder) r3, (int) r4, (boolean) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0515o0o00oO0.<init>(java.io.Writer, java.nio.charset.Charset, int, boolean):void");
    }

    public C0515o0o00oO0(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public C0515o0o00oO0(Writer writer, String str, int i, boolean z) {
        this(writer, Charset.forName(str), i, z);
    }

    public C0515o0o00oO0(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    @Deprecated
    public C0515o0o00oO0(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
