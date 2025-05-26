package top.tntok.autobot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iLLLIL1Lll implements Iterable<String> {
    public final ArrayList<ILiLL1lIIilI> i1LIL11l = new ArrayList<>();
    public final HashMap<String, String> iiI1L1iI = new HashMap<>();

    public iLLLIL1Lll(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            for (String trim : str.split(";")) {
                String[] split = trim.trim().split("=");
                if (split.length == 2) {
                    this.iiI1L1iI.put(split[0], split[1]);
                }
            }
        }
    }

    public String i1LIL11l(String str) {
        return this.iiI1L1iI.get(str);
    }

    public void iiI1L1iI(String str) {
        illlI1lLIL(str, "-delete-", -30);
    }

    public void iiIliillii(C0338o0O0oooo o0o0oooo) {
        Iterator<ILiLL1lIIilI> it = this.i1LIL11l.iterator();
        while (it.hasNext()) {
            o0o0oooo.i1LIL11l(it.next().iiI1L1iI());
        }
    }

    public void il1LilLllii(ILiLL1lIIilI iLiLL1lIIilI) {
        this.i1LIL11l.add(iLiLL1lIIilI);
    }

    public void illlI1lLIL(String str, String str2, int i) {
        this.i1LIL11l.add(new ILiLL1lIIilI(str, str2, ILiLL1lIIilI.i1LIL11l(i)));
    }

    public Iterator<String> iterator() {
        return this.iiI1L1iI.keySet().iterator();
    }
}
