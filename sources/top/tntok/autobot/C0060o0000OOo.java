package top.tntok.autobot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0000OOo  reason: case insensitive filesystem */
public abstract class C0060o0000OOo {
    public static final String I11lLL1 = "Content-length";
    @Deprecated
    public static final int I1iIiIi = 1024;
    public static final String IiIIlIL = "attachment";
    public static final String IiiL1llIIi = "multipart/form-data";
    public static final String iILiI1lll = "multipart/mixed";
    public static final String iLLLILIiLi1Ii = "form-data";
    public static final String iiIliillii = "Content-type";
    public static final String iilLiIIIi11i = "multipart/";
    public static final String iilLil1i11I1 = "Content-disposition";
    public long i1LIL11l = -1;
    public long iiI1L1iI = -1;
    public C0298o0O0Oo0 il1LilLllii;
    public String illlI1lLIL;

    public static final boolean Ii1liIIIiLi(C0336o0O0ooo0 o0o0ooo0) {
        String i1LIL11l2 = o0o0ooo0.i1LIL11l();
        if (i1LIL11l2 == null) {
            return false;
        }
        return i1LIL11l2.toLowerCase(Locale.ENGLISH).startsWith(iilLiIIIi11i);
    }

    public static /* synthetic */ List IilL11ii1I1Il(String str) {
        return new ArrayList();
    }

    public abstract o00000O I11lLL1();

    public void I1I11Il1(long j) {
        this.i1LIL11l = j;
    }

    public String I1iIiIi() {
        return this.illlI1lLIL;
    }

    public C0057o00000o0 I1l1iIll1lIi1() {
        return new C0057o00000o0();
    }

    public void IIlL1llI1(C0298o0O0Oo0 o0o0oo0) {
        this.il1LilLllii = o0o0oo0;
    }

    public void IL111l1(long j) {
        this.iiI1L1iI = j;
    }

    public o00000OO IL1lILLLL1L(String str) {
        int length = str.length();
        C0057o00000o0 I1l1iIll1lIi1 = I1l1iIll1lIi1();
        int i = 0;
        while (true) {
            int iiLIIiIli = iiLIIiIli(str, i);
            if (i == iiLIIiIli) {
                return I1l1iIll1lIi1;
            }
            StringBuilder sb = new StringBuilder(str.substring(i, iiLIIiIli));
            i = iiLIIiIli + 2;
            while (i < length) {
                int i2 = i;
                while (i2 < length && ((r6 = str.charAt(i2)) == ' ' || r6 == 9)) {
                    i2++;
                }
                if (i2 == i) {
                    break;
                }
                int iiLIIiIli2 = iiLIIiIli(str, i2);
                sb.append(' ');
                sb.append(str, i2, iiLIIiIli2);
                i = iiLIIiIli2 + 2;
            }
            ILl1iII11Ll1(I1l1iIll1lIi1, sb.toString());
        }
    }

    public final void ILl1iII11Ll1(C0057o00000o0 o00000o0, String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            o00000o0.iiIliillii(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    @Deprecated
    public String IiIIlIL(Map<String, String> map) {
        return iLLLILIiLi1Ii(iILiI1lll(map, iilLil1i11I1));
    }

    public long IiiL1llIIi() {
        return this.i1LIL11l;
    }

    public abstract void IliiLiLliIl(o00000O o00000o);

    public long i111iLiiIIill() {
        return this.iiI1L1iI;
    }

    public Map<String, List<o00000O0>> i11liIIl11Ii1(C0336o0O0ooo0 o0o0ooo0) throws C0062o0000Oo0 {
        List<o00000O0> iiiiI1iILL11I = iiiiI1iILL11I(o0o0ooo0);
        HashMap hashMap = new HashMap(iiiiI1iILL11I.size());
        for (o00000O0 next : iiiiI1iILL11I) {
            ((List) hashMap.computeIfAbsent(next.iilLil1i11I1(), new o0000OOO())).add(next);
        }
        return hashMap;
    }

    public C0058o00000oO i1L1lLllLLlIi(C0336o0O0ooo0 o0o0ooo0) throws C0062o0000Oo0, IOException {
        try {
            return new C0059o00000oo(this, o0o0ooo0);
        } catch (C0061o0000Oo e) {
            throw ((C0062o0000Oo0) e.getCause());
        }
    }

    @Deprecated
    public o00000O0 i1LIL11l(Map<String, String> map, boolean z) throws C0062o0000Oo0 {
        return I11lLL1().iiI1L1iI(iiIliillii(map), iILiI1lll(map, iiIliillii), z, IiIIlIL(map));
    }

    public void i1iI1iiLL1(String str) {
        this.illlI1lLIL = str;
    }

    @Deprecated
    public Map<String, String> i1iiLIil1ILi(String str) {
        o00000OO IL1lILLLL1L = IL1lILLLL1L(str);
        HashMap hashMap = new HashMap();
        Iterator<String> i1LIL11l2 = IL1lILLLL1L.i1LIL11l();
        while (i1LIL11l2.hasNext()) {
            String next = i1LIL11l2.next();
            Iterator<String> iiI1L1iI2 = IL1lILLLL1L.iiI1L1iI(next);
            StringBuilder sb = new StringBuilder(iiI1L1iI2.next());
            while (iiI1L1iI2.hasNext()) {
                sb.append(",");
                sb.append(iiI1L1iI2.next());
            }
            hashMap.put(next, sb.toString());
        }
        return hashMap;
    }

    @Deprecated
    public final String iILiI1lll(Map<String, String> map, String str) {
        return map.get(str.toLowerCase(Locale.ENGLISH));
    }

    public C0298o0O0Oo0 iL1LIlIlI() {
        return this.il1LilLllii;
    }

    public final String iLLLILIiLi1Ii(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith(iLLLILIiLi1Ii) || lowerCase.startsWith(IiIIlIL)) {
                C0266o00ooOo0 o00oooo0 = new C0266o00ooOo0();
                o00oooo0.IiiL1llIIi(true);
                Map<String, String> iiIliillii2 = o00oooo0.iiIliillii(str, ';');
                if (iiIliillii2.containsKey("filename")) {
                    String str2 = iiIliillii2.get("filename");
                    if (str2 != null) {
                        return str2.trim();
                    }
                    return "";
                }
            }
        }
        return null;
    }

    @Deprecated
    public String iiIliillii(Map<String, String> map) {
        return il1LilLllii(iILiI1lll(map, iilLil1i11I1));
    }

    public final int iiLIIiIli(String str, int i) {
        int i2;
        while (true) {
            int indexOf = str.indexOf(13, i);
            if (indexOf != -1 && (i2 = indexOf + 1) < str.length()) {
                if (str.charAt(i2) == 10) {
                    return indexOf;
                }
                i = i2;
            }
        }
        throw new IllegalStateException("Expected headers to be terminated by an empty line.");
    }

    public List<o00000O0> iiiiI1iILL11I(C0336o0O0ooo0 o0o0ooo0) throws C0062o0000Oo0 {
        ArrayList<o00000O0> arrayList = new ArrayList<>();
        try {
            C0058o00000oO i1L1lLllLLlIi = i1L1lLllLLlIi(o0o0ooo0);
            o00000O I11lLL12 = I11lLL1();
            Objects.requireNonNull(I11lLL12, "No FileItemFactory has been set.");
            o00000O o00000o = I11lLL12;
            byte[] bArr = new byte[8192];
            while (i1L1lLllLLlIi.hasNext()) {
                o0000 next = i1L1lLllLLlIi.next();
                o00000O0 iiI1L1iI2 = o00000o.iiI1L1iI(next.iilLil1i11I1(), next.i1LIL11l(), next.iiIliillii(), next.iiI1L1iI());
                arrayList.add(iiI1L1iI2);
                C0381o0OOo0oO.iiIliillii(next.iL1LIlIlI(), iiI1L1iI2.iilLiIIIi11i(), true, bArr);
                iiI1L1iI2.I1iIiIi(next.I11lLL1());
            }
            return arrayList;
        } catch (C0061o0000Oo e) {
            throw ((C0062o0000Oo0) e.getCause());
        } catch (IOException e2) {
            throw new C0120o00O00o(String.format("Processing of %s request failed. %s", new Object[]{"multipart/form-data", e2.getMessage()}), e2);
        } catch (C0062o0000Oo0 e3) {
            throw e3;
        } catch (IOException e4) {
            throw new C0062o0000Oo0(e4.getMessage(), e4);
        } catch (Throwable th) {
            for (o00000O0 il1LilLllii2 : arrayList) {
                try {
                    il1LilLllii2.il1LilLllii();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public String iilLiIIIi11i(o00000OO o00000oo) {
        return iLLLILIiLi1Ii(o00000oo.illlI1lLIL(iilLil1i11I1));
    }

    public String iilLil1i11I1(o00000OO o00000oo) {
        return il1LilLllii(o00000oo.illlI1lLIL(iilLil1i11I1));
    }

    public final String il1LilLllii(String str) {
        if (str == null || !str.toLowerCase(Locale.ENGLISH).startsWith(iLLLILIiLi1Ii)) {
            return null;
        }
        C0266o00ooOo0 o00oooo0 = new C0266o00ooOo0();
        o00oooo0.IiiL1llIIi(true);
        String str2 = o00oooo0.iiIliillii(str, ';').get("name");
        if (str2 != null) {
            return str2.trim();
        }
        return str2;
    }

    public byte[] illlI1lLIL(String str) {
        C0266o00ooOo0 o00oooo0 = new C0266o00ooOo0();
        o00oooo0.IiiL1llIIi(true);
        String str2 = o00oooo0.iilLil1i11I1(str, new char[]{';', ','}).get("boundary");
        if (str2 == null) {
            return null;
        }
        return str2.getBytes(StandardCharsets.ISO_8859_1);
    }
}
