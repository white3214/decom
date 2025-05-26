package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o000Ooo  reason: case insensitive filesystem */
public class C0089o000Ooo {
    public static final char I11lLL1 = '\\';
    public static final int I1iIiIi = 4;
    public static final int IL1lILLLL1L = 16;
    public static final char IiIIlIL;
    public static final int IiiL1llIIi = 255;
    public static final int i1L1lLllLLlIi = 65535;
    public static final String i1LIL11l = "";
    public static final int iILiI1lll = 8;
    public static final Pattern iL1LIlIlI = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    public static final char iLLLILIiLi1Ii = File.separatorChar;
    public static final String[] iiI1L1iI = new String[0];
    public static final String iiIliillii = Character.toString(il1LilLllii);
    public static final Pattern iilLiIIIi11i = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
    public static final char iilLil1i11I1 = '/';
    public static final char il1LilLllii = '.';
    public static final int illlI1lLIL = -1;

    static {
        if (il1l1IlL()) {
            IiIIlIL = '/';
        } else {
            IiIIlIL = '\\';
        }
    }

    public static boolean I11lLL1(String str, String str2, boolean z, o00O000o o00o000o) {
        if (str != null && str2 != null) {
            if (z) {
                str = IilliIIIlI1ll(str);
                str2 = IilliIIIlI1ll(str2);
                Objects.requireNonNull(str, "Error normalizing one or both of the file names");
                Objects.requireNonNull(str2, "Error normalizing one or both of the file names");
            }
            if (o00o000o == null) {
                o00o000o = o00O000o.SENSITIVE;
            }
            return o00o000o.illlI1lLIL(str, str2);
        } else if (str == null && str2 == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean I1I11Il1(String str) {
        Matcher matcher = iilLiIIIi11i.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i = 1; i <= 4; i++) {
            String group = matcher.group(i);
            if (Integer.parseInt(group) > 255) {
                return false;
            }
            if (group.length() > 1 && group.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    public static boolean I1IIIi1i1ILl(String str) {
        if (i1iI1iiLL1(str) || IIlL1llI1(str)) {
            return true;
        }
        return false;
    }

    public static String I1iIiIi(String str) {
        return IIlLill(i111iLiiIIill(str));
    }

    public static String I1l1iIll1lIi1(String str) {
        int iiLIIiIli;
        if (str == null || (iiLIIiIli = iiLIIiIli(str)) < 0) {
            return null;
        }
        if (iiLIIiIli > str.length()) {
            IiiL1llIIi(str + '/');
            return str + '/';
        }
        String substring = str.substring(0, iiLIIiIli);
        IiiL1llIIi(substring);
        return substring;
    }

    public static String IIIlll1lll(String str, boolean z) {
        char c;
        if (z) {
            c = '/';
        } else {
            c = '\\';
        }
        return iiIliillii(str, c, true);
    }

    public static String IILiIL1i11Li(String str, boolean z) {
        char c;
        if (z) {
            c = '/';
        } else {
            c = '\\';
        }
        return iiIliillii(str, c, false);
    }

    public static boolean IIi1l1i(String str, String str2, o00O000o o00o000o) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (o00o000o == null) {
            o00o000o = o00O000o.SENSITIVE;
        }
        String[] i1iLlIill1I = i1iLlIill1I(str2);
        ArrayDeque arrayDeque = new ArrayDeque(i1iLlIill1I.length);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        do {
            if (!arrayDeque.isEmpty()) {
                int[] iArr = (int[]) arrayDeque.pop();
                i2 = iArr[0];
                i = iArr[1];
                z = true;
            }
            while (i2 < i1iLlIill1I.length) {
                if (i1iLlIill1I[i2].equals("?")) {
                    i++;
                    if (i > str.length()) {
                        break;
                    }
                } else if (i1iLlIill1I[i2].equals("*")) {
                    if (i2 == i1iLlIill1I.length - 1) {
                        i = str.length();
                    }
                    z = true;
                    i2++;
                } else {
                    if (!z) {
                        if (!o00o000o.iiIliillii(str, i, i1iLlIill1I[i2])) {
                            break;
                        }
                    } else {
                        i = o00o000o.il1LilLllii(str, i, i1iLlIill1I[i2]);
                        if (i == -1) {
                            break;
                        }
                        int il1LilLllii2 = o00o000o.il1LilLllii(str, i + 1, i1iLlIill1I[i2]);
                        if (il1LilLllii2 >= 0) {
                            arrayDeque.push(new int[]{i2, il1LilLllii2});
                        }
                    }
                    i += i1iLlIill1I[i2].length();
                }
                z = false;
                i2++;
            }
            if (i2 == i1iLlIill1I.length && i == str.length()) {
                return true;
            }
        } while (!arrayDeque.isEmpty());
        return false;
    }

    public static boolean IIlL1llI1(String str) {
        String[] split = str.split("\\.", -1);
        int i = 0;
        while (i < split.length) {
            if (split[i].length() == 0) {
                if (i == split.length - 1) {
                    return true;
                }
                return false;
            } else if (!iL1LIlIlI.matcher(split[i]).matches()) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static String IIlLill(String str) {
        if (str == null) {
            return null;
        }
        IiiL1llIIi(str);
        int ILl1iII11Ll1 = ILl1iII11Ll1(str);
        if (ILl1iII11Ll1 == -1) {
            return str;
        }
        return str.substring(0, ILl1iII11Ll1);
    }

    public static boolean IIllllLiIlIl(String str, String str2) {
        return IIi1l1i(str, str2, o00O000o.SYSTEM);
    }

    public static boolean IL111l1(char c) {
        if (c == '/' || c == '\\') {
            return true;
        }
        return false;
    }

    public static String IL1IiilLlLI(String str) {
        return iiIliillii(str, iLLLILIiLi1Ii, false);
    }

    public static String IL1lILLLL1L(String str) {
        return illlI1lLIL(str, true);
    }

    public static int ILl1iII11Ll1(String str) throws IllegalArgumentException {
        if (str == null) {
            return -1;
        }
        if (!il1l1IlL() || str.indexOf(58, iILiI1lll(str)) == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            if (i1iiLIil1ILi(str) > lastIndexOf) {
                return -1;
            }
            return lastIndexOf;
        }
        throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
    }

    public static String ILllI11(String str) {
        if (str == null || str.indexOf(47) == -1) {
            return str;
        }
        return str.replace('/', '\\');
    }

    public static String Ii1liIIIiLi(String str) {
        return il1LilLllii(str, 1);
    }

    public static boolean IiIIlIL(String str, String str2) {
        return I11lLL1(str, str2, true, o00O000o.SYSTEM);
    }

    public static void IiiL1llIIi(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) != 0) {
                i++;
            } else {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static String IilL11ii1I1Il(String str) {
        return il1LilLllii(str, 0);
    }

    public static String IilliIIIlI1ll(String str) {
        return iiIliillii(str, iLLLILIiLi1Ii, true);
    }

    public static boolean IliiLiLliIl(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        IiiL1llIIi(str);
        if (strArr != null && strArr.length != 0) {
            String i1L1lLllLLlIi2 = i1L1lLllLLlIi(str);
            for (String equals : strArr) {
                if (i1L1lLllLLlIi2.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (ILl1iII11Ll1(str) == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static String i111iLiiIIill(String str) {
        if (str == null) {
            return null;
        }
        IiiL1llIIi(str);
        return str.substring(i1iiLIil1ILi(str) + 1);
    }

    public static boolean i11liIIl11Ii1(String str, String str2) {
        if (str == null) {
            return false;
        }
        IiiL1llIIi(str);
        if (str2 != null && !str2.isEmpty()) {
            return i1L1lLllLLlIi(str).equals(str2);
        }
        if (ILl1iII11Ll1(str) == -1) {
            return true;
        }
        return false;
    }

    public static String i1L1lLllLLlIi(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        int ILl1iII11Ll1 = ILl1iII11Ll1(str);
        if (ILl1iII11Ll1 == -1) {
            return "";
        }
        return str.substring(ILl1iII11Ll1 + 1);
    }

    public static boolean i1LIL11l(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        } else if (str2 == null) {
            return false;
        } else {
            o00O000o o00o000o = o00O000o.SYSTEM;
            if (o00o000o.illlI1lLIL(str, str2)) {
                return false;
            }
            return o00o000o.iilLil1i11I1(str2, str);
        }
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i1iI1iiLL1(java.lang.String r9) {
        /*
            java.lang.String r0 = "::"
            boolean r1 = r9.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            int r3 = r9.indexOf(r0)
            int r4 = r9.lastIndexOf(r0)
            if (r3 == r4) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r3 = ":"
            boolean r4 = r9.startsWith(r3)
            if (r4 == 0) goto L_0x0022
            boolean r4 = r9.startsWith(r0)
            if (r4 == 0) goto L_0x002e
        L_0x0022:
            boolean r4 = r9.endsWith(r3)
            if (r4 == 0) goto L_0x002f
            boolean r4 = r9.endsWith(r0)
            if (r4 != 0) goto L_0x002f
        L_0x002e:
            return r2
        L_0x002f:
            java.lang.String[] r3 = r9.split(r3)
            if (r1 == 0) goto L_0x0062
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.<init>(r3)
            boolean r3 = r9.endsWith(r0)
            if (r3 == 0) goto L_0x004a
            java.lang.String r9 = ""
            r4.add(r9)
            goto L_0x0059
        L_0x004a:
            boolean r9 = r9.startsWith(r0)
            if (r9 == 0) goto L_0x0059
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0059
            r4.remove(r2)
        L_0x0059:
            java.lang.String[] r9 = iiI1L1iI
            java.lang.Object[] r9 = r4.toArray(r9)
            r3 = r9
            java.lang.String[] r3 = (java.lang.String[]) r3
        L_0x0062:
            int r9 = r3.length
            r0 = 8
            if (r9 <= r0) goto L_0x0068
            return r2
        L_0x0068:
            r9 = 0
            r4 = 0
            r5 = 0
        L_0x006b:
            int r6 = r3.length
            r7 = 1
            if (r9 >= r6) goto L_0x00af
            r6 = r3[r9]
            int r8 = r6.length()
            if (r8 != 0) goto L_0x007b
            int r5 = r5 + r7
            if (r5 <= r7) goto L_0x00a9
            return r2
        L_0x007b:
            int r5 = r3.length
            int r5 = r5 - r7
            if (r9 != r5) goto L_0x0092
            java.lang.String r5 = "."
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0092
            boolean r5 = I1I11Il1(r6)
            if (r5 != 0) goto L_0x008e
            return r2
        L_0x008e:
            int r4 = r4 + 2
            r5 = 0
            goto L_0x00ab
        L_0x0092:
            int r5 = r6.length()
            r7 = 4
            if (r5 <= r7) goto L_0x009a
            return r2
        L_0x009a:
            r5 = 16
            int r5 = java.lang.Integer.parseInt(r6, r5)     // Catch:{ NumberFormatException -> 0x00ae }
            if (r5 < 0) goto L_0x00ae
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            int r4 = r4 + 1
        L_0x00ab:
            int r9 = r9 + 1
            goto L_0x006b
        L_0x00ae:
            return r2
        L_0x00af:
            if (r4 > r0) goto L_0x00b6
            if (r4 >= r0) goto L_0x00b5
            if (r1 == 0) goto L_0x00b6
        L_0x00b5:
            r2 = 1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0089o000Ooo.i1iI1iiLL1(java.lang.String):boolean");
    }

    public static String[] i1iLlIill1I(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 == '?' || c2 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c2 == '?') {
                    arrayList.add("?");
                } else if (c != '*') {
                    arrayList.add("*");
                }
            } else {
                sb.append(c2);
            }
            i++;
            c = c2;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(iiI1L1iI);
    }

    public static int i1iiLIil1ILi(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static int iILiI1lll(String str) {
        int lastIndexOf = str.lastIndexOf(iLLLILIiLi1Ii);
        int lastIndexOf2 = str.lastIndexOf(IiIIlIL);
        if (lastIndexOf == -1) {
            if (lastIndexOf2 == -1) {
                return 0;
            }
            return lastIndexOf2 + 1;
        } else if (lastIndexOf2 == -1) {
            return lastIndexOf + 1;
        } else {
            return Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
    }

    public static String iL1LIlIlI(String str) {
        return illlI1lLIL(str, false);
    }

    public static boolean iLLLILIiLi1Ii(String str, String str2) {
        return I11lLL1(str, str2, true, o00O000o.SENSITIVE);
    }

    public static String iiI1L1iI(String str, String str2) {
        int iiLIIiIli = iiLIIiIli(str2);
        if (iiLIIiIli < 0) {
            return null;
        }
        if (iiLIIiIli > 0) {
            return IilliIIIlI1ll(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return IilliIIIlI1ll(str2);
        }
        if (IL111l1(str.charAt(length - 1))) {
            return IilliIIIlI1ll(str + str2);
        }
        return IilliIIIlI1ll(str + '/' + str2);
    }

    public static String iiIliillii(String str, char c, boolean z) {
        boolean z2;
        String str2 = str;
        char c2 = c;
        if (str2 == null) {
            return null;
        }
        IiiL1llIIi(str);
        int length = str.length();
        if (length == 0) {
            return str2;
        }
        int iiLIIiIli = iiLIIiIli(str);
        if (iiLIIiIli < 0) {
            return null;
        }
        int i = length + 2;
        char[] cArr = new char[i];
        str2.getChars(0, str.length(), cArr, 0);
        char c3 = iLLLILIiLi1Ii;
        if (c2 == c3) {
            c3 = IiIIlIL;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] == c3) {
                cArr[i2] = c2;
            }
        }
        if (cArr[length - 1] != c2) {
            cArr[length] = c2;
            length++;
            z2 = false;
        } else {
            z2 = true;
        }
        int i3 = iiLIIiIli + 1;
        int i4 = i3;
        while (i4 < length) {
            if (cArr[i4] == c2) {
                int i5 = i4 - 1;
                if (cArr[i5] == c2) {
                    System.arraycopy(cArr, i4, cArr, i5, length - i4);
                    length--;
                    i4--;
                }
            }
            i4++;
        }
        int i6 = i3;
        while (i6 < length) {
            if (cArr[i6] == c2) {
                int i7 = i6 - 1;
                if (cArr[i7] == '.' && (i6 == i3 || cArr[i6 - 2] == c2)) {
                    if (i6 == length - 1) {
                        z2 = true;
                    }
                    System.arraycopy(cArr, i6 + 1, cArr, i7, length - i6);
                    length -= 2;
                    i6--;
                }
            }
            i6++;
        }
        int i8 = iiLIIiIli + 2;
        int i9 = i8;
        while (i9 < length) {
            if (cArr[i9] == c2 && cArr[i9 - 1] == '.' && cArr[i9 - 2] == '.' && (i9 == i8 || cArr[i9 - 3] == c2)) {
                if (i9 != i8) {
                    if (i9 == length - 1) {
                        z2 = true;
                    }
                    int i10 = i9 - 4;
                    while (true) {
                        if (i10 < iiLIIiIli) {
                            int i11 = i9 + 1;
                            System.arraycopy(cArr, i11, cArr, iiLIIiIli, length - i9);
                            length -= i11 - iiLIIiIli;
                            i9 = i3;
                            break;
                        } else if (cArr[i10] == c2) {
                            int i12 = i10 + 1;
                            System.arraycopy(cArr, i9 + 1, cArr, i12, length - i9);
                            length -= i9 - i10;
                            i9 = i12;
                            break;
                        } else {
                            i10--;
                        }
                    }
                } else {
                    return null;
                }
            }
            i9++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= iiLIIiIli) {
            return new String(cArr, 0, length);
        }
        if (!z2 || !z) {
            return new String(cArr, 0, length - 1);
        }
        return new String(cArr, 0, length);
    }

    public static int iiLIIiIli(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return IL111l1(charAt) ? 1 : 0;
        } else if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            return Math.min(indexOf, indexOf2) + 1;
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    if (upperCase == '/') {
                        return 1;
                    }
                    return -1;
                } else if (length == 2 || !IL111l1(str.charAt(2))) {
                    return 2;
                } else {
                    return 3;
                }
            } else if (!IL111l1(charAt) || !IL111l1(charAt2)) {
                return IL111l1(charAt) ? 1 : 0;
            } else {
                int indexOf3 = str.indexOf(47, 2);
                int indexOf4 = str.indexOf(92, 2);
                if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                    return -1;
                }
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                }
                if (indexOf4 == -1) {
                    indexOf4 = indexOf3;
                }
                int min = Math.min(indexOf3, indexOf4);
                int i = min + 1;
                if (I1IIIi1i1ILl(str.substring(2, min))) {
                    return i;
                }
                return -1;
            }
        }
    }

    public static boolean iiiiI1iILL11I(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        IiiL1llIIi(str);
        if (collection != null && !collection.isEmpty()) {
            String i1L1lLllLLlIi2 = i1L1lLllLLlIi(str);
            for (String equals : collection) {
                if (i1L1lLllLLlIi2.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (ILl1iII11Ll1(str) == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean iilLiIIIi11i(String str, String str2) {
        return I11lLL1(str, str2, false, o00O000o.SYSTEM);
    }

    public static boolean iilLil1i11I1(String str, String str2) {
        return I11lLL1(str, str2, false, o00O000o.SENSITIVE);
    }

    public static String il1LilLllii(String str, int i) {
        int iiLIIiIli;
        if (str == null || (iiLIIiIli = iiLIIiIli(str)) < 0) {
            return null;
        }
        int i1iiLIil1ILi = i1iiLIil1ILi(str);
        int i2 = i + i1iiLIil1ILi;
        if (iiLIIiIli >= str.length() || i1iiLIil1ILi < 0 || iiLIIiIli >= i2) {
            return "";
        }
        String substring = str.substring(iiLIIiIli, i2);
        IiiL1llIIi(substring);
        return substring;
    }

    public static boolean il1l1IlL() {
        if (iLLLILIiLi1Ii == '\\') {
            return true;
        }
        return false;
    }

    public static String iliilLllIl1(String str) {
        if (str == null) {
            return null;
        }
        if (il1l1IlL()) {
            return ILllI11(str);
        }
        return illiiliIILI(str);
    }

    public static boolean illi1LIILLiL(String str, String str2) {
        return IIi1l1i(str, str2, o00O000o.SENSITIVE);
    }

    public static String illiiliIILI(String str) {
        if (str == null || str.indexOf(92) == -1) {
            return str;
        }
        return str.replace('\\', '/');
    }

    public static String illlI1lLIL(String str, boolean z) {
        int iiLIIiIli;
        if (str == null || (iiLIIiIli = iiLIIiIli(str)) < 0) {
            return null;
        }
        if (iiLIIiIli < str.length()) {
            int i1iiLIil1ILi = i1iiLIil1ILi(str);
            if (i1iiLIil1ILi < 0) {
                return str.substring(0, iiLIIiIli);
            }
            int i = i1iiLIil1ILi + (z ? 1 : 0);
            if (i == 0) {
                i++;
            }
            return str.substring(0, i);
        } else if (z) {
            return I1l1iIll1lIi1(str);
        } else {
            return str;
        }
    }
}
