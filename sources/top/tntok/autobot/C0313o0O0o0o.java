package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o0O0o0o  reason: case insensitive filesystem */
public final class C0313o0O0o0o implements ILL1iL1LiiI {
    public final IiILIlLLiIL i1LIL11l = new IiILIlLLiIL();
    public boolean il1LilLllii;
    public final C0370o0OOOooO illlI1lLIL;

    public C0313o0O0o0o(C0370o0OOOooO o0oooooo) {
        if (o0oooooo != null) {
            this.illlI1lLIL = o0oooooo;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public long I11lLL1(ili11iILI1l ili11iili1l) throws IOException {
        return iiLIIiIli(ili11iili1l, 0);
    }

    public int I1I11Il1(C0256o00oo0oO o00oo0oo) throws IOException {
        if (!this.il1LilLllii) {
            do {
                int iiL1l1iLliL = this.i1LIL11l.iiL1l1iLliL(o00oo0oo, true);
                if (iiL1l1iLliL == -1) {
                    return -1;
                }
                if (iiL1l1iLliL != -2) {
                    this.i1LIL11l.skip((long) o00oo0oo.iiI1L1iI[iiL1l1iLliL].illiiliIILI());
                    return iiL1l1iLliL;
                }
            } while (this.illlI1lLIL.IIlllIIi1ii(this.i1LIL11l, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public byte[] I1IIIi1i1ILl() throws IOException {
        this.i1LIL11l.Ii1liIIIiLi(this.illlI1lLIL);
        return this.i1LIL11l.I1IIIi1i1ILl();
    }

    public long I1Ii1ILliII(ili11iILI1l ili11iili1l) throws IOException {
        return iiiiI1iILL11I(ili11iili1l, 0);
    }

    public long I1i1iiiI() throws IOException {
        IIIlll1lll(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!iLIIl1IliLlLI((long) i2)) {
                break;
            }
            byte ilLIlLiIILl1 = this.i1LIL11l.ilLIlLiIILl1((long) i);
            if ((ilLIlLiIILl1 >= 48 && ilLIlLiIILl1 <= 57) || ((ilLIlLiIILl1 >= 97 && ilLIlLiIILl1 <= 102) || (ilLIlLiIILl1 >= 65 && ilLIlLiIILl1 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(ilLIlLiIILl1)}));
            }
        }
        return this.i1LIL11l.I1i1iiiI();
    }

    public void I1l1iIll1lIi1(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        try {
            IIIlll1lll(j);
            this.i1LIL11l.I1l1iIll1lIi1(iiILIlLLiIL, j);
        } catch (EOFException e) {
            iiILIlLLiIL.Ii1liIIIiLi(this.i1LIL11l);
            throw e;
        }
    }

    public void IIIlll1lll(long j) throws IOException {
        if (!iLIIl1IliLlLI(j)) {
            throw new EOFException();
        }
    }

    public boolean IIi1l1i(long j, ili11iILI1l ili11iili1l) throws IOException {
        return IllLlI1IiIL(j, ili11iili1l, 0, ili11iili1l.illiiliIILI());
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        if (iiILIlLLiIL == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.il1LilLllii) {
            IiILIlLLiIL iiILIlLLiIL2 = this.i1LIL11l;
            if (iiILIlLLiIL2.illlI1lLIL == 0 && this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL2, 8192) == -1) {
                return -1;
            }
            return this.i1LIL11l.IIlllIIi1ii(iiILIlLLiIL, Math.min(j, this.i1LIL11l.illlI1lLIL));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public ili11iILI1l IL1IiilLlLI() throws IOException {
        this.i1LIL11l.Ii1liIIIiLi(this.illlI1lLIL);
        return this.i1LIL11l.IL1IiilLlLI();
    }

    public long IL1lILLLL1L(byte b, long j) throws IOException {
        return i1iiLIil1ILi(b, j, Long.MAX_VALUE);
    }

    public String ILiliIiI(Charset charset) throws IOException {
        if (charset != null) {
            this.i1LIL11l.Ii1liIIIiLi(this.illlI1lLIL);
            return this.i1LIL11l.ILiliIiI(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public int ILllI11() throws IOException {
        IIIlll1lll(4);
        return this.i1LIL11l.ILllI11();
    }

    public String IiIIlIL(long j, Charset charset) throws IOException {
        IIIlll1lll(j);
        if (charset != null) {
            return this.i1LIL11l.IiIIlIL(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String IiiIlLl1il1i(long j) throws IOException {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long i1iiLIil1ILi = i1iiLIil1ILi((byte) 10, 0, j2);
            if (i1iiLIil1ILi != -1) {
                return this.i1LIL11l.i1IL1lILl1L1I(i1iiLIil1ILi);
            }
            if (j2 < Long.MAX_VALUE && iLIIl1IliLlLI(j2) && this.i1LIL11l.ilLIlLiIILl1(j2 - 1) == 13 && iLIIl1IliLlLI(1 + j2) && this.i1LIL11l.ilLIlLiIILl1(j2) == 10) {
                return this.i1LIL11l.i1IL1lILl1L1I(j2);
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            IiILIlLLiIL iiILIlLLiIL2 = this.i1LIL11l;
            iiILIlLLiIL2.iILlLIlli(iiILIlLLiIL, 0, Math.min(32, iiILIlLLiIL2.iLLi1LIi()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.i1LIL11l.iLLi1LIi(), j) + " content=" + iiILIlLLiIL.IL1IiilLlLI().IL1lILLLL1L() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public ILL1iL1LiiI IiiL1llIIi() {
        return C0249o00oo00O.il1LilLllii(new o0O0O0Oo(this));
    }

    public short IilL11ii1I1Il() throws IOException {
        IIIlll1lll(2);
        return this.i1LIL11l.IilL11ii1I1Il();
    }

    public boolean Il1llillili() throws IOException {
        if (this.il1LilLllii) {
            throw new IllegalStateException("closed");
        } else if (!this.i1LIL11l.Il1llillili() || this.illlI1lLIL.IIlllIIi1ii(this.i1LIL11l, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    @Nullable
    public String IliiLiLliIl() throws IOException {
        long iLILliI1 = iLILliI1((byte) 10);
        if (iLILliI1 != -1) {
            return this.i1LIL11l.i1IL1lILl1L1I(iLILliI1);
        }
        long j = this.i1LIL11l.illlI1lLIL;
        if (j != 0) {
            return iL1LIlIlI(j);
        }
        return null;
    }

    public boolean IllLlI1IiIL(long j, ili11iILI1l ili11iili1l, int i, int i2) throws IOException {
        if (this.il1LilLllii) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || ili11iili1l.illiiliIILI() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!iLIIl1IliLlLI(1 + j2) || this.i1LIL11l.ilLIlLiIILl1(j2) != ili11iili1l.i1L1lLllLLlIi(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public void close() throws IOException {
        if (!this.il1LilLllii) {
            this.il1LilLllii = true;
            this.illlI1lLIL.close();
            this.i1LIL11l.IIL1Ll1I111();
        }
    }

    public byte[] i1i1111LLILli(long j) throws IOException {
        IIIlll1lll(j);
        return this.i1LIL11l.i1i1111LLILli(j);
    }

    public String i1iI1iiLL1() throws IOException {
        return IiiIlLl1il1i(Long.MAX_VALUE);
    }

    public long i1iLlIill1I() throws IOException {
        IIIlll1lll(8);
        return this.i1LIL11l.i1iLlIill1I();
    }

    public long i1iiLIil1ILi(byte b, long j, long j2) throws IOException {
        if (this.il1LilLllii) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long i1iiLIil1ILi = this.i1LIL11l.i1iiLIil1ILi(b, j, j2);
                if (i1iiLIil1ILi == -1) {
                    IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                    long j3 = iiILIlLLiIL.illlI1lLIL;
                    if (j3 >= j2 || this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return i1iiLIil1ILi;
                }
            }
            return -1;
        }
    }

    public String iL1LIlIlI(long j) throws IOException {
        IIIlll1lll(j);
        return this.i1LIL11l.iL1LIlIlI(j);
    }

    public InputStream iLI1L1l1li() {
        return new iiI1L1iI();
    }

    public boolean iLIIl1IliLlLI(long j) throws IOException {
        IiILIlLLiIL iiILIlLLiIL;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.il1LilLllii) {
            do {
                iiILIlLLiIL = this.i1LIL11l;
                if (iiILIlLLiIL.illlI1lLIL >= j) {
                    return true;
                }
            } while (this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long iLILliI1(byte b) throws IOException {
        return i1iiLIil1ILi(b, 0, Long.MAX_VALUE);
    }

    public IiILIlLLiIL iLlIllll() {
        return this.i1LIL11l;
    }

    public long iiLIIiIli(ili11iILI1l ili11iili1l, long j) throws IOException {
        if (!this.il1LilLllii) {
            while (true) {
                long iiLIIiIli = this.i1LIL11l.iiLIIiIli(ili11iili1l, j);
                if (iiLIIiIli != -1) {
                    return iiLIIiIli;
                }
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                long j2 = iiILIlLLiIL.illlI1lLIL;
                if (this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long iiiiI1iILL11I(ili11iILI1l ili11iili1l, long j) throws IOException {
        if (!this.il1LilLllii) {
            while (true) {
                long iiiiI1iILL11I = this.i1LIL11l.iiiiI1iILL11I(ili11iili1l, j);
                if (iiiiI1iILL11I != -1) {
                    return iiiiI1iILL11I;
                }
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                long j2 = iiILIlLLiIL.illlI1lLIL;
                if (this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) ili11iili1l.illiiliIILI())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public int iilLiIIIi11i() throws IOException {
        IIIlll1lll(1);
        byte ilLIlLiIILl1 = this.i1LIL11l.ilLIlLiIILl1(0);
        if ((ilLIlLiIILl1 & 224) == 192) {
            IIIlll1lll(2);
        } else if ((ilLIlLiIILl1 & 240) == 224) {
            IIIlll1lll(3);
        } else if ((ilLIlLiIILl1 & 248) == 240) {
            IIIlll1lll(4);
        }
        return this.i1LIL11l.iilLiIIIi11i();
    }

    public long il1l1IlL() throws IOException {
        IIIlll1lll(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!iLIIl1IliLlLI((long) i2)) {
                break;
            }
            byte ilLIlLiIILl1 = this.i1LIL11l.ilLIlLiIILl1((long) i);
            if ((ilLIlLiIILl1 >= 48 && ilLIlLiIILl1 <= 57) || (i == 0 && ilLIlLiIILl1 == 45)) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(ilLIlLiIILl1)}));
            }
        }
        return this.i1LIL11l.il1l1IlL();
    }

    public ili11iILI1l iliilLllIl1(long j) throws IOException {
        IIIlll1lll(j);
        return this.i1LIL11l.iliilLllIl1(j);
    }

    public String illi1IL1() throws IOException {
        this.i1LIL11l.Ii1liIIIiLi(this.illlI1lLIL);
        return this.i1LIL11l.illi1IL1();
    }

    public long illi1LIILLiL(C0361o0OOOo0 o0oooo0) throws IOException {
        if (o0oooo0 != null) {
            long j = 0;
            while (this.illlI1lLIL.IIlllIIi1ii(this.i1LIL11l, 8192) != -1) {
                long I1lLLLlliILlI = this.i1LIL11l.I1lLLLlliILlI();
                if (I1lLLLlliILlI > 0) {
                    j += I1lLLLlliILlI;
                    o0oooo0.I1iIiIi(this.i1LIL11l, I1lLLLlliILlI);
                }
            }
            if (this.i1LIL11l.iLLi1LIi() <= 0) {
                return j;
            }
            long iLLi1LIi = j + this.i1LIL11l.iLLi1LIi();
            IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
            o0oooo0.I1iIiIi(iiILIlLLiIL, iiILIlLLiIL.iLLi1LIi());
            return iLLi1LIi;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public IiILIlLLiIL illlI1lLIL() {
        return this.i1LIL11l;
    }

    public boolean isOpen() {
        return !this.il1LilLllii;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public byte readByte() throws IOException {
        IIIlll1lll(1);
        return this.i1LIL11l.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            IIIlll1lll((long) bArr.length);
            this.i1LIL11l.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                long j = iiILIlLLiIL.illlI1lLIL;
                if (j > 0) {
                    int read = iiILIlLLiIL.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        IIIlll1lll(4);
        return this.i1LIL11l.readInt();
    }

    public long readLong() throws IOException {
        IIIlll1lll(8);
        return this.i1LIL11l.readLong();
    }

    public short readShort() throws IOException {
        IIIlll1lll(2);
        return this.i1LIL11l.readShort();
    }

    public void skip(long j) throws IOException {
        if (!this.il1LilLllii) {
            while (j > 0) {
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                if (iiILIlLLiIL.illlI1lLIL == 0 && this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.i1LIL11l.iLLi1LIi());
                this.i1LIL11l.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C0446o0OoOOOo timeout() {
        return this.illlI1lLIL.timeout();
    }

    public String toString() {
        return "buffer(" + this.illlI1lLIL + ")";
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C0485o0Ooooo.i1LIL11l((long) bArr.length, (long) i, j);
        IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
        if (iiILIlLLiIL.illlI1lLIL == 0 && this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
            return -1;
        }
        return this.i1LIL11l.read(bArr, i, (int) Math.min(j, this.i1LIL11l.illlI1lLIL));
    }

    /* renamed from: top.tntok.autobot.o0O0o0o$iiI1L1iI */
    public class iiI1L1iI extends InputStream {
        public iiI1L1iI() {
        }

        public int available() throws IOException {
            C0313o0O0o0o o0o0o0o = C0313o0O0o0o.this;
            if (!o0o0o0o.il1LilLllii) {
                return (int) Math.min(o0o0o0o.i1LIL11l.illlI1lLIL, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            C0313o0O0o0o.this.close();
        }

        public int read() throws IOException {
            C0313o0O0o0o o0o0o0o = C0313o0O0o0o.this;
            if (!o0o0o0o.il1LilLllii) {
                IiILIlLLiIL iiILIlLLiIL = o0o0o0o.i1LIL11l;
                if (iiILIlLLiIL.illlI1lLIL == 0 && o0o0o0o.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                    return -1;
                }
                return C0313o0O0o0o.this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C0313o0O0o0o.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C0313o0O0o0o.this.il1LilLllii) {
                C0485o0Ooooo.i1LIL11l((long) bArr.length, (long) i, (long) i2);
                C0313o0O0o0o o0o0o0o = C0313o0O0o0o.this;
                IiILIlLLiIL iiILIlLLiIL = o0o0o0o.i1LIL11l;
                if (iiILIlLLiIL.illlI1lLIL == 0 && o0o0o0o.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
                    return -1;
                }
                return C0313o0O0o0o.this.i1LIL11l.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
        if (iiILIlLLiIL.illlI1lLIL == 0 && this.illlI1lLIL.IIlllIIi1ii(iiILIlLLiIL, 8192) == -1) {
            return -1;
        }
        return this.i1LIL11l.read(byteBuffer);
    }
}
