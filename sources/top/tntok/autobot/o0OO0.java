package top.tntok.autobot;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class o0OO0 implements Closeable {
    public static final int I1iIiIi = 8192;
    public static final String iILiI1lll = "";
    public final byte[][] I11lLL1;
    public final int IiIIlIL;
    public boolean IiiL1llIIi;
    public final int i1LIL11l;
    public final int iLLLILIiLi1Ii;
    public final long iiIliillii;
    public i1LIL11l iilLiIIIi11i;
    public final long iilLil1i11I1;
    public final SeekableByteChannel il1LilLllii;
    public final Charset illlI1lLIL;

    public class i1LIL11l {
        public final byte[] i1LIL11l;
        public final long iiI1L1iI;
        public int il1LilLllii;
        public byte[] illlI1lLIL;

        public final String iiIliillii() throws IOException {
            boolean z;
            String str;
            byte[] bArr;
            if (this.iiI1L1iI == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.il1LilLllii;
            while (true) {
                if (i > -1) {
                    if (!z && i < o0OO0.this.iLLLILIiLi1Ii) {
                        illlI1lLIL();
                        break;
                    }
                    int il1LilLllii2 = il1LilLllii(this.i1LIL11l, i);
                    if (il1LilLllii2 <= 0) {
                        i -= o0OO0.this.IiIIlIL;
                        if (i < 0) {
                            illlI1lLIL();
                            break;
                        }
                    } else {
                        int i2 = i + 1;
                        int i3 = (this.il1LilLllii - i2) + 1;
                        if (i3 >= 0) {
                            byte[] bArr2 = new byte[i3];
                            System.arraycopy(this.i1LIL11l, i2, bArr2, 0, i3);
                            str = new String(bArr2, o0OO0.this.illlI1lLIL);
                            this.il1LilLllii = i - il1LilLllii2;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (!z || (bArr = this.illlI1lLIL) == null) {
                return str;
            }
            String str2 = new String(bArr, o0OO0.this.illlI1lLIL);
            this.illlI1lLIL = null;
            return str2;
        }

        public final i1LIL11l iilLil1i11I1() throws IOException {
            if (this.il1LilLllii <= -1) {
                long j = this.iiI1L1iI;
                if (j > 1) {
                    o0OO0 o0oo0 = o0OO0.this;
                    return new i1LIL11l(j - 1, o0oo0.i1LIL11l, this.illlI1lLIL);
                } else if (this.illlI1lLIL == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.illlI1lLIL, o0OO0.this.illlI1lLIL));
                }
            } else {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.il1LilLllii);
            }
        }

        public final int il1LilLllii(byte[] bArr, int i) {
            boolean z;
            for (byte[] bArr2 : o0OO0.this.I11lLL1) {
                boolean z2 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr2.length - 1);
                    if (length2 < 0 || bArr[length2] != bArr2[length]) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 &= z;
                }
                if (z2) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        public final void illlI1lLIL() {
            int i = this.il1LilLllii + 1;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.illlI1lLIL = bArr;
                System.arraycopy(this.i1LIL11l, 0, bArr, 0, i);
            } else {
                this.illlI1lLIL = null;
            }
            this.il1LilLllii = -1;
        }

        public i1LIL11l(long j, int i, byte[] bArr) throws IOException {
            this.iiI1L1iI = j;
            byte[] bArr2 = new byte[((bArr != null ? bArr.length : 0) + i)];
            this.i1LIL11l = bArr2;
            long iiI1L1iI2 = (j - 1) * ((long) o0OO0.this.i1LIL11l);
            if (j > 0) {
                SeekableByteChannel unused = o0OO0.this.il1LilLllii.position(iiI1L1iI2);
                if (o0OO0.this.il1LilLllii.read(ByteBuffer.wrap(bArr2, 0, i)) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.il1LilLllii = bArr2.length - 1;
            this.illlI1lLIL = null;
        }
    }

    @Deprecated
    public o0OO0(File file) throws IOException {
        this(file, 8192, Charset.defaultCharset());
    }

    public List<String> IIL1Ll1I111(int i) throws IOException {
        if (i >= 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String ilLIlL1ILi = ilLIlL1ILi();
                if (ilLIlL1ILi == null) {
                    return arrayList;
                }
                arrayList.add(ilLIlL1ILi);
            }
            return arrayList;
        }
        throw new IllegalArgumentException("lineCount < 0");
    }

    public void close() throws IOException {
        this.il1LilLllii.close();
    }

    public String ilIILlI1l11i(int i) throws IOException {
        List<String> IIL1Ll1I111 = IIL1Ll1I111(i);
        Collections.reverse(IIL1Ll1I111);
        if (IIL1Ll1I111.isEmpty()) {
            return "";
        }
        return C0340o0OO00o.iiI1L1iI(System.lineSeparator(), IIL1Ll1I111) + System.lineSeparator();
    }

    public String ilLIlL1ILi() throws IOException {
        String iiI1L1iI2 = this.iilLiIIIi11i.iiIliillii();
        while (iiI1L1iI2 == null) {
            i1LIL11l i1LIL11l2 = this.iilLiIIIi11i.iilLil1i11I1();
            this.iilLiIIIi11i = i1LIL11l2;
            if (i1LIL11l2 == null) {
                break;
            }
            iiI1L1iI2 = i1LIL11l2.iiIliillii();
        }
        if (!"".equals(iiI1L1iI2) || this.IiiL1llIIi) {
            return iiI1L1iI2;
        }
        this.IiiL1llIIi = true;
        return ilLIlL1ILi();
    }

    public o0OO0(File file, Charset charset) throws IOException {
        this(file.toPath(), charset);
    }

    public o0OO0(File file, int i, Charset charset) throws IOException {
        this(file.toPath(), i, charset);
    }

    public o0OO0(File file, int i, String str) throws IOException {
        this(file.toPath(), i, str);
    }

    public o0OO0(Path path, Charset charset) throws IOException {
        this(path, 8192, charset);
    }

    public o0OO0(Path path, int i, Charset charset) throws IOException {
        int i2;
        this.i1LIL11l = i;
        Charset illlI1lLIL2 = iIiiLi1LllI.illlI1lLIL(charset);
        this.illlI1lLIL = illlI1lLIL2;
        if (illlI1lLIL2.newEncoder().maxBytesPerChar() == 1.0f) {
            this.IiIIlIL = 1;
        } else if (illlI1lLIL2 == StandardCharsets.UTF_8) {
            this.IiIIlIL = 1;
        } else if (illlI1lLIL2 == Charset.forName("Shift_JIS") || illlI1lLIL2 == Charset.forName("windows-31j") || illlI1lLIL2 == Charset.forName("x-windows-949") || illlI1lLIL2 == Charset.forName("gbk") || illlI1lLIL2 == Charset.forName("x-windows-950")) {
            this.IiIIlIL = 1;
        } else if (illlI1lLIL2 == StandardCharsets.UTF_16BE || illlI1lLIL2 == StandardCharsets.UTF_16LE) {
            this.IiIIlIL = 2;
        } else if (illlI1lLIL2 == StandardCharsets.UTF_16) {
            throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
        } else {
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        byte[][] bArr = {C0130o00O0o00.IiIIlIL.getBytes(illlI1lLIL2), C0130o00O0o00.iLLLILIiLi1Ii.getBytes(illlI1lLIL2), "\r".getBytes(illlI1lLIL2)};
        this.I11lLL1 = bArr;
        this.iLLLILIiLi1Ii = bArr[0].length;
        SeekableByteChannel iiI1L1iI2 = Files.newByteChannel(path, new OpenOption[]{StandardOpenOption.READ});
        this.il1LilLllii = iiI1L1iI2;
        long iiI1L1iI3 = iiI1L1iI2.size();
        this.iiIliillii = iiI1L1iI3;
        long j = (long) i;
        int i3 = (int) (iiI1L1iI3 % j);
        if (i3 > 0) {
            this.iilLil1i11I1 = (iiI1L1iI3 / j) + 1;
        } else {
            this.iilLil1i11I1 = iiI1L1iI3 / j;
            if (iiI1L1iI3 > 0) {
                i2 = i;
                this.iilLiIIIi11i = new i1LIL11l(this.iilLil1i11I1, i2, (byte[]) null);
            }
        }
        i2 = i3;
        this.iilLiIIIi11i = new i1LIL11l(this.iilLil1i11I1, i2, (byte[]) null);
    }

    public o0OO0(Path path, int i, String str) throws IOException {
        this(path, i, iIiiLi1LllI.i1LIL11l(str));
    }
}
