package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import top.tntok.autobot.C0096o000o00o;

/* renamed from: top.tntok.autobot.o000o0o  reason: case insensitive filesystem */
public final class C0101o000o0o implements Closeable {
    public static final Logger iLLLILIiLi1Ii = Logger.getLogger(C0098o000o0O0.class.getName());
    public final C0096o000o00o.i1LIL11l I11lLL1;
    public final Iiii1LiI11i i1LIL11l;
    public int iiIliillii = 16384;
    public boolean iilLil1i11I1;
    public final IiILIlLLiIL il1LilLllii;
    public final boolean illlI1lLIL;

    public C0101o000o0o(Iiii1LiI11i iiii1LiI11i, boolean z) {
        this.i1LIL11l = iiii1LiI11i;
        this.illlI1lLIL = z;
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        this.il1LilLllii = iiILIlLLiIL;
        this.I11lLL1 = new C0096o000o00o.i1LIL11l(iiILIlLLiIL);
    }

    public static void I1IILIil1lLlL(Iiii1LiI11i iiii1LiI11i, int i) throws IOException {
        iiii1LiI11i.IillLillLLIii((i >>> 16) & 255);
        iiii1LiI11i.IillLillLLIii((i >>> 8) & 255);
        iiii1LiI11i.IillLillLLIii(i & 255);
    }

    public synchronized void I1LiILiLLIl1l(int i, C0039OoooOO0 ooooOO0, byte[] bArr) throws IOException {
        try {
            if (this.iilLil1i11I1) {
                throw new IOException("closed");
            } else if (ooooOO0.httpCode != -1) {
                IiIl11II(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.i1LIL11l.iilLil1i11I1(i);
                this.i1LIL11l.iilLil1i11I1(ooooOO0.httpCode);
                if (bArr.length > 0) {
                    this.i1LIL11l.iiIliillii(bArr);
                }
                this.i1LIL11l.flush();
            } else {
                throw C0098o000o0O0.illlI1lLIL("errorCode.httpCode == -1", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void I1lLLLlliILlI(int i, int i2, List<C0090o000Ooo0> list) throws IOException {
        byte b;
        if (!this.iilLil1i11I1) {
            this.I11lLL1.I11lLL1(list);
            long iLLi1LIi = this.il1LilLllii.iLLi1LIi();
            int min = (int) Math.min((long) (this.iiIliillii - 4), iLLi1LIi);
            long j = (long) min;
            int i3 = (iLLi1LIi > j ? 1 : (iLLi1LIi == j ? 0 : -1));
            if (i3 == 0) {
                b = 4;
            } else {
                b = 0;
            }
            IiIl11II(i, min + 4, (byte) 5, b);
            this.i1LIL11l.iilLil1i11I1(i2 & Integer.MAX_VALUE);
            this.i1LIL11l.I1iIiIi(this.il1LilLllii, j);
            if (i3 > 0) {
                iIiL11iL(i, iLLi1LIi - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public int IIL1Ll1I111() {
        return this.iiIliillii;
    }

    public synchronized void IL11lll11(o0OOOO o0oooo) throws IOException {
        int i;
        try {
            if (!this.iilLil1i11I1) {
                IiIl11II(0, o0oooo.iILiI1lll() * 6, (byte) 4, (byte) 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (o0oooo.IiIIlIL(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else if (i2 == 7) {
                            i = 4;
                        } else {
                            i = i2;
                        }
                        this.i1LIL11l.IiiIIil1l(i);
                        this.i1LIL11l.iilLil1i11I1(o0oooo.i1LIL11l(i2));
                    }
                }
                this.i1LIL11l.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public void IiIl11II(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = iLLLILIiLi1Ii;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C0098o000o0O0.i1LIL11l(false, i, i2, b, b2));
        }
        int i3 = this.iiIliillii;
        if (i2 > i3) {
            throw C0098o000o0O0.illlI1lLIL("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            I1IILIil1lLlL(this.i1LIL11l, i2);
            this.i1LIL11l.IillLillLLIii(b & i1IL1lILl1L1I.iiI1L1iI);
            this.i1LIL11l.IillLillLLIii(b2 & i1IL1lILl1L1I.iiI1L1iI);
            this.i1LIL11l.iilLil1i11I1(i & Integer.MAX_VALUE);
        } else {
            throw C0098o000o0O0.illlI1lLIL("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public synchronized void close() throws IOException {
        this.iilLil1i11I1 = true;
        this.i1LIL11l.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.iilLil1i11I1) {
            this.i1LIL11l.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void i111iLiiIIill(int i, byte b, IiILIlLLiIL iiILIlLLiIL, int i2) throws IOException {
        IiIl11II(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.i1LIL11l.I1iIiIi(iiILIlLLiIL, (long) i2);
        }
    }

    public synchronized void i1LIL11l() throws IOException {
        try {
            if (this.iilLil1i11I1) {
                throw new IOException("closed");
            } else if (this.illlI1lLIL) {
                Logger logger = iLLLILIiLi1Ii;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C0487o0OooooO.Ii1liIIIiLi(">> CONNECTION %s", C0098o000o0O0.iiI1L1iI.IL1lILLLL1L()));
                }
                this.i1LIL11l.iiIliillii(C0098o000o0O0.iiI1L1iI.i1LiiIlIL1I());
                this.i1LIL11l.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void iILlLIlli(int i, long j) throws IOException {
        if (this.iilLil1i11I1) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C0098o000o0O0.illlI1lLIL("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            IiIl11II(i, 4, (byte) 8, (byte) 0);
            this.i1LIL11l.iilLil1i11I1((int) j);
            this.i1LIL11l.flush();
        }
    }

    public final void iIiL11iL(int i, long j) throws IOException {
        byte b;
        while (j > 0) {
            int min = (int) Math.min((long) this.iiIliillii, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            IiIl11II(i, min, (byte) 9, b);
            this.i1LIL11l.I1iIiIi(this.il1LilLllii, j2);
        }
    }

    public synchronized void iiI1L1iI(o0OOOO o0oooo) throws IOException {
        try {
            if (!this.iilLil1i11I1) {
                this.iiIliillii = o0oooo.I11lLL1(this.iiIliillii);
                if (o0oooo.il1LilLllii() != -1) {
                    this.I11lLL1.iiIliillii(o0oooo.il1LilLllii());
                }
                IiIl11II(0, 0, (byte) 4, (byte) 1);
                this.i1LIL11l.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void iiLl11ILL(int i, C0039OoooOO0 ooooOO0) throws IOException {
        if (this.iilLil1i11I1) {
            throw new IOException("closed");
        } else if (ooooOO0.httpCode != -1) {
            IiIl11II(i, 4, (byte) 3, (byte) 0);
            this.i1LIL11l.iilLil1i11I1(ooooOO0.httpCode);
            this.i1LIL11l.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void il1LilLllii(boolean z, int i, IiILIlLLiIL iiILIlLLiIL, int i2) throws IOException {
        byte b;
        if (!this.iilLil1i11I1) {
            if (z) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            i111iLiiIIill(i, b, iiILIlLLiIL, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void ilIILlI1l11i(boolean z, int i, int i2) throws IOException {
        if (!this.iilLil1i11I1) {
            IiIl11II(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.i1LIL11l.iilLil1i11I1(i);
            this.i1LIL11l.iilLil1i11I1(i2);
            this.i1LIL11l.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void ilLIlL1ILi(boolean z, int i, List<C0090o000Ooo0> list) throws IOException {
        byte b;
        if (!this.iilLil1i11I1) {
            this.I11lLL1.I11lLL1(list);
            long iLLi1LIi = this.il1LilLllii.iLLi1LIi();
            int min = (int) Math.min((long) this.iiIliillii, iLLi1LIi);
            long j = (long) min;
            int i2 = (iLLi1LIi > j ? 1 : (iLLi1LIi == j ? 0 : -1));
            if (i2 == 0) {
                b = 4;
            } else {
                b = 0;
            }
            if (z) {
                b = (byte) (b | 1);
            }
            IiIl11II(i, min, (byte) 1, b);
            this.i1LIL11l.I1iIiIi(this.il1LilLllii, j);
            if (i2 > 0) {
                iIiL11iL(i, iLLi1LIi - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
