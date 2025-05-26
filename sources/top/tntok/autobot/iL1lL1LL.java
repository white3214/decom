package top.tntok.autobot;

import java.io.UnsupportedEncodingException;

public final class iL1lL1LL {
    public static final byte[] i1LIL11l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C0186o00o00.i1L1lLllLLlIi, 95};
    public static final byte[] iiI1L1iI = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String i1LIL11l(byte[] bArr) {
        return illlI1lLIL(bArr, iiI1L1iI);
    }

    public static byte[] iiI1L1iI(String str) {
        int i;
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        byte b = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt >= 'A' && charAt <= 'Z') {
                i = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i = charAt - 'G';
            } else if (charAt >= '0' && charAt <= '9') {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            b = (b << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                bArr[i4] = (byte) (b >> 16);
                int i6 = i4 + 2;
                bArr[i4 + 1] = (byte) (b >> 8);
                i4 += 3;
                bArr[i6] = (byte) b;
            }
        }
        int i7 = i3 % 4;
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            bArr[i4] = (byte) ((b << 12) >> 16);
            i4++;
        } else if (i7 == 3) {
            int i8 = b << 6;
            int i9 = i4 + 1;
            bArr[i4] = (byte) (i8 >> 16);
            i4 += 2;
            bArr[i9] = (byte) (i8 >> 8);
        }
        if (i4 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static String il1LilLllii(byte[] bArr) {
        return illlI1lLIL(bArr, i1LIL11l);
    }

    public static String illlI1lLIL(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            bArr3[i] = bArr2[(bArr[i2] & i1IL1lILl1L1I.iiI1L1iI) >> 2];
            int i3 = i2 + 1;
            bArr3[i + 1] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i3] & i1IL1lILl1L1I.iiI1L1iI) >> 4)];
            int i4 = i + 3;
            int i5 = i2 + 2;
            bArr3[i + 2] = bArr2[((bArr[i3] & 15) << 2) | ((bArr[i5] & i1IL1lILl1L1I.iiI1L1iI) >> 6)];
            i += 4;
            bArr3[i4] = bArr2[bArr[i5] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr2[(bArr[length] & i1IL1lILl1L1I.iiI1L1iI) >> 2];
            bArr3[i + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i + 2] = i1IL1lILl1L1I.iilLil1i11I1;
            bArr3[i + 3] = i1IL1lILl1L1I.iilLil1i11I1;
        } else if (length2 == 2) {
            bArr3[i] = bArr2[(bArr[length] & i1IL1lILl1L1I.iiI1L1iI) >> 2];
            int i6 = length + 1;
            bArr3[i + 1] = bArr2[((bArr[i6] & i1IL1lILl1L1I.iiI1L1iI) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i + 2] = bArr2[(bArr[i6] & 15) << 2];
            bArr3[i + 3] = i1IL1lILl1L1I.iilLil1i11I1;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
