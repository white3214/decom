package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class i1LlL1iILLLil extends oo0OOoo {
    public static final Comparator<Ii1lLiiIli> iilLiIIIi11i = new I11iLiiIi();
    public int I11lLL1;
    public boolean IiIIlIL;
    public final boolean i1LIL11l;
    public int iLLLILIiLi1Ii;
    public int[] iiIliillii;
    public int iilLil1i11I1;
    public Ii1lLiiIli il1LilLllii;
    public final List<Ii1lLiiIli> illlI1lLIL;

    public i1LlL1iILLLil(InputStream inputStream) {
        this(inputStream, false, Ii1lLiiIli.i1LIL11l);
    }

    public Ii1lLiiIli I1LiILiLLIl1l() throws IOException {
        if (this.iiIliillii == null) {
            this.iilLil1i11I1 = 0;
            this.iiIliillii = new int[this.illlI1lLIL.get(0).il1LilLllii()];
            int i = 0;
            while (true) {
                int[] iArr = this.iiIliillii;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = this.in.read();
                this.iilLil1i11I1++;
                if (this.iiIliillii[i] < 0) {
                    break;
                }
                i++;
            }
            Ii1lLiiIli IiIl11II = IiIl11II();
            this.il1LilLllii = IiIl11II;
            if (IiIl11II != null && !this.i1LIL11l) {
                if (IiIl11II.il1LilLllii() < this.iiIliillii.length) {
                    this.I11lLL1 = this.il1LilLllii.il1LilLllii();
                } else {
                    this.iilLil1i11I1 = 0;
                }
            }
        }
        return this.il1LilLllii;
    }

    public boolean IIL1Ll1I111() throws IOException {
        if (I1LiILiLLIl1l() != null) {
            return true;
        }
        return false;
    }

    public final int IL11lll11() throws IOException {
        I1LiILiLLIl1l();
        int i = this.I11lLL1;
        if (i >= this.iilLil1i11I1) {
            return -1;
        }
        int[] iArr = this.iiIliillii;
        this.I11lLL1 = i + 1;
        return iArr[i];
    }

    public final Ii1lLiiIli IiIl11II() {
        for (Ii1lLiiIli next : this.illlI1lLIL) {
            if (iiLl11ILL(next)) {
                return next;
            }
        }
        return null;
    }

    public final boolean iiLl11ILL(Ii1lLiiIli ii1lLiiIli) {
        for (int i = 0; i < ii1lLiiIli.il1LilLllii(); i++) {
            if (ii1lLiiIli.iiI1L1iI(i) != this.iiIliillii[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean ilIILlI1l11i(Ii1lLiiIli ii1lLiiIli) throws IOException {
        if (this.illlI1lLIL.contains(ii1lLiiIli)) {
            I1LiILiLLIl1l();
            Ii1lLiiIli ii1lLiiIli2 = this.il1LilLllii;
            if (ii1lLiiIli2 == null || !ii1lLiiIli2.equals(ii1lLiiIli)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Stream not configure to detect " + ii1lLiiIli);
    }

    public String ilLIlL1ILi() throws IOException {
        I1LiILiLLIl1l();
        Ii1lLiiIli ii1lLiiIli = this.il1LilLllii;
        if (ii1lLiiIli == null) {
            return null;
        }
        return ii1lLiiIli.illlI1lLIL();
    }

    public synchronized void mark(int i) {
        boolean z;
        this.iLLLILIiLi1Ii = this.I11lLL1;
        if (this.iiIliillii == null) {
            z = true;
        } else {
            z = false;
        }
        this.IiIIlIL = z;
        this.in.mark(i);
    }

    public int read() throws IOException {
        int IL11lll11 = IL11lll11();
        return IL11lll11 >= 0 ? IL11lll11 : this.in.read();
    }

    public synchronized void reset() throws IOException {
        try {
            this.I11lLL1 = this.iLLLILIiLi1Ii;
            if (this.IiIIlIL) {
                this.iiIliillii = null;
            }
            this.in.reset();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        int i = 0;
        while (true) {
            j2 = (long) i;
            if (j > j2 && IL11lll11() >= 0) {
                i++;
            }
        }
        return this.in.skip(j - j2) + j2;
    }

    public i1LlL1iILLLil(InputStream inputStream, boolean z) {
        this(inputStream, z, Ii1lLiiIli.i1LIL11l);
    }

    public i1LlL1iILLLil(InputStream inputStream, Ii1lLiiIli... ii1lLiiIliArr) {
        this(inputStream, false, ii1lLiiIliArr);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0 && i3 >= 0) {
            i3 = IL11lll11();
            if (i3 >= 0) {
                bArr[i] = (byte) (i3 & 255);
                i2--;
                i4++;
                i++;
            }
        }
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            return i4 + read;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    public i1LlL1iILLLil(InputStream inputStream, boolean z, Ii1lLiiIli... ii1lLiiIliArr) {
        super(inputStream);
        if (C0130o00O0o00.Il1llillili(ii1lLiiIliArr) != 0) {
            this.i1LIL11l = z;
            List<Ii1lLiiIli> asList = Arrays.asList(ii1lLiiIliArr);
            asList.sort(iilLiIIIi11i);
            this.illlI1lLIL = asList;
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
