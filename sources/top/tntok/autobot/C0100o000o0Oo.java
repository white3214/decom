package top.tntok.autobot;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import top.tntok.autobot.C0096o000o00o;

/* renamed from: top.tntok.autobot.o000o0Oo  reason: case insensitive filesystem */
public final class C0100o000o0Oo implements Closeable {
    public static final Logger iilLil1i11I1 = Logger.getLogger(C0098o000o0O0.class.getName());
    public final ILL1iL1LiiI i1LIL11l;
    public final C0096o000o00o.iiI1L1iI iiIliillii;
    public final boolean il1LilLllii;
    public final iiI1L1iI illlI1lLIL;

    /* renamed from: top.tntok.autobot.o000o0Oo$i1LIL11l */
    public interface i1LIL11l {
        void I11lLL1(int i, int i2, int i3, boolean z);

        void IiIIlIL();

        void IiiL1llIIi(int i, long j);

        void i1LIL11l(boolean z, int i, int i2, List<C0090o000Ooo0> list);

        void iLLLILIiLi1Ii(boolean z, int i, ILL1iL1LiiI iLL1iL1LiiI, int i2) throws IOException;

        void iiI1L1iI(int i, int i2, List<C0090o000Ooo0> list) throws IOException;

        void iiIliillii(int i, C0039OoooOO0 ooooOO0);

        void iilLiIIIi11i(int i, String str, ili11iILI1l ili11iili1l, String str2, int i2, long j);

        void iilLil1i11I1(boolean z, o0OOOO o0oooo);

        void il1LilLllii(boolean z, int i, int i2);

        void illlI1lLIL(int i, C0039OoooOO0 ooooOO0, ili11iILI1l ili11iili1l);
    }

    public C0100o000o0Oo(ILL1iL1LiiI iLL1iL1LiiI, boolean z) {
        this.i1LIL11l = iLL1iL1LiiI;
        this.il1LilLllii = z;
        iiI1L1iI iii1l1ii = new iiI1L1iI(iLL1iL1LiiI);
        this.illlI1lLIL = iii1l1ii;
        this.iiIliillii = new C0096o000o00o.iiI1L1iI(4096, iii1l1ii);
    }

    public static int IIL1Ll1I111(ILL1iL1LiiI iLL1iL1LiiI) throws IOException {
        return (iLL1iL1LiiI.readByte() & i1IL1lILl1L1I.iiI1L1iI) | ((iLL1iL1LiiI.readByte() & i1IL1lILl1L1I.iiI1L1iI) << 16) | ((iLL1iL1LiiI.readByte() & i1IL1lILl1L1I.iiI1L1iI) << 8);
    }

    public static int iiI1L1iI(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public final void I1IILIil1lLlL(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.i1LIL11l.readInt()) & 2147483647L;
            if (readInt != 0) {
                i1lil11l.IiiL1llIIi(i2, readInt);
            } else {
                throw C0098o000o0O0.il1LilLllii("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    public final List<C0090o000Ooo0> I1LiILiLLIl1l(int i, short s, byte b, int i2) throws IOException {
        iiI1L1iI iii1l1ii = this.illlI1lLIL;
        iii1l1ii.iilLil1i11I1 = i;
        iii1l1ii.illlI1lLIL = i;
        iii1l1ii.I11lLL1 = s;
        iii1l1ii.il1LilLllii = b;
        iii1l1ii.iiIliillii = i2;
        this.iiIliillii.iILiI1lll();
        return this.iiIliillii.iiIliillii();
    }

    public final void I1lLLLlliILlI(i1LIL11l i1lil11l, int i) throws IOException {
        boolean z;
        int readInt = this.i1LIL11l.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        i1lil11l.I11lLL1(i, readInt & Integer.MAX_VALUE, (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI) + 1, z);
    }

    public final void IL11lll11(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
            }
            i1lil11l.iiI1L1iI(i2, this.i1LIL11l.readInt() & Integer.MAX_VALUE, I1LiILiLLIl1l(iiI1L1iI(i - 4, b, s), s, b, i2));
            return;
        }
        throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    public final void IiIl11II(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw C0098o000o0O0.il1LilLllii("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.i1LIL11l.readInt();
            int readInt2 = this.i1LIL11l.readInt();
            int i3 = i - 8;
            C0039OoooOO0 iiI1L1iI2 = C0039OoooOO0.iiI1L1iI(readInt2);
            if (iiI1L1iI2 != null) {
                ili11iILI1l ili11iili1l = ili11iILI1l.iiIliillii;
                if (i3 > 0) {
                    ili11iili1l = this.i1LIL11l.iliilLllIl1((long) i3);
                }
                i1lil11l.illlI1lLIL(readInt, iiI1L1iI2, ili11iili1l);
                return;
            }
            throw C0098o000o0O0.il1LilLllii("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public final void i111iLiiIIill(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        boolean z;
        short s = 0;
        if (i2 != 0) {
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 32) == 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
                }
                i1lil11l.iLLLILIiLi1Ii(z, i2, this.i1LIL11l, iiI1L1iI(i, b, s));
                this.i1LIL11l.skip((long) s);
                return;
            }
            throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    public boolean i1LIL11l(boolean z, i1LIL11l i1lil11l) throws IOException {
        try {
            this.i1LIL11l.IIIlll1lll(9);
            int IIL1Ll1I111 = IIL1Ll1I111(this.i1LIL11l);
            if (IIL1Ll1I111 < 0 || IIL1Ll1I111 > 16384) {
                throw C0098o000o0O0.il1LilLllii("FRAME_SIZE_ERROR: %s", Integer.valueOf(IIL1Ll1I111));
            }
            byte readByte = (byte) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
                int readInt = this.i1LIL11l.readInt() & Integer.MAX_VALUE;
                Logger logger = iilLil1i11I1;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C0098o000o0O0.i1LIL11l(true, readInt, IIL1Ll1I111, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        i111iLiiIIill(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 1:
                        ilLIlL1ILi(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 2:
                        iiLl11ILL(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 3:
                        iILlLIlli(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 4:
                        iIiL11iL(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 5:
                        IL11lll11(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 6:
                        ilIILlI1l11i(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 7:
                        IiIl11II(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    case 8:
                        I1IILIil1lLlL(i1lil11l, IIL1Ll1I111, readByte2, readInt);
                        break;
                    default:
                        this.i1LIL11l.skip((long) IIL1Ll1I111);
                        break;
                }
                return true;
            }
            throw C0098o000o0O0.il1LilLllii("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void iILlLIlli(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw C0098o000o0O0.il1LilLllii("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.i1LIL11l.readInt();
            C0039OoooOO0 iiI1L1iI2 = C0039OoooOO0.iiI1L1iI(readInt);
            if (iiI1L1iI2 != null) {
                i1lil11l.iiIliillii(i2, iiI1L1iI2);
                return;
            }
            throw C0098o000o0O0.il1LilLllii("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    public final void iIiL11iL(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw C0098o000o0O0.il1LilLllii("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                i1lil11l.IiIIlIL();
                return;
            }
            throw C0098o000o0O0.il1LilLllii("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            o0OOOO o0oooo = new o0OOOO();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.i1LIL11l.readShort() & 65535;
                int readInt = this.i1LIL11l.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort != 4) {
                        if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                            throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                    } else if (readInt >= 0) {
                        readShort = 7;
                    } else {
                        throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                o0oooo.IiiL1llIIi(readShort, readInt);
            }
            i1lil11l.iilLil1i11I1(false, o0oooo);
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    public final void iiLl11ILL(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw C0098o000o0O0.il1LilLllii("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            I1lLLLlliILlI(i1lil11l, i2);
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    public void il1LilLllii(i1LIL11l i1lil11l) throws IOException {
        if (!this.il1LilLllii) {
            ILL1iL1LiiI iLL1iL1LiiI = this.i1LIL11l;
            ili11iILI1l ili11iili1l = C0098o000o0O0.iiI1L1iI;
            ili11iILI1l iliilLllIl1 = iLL1iL1LiiI.iliilLllIl1((long) ili11iili1l.illiiliIILI());
            Logger logger = iilLil1i11I1;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C0487o0OooooO.Ii1liIIIiLi("<< CONNECTION %s", iliilLllIl1.IL1lILLLL1L()));
            }
            if (!ili11iili1l.equals(iliilLllIl1)) {
                throw C0098o000o0O0.il1LilLllii("Expected a connection header but was %s", iliilLllIl1.ILiLII1ILi());
            }
        } else if (!i1LIL11l(true, i1lil11l)) {
            throw C0098o000o0O0.il1LilLllii("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public final void ilIILlI1l11i(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        boolean z = true;
        if (i != 8) {
            throw C0098o000o0O0.il1LilLllii("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.i1LIL11l.readInt();
            int readInt2 = this.i1LIL11l.readInt();
            if ((b & 1) == 0) {
                z = false;
            }
            i1lil11l.il1LilLllii(z, readInt, readInt2);
        } else {
            throw C0098o000o0O0.il1LilLllii("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    public final void ilLIlL1ILi(i1LIL11l i1lil11l, int i, byte b, int i2) throws IOException {
        boolean z;
        short s = 0;
        if (i2 != 0) {
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 8) != 0) {
                s = (short) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
            }
            if ((b & 32) != 0) {
                I1lLLLlliILlI(i1lil11l, i2);
                i -= 5;
            }
            i1lil11l.i1LIL11l(z, i2, -1, I1LiILiLLIl1l(iiI1L1iI(i, b, s), s, b, i2));
            return;
        }
        throw C0098o000o0O0.il1LilLllii("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: top.tntok.autobot.o000o0Oo$iiI1L1iI */
    public static final class iiI1L1iI implements C0370o0OOOooO {
        public short I11lLL1;
        public final ILL1iL1LiiI i1LIL11l;
        public int iiIliillii;
        public int iilLil1i11I1;
        public byte il1LilLllii;
        public int illlI1lLIL;

        public iiI1L1iI(ILL1iL1LiiI iLL1iL1LiiI) {
            this.i1LIL11l = iLL1iL1LiiI;
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            while (true) {
                int i = this.iilLil1i11I1;
                if (i == 0) {
                    this.i1LIL11l.skip((long) this.I11lLL1);
                    this.I11lLL1 = 0;
                    if ((this.il1LilLllii & 4) != 0) {
                        return -1;
                    }
                    iiI1L1iI();
                } else {
                    long IIlllIIi1ii = this.i1LIL11l.IIlllIIi1ii(iiILIlLLiIL, Math.min(j, (long) i));
                    if (IIlllIIi1ii == -1) {
                        return -1;
                    }
                    this.iilLil1i11I1 = (int) (((long) this.iilLil1i11I1) - IIlllIIi1ii);
                    return IIlllIIi1ii;
                }
            }
        }

        public final void iiI1L1iI() throws IOException {
            int i = this.iiIliillii;
            int IIL1Ll1I111 = C0100o000o0Oo.IIL1Ll1I111(this.i1LIL11l);
            this.iilLil1i11I1 = IIL1Ll1I111;
            this.illlI1lLIL = IIL1Ll1I111;
            byte readByte = (byte) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
            this.il1LilLllii = (byte) (this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI);
            Logger logger = C0100o000o0Oo.iilLil1i11I1;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C0098o000o0O0.i1LIL11l(true, this.iiIliillii, this.illlI1lLIL, readByte, this.il1LilLllii));
            }
            int readInt = this.i1LIL11l.readInt() & Integer.MAX_VALUE;
            this.iiIliillii = readInt;
            if (readByte != 9) {
                throw C0098o000o0O0.il1LilLllii("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C0098o000o0O0.il1LilLllii("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l.timeout();
        }

        public void close() throws IOException {
        }
    }
}
