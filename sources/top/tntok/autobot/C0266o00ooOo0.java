package top.tntok.autobot;

import java.util.HashMap;
import java.util.Map;

/* renamed from: top.tntok.autobot.o00ooOo0  reason: case insensitive filesystem */
public class C0266o00ooOo0 {
    public int i1LIL11l = 0;
    public char[] iiI1L1iI = null;
    public int iiIliillii = 0;
    public boolean iilLil1i11I1 = false;
    public int il1LilLllii = 0;
    public int illlI1lLIL = 0;

    public Map<String, String> I11lLL1(char[] cArr, char c) {
        if (cArr == null) {
            return new HashMap();
        }
        return iLLLILIiLi1Ii(cArr, 0, cArr.length, c);
    }

    public final String IiIIlIL(char[] cArr) {
        int i = this.i1LIL11l;
        this.il1LilLllii = i;
        this.iiIliillii = i;
        boolean z = false;
        boolean z2 = false;
        while (i1LIL11l()) {
            char c = this.iiI1L1iI[this.i1LIL11l];
            if (!z && il1LilLllii(c, cArr)) {
                break;
            }
            if (!z2 && c == '\"') {
                z = !z;
            }
            if (z2 || c != '\\') {
                z2 = false;
            } else {
                z2 = true;
            }
            this.iiIliillii++;
            this.i1LIL11l++;
        }
        return iiI1L1iI(true);
    }

    public void IiiL1llIIi(boolean z) {
        this.iilLil1i11I1 = z;
    }

    public final boolean i1LIL11l() {
        if (this.i1LIL11l < this.illlI1lLIL) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> iLLLILIiLi1Ii(char[] r6, int r7, int r8, char r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x000a
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            return r6
        L_0x000a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r3 = r6.clone()
            char[] r3 = (char[]) r3
            r5.iiI1L1iI = r3
            r5.i1LIL11l = r7
            r5.illlI1lLIL = r8
        L_0x001b:
            boolean r7 = r5.i1LIL11l()
            if (r7 == 0) goto L_0x0083
            r7 = 61
            r8 = 2
            char[] r8 = new char[r8]
            r8[r0] = r7
            r8[r1] = r9
            java.lang.String r8 = r5.iilLiIIIi11i(r8)
            boolean r3 = r5.i1LIL11l()
            if (r3 == 0) goto L_0x0059
            int r3 = r5.i1LIL11l
            char r4 = r6[r3]
            if (r4 != r7) goto L_0x0059
            int r3 = r3 + r1
            r5.i1LIL11l = r3
            char[] r7 = new char[r1]
            r7[r0] = r9
            java.lang.String r7 = r5.IiIIlIL(r7)
            if (r7 == 0) goto L_0x005a
            boolean r3 = top.tntok.autobot.C0310o0O0o0O.il1LilLllii(r8)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            if (r3 == 0) goto L_0x0054
            java.lang.String r7 = top.tntok.autobot.C0310o0O0o0O.iiI1L1iI(r7)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            goto L_0x005a
        L_0x0052:
            goto L_0x005a
        L_0x0054:
            java.lang.String r7 = top.tntok.autobot.C0190o00o000o.iiI1L1iI(r7)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            boolean r3 = r5.i1LIL11l()
            if (r3 == 0) goto L_0x0069
            int r3 = r5.i1LIL11l
            char r4 = r6[r3]
            if (r4 != r9) goto L_0x0069
            int r3 = r3 + r1
            r5.i1LIL11l = r3
        L_0x0069:
            if (r8 == 0) goto L_0x001b
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x001b
            java.lang.String r8 = top.tntok.autobot.C0310o0O0o0O.iiIliillii(r8)
            boolean r3 = r5.iilLil1i11I1
            if (r3 == 0) goto L_0x007f
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toLowerCase(r3)
        L_0x007f:
            r2.put(r8, r7)
            goto L_0x001b
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0266o00ooOo0.iLLLILIiLi1Ii(char[], int, int, char):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String iiI1L1iI(boolean r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.il1LilLllii
            int r1 = r4.iiIliillii
            if (r0 >= r1) goto L_0x0017
            char[] r1 = r4.iiI1L1iI
            char r0 = r1[r0]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0017
            int r0 = r4.il1LilLllii
            int r0 = r0 + 1
            r4.il1LilLllii = r0
            goto L_0x0000
        L_0x0017:
            int r0 = r4.iiIliillii
            int r1 = r4.il1LilLllii
            if (r0 <= r1) goto L_0x0030
            char[] r1 = r4.iiI1L1iI
            int r0 = r0 + -1
            char r0 = r1[r0]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0030
            int r0 = r4.iiIliillii
            int r0 = r0 + -1
            r4.iiIliillii = r0
            goto L_0x0017
        L_0x0030:
            if (r5 == 0) goto L_0x0051
            int r5 = r4.iiIliillii
            int r0 = r4.il1LilLllii
            int r1 = r5 - r0
            r2 = 2
            if (r1 < r2) goto L_0x0051
            char[] r1 = r4.iiI1L1iI
            char r2 = r1[r0]
            r3 = 34
            if (r2 != r3) goto L_0x0051
            int r2 = r5 + -1
            char r1 = r1[r2]
            if (r1 != r3) goto L_0x0051
            int r0 = r0 + 1
            r4.il1LilLllii = r0
            int r5 = r5 + -1
            r4.iiIliillii = r5
        L_0x0051:
            int r5 = r4.iiIliillii
            int r0 = r4.il1LilLllii
            if (r5 <= r0) goto L_0x0060
            java.lang.String r1 = new java.lang.String
            char[] r2 = r4.iiI1L1iI
            int r5 = r5 - r0
            r1.<init>(r2, r0, r5)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0266o00ooOo0.iiI1L1iI(boolean):java.lang.String");
    }

    public Map<String, String> iiIliillii(String str, char c) {
        if (str == null) {
            return new HashMap();
        }
        return I11lLL1(str.toCharArray(), c);
    }

    public final String iilLiIIIi11i(char[] cArr) {
        int i = this.i1LIL11l;
        this.il1LilLllii = i;
        this.iiIliillii = i;
        while (i1LIL11l() && !il1LilLllii(this.iiI1L1iI[this.i1LIL11l], cArr)) {
            this.iiIliillii++;
            this.i1LIL11l++;
        }
        return iiI1L1iI(false);
    }

    public Map<String, String> iilLil1i11I1(String str, char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return new HashMap();
        }
        char c = cArr[0];
        if (str != null) {
            int length = str.length();
            for (char c2 : cArr) {
                int indexOf = str.indexOf(c2);
                if (indexOf != -1 && indexOf < length) {
                    c = c2;
                    length = indexOf;
                }
            }
        }
        return iiIliillii(str, c);
    }

    public final boolean il1LilLllii(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    public boolean illlI1lLIL() {
        return this.iilLil1i11I1;
    }
}
