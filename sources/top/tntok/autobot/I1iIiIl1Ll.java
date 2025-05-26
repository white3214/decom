package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class I1iIiIl1Ll {
    public static final Pattern I1iIiIi = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final Pattern IiiL1llIIi = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern iILiI1lll = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern iilLiIIIi11i = Pattern.compile("(\\d{2,4})[^\\d]*");
    public final boolean I11lLL1;
    public final boolean IiIIlIL;
    public final String i1LIL11l;
    public final boolean iLLLILIiLi1Ii;
    public final String iiI1L1iI;
    public final String iiIliillii;
    public final boolean iilLil1i11I1;
    public final String il1LilLllii;
    public final long illlI1lLIL;

    public static final class iiI1L1iI {
        public boolean I11lLL1;
        public boolean IiIIlIL;
        @Nullable
        public String i1LIL11l;
        public boolean iLLLILIiLi1Ii;
        @Nullable
        public String iiI1L1iI;
        public String iiIliillii = "/";
        public boolean iilLil1i11I1;
        @Nullable
        public String il1LilLllii;
        public long illlI1lLIL = C0103o000o0oO.iiI1L1iI;

        public iiI1L1iI I11lLL1(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.iiI1L1iI = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public iiI1L1iI IiIIlIL() {
            this.iilLil1i11I1 = true;
            return this;
        }

        public iiI1L1iI i1LIL11l(String str) {
            return illlI1lLIL(str, false);
        }

        public iiI1L1iI iLLLILIiLi1Ii(String str) {
            if (str.startsWith("/")) {
                this.iiIliillii = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public I1iIiIl1Ll iiI1L1iI() {
            return new I1iIiIl1Ll(this);
        }

        public iiI1L1iI iiIliillii(String str) {
            return illlI1lLIL(str, true);
        }

        public iiI1L1iI iilLiIIIi11i(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.i1LIL11l = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        public iiI1L1iI iilLil1i11I1() {
            this.I11lLL1 = true;
            return this;
        }

        public iiI1L1iI il1LilLllii(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > C0103o000o0oO.iiI1L1iI) {
                j = 253402300799999L;
            }
            this.illlI1lLIL = j;
            this.iLLLILIiLi1Ii = true;
            return this;
        }

        public final iiI1L1iI illlI1lLIL(String str, boolean z) {
            if (str != null) {
                String il1LilLllii2 = C0487o0OooooO.il1LilLllii(str);
                if (il1LilLllii2 != null) {
                    this.il1LilLllii = il1LilLllii2;
                    this.IiIIlIL = z;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: " + str);
            }
            throw new NullPointerException("domain == null");
        }
    }

    public I1iIiIl1Ll(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.iiI1L1iI = str;
        this.i1LIL11l = str2;
        this.illlI1lLIL = j;
        this.il1LilLllii = str3;
        this.iiIliillii = str4;
        this.iilLil1i11I1 = z;
        this.I11lLL1 = z2;
        this.IiIIlIL = z3;
        this.iLLLILIiLi1Ii = z4;
    }

    public static long I1iIiIi(String str, int i, int i2) {
        int iiI1L1iI2 = iiI1L1iI(str, i, i2, false);
        Matcher matcher = I1iIiIi.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (iiI1L1iI2 < i2) {
            int iiI1L1iI3 = iiI1L1iI(str, iiI1L1iI2 + 1, i2, true);
            matcher.region(iiI1L1iI2, iiI1L1iI3);
            if (i4 == -1 && matcher.usePattern(I1iIiIi).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(iILiI1lll).matches()) {
                if (i6 == -1) {
                    Pattern pattern = IiiL1llIIi;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(iilLiIIIi11i).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            iiI1L1iI2 = iiI1L1iI(str, iiI1L1iI3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C0487o0OooooO.IiIIlIL);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static top.tntok.autobot.I1iIiIl1Ll IiIIlIL(long r23, top.tntok.autobot.C0109o000oo00 r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = top.tntok.autobot.C0487o0OooooO.IL1lILLLL1L(r0, r2, r1, r3)
            r5 = 61
            int r6 = top.tntok.autobot.C0487o0OooooO.IL1lILLLL1L(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = top.tntok.autobot.C0487o0OooooO.illiiliIILI(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0028
            int r8 = top.tntok.autobot.C0487o0OooooO.iiiiI1iILL11I(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002b
        L_0x0028:
            r0 = r7
            goto L_0x0135
        L_0x002b:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = top.tntok.autobot.C0487o0OooooO.illiiliIILI(r0, r6, r4)
            int r11 = top.tntok.autobot.C0487o0OooooO.iiiiI1iILL11I(r6)
            if (r11 == r10) goto L_0x0038
            return r7
        L_0x0038:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004d:
            if (r4 >= r1) goto L_0x00bb
            int r7 = top.tntok.autobot.C0487o0OooooO.IL1lILLLL1L(r0, r4, r1, r3)
            int r3 = top.tntok.autobot.C0487o0OooooO.IL1lILLLL1L(r0, r4, r7, r5)
            java.lang.String r4 = top.tntok.autobot.C0487o0OooooO.illiiliIILI(r0, r4, r3)
            if (r3 >= r7) goto L_0x0064
            int r3 = r3 + 1
            java.lang.String r3 = top.tntok.autobot.C0487o0OooooO.illiiliIILI(r0, r3, r7)
            goto L_0x0066
        L_0x0064:
            java.lang.String r3 = ""
        L_0x0066:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0079
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b3 }
            long r21 = I1iIiIi(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b3 }
        L_0x0076:
            r18 = 1
            goto L_0x00b3
        L_0x0079:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0086
            long r19 = i1L1lLllLLlIi(r3)     // Catch:{  }
            goto L_0x0076
        L_0x0086:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0095
            java.lang.String r14 = iILiI1lll(r3)     // Catch:{ IllegalArgumentException -> 0x00b3 }
            r17 = 0
            goto L_0x00b3
        L_0x0095:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009f
            r8 = r3
            goto L_0x00b3
        L_0x009f:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a9
            r15 = 1
            goto L_0x00b3
        L_0x00a9:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b3
            r16 = 1
        L_0x00b3:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004d
        L_0x00bb:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c3
        L_0x00c1:
            r11 = r0
            goto L_0x00e8
        L_0x00c3:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00da
        L_0x00d5:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00da:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e4
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c1
        L_0x00e4:
            r11 = r12
            goto L_0x00e8
        L_0x00e6:
            r11 = r21
        L_0x00e8:
            java.lang.String r0 = r25.iL1LIlIlI()
            if (r14 != 0) goto L_0x00f1
            r13 = r0
            r1 = 0
            goto L_0x00fb
        L_0x00f1:
            boolean r1 = illlI1lLIL(r0, r14)
            if (r1 != 0) goto L_0x00f9
            r1 = 0
            return r1
        L_0x00f9:
            r1 = 0
            r13 = r14
        L_0x00fb:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x0110
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.illlI1lLIL()
            java.lang.String r0 = r0.il1LilLllii(r13)
            if (r0 != 0) goto L_0x0110
            return r1
        L_0x0110:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011d
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r14 = r8
            goto L_0x012e
        L_0x011d:
            java.lang.String r1 = r25.iLLLILIiLi1Ii()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012d
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012d:
            r14 = r0
        L_0x012e:
            top.tntok.autobot.I1iIiIl1Ll r0 = new top.tntok.autobot.I1iIiIl1Ll
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
        L_0x0135:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.I1iIiIl1Ll.IiIIlIL(long, top.tntok.autobot.o000oo00, java.lang.String):top.tntok.autobot.I1iIiIl1Ll");
    }

    public static List<I1iIiIl1Ll> IiiL1llIIi(C0109o000oo00 o000oo00, C0094o000o000 o000o000) {
        List<String> iL1LIlIlI = o000o000.iL1LIlIlI("Set-Cookie");
        int size = iL1LIlIlI.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            I1iIiIl1Ll iilLiIIIi11i2 = iilLiIIIi11i(o000oo00, iL1LIlIlI.get(i));
            if (iilLiIIIi11i2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iilLiIIIi11i2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public static long i1L1lLllLLlIi(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public static String iILiI1lll(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String il1LilLllii2 = C0487o0OooooO.il1LilLllii(str);
            if (il1LilLllii2 != null) {
                return il1LilLllii2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static boolean iL1LIlIlI(C0109o000oo00 o000oo00, String str) {
        String iLLLILIiLi1Ii2 = o000oo00.iLLLILIiLi1Ii();
        if (iLLLILIiLi1Ii2.equals(str)) {
            return true;
        }
        if (!iLLLILIiLi1Ii2.startsWith(str)) {
            return false;
        }
        if (!str.endsWith("/") && iLLLILIiLi1Ii2.charAt(str.length()) != '/') {
            return false;
        }
        return true;
    }

    public static int iiI1L1iI(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    @Nullable
    public static I1iIiIl1Ll iilLiIIIi11i(C0109o000oo00 o000oo00, String str) {
        return IiIIlIL(System.currentTimeMillis(), o000oo00, str);
    }

    public static boolean illlI1lLIL(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C0487o0OooooO.ILllI11(str)) {
            return false;
        }
        return true;
    }

    public boolean I11lLL1(C0109o000oo00 o000oo00) {
        boolean z;
        if (this.IiIIlIL) {
            z = o000oo00.iL1LIlIlI().equals(this.il1LilLllii);
        } else {
            z = illlI1lLIL(o000oo00.iL1LIlIlI(), this.il1LilLllii);
        }
        if (!z || !iL1LIlIlI(o000oo00, this.iiIliillii)) {
            return false;
        }
        if (!this.iilLil1i11I1 || o000oo00.i111iLiiIIill()) {
            return true;
        }
        return false;
    }

    public String I1l1iIll1lIi1() {
        return this.i1LIL11l;
    }

    public String IL1lILLLL1L() {
        return this.iiIliillii;
    }

    public boolean Ii1liIIIiLi() {
        return this.iilLil1i11I1;
    }

    public String IilL11ii1I1Il(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iiI1L1iI);
        sb.append('=');
        sb.append(this.i1LIL11l);
        if (this.iLLLILIiLi1Ii) {
            if (this.illlI1lLIL == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C0103o000o0oO.iiI1L1iI(new Date(this.illlI1lLIL)));
            }
        }
        if (!this.IiIIlIL) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.il1LilLllii);
        }
        sb.append("; path=");
        sb.append(this.iiIliillii);
        if (this.iilLil1i11I1) {
            sb.append("; secure");
        }
        if (this.I11lLL1) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof I1iIiIl1Ll)) {
            return false;
        }
        I1iIiIl1Ll i1iIiIl1Ll = (I1iIiIl1Ll) obj;
        if (i1iIiIl1Ll.iiI1L1iI.equals(this.iiI1L1iI) && i1iIiIl1Ll.i1LIL11l.equals(this.i1LIL11l) && i1iIiIl1Ll.il1LilLllii.equals(this.il1LilLllii) && i1iIiIl1Ll.iiIliillii.equals(this.iiIliillii) && i1iIiIl1Ll.illlI1lLIL == this.illlI1lLIL && i1iIiIl1Ll.iilLil1i11I1 == this.iilLil1i11I1 && i1iIiIl1Ll.I11lLL1 == this.I11lLL1 && i1iIiIl1Ll.iLLLILIiLi1Ii == this.iLLLILIiLi1Ii && i1iIiIl1Ll.IiIIlIL == this.IiIIlIL) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.illlI1lLIL;
        return ((((((((((((((((527 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode()) * 31) + this.il1LilLllii.hashCode()) * 31) + this.iiIliillii.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.iilLil1i11I1 ^ true ? 1 : 0)) * 31) + (this.I11lLL1 ^ true ? 1 : 0)) * 31) + (this.iLLLILIiLi1Ii ^ true ? 1 : 0)) * 31) + (this.IiIIlIL ^ true ? 1 : 0);
    }

    public boolean i111iLiiIIill() {
        return this.iLLLILIiLi1Ii;
    }

    public String i1LIL11l() {
        return this.il1LilLllii;
    }

    public String iLLLILIiLi1Ii() {
        return this.iiI1L1iI;
    }

    public boolean iiIliillii() {
        return this.IiIIlIL;
    }

    public boolean iilLil1i11I1() {
        return this.I11lLL1;
    }

    public long il1LilLllii() {
        return this.illlI1lLIL;
    }

    public String toString() {
        return IilL11ii1I1Il(false);
    }

    public I1iIiIl1Ll(iiI1L1iI iii1l1ii) {
        String str = iii1l1ii.iiI1L1iI;
        if (str != null) {
            String str2 = iii1l1ii.i1LIL11l;
            if (str2 != null) {
                String str3 = iii1l1ii.il1LilLllii;
                if (str3 != null) {
                    this.iiI1L1iI = str;
                    this.i1LIL11l = str2;
                    this.illlI1lLIL = iii1l1ii.illlI1lLIL;
                    this.il1LilLllii = str3;
                    this.iiIliillii = iii1l1ii.iiIliillii;
                    this.iilLil1i11I1 = iii1l1ii.iilLil1i11I1;
                    this.I11lLL1 = iii1l1ii.I11lLL1;
                    this.iLLLILIiLi1Ii = iii1l1ii.iLLLILIiLi1Ii;
                    this.IiIIlIL = iii1l1ii.IiIIlIL;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }
}
