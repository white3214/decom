package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: top.tntok.autobot.o000o00  reason: case insensitive filesystem */
public class C0093o000o00 {
    public static final char[] i1LIL11l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String iiI1L1iI = System.getProperty("line.separator");
    public static final int[] illlI1lLIL = {28, 24, 20, 16, 12, 8, 4, 0};

    public static StringBuilder i1LIL11l(StringBuilder sb, long j) {
        for (int i = 0; i < 8; i++) {
            sb.append(i1LIL11l[((int) (j >> illlI1lLIL[i])) & 15]);
        }
        return sb;
    }

    public static StringBuilder iiI1L1iI(StringBuilder sb, byte b) {
        for (int i = 0; i < 2; i++) {
            sb.append(i1LIL11l[(b >> illlI1lLIL[i + 6]) & 15]);
        }
        return sb;
    }

    public static void illlI1lLIL(byte[] bArr, long j, OutputStream outputStream, int i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i < 0 || i >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException("illegal index: " + i + " into array of length " + bArr.length);
        } else if (outputStream != null) {
            long j2 = j + ((long) i);
            StringBuilder sb = new StringBuilder(74);
            while (i < bArr.length) {
                int length = bArr.length - i;
                if (length > 16) {
                    length = 16;
                }
                i1LIL11l(sb, j2).append(' ');
                for (int i2 = 0; i2 < 16; i2++) {
                    if (i2 < length) {
                        iiI1L1iI(sb, bArr[i2 + i]);
                    } else {
                        sb.append("  ");
                    }
                    sb.append(' ');
                }
                for (int i3 = 0; i3 < length; i3++) {
                    byte b = bArr[i3 + i];
                    if (b < 32 || b >= Byte.MAX_VALUE) {
                        sb.append(C0089o000Ooo.il1LilLllii);
                    } else {
                        sb.append((char) b);
                    }
                }
                sb.append(iiI1L1iI);
                outputStream.write(sb.toString().getBytes(Charset.defaultCharset()));
                outputStream.flush();
                sb.setLength(0);
                j2 += (long) length;
                i += 16;
            }
        } else {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
    }
}
