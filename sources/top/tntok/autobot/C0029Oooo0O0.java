package top.tntok.autobot;

import javax.security.auth.x500.X500Principal;

/* renamed from: top.tntok.autobot.Oooo0O0  reason: case insensitive filesystem */
public final class C0029Oooo0O0 {
    public char[] I11lLL1;
    public final int i1LIL11l;
    public final String iiI1L1iI;
    public int iiIliillii;
    public int iilLil1i11I1;
    public int il1LilLllii;
    public int illlI1lLIL;

    public C0029Oooo0O0(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.iiI1L1iI = name;
        this.i1LIL11l = name.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String I11lLL1() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r6.I11lLL1
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r6.il1LilLllii = r0
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
        L_0x001d:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            r3 = 61
            if (r0 >= r1) goto L_0x0032
            char[] r4 = r6.I11lLL1
            char r4 = r4[r0]
            if (r4 == r3) goto L_0x0032
            if (r4 == r2) goto L_0x0032
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x001d
        L_0x0032:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00d3
            r6.iiIliillii = r0
            char[] r1 = r6.I11lLL1
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0071
        L_0x003e:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r6.I11lLL1
            char r5 = r5[r0]
            if (r5 == r3) goto L_0x0051
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x003e
        L_0x0051:
            char[] r5 = r6.I11lLL1
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x0071
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.iiI1L1iI
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0071:
            int r0 = r6.illlI1lLIL
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
        L_0x0077:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            if (r0 >= r1) goto L_0x0088
            char[] r1 = r6.I11lLL1
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0088
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x0077
        L_0x0088:
            int r0 = r6.iiIliillii
            int r1 = r6.il1LilLllii
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00c8
            char[] r2 = r6.I11lLL1
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00c8
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x00a5
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00c8
        L_0x00a5:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00b5
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00c8
        L_0x00b5:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00c5
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00c8
        L_0x00c5:
            int r1 = r1 + r3
            r6.il1LilLllii = r1
        L_0x00c8:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.I11lLL1
            int r3 = r6.il1LilLllii
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.iiI1L1iI
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0029Oooo0O0.I11lLL1():java.lang.String");
    }

    public String i1LIL11l(String str) {
        String str2;
        this.illlI1lLIL = 0;
        this.il1LilLllii = 0;
        this.iiIliillii = 0;
        this.iilLil1i11I1 = 0;
        this.I11lLL1 = this.iiI1L1iI.toCharArray();
        String I11lLL12 = I11lLL1();
        if (I11lLL12 == null) {
            return null;
        }
        do {
            int i = this.illlI1lLIL;
            if (i == this.i1LIL11l) {
                return null;
            }
            char c = this.I11lLL1[i];
            if (c == '\"') {
                str2 = iLLLILIiLi1Ii();
            } else if (c == '#') {
                str2 = iilLil1i11I1();
            } else if (c == '+' || c == ',' || c == ';') {
                str2 = "";
            } else {
                str2 = iiI1L1iI();
            }
            if (str.equalsIgnoreCase(I11lLL12)) {
                return str2;
            }
            int i2 = this.illlI1lLIL;
            if (i2 >= this.i1LIL11l) {
                return null;
            }
            char c2 = this.I11lLL1[i2];
            if (c2 == ',' || c2 == ';' || c2 == '+') {
                this.illlI1lLIL = i2 + 1;
                I11lLL12 = I11lLL1();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.iiI1L1iI);
            }
        } while (I11lLL12 != null);
        throw new IllegalStateException("Malformed DN: " + this.iiI1L1iI);
    }

    public final String iLLLILIiLi1Ii() {
        int i = this.illlI1lLIL + 1;
        this.illlI1lLIL = i;
        this.il1LilLllii = i;
        this.iiIliillii = i;
        while (true) {
            int i2 = this.illlI1lLIL;
            if (i2 != this.i1LIL11l) {
                char[] cArr = this.I11lLL1;
                char c = cArr[i2];
                if (c == '\"') {
                    this.illlI1lLIL = i2 + 1;
                    while (true) {
                        int i3 = this.illlI1lLIL;
                        if (i3 >= this.i1LIL11l || this.I11lLL1[i3] != ' ') {
                            char[] cArr2 = this.I11lLL1;
                            int i4 = this.il1LilLllii;
                        } else {
                            this.illlI1lLIL = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.I11lLL1;
                    int i42 = this.il1LilLllii;
                    return new String(cArr22, i42, this.iiIliillii - i42);
                }
                if (c == '\\') {
                    cArr[this.iiIliillii] = il1LilLllii();
                } else {
                    cArr[this.iiIliillii] = c;
                }
                this.illlI1lLIL++;
                this.iiIliillii++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.iiI1L1iI);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return new java.lang.String(r1, r2, r8.iilLil1i11I1 - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String iiI1L1iI() {
        /*
            r8 = this;
            int r0 = r8.illlI1lLIL
            r8.il1LilLllii = r0
            r8.iiIliillii = r0
        L_0x0006:
            int r0 = r8.illlI1lLIL
            int r1 = r8.i1LIL11l
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.I11lLL1
            int r2 = r8.il1LilLllii
            int r3 = r8.iiIliillii
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.I11lLL1
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x0051
            r5 = 92
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0051
            if (r2 == r3) goto L_0x0051
            int r3 = r8.iiIliillii
            int r4 = r3 + 1
            r8.iiIliillii = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.illlI1lLIL = r0
            goto L_0x0006
        L_0x003e:
            int r0 = r8.iiIliillii
            int r2 = r0 + 1
            r8.iiIliillii = r2
            char r2 = r8.il1LilLllii()
            r1[r0] = r2
            int r0 = r8.illlI1lLIL
            int r0 = r0 + 1
            r8.illlI1lLIL = r0
            goto L_0x0006
        L_0x0051:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.il1LilLllii
            int r3 = r8.iiIliillii
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005c:
            int r2 = r8.iiIliillii
            r8.iilLil1i11I1 = r2
            int r0 = r0 + 1
            r8.illlI1lLIL = r0
            int r0 = r2 + 1
            r8.iiIliillii = r0
            r1[r2] = r6
        L_0x006a:
            int r0 = r8.illlI1lLIL
            int r1 = r8.i1LIL11l
            if (r0 >= r1) goto L_0x0083
            char[] r2 = r8.I11lLL1
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0083
            int r1 = r8.iiIliillii
            int r7 = r1 + 1
            r8.iiIliillii = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.illlI1lLIL = r0
            goto L_0x006a
        L_0x0083:
            if (r0 == r1) goto L_0x008f
            char[] r1 = r8.I11lLL1
            char r0 = r1[r0]
            if (r0 == r3) goto L_0x008f
            if (r0 == r4) goto L_0x008f
            if (r0 != r5) goto L_0x0006
        L_0x008f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.I11lLL1
            int r2 = r8.il1LilLllii
            int r3 = r8.iilLil1i11I1
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0029Oooo0O0.iiI1L1iI():java.lang.String");
    }

    public final char iiIliillii() {
        int i;
        int i2;
        int illlI1lLIL2 = illlI1lLIL(this.illlI1lLIL);
        this.illlI1lLIL++;
        if (illlI1lLIL2 < 128) {
            return (char) illlI1lLIL2;
        }
        if (illlI1lLIL2 < 192 || illlI1lLIL2 > 247) {
            return '?';
        }
        if (illlI1lLIL2 <= 223) {
            i2 = illlI1lLIL2 & 31;
            i = 1;
        } else if (illlI1lLIL2 <= 239) {
            i2 = illlI1lLIL2 & 15;
            i = 2;
        } else {
            i2 = illlI1lLIL2 & 7;
            i = 3;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.illlI1lLIL;
            int i5 = i4 + 1;
            this.illlI1lLIL = i5;
            if (i5 == this.i1LIL11l || this.I11lLL1[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.illlI1lLIL = i6;
            int illlI1lLIL3 = illlI1lLIL(i6);
            this.illlI1lLIL++;
            if ((illlI1lLIL3 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (illlI1lLIL3 & 63);
        }
        return (char) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = r6.I11lLL1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String iilLil1i11I1() {
        /*
            r6 = this;
            int r0 = r6.illlI1lLIL
            int r1 = r0 + 4
            int r2 = r6.i1LIL11l
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L_0x0098
            r6.il1LilLllii = r0
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
        L_0x0010:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            if (r0 == r1) goto L_0x0054
            char[] r1 = r6.I11lLL1
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L_0x0054
            r4 = 44
            if (r2 == r4) goto L_0x0054
            r4 = 59
            if (r2 != r4) goto L_0x0027
            goto L_0x0054
        L_0x0027:
            r4 = 32
            if (r2 != r4) goto L_0x0042
            r6.iiIliillii = r0
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
        L_0x0031:
            int r0 = r6.illlI1lLIL
            int r1 = r6.i1LIL11l
            if (r0 >= r1) goto L_0x0056
            char[] r1 = r6.I11lLL1
            char r1 = r1[r0]
            if (r1 != r4) goto L_0x0056
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x0031
        L_0x0042:
            r4 = 65
            if (r2 < r4) goto L_0x004f
            r4 = 70
            if (r2 > r4) goto L_0x004f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L_0x004f:
            int r0 = r0 + 1
            r6.illlI1lLIL = r0
            goto L_0x0010
        L_0x0054:
            r6.iiIliillii = r0
        L_0x0056:
            int r0 = r6.iiIliillii
            int r1 = r6.il1LilLllii
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L_0x0081
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0081
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L_0x0069:
            if (r4 >= r2) goto L_0x0077
            int r5 = r6.illlI1lLIL(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0077:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.I11lLL1
            int r3 = r6.il1LilLllii
            r1.<init>(r2, r3, r0)
            return r1
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.iiI1L1iI
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.iiI1L1iI
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0029Oooo0O0.iilLil1i11I1():java.lang.String");
    }

    public final char il1LilLllii() {
        int i = this.illlI1lLIL + 1;
        this.illlI1lLIL = i;
        if (i != this.i1LIL11l) {
            char c = this.I11lLL1[i];
            if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
                return c;
            }
            switch (c) {
                case '*':
                case '+':
                case ',':
                    return c;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c;
                        default:
                            return iiIliillii();
                    }
            }
        } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.iiI1L1iI);
        }
    }

    public final int illlI1lLIL(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.i1LIL11l) {
            char[] cArr = this.I11lLL1;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.iiI1L1iI);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.iiI1L1iI);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.iiI1L1iI);
    }
}
