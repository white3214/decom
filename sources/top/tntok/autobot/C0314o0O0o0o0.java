package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: top.tntok.autobot.o0O0o0o0  reason: case insensitive filesystem */
public final class C0314o0O0o0o0 implements Iiii1LiI11i {
    public final IiILIlLLiIL i1LIL11l = new IiILIlLLiIL();
    public boolean il1LilLllii;
    public final C0361o0OOOo0 illlI1lLIL;

    public C0314o0O0o0o0(C0361o0OOOo0 o0oooo0) {
        if (o0oooo0 != null) {
            this.illlI1lLIL = o0oooo0;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public Iiii1LiI11i I1LiliILi1lI1() throws IOException {
        if (!this.il1LilLllii) {
            long iLLi1LIi = this.i1LIL11l.iLLi1LIi();
            if (iLLi1LIi > 0) {
                this.illlI1lLIL.I1iIiIi(this.i1LIL11l, iLLi1LIi);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.I1iIiIi(iiILIlLLiIL, j);
            IIlL1llI1();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i IILiIL1i11Li(C0370o0OOOooO o0oooooo, long j) throws IOException {
        while (j > 0) {
            long IIlllIIi1ii = o0oooooo.IIlllIIi1ii(this.i1LIL11l, j);
            if (IIlllIIi1ii != -1) {
                j -= IIlllIIi1ii;
                IIlL1llI1();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public Iiii1LiI11i IIlL1llI1() throws IOException {
        if (!this.il1LilLllii) {
            long I1lLLLlliILlI = this.i1LIL11l.I1lLLLlliILlI();
            if (I1lLLLlliILlI > 0) {
                this.illlI1lLIL.I1iIiIi(this.i1LIL11l, I1lLLLlliILlI);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i IIlLill(String str, Charset charset) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IIlLill(str, charset);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i IIllllLiIlIl(long j) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IIllllLiIlIl(j);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i IL111l1(long j) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IL111l1(j);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i ILiLII1ILi(ili11iILI1l ili11iili1l) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.ILiLII1ILi(ili11iili1l);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i ILl1iII11Ll1(String str, int i, int i2) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.ILl1iII11Ll1(str, i, i2);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public long Ii1liIIIiLi(C0370o0OOOooO o0oooooo) throws IOException {
        if (o0oooooo != null) {
            long j = 0;
            while (true) {
                long IIlllIIi1ii = o0oooooo.IIlllIIi1ii(this.i1LIL11l, 8192);
                if (IIlllIIi1ii == -1) {
                    return j;
                }
                j += IIlllIIi1ii;
                IIlL1llI1();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public Iiii1LiI11i IiiIIil1l(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IiiIIil1l(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public OutputStream Iiiiii1l1I1L1() {
        return new iiI1L1iI();
    }

    public Iiii1LiI11i IillLillLLIii(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IillLillLLIii(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i IilliIIIlI1ll(long j) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.IilliIIIlI1ll(j);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        if (!this.il1LilLllii) {
            try {
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                long j = iiILIlLLiIL.illlI1lLIL;
                if (j > 0) {
                    this.illlI1lLIL.I1iIiIi(iiILIlLLiIL, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.illlI1lLIL.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.il1LilLllii = true;
            if (th != null) {
                C0485o0Ooooo.iilLil1i11I1(th);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.il1LilLllii) {
            IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
            long j = iiILIlLLiIL.illlI1lLIL;
            if (j > 0) {
                this.illlI1lLIL.I1iIiIi(iiILIlLLiIL, j);
            }
            this.illlI1lLIL.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i i11liIIl11Ii1(String str, int i, int i2, Charset charset) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.i11liIIl11Ii1(str, i, i2, charset);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i i1L1lLllLLlIi(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.i1L1lLllLLlIi(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i i1LiiIlIL1I(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.i1LiiIlIL1I(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i iILiI1lll(long j) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.iILiI1lll(j);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i iLLLILIiLi1Ii(byte[] bArr, int i, int i2) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.iLLLILIiLi1Ii(bArr, i, i2);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i iLiI1Llil(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.iLiI1Llil(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i iiIliillii(byte[] bArr) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.iiIliillii(bArr);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i iilLil1i11I1(int i) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.iilLil1i11I1(i);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public Iiii1LiI11i illiiliIILI(String str) throws IOException {
        if (!this.il1LilLllii) {
            this.i1LIL11l.illiiliIILI(str);
            return IIlL1llI1();
        }
        throw new IllegalStateException("closed");
    }

    public IiILIlLLiIL illlI1lLIL() {
        return this.i1LIL11l;
    }

    public boolean isOpen() {
        return !this.il1LilLllii;
    }

    public C0446o0OoOOOo timeout() {
        return this.illlI1lLIL.timeout();
    }

    public String toString() {
        return "buffer(" + this.illlI1lLIL + ")";
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.il1LilLllii) {
            int write = this.i1LIL11l.write(byteBuffer);
            IIlL1llI1();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: top.tntok.autobot.o0O0o0o0$iiI1L1iI */
    public class iiI1L1iI extends OutputStream {
        public iiI1L1iI() {
        }

        public void close() throws IOException {
            C0314o0O0o0o0.this.close();
        }

        public void flush() throws IOException {
            C0314o0O0o0o0 o0o0o0o0 = C0314o0O0o0o0.this;
            if (!o0o0o0o0.il1LilLllii) {
                o0o0o0o0.flush();
            }
        }

        public String toString() {
            return C0314o0O0o0o0.this + ".outputStream()";
        }

        public void write(int i) throws IOException {
            C0314o0O0o0o0 o0o0o0o0 = C0314o0O0o0o0.this;
            if (!o0o0o0o0.il1LilLllii) {
                o0o0o0o0.i1LIL11l.IillLillLLIii((byte) i);
                C0314o0O0o0o0.this.IIlL1llI1();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            C0314o0O0o0o0 o0o0o0o0 = C0314o0O0o0o0.this;
            if (!o0o0o0o0.il1LilLllii) {
                o0o0o0o0.i1LIL11l.iLLLILIiLi1Ii(bArr, i, i2);
                C0314o0O0o0o0.this.IIlL1llI1();
                return;
            }
            throw new IOException("closed");
        }
    }
}
