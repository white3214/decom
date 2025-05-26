package top.tntok.autobot;

import java.nio.charset.Charset;

/* renamed from: top.tntok.autobot.o0Ooooo  reason: case insensitive filesystem */
public final class C0485o0Ooooo {
    public static final Charset iiI1L1iI = Charset.forName(C0514o0o00oO.iilLil1i11I1);

    public static void i1LIL11l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    public static boolean iiI1L1iI(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static short iiIliillii(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static void iilLil1i11I1(Throwable th) {
        I11lLL1(th);
    }

    public static long il1LilLllii(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static int illlI1lLIL(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static <T extends Throwable> void I11lLL1(Throwable th) throws Throwable {
        throw th;
    }
}
