package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: top.tntok.autobot.o00o000o  reason: case insensitive filesystem */
public final class C0190o00o000o {
    public static final String i1LIL11l = "Q";
    public static final String iiI1L1iI = "B";
    public static final String iiIliillii = " \t\r\n";
    public static final Map<String, String> iilLil1i11I1;
    public static final String il1LilLllii = "?=";
    public static final String illlI1lLIL = "=?";

    static {
        HashMap hashMap = new HashMap();
        iilLil1i11I1 = hashMap;
        hashMap.put("iso-2022-cn", "ISO2022CN");
        hashMap.put("iso-2022-kr", "ISO2022KR");
        hashMap.put("utf-8", "UTF8");
        hashMap.put("utf8", "UTF8");
        hashMap.put("ja_jp.iso2022-7", "ISO2022JP");
        hashMap.put("ja_jp.eucjp", "EUCJIS");
        hashMap.put("euc-kr", "KSC5601");
        hashMap.put("euckr", "KSC5601");
        hashMap.put("us-ascii", C0021OooOoOO.I1iIiIi);
        hashMap.put("x-us-ascii", C0021OooOoOO.I1iIiIi);
    }

    public static String i1LIL11l(String str) throws C0272o00ooo0O, UnsupportedEncodingException {
        if (str.startsWith(illlI1lLIL)) {
            int indexOf = str.indexOf(63, 2);
            if (indexOf != -1) {
                String lowerCase = str.substring(2, indexOf).toLowerCase(Locale.ENGLISH);
                int i = indexOf + 1;
                int indexOf2 = str.indexOf(63, i);
                if (indexOf2 != -1) {
                    String substring = str.substring(i, indexOf2);
                    int i2 = indexOf2 + 1;
                    int indexOf3 = str.indexOf(il1LilLllii, i2);
                    if (indexOf3 != -1) {
                        String substring2 = str.substring(i2, indexOf3);
                        if (substring2.isEmpty()) {
                            return "";
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(substring2.length());
                            byte[] bytes = substring2.getBytes(StandardCharsets.US_ASCII);
                            if (substring.equals(iiI1L1iI)) {
                                i1IL1lILl1L1I.iiI1L1iI(bytes, byteArrayOutputStream);
                            } else if (substring.equals(i1LIL11l)) {
                                o0O0o0.iiI1L1iI(bytes, byteArrayOutputStream);
                            } else {
                                throw new UnsupportedEncodingException("Unknown RFC 2047 encoding: " + substring);
                            }
                            return new String(byteArrayOutputStream.toByteArray(), illlI1lLIL(lowerCase));
                        } catch (IOException unused) {
                            throw new UnsupportedEncodingException("Invalid RFC 2047 encoding");
                        }
                    } else {
                        throw new C0272o00ooo0O("Missing encoded text in RFC 2047 encoded-word: " + str);
                    }
                } else {
                    throw new C0272o00ooo0O("Missing encoding in RFC 2047 encoded-word: " + str);
                }
            } else {
                throw new C0272o00ooo0O("Missing charset in RFC 2047 encoded-word: " + str);
            }
        } else {
            throw new C0272o00ooo0O("Invalid RFC 2047 encoded-word: " + str);
        }
    }

    public static String iiI1L1iI(String str) throws UnsupportedEncodingException {
        if (!str.contains(illlI1lLIL)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (i < length) {
            if (iiIliillii.indexOf(str.charAt(i)) != -1) {
                int i4 = i;
                while (true) {
                    if (i4 >= length) {
                        int i5 = i4;
                        i2 = i;
                        i = i5;
                        break;
                    } else if (iiIliillii.indexOf(str.charAt(i4)) == -1) {
                        i3 = i4;
                        i2 = i;
                        i = i3;
                        break;
                    } else {
                        i4++;
                    }
                }
            } else {
                int i6 = i;
                while (i6 < length && iiIliillii.indexOf(str.charAt(i6)) == -1) {
                    i6++;
                }
                String substring = str.substring(i, i6);
                if (substring.startsWith(illlI1lLIL)) {
                    try {
                        String i1LIL11l2 = i1LIL11l(substring);
                        if (!z && i2 != -1) {
                            sb.append(str, i2, i3);
                            i2 = -1;
                        }
                        sb.append(i1LIL11l2);
                        z = true;
                        i = i6;
                    } catch (C0272o00ooo0O unused) {
                    }
                }
                if (i2 != -1) {
                    sb.append(str, i2, i3);
                    i2 = -1;
                }
                sb.append(substring);
                i = i6;
                z = false;
            }
        }
        return sb.toString();
    }

    public static String illlI1lLIL(String str) {
        if (str == null) {
            return null;
        }
        String str2 = iilLil1i11I1.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
