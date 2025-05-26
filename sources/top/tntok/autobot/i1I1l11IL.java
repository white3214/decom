package top.tntok.autobot;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class i1I1l11IL {
    public static final i1I1l11IL IL1lILLLL1L = new iiI1L1iI().IiIIlIL().il1LilLllii(Integer.MAX_VALUE, TimeUnit.SECONDS).iiI1L1iI();
    public static final i1I1l11IL i1L1lLllLLlIi = new iiI1L1iI().iilLil1i11I1().iiI1L1iI();
    public final boolean I11lLL1;
    @Nullable
    public String I1iIiIi;
    public final int IiIIlIL;
    public final boolean IiiL1llIIi;
    public final boolean i1LIL11l;
    public final boolean iILiI1lll;
    public final int iLLLILIiLi1Ii;
    public final boolean iiI1L1iI;
    public final boolean iiIliillii;
    public final boolean iilLiIIIi11i;
    public final boolean iilLil1i11I1;
    public final int il1LilLllii;
    public final int illlI1lLIL;

    public static final class iiI1L1iI {
        public boolean I11lLL1;
        public boolean i1LIL11l;
        public boolean iLLLILIiLi1Ii;
        public boolean iiI1L1iI;
        public int iiIliillii = -1;
        public boolean iilLil1i11I1;
        public int il1LilLllii = -1;
        public int illlI1lLIL = -1;

        public iiI1L1iI I11lLL1() {
            this.i1LIL11l = true;
            return this;
        }

        public iiI1L1iI IiIIlIL() {
            this.iilLil1i11I1 = true;
            return this;
        }

        public iiI1L1iI i1LIL11l() {
            this.iLLLILIiLi1Ii = true;
            return this;
        }

        public iiI1L1iI iLLLILIiLi1Ii() {
            this.I11lLL1 = true;
            return this;
        }

        public i1I1l11IL iiI1L1iI() {
            return new i1I1l11IL(this);
        }

        public iiI1L1iI iiIliillii(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.iiIliillii = i2;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i);
        }

        public iiI1L1iI iilLil1i11I1() {
            this.iiI1L1iI = true;
            return this;
        }

        public iiI1L1iI il1LilLllii(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.il1LilLllii = i2;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public iiI1L1iI illlI1lLIL(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.illlI1lLIL = i2;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i);
        }
    }

    public i1I1l11IL(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.iiI1L1iI = z;
        this.i1LIL11l = z2;
        this.illlI1lLIL = i;
        this.il1LilLllii = i2;
        this.iiIliillii = z3;
        this.iilLil1i11I1 = z4;
        this.I11lLL1 = z5;
        this.iLLLILIiLi1Ii = i3;
        this.IiIIlIL = i4;
        this.iilLiIIIi11i = z6;
        this.IiiL1llIIi = z7;
        this.iILiI1lll = z8;
        this.I1iIiIi = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static top.tntok.autobot.i1I1l11IL I1iIiIi(top.tntok.autobot.C0094o000o000 r22) {
        /*
            r0 = r22
            int r1 = r22.I1iIiIi()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0147
            java.lang.String r2 = r0.iLLLILIiLi1Ii(r6)
            java.lang.String r5 = r0.IL1lILLLL1L(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x003b
        L_0x0030:
            r8 = r5
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0140
            goto L_0x002e
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x0140
            java.lang.String r3 = "=,;"
            int r3 = top.tntok.autobot.C0104o000o0oo.i1L1lLllLLlIi(r5, r2, r3)
            java.lang.String r2 = r5.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r4 = r5.length()
            if (r3 == r4) goto L_0x0066
            char r4 = r5.charAt(r3)
            r0 = 44
            if (r4 == r0) goto L_0x0066
            char r0 = r5.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L_0x0068
        L_0x0066:
            r4 = 1
            goto L_0x009b
        L_0x0068:
            int r3 = r3 + 1
            int r0 = top.tntok.autobot.C0104o000o0oo.IL1lILLLL1L(r5, r3)
            int r3 = r5.length()
            if (r0 >= r3) goto L_0x008b
            char r3 = r5.charAt(r0)
            r4 = 34
            if (r3 != r4) goto L_0x008b
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = top.tntok.autobot.C0104o000o0oo.i1L1lLllLLlIi(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x009e
        L_0x008b:
            r4 = 1
            java.lang.String r3 = ",;"
            int r3 = top.tntok.autobot.C0104o000o0oo.i1L1lLllLLlIi(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009e
        L_0x009b:
            int r3 = r3 + 1
            r0 = 0
        L_0x009e:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00aa
            r4 = -1
            r9 = 1
            goto L_0x013b
        L_0x00aa:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00b6
            r4 = -1
            r10 = 1
            goto L_0x013b
        L_0x00b6:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00c6
            r4 = -1
            int r0 = top.tntok.autobot.C0104o000o0oo.iLLLILIiLi1Ii(r0, r4)
            r11 = r0
            goto L_0x013b
        L_0x00c6:
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00d6
            r4 = -1
            int r0 = top.tntok.autobot.C0104o000o0oo.iLLLILIiLi1Ii(r0, r4)
            r12 = r0
            goto L_0x013b
        L_0x00d6:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00e1
            r4 = -1
            r13 = 1
            goto L_0x013b
        L_0x00e1:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00ec
            r4 = -1
            r14 = 1
            goto L_0x013b
        L_0x00ec:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00f7
            r4 = -1
            r15 = 1
            goto L_0x013b
        L_0x00f7:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x010a
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = top.tntok.autobot.C0104o000o0oo.iLLLILIiLi1Ii(r0, r2)
            r16 = r0
            r4 = -1
            goto L_0x013b
        L_0x010a:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x011a
            r4 = -1
            int r0 = top.tntok.autobot.C0104o000o0oo.iLLLILIiLi1Ii(r0, r4)
            r17 = r0
            goto L_0x013b
        L_0x011a:
            r4 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0126
            r18 = 1
            goto L_0x013b
        L_0x0126:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0131
            r19 = 1
            goto L_0x013b
        L_0x0131:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x013b
            r20 = 1
        L_0x013b:
            r0 = r22
            r2 = r3
            goto L_0x003c
        L_0x0140:
            r4 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0147:
            if (r7 != 0) goto L_0x014c
            r21 = 0
            goto L_0x014e
        L_0x014c:
            r21 = r8
        L_0x014e:
            top.tntok.autobot.i1I1l11IL r0 = new top.tntok.autobot.i1I1l11IL
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.i1I1l11IL.I1iIiIi(top.tntok.autobot.o000o000):top.tntok.autobot.i1I1l11IL");
    }

    public int I11lLL1() {
        return this.IiIIlIL;
    }

    public boolean IiIIlIL() {
        return this.iiI1L1iI;
    }

    public boolean IiiL1llIIi() {
        return this.IiiL1llIIi;
    }

    public int i1L1lLllLLlIi() {
        return this.il1LilLllii;
    }

    public boolean i1LIL11l() {
        return this.iILiI1lll;
    }

    public boolean iILiI1lll() {
        return this.iilLiIIIi11i;
    }

    public boolean iLLLILIiLi1Ii() {
        return this.I11lLL1;
    }

    public final String iiI1L1iI() {
        StringBuilder sb = new StringBuilder();
        if (this.iiI1L1iI) {
            sb.append("no-cache, ");
        }
        if (this.i1LIL11l) {
            sb.append("no-store, ");
        }
        if (this.illlI1lLIL != -1) {
            sb.append("max-age=");
            sb.append(this.illlI1lLIL);
            sb.append(", ");
        }
        if (this.il1LilLllii != -1) {
            sb.append("s-maxage=");
            sb.append(this.il1LilLllii);
            sb.append(", ");
        }
        if (this.iiIliillii) {
            sb.append("private, ");
        }
        if (this.iilLil1i11I1) {
            sb.append("public, ");
        }
        if (this.I11lLL1) {
            sb.append("must-revalidate, ");
        }
        if (this.iLLLILIiLi1Ii != -1) {
            sb.append("max-stale=");
            sb.append(this.iLLLILIiLi1Ii);
            sb.append(", ");
        }
        if (this.IiIIlIL != -1) {
            sb.append("min-fresh=");
            sb.append(this.IiIIlIL);
            sb.append(", ");
        }
        if (this.iilLiIIIi11i) {
            sb.append("only-if-cached, ");
        }
        if (this.IiiL1llIIi) {
            sb.append("no-transform, ");
        }
        if (this.iILiI1lll) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public int iiIliillii() {
        return this.illlI1lLIL;
    }

    public boolean iilLiIIIi11i() {
        return this.i1LIL11l;
    }

    public int iilLil1i11I1() {
        return this.iLLLILIiLi1Ii;
    }

    public boolean il1LilLllii() {
        return this.iilLil1i11I1;
    }

    public boolean illlI1lLIL() {
        return this.iiIliillii;
    }

    public String toString() {
        String str = this.I1iIiIi;
        if (str != null) {
            return str;
        }
        String iiI1L1iI2 = iiI1L1iI();
        this.I1iIiIi = iiI1L1iI2;
        return iiI1L1iI2;
    }

    public i1I1l11IL(iiI1L1iI iii1l1ii) {
        this.iiI1L1iI = iii1l1ii.iiI1L1iI;
        this.i1LIL11l = iii1l1ii.i1LIL11l;
        this.illlI1lLIL = iii1l1ii.illlI1lLIL;
        this.il1LilLllii = -1;
        this.iiIliillii = false;
        this.iilLil1i11I1 = false;
        this.I11lLL1 = false;
        this.iLLLILIiLi1Ii = iii1l1ii.il1LilLllii;
        this.IiIIlIL = iii1l1ii.iiIliillii;
        this.iilLiIIIi11i = iii1l1ii.iilLil1i11I1;
        this.IiiL1llIIi = iii1l1ii.I11lLL1;
        this.iILiI1lll = iii1l1ii.iLLLILIiLi1Ii;
    }
}
