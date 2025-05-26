package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: top.tntok.autobot.o0o00O0o  reason: case insensitive filesystem */
public class C0502o0o00O0o {
    public static final Charset I11lLL1 = Charset.forName(C0514o0o00oO.iilLil1i11I1);
    public boolean i1LIL11l;
    public C0247o00oo0 iiI1L1iI;
    public transient int iiIliillii;
    public transient String iilLil1i11I1;
    public byte[] il1LilLllii;
    public byte[] illlI1lLIL;

    public C0502o0o00O0o(C0247o00oo0 o00oo0, boolean z) {
        i111iLiiIIill(o00oo0);
        IL1lILLLL1L(z);
    }

    public static byte[] I1l1iIll1lIi1(String str) throws CharacterCodingException {
        return str.getBytes(I11lLL1);
    }

    public static C0502o0o00O0o IiiL1llIIi(InputStream inputStream) throws IOException {
        boolean z;
        byte illlI1lLIL2 = (byte) illlI1lLIL(inputStream.read());
        if ((illlI1lLIL2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        byte b = illlI1lLIL2 & 15;
        C0247o00oo0 i1LIL11l2 = C0247o00oo0.i1LIL11l((byte) b);
        byte b2 = illlI1lLIL2 & 112;
        if (b2 != 0) {
            I1lILLiiI1iI i1lILLiiI1iI = I1lILLiiI1iI.ProtocolError;
            throw new C0501o0o00O0O(i1lILLiiI1iI, "The reserved bits (" + Integer.toBinaryString(b2) + ") must be 0.");
        } else if (i1LIL11l2 == null) {
            I1lILLiiI1iI i1lILLiiI1iI2 = I1lILLiiI1iI.ProtocolError;
            throw new C0501o0o00O0O(i1lILLiiI1iI2, "Received frame with reserved/unknown opcode " + b + ".");
        } else if (!i1LIL11l2.il1LilLllii() || z) {
            C0502o0o00O0o o0o00o0o = new C0502o0o00O0o(i1LIL11l2, z);
            o0o00o0o.I1iIiIi(inputStream);
            o0o00o0o.iILiI1lll(inputStream);
            if (o0o00o0o.iilLil1i11I1() == C0247o00oo0.Close) {
                return new ilILLiI1IIi(o0o00o0o);
            }
            return o0o00o0o;
        } else {
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Fragmented control frame.");
        }
    }

    public static String i1LIL11l(byte[] bArr, int i, int i2) throws CharacterCodingException {
        return new String(bArr, i, i2, I11lLL1);
    }

    public static String iiI1L1iI(byte[] bArr) throws CharacterCodingException {
        return new String(bArr, I11lLL1);
    }

    public static int illlI1lLIL(int i) throws IOException {
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    public String I11lLL1() {
        if (this.iilLil1i11I1 == null) {
            try {
                this.iilLil1i11I1 = iiI1L1iI(il1LilLllii());
            } catch (CharacterCodingException e) {
                throw new RuntimeException("Undetected CharacterCodingException", e);
            }
        }
        return this.iilLil1i11I1;
    }

    public final void I1iIiIi(InputStream inputStream) throws IOException {
        boolean z;
        byte illlI1lLIL2 = (byte) illlI1lLIL(inputStream.read());
        int i = 0;
        if ((illlI1lLIL2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        byte b = (byte) (illlI1lLIL2 & C0310o0O0o0O.i1LIL11l);
        this.iiIliillii = b;
        if (b == 126) {
            int illlI1lLIL3 = ((illlI1lLIL(inputStream.read()) << 8) | illlI1lLIL(inputStream.read())) & 65535;
            this.iiIliillii = illlI1lLIL3;
            if (illlI1lLIL3 < 126) {
                throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Invalid data frame 2byte length. (not using minimal length encoding)");
            }
        } else if (b == Byte.MAX_VALUE) {
            long illlI1lLIL4 = (((long) illlI1lLIL(inputStream.read())) << 56) | (((long) illlI1lLIL(inputStream.read())) << 48) | (((long) illlI1lLIL(inputStream.read())) << 40) | (((long) illlI1lLIL(inputStream.read())) << 32) | ((long) (illlI1lLIL(inputStream.read()) << 24)) | ((long) (illlI1lLIL(inputStream.read()) << 16)) | ((long) (illlI1lLIL(inputStream.read()) << 8)) | ((long) illlI1lLIL(inputStream.read()));
            if (illlI1lLIL4 < o0OOO00o.iiI1L1iI) {
                throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Invalid data frame 4byte length. (not using minimal length encoding)");
            } else if (illlI1lLIL4 < 0 || illlI1lLIL4 > 2147483647L) {
                throw new C0501o0o00O0O(I1lILLiiI1iI.MessageTooBig, "Max frame length has been exceeded.");
            } else {
                this.iiIliillii = (int) illlI1lLIL4;
            }
        }
        if (this.iiI1L1iI.il1LilLllii()) {
            int i2 = this.iiIliillii;
            if (i2 > 125) {
                throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Control frame with payload length > 125 bytes.");
            } else if (this.iiI1L1iI == C0247o00oo0.Close && i2 == 1) {
                throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Received close frame with payload len 1.");
            }
        }
        if (z) {
            this.illlI1lLIL = new byte[4];
            while (true) {
                byte[] bArr = this.illlI1lLIL;
                if (i < bArr.length) {
                    i += illlI1lLIL(inputStream.read(bArr, i, bArr.length - i));
                } else {
                    return;
                }
            }
        }
    }

    public void IL1lILLLL1L(boolean z) {
        this.i1LIL11l = z;
    }

    public void Ii1liIIIiLi(String str) throws CharacterCodingException {
        this.il1LilLllii = I1l1iIll1lIi1(str);
        this.iiIliillii = str.length();
        this.iilLil1i11I1 = str;
    }

    public boolean IiIIlIL() {
        byte[] bArr = this.illlI1lLIL;
        if (bArr == null || bArr.length != 4) {
            return false;
        }
        return true;
    }

    public void IilL11ii1I1Il() {
        iL1LIlIlI((byte[]) null);
    }

    public void i111iLiiIIill(C0247o00oo0 o00oo0) {
        this.iiI1L1iI = o00oo0;
    }

    public void i1L1lLllLLlIi(byte[] bArr) {
        this.il1LilLllii = bArr;
        this.iiIliillii = bArr.length;
        this.iilLil1i11I1 = null;
    }

    public final void iILiI1lll(InputStream inputStream) throws IOException {
        this.il1LilLllii = new byte[this.iiIliillii];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.iiIliillii;
            if (i2 >= i3) {
                break;
            }
            i2 += illlI1lLIL(inputStream.read(this.il1LilLllii, i2, i3 - i2));
        }
        if (IiIIlIL()) {
            while (true) {
                byte[] bArr = this.il1LilLllii;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = (byte) (bArr[i] ^ this.illlI1lLIL[i % 4]);
                i++;
            }
        }
        if (iilLil1i11I1() == C0247o00oo0.Text) {
            this.iilLil1i11I1 = iiI1L1iI(il1LilLllii());
        }
    }

    public void iL1LIlIlI(byte[] bArr) {
        if (bArr == null || bArr.length == 4) {
            this.illlI1lLIL = bArr;
            return;
        }
        throw new IllegalArgumentException("MaskingKey " + Arrays.toString(bArr) + " hasn't length 4");
    }

    public boolean iLLLILIiLi1Ii() {
        return this.i1LIL11l;
    }

    public byte[] iiIliillii() {
        return this.illlI1lLIL;
    }

    public void iiLIIiIli(OutputStream outputStream) throws IOException {
        byte b;
        int i;
        int i2;
        byte b2;
        if (this.i1LIL11l) {
            b = (byte) 128;
        } else {
            b = 0;
        }
        outputStream.write((byte) (b | (this.iiI1L1iI.illlI1lLIL() & 15)));
        int length = il1LilLllii().length;
        this.iiIliillii = length;
        if (length <= 125) {
            if (IiIIlIL()) {
                b2 = ((byte) this.iiIliillii) | 128;
            } else {
                b2 = (byte) this.iiIliillii;
            }
            outputStream.write(b2);
        } else if (length <= 65535) {
            if (IiIIlIL()) {
                i2 = 254;
            } else {
                i2 = C0503o0o00OO0.Ii1liIIIiLi;
            }
            outputStream.write(i2);
            outputStream.write(this.iiIliillii >>> 8);
            outputStream.write(this.iiIliillii);
        } else {
            if (IiIIlIL()) {
                i = 255;
            } else {
                i = 127;
            }
            outputStream.write(i);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(this.iiIliillii >>> 24);
            outputStream.write(this.iiIliillii >>> 16);
            outputStream.write(this.iiIliillii >>> 8);
            outputStream.write(this.iiIliillii);
        }
        if (IiIIlIL()) {
            outputStream.write(this.illlI1lLIL);
            for (int i3 = 0; i3 < this.iiIliillii; i3++) {
                outputStream.write(il1LilLllii()[i3] ^ this.illlI1lLIL[i3 % 4]);
            }
        } else {
            outputStream.write(il1LilLllii());
        }
        outputStream.flush();
    }

    public final String iilLiIIIi11i() {
        if (this.il1LilLllii == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.il1LilLllii.length);
        sb.append("b] ");
        if (iilLil1i11I1() == C0247o00oo0.Text) {
            String I11lLL12 = I11lLL1();
            if (I11lLL12.length() > 100) {
                sb.append(I11lLL12.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(I11lLL12);
            }
        } else {
            sb.append("0x");
            for (int i = 0; i < Math.min(this.il1LilLllii.length, 50); i++) {
                sb.append(Integer.toHexString(this.il1LilLllii[i] & i1IL1lILl1L1I.iiI1L1iI));
            }
            if (this.il1LilLllii.length > 50) {
                sb.append("...");
            }
        }
        return sb.toString();
    }

    public C0247o00oo0 iilLil1i11I1() {
        return this.iiI1L1iI;
    }

    public byte[] il1LilLllii() {
        return this.il1LilLllii;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("WS[");
        sb.append(iilLil1i11I1());
        sb.append(", ");
        if (iLLLILIiLi1Ii()) {
            str = "fin";
        } else {
            str = "inter";
        }
        sb.append(str);
        sb.append(", ");
        if (IiIIlIL()) {
            str2 = "masked";
        } else {
            str2 = "unmasked";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(iilLiIIIi11i());
        sb.append(']');
        return sb.toString();
    }

    public C0502o0o00O0o(C0247o00oo0 o00oo0, boolean z, byte[] bArr) {
        this(o00oo0, z, bArr, (byte[]) null);
    }

    public C0502o0o00O0o(C0247o00oo0 o00oo0, boolean z, byte[] bArr, byte[] bArr2) {
        this(o00oo0, z);
        iL1LIlIlI(bArr2);
        i1L1lLllLLlIi(bArr);
    }

    public C0502o0o00O0o(C0247o00oo0 o00oo0, boolean z, String str) throws CharacterCodingException {
        this(o00oo0, z, str, (byte[]) null);
    }

    public C0502o0o00O0o(C0247o00oo0 o00oo0, boolean z, String str, byte[] bArr) throws CharacterCodingException {
        this(o00oo0, z);
        iL1LIlIlI(bArr);
        Ii1liIIIiLi(str);
    }

    public C0502o0o00O0o(C0247o00oo0 o00oo0, List<C0502o0o00O0o> list) throws C0501o0o00O0O {
        i111iLiiIIill(o00oo0);
        IL1lILLLL1L(true);
        long j = 0;
        for (C0502o0o00O0o il1LilLllii2 : list) {
            j += (long) il1LilLllii2.il1LilLllii().length;
        }
        if (j < 0 || j > 2147483647L) {
            throw new C0501o0o00O0O(I1lILLiiI1iI.MessageTooBig, "Max frame length has been exceeded.");
        }
        int i = (int) j;
        this.iiIliillii = i;
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C0502o0o00O0o next : list) {
            System.arraycopy(next.il1LilLllii(), 0, bArr, i2, next.il1LilLllii().length);
            i2 += next.il1LilLllii().length;
        }
        i1L1lLllLLlIi(bArr);
    }

    public C0502o0o00O0o(C0502o0o00O0o o0o00o0o) {
        i111iLiiIIill(o0o00o0o.iilLil1i11I1());
        IL1lILLLL1L(o0o00o0o.iLLLILIiLi1Ii());
        i1L1lLllLLlIi(o0o00o0o.il1LilLllii());
        iL1LIlIlI(o0o00o0o.iiIliillii());
    }
}
