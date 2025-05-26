package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: top.tntok.autobot.o0O0o0O  reason: case insensitive filesystem */
public final class C0310o0O0o0O {
    public static final byte i1LIL11l = Byte.MAX_VALUE;
    public static final char[] iiI1L1iI = "0123456789ABCDEF".toCharArray();
    public static final byte[] il1LilLllii = new byte[128];
    public static final int illlI1lLIL = 128;

    static {
        int i = 0;
        while (true) {
            char[] cArr = iiI1L1iI;
            if (i < cArr.length) {
                byte[] bArr = il1LilLllii;
                char c = cArr[i];
                byte b = (byte) i;
                bArr[c] = b;
                bArr[Character.toLowerCase(c)] = b;
                i++;
            } else {
                return;
            }
        }
    }

    public static byte[] i1LIL11l(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '%') {
                byteArrayOutputStream.write((byte) charAt);
                i = i2;
            } else if (i2 > str.length() - 2) {
                break;
            } else {
                byte[] bArr = il1LilLllii;
                int i3 = i + 2;
                i += 3;
                byteArrayOutputStream.write((bArr[str.charAt(i2) & 127] << 4) | bArr[str.charAt(i3) & 127]);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String iiI1L1iI(String str) throws UnsupportedEncodingException {
        int indexOf = str.indexOf(39);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(0, indexOf);
        int indexOf2 = str.indexOf(39, indexOf + 1);
        if (indexOf2 == -1) {
            return str;
        }
        return new String(i1LIL11l(str.substring(indexOf2 + 1)), illlI1lLIL(substring));
    }

    public static String iiIliillii(String str) {
        if (!il1LilLllii(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.lastIndexOf(42));
        return sb.toString();
    }

    public static boolean il1LilLllii(String str) {
        if (str == null || str.lastIndexOf(42) != str.length() - 1) {
            return false;
        }
        return true;
    }

    public static String illlI1lLIL(String str) {
        return str;
    }
}
