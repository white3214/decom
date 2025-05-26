package top.tntok.autobot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import top.tntok.autobot.C0094o000o000;

public final class oo00oO extends C0334o0O0ooOO {
    public static final C0179o00OooO0 I11lLL1 = C0179o00OooO0.illlI1lLIL("multipart/alternative");
    public static final byte[] I1iIiIi = {C0186o00o00.i1L1lLllLLlIi, C0186o00o00.i1L1lLllLLlIi};
    public static final C0179o00OooO0 IiIIlIL = C0179o00OooO0.illlI1lLIL("multipart/parallel");
    public static final byte[] IiiL1llIIi = {58, 32};
    public static final byte[] iILiI1lll = {C0186o00o00.iILiI1lll, 10};
    public static final C0179o00OooO0 iLLLILIiLi1Ii = C0179o00OooO0.illlI1lLIL("multipart/digest");
    public static final C0179o00OooO0 iilLiIIIi11i = C0179o00OooO0.illlI1lLIL("multipart/form-data");
    public static final C0179o00OooO0 iilLil1i11I1 = C0179o00OooO0.illlI1lLIL(C0060o0000OOo.iILiI1lll);
    public final C0179o00OooO0 i1LIL11l;
    public final ili11iILI1l iiI1L1iI;
    public long iiIliillii = -1;
    public final List<i1LIL11l> il1LilLllii;
    public final C0179o00OooO0 illlI1lLIL;

    public static final class i1LIL11l {
        public final C0334o0O0ooOO i1LIL11l;
        @Nullable
        public final C0094o000o000 iiI1L1iI;

        public i1LIL11l(@Nullable C0094o000o000 o000o000, C0334o0O0ooOO o0o0oooo) {
            this.iiI1L1iI = o000o000;
            this.i1LIL11l = o0o0oooo;
        }

        public static i1LIL11l i1LIL11l(@Nullable C0094o000o000 o000o000, C0334o0O0ooOO o0o0oooo) {
            if (o0o0oooo == null) {
                throw new NullPointerException("body == null");
            } else if (o000o000 != null && o000o000.il1LilLllii("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (o000o000 == null || o000o000.il1LilLllii("Content-Length") == null) {
                return new i1LIL11l(o000o000, o0o0oooo);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static i1LIL11l iiIliillii(String str, @Nullable String str2, C0334o0O0ooOO o0o0oooo) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                oo00oO.IiiL1llIIi(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    oo00oO.IiiL1llIIi(sb, str2);
                }
                return i1LIL11l(new C0094o000o000.iiI1L1iI().iLLLILIiLi1Ii("Content-Disposition", sb.toString()).IiIIlIL(), o0o0oooo);
            }
            throw new NullPointerException("name == null");
        }

        public static i1LIL11l il1LilLllii(String str, String str2) {
            return iiIliillii(str, (String) null, C0334o0O0ooOO.il1LilLllii((C0179o00OooO0) null, str2));
        }

        public static i1LIL11l illlI1lLIL(C0334o0O0ooOO o0o0oooo) {
            return i1LIL11l((C0094o000o000) null, o0o0oooo);
        }

        public C0334o0O0ooOO iiI1L1iI() {
            return this.i1LIL11l;
        }

        @Nullable
        public C0094o000o000 iilLil1i11I1() {
            return this.iiI1L1iI;
        }
    }

    public static final class iiI1L1iI {
        public C0179o00OooO0 i1LIL11l;
        public final ili11iILI1l iiI1L1iI;
        public final List<i1LIL11l> illlI1lLIL;

        public iiI1L1iI() {
            this(UUID.randomUUID().toString());
        }

        public iiI1L1iI I11lLL1(C0179o00OooO0 o00oooo0) {
            if (o00oooo0 == null) {
                throw new NullPointerException("type == null");
            } else if (o00oooo0.iilLil1i11I1().equals("multipart")) {
                this.i1LIL11l = o00oooo0;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + o00oooo0);
            }
        }

        public iiI1L1iI i1LIL11l(String str, @Nullable String str2, C0334o0O0ooOO o0o0oooo) {
            return il1LilLllii(i1LIL11l.iiIliillii(str, str2, o0o0oooo));
        }

        public iiI1L1iI iiI1L1iI(String str, String str2) {
            return il1LilLllii(i1LIL11l.il1LilLllii(str, str2));
        }

        public iiI1L1iI iiIliillii(C0334o0O0ooOO o0o0oooo) {
            return il1LilLllii(i1LIL11l.illlI1lLIL(o0o0oooo));
        }

        public oo00oO iilLil1i11I1() {
            if (!this.illlI1lLIL.isEmpty()) {
                return new oo00oO(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public iiI1L1iI il1LilLllii(i1LIL11l i1lil11l) {
            if (i1lil11l != null) {
                this.illlI1lLIL.add(i1lil11l);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public iiI1L1iI illlI1lLIL(@Nullable C0094o000o000 o000o000, C0334o0O0ooOO o0o0oooo) {
            return il1LilLllii(i1LIL11l.i1LIL11l(o000o000, o0o0oooo));
        }

        public iiI1L1iI(String str) {
            this.i1LIL11l = oo00oO.iilLil1i11I1;
            this.illlI1lLIL = new ArrayList();
            this.iiI1L1iI = ili11iILI1l.IiiL1llIIi(str);
        }
    }

    public oo00oO(ili11iILI1l ili11iili1l, C0179o00OooO0 o00oooo0, List<i1LIL11l> list) {
        this.iiI1L1iI = ili11iili1l;
        this.i1LIL11l = o00oooo0;
        this.illlI1lLIL = C0179o00OooO0.illlI1lLIL(o00oooo0 + "; boundary=" + ili11iili1l.ILiLII1ILi());
        this.il1LilLllii = C0487o0OooooO.iiLIIiIli(list);
    }

    public static void IiiL1llIIi(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: top.tntok.autobot.Iiii1LiI11i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: top.tntok.autobot.IiILIlLLiIL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: top.tntok.autobot.IiILIlLLiIL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: top.tntok.autobot.Iiii1LiI11i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: top.tntok.autobot.IiILIlLLiIL} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long i111iLiiIIill(@javax.annotation.Nullable top.tntok.autobot.Iiii1LiI11i r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            top.tntok.autobot.IiILIlLLiIL r13 = new top.tntok.autobot.IiILIlLLiIL
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<top.tntok.autobot.oo00oO$i1LIL11l> r1 = r12.il1LilLllii
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a4
            java.util.List<top.tntok.autobot.oo00oO$i1LIL11l> r6 = r12.il1LilLllii
            java.lang.Object r6 = r6.get(r5)
            top.tntok.autobot.oo00oO$i1LIL11l r6 = (top.tntok.autobot.oo00oO.i1LIL11l) r6
            top.tntok.autobot.o000o000 r7 = r6.iiI1L1iI
            top.tntok.autobot.o0O0ooOO r6 = r6.i1LIL11l
            byte[] r8 = I1iIiIi
            r13.iiIliillii(r8)
            top.tntok.autobot.ili11iILI1l r8 = r12.iiI1L1iI
            r13.ILiLII1ILi(r8)
            byte[] r8 = iILiI1lll
            r13.iiIliillii(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.I1iIiIi()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.iLLLILIiLi1Ii(r9)
            top.tntok.autobot.Iiii1LiI11i r10 = r13.illiiliIILI(r10)
            byte[] r11 = IiiL1llIIi
            top.tntok.autobot.Iiii1LiI11i r10 = r10.iiIliillii(r11)
            java.lang.String r11 = r7.IL1lILLLL1L(r9)
            top.tntok.autobot.Iiii1LiI11i r10 = r10.illiiliIILI(r11)
            byte[] r11 = iILiI1lll
            r10.iiIliillii(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            top.tntok.autobot.o00OooO0 r7 = r6.i1LIL11l()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            top.tntok.autobot.Iiii1LiI11i r8 = r13.illiiliIILI(r8)
            java.lang.String r7 = r7.toString()
            top.tntok.autobot.Iiii1LiI11i r7 = r8.illiiliIILI(r7)
            byte[] r8 = iILiI1lll
            r7.iiIliillii(r8)
        L_0x0071:
            long r7 = r6.iiI1L1iI()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            top.tntok.autobot.Iiii1LiI11i r9 = r13.illiiliIILI(r9)
            top.tntok.autobot.Iiii1LiI11i r9 = r9.IIllllLiIlIl(r7)
            byte[] r10 = iILiI1lll
            r9.iiIliillii(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.IIL1Ll1I111()
            return r9
        L_0x0091:
            byte[] r9 = iILiI1lll
            r13.iiIliillii(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.iilLiIIIi11i(r13)
        L_0x009d:
            r13.iiIliillii(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a4:
            byte[] r1 = I1iIiIi
            r13.iiIliillii(r1)
            top.tntok.autobot.ili11iILI1l r2 = r12.iiI1L1iI
            r13.ILiLII1ILi(r2)
            r13.iiIliillii(r1)
            byte[] r1 = iILiI1lll
            r13.iiIliillii(r1)
            if (r14 == 0) goto L_0x00c0
            long r13 = r0.iLLi1LIi()
            long r3 = r3 + r13
            r0.IIL1Ll1I111()
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.oo00oO.i111iLiiIIill(top.tntok.autobot.Iiii1LiI11i, boolean):long");
    }

    public i1LIL11l I1iIiIi(int i) {
        return this.il1LilLllii.get(i);
    }

    public int IL1lILLLL1L() {
        return this.il1LilLllii.size();
    }

    public List<i1LIL11l> i1L1lLllLLlIi() {
        return this.il1LilLllii;
    }

    public C0179o00OooO0 i1LIL11l() {
        return this.illlI1lLIL;
    }

    public String iILiI1lll() {
        return this.iiI1L1iI.ILiLII1ILi();
    }

    public C0179o00OooO0 iL1LIlIlI() {
        return this.i1LIL11l;
    }

    public long iiI1L1iI() throws IOException {
        long j = this.iiIliillii;
        if (j != -1) {
            return j;
        }
        long i111iLiiIIill = i111iLiiIIill((Iiii1LiI11i) null, true);
        this.iiIliillii = i111iLiiIIill;
        return i111iLiiIIill;
    }

    public void iilLiIIIi11i(Iiii1LiI11i iiii1LiI11i) throws IOException {
        i111iLiiIIill(iiii1LiI11i, false);
    }
}
