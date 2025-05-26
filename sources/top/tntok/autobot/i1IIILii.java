package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

public class i1IIILii extends InputStream {
    public static final int I11lLL1 = 2048;
    public static final int iLLLILIiLi1Ii = -1;
    public final CharsetEncoder i1LIL11l;
    public int iiIliillii;
    public int iilLil1i11I1;
    public final ByteBuffer il1LilLllii;
    public final CharBuffer illlI1lLIL;

    public i1IIILii(CharSequence charSequence, Charset charset, int i) {
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.i1LIL11l = onUnmappableCharacter;
        float maxBytesPerChar = onUnmappableCharacter.maxBytesPerChar();
        if (((float) i) >= maxBytesPerChar) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            this.il1LilLllii = allocate;
            allocate.flip();
            this.illlI1lLIL = CharBuffer.wrap(charSequence);
            this.iiIliillii = -1;
            this.iilLil1i11I1 = -1;
            return;
        }
        throw new IllegalArgumentException("Buffer size " + i + " is less than maxBytesPerChar " + maxBytesPerChar);
    }

    public int available() throws IOException {
        return this.il1LilLllii.remaining() + this.illlI1lLIL.remaining();
    }

    public final void iiI1L1iI() throws CharacterCodingException {
        this.il1LilLllii.compact();
        CoderResult encode = this.i1LIL11l.encode(this.illlI1lLIL, this.il1LilLllii, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.il1LilLllii.flip();
    }

    public synchronized void mark(int i) {
        this.iiIliillii = this.illlI1lLIL.position();
        this.iilLil1i11I1 = this.il1LilLllii.position();
        this.illlI1lLIL.mark();
        this.il1LilLllii.mark();
    }

    public boolean markSupported() {
        return true;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (!this.il1LilLllii.hasRemaining() && !this.illlI1lLIL.hasRemaining()) {
            return -1;
        }
        while (i2 > 0) {
            if (!this.il1LilLllii.hasRemaining()) {
                iiI1L1iI();
                if (!this.il1LilLllii.hasRemaining() && !this.illlI1lLIL.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.il1LilLllii.remaining(), i2);
                this.il1LilLllii.get(bArr, i, min);
                i += min;
                i2 -= min;
                i3 += min;
            }
        }
        if (i3 != 0 || this.illlI1lLIL.hasRemaining()) {
            return i3;
        }
        return -1;
    }

    public synchronized void reset() throws IOException {
        try {
            if (this.iiIliillii != -1) {
                if (this.illlI1lLIL.position() != 0) {
                    this.i1LIL11l.reset();
                    this.illlI1lLIL.rewind();
                    this.il1LilLllii.rewind();
                    this.il1LilLllii.limit(0);
                    while (this.illlI1lLIL.position() < this.iiIliillii) {
                        this.il1LilLllii.rewind();
                        this.il1LilLllii.limit(0);
                        iiI1L1iI();
                    }
                }
                if (this.illlI1lLIL.position() == this.iiIliillii) {
                    this.il1LilLllii.position(this.iilLil1i11I1);
                    this.iiIliillii = -1;
                    this.iilLil1i11I1 = -1;
                } else {
                    throw new IllegalStateException("Unexpected CharBuffer position: actual=" + this.illlI1lLIL.position() + " expected=" + this.iiIliillii);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j > 0 && available() > 0) {
            read();
            j--;
            j2++;
        }
        return j2;
    }

    public int read() throws IOException {
        while (!this.il1LilLllii.hasRemaining()) {
            iiI1L1iI();
            if (!this.il1LilLllii.hasRemaining() && !this.illlI1lLIL.hasRemaining()) {
                return -1;
            }
        }
        return this.il1LilLllii.get() & i1IL1lILl1L1I.iiI1L1iI;
    }

    public i1IIILii(CharSequence charSequence, String str, int i) {
        this(charSequence, Charset.forName(str), i);
    }

    public i1IIILii(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public i1IIILii(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public void close() throws IOException {
    }
}
