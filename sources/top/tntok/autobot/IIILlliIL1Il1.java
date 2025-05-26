package top.tntok.autobot;

import java.io.InputStream;
import java.util.Objects;

public class IIILlliIL1Il1 extends InputStream {
    public long i1LIL11l;
    public final long iiIliillii;
    public final byte[] il1LilLllii;
    public int illlI1lLIL = -1;

    public IIILlliIL1Il1(byte[] bArr, long j) {
        this.il1LilLllii = iiI1L1iI(bArr);
        if (bArr.length != 0) {
            this.iiIliillii = j;
            return;
        }
        throw new IllegalArgumentException("repeatContent is empty.");
    }

    public static byte[] iiI1L1iI(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] != -1) {
                i++;
            } else {
                throw new IllegalArgumentException("repeatContent contains the end-of-stream marker -1");
            }
        }
        return bArr;
    }

    public int read() {
        long j = this.iiIliillii;
        if (j >= 0) {
            long j2 = this.i1LIL11l;
            if (j2 == j) {
                return -1;
            }
            this.i1LIL11l = j2 + 1;
        }
        byte[] bArr = this.il1LilLllii;
        int length = (this.illlI1lLIL + 1) % bArr.length;
        this.illlI1lLIL = length;
        return bArr[length] & i1IL1lILl1L1I.iiI1L1iI;
    }
}
