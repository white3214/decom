package top.tntok.autobot;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0337o0O0oooO;

public final class ILLL1LlLLilL {
    @Nullable
    public final C0337o0O0oooO i1LIL11l;
    @Nullable
    public final C0333o0O0ooO0 iiI1L1iI;

    public static class iiI1L1iI {
        public String I11lLL1;
        public long IiIIlIL;
        public String IiiL1llIIi;
        public final C0333o0O0ooO0 i1LIL11l;
        public int iILiI1lll = -1;
        public Date iLLLILIiLi1Ii;
        public final long iiI1L1iI;
        public String iiIliillii;
        public long iilLiIIIi11i;
        public Date iilLil1i11I1;
        public Date il1LilLllii;
        public final C0337o0O0oooO illlI1lLIL;

        public iiI1L1iI(long j, C0333o0O0ooO0 o0o0ooo0, C0337o0O0oooO o0o0oooo) {
            this.iiI1L1iI = j;
            this.i1LIL11l = o0o0ooo0;
            this.illlI1lLIL = o0o0oooo;
            if (o0o0oooo != null) {
                this.IiIIlIL = o0o0oooo.ilLilIL();
                this.iilLiIIIi11i = o0o0oooo.II1l1IliI1Li1();
                C0094o000o000 I1lLLLlliILlI = o0o0oooo.I1lLLLlliILlI();
                int I1iIiIi = I1lLLLlliILlI.I1iIiIi();
                for (int i = 0; i < I1iIiIi; i++) {
                    String iLLLILIiLi1Ii2 = I1lLLLlliILlI.iLLLILIiLi1Ii(i);
                    String IL1lILLLL1L = I1lLLLlliILlI.IL1lILLLL1L(i);
                    if ("Date".equalsIgnoreCase(iLLLILIiLi1Ii2)) {
                        this.il1LilLllii = C0103o000o0oO.i1LIL11l(IL1lILLLL1L);
                        this.iiIliillii = IL1lILLLL1L;
                    } else if ("Expires".equalsIgnoreCase(iLLLILIiLi1Ii2)) {
                        this.iLLLILIiLi1Ii = C0103o000o0oO.i1LIL11l(IL1lILLLL1L);
                    } else if ("Last-Modified".equalsIgnoreCase(iLLLILIiLi1Ii2)) {
                        this.iilLil1i11I1 = C0103o000o0oO.i1LIL11l(IL1lILLLL1L);
                        this.I11lLL1 = IL1lILLLL1L;
                    } else if ("ETag".equalsIgnoreCase(iLLLILIiLi1Ii2)) {
                        this.IiiL1llIIi = IL1lILLLL1L;
                    } else if ("Age".equalsIgnoreCase(iLLLILIiLi1Ii2)) {
                        this.iILiI1lll = C0104o000o0oo.iLLLILIiLi1Ii(IL1lILLLL1L, -1);
                    }
                }
            }
        }

        public static boolean iiIliillii(C0333o0O0ooO0 o0o0ooo0) {
            if (o0o0ooo0.illlI1lLIL("If-Modified-Since") == null && o0o0ooo0.illlI1lLIL("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        public final long i1LIL11l() {
            long j;
            long j2;
            i1I1l11IL i1LIL11l2 = this.illlI1lLIL.i1LIL11l();
            if (i1LIL11l2.iiIliillii() != -1) {
                return TimeUnit.SECONDS.toMillis((long) i1LIL11l2.iiIliillii());
            }
            if (this.iLLLILIiLi1Ii != null) {
                Date date = this.il1LilLllii;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.iilLiIIIi11i;
                }
                long time = this.iLLLILIiLi1Ii.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.iilLil1i11I1 == null || this.illlI1lLIL.i11iLLllliI().IiiL1llIIi().I1IIIi1i1ILl() != null) {
                return 0;
            } else {
                Date date2 = this.il1LilLllii;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.IiIIlIL;
                }
                long time2 = j - this.iilLil1i11I1.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        public final long iiI1L1iI() {
            Date date = this.il1LilLllii;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.iilLiIIIi11i - date.getTime());
            }
            int i = this.iILiI1lll;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.iilLiIIIi11i;
            return j + (j2 - this.IiIIlIL) + (this.iiI1L1iI - j2);
        }

        public final boolean iilLil1i11I1() {
            if (this.illlI1lLIL.i1LIL11l().iiIliillii() == -1 && this.iLLLILIiLi1Ii == null) {
                return true;
            }
            return false;
        }

        public final ILLL1LlLLilL il1LilLllii() {
            long j;
            String str;
            if (this.illlI1lLIL == null) {
                return new ILLL1LlLLilL(this.i1LIL11l, (C0337o0O0oooO) null);
            }
            if (this.i1LIL11l.iilLil1i11I1() && this.illlI1lLIL.I1LiILiLLIl1l() == null) {
                return new ILLL1LlLLilL(this.i1LIL11l, (C0337o0O0oooO) null);
            }
            if (!ILLL1LlLLilL.iiI1L1iI(this.illlI1lLIL, this.i1LIL11l)) {
                return new ILLL1LlLLilL(this.i1LIL11l, (C0337o0O0oooO) null);
            }
            i1I1l11IL i1LIL11l2 = this.i1LIL11l.i1LIL11l();
            if (i1LIL11l2.IiIIlIL() || iiIliillii(this.i1LIL11l)) {
                return new ILLL1LlLLilL(this.i1LIL11l, (C0337o0O0oooO) null);
            }
            i1I1l11IL i1LIL11l3 = this.illlI1lLIL.i1LIL11l();
            long iiI1L1iI2 = iiI1L1iI();
            long i1LIL11l4 = i1LIL11l();
            if (i1LIL11l2.iiIliillii() != -1) {
                i1LIL11l4 = Math.min(i1LIL11l4, TimeUnit.SECONDS.toMillis((long) i1LIL11l2.iiIliillii()));
            }
            long j2 = 0;
            if (i1LIL11l2.I11lLL1() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) i1LIL11l2.I11lLL1());
            } else {
                j = 0;
            }
            if (!i1LIL11l3.iLLLILIiLi1Ii() && i1LIL11l2.iilLil1i11I1() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) i1LIL11l2.iilLil1i11I1());
            }
            if (!i1LIL11l3.IiIIlIL()) {
                long j3 = j + iiI1L1iI2;
                if (j3 < j2 + i1LIL11l4) {
                    C0337o0O0oooO.iiI1L1iI I1IILIil1lLlL = this.illlI1lLIL.I1IILIil1lLlL();
                    if (j3 >= i1LIL11l4) {
                        I1IILIil1lLlL.iiI1L1iI("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (iiI1L1iI2 > 86400000 && iilLil1i11I1()) {
                        I1IILIil1lLlL.iiI1L1iI("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new ILLL1LlLLilL((C0333o0O0ooO0) null, I1IILIil1lLlL.illlI1lLIL());
                }
            }
            String str2 = this.IiiL1llIIi;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.iilLil1i11I1 != null) {
                    str2 = this.I11lLL1;
                } else if (this.il1LilLllii == null) {
                    return new ILLL1LlLLilL(this.i1LIL11l, (C0337o0O0oooO) null);
                } else {
                    str2 = this.iiIliillii;
                }
                str = "If-Modified-Since";
            }
            C0094o000o000.iiI1L1iI iilLiIIIi11i2 = this.i1LIL11l.iiIliillii().iilLiIIIi11i();
            C0139o00OO00o.iiI1L1iI.i1LIL11l(iilLiIIIi11i2, str, str2);
            return new ILLL1LlLLilL(this.i1LIL11l.iLLLILIiLi1Ii().IiIIlIL(iilLiIIIi11i2.IiIIlIL()).i1LIL11l(), this.illlI1lLIL);
        }

        public ILLL1LlLLilL illlI1lLIL() {
            ILLL1LlLLilL il1LilLllii2 = il1LilLllii();
            if (il1LilLllii2.iiI1L1iI == null || !this.i1LIL11l.i1LIL11l().iILiI1lll()) {
                return il1LilLllii2;
            }
            return new ILLL1LlLLilL((C0333o0O0ooO0) null, (C0337o0O0oooO) null);
        }
    }

    public ILLL1LlLLilL(C0333o0O0ooO0 o0o0ooo0, C0337o0O0oooO o0o0oooo) {
        this.iiI1L1iI = o0o0ooo0;
        this.i1LIL11l = o0o0oooo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.i1LIL11l().illlI1lLIL() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean iiI1L1iI(top.tntok.autobot.C0337o0O0oooO r3, top.tntok.autobot.C0333o0O0ooO0 r4) {
        /*
            int r0 = r3.IiIl11II()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.ilLIlL1ILi(r0)
            if (r0 != 0) goto L_0x005a
            top.tntok.autobot.i1I1l11IL r0 = r3.i1LIL11l()
            int r0 = r0.iiIliillii()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            top.tntok.autobot.i1I1l11IL r0 = r3.i1LIL11l()
            boolean r0 = r0.il1LilLllii()
            if (r0 != 0) goto L_0x005a
            top.tntok.autobot.i1I1l11IL r0 = r3.i1LIL11l()
            boolean r0 = r0.illlI1lLIL()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            top.tntok.autobot.i1I1l11IL r3 = r3.i1LIL11l()
            boolean r3 = r3.iilLiIIIi11i()
            if (r3 != 0) goto L_0x006f
            top.tntok.autobot.i1I1l11IL r3 = r4.i1LIL11l()
            boolean r3 = r3.iilLiIIIi11i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.ILLL1LlLLilL.iiI1L1iI(top.tntok.autobot.o0O0oooO, top.tntok.autobot.o0O0ooO0):boolean");
    }
}
