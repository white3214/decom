package top.tntok.autobot;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: top.tntok.autobot.o000o000  reason: case insensitive filesystem */
public final class C0094o000o000 {
    public final String[] iiI1L1iI;

    /* renamed from: top.tntok.autobot.o000o000$iiI1L1iI */
    public static final class iiI1L1iI {
        public final List<String> iiI1L1iI = new ArrayList(20);

        public iiI1L1iI I11lLL1(String str, String str2) {
            this.iiI1L1iI.add(str);
            this.iiI1L1iI.add(str2.trim());
            return this;
        }

        @IgnoreJRERequirement
        public iiI1L1iI I1iIiIi(String str, Instant instant) {
            if (instant != null) {
                return i1L1lLllLLlIi(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public C0094o000o000 IiIIlIL() {
            return new C0094o000o000(this);
        }

        public iiI1L1iI IiiL1llIIi(String str) {
            int i = 0;
            while (i < this.iiI1L1iI.size()) {
                if (str.equalsIgnoreCase(this.iiI1L1iI.get(i))) {
                    this.iiI1L1iI.remove(i);
                    this.iiI1L1iI.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public iiI1L1iI i1L1lLllLLlIi(String str, Date date) {
            if (date != null) {
                iILiI1lll(str, C0103o000o0oO.iiI1L1iI(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public iiI1L1iI i1LIL11l(String str, String str2) {
            C0094o000o000.i1LIL11l(str);
            C0094o000o000.illlI1lLIL(str2, str);
            return I11lLL1(str, str2);
        }

        public iiI1L1iI iILiI1lll(String str, String str2) {
            C0094o000o000.i1LIL11l(str);
            C0094o000o000.illlI1lLIL(str2, str);
            IiiL1llIIi(str);
            I11lLL1(str, str2);
            return this;
        }

        public iiI1L1iI iLLLILIiLi1Ii(String str, String str2) {
            C0094o000o000.i1LIL11l(str);
            return I11lLL1(str, str2);
        }

        public iiI1L1iI iiI1L1iI(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return i1LIL11l(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public iiI1L1iI iiIliillii(C0094o000o000 o000o000) {
            int I1iIiIi = o000o000.I1iIiIi();
            for (int i = 0; i < I1iIiIi; i++) {
                I11lLL1(o000o000.iLLLILIiLi1Ii(i), o000o000.IL1lILLLL1L(i));
            }
            return this;
        }

        @Nullable
        public String iilLiIIIi11i(String str) {
            for (int size = this.iiI1L1iI.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.iiI1L1iI.get(size))) {
                    return this.iiI1L1iI.get(size + 1);
                }
            }
            return null;
        }

        public iiI1L1iI iilLil1i11I1(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return I11lLL1(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return I11lLL1("", str.substring(1));
            }
            return I11lLL1("", str);
        }

        public iiI1L1iI il1LilLllii(String str, Date date) {
            if (date != null) {
                i1LIL11l(str, C0103o000o0oO.iiI1L1iI(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        @IgnoreJRERequirement
        public iiI1L1iI illlI1lLIL(String str, Instant instant) {
            if (instant != null) {
                return il1LilLllii(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }
    }

    public C0094o000o000(iiI1L1iI iii1l1ii) {
        List<String> list = iii1l1ii.iiI1L1iI;
        this.iiI1L1iI = (String[]) list.toArray(new String[list.size()]);
    }

    public static C0094o000o000 IiiL1llIIi(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) next.getKey()).trim();
                String trim2 = ((String) next.getValue()).trim();
                i1LIL11l(trim);
                illlI1lLIL(trim2, trim);
                strArr[i] = trim;
                strArr[i + 1] = trim2;
                i += 2;
            }
            return new C0094o000o000(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    public static void i1LIL11l(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C0487o0OooooO.Ii1liIIIiLi("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public static C0094o000o000 iILiI1lll(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                i1LIL11l(str2);
                illlI1lLIL(str3, str2);
            }
            return new C0094o000o000(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    @Nullable
    public static String iiIliillii(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static void illlI1lLIL(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C0487o0OooooO.Ii1liIIIiLi("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    @Nullable
    @IgnoreJRERequirement
    public Instant I11lLL1(String str) {
        Date iilLil1i11I1 = iilLil1i11I1(str);
        if (iilLil1i11I1 != null) {
            return iilLil1i11I1.toInstant();
        }
        return null;
    }

    public int I1iIiIi() {
        return this.iiI1L1iI.length / 2;
    }

    public String IL1lILLLL1L(int i) {
        return this.iiI1L1iI[(i * 2) + 1];
    }

    public Set<String> IiIIlIL() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int I1iIiIi = I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            treeSet.add(iLLLILIiLi1Ii(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0094o000o000) || !Arrays.equals(((C0094o000o000) obj).iiI1L1iI, this.iiI1L1iI)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.iiI1L1iI);
    }

    public Map<String, List<String>> i1L1lLllLLlIi() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int I1iIiIi = I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            String lowerCase = iLLLILIiLi1Ii(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(IL1lILLLL1L(i));
        }
        return treeMap;
    }

    public List<String> iL1LIlIlI(String str) {
        int I1iIiIi = I1iIiIi();
        ArrayList arrayList = null;
        for (int i = 0; i < I1iIiIi; i++) {
            if (str.equalsIgnoreCase(iLLLILIiLi1Ii(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(IL1lILLLL1L(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String iLLLILIiLi1Ii(int i) {
        return this.iiI1L1iI[i * 2];
    }

    public long iiI1L1iI() {
        String[] strArr = this.iiI1L1iI;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.iiI1L1iI[i].length();
        }
        return length;
    }

    public iiI1L1iI iilLiIIIi11i() {
        iiI1L1iI iii1l1ii = new iiI1L1iI();
        Collections.addAll(iii1l1ii.iiI1L1iI, this.iiI1L1iI);
        return iii1l1ii;
    }

    @Nullable
    public Date iilLil1i11I1(String str) {
        String il1LilLllii = il1LilLllii(str);
        if (il1LilLllii != null) {
            return C0103o000o0oO.i1LIL11l(il1LilLllii);
        }
        return null;
    }

    @Nullable
    public String il1LilLllii(String str) {
        return iiIliillii(this.iiI1L1iI, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int I1iIiIi = I1iIiIi();
        for (int i = 0; i < I1iIiIi; i++) {
            sb.append(iLLLILIiLi1Ii(i));
            sb.append(": ");
            sb.append(IL1lILLLL1L(i));
            sb.append(C0130o00O0o00.iLLLILIiLi1Ii);
        }
        return sb.toString();
    }

    public C0094o000o000(String[] strArr) {
        this.iiI1L1iI = strArr;
    }
}
