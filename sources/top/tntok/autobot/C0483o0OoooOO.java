package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OoooOO  reason: case insensitive filesystem */
public final class C0483o0OoooOO {
    public static long i1LIL11l(String str, int i, int i2) {
        long j;
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            long j2 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    j2++;
                } else {
                    if (charAt < 2048) {
                        j = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j = 3;
                    } else {
                        int i3 = i + 1;
                        if (i3 < i2) {
                            c = str.charAt(i3);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            j2++;
                            i = i3;
                        } else {
                            j2 += 4;
                            i += 2;
                        }
                    }
                    j2 += j;
                }
                i++;
            }
            return j2;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public static long iiI1L1iI(String str) {
        return i1LIL11l(str, 0, str.length());
    }
}
