package top.tntok.autobot;

import android.media.MediaCodec;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: top.tntok.autobot.o0OOo0o  reason: case insensitive filesystem */
public final class C0379o0OOo0o {
    public static final long I11lLL1 = 4611686018427387904L;
    public static final long iilLil1i11I1 = Long.MIN_VALUE;
    public final iIII1lLI111 i1LIL11l;
    public final FileDescriptor iiI1L1iI;
    public final ByteBuffer iiIliillii = ByteBuffer.allocate(12);
    public final boolean il1LilLllii;
    public final boolean illlI1lLIL;

    public C0379o0OOo0o(FileDescriptor fileDescriptor, iIII1lLI111 iiii1lli111, boolean z, boolean z2) {
        this.iiI1L1iI = fileDescriptor;
        this.i1LIL11l = iiii1lli111;
        this.illlI1lLIL = z;
        this.il1LilLllii = z2;
    }

    public static void i1LIL11l(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 16) {
            byte[] bArr = new byte[8];
            byteBuffer.get(bArr);
            if (Arrays.equals(bArr, new byte[]{65, 79, 80, 85, 83, 72, 68, 82})) {
                long j = byteBuffer.getLong();
                if (j < 0 || j >= 2147483647L) {
                    throw new IOException(C0387o0OOoO0o.iiI1L1iI("euvQXvrqbydR6clc/aN4bknghlb4o0RXZtaGV/Pib2JBv4Y=\n", "M4WmP5aDCwc=\n") + j);
                }
                int i = (int) j;
                if (byteBuffer.remaining() >= i) {
                    byteBuffer.limit(byteBuffer.position() + i);
                    return;
                }
                throw new IOException(C0387o0OOoO0o.iiI1L1iI("GY7MKBk2aI8wiZhsHSxm2j6PmEcsDVTaP4TZbBkqJ9I+j85pEDFj2iSIwm1GeA==\n", "V+G4CHxYB/o=\n") + i + C0387o0OOoO0o.iiI1L1iI("sA==\n", "mentZZmBMfg=\n"));
            }
            throw new IOException(C0387o0OOoO0o.iiI1L1iI("dKAUJl721lhflTNVEPHHGV2fNBsa\n", "O/BBdX6eszk=\n"));
        }
        throw new IOException(C0387o0OOoO0o.iiI1L1iI("U/OJo3SjDql69N3ncLkA/HTy3cxBmDL8fvOT5XiqQax8/5bmZQ==\n", "HZz9gxHNYdw=\n"));
    }

    public static void iiI1L1iI(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 8) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            if (Arrays.equals(bArr, new byte[]{102, 76, 97, 67})) {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                int i = byteBuffer.getInt();
                if (byteBuffer.remaining() >= i) {
                    byteBuffer.limit(byteBuffer.position() + i);
                    return;
                }
                throw new IOException(C0387o0OOoO0o.iiI1L1iI("0KjyY9hHDPH5r6Yn3F0CpPeppgXxaCCk9qLnJ9hbQ6z3qfAi0UAHpO2u/CaHCQ==\n", "nseGQ70pY4Q=\n") + i + C0387o0OOoO0o.iiI1L1iI("+A==\n", "0Wz+MQsjTw8=\n"));
            }
            throw new IOException(C0387o0OOoO0o.iiI1L1iI("iuIQqnect/OoyyPJOZumsqrBJIcz\n", "zK5R6Vf00pI=\n"));
        }
        throw new IOException(C0387o0OOoO0o.iiI1L1iI("leUcIf0o6aC84khl+TLn9bLkSEfUB8X1uOUGZ/EhpqW66QNk7A==\n", "24poAZhGhtU=\n"));
    }

    public void I11lLL1(ByteBuffer byteBuffer, long j, boolean z, boolean z2) throws IOException {
        if (z) {
            iIII1lLI111 iiii1lli111 = this.i1LIL11l;
            if (iiii1lli111 == iLiI1Llil.i1LIL11l) {
                i1LIL11l(byteBuffer);
            } else if (iiii1lli111 == iLiI1Llil.il1LilLllii) {
                iiI1L1iI(byteBuffer);
            }
        }
        if (this.il1LilLllii) {
            iilLil1i11I1(this.iiI1L1iI, byteBuffer.remaining(), j, z, z2);
        }
        o00O000.iiIliillii(this.iiI1L1iI, byteBuffer);
    }

    public void IiIIlIL(C0363o0OOOo0O o0oooo0o) throws IOException {
        if (this.illlI1lLIL) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(this.i1LIL11l.i1LIL11l());
            allocate.putInt(o0oooo0o.illlI1lLIL());
            allocate.putInt(o0oooo0o.iiI1L1iI());
            allocate.flip();
            o00O000.iiIliillii(this.iiI1L1iI, allocate);
        }
    }

    public void iLLLILIiLi1Ii(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws IOException {
        boolean z;
        boolean z2;
        long j = bufferInfo.presentationTimeUs;
        int i = bufferInfo.flags;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        I11lLL1(byteBuffer, j, z, z2);
    }

    public void iiIliillii(boolean z) throws IOException {
        byte[] bArr = new byte[4];
        if (z) {
            bArr[3] = 1;
        }
        o00O000.iilLil1i11I1(this.iiI1L1iI, bArr, 0, 4);
    }

    public final void iilLil1i11I1(FileDescriptor fileDescriptor, int i, long j, boolean z, boolean z2) throws IOException {
        this.iiIliillii.clear();
        if (z) {
            j = Long.MIN_VALUE;
        } else if (z2) {
            j |= I11lLL1;
        }
        this.iiIliillii.putLong(j);
        this.iiIliillii.putInt(i);
        this.iiIliillii.flip();
        o00O000.iiIliillii(fileDescriptor, this.iiIliillii);
    }

    public void il1LilLllii() throws IOException {
        if (this.illlI1lLIL) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(this.i1LIL11l.i1LIL11l());
            allocate.flip();
            o00O000.iiIliillii(this.iiI1L1iI, allocate);
        }
    }

    public iIII1lLI111 illlI1lLIL() {
        return this.i1LIL11l;
    }
}
