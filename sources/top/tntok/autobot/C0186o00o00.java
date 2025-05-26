package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import top.tntok.autobot.o0000;

/* renamed from: top.tntok.autobot.o00o00  reason: case insensitive filesystem */
public class C0186o00o00 {
    public static final byte I1iIiIi = 10;
    public static final byte[] I1l1iIll1lIi1 = {iILiI1lll, 10, i1L1lLllLLlIi, i1L1lLllLLlIi};
    public static final int IL1lILLLL1L = 10240;
    public static final byte[] Ii1liIIIiLi = {iILiI1lll, 10};
    public static final byte[] IilL11ii1I1Il = {i1L1lLllLLlIi, i1L1lLllLLlIi};
    public static final byte[] i111iLiiIIill = {iILiI1lll, 10, iILiI1lll, 10};
    public static final byte i1L1lLllLLlIi = 45;
    public static final byte iILiI1lll = 13;
    public static final int iL1LIlIlI = 4096;
    public final byte[] I11lLL1;
    public int IiIIlIL;
    public final il1LilLllii IiiL1llIIi;
    public int i1LIL11l;
    public int iLLLILIiLi1Ii;
    public final InputStream iiI1L1iI;
    public final int[] iiIliillii;
    public String iilLiIIIi11i;
    public final int iilLil1i11I1;
    public final byte[] il1LilLllii;
    public final int illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00o00$iiI1L1iI */
    public static class iiI1L1iI extends IOException {
        private static final long serialVersionUID = -161533165102632918L;

        public iiI1L1iI() {
        }

        public iiI1L1iI(String str) {
            super(str);
        }
    }

    /* renamed from: top.tntok.autobot.o00o00$il1LilLllii */
    public static class il1LilLllii {
        public final long i1LIL11l;
        public final C0298o0O0Oo0 iiI1L1iI;
        public int il1LilLllii;
        public long illlI1lLIL;

        public il1LilLllii(C0298o0O0Oo0 o0o0oo0, long j) {
            this.iiI1L1iI = o0o0oo0;
            this.i1LIL11l = j;
        }

        public void i1LIL11l() {
            this.il1LilLllii++;
            illlI1lLIL();
        }

        public void iiI1L1iI(int i) {
            this.illlI1lLIL += (long) i;
            illlI1lLIL();
        }

        public final void illlI1lLIL() {
            C0298o0O0Oo0 o0o0oo0 = this.iiI1L1iI;
            if (o0o0oo0 != null) {
                o0o0oo0.iiI1L1iI(this.illlI1lLIL, this.i1LIL11l, this.il1LilLllii);
            }
        }
    }

    /* renamed from: top.tntok.autobot.o00o00$illlI1lLIL */
    public static class illlI1lLIL extends IOException {
        private static final long serialVersionUID = 6466926458059796677L;

        public illlI1lLIL() {
        }

        public illlI1lLIL(String str) {
            super(str);
        }
    }

    @Deprecated
    public C0186o00o00() {
        this((InputStream) null, (byte[]) null, (il1LilLllii) null);
    }

    public static boolean IiiL1llIIi(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int iiIliillii(C0186o00o00 o00o00) {
        int i = o00o00.iLLLILIiLi1Ii;
        o00o00.iLLLILIiLi1Ii = i + 1;
        return i;
    }

    public int I1iIiIi() throws illlI1lLIL, IOException {
        return Ii1liIIIiLi((OutputStream) null);
    }

    public byte I1l1iIll1lIi1() throws IOException {
        if (this.iLLLILIiLi1Ii == this.IiIIlIL) {
            this.iLLLILIiLi1Ii = 0;
            int read = this.iiI1L1iI.read(this.I11lLL1, 0, this.iilLil1i11I1);
            this.IiIIlIL = read;
            if (read != -1) {
                il1LilLllii il1lillllii = this.IiiL1llIIi;
                if (il1lillllii != null) {
                    il1lillllii.iiI1L1iI(read);
                }
            } else {
                throw new IOException("No more data is available");
            }
        }
        byte[] bArr = this.I11lLL1;
        int i = this.iLLLILIiLi1Ii;
        this.iLLLILIiLi1Ii = i + 1;
        return bArr[i];
    }

    public int IL1lILLLL1L() {
        int i = this.iLLLILIiLi1Ii;
        int i2 = 0;
        while (i < this.IiIIlIL) {
            while (i2 >= 0 && this.I11lLL1[i] != this.il1LilLllii[i2]) {
                i2 = this.iiIliillii[i2];
            }
            i++;
            i2++;
            int i3 = this.i1LIL11l;
            if (i2 == i3) {
                return i - i3;
            }
        }
        return -1;
    }

    public void ILl1iII11Ll1(byte[] bArr) throws iiI1L1iI {
        int length = bArr.length;
        int i = this.i1LIL11l;
        byte[] bArr2 = I1l1iIll1lIi1;
        if (length == i - bArr2.length) {
            System.arraycopy(bArr, 0, this.il1LilLllii, bArr2.length, bArr.length);
            iILiI1lll();
            return;
        }
        throw new iiI1L1iI("The length of a boundary token cannot be changed");
    }

    public int Ii1liIIIiLi(OutputStream outputStream) throws illlI1lLIL, IOException {
        return (int) C0381o0OOo0oO.il1LilLllii(i111iLiiIIill(), outputStream, false);
    }

    public boolean IilL11ii1I1Il() throws C0061o0000Oo, illlI1lLIL {
        byte[] bArr = new byte[2];
        this.iLLLILIiLi1Ii += this.i1LIL11l;
        try {
            byte I1l1iIll1lIi12 = I1l1iIll1lIi1();
            bArr[0] = I1l1iIll1lIi12;
            if (I1l1iIll1lIi12 == 10) {
                return true;
            }
            bArr[1] = I1l1iIll1lIi1();
            if (IiiL1llIIi(bArr, IilL11ii1I1Il, 2)) {
                return false;
            }
            if (IiiL1llIIi(bArr, Ii1liIIIiLi, 2)) {
                return true;
            }
            throw new illlI1lLIL("Unexpected characters follow a boundary");
        } catch (C0061o0000Oo e) {
            throw e;
        } catch (IOException unused) {
            throw new illlI1lLIL("Stream ended unexpectedly");
        }
    }

    public i1LIL11l i111iLiiIIill() {
        return new i1LIL11l();
    }

    public boolean i11liIIl11Ii1() throws IOException {
        byte[] bArr = this.il1LilLllii;
        System.arraycopy(bArr, 2, bArr, 0, bArr.length - 2);
        this.i1LIL11l = this.il1LilLllii.length - 2;
        iILiI1lll();
        try {
            I1iIiIi();
            return IilL11ii1I1Il();
        } catch (illlI1lLIL unused) {
            return false;
        } finally {
            byte[] bArr2 = this.il1LilLllii;
            System.arraycopy(bArr2, 0, bArr2, 2, bArr2.length - 2);
            byte[] bArr3 = this.il1LilLllii;
            this.i1LIL11l = bArr3.length;
            bArr3[0] = iILiI1lll;
            bArr3[1] = 10;
            iILiI1lll();
        }
    }

    public int i1L1lLllLLlIi(byte b, int i) {
        while (i < this.IiIIlIL) {
            if (this.I11lLL1[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void i1iiLIil1ILi(String str) {
        this.iilLiIIIi11i = str;
    }

    public final void iILiI1lll() {
        int[] iArr = this.iiIliillii;
        iArr[0] = -1;
        iArr[1] = 0;
        int i = 2;
        int i2 = 0;
        while (i <= this.i1LIL11l) {
            byte[] bArr = this.il1LilLllii;
            if (bArr[i - 1] == bArr[i2]) {
                i2++;
                this.iiIliillii[i] = i2;
            } else if (i2 > 0) {
                i2 = this.iiIliillii[i2];
            } else {
                this.iiIliillii[i] = 0;
            }
            i++;
        }
    }

    public String iL1LIlIlI() {
        return this.iilLiIIIi11i;
    }

    public String iiLIIiIli() throws C0061o0000Oo, illlI1lLIL {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = i111iLiiIIill;
            if (i < bArr.length) {
                try {
                    byte I1l1iIll1lIi12 = I1l1iIll1lIi1();
                    i2++;
                    if (i2 <= 10240) {
                        if (I1l1iIll1lIi12 == bArr[i]) {
                            i++;
                        } else {
                            i = 0;
                        }
                        byteArrayOutputStream.write(I1l1iIll1lIi12);
                    } else {
                        throw new illlI1lLIL(String.format("Header section has more than %s bytes (maybe it is not properly terminated)", new Object[]{10240}));
                    }
                } catch (C0061o0000Oo e) {
                    throw e;
                } catch (IOException unused) {
                    throw new illlI1lLIL("Stream ended unexpectedly");
                }
            } else {
                String str = this.iilLiIIIi11i;
                if (str == null) {
                    return byteArrayOutputStream.toString();
                }
                try {
                    return byteArrayOutputStream.toString(str);
                } catch (UnsupportedEncodingException unused2) {
                    return byteArrayOutputStream.toString();
                }
            }
        }
    }

    @Deprecated
    public C0186o00o00(InputStream inputStream, byte[] bArr, int i) {
        this(inputStream, bArr, i, (il1LilLllii) null);
    }

    public C0186o00o00(InputStream inputStream, byte[] bArr, int i, il1LilLllii il1lillllii) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = I1l1iIll1lIi1;
            int length2 = length + bArr2.length;
            this.i1LIL11l = length2;
            if (i >= length2 + 1) {
                this.iiI1L1iI = inputStream;
                int max = Math.max(i, length2 * 2);
                this.iilLil1i11I1 = max;
                this.I11lLL1 = new byte[max];
                this.IiiL1llIIi = il1lillllii;
                int i2 = this.i1LIL11l;
                byte[] bArr3 = new byte[i2];
                this.il1LilLllii = bArr3;
                this.iiIliillii = new int[(i2 + 1)];
                this.illlI1lLIL = bArr3.length;
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, 0, bArr3, bArr2.length, bArr.length);
                iILiI1lll();
                this.iLLLILIiLi1Ii = 0;
                this.IiIIlIL = 0;
                return;
            }
            throw new IllegalArgumentException("The buffer size specified for the MultipartStream is too small");
        }
        throw new IllegalArgumentException("boundary may not be null");
    }

    /* renamed from: top.tntok.autobot.o00o00$i1LIL11l */
    public class i1LIL11l extends InputStream implements IlI1Ill1lIL1 {
        public static final int I11lLL1 = 256;
        public long i1LIL11l;
        public boolean iiIliillii;
        public int il1LilLllii;
        public int illlI1lLIL;

        public i1LIL11l() {
            il1LilLllii();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0091 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0068  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int IiIl11II() throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.il1LilLllii
                r1 = 0
                r2 = -1
                if (r0 == r2) goto L_0x0007
                return r1
            L_0x0007:
                long r3 = r7.i1LIL11l
                top.tntok.autobot.o00o00 r0 = top.tntok.autobot.C0186o00o00.this
                int r0 = r0.IiIIlIL
                top.tntok.autobot.o00o00 r5 = top.tntok.autobot.C0186o00o00.this
                int r5 = r5.iLLLILIiLi1Ii
                int r0 = r0 - r5
                int r5 = r7.illlI1lLIL
                int r0 = r0 - r5
                long r5 = (long) r0
                long r3 = r3 + r5
                r7.i1LIL11l = r3
                top.tntok.autobot.o00o00 r0 = top.tntok.autobot.C0186o00o00.this
                byte[] r0 = r0.I11lLL1
                top.tntok.autobot.o00o00 r3 = top.tntok.autobot.C0186o00o00.this
                int r3 = r3.IiIIlIL
                int r4 = r7.illlI1lLIL
                int r3 = r3 - r4
                top.tntok.autobot.o00o00 r4 = top.tntok.autobot.C0186o00o00.this
                byte[] r4 = r4.I11lLL1
                int r5 = r7.illlI1lLIL
                java.lang.System.arraycopy(r0, r3, r4, r1, r5)
                top.tntok.autobot.o00o00 r0 = top.tntok.autobot.C0186o00o00.this
                int unused = r0.iLLLILIiLi1Ii = r1
                top.tntok.autobot.o00o00 r0 = top.tntok.autobot.C0186o00o00.this
                int r1 = r7.illlI1lLIL
                int unused = r0.IiIIlIL = r1
            L_0x0043:
                top.tntok.autobot.o00o00 r0 = top.tntok.autobot.C0186o00o00.this
                java.io.InputStream r0 = r0.iiI1L1iI
                top.tntok.autobot.o00o00 r1 = top.tntok.autobot.C0186o00o00.this
                byte[] r1 = r1.I11lLL1
                top.tntok.autobot.o00o00 r3 = top.tntok.autobot.C0186o00o00.this
                int r3 = r3.IiIIlIL
                top.tntok.autobot.o00o00 r4 = top.tntok.autobot.C0186o00o00.this
                int r4 = r4.iilLil1i11I1
                top.tntok.autobot.o00o00 r5 = top.tntok.autobot.C0186o00o00.this
                int r5 = r5.IiIIlIL
                int r4 = r4 - r5
                int r0 = r0.read(r1, r3, r4)
                if (r0 == r2) goto L_0x0091
                top.tntok.autobot.o00o00 r1 = top.tntok.autobot.C0186o00o00.this
                top.tntok.autobot.o00o00$il1LilLllii r1 = r1.IiiL1llIIi
                if (r1 == 0) goto L_0x0079
                top.tntok.autobot.o00o00 r1 = top.tntok.autobot.C0186o00o00.this
                top.tntok.autobot.o00o00$il1LilLllii r1 = r1.IiiL1llIIi
                r1.iiI1L1iI(r0)
            L_0x0079:
                top.tntok.autobot.o00o00 r1 = top.tntok.autobot.C0186o00o00.this
                int r3 = r1.IiIIlIL
                int r3 = r3 + r0
                int unused = r1.IiIIlIL = r3
                r7.il1LilLllii()
                int r0 = r7.available()
                if (r0 > 0) goto L_0x0090
                int r1 = r7.il1LilLllii
                if (r1 == r2) goto L_0x0043
            L_0x0090:
                return r0
            L_0x0091:
                top.tntok.autobot.o00o00$illlI1lLIL r0 = new top.tntok.autobot.o00o00$illlI1lLIL
                java.lang.String r1 = "Stream ended unexpectedly"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0186o00o00.i1LIL11l.IiIl11II():int");
        }

        public int available() throws IOException {
            int illlI1lLIL2;
            int i = this.il1LilLllii;
            if (i == -1) {
                i = C0186o00o00.this.IiIIlIL - C0186o00o00.this.iLLLILIiLi1Ii;
                illlI1lLIL2 = this.illlI1lLIL;
            } else {
                illlI1lLIL2 = C0186o00o00.this.iLLLILIiLi1Ii;
            }
            return i - illlI1lLIL2;
        }

        public void close() throws IOException {
            i1LIL11l(false);
        }

        public long i111iLiiIIill() {
            return this.i1LIL11l;
        }

        public void i1LIL11l(boolean z) throws IOException {
            if (!this.iiIliillii) {
                if (!z) {
                    while (true) {
                        int available = available();
                        if (available == 0 && (available = IiIl11II()) == 0) {
                            break;
                        }
                        skip((long) available);
                    }
                } else {
                    this.iiIliillii = true;
                    C0186o00o00.this.iiI1L1iI.close();
                }
                this.iiIliillii = true;
            }
        }

        public boolean iiI1L1iI() {
            return this.iiIliillii;
        }

        public final void il1LilLllii() {
            int IL1lILLLL1L = C0186o00o00.this.IL1lILLLL1L();
            this.il1LilLllii = IL1lILLLL1L;
            if (IL1lILLLL1L != -1) {
                return;
            }
            if (C0186o00o00.this.IiIIlIL - C0186o00o00.this.iLLLILIiLi1Ii > C0186o00o00.this.illlI1lLIL) {
                this.illlI1lLIL = C0186o00o00.this.illlI1lLIL;
            } else {
                this.illlI1lLIL = C0186o00o00.this.IiIIlIL - C0186o00o00.this.iLLLILIiLi1Ii;
            }
        }

        public int read() throws IOException {
            if (this.iiIliillii) {
                throw new o0000.iiI1L1iI();
            } else if (available() == 0 && IiIl11II() == 0) {
                return -1;
            } else {
                this.i1LIL11l++;
                byte b = C0186o00o00.this.I11lLL1[C0186o00o00.iiIliillii(C0186o00o00.this)];
                return b >= 0 ? b : b + 256;
            }
        }

        public long skip(long j) throws IOException {
            if (!this.iiIliillii) {
                int available = available();
                if (available == 0 && (available = IiIl11II()) == 0) {
                    return 0;
                }
                long min = Math.min((long) available, j);
                C0186o00o00 o00o00 = C0186o00o00.this;
                int unused = o00o00.iLLLILIiLi1Ii = (int) (((long) o00o00.iLLLILIiLi1Ii) + min);
                return min;
            }
            throw new o0000.iiI1L1iI();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.iiIliillii) {
                throw new o0000.iiI1L1iI();
            } else if (i2 == 0) {
                return 0;
            } else {
                int available = available();
                if (available == 0 && (available = IiIl11II()) == 0) {
                    return -1;
                }
                int min = Math.min(available, i2);
                System.arraycopy(C0186o00o00.this.I11lLL1, C0186o00o00.this.iLLLILIiLi1Ii, bArr, i, min);
                C0186o00o00 o00o00 = C0186o00o00.this;
                int unused = o00o00.iLLLILIiLi1Ii = o00o00.iLLLILIiLi1Ii + min;
                this.i1LIL11l += (long) min;
                return min;
            }
        }
    }

    public C0186o00o00(InputStream inputStream, byte[] bArr, il1LilLllii il1lillllii) {
        this(inputStream, bArr, 4096, il1lillllii);
    }

    @Deprecated
    public C0186o00o00(InputStream inputStream, byte[] bArr) {
        this(inputStream, bArr, 4096, (il1LilLllii) null);
    }
}
