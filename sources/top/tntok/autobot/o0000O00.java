package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import top.tntok.autobot.C0186o00o00;
import top.tntok.autobot.o0000;

public class o0000O00 implements o0000 {
    public o00000OO I11lLL1;
    public final String i1LIL11l;
    public final C0059o00000oo iiI1L1iI;
    public final boolean iiIliillii;
    public final InputStream iilLil1i11I1;
    public final String il1LilLllii;
    public final String illlI1lLIL;

    public class iiI1L1iI extends C0157o00Oo0o {
        public final /* synthetic */ C0186o00o00.i1LIL11l iiIliillii;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiI1L1iI(InputStream inputStream, long j, C0186o00o00.i1LIL11l i1lil11l) {
            super(inputStream, j);
            this.iiIliillii = i1lil11l;
        }

        public void il1LilLllii(long j, long j2) throws IOException {
            this.iiIliillii.i1LIL11l(true);
            C0069o0000oO o0000oo = new C0069o0000oO(String.format("The field %s exceeds its maximum permitted size of %s bytes.", new Object[]{o0000O00.this.illlI1lLIL, Long.valueOf(j)}), j2, j);
            o0000oo.iiIliillii(o0000O00.this.illlI1lLIL);
            o0000oo.iilLil1i11I1(o0000O00.this.il1LilLllii);
            throw new C0061o0000Oo(o0000oo);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: top.tntok.autobot.o00o00$i1LIL11l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: top.tntok.autobot.o00o00$i1LIL11l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: top.tntok.autobot.o0000O00$iiI1L1iI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: top.tntok.autobot.o00o00$i1LIL11l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o0000O00(top.tntok.autobot.C0059o00000oo r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, long r12) throws top.tntok.autobot.C0062o0000Oo0, java.io.IOException {
        /*
            r6 = this;
            r6.<init>()
            r6.iiI1L1iI = r7
            r6.il1LilLllii = r8
            r6.illlI1lLIL = r9
            r6.i1LIL11l = r10
            r6.iiIliillii = r11
            long r10 = r7.il1LilLllii()
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0047
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0047
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0020
            goto L_0x0047
        L_0x0020:
            top.tntok.autobot.o0000oO r7 = new top.tntok.autobot.o0000oO
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "The field %s exceeds its maximum permitted size of %s bytes."
            java.lang.String r1 = java.lang.String.format(r0, r1)
            r0 = r7
            r2 = r12
            r4 = r10
            r0.<init>(r1, r2, r4)
            r7.iilLil1i11I1(r8)
            r7.iiIliillii(r9)
            top.tntok.autobot.o0000Oo r8 = new top.tntok.autobot.o0000Oo
            r8.<init>(r7)
            throw r8
        L_0x0047:
            top.tntok.autobot.o00o00 r7 = r7.iLLLILIiLi1Ii()
            top.tntok.autobot.o00o00$i1LIL11l r12 = r7.i111iLiiIIill()
            if (r2 == 0) goto L_0x005a
            top.tntok.autobot.o0000O00$iiI1L1iI r13 = new top.tntok.autobot.o0000O00$iiI1L1iI
            r7 = r13
            r8 = r6
            r9 = r12
            r7.<init>(r9, r10, r12)
            r12 = r13
        L_0x005a:
            r6.iilLil1i11I1 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o0000O00.<init>(top.tntok.autobot.o00000oo, java.lang.String, java.lang.String, java.lang.String, boolean, long):void");
    }

    public o00000OO I11lLL1() {
        return this.I11lLL1;
    }

    public void I1iIiIi(o00000OO o00000oo) {
        this.I11lLL1 = o00000oo;
    }

    public void I1l1iIll1lIi1() throws IOException {
        this.iilLil1i11I1.close();
    }

    public String i1LIL11l() {
        return this.i1LIL11l;
    }

    public InputStream iL1LIlIlI() throws IOException {
        if (!((IlI1Ill1lIL1) this.iilLil1i11I1).iiI1L1iI()) {
            return this.iilLil1i11I1;
        }
        throw new o0000.iiI1L1iI();
    }

    public String iiI1L1iI() {
        return C0381o0OOo0oO.illlI1lLIL(this.il1LilLllii);
    }

    public boolean iiIliillii() {
        return this.iiIliillii;
    }

    public String iilLil1i11I1() {
        return this.illlI1lLIL;
    }
}
