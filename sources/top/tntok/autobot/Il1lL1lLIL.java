package top.tntok.autobot;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Il1lL1lLIL {
    public static final int i1LIL11l = 262144;
    public static final /* synthetic */ boolean iiIliillii = false;
    public static final int il1LilLllii = 300;
    public static final int illlI1lLIL = 262130;
    public final DataInputStream iiI1L1iI;

    public Il1lL1lLIL(InputStream inputStream) {
        this.iiI1L1iI = new DataInputStream(new BufferedInputStream(inputStream));
    }

    public final iI11ilILI I11lLL1() throws IOException {
        return iI11ilILI.iilLil1i11I1(I1iIiIi());
    }

    public final String I1iIiIi() throws IOException {
        return i1L1lLllLLlIi(4);
    }

    public final iI11ilILI IL1lILLLL1L() throws IOException {
        return iI11ilILI.IiiL1llIIi(this.iiI1L1iI.readUnsignedShort(), this.iiI1L1iI.readUnsignedShort(), this.iiI1L1iI.readUnsignedShort(), i1L1lLllLLlIi(1), illlI1lLIL(2));
    }

    public iI11ilILI Ii1liIIIiLi() throws IOException {
        int readUnsignedByte = this.iiI1L1iI.readUnsignedByte();
        switch (readUnsignedByte) {
            case 0:
                return iiIliillii();
            case 1:
                return I11lLL1();
            case 2:
                return iLLLILIiLi1Ii();
            case 3:
                return iilLil1i11I1();
            case 4:
                return iiI1L1iI();
            case 5:
            case 6:
            case 7:
            case 11:
            case 15:
            case 17:
                return iI11ilILI.i1LIL11l(readUnsignedByte);
            case 8:
                return il1LilLllii();
            case 9:
                return iilLiIIIi11i();
            case 10:
                return IiiL1llIIi();
            case 12:
                return IL1lILLLL1L();
            case 13:
                return i111iLiiIIill();
            case 14:
                return iL1LIlIlI();
            case 16:
                return iILiI1lll();
            default:
                throw new ilI11Illi1LLl(C0387o0OOoO0o.iiI1L1iI("z0/G3dYMm///V8jdzVuBpupEl5M=\n", "miGts7l79d8=\n") + readUnsignedByte);
        }
    }

    public final o0O0OOO0 IiIIlIL() throws IOException {
        return new o0O0OOO0(this.iiI1L1iI.readInt(), this.iiI1L1iI.readInt(), this.iiI1L1iI.readUnsignedShort(), this.iiI1L1iI.readUnsignedShort());
    }

    public final iI11ilILI IiiL1llIIi() throws IOException {
        return iI11ilILI.IiIIlIL(this.iiI1L1iI.readBoolean());
    }

    public final iI11ilILI i111iLiiIIill() throws IOException {
        return iI11ilILI.I1iIiIi(this.iiI1L1iI.readUnsignedShort(), illlI1lLIL(2));
    }

    public final String i1L1lLllLLlIi(int i) throws IOException {
        return new String(illlI1lLIL(i), StandardCharsets.UTF_8);
    }

    public final int i1LIL11l(int i) throws IOException {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | this.iiI1L1iI.readUnsignedByte();
        }
        return i2;
    }

    public final iI11ilILI iILiI1lll() throws IOException {
        return iI11ilILI.iilLiIIIi11i(i1L1lLllLLlIi(1));
    }

    public final iI11ilILI iL1LIlIlI() throws IOException {
        return iI11ilILI.iILiI1lll(this.iiI1L1iI.readUnsignedShort());
    }

    public final iI11ilILI iLLLILIiLi1Ii() throws IOException {
        return iI11ilILI.I11lLL1(this.iiI1L1iI.readUnsignedByte(), this.iiI1L1iI.readLong(), IiIIlIL(), iILil1IilI1l.il1LilLllii(this.iiI1L1iI.readShort()), this.iiI1L1iI.readInt(), this.iiI1L1iI.readInt());
    }

    public final iI11ilILI iiI1L1iI() throws IOException {
        return iI11ilILI.iiI1L1iI(this.iiI1L1iI.readUnsignedByte());
    }

    public final iI11ilILI iiIliillii() throws IOException {
        return iI11ilILI.il1LilLllii(this.iiI1L1iI.readUnsignedByte(), this.iiI1L1iI.readInt(), this.iiI1L1iI.readInt(), this.iiI1L1iI.readInt());
    }

    public final iI11ilILI iilLiIIIi11i() throws IOException {
        boolean z;
        long readLong = this.iiI1L1iI.readLong();
        if (this.iiI1L1iI.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return iI11ilILI.iLLLILIiLi1Ii(readLong, I1iIiIi(), z);
    }

    public final iI11ilILI iilLil1i11I1() throws IOException {
        return iI11ilILI.iiIliillii(IiIIlIL(), iILil1IilI1l.iiI1L1iI(this.iiI1L1iI.readShort()), iILil1IilI1l.iiI1L1iI(this.iiI1L1iI.readShort()), this.iiI1L1iI.readInt());
    }

    public final iI11ilILI il1LilLllii() throws IOException {
        return iI11ilILI.illlI1lLIL(this.iiI1L1iI.readUnsignedByte());
    }

    public final byte[] illlI1lLIL(int i) throws IOException {
        byte[] bArr = new byte[i1LIL11l(i)];
        this.iiI1L1iI.readFully(bArr);
        return bArr;
    }
}
