package top.tntok.autobot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: top.tntok.autobot.o00000o0  reason: case insensitive filesystem */
public class C0057o00000o0 implements o00000OO, Serializable {
    private static final long serialVersionUID = -4455695752627032559L;
    private final Map<String, List<String>> headerNameToValueListMap = new LinkedHashMap();

    public static /* synthetic */ List iilLil1i11I1(String str) {
        return new ArrayList();
    }

    public Iterator<String> i1LIL11l() {
        return this.headerNameToValueListMap.keySet().iterator();
    }

    public Iterator<String> iiI1L1iI(String str) {
        List list = this.headerNameToValueListMap.get(str.toLowerCase(Locale.ENGLISH));
        if (list == null) {
            list = Collections.emptyList();
        }
        return list.iterator();
    }

    public synchronized void iiIliillii(String str, String str2) {
        ((List) this.headerNameToValueListMap.computeIfAbsent(str.toLowerCase(Locale.ENGLISH), new C0056o00000Oo())).add(str2);
    }

    public String illlI1lLIL(String str) {
        List list = this.headerNameToValueListMap.get(str.toLowerCase(Locale.ENGLISH));
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }
}
