package top.tntok.autobot;

import java.io.UnsupportedEncodingException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class Ilili11iLIl {
    public static byte[] i1LIL11l = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, i1IL1lILl1L1I.iilLil1i11I1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C0186o00o00.iILiI1lll, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, PublicSuffixDatabase.IiIIlIL, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, C0186o00o00.i1L1lLllLLlIi, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    public static char[] iiI1L1iI = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    public static String i1LIL11l(String str) {
        try {
            return iiIliillii(str.getBytes(C0387o0OOoO0o.iiI1L1iI("AmLo9g==\n", "Vzauzg0NsT4=\n")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String iiI1L1iI(String str) {
        try {
            return new String(illlI1lLIL(str), C0387o0OOoO0o.iiI1L1iI("5xQA5A==\n", "skBG3BtIS3k=\n"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String iiIliillii(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = b & i1IL1lILl1L1I.iiI1L1iI;
            if (i2 == length) {
                stringBuffer.append(iiI1L1iI[b2 >>> 2]);
                stringBuffer.append(iiI1L1iI[(b & 3) << 4]);
                stringBuffer.append(C0387o0OOoO0o.iiI1L1iI("59M=\n", "2u5rrHTFZoc=\n"));
                break;
            }
            int i3 = i + 2;
            byte b3 = bArr[i2];
            if (i3 == length) {
                stringBuffer.append(iiI1L1iI[b2 >>> 2]);
                stringBuffer.append(iiI1L1iI[((b & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(iiI1L1iI[(b3 & 15) << 2]);
                stringBuffer.append(C0387o0OOoO0o.iiI1L1iI("cA==\n", "Tf/2n/3IBTY=\n"));
                break;
            }
            i += 3;
            byte b4 = bArr[i3];
            stringBuffer.append(iiI1L1iI[b2 >>> 2]);
            stringBuffer.append(iiI1L1iI[((b & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(iiI1L1iI[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(iiI1L1iI[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[LOOP:0: B:1:0x0013->B:32:0x00a0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[EDGE_INSN: B:37:0x00ac->B:33:0x00ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac A[EDGE_INSN: B:38:0x00ac->B:33:0x00ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac A[EDGE_INSN: B:39:0x00ac->B:33:0x00ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac A[EDGE_INSN: B:40:0x00ac->B:33:0x00ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029 A[LOOP:2: B:7:0x0029->B:10:0x0036, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v9 int) binds: [B:6:0x0025, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] il1LilLllii(java.lang.String r8) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "jpm37LgFD6I=\n"
            java.lang.String r2 = "28qaretGRus=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            byte[] r8 = r8.getBytes(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0013:
            if (r2 >= r1) goto L_0x00ac
        L_0x0015:
            byte[] r3 = i1LIL11l
            int r4 = r2 + 1
            byte r2 = r8[r2]
            byte r2 = r3[r2]
            r3 = -1
            if (r4 >= r1) goto L_0x0025
            if (r2 == r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = r4
            goto L_0x0015
        L_0x0025:
            if (r2 != r3) goto L_0x0029
            goto L_0x00ac
        L_0x0029:
            byte[] r5 = i1LIL11l
            int r6 = r4 + 1
            byte r4 = r8[r4]
            byte r4 = r5[r4]
            if (r6 >= r1) goto L_0x0038
            if (r4 == r3) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r4 = r6
            goto L_0x0029
        L_0x0038:
            if (r4 != r3) goto L_0x003c
            goto L_0x00ac
        L_0x003c:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            char r2 = (char) r2
            r0.append(r2)
        L_0x0047:
            int r2 = r6 + 1
            byte r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L_0x0060
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "W1+eesKJJV4D\n"
            java.lang.String r1 = "MizxQvq8HHM=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            byte[] r8 = r8.getBytes(r0)
            return r8
        L_0x0060:
            byte[] r7 = i1LIL11l
            byte r5 = r7[r5]
            if (r2 >= r1) goto L_0x006b
            if (r5 == r3) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r6 = r2
            goto L_0x0047
        L_0x006b:
            if (r5 != r3) goto L_0x006e
            goto L_0x00ac
        L_0x006e:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            char r4 = (char) r4
            r0.append(r4)
        L_0x007b:
            int r4 = r2 + 1
            byte r2 = r8[r2]
            if (r2 != r6) goto L_0x0092
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "qs/Q0hM0OFPy\n"
            java.lang.String r1 = "w7y/6isBAX4=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            byte[] r8 = r8.getBytes(r0)
            return r8
        L_0x0092:
            byte[] r7 = i1LIL11l
            byte r2 = r7[r2]
            if (r4 >= r1) goto L_0x009d
            if (r2 == r3) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r2 = r4
            goto L_0x007b
        L_0x009d:
            if (r2 != r3) goto L_0x00a0
            goto L_0x00ac
        L_0x00a0:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            char r2 = (char) r2
            r0.append(r2)
            r2 = r4
            goto L_0x0013
        L_0x00ac:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "UXY/9inJoekJ\n"
            java.lang.String r1 = "OAVQzhH8mMQ=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            byte[] r8 = r8.getBytes(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.Ilili11iLIl.il1LilLllii(java.lang.String):byte[]");
    }

    public static byte[] illlI1lLIL(String str) {
        try {
            return il1LilLllii(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static void iilLil1i11I1(String[] strArr) {
    }
}
