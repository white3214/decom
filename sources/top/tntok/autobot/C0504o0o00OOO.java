package top.tntok.autobot;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import top.tntok.autobot.IiILIlLLiIL;

/* renamed from: top.tntok.autobot.o0o00OOO  reason: case insensitive filesystem */
public final class C0504o0o00OOO {
    public boolean I11lLL1;
    public final IiILIlLLiIL IiIIlIL = new IiILIlLLiIL();
    public final byte[] IiiL1llIIi;
    public final ILL1iL1LiiI i1LIL11l;
    public final IiILIlLLiIL.illlI1lLIL iILiI1lll;
    public boolean iLLLILIiLi1Ii;
    public final boolean iiI1L1iI;
    public int iiIliillii;
    public final IiILIlLLiIL iilLiIIIi11i = new IiILIlLLiIL();
    public long iilLil1i11I1;
    public boolean il1LilLllii;
    public final iiI1L1iI illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0o00OOO$iiI1L1iI */
    public interface iiI1L1iI {
        void IiIIlIL(ili11iILI1l ili11iili1l);

        void IiiL1llIIi(int i, String str);

        void iiIliillii(ili11iILI1l ili11iili1l);

        void iilLiIIIi11i(ili11iILI1l ili11iili1l) throws IOException;

        void iilLil1i11I1(String str) throws IOException;
    }

    public C0504o0o00OOO(boolean z, ILL1iL1LiiI iLL1iL1LiiI, iiI1L1iI iii1l1ii) {
        byte[] bArr;
        if (iLL1iL1LiiI == null) {
            throw new NullPointerException("source == null");
        } else if (iii1l1ii != null) {
            this.iiI1L1iI = z;
            this.i1LIL11l = iLL1iL1LiiI;
            this.illlI1lLIL = iii1l1ii;
            IiILIlLLiIL.illlI1lLIL illli1llil = null;
            if (z) {
                bArr = null;
            } else {
                bArr = new byte[4];
            }
            this.IiiL1llIIi = bArr;
            this.iILiI1lll = !z ? new IiILIlLLiIL.illlI1lLIL() : illli1llil;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    public final void i1LIL11l() throws IOException {
        String str;
        short s;
        long j = this.iilLil1i11I1;
        if (j > 0) {
            this.i1LIL11l.I1l1iIll1lIi1(this.IiIIlIL, j);
            if (!this.iiI1L1iI) {
                this.IiIIlIL.iLlI1iL1lIIL(this.iILiI1lll);
                this.iILiI1lll.i111iLiiIIill(0);
                C0503o0o00OO0.illlI1lLIL(this.iILiI1lll, this.IiiL1llIIi);
                this.iILiI1lll.close();
            }
        }
        switch (this.iiIliillii) {
            case 8:
                long iLLi1LIi = this.IiIIlIL.iLLi1LIi();
                if (iLLi1LIi != 1) {
                    if (iLLi1LIi != 0) {
                        s = this.IiIIlIL.readShort();
                        str = this.IiIIlIL.illi1IL1();
                        String i1LIL11l2 = C0503o0o00OO0.i1LIL11l(s);
                        if (i1LIL11l2 != null) {
                            throw new ProtocolException(i1LIL11l2);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.illlI1lLIL.IiiL1llIIi(s, str);
                    this.il1LilLllii = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.illlI1lLIL.iiIliillii(this.IiIIlIL.IL1IiilLlLI());
                return;
            case 10:
                this.illlI1lLIL.IiIIlIL(this.IiIIlIL.IL1IiilLlLI());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.iiIliillii));
        }
    }

    public void iiI1L1iI() throws IOException {
        illlI1lLIL();
        if (this.iLLLILIiLi1Ii) {
            i1LIL11l();
        } else {
            iiIliillii();
        }
    }

    public final void iiIliillii() throws IOException {
        int i = this.iiIliillii;
        if (i == 1 || i == 2) {
            il1LilLllii();
            if (i == 1) {
                this.illlI1lLIL.iilLil1i11I1(this.iilLiIIIi11i.illi1IL1());
            } else {
                this.illlI1lLIL.iilLiIIIi11i(this.iilLiIIIi11i.IL1IiilLlLI());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
    }

    public final void iilLil1i11I1() throws IOException {
        while (!this.il1LilLllii) {
            illlI1lLIL();
            if (this.iLLLILIiLi1Ii) {
                i1LIL11l();
            } else {
                return;
            }
        }
    }

    public final void il1LilLllii() throws IOException {
        while (!this.il1LilLllii) {
            long j = this.iilLil1i11I1;
            if (j > 0) {
                this.i1LIL11l.I1l1iIll1lIi1(this.iilLiIIIi11i, j);
                if (!this.iiI1L1iI) {
                    this.iilLiIIIi11i.iLlI1iL1lIIL(this.iILiI1lll);
                    this.iILiI1lll.i111iLiiIIill(this.iilLiIIIi11i.iLLi1LIi() - this.iilLil1i11I1);
                    C0503o0o00OO0.illlI1lLIL(this.iILiI1lll, this.IiiL1llIIi);
                    this.iILiI1lll.close();
                }
            }
            if (!this.I11lLL1) {
                iilLil1i11I1();
                if (this.iiIliillii != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.iiIliillii));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* JADX INFO: finally extract failed */
    public final void illlI1lLIL() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.il1LilLllii) {
            long iilLiIIIi11i2 = this.i1LIL11l.timeout().iilLiIIIi11i();
            this.i1LIL11l.timeout().i1LIL11l();
            try {
                byte readByte = this.i1LIL11l.readByte();
                this.i1LIL11l.timeout().IiIIlIL(iilLiIIIi11i2, TimeUnit.NANOSECONDS);
                this.iiIliillii = readByte & 15;
                boolean z6 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.I11lLL1 = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.iLLLILIiLi1Ii = z2;
                if (!z2 || z) {
                    if ((readByte & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((readByte & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((readByte & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.i1LIL11l.readByte();
                    if ((readByte2 & 128) != 0) {
                        z6 = true;
                    }
                    if (z6 == this.iiI1L1iI) {
                        if (this.iiI1L1iI) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = (long) (readByte2 & C0310o0O0o0O.i1LIL11l);
                    this.iilLil1i11I1 = j;
                    if (j == 126) {
                        this.iilLil1i11I1 = ((long) this.i1LIL11l.readShort()) & C0503o0o00OO0.IilL11ii1I1Il;
                    } else if (j == 127) {
                        long readLong = this.i1LIL11l.readLong();
                        this.iilLil1i11I1 = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.iilLil1i11I1) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.iLLLILIiLi1Ii && this.iilLil1i11I1 > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.i1LIL11l.readFully(this.IiiL1llIIi);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.i1LIL11l.timeout().IiIIlIL(iilLiIIIi11i2, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
