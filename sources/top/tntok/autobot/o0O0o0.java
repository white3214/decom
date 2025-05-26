package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;

public final class o0O0o0 {
    public static final int iiI1L1iI = 4;

    public static int i1LIL11l(byte b) throws IOException {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new IOException("Invalid quoted printable encoding: not a valid hex digit: " + b);
    }

    public static int iiI1L1iI(byte[] bArr, OutputStream outputStream) throws IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b == 95) {
                outputStream.write(32);
            } else if (b == 61) {
                int i4 = i + 2;
                if (i4 < length) {
                    byte b2 = bArr[i3];
                    i += 3;
                    byte b3 = bArr[i4];
                    if (b2 != 13) {
                        outputStream.write((i1LIL11l(b2) << 4) | i1LIL11l(b3));
                        i2++;
                    } else if (b3 != 10) {
                        throw new IOException("Invalid quoted printable encoding; CR must be followed by LF");
                    }
                } else {
                    throw new IOException("Invalid quoted printable encoding; truncated escape sequence");
                }
            } else {
                outputStream.write(b);
                i2++;
            }
            i = i3;
        }
        return i2;
    }
}
