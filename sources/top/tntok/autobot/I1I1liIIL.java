package top.tntok.autobot;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public final class I1I1liIIL {
    public final Map<String, String> i1LIL11l;
    public final String iiI1L1iI;

    public I1I1liIIL(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (map != null) {
            this.iiI1L1iI = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put(next.getKey() == null ? null : ((String) next.getKey()).toLowerCase(Locale.US), (String) next.getValue());
            }
            this.i1LIL11l = Collections.unmodifiableMap(linkedHashMap);
        } else {
            throw new NullPointerException("authParams == null");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof I1I1liIIL) {
            I1I1liIIL i1I1liIIL = (I1I1liIIL) obj;
            if (!i1I1liIIL.iiI1L1iI.equals(this.iiI1L1iI) || !i1I1liIIL.i1LIL11l.equals(this.i1LIL11l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode();
    }

    public Charset i1LIL11l() {
        String str = this.i1LIL11l.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public Map<String, String> iiI1L1iI() {
        return this.i1LIL11l;
    }

    public I1I1liIIL iiIliillii(Charset charset) {
        if (charset != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.i1LIL11l);
            linkedHashMap.put("charset", charset.name());
            return new I1I1liIIL(this.iiI1L1iI, (Map<String, String>) linkedHashMap);
        }
        throw new NullPointerException("charset == null");
    }

    public String il1LilLllii() {
        return this.iiI1L1iI;
    }

    public String illlI1lLIL() {
        return this.i1LIL11l.get("realm");
    }

    public String toString() {
        return this.iiI1L1iI + " authParams=" + this.i1LIL11l;
    }

    public I1I1liIIL(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 != null) {
            this.iiI1L1iI = str;
            this.i1LIL11l = Collections.singletonMap("realm", str2);
        } else {
            throw new NullPointerException("realm == null");
        }
    }
}
