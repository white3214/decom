package top.tntok.autobot;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: top.tntok.autobot.o000oo00  reason: case insensitive filesystem */
public final class C0109o000oo00 {
    public static final String I1iIiIi = " \"<>^`{}|/\\?#";
    public static final String I1l1iIll1lIi1 = "";
    public static final String IL1lILLLL1L = " \"'<>#";
    public static final String Ii1liIIIiLi = "\\^`{|}";
    public static final String IiiL1llIIi = " \"':;<=>@[]^`{}|/\\?#";
    public static final String IilL11ii1I1Il = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String i111iLiiIIill = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String i1L1lLllLLlIi = "[]";
    public static final String iILiI1lll = " \"':;<=>@[]^`{}|/\\?#";
    public static final String iL1LIlIlI = " \"'<>#&=";
    public static final String iiLIIiIli = " \"#<>\\^`{|}";
    public static final char[] iilLiIIIi11i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @Nullable
    public final List<String> I11lLL1;
    public final String IiIIlIL;
    public final String i1LIL11l;
    @Nullable
    public final String iLLLILIiLi1Ii;
    public final String iiI1L1iI;
    public final int iiIliillii;
    public final List<String> iilLil1i11I1;
    public final String il1LilLllii;
    public final String illlI1lLIL;

    /* renamed from: top.tntok.autobot.o000oo00$iiI1L1iI */
    public static final class iiI1L1iI {
        public static final String IiIIlIL = "Invalid URL host";
        @Nullable
        public List<String> I11lLL1;
        public String i1LIL11l = "";
        @Nullable
        public String iLLLILIiLi1Ii;
        @Nullable
        public String iiI1L1iI;
        public int iiIliillii = -1;
        public final List<String> iilLil1i11I1;
        @Nullable
        public String il1LilLllii;
        public String illlI1lLIL = "";

        public iiI1L1iI() {
            ArrayList arrayList = new ArrayList();
            this.iilLil1i11I1 = arrayList;
            arrayList.add("");
        }

        public static int IL1IiilLlLI(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        public static int ILllI11(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        @Nullable
        public static String IiIIlIL(String str, int i, int i2) {
            return C0487o0OooooO.il1LilLllii(C0109o000oo00.IliiLiLliIl(str, i, i2, false));
        }

        public static int iiLIIiIli(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C0109o000oo00.iiI1L1iI(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        public static int iiiiI1iILL11I(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        public iiI1L1iI I11lLL1(String str, @Nullable String str2) {
            String str3;
            if (str != null) {
                if (this.I11lLL1 == null) {
                    this.I11lLL1 = new ArrayList();
                }
                this.I11lLL1.add(C0109o000oo00.i1LIL11l(str, C0109o000oo00.i111iLiiIIill, false, false, true, true));
                List<String> list = this.I11lLL1;
                if (str2 != null) {
                    str3 = C0109o000oo00.i1LIL11l(str2, C0109o000oo00.i111iLiiIIill, false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public iiI1L1iI I1I11Il1(@Nullable String str) {
            List<String> list;
            if (str != null) {
                list = C0109o000oo00.illiiliIILI(C0109o000oo00.i1LIL11l(str, C0109o000oo00.IL1lILLLL1L, false, false, true, true));
            } else {
                list = null;
            }
            this.I11lLL1 = list;
            return this;
        }

        public iiI1L1iI I1IIIi1i1ILl(int i) {
            this.iilLil1i11I1.remove(i);
            if (this.iilLil1i11I1.isEmpty()) {
                this.iilLil1i11I1.add("");
            }
            return this;
        }

        public iiI1L1iI I1iIiIi(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                IilliIIIlI1ll(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException("unexpected encodedPath: " + str);
            }
        }

        public iiI1L1iI I1l1iIll1lIi1(@Nullable C0109o000oo00 o000oo00, String str) {
            int iL1LIlIlI;
            char c;
            int i;
            C0109o000oo00 o000oo002 = o000oo00;
            String str2 = str;
            int IIIlll1lll = C0487o0OooooO.IIIlll1lll(str2, 0, str.length());
            int IL1IiilLlLI = C0487o0OooooO.IL1IiilLlLI(str2, IIIlll1lll, str.length());
            int IL1IiilLlLI2 = IL1IiilLlLI(str2, IIIlll1lll, IL1IiilLlLI);
            if (IL1IiilLlLI2 != -1) {
                if (str.regionMatches(true, IIIlll1lll, "https:", 0, 6)) {
                    this.iiI1L1iI = "https";
                    IIIlll1lll += 6;
                } else if (str.regionMatches(true, IIIlll1lll, "http:", 0, 5)) {
                    this.iiI1L1iI = "http";
                    IIIlll1lll += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, IL1IiilLlLI2) + "'");
                }
            } else if (o000oo002 != null) {
                this.iiI1L1iI = o000oo002.iiI1L1iI;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int ILllI11 = ILllI11(str2, IIIlll1lll, IL1IiilLlLI);
            char c2 = '?';
            char c3 = '#';
            if (ILllI11 >= 2 || o000oo002 == null || !o000oo002.iiI1L1iI.equals(this.iiI1L1iI)) {
                int i2 = IIIlll1lll + ILllI11;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iL1LIlIlI = C0487o0OooooO.iL1LIlIlI(str2, i2, IL1IiilLlLI, "@/\\?#");
                    if (iL1LIlIlI != IL1IiilLlLI) {
                        c = str2.charAt(iL1LIlIlI);
                    } else {
                        c = 65535;
                    }
                    if (c == 65535 || c == c3 || c == '/' || c == '\\' || c == c2) {
                        int i3 = iL1LIlIlI;
                        int iiiiI1iILL11I = iiiiI1iILL11I(str2, i2, i3);
                        int i4 = iiiiI1iILL11I + 1;
                    } else {
                        if (c == '@') {
                            if (!z) {
                                int IL1lILLLL1L = C0487o0OooooO.IL1lILLLL1L(str2, i2, iL1LIlIlI, ':');
                                int i5 = IL1lILLLL1L;
                                String str3 = "%40";
                                i = iL1LIlIlI;
                                String iiI1L1iI2 = C0109o000oo00.iiI1L1iI(str, i2, IL1lILLLL1L, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    iiI1L1iI2 = this.i1LIL11l + str3 + iiI1L1iI2;
                                }
                                this.i1LIL11l = iiI1L1iI2;
                                if (i5 != i) {
                                    this.illlI1lLIL = C0109o000oo00.iiI1L1iI(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = iL1LIlIlI;
                                this.illlI1lLIL += "%40" + C0109o000oo00.iiI1L1iI(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = iL1LIlIlI;
                int iiiiI1iILL11I2 = iiiiI1iILL11I(str2, i2, i32);
                int i42 = iiiiI1iILL11I2 + 1;
                if (i42 < i32) {
                    this.il1LilLllii = IiIIlIL(str2, i2, iiiiI1iILL11I2);
                    int iiLIIiIli = iiLIIiIli(str2, i42, i32);
                    this.iiIliillii = iiLIIiIli;
                    if (iiLIIiIli == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.il1LilLllii = IiIIlIL(str2, i2, iiiiI1iILL11I2);
                    this.iiIliillii = C0109o000oo00.iiIliillii(this.iiI1L1iI);
                }
                if (this.il1LilLllii != null) {
                    IIIlll1lll = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, iiiiI1iILL11I2) + '\"');
                }
            } else {
                this.i1LIL11l = o000oo00.IiiL1llIIi();
                this.illlI1lLIL = o000oo00.I11lLL1();
                this.il1LilLllii = o000oo002.il1LilLllii;
                this.iiIliillii = o000oo002.iiIliillii;
                this.iilLil1i11I1.clear();
                this.iilLil1i11I1.addAll(o000oo00.IiIIlIL());
                if (IIIlll1lll == IL1IiilLlLI || str2.charAt(IIIlll1lll) == '#') {
                    i1L1lLllLLlIi(o000oo00.iilLiIIIi11i());
                }
            }
            int iL1LIlIlI2 = C0487o0OooooO.iL1LIlIlI(str2, IIIlll1lll, IL1IiilLlLI, "?#");
            IilliIIIlI1ll(str2, IIIlll1lll, iL1LIlIlI2);
            if (iL1LIlIlI2 < IL1IiilLlLI && str2.charAt(iL1LIlIlI2) == '?') {
                int IL1lILLLL1L2 = C0487o0OooooO.IL1lILLLL1L(str2, iL1LIlIlI2, IL1IiilLlLI, '#');
                this.I11lLL1 = C0109o000oo00.illiiliIILI(C0109o000oo00.iiI1L1iI(str, iL1LIlIlI2 + 1, IL1lILLLL1L2, C0109o000oo00.IL1lILLLL1L, true, false, true, true, (Charset) null));
                iL1LIlIlI2 = IL1lILLLL1L2;
            }
            if (iL1LIlIlI2 < IL1IiilLlLI && str2.charAt(iL1LIlIlI2) == '#') {
                this.iLLLILIiLi1Ii = C0109o000oo00.iiI1L1iI(str, 1 + iL1LIlIlI2, IL1IiilLlLI, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        public iiI1L1iI IIIlll1lll(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.iiI1L1iI = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.iiI1L1iI = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public iiI1L1iI IILiIL1i11Li(int i, String str) {
            if (str != null) {
                String iiI1L1iI2 = C0109o000oo00.iiI1L1iI(str, 0, str.length(), C0109o000oo00.I1iIiIi, true, false, false, true, (Charset) null);
                this.iilLil1i11I1.set(i, iiI1L1iI2);
                if (!Ii1liIIIiLi(iiI1L1iI2) && !IilL11ii1I1Il(iiI1L1iI2)) {
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: " + str);
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public final void IIlL1llI1(String str) {
            for (int size = this.I11lLL1.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.I11lLL1.get(size))) {
                    this.I11lLL1.remove(size + 1);
                    this.I11lLL1.remove(size);
                    if (this.I11lLL1.isEmpty()) {
                        this.I11lLL1 = null;
                        return;
                    }
                }
            }
        }

        public iiI1L1iI IIlLill(String str, @Nullable String str2) {
            IL111l1(str);
            illlI1lLIL(str, str2);
            return this;
        }

        public iiI1L1iI IL111l1(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            } else if (this.I11lLL1 == null) {
                return this;
            } else {
                IIlL1llI1(C0109o000oo00.i1LIL11l(str, C0109o000oo00.iL1LIlIlI, true, false, true, true));
                return this;
            }
        }

        public iiI1L1iI IL1lILLLL1L(String str) {
            if (str != null) {
                this.i1LIL11l = C0109o000oo00.i1LIL11l(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        public iiI1L1iI ILl1iII11Ll1(String str) {
            if (str != null) {
                this.illlI1lLIL = C0109o000oo00.i1LIL11l(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public final boolean Ii1liIIIiLi(String str) {
            if (str.equals(".") || str.equalsIgnoreCase("%2e")) {
                return true;
            }
            return false;
        }

        public iiI1L1iI IiiL1llIIi(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = C0109o000oo00.i1LIL11l(str, "", true, false, false, false);
            } else {
                str2 = null;
            }
            this.iLLLILIiLi1Ii = str2;
            return this;
        }

        public final boolean IilL11ii1I1Il(String str) {
            if (str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e")) {
                return true;
            }
            return false;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        public final void IilliIIIlI1ll(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.iilLil1i11I1
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.iilLil1i11I1
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.iilLil1i11I1
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = top.tntok.autobot.C0487o0OooooO.iL1LIlIlI(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.IliiLiLliIl(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0109o000oo00.iiI1L1iI.IilliIIIlI1ll(java.lang.String, int, int):void");
        }

        public final void IliiLiLliIl(String str, int i, int i2, boolean z, boolean z2) {
            String iiI1L1iI2 = C0109o000oo00.iiI1L1iI(str, i, i2, C0109o000oo00.I1iIiIi, z2, false, false, true, (Charset) null);
            if (!Ii1liIIIiLi(iiI1L1iI2)) {
                if (IilL11ii1I1Il(iiI1L1iI2)) {
                    i1iiLIil1ILi();
                    return;
                }
                List<String> list = this.iilLil1i11I1;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.iilLil1i11I1;
                    list2.set(list2.size() - 1, iiI1L1iI2);
                } else {
                    this.iilLil1i11I1.add(iiI1L1iI2);
                }
                if (z) {
                    this.iilLil1i11I1.add("");
                }
            }
        }

        public iiI1L1iI i111iLiiIIill(String str) {
            if (str != null) {
                String IiIIlIL2 = IiIIlIL(str, 0, str.length());
                if (IiIIlIL2 != null) {
                    this.il1LilLllii = IiIIlIL2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        public iiI1L1iI i11liIIl11Ii1(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.iiIliillii = i;
            return this;
        }

        public iiI1L1iI i1L1lLllLLlIi(@Nullable String str) {
            List<String> list;
            if (str != null) {
                list = C0109o000oo00.illiiliIILI(C0109o000oo00.i1LIL11l(str, C0109o000oo00.IL1lILLLL1L, true, false, true, true));
            } else {
                list = null;
            }
            this.I11lLL1 = list;
            return this;
        }

        public iiI1L1iI i1LIL11l(String str) {
            if (str != null) {
                return iilLil1i11I1(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public iiI1L1iI i1iI1iiLL1() {
            int size = this.iilLil1i11I1.size();
            for (int i = 0; i < size; i++) {
                this.iilLil1i11I1.set(i, C0109o000oo00.i1LIL11l(this.iilLil1i11I1.get(i), C0109o000oo00.i1L1lLllLLlIi, true, true, false, true));
            }
            List<String> list = this.I11lLL1;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.I11lLL1.get(i2);
                    if (str != null) {
                        this.I11lLL1.set(i2, C0109o000oo00.i1LIL11l(str, C0109o000oo00.Ii1liIIIiLi, true, true, true, true));
                    }
                }
            }
            String str2 = this.iLLLILIiLi1Ii;
            if (str2 != null) {
                this.iLLLILIiLi1Ii = C0109o000oo00.i1LIL11l(str2, C0109o000oo00.iiLIIiIli, true, true, false, false);
            }
            return this;
        }

        public iiI1L1iI i1iLlIill1I(String str) {
            if (str != null) {
                this.i1LIL11l = C0109o000oo00.i1LIL11l(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public final void i1iiLIil1ILi() {
            List<String> list = this.iilLil1i11I1;
            if (!list.remove(list.size() - 1).isEmpty() || this.iilLil1i11I1.isEmpty()) {
                this.iilLil1i11I1.add("");
                return;
            }
            List<String> list2 = this.iilLil1i11I1;
            list2.set(list2.size() - 1, "");
        }

        public iiI1L1iI iILiI1lll(String str) {
            if (str != null) {
                this.illlI1lLIL = C0109o000oo00.i1LIL11l(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        public iiI1L1iI iL1LIlIlI(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = C0109o000oo00.i1LIL11l(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.iLLLILIiLi1Ii = str2;
            return this;
        }

        public C0109o000oo00 iLLLILIiLi1Ii() {
            if (this.iiI1L1iI == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.il1LilLllii != null) {
                return new C0109o000oo00(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public iiI1L1iI iiI1L1iI(String str) {
            if (str != null) {
                IliiLiLliIl(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public iiI1L1iI iiIliillii(String str) {
            if (str != null) {
                return iilLil1i11I1(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public int iilLiIIIi11i() {
            int i = this.iiIliillii;
            if (i != -1) {
                return i;
            }
            return C0109o000oo00.iiIliillii(this.iiI1L1iI);
        }

        public final iiI1L1iI iilLil1i11I1(String str, boolean z) {
            boolean z2;
            int i = 0;
            do {
                int iL1LIlIlI = C0487o0OooooO.iL1LIlIlI(str, i, str.length(), "/\\");
                if (iL1LIlIlI < str.length()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                IliiLiLliIl(str, i, iL1LIlIlI, z2, z);
                i = iL1LIlIlI + 1;
            } while (i <= str.length());
            return this;
        }

        public iiI1L1iI il1LilLllii(String str) {
            if (str != null) {
                IliiLiLliIl(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public iiI1L1iI il1l1IlL(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (this.I11lLL1 == null) {
                return this;
            } else {
                IIlL1llI1(C0109o000oo00.i1LIL11l(str, C0109o000oo00.i111iLiiIIill, false, false, true, true));
                return this;
            }
        }

        public iiI1L1iI iliilLllIl1(int i, String str) {
            if (str != null) {
                String iiI1L1iI2 = C0109o000oo00.iiI1L1iI(str, 0, str.length(), C0109o000oo00.I1iIiIi, false, false, false, true, (Charset) null);
                if (Ii1liIIIiLi(iiI1L1iI2) || IilL11ii1I1Il(iiI1L1iI2)) {
                    throw new IllegalArgumentException("unexpected path segment: " + str);
                }
                this.iilLil1i11I1.set(i, iiI1L1iI2);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public iiI1L1iI illiiliIILI(String str, @Nullable String str2) {
            il1l1IlL(str);
            I11lLL1(str, str2);
            return this;
        }

        public iiI1L1iI illlI1lLIL(String str, @Nullable String str2) {
            String str3;
            if (str != null) {
                if (this.I11lLL1 == null) {
                    this.I11lLL1 = new ArrayList();
                }
                this.I11lLL1.add(C0109o000oo00.i1LIL11l(str, C0109o000oo00.iL1LIlIlI, true, false, true, true));
                List<String> list = this.I11lLL1;
                if (str2 != null) {
                    str3 = C0109o000oo00.i1LIL11l(str2, C0109o000oo00.iL1LIlIlI, true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.iiI1L1iI;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.i1LIL11l.isEmpty() || !this.illlI1lLIL.isEmpty()) {
                sb.append(this.i1LIL11l);
                if (!this.illlI1lLIL.isEmpty()) {
                    sb.append(':');
                    sb.append(this.illlI1lLIL);
                }
                sb.append('@');
            }
            String str2 = this.il1LilLllii;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.il1LilLllii);
                    sb.append(']');
                } else {
                    sb.append(this.il1LilLllii);
                }
            }
            if (!(this.iiIliillii == -1 && this.iiI1L1iI == null)) {
                int iilLiIIIi11i = iilLiIIIi11i();
                String str3 = this.iiI1L1iI;
                if (str3 == null || iilLiIIIi11i != C0109o000oo00.iiIliillii(str3)) {
                    sb.append(':');
                    sb.append(iilLiIIIi11i);
                }
            }
            C0109o000oo00.i11liIIl11Ii1(sb, this.iilLil1i11I1);
            if (this.I11lLL1 != null) {
                sb.append('?');
                C0109o000oo00.Ii1liIIIiLi(sb, this.I11lLL1);
            }
            if (this.iLLLILIiLi1Ii != null) {
                sb.append('#');
                sb.append(this.iLLLILIiLi1Ii);
            }
            return sb.toString();
        }
    }

    public C0109o000oo00(iiI1L1iI iii1l1ii) {
        List<String> list;
        this.iiI1L1iI = iii1l1ii.iiI1L1iI;
        this.i1LIL11l = I1I11Il1(iii1l1ii.i1LIL11l, false);
        this.illlI1lLIL = I1I11Il1(iii1l1ii.illlI1lLIL, false);
        this.il1LilLllii = iii1l1ii.il1LilLllii;
        this.iiIliillii = iii1l1ii.iilLiIIIi11i();
        this.iilLil1i11I1 = i1iI1iiLL1(iii1l1ii.iilLil1i11I1, false);
        List<String> list2 = iii1l1ii.I11lLL1;
        String str = null;
        if (list2 != null) {
            list = i1iI1iiLL1(list2, true);
        } else {
            list = null;
        }
        this.I11lLL1 = list;
        String str2 = iii1l1ii.iLLLILIiLi1Ii;
        this.iLLLILIiLi1Ii = str2 != null ? I1I11Il1(str2, false) : str;
        this.IiIIlIL = iii1l1ii.toString();
    }

    public static String I1I11Il1(String str, boolean z) {
        return IliiLiLliIl(str, 0, str.length(), z);
    }

    public static C0109o000oo00 I1iIiIi(String str) {
        return new iiI1L1iI().I1l1iIll1lIi1((C0109o000oo00) null, str).iLLLILIiLi1Ii();
    }

    public static void IIlL1llI1(IiILIlLLiIL iiILIlLLiIL, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int iILiI1lll2 = C0487o0OooooO.iILiI1lll(str.charAt(i + 1));
                int iILiI1lll3 = C0487o0OooooO.iILiI1lll(str.charAt(i3));
                if (!(iILiI1lll2 == -1 || iILiI1lll3 == -1)) {
                    iiILIlLLiIL.IillLillLLIii((iILiI1lll2 << 4) + iILiI1lll3);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                iiILIlLLiIL.IillLillLLIii(32);
                i += Character.charCount(codePointAt);
            }
            iiILIlLLiIL.iLiI1Llil(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean IL111l1(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C0487o0OooooO.iILiI1lll(str.charAt(i + 1)) == -1 || C0487o0OooooO.iILiI1lll(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    @Nullable
    public static C0109o000oo00 IL1lILLLL1L(URL url) {
        return iiLIIiIli(url.toString());
    }

    public static void Ii1liIIIiLi(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String IliiLiLliIl(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
                iiILIlLLiIL.ILl1iII11Ll1(str, i, i3);
                IIlL1llI1(iiILIlLLiIL, str, i3, i2, z);
                return iiILIlLLiIL.illi1IL1();
            }
        }
        return str.substring(i, i2);
    }

    public static void i11liIIl11Ii1(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    @Nullable
    public static C0109o000oo00 i1L1lLllLLlIi(URI uri) {
        return iiLIIiIli(uri.toString());
    }

    public static String i1LIL11l(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return iiI1L1iI(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    public static String iiI1L1iI(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || IL111l1(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            int i5 = i;
            iiILIlLLiIL.ILl1iII11Ll1(str, i, i4);
            il1LilLllii(iiILIlLLiIL, str, i4, i2, str2, z, z2, z3, z4, charset);
            return iiILIlLLiIL.illi1IL1();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    public static int iiIliillii(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    @Nullable
    public static C0109o000oo00 iiLIIiIli(String str) {
        try {
            return I1iIiIi(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void il1LilLllii(IiILIlLLiIL iiILIlLLiIL, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        IiILIlLLiIL iiILIlLLiIL2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    iiILIlLLiIL.illiiliIILI(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !IL111l1(str, i, i2)))))) {
                    if (iiILIlLLiIL2 == null) {
                        iiILIlLLiIL2 = new IiILIlLLiIL();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        iiILIlLLiIL2.iLiI1Llil(codePointAt);
                    } else {
                        iiILIlLLiIL2.i11liIIl11Ii1(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!iiILIlLLiIL2.Il1llillili()) {
                        byte readByte = iiILIlLLiIL2.readByte();
                        byte b = readByte & i1IL1lILl1L1I.iiI1L1iI;
                        iiILIlLLiIL.IillLillLLIii(37);
                        char[] cArr = iilLiIIIi11i;
                        iiILIlLLiIL.IillLillLLIii(cArr[(b >> 4) & 15]);
                        iiILIlLLiIL.IillLillLLIii(cArr[readByte & 15]);
                    }
                } else {
                    iiILIlLLiIL.iLiI1Llil(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static List<String> illiiliIILI(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static String illlI1lLIL(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        return iiI1L1iI(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public String I11lLL1() {
        if (this.illlI1lLIL.isEmpty()) {
            return "";
        }
        int indexOf = this.IiIIlIL.indexOf(64);
        return this.IiIIlIL.substring(this.IiIIlIL.indexOf(58, this.iiI1L1iI.length() + 3) + 1, indexOf);
    }

    @Nullable
    public String I1IIIi1i1ILl() {
        if (this.I11lLL1 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Ii1liIIIiLi(sb, this.I11lLL1);
        return sb.toString();
    }

    @Nullable
    public iiI1L1iI I1l1iIll1lIi1(String str) {
        try {
            return new iiI1L1iI().I1l1iIll1lIi1(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String IIIlll1lll(int i) {
        List<String> list = this.I11lLL1;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public String IILiIL1i11Li(int i) {
        List<String> list = this.I11lLL1;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @Nullable
    public String IIi1l1i() {
        if (C0487o0OooooO.ILllI11(this.il1LilLllii)) {
            return null;
        }
        return PublicSuffixDatabase.illlI1lLIL().il1LilLllii(this.il1LilLllii);
    }

    public List<String> IIlLill(String str) {
        if (this.I11lLL1 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.I11lLL1.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.I11lLL1.get(i))) {
                arrayList.add(this.I11lLL1.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public URI IIllllLiIlIl() {
        String iii1l1ii = IilL11ii1I1Il().i1iI1iiLL1().toString();
        try {
            return new URI(iii1l1ii);
        } catch (URISyntaxException e) {
            try {
                return URI.create(iii1l1ii.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public Set<String> IL1IiilLlLI() {
        if (this.I11lLL1 == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.I11lLL1.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.I11lLL1.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String ILl1iII11Ll1() {
        return this.illlI1lLIL;
    }

    public String ILllI11() {
        return I1l1iIll1lIi1("/...").i1iLlIill1I("").ILl1iII11Ll1("").iLLLILIiLi1Ii().toString();
    }

    public List<String> IiIIlIL() {
        int indexOf = this.IiIIlIL.indexOf(47, this.iiI1L1iI.length() + 3);
        String str = this.IiIIlIL;
        int iL1LIlIlI2 = C0487o0OooooO.iL1LIlIlI(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < iL1LIlIlI2) {
            int i = indexOf + 1;
            int IL1lILLLL1L2 = C0487o0OooooO.IL1lILLLL1L(this.IiIIlIL, i, iL1LIlIlI2, '/');
            arrayList.add(this.IiIIlIL.substring(i, IL1lILLLL1L2));
            indexOf = IL1lILLLL1L2;
        }
        return arrayList;
    }

    public URL IiiIlLl1il1i() {
        try {
            return new URL(this.IiIIlIL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String IiiL1llIIi() {
        if (this.i1LIL11l.isEmpty()) {
            return "";
        }
        int length = this.iiI1L1iI.length() + 3;
        String str = this.IiIIlIL;
        return this.IiIIlIL.substring(length, C0487o0OooooO.iL1LIlIlI(str, length, str.length(), ":@"));
    }

    public iiI1L1iI IilL11ii1I1Il() {
        int i;
        iiI1L1iI iii1l1ii = new iiI1L1iI();
        iii1l1ii.iiI1L1iI = this.iiI1L1iI;
        iii1l1ii.i1LIL11l = IiiL1llIIi();
        iii1l1ii.illlI1lLIL = I11lLL1();
        iii1l1ii.il1LilLllii = this.il1LilLllii;
        if (this.iiIliillii != iiIliillii(this.iiI1L1iI)) {
            i = this.iiIliillii;
        } else {
            i = -1;
        }
        iii1l1ii.iiIliillii = i;
        iii1l1ii.iilLil1i11I1.clear();
        iii1l1ii.iilLil1i11I1.addAll(IiIIlIL());
        iii1l1ii.i1L1lLllLLlIi(iilLiIIIi11i());
        iii1l1ii.iLLLILIiLi1Ii = iilLil1i11I1();
        return iii1l1ii;
    }

    @Nullable
    public String IilliIIIlI1ll(String str) {
        List<String> list = this.I11lLL1;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.I11lLL1.get(i))) {
                return this.I11lLL1.get(i + 1);
            }
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0109o000oo00) || !((C0109o000oo00) obj).IiIIlIL.equals(this.IiIIlIL)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.IiIIlIL.hashCode();
    }

    public boolean i111iLiiIIill() {
        return this.iiI1L1iI.equals("https");
    }

    public final List<String> i1iI1iiLL1(List<String> list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = list.get(i);
            if (str2 != null) {
                str = I1I11Il1(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public C0109o000oo00 i1iLlIill1I(String str) {
        iiI1L1iI I1l1iIll1lIi12 = I1l1iIll1lIi1(str);
        if (I1l1iIll1lIi12 != null) {
            return I1l1iIll1lIi12.iLLLILIiLi1Ii();
        }
        return null;
    }

    public List<String> i1iiLIil1ILi() {
        return this.iilLil1i11I1;
    }

    @Nullable
    public String iILiI1lll() {
        return this.iLLLILIiLi1Ii;
    }

    public String iL1LIlIlI() {
        return this.il1LilLllii;
    }

    public String iLLLILIiLi1Ii() {
        int indexOf = this.IiIIlIL.indexOf(47, this.iiI1L1iI.length() + 3);
        String str = this.IiIIlIL;
        return this.IiIIlIL.substring(indexOf, C0487o0OooooO.iL1LIlIlI(str, indexOf, str.length(), "?#"));
    }

    public String iLlIllll() {
        return this.i1LIL11l;
    }

    public int iiiiI1iILL11I() {
        return this.iilLil1i11I1.size();
    }

    @Nullable
    public String iilLiIIIi11i() {
        if (this.I11lLL1 == null) {
            return null;
        }
        int indexOf = this.IiIIlIL.indexOf(63) + 1;
        String str = this.IiIIlIL;
        return this.IiIIlIL.substring(indexOf, C0487o0OooooO.IL1lILLLL1L(str, indexOf, str.length(), '#'));
    }

    @Nullable
    public String iilLil1i11I1() {
        if (this.iLLLILIiLi1Ii == null) {
            return null;
        }
        return this.IiIIlIL.substring(this.IiIIlIL.indexOf(35) + 1);
    }

    public int il1l1IlL() {
        return this.iiIliillii;
    }

    public int iliilLllIl1() {
        List<String> list = this.I11lLL1;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String illi1LIILLiL() {
        return this.iiI1L1iI;
    }

    public String toString() {
        return this.IiIIlIL;
    }
}
