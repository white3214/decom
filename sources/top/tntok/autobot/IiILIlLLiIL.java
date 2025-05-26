package top.tntok.autobot;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class IiILIlLLiIL implements ILL1iL1LiiI, Iiii1LiI11i, Cloneable, ByteChannel {
    public static final int iiIliillii = 65533;
    public static final byte[] il1LilLllii = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    public o0OOO00 i1LIL11l;
    public long illlI1lLIL;

    public class i1LIL11l extends InputStream {
        public i1LIL11l() {
        }

        public int available() {
            return (int) Math.min(IiILIlLLiIL.this.illlI1lLIL, 2147483647L);
        }

        public int read() {
            IiILIlLLiIL iiILIlLLiIL = IiILIlLLiIL.this;
            if (iiILIlLLiIL.illlI1lLIL > 0) {
                return iiILIlLLiIL.readByte() & i1IL1lILl1L1I.iiI1L1iI;
            }
            return -1;
        }

        public String toString() {
            return IiILIlLLiIL.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            return IiILIlLLiIL.this.read(bArr, i, i2);
        }

        public void close() {
        }
    }

    public class iiI1L1iI extends OutputStream {
        public iiI1L1iI() {
        }

        public String toString() {
            return IiILIlLLiIL.this + ".outputStream()";
        }

        public void write(int i) {
            IiILIlLLiIL.this.IillLillLLIii((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            IiILIlLLiIL.this.iLLLILIiLi1Ii(bArr, i, i2);
        }

        public void close() {
        }

        public void flush() {
        }
    }

    public static final class illlI1lLIL implements Closeable {
        public int I11lLL1 = -1;
        public IiILIlLLiIL i1LIL11l;
        public int iLLLILIiLi1Ii = -1;
        public long iiIliillii = -1;
        public byte[] iilLil1i11I1;
        public o0OOO00 il1LilLllii;
        public boolean illlI1lLIL;

        public void close() {
            if (this.i1LIL11l != null) {
                this.i1LIL11l = null;
                this.il1LilLllii = null;
                this.iiIliillii = -1;
                this.iilLil1i11I1 = null;
                this.I11lLL1 = -1;
                this.iLLLILIiLi1Ii = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int i111iLiiIIill(long j) {
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i >= 0) {
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                long j2 = iiILIlLLiIL.illlI1lLIL;
                if (j <= j2) {
                    if (i == 0 || j == j2) {
                        this.il1LilLllii = null;
                        this.iiIliillii = j;
                        this.iilLil1i11I1 = null;
                        this.I11lLL1 = -1;
                        this.iLLLILIiLi1Ii = -1;
                        return -1;
                    }
                    o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
                    o0OOO00 o0ooo002 = this.il1LilLllii;
                    long j3 = 0;
                    if (o0ooo002 != null) {
                        long j4 = this.iiIliillii - ((long) (this.I11lLL1 - o0ooo002.i1LIL11l));
                        if (j4 > j) {
                            j2 = j4;
                            o0OOO00 o0ooo003 = o0ooo002;
                            o0ooo002 = o0ooo00;
                            o0ooo00 = o0ooo003;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        o0ooo002 = o0ooo00;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i2 = o0ooo002.illlI1lLIL;
                            int i3 = o0ooo002.i1LIL11l;
                            if (j < ((long) (i2 - i3)) + j3) {
                                break;
                            }
                            j3 += (long) (i2 - i3);
                            o0ooo002 = o0ooo002.iilLil1i11I1;
                        }
                    } else {
                        while (j2 > j) {
                            o0ooo00 = o0ooo00.I11lLL1;
                            j2 -= (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                        }
                        o0ooo002 = o0ooo00;
                        j3 = j2;
                    }
                    if (this.illlI1lLIL && o0ooo002.il1LilLllii) {
                        o0OOO00 iilLil1i11I12 = o0ooo002.iilLil1i11I1();
                        IiILIlLLiIL iiILIlLLiIL2 = this.i1LIL11l;
                        if (iiILIlLLiIL2.i1LIL11l == o0ooo002) {
                            iiILIlLLiIL2.i1LIL11l = iilLil1i11I12;
                        }
                        o0ooo002 = o0ooo002.illlI1lLIL(iilLil1i11I12);
                        o0ooo002.I11lLL1.i1LIL11l();
                    }
                    this.il1LilLllii = o0ooo002;
                    this.iiIliillii = j;
                    this.iilLil1i11I1 = o0ooo002.iiI1L1iI;
                    int i4 = o0ooo002.i1LIL11l + ((int) (j - j3));
                    this.I11lLL1 = i4;
                    int i5 = o0ooo002.illlI1lLIL;
                    this.iLLLILIiLi1Ii = i5;
                    return i5 - i4;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.i1LIL11l.illlI1lLIL)}));
        }

        public final int i1LIL11l() {
            long j = this.iiIliillii;
            if (j == this.i1LIL11l.illlI1lLIL) {
                throw new IllegalStateException();
            } else if (j == -1) {
                return i111iLiiIIill(0);
            } else {
                return i111iLiiIIill(j + ((long) (this.iLLLILIiLi1Ii - this.I11lLL1)));
            }
        }

        public final long iiI1L1iI(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i);
            } else if (i <= 8192) {
                IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
                if (iiILIlLLiIL == null) {
                    throw new IllegalStateException("not attached to a buffer");
                } else if (this.illlI1lLIL) {
                    long j = iiILIlLLiIL.illlI1lLIL;
                    o0OOO00 iiIiili = iiILIlLLiIL.iiIiili(i);
                    int i2 = 8192 - iiIiili.illlI1lLIL;
                    iiIiili.illlI1lLIL = 8192;
                    long j2 = (long) i2;
                    this.i1LIL11l.illlI1lLIL = j + j2;
                    this.il1LilLllii = iiIiili;
                    this.iiIliillii = j;
                    this.iilLil1i11I1 = iiIiili.iiI1L1iI;
                    this.I11lLL1 = 8192 - i2;
                    this.iLLLILIiLi1Ii = 8192;
                    return j2;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
            } else {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i);
            }
        }

        public final long il1LilLllii(long j) {
            IiILIlLLiIL iiILIlLLiIL = this.i1LIL11l;
            if (iiILIlLLiIL == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.illlI1lLIL) {
                long j2 = iiILIlLLiIL.illlI1lLIL;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i <= 0) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            IiILIlLLiIL iiILIlLLiIL2 = this.i1LIL11l;
                            o0OOO00 o0ooo00 = iiILIlLLiIL2.i1LIL11l.I11lLL1;
                            int i2 = o0ooo00.illlI1lLIL;
                            long j4 = (long) (i2 - o0ooo00.i1LIL11l);
                            if (j4 > j3) {
                                o0ooo00.illlI1lLIL = (int) (((long) i2) - j3);
                                break;
                            }
                            iiILIlLLiIL2.i1LIL11l = o0ooo00.i1LIL11l();
                            o0OOO00o.iiI1L1iI(o0ooo00);
                            j3 -= j4;
                        }
                        this.il1LilLllii = null;
                        this.iiIliillii = j;
                        this.iilLil1i11I1 = null;
                        this.I11lLL1 = -1;
                        this.iLLLILIiLi1Ii = -1;
                    } else {
                        throw new IllegalArgumentException("newSize < 0: " + j);
                    }
                } else if (i > 0) {
                    long j5 = j - j2;
                    boolean z = true;
                    while (j5 > 0) {
                        o0OOO00 iiIiili = this.i1LIL11l.iiIiili(1);
                        int min = (int) Math.min(j5, (long) (8192 - iiIiili.illlI1lLIL));
                        int i3 = iiIiili.illlI1lLIL + min;
                        iiIiili.illlI1lLIL = i3;
                        j5 -= (long) min;
                        if (z) {
                            this.il1LilLllii = iiIiili;
                            this.iiIliillii = j2;
                            this.iilLil1i11I1 = iiIiili.iiI1L1iI;
                            this.I11lLL1 = i3 - min;
                            this.iLLLILIiLi1Ii = i3;
                            z = false;
                        }
                    }
                }
                this.i1LIL11l.illlI1lLIL = j;
                return j2;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }
    }

    public final IiILIlLLiIL I11iLiiIi(InputStream inputStream) throws IOException {
        I1ILilil1I(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public long I11lLL1(ili11iILI1l ili11iili1l) {
        return iiLIIiIli(ili11iili1l, 0);
    }

    /* renamed from: I11lLL1L11Lil */
    public IiILIlLLiIL ILiLII1ILi(ili11iILI1l ili11iili1l) {
        if (ili11iili1l != null) {
            ili11iili1l.IiIl11II(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public int I1I11Il1(C0256o00oo0oO o00oo0oo) {
        int iiL1l1iLliL = iiL1l1iLliL(o00oo0oo, false);
        if (iiL1l1iLliL == -1) {
            return -1;
        }
        try {
            skip((long) o00oo0oo.iiI1L1iI[iiL1l1iLliL].illiiliIILI());
            return iiL1l1iLliL;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public byte[] I1IIIi1i1ILl() {
        try {
            return i1i1111LLILli(this.illlI1lLIL);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void I1ILilil1I(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream != null) {
            while (true) {
                if (j > 0 || z) {
                    o0OOO00 iiIiili = iiIiili(1);
                    int read = inputStream.read(iiIiili.iiI1L1iI, iiIiili.illlI1lLIL, (int) Math.min(j, (long) (8192 - iiIiili.illlI1lLIL)));
                    if (read != -1) {
                        iiIiili.illlI1lLIL += read;
                        long j2 = (long) read;
                        this.illlI1lLIL += j2;
                        j -= j2;
                    } else if (!z) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    public long I1Ii1ILliII(ili11iILI1l ili11iili1l) throws IOException {
        return iiiiI1iILL11I(ili11iili1l, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r8 != r9) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r15.i1LIL11l = r6.i1LIL11l();
        top.tntok.autobot.o0OOO00o.iiI1L1iI(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r6.i1LIL11l = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r1 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long I1i1iiiI() {
        /*
            r15 = this;
            long r0 = r15.illlI1lLIL
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a9
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            top.tntok.autobot.o0OOO00 r6 = r15.i1LIL11l
            byte[] r7 = r6.iiI1L1iI
            int r8 = r6.i1LIL11l
            int r9 = r6.illlI1lLIL
        L_0x0013:
            if (r8 >= r9) goto L_0x008e
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0037
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -87
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006f
            r11 = 70
            if (r10 > r11) goto L_0x006f
            int r11 = r10 + -55
        L_0x0037:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0047:
            top.tntok.autobot.IiILIlLLiIL r0 = new top.tntok.autobot.IiILIlLLiIL
            r0.<init>()
            top.tntok.autobot.IiILIlLLiIL r0 = r0.IL111l1(r4)
            top.tntok.autobot.IiILIlLLiIL r0 = r0.IillLillLLIii(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.illi1IL1()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x0073
            r1 = 1
            goto L_0x008e
        L_0x0073:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            if (r8 != r9) goto L_0x009a
            top.tntok.autobot.o0OOO00 r7 = r6.i1LIL11l()
            r15.i1LIL11l = r7
            top.tntok.autobot.o0OOO00o.iiI1L1iI(r6)
            goto L_0x009c
        L_0x009a:
            r6.i1LIL11l = r8
        L_0x009c:
            if (r1 != 0) goto L_0x00a2
            top.tntok.autobot.o0OOO00 r6 = r15.i1LIL11l
            if (r6 != 0) goto L_0x000b
        L_0x00a2:
            long r1 = r15.illlI1lLIL
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.illlI1lLIL = r1
            return r4
        L_0x00a9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IiILIlLLiIL.I1i1iiiI():long");
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) {
        o0OOO00 o0ooo00;
        int i;
        if (iiILIlLLiIL == null) {
            throw new IllegalArgumentException("source == null");
        } else if (iiILIlLLiIL != this) {
            C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, j);
            while (j > 0) {
                o0OOO00 o0ooo002 = iiILIlLLiIL.i1LIL11l;
                if (j < ((long) (o0ooo002.illlI1lLIL - o0ooo002.i1LIL11l))) {
                    o0OOO00 o0ooo003 = this.i1LIL11l;
                    if (o0ooo003 != null) {
                        o0ooo00 = o0ooo003.I11lLL1;
                    } else {
                        o0ooo00 = null;
                    }
                    if (o0ooo00 != null && o0ooo00.iiIliillii) {
                        long j2 = ((long) o0ooo00.illlI1lLIL) + j;
                        if (o0ooo00.il1LilLllii) {
                            i = 0;
                        } else {
                            i = o0ooo00.i1LIL11l;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            o0ooo002.I11lLL1(o0ooo00, (int) j);
                            iiILIlLLiIL.illlI1lLIL -= j;
                            this.illlI1lLIL += j;
                            return;
                        }
                    }
                    iiILIlLLiIL.i1LIL11l = o0ooo002.iiIliillii((int) j);
                }
                o0OOO00 o0ooo004 = iiILIlLLiIL.i1LIL11l;
                long j3 = (long) (o0ooo004.illlI1lLIL - o0ooo004.i1LIL11l);
                iiILIlLLiIL.i1LIL11l = o0ooo004.i1LIL11l();
                o0OOO00 o0ooo005 = this.i1LIL11l;
                if (o0ooo005 == null) {
                    this.i1LIL11l = o0ooo004;
                    o0ooo004.I11lLL1 = o0ooo004;
                    o0ooo004.iilLil1i11I1 = o0ooo004;
                } else {
                    o0ooo005.I11lLL1.illlI1lLIL(o0ooo004).iiI1L1iI();
                }
                iiILIlLLiIL.illlI1lLIL -= j3;
                this.illlI1lLIL += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public void I1l1iIll1lIi1(IiILIlLLiIL iiILIlLLiIL, long j) throws EOFException {
        long j2 = this.illlI1lLIL;
        if (j2 >= j) {
            iiILIlLLiIL.I1iIiIi(this, j);
        } else {
            iiILIlLLiIL.I1iIiIi(this, j2);
            throw new EOFException();
        }
    }

    public final long I1lLLLlliILlI() {
        long j = this.illlI1lLIL;
        if (j == 0) {
            return 0;
        }
        o0OOO00 o0ooo00 = this.i1LIL11l.I11lLL1;
        int i = o0ooo00.illlI1lLIL;
        if (i >= 8192 || !o0ooo00.iiIliillii) {
            return j;
        }
        return j - ((long) (i - o0ooo00.i1LIL11l));
    }

    public final illlI1lLIL I1llIillii1() {
        return iLlI1iL1lIIL(new illlI1lLIL());
    }

    public final ili11iILI1l II1l1IliI1Li1(ili11iILI1l ili11iili1l) {
        return ILIiLLLL1iiii("HmacSHA256", ili11iili1l);
    }

    public void IIIlll1lll(long j) throws EOFException {
        if (this.illlI1lLIL < j) {
            throw new EOFException();
        }
    }

    public final void IIL1Ll1I111() {
        try {
            skip(this.illlI1lLIL);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public Iiii1LiI11i IILiIL1i11Li(C0370o0OOOooO o0oooooo, long j) throws IOException {
        while (j > 0) {
            long IIlllIIi1ii = o0oooooo.IIlllIIi1ii(this, j);
            if (IIlllIIi1ii != -1) {
                j -= IIlllIIi1ii;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public boolean IIi1l1i(long j, ili11iILI1l ili11iili1l) {
        return IllLlI1IiIL(j, ili11iili1l, 0, ili11iili1l.illiiliIILI());
    }

    public final boolean IIlLLll1ll1(o0OOO00 o0ooo00, int i, ili11iILI1l ili11iili1l, int i2, int i3) {
        int i4 = o0ooo00.illlI1lLIL;
        byte[] bArr = o0ooo00.iiI1L1iI;
        while (i2 < i3) {
            if (i == i4) {
                o0ooo00 = o0ooo00.iilLil1i11I1;
                byte[] bArr2 = o0ooo00.iiI1L1iI;
                int i5 = o0ooo00.i1LIL11l;
                bArr = bArr2;
                i = i5;
                i4 = o0ooo00.illlI1lLIL;
            }
            if (bArr[i] != ili11iili1l.i1L1lLllLLlIi(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) {
        if (iiILIlLLiIL == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.illlI1lLIL;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            iiILIlLLiIL.I1iIiIi(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public final IiILIlLLiIL IL11lll11(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream != null) {
            C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, j, j2);
            if (j2 == 0) {
                return this;
            }
            o0OOO00 o0ooo00 = this.i1LIL11l;
            while (true) {
                int i = o0ooo00.illlI1lLIL;
                int i2 = o0ooo00.i1LIL11l;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                o0ooo00 = o0ooo00.iilLil1i11I1;
            }
            while (j2 > 0) {
                int i3 = (int) (((long) o0ooo00.i1LIL11l) + j);
                int min = (int) Math.min((long) (o0ooo00.illlI1lLIL - i3), j2);
                outputStream.write(o0ooo00.iiI1L1iI, i3, min);
                j2 -= (long) min;
                o0ooo00 = o0ooo00.iilLil1i11I1;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public ili11iILI1l IL1IiilLlLI() {
        return new ili11iILI1l(I1IIIi1i1ILl());
    }

    public long IL1lILLLL1L(byte b, long j) {
        return i1iiLIil1ILi(b, j, Long.MAX_VALUE);
    }

    /* renamed from: ILI1Iil1li */
    public IiILIlLLiIL iLLLILIiLi1Ii(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C0485o0Ooooo.i1LIL11l((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                o0OOO00 iiIiili = iiIiili(1);
                int min = Math.min(i3 - i, 8192 - iiIiili.illlI1lLIL);
                System.arraycopy(bArr, i, iiIiili.iiI1L1iI, iiIiili.illlI1lLIL, min);
                i += min;
                iiIiili.illlI1lLIL += min;
            }
            this.illlI1lLIL += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final ili11iILI1l ILIiLLLL1iiii(String str, ili11iILI1l ili11iili1l) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(ili11iili1l.i1LiiIlIL1I(), str));
            o0OOO00 o0ooo00 = this.i1LIL11l;
            if (o0ooo00 != null) {
                byte[] bArr = o0ooo00.iiI1L1iI;
                int i = o0ooo00.i1LIL11l;
                instance.update(bArr, i, o0ooo00.illlI1lLIL - i);
                o0OOO00 o0ooo002 = this.i1LIL11l;
                while (true) {
                    o0ooo002 = o0ooo002.iilLil1i11I1;
                    if (o0ooo002 == this.i1LIL11l) {
                        break;
                    }
                    byte[] bArr2 = o0ooo002.iiI1L1iI;
                    int i2 = o0ooo002.i1LIL11l;
                    instance.update(bArr2, i2, o0ooo002.illlI1lLIL - i2);
                }
            }
            return ili11iILI1l.il1l1IlL(instance.doFinal());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ILL1iL1LiiI */
    public IiILIlLLiIL i1L1lLllLLlIi(int i) {
        return IiiIIil1l(C0485o0Ooooo.iiIliillii((short) i));
    }

    public String ILiliIiI(Charset charset) {
        try {
            return IiIIlIL(this.illlI1lLIL, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public int ILllI11() {
        return C0485o0Ooooo.illlI1lLIL(readInt());
    }

    /* renamed from: Ii1lLiiIli */
    public IiILIlLLiIL illiiliIILI(String str) {
        return ILl1iII11Ll1(str, 0, str.length());
    }

    public long Ii1liIIIiLi(C0370o0OOOooO o0oooooo) throws IOException {
        if (o0oooooo != null) {
            long j = 0;
            while (true) {
                long IIlllIIi1ii = o0oooooo.IIlllIIi1ii(this, 8192);
                if (IIlllIIi1ii == -1) {
                    return j;
                }
                j += IIlllIIi1ii;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public String IiIIlIL(long j, Charset charset) throws EOFException {
        C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            int i = o0ooo00.i1LIL11l;
            if (((long) i) + j > ((long) o0ooo00.illlI1lLIL)) {
                return new String(i1i1111LLILli(j), charset);
            }
            String str = new String(o0ooo00.iiI1L1iI, i, (int) j, charset);
            int i2 = (int) (((long) o0ooo00.i1LIL11l) + j);
            o0ooo00.i1LIL11l = i2;
            this.illlI1lLIL -= j;
            if (i2 == o0ooo00.illlI1lLIL) {
                this.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            }
            return str;
        }
    }

    /* renamed from: IiILIlLLiIL */
    public IiILIlLLiIL iILiI1lll(long j) {
        return IilliIIIlI1ll(C0485o0Ooooo.il1LilLllii(j));
    }

    /* renamed from: IiIiilIiL1iLi */
    public IiILIlLLiIL IilliIIIlI1ll(long j) {
        o0OOO00 iiIiili = iiIiili(8);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i = iiIiili.illlI1lLIL;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        bArr[i + 1] = (byte) ((int) ((j >>> 48) & 255));
        bArr[i + 2] = (byte) ((int) ((j >>> 40) & 255));
        bArr[i + 3] = (byte) ((int) ((j >>> 32) & 255));
        bArr[i + 4] = (byte) ((int) ((j >>> 24) & 255));
        bArr[i + 5] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i + 6] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i + 7] = (byte) ((int) (j & 255));
        iiIiili.illlI1lLIL = i + 8;
        this.illlI1lLIL += 8;
        return this;
    }

    public final illlI1lLIL IiL1llLiil1() {
        return iL1lL1LL(new illlI1lLIL());
    }

    public String IiiIlLl1il1i(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long i1iiLIil1ILi = i1iiLIil1ILi((byte) 10, 0, j2);
            if (i1iiLIil1ILi != -1) {
                return i1IL1lILl1L1I(i1iiLIil1ILi);
            }
            if (j2 < iLLi1LIi() && ilLIlLiIILl1(j2 - 1) == 13 && ilLIlLiIILl1(j2) == 10) {
                return i1IL1lILl1L1I(j2);
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            iILlLIlli(iiILIlLLiIL, 0, Math.min(32, iLLi1LIi()));
            throw new EOFException("\\n not found: limit=" + Math.min(iLLi1LIi(), j) + " content=" + iiILIlLLiIL.IL1IiilLlLI().IL1lILLLL1L() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public ILL1iL1LiiI IiiL1llIIi() {
        return C0249o00oo00O.il1LilLllii(new o0O0O0Oo(this));
    }

    /* renamed from: Iiii1LiI11i */
    public IiILIlLLiIL IiiIIil1l(int i) {
        o0OOO00 iiIiili = iiIiili(2);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i2 = iiIiili.illlI1lLIL;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        iiIiili.illlI1lLIL = i2 + 2;
        this.illlI1lLIL += 2;
        return this;
    }

    public OutputStream Iiiiii1l1I1L1() {
        return new iiI1L1iI();
    }

    public short IilL11ii1I1Il() {
        return C0485o0Ooooo.iiIliillii(readShort());
    }

    /* renamed from: IillLI1llIL1 */
    public IiILIlLLiIL IIlLill(String str, Charset charset) {
        return i11liIIl11Ii1(str, 0, str.length(), charset);
    }

    public boolean Il1llillili() {
        if (this.illlI1lLIL == 0) {
            return true;
        }
        return false;
    }

    public final ili11iILI1l IlLLlIi1iI1li() {
        return iIiL11iL("SHA-1");
    }

    @Nullable
    public String IliiLiLliIl() throws EOFException {
        long iLILliI1 = iLILliI1((byte) 10);
        if (iLILliI1 != -1) {
            return i1IL1lILl1L1I(iLILliI1);
        }
        long j = this.illlI1lLIL;
        if (j != 0) {
            return iL1LIlIlI(j);
        }
        return null;
    }

    public List<Integer> Ilili11iLIl() {
        if (this.i1LIL11l == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        o0OOO00 o0ooo00 = this.i1LIL11l;
        arrayList.add(Integer.valueOf(o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
        o0OOO00 o0ooo002 = this.i1LIL11l;
        while (true) {
            o0ooo002 = o0ooo002.iilLil1i11I1;
            if (o0ooo002 == this.i1LIL11l) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(o0ooo002.illlI1lLIL - o0ooo002.i1LIL11l));
        }
    }

    public boolean IllLlI1IiIL(long j, ili11iILI1l ili11iili1l, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.illlI1lLIL - j < ((long) i2) || ili11iili1l.illiiliIILI() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (ilLIlLiIILl1(((long) i3) + j) != ili11iili1l.i1L1lLllLLlIi(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IiILIlLLiIL)) {
            return false;
        }
        IiILIlLLiIL iiILIlLLiIL = (IiILIlLLiIL) obj;
        long j = this.illlI1lLIL;
        if (j != iiILIlLLiIL.illlI1lLIL) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        o0OOO00 o0ooo00 = this.i1LIL11l;
        o0OOO00 o0ooo002 = iiILIlLLiIL.i1LIL11l;
        int i = o0ooo00.i1LIL11l;
        int i2 = o0ooo002.i1LIL11l;
        while (j2 < this.illlI1lLIL) {
            long min = (long) Math.min(o0ooo00.illlI1lLIL - i, o0ooo002.illlI1lLIL - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (o0ooo00.iiI1L1iI[i] != o0ooo002.iiI1L1iI[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == o0ooo00.illlI1lLIL) {
                o0ooo00 = o0ooo00.iilLil1i11I1;
                i = o0ooo00.i1LIL11l;
            }
            if (i2 == o0ooo002.illlI1lLIL) {
                o0ooo002 = o0ooo002.iilLil1i11I1;
                i2 = o0ooo002.i1LIL11l;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        o0OOO00 o0ooo00 = this.i1LIL11l;
        if (o0ooo00 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o0ooo00.illlI1lLIL;
            for (int i3 = o0ooo00.i1LIL11l; i3 < i2; i3++) {
                i = (i * 31) + o0ooo00.iiI1L1iI[i3];
            }
            o0ooo00 = o0ooo00.iilLil1i11I1;
        } while (o0ooo00 != this.i1LIL11l);
        return i;
    }

    public final ili11iILI1l i11iLLllliI(ili11iILI1l ili11iili1l) {
        return ILIiLLLL1iiii("HmacSHA512", ili11iili1l);
    }

    /* renamed from: i1II1iL */
    public IiILIlLLiIL ILl1iII11Ll1(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    o0OOO00 iiIiili = iiIiili(1);
                    byte[] bArr = iiIiili.iiI1L1iI;
                    int i3 = iiIiili.illlI1lLIL - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = iiIiili.illlI1lLIL;
                    int i6 = (i3 + i4) - i5;
                    iiIiili.illlI1lLIL = i5 + i6;
                    this.illlI1lLIL += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        IillLillLLIii((charAt >> 6) | 192);
                        IillLillLLIii((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        IillLillLLIii((charAt >> 12) | 224);
                        IillLillLLIii(((charAt >> 6) & 63) | 128);
                        IillLillLLIii((charAt & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        if (i7 < i2) {
                            c = str.charAt(i7);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            IillLillLLIii(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & c)) + iLIIl1IliLlLI.iLLLILIiLi1Ii;
                            IillLillLLIii((i8 >> 18) | 240);
                            IillLillLLIii(((i8 >> 12) & 63) | 128);
                            IillLillLLIii(((i8 >> 6) & 63) | 128);
                            IillLillLLIii((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public String i1IL1lILl1L1I(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (ilLIlLiIILl1(j2) == 13) {
                String iL1LIlIlI = iL1LIlIlI(j2);
                skip(2);
                return iL1LIlIlI;
            }
        }
        String iL1LIlIlI2 = iL1LIlIlI(j);
        skip(1);
        return iL1LIlIlI2;
    }

    public final ili11iILI1l i1L1llI1LlL1l(ili11iILI1l ili11iili1l) {
        return ILIiLLLL1iiii("HmacSHA1", ili11iili1l);
    }

    public final IiILIlLLiIL i1LlL1iILLLil(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            I1ILilil1I(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public byte[] i1i1111LLILli(long j) throws EOFException {
        C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public String i1iI1iiLL1() throws EOFException {
        return IiiIlLl1il1i(Long.MAX_VALUE);
    }

    public long i1iLlIill1I() {
        return C0485o0Ooooo.il1LilLllii(readLong());
    }

    public long i1iiLIil1ILi(byte b, long j, long j2) {
        long j3;
        o0OOO00 o0ooo00;
        long j4 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.illlI1lLIL), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j5 = this.illlI1lLIL;
        if (j2 > j5) {
            j3 = j5;
        } else {
            j3 = j2;
        }
        if (j == j3 || (o0ooo00 = this.i1LIL11l) == null) {
            return -1;
        }
        if (j5 - j < j) {
            while (j5 > j) {
                o0ooo00 = o0ooo00.I11lLL1;
                j5 -= (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
            }
        } else {
            while (true) {
                long j6 = ((long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l)) + j4;
                if (j6 >= j) {
                    break;
                }
                o0ooo00 = o0ooo00.iilLil1i11I1;
                j4 = j6;
            }
            j5 = j4;
        }
        long j7 = j;
        while (j5 < j3) {
            byte[] bArr = o0ooo00.iiI1L1iI;
            int min = (int) Math.min((long) o0ooo00.illlI1lLIL, (((long) o0ooo00.i1LIL11l) + j3) - j5);
            for (int i = (int) ((((long) o0ooo00.i1LIL11l) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - o0ooo00.i1LIL11l)) + j5;
                }
            }
            byte b2 = b;
            j5 += (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
            o0ooo00 = o0ooo00.iilLil1i11I1;
            j7 = j5;
        }
        return -1;
    }

    /* renamed from: i1iliILILi */
    public IiILIlLLiIL i11liIIl11Ii1(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C0485o0Ooooo.iiI1L1iI)) {
            return ILl1iII11Ll1(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return iLLLILIiLi1Ii(bytes, 0, bytes.length);
        }
    }

    public final IiILIlLLiIL iI1LILIILLI(OutputStream outputStream) throws IOException {
        return iIliIIiiI(outputStream, this.illlI1lLIL);
    }

    public final ili11iILI1l iILil1IilI1l() {
        long j = this.illlI1lLIL;
        if (j <= 2147483647L) {
            return iillllIL((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.illlI1lLIL);
    }

    public final IiILIlLLiIL iILlLIlli(IiILIlLLiIL iiILIlLLiIL, long j, long j2) {
        if (iiILIlLLiIL != null) {
            C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, j, j2);
            if (j2 == 0) {
                return this;
            }
            iiILIlLLiIL.illlI1lLIL += j2;
            o0OOO00 o0ooo00 = this.i1LIL11l;
            while (true) {
                int i = o0ooo00.illlI1lLIL;
                int i2 = o0ooo00.i1LIL11l;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                o0ooo00 = o0ooo00.iilLil1i11I1;
            }
            while (j2 > 0) {
                o0OOO00 il1LilLllii2 = o0ooo00.il1LilLllii();
                int i3 = (int) (((long) il1LilLllii2.i1LIL11l) + j);
                il1LilLllii2.i1LIL11l = i3;
                il1LilLllii2.illlI1lLIL = Math.min(i3 + ((int) j2), il1LilLllii2.illlI1lLIL);
                o0OOO00 o0ooo002 = iiILIlLLiIL.i1LIL11l;
                if (o0ooo002 == null) {
                    il1LilLllii2.I11lLL1 = il1LilLllii2;
                    il1LilLllii2.iilLil1i11I1 = il1LilLllii2;
                    iiILIlLLiIL.i1LIL11l = il1LilLllii2;
                } else {
                    o0ooo002.I11lLL1.illlI1lLIL(il1LilLllii2);
                }
                j2 -= (long) (il1LilLllii2.illlI1lLIL - il1LilLllii2.i1LIL11l);
                o0ooo00 = o0ooo00.iilLil1i11I1;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final ili11iILI1l iIiL11iL(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            o0OOO00 o0ooo00 = this.i1LIL11l;
            if (o0ooo00 != null) {
                byte[] bArr = o0ooo00.iiI1L1iI;
                int i = o0ooo00.i1LIL11l;
                instance.update(bArr, i, o0ooo00.illlI1lLIL - i);
                o0OOO00 o0ooo002 = this.i1LIL11l;
                while (true) {
                    o0ooo002 = o0ooo002.iilLil1i11I1;
                    if (o0ooo002 == this.i1LIL11l) {
                        break;
                    }
                    byte[] bArr2 = o0ooo002.iiI1L1iI;
                    int i2 = o0ooo002.i1LIL11l;
                    instance.update(bArr2, i2, o0ooo002.illlI1lLIL - i2);
                }
            }
            return ili11iILI1l.il1l1IlL(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: iIiiI1IILilLl */
    public IiILIlLLiIL i1LiiIlIL1I(int i) {
        return iilLil1i11I1(C0485o0Ooooo.illlI1lLIL(i));
    }

    public final IiILIlLLiIL iIliIIiiI(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, 0, j);
            o0OOO00 o0ooo00 = this.i1LIL11l;
            while (j > 0) {
                int min = (int) Math.min(j, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
                outputStream.write(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
                int i = o0ooo00.i1LIL11l + min;
                o0ooo00.i1LIL11l = i;
                long j2 = (long) min;
                this.illlI1lLIL -= j2;
                j -= j2;
                if (i == o0ooo00.illlI1lLIL) {
                    o0OOO00 i1LIL11l2 = o0ooo00.i1LIL11l();
                    this.i1LIL11l = i1LIL11l2;
                    o0OOO00o.iiI1L1iI(o0ooo00);
                    o0ooo00 = i1LIL11l2;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public String iL1LIlIlI(long j) throws EOFException {
        return IiIIlIL(j, C0485o0Ooooo.iiI1L1iI);
    }

    public final illlI1lLIL iL1lL1LL(illlI1lLIL illli1llil) {
        if (illli1llil.i1LIL11l == null) {
            illli1llil.i1LIL11l = this;
            illli1llil.illlI1lLIL = false;
            return illli1llil;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public InputStream iLI1L1l1li() {
        return new i1LIL11l();
    }

    public boolean iLIIl1IliLlLI(long j) {
        if (this.illlI1lLIL >= j) {
            return true;
        }
        return false;
    }

    public long iLILliI1(byte b) {
        return i1iiLIil1ILi(b, 0, Long.MAX_VALUE);
    }

    public final long iLLi1LIi() {
        return this.illlI1lLIL;
    }

    /* renamed from: iLLlLIIliLl */
    public IiILIlLLiIL iiIliillii(byte[] bArr) {
        if (bArr != null) {
            return iLLLILIiLi1Ii(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final illlI1lLIL iLlI1iL1lIIL(illlI1lLIL illli1llil) {
        if (illli1llil.i1LIL11l == null) {
            illli1llil.i1LIL11l = this;
            illli1llil.illlI1lLIL = true;
            return illli1llil;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    /* renamed from: iLliII11iI */
    public IiILIlLLiIL IIllllLiIlIl(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return IillLillLLIii(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return illiiliIILI("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < C0097o000o0O.il1l1IlL) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        o0OOO00 iiIiili = iiIiili(i2);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i3 = iiIiili.illlI1lLIL + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = il1LilLllii[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = C0186o00o00.i1L1lLllLLlIi;
        }
        iiIiili.illlI1lLIL += i2;
        this.illlI1lLIL += (long) i2;
        return this;
    }

    public o0OOO00 iiIiili(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        o0OOO00 o0ooo00 = this.i1LIL11l;
        if (o0ooo00 == null) {
            o0OOO00 i1LIL11l2 = o0OOO00o.i1LIL11l();
            this.i1LIL11l = i1LIL11l2;
            i1LIL11l2.I11lLL1 = i1LIL11l2;
            i1LIL11l2.iilLil1i11I1 = i1LIL11l2;
            return i1LIL11l2;
        }
        o0OOO00 o0ooo002 = o0ooo00.I11lLL1;
        if (o0ooo002.illlI1lLIL + i > 8192 || !o0ooo002.iiIliillii) {
            return o0ooo002.illlI1lLIL(o0OOO00o.i1LIL11l());
        }
        return o0ooo002;
    }

    public int iiL1l1iLliL(C0256o00oo0oO o00oo0oo, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        o0OOO00 o0ooo00;
        int i4;
        C0256o00oo0oO o00oo0oo2 = o00oo0oo;
        o0OOO00 o0ooo002 = this.i1LIL11l;
        int i5 = -2;
        if (o0ooo002 != null) {
            byte[] bArr = o0ooo002.iiI1L1iI;
            int i6 = o0ooo002.i1LIL11l;
            int i7 = o0ooo002.illlI1lLIL;
            int[] iArr = o00oo0oo2.i1LIL11l;
            o0OOO00 o0ooo003 = o0ooo002;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i8 + 2;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (o0ooo003 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & i1IL1lILl1L1I.iiI1L1iI) != iArr[i12]) {
                            return i9;
                        }
                        if (i16 == i14) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i15 == i7) {
                            o0OOO00 o0ooo004 = o0ooo003.iilLil1i11I1;
                            i4 = o0ooo004.i1LIL11l;
                            byte[] bArr2 = o0ooo004.iiI1L1iI;
                            i3 = o0ooo004.illlI1lLIL;
                            if (o0ooo004 != o0ooo002) {
                                byte[] bArr3 = bArr2;
                                o0ooo00 = o0ooo004;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                o0ooo00 = null;
                            }
                        } else {
                            o0ooo00 = o0ooo003;
                            i3 = i7;
                            i4 = i15;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            o0ooo003 = o0ooo00;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        o0ooo003 = o0ooo00;
                        i12 = i16;
                    }
                } else {
                    int i17 = i6 + 1;
                    byte b = bArr[i6] & i1IL1lILl1L1I.iiI1L1iI;
                    int i18 = i12 + i11;
                    while (i12 != i18) {
                        if (b == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                o0ooo003 = o0ooo003.iilLil1i11I1;
                                i2 = o0ooo003.i1LIL11l;
                                bArr = o0ooo003.iiI1L1iI;
                                i7 = o0ooo003.illlI1lLIL;
                                if (o0ooo003 == o0ooo002) {
                                    o0ooo003 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            if (z) {
                return i5;
            }
            return i9;
        } else if (z) {
            return -2;
        } else {
            return o00oo0oo2.indexOf(ili11iILI1l.iiIliillii);
        }
    }

    public long iiLIIiIli(ili11iILI1l ili11iili1l, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            if (o0ooo00 == null) {
                return -1;
            }
            long j3 = this.illlI1lLIL;
            if (j3 - j < j) {
                while (j3 > j) {
                    o0ooo00 = o0ooo00.I11lLL1;
                    j3 -= (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                }
            } else {
                while (true) {
                    long j4 = ((long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    o0ooo00 = o0ooo00.iilLil1i11I1;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (ili11iili1l.illiiliIILI() == 2) {
                byte i1L1lLllLLlIi = ili11iili1l.i1L1lLllLLlIi(0);
                byte i1L1lLllLLlIi2 = ili11iili1l.i1L1lLllLLlIi(1);
                while (j3 < this.illlI1lLIL) {
                    byte[] bArr = o0ooo00.iiI1L1iI;
                    i = (int) ((((long) o0ooo00.i1LIL11l) + j) - j3);
                    int i3 = o0ooo00.illlI1lLIL;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == i1L1lLllLLlIi || b == i1L1lLllLLlIi2) {
                            i2 = o0ooo00.i1LIL11l;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                    o0ooo00 = o0ooo00.iilLil1i11I1;
                    j = j3;
                }
                return -1;
            }
            byte[] i11liIIl11Ii1 = ili11iili1l.i11liIIl11Ii1();
            while (j3 < this.illlI1lLIL) {
                byte[] bArr2 = o0ooo00.iiI1L1iI;
                int i4 = (int) ((((long) o0ooo00.i1LIL11l) + j) - j3);
                int i5 = o0ooo00.illlI1lLIL;
                while (i < i5) {
                    byte b2 = bArr2[i];
                    int length = i11liIIl11Ii1.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b2 == i11liIIl11Ii1[i6]) {
                            i2 = o0ooo00.i1LIL11l;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j3 += (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                o0ooo00 = o0ooo00.iilLil1i11I1;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final IiILIlLLiIL iiLl11ILL(OutputStream outputStream) throws IOException {
        return IL11lll11(outputStream, 0, this.illlI1lLIL);
    }

    public long iiiiI1iILL11I(ili11iILI1l ili11iili1l, long j) throws IOException {
        byte[] bArr;
        if (ili11iili1l.illiiliIILI() != 0) {
            long j2 = 0;
            if (j >= 0) {
                o0OOO00 o0ooo00 = this.i1LIL11l;
                long j3 = -1;
                if (o0ooo00 == null) {
                    return -1;
                }
                long j4 = this.illlI1lLIL;
                if (j4 - j < j) {
                    while (j4 > j) {
                        o0ooo00 = o0ooo00.I11lLL1;
                        j4 -= (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        o0ooo00 = o0ooo00.iilLil1i11I1;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte i1L1lLllLLlIi = ili11iili1l.i1L1lLllLLlIi(0);
                int illiiliIILI = ili11iili1l.illiiliIILI();
                long j6 = 1 + (this.illlI1lLIL - ((long) illiiliIILI));
                long j7 = j;
                o0OOO00 o0ooo002 = o0ooo00;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = o0ooo002.iiI1L1iI;
                    int min = (int) Math.min((long) o0ooo002.illlI1lLIL, (((long) o0ooo002.i1LIL11l) + j6) - j8);
                    int i = (int) ((((long) o0ooo002.i1LIL11l) + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == i1L1lLllLLlIi) {
                            bArr = bArr2;
                            if (IIlLLll1ll1(o0ooo002, i + 1, ili11iili1l, 1, illiiliIILI)) {
                                return ((long) (i - o0ooo002.i1LIL11l)) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += (long) (o0ooo002.illlI1lLIL - o0ooo002.i1LIL11l);
                    o0ooo002 = o0ooo002.iilLil1i11I1;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    /* renamed from: iil1ILLLi11 */
    public IiILIlLLiIL IillLillLLIii(int i) {
        o0OOO00 iiIiili = iiIiili(1);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i2 = iiIiili.illlI1lLIL;
        iiIiili.illlI1lLIL = i2 + 1;
        bArr[i2] = (byte) i;
        this.illlI1lLIL++;
        return this;
    }

    public int iilLiIIIi11i() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.illlI1lLIL != 0) {
            byte ilLIlLiIILl1 = ilLIlLiIILl1(0);
            int i2 = 1;
            if ((ilLIlLiIILl1 & 128) == 0) {
                b2 = ilLIlLiIILl1 & C0310o0O0o0O.i1LIL11l;
                i = 1;
                b = 0;
            } else if ((ilLIlLiIILl1 & 224) == 192) {
                b2 = ilLIlLiIILl1 & 31;
                i = 2;
                b = 128;
            } else if ((ilLIlLiIILl1 & 240) == 224) {
                b2 = ilLIlLiIILl1 & 15;
                i = 3;
                b = 2048;
            } else if ((ilLIlLiIILl1 & 248) == 240) {
                b2 = ilLIlLiIILl1 & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return iiIliillii;
            }
            long j = (long) i;
            if (this.illlI1lLIL >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte ilLIlLiIILl12 = ilLIlLiIILl1(j2);
                    if ((ilLIlLiIILl12 & 192) == 128) {
                        b2 = (b2 << 6) | (ilLIlLiIILl12 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return iiIliillii;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return iiIliillii;
                }
                if ((b2 < 55296 || b2 > 57343) && b2 >= b) {
                    return b2;
                }
                return iiIliillii;
            }
            throw new EOFException("size < " + i + ": " + this.illlI1lLIL + " (to read code point prefixed 0x" + Integer.toHexString(ilLIlLiIILl1) + ")");
        }
        throw new EOFException();
    }

    public final ili11iILI1l iillllIL(int i) {
        if (i == 0) {
            return ili11iILI1l.iiIliillii;
        }
        return new o0OOO0(this, i);
    }

    public final ili11iILI1l il11iII1() {
        return iIiL11iL("SHA-256");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.illi1IL1());
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b A[EDGE_INSN: B:47:0x009b->B:29:0x009b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long il1l1IlL() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.illlI1lLIL
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00ba
            r1 = 0
            r5 = -7
            r6 = r5
            r2 = 0
            r4 = r3
            r3 = 0
        L_0x0011:
            top.tntok.autobot.o0OOO00 r8 = r0.i1LIL11l
            byte[] r9 = r8.iiI1L1iI
            int r10 = r8.i1LIL11l
            int r11 = r8.illlI1lLIL
        L_0x0019:
            if (r10 >= r11) goto L_0x009b
            byte r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L_0x006c
            r13 = 57
            if (r12 > r13) goto L_0x006c
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            if (r16 != 0) goto L_0x0038
            long r14 = (long) r13
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r14 = 10
            long r4 = r4 * r14
            long r12 = (long) r13
            long r4 = r4 + r12
            goto L_0x0077
        L_0x003f:
            top.tntok.autobot.IiILIlLLiIL r1 = new top.tntok.autobot.IiILIlLLiIL
            r1.<init>()
            top.tntok.autobot.IiILIlLLiIL r1 = r1.IIllllLiIlIl(r4)
            top.tntok.autobot.IiILIlLLiIL r1 = r1.IillLillLLIii(r12)
            if (r2 != 0) goto L_0x0051
            r1.readByte()
        L_0x0051:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.illi1IL1()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006c:
            r13 = 45
            r14 = 1
            if (r12 != r13) goto L_0x007c
            if (r1 != 0) goto L_0x007c
            r12 = 1
            long r6 = r6 - r12
            r2 = 1
        L_0x0077:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L_0x0019
        L_0x007c:
            if (r1 == 0) goto L_0x0080
            r3 = 1
            goto L_0x009b
        L_0x0080:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009b:
            if (r10 != r11) goto L_0x00a7
            top.tntok.autobot.o0OOO00 r9 = r8.i1LIL11l()
            r0.i1LIL11l = r9
            top.tntok.autobot.o0OOO00o.iiI1L1iI(r8)
            goto L_0x00a9
        L_0x00a7:
            r8.i1LIL11l = r10
        L_0x00a9:
            if (r3 != 0) goto L_0x00af
            top.tntok.autobot.o0OOO00 r8 = r0.i1LIL11l
            if (r8 != 0) goto L_0x0011
        L_0x00af:
            long r6 = r0.illlI1lLIL
            long r8 = (long) r1
            long r6 = r6 - r8
            r0.illlI1lLIL = r6
            if (r2 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            long r4 = -r4
        L_0x00b9:
            return r4
        L_0x00ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IiILIlLLiIL.il1l1IlL():long");
    }

    /* renamed from: ilIILlI1l11i */
    public IiILIlLLiIL clone() {
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        if (this.illlI1lLIL == 0) {
            return iiILIlLLiIL;
        }
        o0OOO00 il1LilLllii2 = this.i1LIL11l.il1LilLllii();
        iiILIlLLiIL.i1LIL11l = il1LilLllii2;
        il1LilLllii2.I11lLL1 = il1LilLllii2;
        il1LilLllii2.iilLil1i11I1 = il1LilLllii2;
        o0OOO00 o0ooo00 = this.i1LIL11l;
        while (true) {
            o0ooo00 = o0ooo00.iilLil1i11I1;
            if (o0ooo00 != this.i1LIL11l) {
                iiILIlLLiIL.i1LIL11l.I11lLL1.illlI1lLIL(o0ooo00.il1LilLllii());
            } else {
                iiILIlLLiIL.illlI1lLIL = this.illlI1lLIL;
                return iiILIlLLiIL;
            }
        }
    }

    public final byte ilLIlLiIILl1(long j) {
        int i;
        C0485o0Ooooo.i1LIL11l(this.illlI1lLIL, j, 1);
        long j2 = this.illlI1lLIL;
        if (j2 - j > j) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            while (true) {
                int i2 = o0ooo00.illlI1lLIL;
                int i3 = o0ooo00.i1LIL11l;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return o0ooo00.iiI1L1iI[i3 + ((int) j)];
                }
                j -= j3;
                o0ooo00 = o0ooo00.iilLil1i11I1;
            }
        } else {
            long j4 = j - j2;
            o0OOO00 o0ooo002 = this.i1LIL11l;
            do {
                o0ooo002 = o0ooo002.I11lLL1;
                int i4 = o0ooo002.illlI1lLIL;
                i = o0ooo002.i1LIL11l;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return o0ooo002.iiI1L1iI[i + ((int) j4)];
        }
    }

    public final ili11iILI1l ilLilIL() {
        return iIiL11iL("MD5");
    }

    /* renamed from: ili11iILI1l */
    public IiILIlLLiIL iLiI1Llil(int i) {
        if (i < 128) {
            IillLillLLIii(i);
        } else if (i < 2048) {
            IillLillLLIii((i >> 6) | 192);
            IillLillLLIii((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                IillLillLLIii((i >> 12) | 224);
                IillLillLLIii(((i >> 6) & 63) | 128);
                IillLillLLIii((i & 63) | 128);
            } else {
                IillLillLLIii(63);
            }
        } else if (i <= 1114111) {
            IillLillLLIii((i >> 18) | 240);
            IillLillLLIii(((i >> 12) & 63) | 128);
            IillLillLLIii(((i >> 6) & 63) | 128);
            IillLillLLIii((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public final ili11iILI1l iliiI1Ii1iIl() {
        return iIiL11iL("SHA-512");
    }

    /* renamed from: iliiLi1I */
    public IiILIlLLiIL iilLil1i11I1(int i) {
        o0OOO00 iiIiili = iiIiili(4);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i2 = iiIiili.illlI1lLIL;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        iiIiili.illlI1lLIL = i2 + 4;
        this.illlI1lLIL += 4;
        return this;
    }

    /* renamed from: iliilLIIilill */
    public IiILIlLLiIL IL111l1(long j) {
        if (j == 0) {
            return IillLillLLIii(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o0OOO00 iiIiili = iiIiili(numberOfTrailingZeros);
        byte[] bArr = iiIiili.iiI1L1iI;
        int i = iiIiili.illlI1lLIL;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = il1LilLllii[(int) (15 & j)];
            j >>>= 4;
        }
        iiIiili.illlI1lLIL += numberOfTrailingZeros;
        this.illlI1lLIL += (long) numberOfTrailingZeros;
        return this;
    }

    public ili11iILI1l iliilLllIl1(long j) throws EOFException {
        return new ili11iILI1l(i1i1111LLILli(j));
    }

    public String illi1IL1() {
        try {
            return IiIIlIL(this.illlI1lLIL, C0485o0Ooooo.iiI1L1iI);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public long illi1LIILLiL(C0361o0OOOo0 o0oooo0) throws IOException {
        long j = this.illlI1lLIL;
        if (j > 0) {
            o0oooo0.I1iIiIi(this, j);
        }
        return j;
    }

    public boolean isOpen() {
        return true;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public byte readByte() {
        long j = this.illlI1lLIL;
        if (j != 0) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            int i = o0ooo00.i1LIL11l;
            int i2 = o0ooo00.illlI1lLIL;
            int i3 = i + 1;
            byte b = o0ooo00.iiI1L1iI[i];
            this.illlI1lLIL = j - 1;
            if (i3 == i2) {
                this.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            } else {
                o0ooo00.i1LIL11l = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.illlI1lLIL;
        if (j >= 4) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            int i = o0ooo00.i1LIL11l;
            int i2 = o0ooo00.illlI1lLIL;
            if (i2 - i < 4) {
                return ((readByte() & i1IL1lILl1L1I.iiI1L1iI) << 24) | ((readByte() & i1IL1lILl1L1I.iiI1L1iI) << 16) | ((readByte() & i1IL1lILl1L1I.iiI1L1iI) << 8) | (readByte() & i1IL1lILl1L1I.iiI1L1iI);
            }
            byte[] bArr = o0ooo00.iiI1L1iI;
            byte b = ((bArr[i + 1] & i1IL1lILl1L1I.iiI1L1iI) << 16) | ((bArr[i] & i1IL1lILl1L1I.iiI1L1iI) << 24);
            int i3 = i + 3;
            int i4 = i + 4;
            byte b2 = (bArr[i3] & i1IL1lILl1L1I.iiI1L1iI) | b | ((bArr[i + 2] & i1IL1lILl1L1I.iiI1L1iI) << 8);
            this.illlI1lLIL = j - 4;
            if (i4 == i2) {
                this.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            } else {
                o0ooo00.i1LIL11l = i4;
            }
            return b2;
        }
        throw new IllegalStateException("size < 4: " + this.illlI1lLIL);
    }

    public long readLong() {
        long j = this.illlI1lLIL;
        if (j >= 8) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            int i = o0ooo00.i1LIL11l;
            int i2 = o0ooo00.illlI1lLIL;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = o0ooo00.iiI1L1iI;
            long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24);
            int i3 = i + 7;
            int i4 = i + 8;
            long j3 = j2 | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i3]) & 255);
            this.illlI1lLIL = j - 8;
            if (i4 == i2) {
                this.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            } else {
                o0ooo00.i1LIL11l = i4;
            }
            return j3;
        }
        throw new IllegalStateException("size < 8: " + this.illlI1lLIL);
    }

    public short readShort() {
        long j = this.illlI1lLIL;
        if (j >= 2) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            int i = o0ooo00.i1LIL11l;
            int i2 = o0ooo00.illlI1lLIL;
            if (i2 - i < 2) {
                return (short) (((readByte() & i1IL1lILl1L1I.iiI1L1iI) << 8) | (readByte() & i1IL1lILl1L1I.iiI1L1iI));
            }
            byte[] bArr = o0ooo00.iiI1L1iI;
            int i3 = i + 1;
            int i4 = i + 2;
            byte b = (bArr[i3] & i1IL1lILl1L1I.iiI1L1iI) | ((bArr[i] & i1IL1lILl1L1I.iiI1L1iI) << 8);
            this.illlI1lLIL = j - 2;
            if (i4 == i2) {
                this.i1LIL11l = o0ooo00.i1LIL11l();
                o0OOO00o.iiI1L1iI(o0ooo00);
            } else {
                o0ooo00.i1LIL11l = i4;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.illlI1lLIL);
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            o0OOO00 o0ooo00 = this.i1LIL11l;
            if (o0ooo00 != null) {
                int min = (int) Math.min(j, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
                long j2 = (long) min;
                this.illlI1lLIL -= j2;
                j -= j2;
                o0OOO00 o0ooo002 = this.i1LIL11l;
                int i = o0ooo002.i1LIL11l + min;
                o0ooo002.i1LIL11l = i;
                if (i == o0ooo002.illlI1lLIL) {
                    this.i1LIL11l = o0ooo002.i1LIL11l();
                    o0OOO00o.iiI1L1iI(o0ooo002);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C0446o0OoOOOo timeout() {
        return C0446o0OoOOOo.il1LilLllii;
    }

    public String toString() {
        return iILil1IilI1l().toString();
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                o0OOO00 iiIiili = iiIiili(1);
                int min = Math.min(i, 8192 - iiIiili.illlI1lLIL);
                byteBuffer.get(iiIiili.iiI1L1iI, iiIiili.illlI1lLIL, min);
                i -= min;
                iiIiili.illlI1lLIL += min;
            }
            this.illlI1lLIL += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int read(byte[] bArr, int i, int i2) {
        C0485o0Ooooo.i1LIL11l((long) bArr.length, (long) i, (long) i2);
        o0OOO00 o0ooo00 = this.i1LIL11l;
        if (o0ooo00 == null) {
            return -1;
        }
        int min = Math.min(i2, o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
        System.arraycopy(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, bArr, i, min);
        int i3 = o0ooo00.i1LIL11l + min;
        o0ooo00.i1LIL11l = i3;
        this.illlI1lLIL -= (long) min;
        if (i3 == o0ooo00.illlI1lLIL) {
            this.i1LIL11l = o0ooo00.i1LIL11l();
            o0OOO00o.iiI1L1iI(o0ooo00);
        }
        return min;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        o0OOO00 o0ooo00 = this.i1LIL11l;
        if (o0ooo00 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
        byteBuffer.put(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
        int i = o0ooo00.i1LIL11l + min;
        o0ooo00.i1LIL11l = i;
        this.illlI1lLIL -= (long) min;
        if (i == o0ooo00.illlI1lLIL) {
            this.i1LIL11l = o0ooo00.i1LIL11l();
            o0OOO00o.iiI1L1iI(o0ooo00);
        }
        return min;
    }

    /* renamed from: I1IILIil1lLlL */
    public IiILIlLLiIL IIlL1llI1() {
        return this;
    }

    public Iiii1LiI11i I1LiliILi1lI1() {
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public IiILIlLLiIL iLlIllll() {
        return this;
    }

    public IiILIlLLiIL illlI1lLIL() {
        return this;
    }
}
