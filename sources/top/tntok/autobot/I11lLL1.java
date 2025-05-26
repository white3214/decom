package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class I11lLL1 extends OutputStream {
    public static final byte[] IiIIlIL = new byte[0];
    public static final int iLLLILIiLi1Ii = 1024;
    public boolean I11lLL1 = true;
    public final List<byte[]> i1LIL11l = new ArrayList();
    public byte[] iiIliillii;
    public int iilLil1i11I1;
    public int il1LilLllii;
    public int illlI1lLIL;

    @FunctionalInterface
    public interface iiI1L1iI<T extends InputStream> {
        T iiI1L1iI(byte[] bArr, int i, int i2);
    }

    public abstract void I1IILIil1lLlL(OutputStream outputStream) throws IOException;

    public byte[] I1LiILiLLIl1l() {
        int i = this.iilLil1i11I1;
        if (i == 0) {
            return IiIIlIL;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] next : this.i1LIL11l) {
            int min = Math.min(next.length, i);
            System.arraycopy(next, 0, bArr, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return bArr;
    }

    public String I1lLLLlliILlI(Charset charset) {
        return new String(IiIl11II(), charset);
    }

    public <T extends InputStream> InputStream IIL1Ll1I111(iiI1L1iI<T> iii1l1ii) {
        int i = this.iilLil1i11I1;
        if (i == 0) {
            return iLIllil1.i1LIL11l;
        }
        ArrayList arrayList = new ArrayList(this.i1LIL11l.size());
        for (byte[] next : this.i1LIL11l) {
            int min = Math.min(next.length, i);
            arrayList.add(iii1l1ii.iiI1L1iI(next, 0, min));
            i -= min;
            if (i == 0) {
                break;
            }
        }
        this.I11lLL1 = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public int IL11lll11(InputStream inputStream) throws IOException {
        int i = this.iilLil1i11I1 - this.il1LilLllii;
        byte[] bArr = this.iiIliillii;
        int read = inputStream.read(bArr, i, bArr.length - i);
        int i2 = 0;
        while (read != -1) {
            i2 += read;
            i += read;
            this.iilLil1i11I1 += read;
            byte[] bArr2 = this.iiIliillii;
            if (i == bArr2.length) {
                iiI1L1iI(bArr2.length);
                i = 0;
            }
            byte[] bArr3 = this.iiIliillii;
            read = inputStream.read(bArr3, i, bArr3.length - i);
        }
        return i2;
    }

    public abstract byte[] IiIl11II();

    public abstract int i111iLiiIIill();

    public abstract void i1LIL11l();

    public void iILlLIlli(int i) {
        int i2 = this.iilLil1i11I1;
        int i3 = i2 - this.il1LilLllii;
        if (i3 == this.iiIliillii.length) {
            iiI1L1iI(i2 + 1);
            i3 = 0;
        }
        this.iiIliillii[i3] = (byte) i;
        this.iilLil1i11I1++;
    }

    public void iIiL11iL(byte[] bArr, int i, int i2) {
        int i3 = this.iilLil1i11I1;
        int i4 = i3 + i2;
        int i5 = i3 - this.il1LilLllii;
        int i6 = i2;
        while (i6 > 0) {
            int min = Math.min(i6, this.iiIliillii.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.iiIliillii, i5, min);
            i6 -= min;
            if (i6 > 0) {
                iiI1L1iI(i4);
                i5 = 0;
            }
        }
        this.iilLil1i11I1 = i4;
    }

    public void iiI1L1iI(int i) {
        if (this.illlI1lLIL < this.i1LIL11l.size() - 1) {
            this.il1LilLllii += this.iiIliillii.length;
            int i2 = this.illlI1lLIL + 1;
            this.illlI1lLIL = i2;
            this.iiIliillii = this.i1LIL11l.get(i2);
            return;
        }
        byte[] bArr = this.iiIliillii;
        if (bArr == null) {
            this.il1LilLllii = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.il1LilLllii);
            this.il1LilLllii += this.iiIliillii.length;
        }
        this.illlI1lLIL++;
        byte[] bArr2 = new byte[i];
        this.iiIliillii = bArr2;
        this.i1LIL11l.add(bArr2);
    }

    public abstract int iiLl11ILL(InputStream inputStream) throws IOException;

    public void il1LilLllii() {
        this.iilLil1i11I1 = 0;
        this.il1LilLllii = 0;
        this.illlI1lLIL = 0;
        if (this.I11lLL1) {
            this.iiIliillii = this.i1LIL11l.get(0);
            return;
        }
        this.iiIliillii = null;
        int length = this.i1LIL11l.get(0).length;
        this.i1LIL11l.clear();
        iiI1L1iI(length);
        this.I11lLL1 = true;
    }

    public String ilIILlI1l11i(String str) throws UnsupportedEncodingException {
        return new String(IiIl11II(), str);
    }

    public abstract InputStream ilLIlL1ILi();

    public void ilLIlLiIILl1(OutputStream outputStream) throws IOException {
        int i = this.iilLil1i11I1;
        for (byte[] next : this.i1LIL11l) {
            int min = Math.min(next.length, i);
            outputStream.write(next, 0, min);
            i -= min;
            if (i == 0) {
                return;
            }
        }
    }

    @Deprecated
    public String toString() {
        return new String(IiIl11II(), Charset.defaultCharset());
    }

    public abstract void write(int i);

    public abstract void write(byte[] bArr, int i, int i2);

    public void close() throws IOException {
    }
}
