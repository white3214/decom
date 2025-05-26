package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import top.tntok.autobot.C0186o00o00;

/* renamed from: top.tntok.autobot.o00000oo  reason: case insensitive filesystem */
public class C0059o00000oo implements C0058o00000oO {
    public byte[] I11lLL1;
    public String IiIIlIL;
    public boolean IiiL1llIIi;
    public final C0336o0O0ooo0 i1LIL11l;
    public boolean iILiI1lll;
    public o0000O00 iLLLILIiLi1Ii;
    public final C0060o0000OOo iiI1L1iI;
    public C0186o00o00 iiIliillii;
    public boolean iilLiIIIi11i = true;
    public C0186o00o00.il1LilLllii iilLil1i11I1;
    public long il1LilLllii;
    public long illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00000oo$iiI1L1iI */
    public class iiI1L1iI extends C0157o00Oo0o {
        public iiI1L1iI(InputStream inputStream, long j) {
            super(inputStream, j);
        }

        public void il1LilLllii(long j, long j2) throws IOException {
            throw new C0061o0000Oo(new C0365o0OOOoO(String.format("the request was rejected because its size (%s) exceeds the configured maximum (%s)", new Object[]{Long.valueOf(j2), Long.valueOf(j)}), j2, j));
        }
    }

    public C0059o00000oo(C0060o0000OOo o0000ooo, C0336o0O0ooo0 o0o0ooo0) throws C0062o0000Oo0, IOException {
        this.iiI1L1iI = o0000ooo;
        this.illlI1lLIL = o0000ooo.i111iLiiIIill();
        this.il1LilLllii = o0000ooo.IiiL1llIIi();
        Objects.requireNonNull(o0o0ooo0, "requestContext");
        this.i1LIL11l = o0o0ooo0;
        iilLil1i11I1();
    }

    public final long I11lLL1(o00000OO o00000oo) {
        try {
            return Long.parseLong(o00000oo.illlI1lLIL(C0060o0000OOo.I11lLL1));
        } catch (Exception unused) {
            return -1;
        }
    }

    public void IiIIlIL(C0060o0000OOo o0000ooo, C0336o0O0ooo0 o0o0ooo0) throws C0062o0000Oo0, IOException {
        InputStream inputStream;
        String i1LIL11l2 = this.i1LIL11l.i1LIL11l();
        if (i1LIL11l2 == null || !i1LIL11l2.toLowerCase(Locale.ENGLISH).startsWith(C0060o0000OOo.iilLiIIIi11i)) {
            throw new o00OO0O0(String.format("the request doesn't contain a %s or %s stream, content type header is %s", new Object[]{"multipart/form-data", C0060o0000OOo.iILiI1lll, i1LIL11l2}));
        }
        long iiI1L1iI2 = ((C0481o0OoooO) this.i1LIL11l).iiI1L1iI();
        if (C0481o0OoooO.class.isAssignableFrom(this.i1LIL11l.getClass())) {
            iiI1L1iI2 = ((C0481o0OoooO) this.i1LIL11l).iiI1L1iI();
        }
        long j = iiI1L1iI2;
        long j2 = this.illlI1lLIL;
        if (j2 < 0) {
            inputStream = this.i1LIL11l.illlI1lLIL();
        } else if (j == -1 || j <= j2) {
            inputStream = new iiI1L1iI(this.i1LIL11l.illlI1lLIL(), this.illlI1lLIL);
        } else {
            throw new C0365o0OOOoO(String.format("the request was rejected because its size (%s) exceeds the configured maximum (%s)", new Object[]{Long.valueOf(j), Long.valueOf(this.illlI1lLIL)}), j, this.illlI1lLIL);
        }
        String I1iIiIi = o0000ooo.I1iIiIi();
        if (I1iIiIi == null) {
            I1iIiIi = this.i1LIL11l.il1LilLllii();
        }
        byte[] illlI1lLIL2 = o0000ooo.illlI1lLIL(i1LIL11l2);
        this.I11lLL1 = illlI1lLIL2;
        if (illlI1lLIL2 != null) {
            this.iilLil1i11I1 = new C0186o00o00.il1LilLllii(o0000ooo.iL1LIlIlI(), j);
            try {
                C0186o00o00 o00o00 = new C0186o00o00(inputStream, this.I11lLL1, this.iilLil1i11I1);
                this.iiIliillii = o00o00;
                o00o00.i1iiLIil1ILi(I1iIiIi);
            } catch (IllegalArgumentException e) {
                C0130o00O0o00.IL1lILLLL1L(inputStream);
                throw new o00OO0O0(String.format("The boundary specified in the %s header is too long", new Object[]{C0060o0000OOo.iiIliillii}), e);
            }
        } else {
            C0130o00O0o00.IL1lILLLL1L(inputStream);
            throw new C0062o0000Oo0("the request was rejected because no multipart boundary was found");
        }
    }

    public boolean hasNext() throws C0062o0000Oo0, IOException {
        if (this.iILiI1lll) {
            return false;
        }
        if (this.IiiL1llIIi) {
            return true;
        }
        try {
            return iilLil1i11I1();
        } catch (C0061o0000Oo e) {
            throw ((C0062o0000Oo0) e.getCause());
        }
    }

    public void i1LIL11l(long j) {
        this.il1LilLllii = j;
    }

    public C0186o00o00 iLLLILIiLi1Ii() throws C0062o0000Oo0, IOException {
        if (this.iiIliillii == null) {
            IiIIlIL(this.iiI1L1iI, this.i1LIL11l);
        }
        return this.iiIliillii;
    }

    public void iiI1L1iI(long j) {
        this.illlI1lLIL = j;
    }

    public long iiIliillii() {
        return this.illlI1lLIL;
    }

    public final boolean iilLil1i11I1() throws C0062o0000Oo0, IOException {
        boolean z;
        o00000OO IL1lILLLL1L;
        String iilLil1i11I12;
        boolean z2;
        if (this.iILiI1lll) {
            return false;
        }
        o0000O00 o0000o00 = this.iLLLILIiLi1Ii;
        if (o0000o00 != null) {
            o0000o00.I1l1iIll1lIi1();
            this.iLLLILIiLi1Ii = null;
        }
        C0186o00o00 iLLLILIiLi1Ii2 = iLLLILIiLi1Ii();
        while (true) {
            if (this.iilLiIIIi11i) {
                z = iLLLILIiLi1Ii2.i11liIIl11Ii1();
            } else {
                z = iLLLILIiLi1Ii2.IilL11ii1I1Il();
            }
            if (z) {
                IL1lILLLL1L = this.iiI1L1iI.IL1lILLLL1L(iLLLILIiLi1Ii2.iiLIIiIli());
                if (this.IiIIlIL == null) {
                    iilLil1i11I12 = this.iiI1L1iI.iilLil1i11I1(IL1lILLLL1L);
                    if (iilLil1i11I12 != null) {
                        String illlI1lLIL2 = IL1lILLLL1L.illlI1lLIL(C0060o0000OOo.iiIliillii);
                        if (illlI1lLIL2 == null || !illlI1lLIL2.toLowerCase(Locale.ENGLISH).startsWith(C0060o0000OOo.iILiI1lll)) {
                            String iilLiIIIi11i2 = this.iiI1L1iI.iilLiIIIi11i(IL1lILLLL1L);
                            String illlI1lLIL3 = IL1lILLLL1L.illlI1lLIL(C0060o0000OOo.iiIliillii);
                        } else {
                            this.IiIIlIL = iilLil1i11I12;
                            iLLLILIiLi1Ii2.ILl1iII11Ll1(this.iiI1L1iI.illlI1lLIL(illlI1lLIL2));
                            this.iilLiIIIi11i = true;
                        }
                    }
                } else {
                    String iilLiIIIi11i3 = this.iiI1L1iI.iilLiIIIi11i(IL1lILLLL1L);
                    if (iilLiIIIi11i3 != null) {
                        o0000O00 o0000o002 = new o0000O00(this, iilLiIIIi11i3, this.IiIIlIL, IL1lILLLL1L.illlI1lLIL(C0060o0000OOo.iiIliillii), false, I11lLL1(IL1lILLLL1L));
                        this.iLLLILIiLi1Ii = o0000o002;
                        o0000o002.I1iIiIi(IL1lILLLL1L);
                        this.iilLil1i11I1.i1LIL11l();
                        this.IiiL1llIIi = true;
                        return true;
                    }
                }
                iLLLILIiLi1Ii2.I1iIiIi();
            } else if (this.IiIIlIL == null) {
                this.iILiI1lll = true;
                return false;
            } else {
                iLLLILIiLi1Ii2.ILl1iII11Ll1(this.I11lLL1);
                this.IiIIlIL = null;
            }
        }
        String iilLiIIIi11i22 = this.iiI1L1iI.iilLiIIIi11i(IL1lILLLL1L);
        String illlI1lLIL32 = IL1lILLLL1L.illlI1lLIL(C0060o0000OOo.iiIliillii);
        if (iilLiIIIi11i22 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        o0000O00 o0000o003 = new o0000O00(this, iilLiIIIi11i22, iilLil1i11I12, illlI1lLIL32, z2, I11lLL1(IL1lILLLL1L));
        this.iLLLILIiLi1Ii = o0000o003;
        o0000o003.I1iIiIi(IL1lILLLL1L);
        this.iilLil1i11I1.i1LIL11l();
        this.IiiL1llIIi = true;
        return true;
    }

    public long il1LilLllii() {
        return this.il1LilLllii;
    }

    public List<o00000O0> illlI1lLIL() throws C0062o0000Oo0, IOException {
        ArrayList arrayList = new ArrayList();
        while (hasNext()) {
            o0000 next = next();
            arrayList.add(this.iiI1L1iI.I11lLL1().iiI1L1iI(next.iilLil1i11I1(), next.i1LIL11l(), next.iiIliillii(), next.iiI1L1iI()));
        }
        return arrayList;
    }

    public o0000 next() throws C0062o0000Oo0, IOException {
        if (this.iILiI1lll || (!this.IiiL1llIIi && !hasNext())) {
            throw new NoSuchElementException();
        }
        this.IiiL1llIIi = false;
        return this.iLLLILIiLi1Ii;
    }
}
