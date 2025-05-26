package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: top.tntok.autobot.o000Oo00  reason: case insensitive filesystem */
public final class C0083o000Oo00 implements C0370o0OOOooO {
    public static final byte I11lLL1 = 1;
    public static final byte I1iIiIi = 2;
    public static final byte IiIIlIL = 3;
    public static final byte IiiL1llIIi = 0;
    public static final byte i1L1lLllLLlIi = 3;
    public static final byte iILiI1lll = 1;
    public static final byte iLLLILIiLi1Ii = 2;
    public static final byte iilLiIIIi11i = 4;
    public int i1LIL11l = 0;
    public final C0137o00O0oo0 iiIliillii;
    public final CRC32 iilLil1i11I1 = new CRC32();
    public final Inflater il1LilLllii;
    public final ILL1iL1LiiI illlI1lLIL;

    public C0083o000Oo00(C0370o0OOOooO o0oooooo) {
        if (o0oooooo != null) {
            Inflater inflater = new Inflater(true);
            this.il1LilLllii = inflater;
            ILL1iL1LiiI il1LilLllii2 = C0249o00oo00O.il1LilLllii(o0oooooo);
            this.illlI1lLIL = il1LilLllii2;
            this.iiIliillii = new C0137o00O0oo0(il1LilLllii2, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0;
        } else {
            if (this.i1LIL11l == 0) {
                i1LIL11l();
                this.i1LIL11l = 1;
            }
            if (this.i1LIL11l == 1) {
                long j2 = iiILIlLLiIL.illlI1lLIL;
                long IIlllIIi1ii = this.iiIliillii.IIlllIIi1ii(iiILIlLLiIL, j);
                if (IIlllIIi1ii != -1) {
                    i111iLiiIIill(iiILIlLLiIL, j2, IIlllIIi1ii);
                    return IIlllIIi1ii;
                }
                this.i1LIL11l = 2;
            }
            if (this.i1LIL11l == 2) {
                il1LilLllii();
                this.i1LIL11l = 3;
                if (!this.illlI1lLIL.Il1llillili()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.iiIliillii.close();
    }

    public final void i111iLiiIIill(IiILIlLLiIL iiILIlLLiIL, long j, long j2) {
        o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
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
            this.iilLil1i11I1.update(o0ooo00.iiI1L1iI, i3, min);
            j2 -= (long) min;
            o0ooo00 = o0ooo00.iilLil1i11I1;
            j = 0;
        }
    }

    public final void i1LIL11l() throws IOException {
        boolean z;
        this.illlI1lLIL.IIIlll1lll(10);
        byte ilLIlLiIILl1 = this.illlI1lLIL.illlI1lLIL().ilLIlLiIILl1(3);
        if (((ilLIlLiIILl1 >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i111iLiiIIill(this.illlI1lLIL.illlI1lLIL(), 0, 10);
        }
        iiI1L1iI("ID1ID2", 8075, this.illlI1lLIL.readShort());
        this.illlI1lLIL.skip(8);
        if (((ilLIlLiIILl1 >> 2) & 1) == 1) {
            this.illlI1lLIL.IIIlll1lll(2);
            if (z) {
                i111iLiiIIill(this.illlI1lLIL.illlI1lLIL(), 0, 2);
            }
            long IilL11ii1I1Il = (long) this.illlI1lLIL.illlI1lLIL().IilL11ii1I1Il();
            this.illlI1lLIL.IIIlll1lll(IilL11ii1I1Il);
            if (z) {
                i111iLiiIIill(this.illlI1lLIL.illlI1lLIL(), 0, IilL11ii1I1Il);
            }
            this.illlI1lLIL.skip(IilL11ii1I1Il);
        }
        if (((ilLIlLiIILl1 >> 3) & 1) == 1) {
            long iLILliI1 = this.illlI1lLIL.iLILliI1((byte) 0);
            if (iLILliI1 != -1) {
                if (z) {
                    i111iLiiIIill(this.illlI1lLIL.illlI1lLIL(), 0, iLILliI1 + 1);
                }
                this.illlI1lLIL.skip(iLILliI1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((ilLIlLiIILl1 >> 4) & 1) == 1) {
            long iLILliI12 = this.illlI1lLIL.iLILliI1((byte) 0);
            if (iLILliI12 != -1) {
                if (z) {
                    i111iLiiIIill(this.illlI1lLIL.illlI1lLIL(), 0, iLILliI12 + 1);
                }
                this.illlI1lLIL.skip(iLILliI12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            iiI1L1iI("FHCRC", this.illlI1lLIL.IilL11ii1I1Il(), (short) ((int) this.iilLil1i11I1.getValue()));
            this.iilLil1i11I1.reset();
        }
    }

    public final void iiI1L1iI(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public final void il1LilLllii() throws IOException {
        iiI1L1iI("CRC", this.illlI1lLIL.ILllI11(), (int) this.iilLil1i11I1.getValue());
        iiI1L1iI("ISIZE", this.illlI1lLIL.ILllI11(), (int) this.il1LilLllii.getBytesWritten());
    }

    public C0446o0OoOOOo timeout() {
        return this.illlI1lLIL.timeout();
    }
}
