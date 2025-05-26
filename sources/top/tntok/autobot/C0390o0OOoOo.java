package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoOo  reason: case insensitive filesystem */
public final class C0390o0OOoOo {
    public static int iiI1L1iI(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= i) {
            return length;
        }
        while (true) {
            byte b = bArr[i];
            if ((b & 128) == 0 || (b & 192) == 192) {
                return i;
            }
            i--;
        }
        return i;
    }
}
