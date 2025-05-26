package top.tntok.autobot;

import android.graphics.Rect;
import android.util.Pair;
import java.util.List;
import top.tntok.autobot.C0263o00ooOO0;
import top.tntok.autobot.C0525o0oOO;

public class o0O0o {
    public static final /* synthetic */ boolean IillLillLLIii = false;
    public iLiI1Llil I11lLL1 = iLiI1Llil.i1LIL11l;
    public int I1I11Il1 = -1;
    public boolean I1IIIi1i1ILl;
    public float I1iIiIi;
    public C0363o0OOOo0O I1l1iIll1lIi1;
    public boolean IIIlll1lll = true;
    public boolean IILiIL1i11Li = true;
    public boolean IIi1l1i;
    public List<iii1iLI1l1l1> IIlL1llI1;
    public C0234o00oOo IIlLill;
    public boolean IIllllLiIlIl;
    public String IL111l1;
    public boolean IL1IiilLlLI = true;
    public boolean IL1lILLLL1L;
    public boolean ILiLII1ILi = true;
    public IL1IiLI ILl1iII11Ll1;
    public C0263o00ooOO0.iiI1L1iI ILllI11 = C0263o00ooOO0.iiI1L1iI.i1LIL11l;
    public int Ii1liIIIiLi;
    public II1l1IliI1Li1 IiIIlIL = II1l1IliI1Li1.i1LIL11l;
    public boolean IiIl11II = true;
    public boolean IiiIlLl1il1i;
    public int IiiL1llIIi = 8000000;
    public String IilL11ii1I1Il;
    public boolean IilliIIIlI1ll = true;
    public boolean Il1llillili = true;
    public boolean IliiLiLliIl;
    public boolean i111iLiiIIill = true;
    public boolean i11liIIl11Ii1;
    public float i1L1lLllLLlIi;
    public int i1LIL11l = -1;
    public boolean i1LiiIlIL1I = true;
    public List<iii1iLI1l1l1> i1iI1iiLL1;
    public C0263o00ooOO0 i1iLlIill1I = C0263o00ooOO0.i1LIL11l;
    public int i1iiLIil1ILi;
    public int iILiI1lll = 128000;
    public Rect iL1LIlIlI;
    public C0495o0o000o0 iLLLILIiLi1Ii = C0495o0o000o0.i1LIL11l;
    public boolean iLlIllll;
    public C0525o0oOO.iiI1L1iI iiI1L1iI = C0525o0oOO.iiI1L1iI.illlI1lLIL;
    public int iiIliillii;
    public IIiILIi1L iiLIIiIli;
    public boolean iiiiI1iILL11I;
    public boolean iilLiIIIi11i;
    public C0493o0o000OO iilLil1i11I1 = C0493o0o000OO.i1LIL11l;
    public boolean il1LilLllii = true;
    public String il1l1IlL;
    public boolean iliilLllIl1 = true;
    public boolean illi1LIILLiL;
    public boolean illiiliIILI = true;
    public boolean illlI1lLIL = true;

    public static IL1IiLI I1LiliILi1lI1(String str) {
        if (C0387o0OOoO0o.iiI1L1iI("RsW9cVYb\n", "NaDTAjlpUdo=\n").equals(str)) {
            return IL1IiLI.iiIliillii();
        }
        String[] split = str.split(C0387o0OOoO0o.iiI1L1iI("8g==\n", "yNf/I/8S52A=\n"));
        if (split.length == 2) {
            return IL1IiLI.i1LIL11l(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        return IL1IiLI.iiI1L1iI(Float.parseFloat(split[0]));
    }

    public static C0363o0OOOo0O I1i1iiiI(String str) {
        String[] split = str.split(C0387o0OOoO0o.iiI1L1iI("iw==\n", "86/mBaBzcbc=\n"));
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new C0363o0OOOo0O(parseInt, parseInt2);
            }
            throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("Vu5WFdT/KMlx705ZyPk/gGvpVhGY5SWTeqBEHdXzIpp2705OmLQ=\n", "H4AgdLiWTOk=\n") + str + C0387o0OOoO0o.iiI1L1iI("aQ==\n", "SwGtv6J+ABw=\n"));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("HZjL9ydzSy8nn8fza3xAfTmXybZjf1d/MZXJ8y86E3g9ksn+dWITZzGf2v4/JAY1dNQ=\n", "VPa9lksaLw8=\n") + str + C0387o0OOoO0o.iiI1L1iI("xA==\n", "5mFC34my99E=\n"));
    }

    public static float IiiIIil1l(String str, String str2) {
        try {
            return Float.parseFloat(str2);
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("dzcwDV6EP4BYNSkNRs0twVIsI0xUgimA\n", "PllGbDLtW6A=\n") + str + C0387o0OOoO0o.iiI1L1iI("gKQR\n", "uoQzMX910UU=\n") + str2 + C0387o0OOoO0o.iiI1L1iI("BA==\n", "JgEsGA4Pguc=\n"));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static top.tntok.autobot.o0O0o Iiiiii1l1I1L1(java.lang.String... r10) {
        /*
            int r0 = r10.length
            r1 = 1
            if (r0 < r1) goto L_0x0710
            r0 = 0
            r2 = r10[r0]
            java.lang.String r3 = "y1/wKA==\n"
            java.lang.String r4 = "+nHCHAvkb48=\n"
            java.lang.String r3 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r3, r4)
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x06e8
            top.tntok.autobot.o0O0o r2 = new top.tntok.autobot.o0O0o
            r2.<init>()
            r3 = 1
        L_0x001b:
            int r4 = r10.length
            r5 = -1
            if (r3 >= r4) goto L_0x06e1
            r4 = r10[r3]
            r6 = 61
            int r6 = r4.indexOf(r6)
            if (r6 == r5) goto L_0x06b9
            java.lang.String r7 = r4.substring(r0, r6)
            int r6 = r6 + 1
            java.lang.String r4 = r4.substring(r6)
            int r6 = r7.hashCode()
            r8 = 16
            switch(r6) {
                case -2011798321: goto L_0x03a2;
                case -2006901047: goto L_0x0392;
                case -1577991943: goto L_0x0381;
                case -1524357580: goto L_0x0370;
                case -1439044444: goto L_0x0360;
                case -1399613577: goto L_0x034f;
                case -1246195277: goto L_0x033e;
                case -1224637069: goto L_0x032c;
                case -1113970269: goto L_0x031a;
                case -1057452828: goto L_0x0308;
                case -1029061293: goto L_0x02f6;
                case -963940008: goto L_0x02e4;
                case -915381673: goto L_0x02d2;
                case -914519624: goto L_0x02c0;
                case -799224478: goto L_0x02ae;
                case -581030117: goto L_0x029c;
                case -489119722: goto L_0x028a;
                case -368215219: goto L_0x0278;
                case -341991541: goto L_0x0266;
                case -341991307: goto L_0x0254;
                case -254870497: goto L_0x0242;
                case -184098322: goto L_0x0230;
                case -43860138: goto L_0x021e;
                case 155743: goto L_0x020d;
                case 3062416: goto L_0x01fb;
                case 3524459: goto L_0x01ea;
                case 92960979: goto L_0x01d8;
                case 93166550: goto L_0x01c7;
                case 112202875: goto L_0x01b6;
                case 188511766: goto L_0x01a4;
                case 258514750: goto L_0x0192;
                case 306793707: goto L_0x0180;
                case 408072700: goto L_0x016e;
                case 419337560: goto L_0x015c;
                case 467426725: goto L_0x014a;
                case 679346862: goto L_0x0138;
                case 770070125: goto L_0x0127;
                case 844435342: goto L_0x0115;
                case 856774308: goto L_0x0103;
                case 858558297: goto L_0x00f1;
                case 927123747: goto L_0x00df;
                case 946525380: goto L_0x00cd;
                case 951543133: goto L_0x00bb;
                case 1214891724: goto L_0x00a9;
                case 1370685266: goto L_0x0098;
                case 1779931332: goto L_0x0086;
                case 1782954673: goto L_0x0074;
                case 1904890482: goto L_0x0062;
                case 2059142363: goto L_0x0050;
                case 2139445271: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x03b3
        L_0x003e:
            java.lang.String r6 = "RkITMmBu+a5cRBgJUm/ouQ==\n"
            java.lang.String r9 = "NSd9Vj8KnNg=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 45
            goto L_0x03b4
        L_0x0050:
            java.lang.String r6 = "Vr0L0pWqPGRcpgM=\n"
            java.lang.String r9 = "Ndxmt+fLYxc=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 36
            goto L_0x03b4
        L_0x0062:
            java.lang.String r6 = "H5TNjeNCgZADkd+Azw==\n"
            java.lang.String r9 = "c/2++bwm6OM=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 31
            goto L_0x03b4
        L_0x0074:
            java.lang.String r6 = "Jt9F1aA6gRo000LvoBWWHD/YUg==\n"
            java.lang.String r9 = "ULYhsM9l4nU=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 21
            goto L_0x03b4
        L_0x0086:
            java.lang.String r6 = "UyEhLWZCAoNZJyQXZ1M4jlQ=\n"
            java.lang.String r9 = "MEBMSBQjXes=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 40
            goto L_0x03b4
        L_0x0098:
            java.lang.String r6 = "7ralv2fXq+f8uqI=\n"
            java.lang.String r9 = "mN/B2giIyIg=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 4
            goto L_0x03b4
        L_0x00a9:
            java.lang.String r6 = "C/nawZONVXAO6d33k6JCdgXizQ==\n"
            java.lang.String r9 = "aoy+qPzSNh8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 22
            goto L_0x03b4
        L_0x00bb:
            java.lang.String r6 = "nQ47cvzr+w==\n"
            java.lang.String r9 = "/mFVBo6El3E=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 16
            goto L_0x03b4
        L_0x00cd:
            java.lang.String r6 = "eFj7uZnbbJ9DWOKIj8BklW4=\n"
            java.lang.String r9 = "HDeM1+qyFvo=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 27
            goto L_0x03b4
        L_0x00df:
            java.lang.String r6 = "YOrSNmgoHRVi7tw=\n"
            java.lang.String r9 = "Do+laQxBbmU=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 41
            goto L_0x03b4
        L_0x00f1:
            java.lang.String r6 = "U4yHP35EX+4=\n"
            java.lang.String r9 = "I+PwWgwbMIA=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 29
            goto L_0x03b4
        L_0x0103:
            java.lang.String r6 = "qyRQCJ3EOQ==\n"
            java.lang.String r9 = "yEg1afOxSVM=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 28
            goto L_0x03b4
        L_0x0115:
            java.lang.String r6 = "ayXxQGEQJQ==\n"
            java.lang.String r9 = "BkSJHwdgVu0=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 12
            goto L_0x03b4
        L_0x0127:
            java.lang.String r6 = "R9elX8bgXTZCx6I=\n"
            java.lang.String r9 = "JqLBNqm/Plk=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 5
            goto L_0x03b4
        L_0x0138:
            java.lang.String r6 = "O/G1XgEnio0l8YRXOzWZ\n"
            java.lang.String r9 = "SJTbOl5B+Ow=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 46
            goto L_0x03b4
        L_0x014a:
            java.lang.String r6 = "vJsQBaI/tnCqnSEMmCi4\n"
            java.lang.String r9 = "z/5+Yf1c2RQ=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 48
            goto L_0x03b4
        L_0x015c:
            java.lang.String r6 = "xgI8E6fon63TBDwTug==\n"
            java.lang.String r9 = "sGtYdsi3+sM=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 23
            goto L_0x03b4
        L_0x016e:
            java.lang.String r6 = "WDLAPqn0V0Q=\n"
            java.lang.String r9 = "NVO4YdqdLSE=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 9
            goto L_0x03b4
        L_0x0180:
            java.lang.String r6 = "fFOE/E9REX1sU474\n"
            java.lang.String r9 = "DzvrixAlfgg=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 18
            goto L_0x03b4
        L_0x0192:
            java.lang.String r6 = "fLLjh2sQGTZpt86WZxMjNnql\n"
            java.lang.String r9 = "D9GR4g5+Rlk=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 20
            goto L_0x03b4
        L_0x01a4:
            java.lang.String r6 = "o/AN85CWek6y\n"
            java.lang.String r9 = "woVpmv/JHjs=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 8
            goto L_0x03b4
        L_0x01b6:
            java.lang.String r6 = "9Lq74Dg=\n"
            java.lang.String r9 = "gtPfhVf9c6c=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 2
            goto L_0x03b4
        L_0x01c7:
            java.lang.String r6 = "T2VP43s=\n"
            java.lang.String r9 = "LhArihTt+N8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 3
            goto L_0x03b4
        L_0x01d8:
            java.lang.String r6 = "jscDdLs=\n"
            java.lang.String r9 = "76lkGN5fSs4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 13
            goto L_0x03b4
        L_0x01ea:
            java.lang.String r6 = "wVcIeA==\n"
            java.lang.String r9 = "sjRhHPoOhUw=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 0
            goto L_0x03b4
        L_0x01fb:
            java.lang.String r6 = "8ybumQ==\n"
            java.lang.String r9 = "kFSB6QY61Bo=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 15
            goto L_0x03b4
        L_0x020d:
            java.lang.String r6 = "snzt5YY/AeGxZ+rl\n"
            java.lang.String r9 = "xBWJgOlgco4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 6
            goto L_0x03b4
        L_0x021e:
            java.lang.String r6 = "Rq9unTU2JxZYs1+bEyY3\n"
            java.lang.String r9 = "NcoA+WpSUns=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 47
            goto L_0x03b4
        L_0x0230:
            java.lang.String r6 = "HlqKO6ik8yMFXZM0v6w=\n"
            java.lang.String r9 = "ai/kVc3IrEU=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 14
            goto L_0x03b4
        L_0x0242:
            java.lang.String r6 = "Co7rCa/ad/8Snw==\n"
            java.lang.String r9 = "efqKcPC7AJ4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 19
            goto L_0x03b4
        L_0x0254:
            java.lang.String r6 = "mX5SKmWFbtae\n"
            java.lang.String r9 = "+h8/TxfkMb8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 35
            goto L_0x03b4
        L_0x0266:
            java.lang.String r6 = "1wCkwOSch7/G\n"
            java.lang.String r9 = "tGHJpZb92N4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 38
            goto L_0x03b4
        L_0x0278:
            java.lang.String r6 = "ZgF+1Ob/IbRvGmzT\n"
            java.lang.String r9 = "CmgNoLmcQNk=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 32
            goto L_0x03b4
        L_0x028a:
            java.lang.String r6 = "KRI4MipPD2YrJC42MXU=\n"
            java.lang.String r9 = "X3tcV0UQbQ8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 10
            goto L_0x03b4
        L_0x029c:
            java.lang.String r6 = "IGFpJ3M2TbA1S38vaAw=\n"
            java.lang.String r9 = "QRQNThxpL9k=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 11
            goto L_0x03b4
        L_0x02ae:
            java.lang.String r6 = "akpNbzdNguh8elVkGnGB4WlA\n"
            java.lang.String r9 = "GiU6CkUS7Y4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 25
            goto L_0x03b4
        L_0x02c0:
            java.lang.String r6 = "/P5QE0w/azzx8w==\n"
            java.lang.String r9 = "mJcjYyBeEmM=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 17
            goto L_0x03b4
        L_0x02d2:
            java.lang.String r6 = "t5kKkTSfanO7ihOAL5luWL2XFA==\n"
            java.lang.String r9 = "1Ph65UHtDyw=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 44
            goto L_0x03b4
        L_0x02e4:
            java.lang.String r6 = "CrGkzNe+OGMJvLLK+w==\n"
            java.lang.String r9 = "ZtjXuIjbVgA=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 30
            goto L_0x03b4
        L_0x02f6:
            java.lang.String r6 = "2i3tOaRGpljdHuU8ska0U9ci\n"
            java.lang.String r9 = "uUGEScYpxyo=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 26
            goto L_0x03b4
        L_0x0308:
            java.lang.String r6 = "SFev4FXabcRTbJT2T8ZrwEpan/1f\n"
            java.lang.String r9 = "PjPwkyypGaE=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 43
            goto L_0x03b4
        L_0x031a:
            java.lang.String r6 = "4peeArZ8ULz7ip4FvGFQq/qH\n"
            java.lang.String r9 = "lPPBZtMPJM4=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 42
            goto L_0x03b4
        L_0x032c:
            java.lang.String r6 = "w1FAw2qOgsfc\n"
            java.lang.String r9 = "rzgztzXv8rc=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 34
            goto L_0x03b4
        L_0x033e:
            java.lang.String r6 = "fduX5o05mwR/wZfqkA==\n"
            java.lang.String r9 = "HK7zj+Jm/mo=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 24
            goto L_0x03b4
        L_0x034f:
            java.lang.String r6 = "UmCAS6JiOpxBbA==\n"
            java.lang.String r9 = "IAH3FNEWSPk=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 49
            goto L_0x03b4
        L_0x0360:
            java.lang.String r6 = "DTCGTaYBY5AZN4FB\n"
            java.lang.String r9 = "bEXiJMleEP8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 7
            goto L_0x03b4
        L_0x0370:
            java.lang.String r6 = "R31hmnm6sydFf2WRbA==\n"
            java.lang.String r9 = "JBwM/wvb7EE=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 37
            goto L_0x03b4
        L_0x0381:
            java.lang.String r6 = "TIj3hYnBoDxFk+Wupcu7NFM=\n"
            java.lang.String r9 = "IOGE8daiwVE=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 33
            goto L_0x03b4
        L_0x0392:
            java.lang.String r6 = "HYiYMnq7e88d\n"
            java.lang.String r9 = "cef/bRbeDao=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 1
            goto L_0x03b4
        L_0x03a2:
            java.lang.String r6 = "62Sko8NZZnP4dg==\n"
            java.lang.String r9 = "iAXJxrE4ORU=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x03b3
            r6 = 39
            goto L_0x03b4
        L_0x03b3:
            r6 = -1
        L_0x03b4:
            switch(r6) {
                case 0: goto L_0x0690;
                case 1: goto L_0x0683;
                case 2: goto L_0x067c;
                case 3: goto L_0x0675;
                case 4: goto L_0x0644;
                case 5: goto L_0x0612;
                case 6: goto L_0x05e0;
                case 7: goto L_0x05ae;
                case 8: goto L_0x05a6;
                case 9: goto L_0x059c;
                case 10: goto L_0x0594;
                case 11: goto L_0x058c;
                case 12: goto L_0x057c;
                case 13: goto L_0x056c;
                case 14: goto L_0x0564;
                case 15: goto L_0x0556;
                case 16: goto L_0x054e;
                case 17: goto L_0x0546;
                case 18: goto L_0x053e;
                case 19: goto L_0x0536;
                case 20: goto L_0x050d;
                case 21: goto L_0x0505;
                case 22: goto L_0x04fd;
                case 23: goto L_0x04f3;
                case 24: goto L_0x04e3;
                case 25: goto L_0x04eb;
                case 26: goto L_0x04db;
                case 27: goto L_0x04d3;
                case 28: goto L_0x04cb;
                case 29: goto L_0x04c3;
                case 30: goto L_0x04bb;
                case 31: goto L_0x04b3;
                case 32: goto L_0x04ab;
                case 33: goto L_0x04a3;
                case 34: goto L_0x049b;
                case 35: goto L_0x0491;
                case 36: goto L_0x0483;
                case 37: goto L_0x044b;
                case 38: goto L_0x043d;
                case 39: goto L_0x0435;
                case 40: goto L_0x042d;
                case 41: goto L_0x0425;
                case 42: goto L_0x041d;
                case 43: goto L_0x0415;
                case 44: goto L_0x0403;
                case 45: goto L_0x03fb;
                case 46: goto L_0x03f3;
                case 47: goto L_0x03eb;
                case 48: goto L_0x03e3;
                case 49: goto L_0x03d3;
                default: goto L_0x03b7;
            }
        L_0x03b7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "9gsAT94Bu+nQABlX1AT1ptMRAk7fTPU=\n"
            java.lang.String r6 = "o2VrIbF21ck=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            top.tntok.autobot.C0525o0oOO.IiIIlIL(r4)
            goto L_0x0698
        L_0x03d3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            if (r4 == 0) goto L_0x0698
            r2.i1LiiIlIL1I = r0
            r2.ILiLII1ILi = r0
            r2.Il1llillili = r0
            r2.IiIl11II = r0
            goto L_0x0698
        L_0x03e3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IiIl11II = r4
            goto L_0x0698
        L_0x03eb:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.Il1llillili = r4
            goto L_0x0698
        L_0x03f3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.ILiLII1ILi = r4
            goto L_0x0698
        L_0x03fb:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.i1LiiIlIL1I = r4
            goto L_0x0698
        L_0x0403:
            android.util.Pair r4 = iLILliI1(r4)
            java.lang.Object r5 = r4.first
            top.tntok.autobot.o00ooOO0$iiI1L1iI r5 = (top.tntok.autobot.C0263o00ooOO0.iiI1L1iI) r5
            r2.ILllI11 = r5
            java.lang.Object r4 = r4.second
            top.tntok.autobot.o00ooOO0 r4 = (top.tntok.autobot.C0263o00ooOO0) r4
            r2.i1iLlIill1I = r4
            goto L_0x0698
        L_0x0415:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.illiiliIILI = r4
            goto L_0x0698
        L_0x041d:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.iliilLllIl1 = r4
            goto L_0x0698
        L_0x0425:
            top.tntok.autobot.o00oOo r4 = iLIIl1IliLlLI(r4)
            r2.IIlLill = r4
            goto L_0x0698
        L_0x042d:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.i11liIIl11Ii1 = r4
            goto L_0x0698
        L_0x0435:
            int r4 = java.lang.Integer.parseInt(r4)
            r2.i1iiLIil1ILi = r4
            goto L_0x0698
        L_0x043d:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            top.tntok.autobot.IL1IiLI r4 = I1LiliILi1lI1(r4)
            r2.ILl1iII11Ll1 = r4
            goto L_0x0698
        L_0x044b:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            top.tntok.autobot.IIiILIi1L r5 = top.tntok.autobot.IIiILIi1L.i1LIL11l(r4)
            if (r5 == 0) goto L_0x045b
            r2.iiLIIiIli = r5
            goto L_0x0698
        L_0x045b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "nM8mYtznBXS+zSJpyaY=\n"
            java.lang.String r2 = "365LB66GJRI=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "7R8kSkwhUFS9HjlKCTY=\n"
            java.lang.String r2 = "zXFLPmxSJSQ=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0483:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            top.tntok.autobot.o0OOOo0O r4 = I1i1iiiI(r4)
            r2.I1l1iIll1lIi1 = r4
            goto L_0x0698
        L_0x0491:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            r2.IilL11ii1I1Il = r4
            goto L_0x0698
        L_0x049b:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.iLlIllll = r4
            goto L_0x0698
        L_0x04a3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IiiIlLl1il1i = r4
            goto L_0x0698
        L_0x04ab:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IIllllLiIlIl = r4
            goto L_0x0698
        L_0x04b3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IIi1l1i = r4
            goto L_0x0698
        L_0x04bb:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.illi1LIILLiL = r4
            goto L_0x0698
        L_0x04c3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IILiIL1i11Li = r4
            goto L_0x0698
        L_0x04cb:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IL1IiilLlLI = r4
            goto L_0x0698
        L_0x04d3:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IIIlll1lll = r4
            goto L_0x0698
        L_0x04db:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IilliIIIlI1ll = r4
            goto L_0x0698
        L_0x04e3:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x04eb
            r2.il1l1IlL = r4
        L_0x04eb:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.I1IIIi1i1ILl = r4
            goto L_0x0698
        L_0x04f3:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            r2.IL111l1 = r4
            goto L_0x0698
        L_0x04fd:
            java.util.List r4 = top.tntok.autobot.iii1iLI1l1l1.illlI1lLIL(r4)
            r2.IIlL1llI1 = r4
            goto L_0x0698
        L_0x0505:
            java.util.List r4 = top.tntok.autobot.iii1iLI1l1l1.illlI1lLIL(r4)
            r2.i1iI1iiLL1 = r4
            goto L_0x0698
        L_0x050d:
            int r4 = java.lang.Integer.parseInt(r4)
            r2.I1I11Il1 = r4
            if (r4 < r5) goto L_0x0517
            goto L_0x0698
        L_0x0517:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "4BCedeL7v3TaHZpx6/z7O88YyGDn/7473ArSNA==\n"
            java.lang.String r3 = "qX7oFI6S21Q=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r3)
            r0.append(r1)
            int r1 = r2.I1I11Il1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0536:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IliiLiLliIl = r4
            goto L_0x0698
        L_0x053e:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.iiiiI1iILL11I = r4
            goto L_0x0698
        L_0x0546:
            int r4 = java.lang.Integer.parseInt(r4)
            r2.Ii1liIIIiLi = r4
            goto L_0x0698
        L_0x054e:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.i111iLiiIIill = r4
            goto L_0x0698
        L_0x0556:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0698
            android.graphics.Rect r4 = i1i1111LLILli(r4)
            r2.iL1LIlIlI = r4
            goto L_0x0698
        L_0x0564:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.IL1lILLLL1L = r4
            goto L_0x0698
        L_0x056c:
            java.lang.String r5 = "RGcXMU0=\n"
            java.lang.String r6 = "JQlwXSgVbFM=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)
            float r4 = IiiIIil1l(r5, r4)
            r2.i1L1lLllLLlIi = r4
            goto L_0x0698
        L_0x057c:
            java.lang.String r5 = "TYuYNwIoDQ==\n"
            java.lang.String r6 = "IOrgaGRYfug=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)
            float r4 = IiiIIil1l(r5, r4)
            r2.I1iIiIi = r4
            goto L_0x0698
        L_0x058c:
            int r4 = java.lang.Integer.parseInt(r4)
            r2.iILiI1lll = r4
            goto L_0x0698
        L_0x0594:
            int r4 = java.lang.Integer.parseInt(r4)
            r2.IiiL1llIIi = r4
            goto L_0x0698
        L_0x059c:
            int r4 = java.lang.Integer.parseInt(r4)
            r4 = r4 & -8
            r2.iiIliillii = r4
            goto L_0x0698
        L_0x05a6:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.iilLiIIIi11i = r4
            goto L_0x0698
        L_0x05ae:
            top.tntok.autobot.II1l1IliI1Li1 r5 = top.tntok.autobot.II1l1IliI1Li1.i1LIL11l(r4)
            if (r5 == 0) goto L_0x05b8
            r2.IiIIlIL = r5
            goto L_0x0698
        L_0x05b8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "6u4KsxBKClXe6Q2/Xw==\n"
            java.lang.String r2 = "q5tu2n9qeTo=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "4y/xcOBzEvWzLuxwpWQ=\n"
            java.lang.String r2 = "w0GeBMAAZ4U=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x05e0:
            top.tntok.autobot.o0o000o0 r5 = top.tntok.autobot.C0495o0o000o0.i1LIL11l(r4)
            if (r5 == 0) goto L_0x05ea
            r2.iLLLILIiLi1Ii = r5
            goto L_0x0698
        L_0x05ea:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IHz8in17eD4DZ/uKMg==\n"
            java.lang.String r2 = "dhWY7xJbC1E=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "OHvuDnBGNtJoevMONVE=\n"
            java.lang.String r2 = "GBWBelA1Q6I=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0612:
            top.tntok.autobot.iLiI1Llil r5 = top.tntok.autobot.iLiI1Llil.iilLil1i11I1(r4)
            if (r5 == 0) goto L_0x061c
            r2.I11lLL1 = r5
            goto L_0x0698
        L_0x061c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "uIMjJM1YXs+dkyRt\n"
            java.lang.String r2 = "+fZHTaJ4PaA=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "Gqjd/Ij7eaVKqcD8zew=\n"
            java.lang.String r2 = "OsayiKiIDNU=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0644:
            top.tntok.autobot.o0o000OO r5 = top.tntok.autobot.C0493o0o000OO.iilLil1i11I1(r4)
            if (r5 == 0) goto L_0x064d
            r2.iilLil1i11I1 = r5
            goto L_0x0698
        L_0x064d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bOiSoiXoxlRe5JXn\n"
            java.lang.String r2 = "OoH2x0rIpTs=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "5PQ7wVsWdSm09SbBHgE=\n"
            java.lang.String r2 = "xJpUtXtlAFk=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0675:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.il1LilLllii = r4
            goto L_0x0698
        L_0x067c:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2.illlI1lLIL = r4
            goto L_0x0698
        L_0x0683:
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r5)
            top.tntok.autobot.o0oOO$iiI1L1iI r4 = top.tntok.autobot.C0525o0oOO.iiI1L1iI.valueOf(r4)
            r2.iiI1L1iI = r4
            goto L_0x0698
        L_0x0690:
            int r4 = java.lang.Integer.parseInt(r4, r8)
            if (r4 < r5) goto L_0x069c
            r2.i1LIL11l = r4
        L_0x0698:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x069c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ETWYj1IFPVhCOJ6fUgo5AQwzlooGASpEQn6UkxENLFVCe8DLFAcuAUU4noUXT3UbQg==\n"
            java.lang.String r2 = "Ylbx63JoXCE=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x06b9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bDXtzVG4uytOPuKRS7CzfkB7681Uo+UrBw==\n"
            java.lang.String r2 = "JVubrD3R3ws=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "Gw==\n"
            java.lang.String r2 = "OYm/kA0VT4E=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x06e1:
            top.tntok.autobot.o00oOo r10 = r2.IIlLill
            if (r10 == 0) goto L_0x06e7
            r2.Ii1liIIIiLi = r5
        L_0x06e7:
            return r2
        L_0x06e8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Gk2QUMBZlForV9UG1k6VRSFL1ViCEtQYZwWRH9ZPxkIhUdUd0kiFRG5RnRWTX4pFK0uBUJs=\n"
            java.lang.String r3 = "TiX1cLM85iw=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "2Q==\n"
            java.lang.String r2 = "8L3NJ3EURxY=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x0710:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "TQGAFX+9bCpjBJoDeKcrfGUagA95vQ==\n"
            java.lang.String r1 = "AGjzZhbTCwo=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o0O0o.Iiiiii1l1I1L1(java.lang.String[]):top.tntok.autobot.o0O0o");
    }

    public static Rect i1i1111LLILli(String str) {
        String[] split = str.split(C0387o0OOoO0o.iiI1L1iI("EA==\n", "Kg6UeGkc+do=\n"));
        if (split.length == 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt <= 0 || parseInt2 <= 0) {
                throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("C3Z8rTXfYF8hamW8ecVtBSciKg==\n", "QhgKzFm2BH8=\n") + parseInt + C0387o0OOoO0o.iiI1L1iI("0A==\n", "qL7yVMA3vGg=\n") + parseInt2);
            }
            int parseInt3 = Integer.parseInt(split[2]);
            int parseInt4 = Integer.parseInt(split[3]);
            if (parseInt3 >= 0 && parseInt4 >= 0) {
                return new Rect(parseInt3, parseInt4, parseInt + parseInt3, parseInt2 + parseInt4);
            }
            throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("40hQPLw56EXJVEkt8D/qA9lDUmfw\n", "qiYmXdBQjGU=\n") + parseInt3 + C0387o0OOoO0o.iiI1L1iI("Ug==\n", "aCraAa5IqvU=\n") + parseInt4);
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("XED0VLc3IMRrEvhL+S403nFBuxC3LDTbalfoBOQ/JdZtU+9B83o3zj9R9Ej4NCaNPxA=\n", "HzKbJJdaVbc=\n") + str + C0387o0OOoO0o.iiI1L1iI("jA==\n", "rmhb2/CC0Zg=\n"));
    }

    public static C0234o00oOo iLIIl1IliLlLI(String str) {
        C0363o0OOOo0O o0oooo0o;
        if (str.isEmpty()) {
            return new C0234o00oOo();
        }
        String[] split = str.split(C0387o0OOoO0o.iiI1L1iI("6A==\n", "x2mnqDZ+njs=\n"));
        int i = 0;
        if (!split[0].isEmpty()) {
            o0oooo0o = I1i1iiiI(split[0]);
        } else {
            o0oooo0o = null;
        }
        if (split.length >= 2) {
            int parseInt = Integer.parseInt(split[1]);
            if (parseInt > 0) {
                i = parseInt;
            } else {
                throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("TAzJ+zNGlvlrDdG3L0CBsHELyf9/S4KwP0I=\n", "BWK/ml8v8tk=\n") + split[1]);
            }
        }
        return new C0234o00oOo(o0oooo0o, i);
    }

    public static Pair<C0263o00ooOO0.iiI1L1iI, C0263o00ooOO0> iLILliI1(String str) {
        C0263o00ooOO0.iiI1L1iI iii1l1ii;
        if (!str.isEmpty()) {
            if (str.charAt(0) == '@') {
                str = str.substring(1);
                if (str.isEmpty()) {
                    return Pair.create(C0263o00ooOO0.iiI1L1iI.illlI1lLIL, C0263o00ooOO0.i1LIL11l);
                }
                iii1l1ii = C0263o00ooOO0.iiI1L1iI.il1LilLllii;
            } else {
                iii1l1ii = C0263o00ooOO0.iiI1L1iI.i1LIL11l;
            }
            return Pair.create(iii1l1ii, C0263o00ooOO0.illlI1lLIL(str));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("Nz8BbuuVg8ACJgRo95WP0xs3H27zwYnOHHICbuDcjsY=\n", "clJxGpK14KE=\n"));
    }

    public String I11lLL1() {
        return this.il1l1IlL;
    }

    public boolean I1I11Il1() {
        return this.IIi1l1i;
    }

    public C0234o00oOo I1IIIi1i1ILl() {
        return this.IIlLill;
    }

    public String I1iIiIi() {
        return this.IilL11ii1I1Il;
    }

    public Rect I1l1iIll1lIi1() {
        return this.iL1LIlIlI;
    }

    public boolean IIIlll1lll() {
        return this.IILiIL1i11Li;
    }

    public int IILiIL1i11Li() {
        return this.I1I11Il1;
    }

    public boolean IIi1l1i() {
        return this.iliilLllIl1;
    }

    public C0525o0oOO.iiI1L1iI IIlL1llI1() {
        return this.iiI1L1iI;
    }

    public boolean IIlLill() {
        return this.IiIl11II;
    }

    public boolean IIllllLiIlIl() {
        return this.illiiliIILI;
    }

    public float IL111l1() {
        return this.I1iIiIi;
    }

    public int IL1IiilLlLI() {
        return this.i1LIL11l;
    }

    public C0263o00ooOO0 IL1lILLLL1L() {
        return this.i1iLlIill1I;
    }

    public List<iii1iLI1l1l1> ILiLII1ILi() {
        return this.i1iI1iiLL1;
    }

    public boolean ILl1iII11Ll1() {
        return this.IIIlll1lll;
    }

    public boolean ILllI11() {
        return this.ILiLII1ILi;
    }

    public boolean Ii1liIIIiLi() {
        return this.IilliIIIlI1ll;
    }

    public IL1IiLI IiIIlIL() {
        return this.ILl1iII11Ll1;
    }

    public C0495o0o000o0 IiIl11II() {
        return this.iLLLILIiLi1Ii;
    }

    public boolean IiiIlLl1il1i() {
        return this.illlI1lLIL;
    }

    public int IiiL1llIIi() {
        return this.i1iiLIil1ILi;
    }

    public boolean IilL11ii1I1Il() {
        return this.i111iLiiIIill;
    }

    public boolean IillLillLLIii() {
        return this.IL1lILLLL1L;
    }

    public boolean IilliIIIlI1ll() {
        return this.I1IIIi1i1ILl;
    }

    public String Il1llillili() {
        return this.IL111l1;
    }

    public boolean IliiLiLliIl() {
        return this.IIllllLiIlIl;
    }

    public boolean i111iLiiIIill() {
        return this.IL1IiilLlLI;
    }

    public boolean i11liIIl11Ii1() {
        return this.iLlIllll;
    }

    public C0363o0OOOo0O i1L1lLllLLlIi() {
        return this.I1l1iIll1lIi1;
    }

    public boolean i1LIL11l() {
        return this.il1LilLllii;
    }

    public C0493o0o000OO i1LiiIlIL1I() {
        return this.iilLil1i11I1;
    }

    public boolean i1iI1iiLL1() {
        return this.illi1LIILLiL;
    }

    public boolean i1iLlIill1I() {
        return this.iiiiI1iILL11I;
    }

    public boolean i1iiLIil1ILi() {
        if (this.illi1LIILLiL || this.IIi1l1i || this.IIllllLiIlIl || this.IiiIlLl1il1i || this.iLlIllll) {
            return true;
        }
        return false;
    }

    public boolean iILiI1lll() {
        return this.i11liIIl11Ii1;
    }

    public C0263o00ooOO0.iiI1L1iI iL1LIlIlI() {
        return this.ILllI11;
    }

    public II1l1IliI1Li1 iLLLILIiLi1Ii() {
        return this.IiIIlIL;
    }

    public int iLlIllll() {
        return this.IiiL1llIIi;
    }

    public float iiI1L1iI() {
        return this.i1L1lLllLLlIi;
    }

    public List<iii1iLI1l1l1> iiIliillii() {
        return this.IIlL1llI1;
    }

    public int iiLIIiIli() {
        return this.Ii1liIIIiLi;
    }

    public boolean iiiiI1iILL11I() {
        return this.IiiIlLl1il1i;
    }

    public IIiILIi1L iilLiIIIi11i() {
        return this.iiLIIiIli;
    }

    public boolean iilLil1i11I1() {
        return this.iilLiIIIi11i;
    }

    public iLiI1Llil il1LilLllii() {
        return this.I11lLL1;
    }

    public int il1l1IlL() {
        return this.iiIliillii;
    }

    public boolean iliilLllIl1() {
        return this.i1LiiIlIL1I;
    }

    public boolean illi1LIILLiL() {
        return this.IliiLiLliIl;
    }

    public boolean illiiliIILI() {
        return this.Il1llillili;
    }

    public int illlI1lLIL() {
        return this.iILiI1lll;
    }
}
