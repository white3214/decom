package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public final class i1IL1lILl1L1I {
    public static final byte[] I11lLL1;
    public static final int i1LIL11l = -2;
    public static final byte iiI1L1iI = -1;
    public static final byte[] iiIliillii = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte iilLil1i11I1 = 61;
    public static final int il1LilLllii = 4;
    public static final int illlI1lLIL = 255;

    static {
        byte[] bArr = new byte[256];
        I11lLL1 = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            byte[] bArr2 = iiIliillii;
            if (i < bArr2.length) {
                I11lLL1[bArr2[i]] = (byte) i;
                i++;
            } else {
                I11lLL1[61] = -2;
                return;
            }
        }
    }

    public static int iiI1L1iI(byte[] bArr, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[4];
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            byte b2 = I11lLL1[b & iiI1L1iI];
            if (b2 != -1) {
                int i3 = i + 1;
                bArr2[i] = b2;
                if (i3 == 4) {
                    byte b3 = bArr2[0];
                    byte b4 = bArr2[1];
                    byte b5 = bArr2[2];
                    byte b6 = bArr2[3];
                    if (b3 == -2 || b4 == -2) {
                        throw new IOException("Invalid Base64 input: incorrect padding, first two bytes cannot be padding");
                    }
                    outputStream.write((b3 << 2) | (b4 >> 4));
                    int i4 = i2 + 1;
                    if (b5 != -2) {
                        outputStream.write((b4 << 4) | (b5 >> 2));
                        i4 = i2 + 2;
                        if (b6 != -2) {
                            outputStream.write((b5 << 6) | b6);
                            i2 += 3;
                            i = 0;
                        }
                    } else if (b6 != -2) {
                        throw new IOException("Invalid Base64 input: incorrect padding, 4th byte must be padding if 3rd byte is");
                    }
                    i2 = i4;
                    i = 0;
                } else {
                    i = i3;
                }
            }
        }
        if (i == 0) {
            return i2;
        }
        throw new IOException("Invalid Base64 input: truncated");
    }
}
