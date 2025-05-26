package top.tntok.autobot;

import java.nio.charset.StandardCharsets;

/* renamed from: top.tntok.autobot.o0OOoO  reason: case insensitive filesystem */
public final class C0383o0OOoO implements C0129o00O0o0 {
    public static byte[] il1LilLllii(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return bArr;
    }

    public boolean i1LIL11l(String str) {
        return true;
    }

    public String iiI1L1iI(byte[] bArr, byte[] bArr2) {
        return new String(il1LilLllii(bArr, bArr2), StandardCharsets.UTF_8);
    }

    public byte[] illlI1lLIL(String str, byte[] bArr) {
        return il1LilLllii(str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
