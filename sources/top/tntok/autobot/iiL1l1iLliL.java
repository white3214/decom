package top.tntok.autobot;

import java.util.Arrays;
import java.util.Iterator;

public abstract class iiL1l1iLliL implements OooO0o {
    public abstract void I11lLL1(char c);

    public final void I1iIiIi(String str) {
        I11lLL1('\"');
        for (int i = 0; i < str.length(); i++) {
            iILiI1lll(str.charAt(i));
        }
        I11lLL1('\"');
    }

    public final OooO0o IiIIlIL(String str, String str2, String str3, Iterator<? extends o0OOO0O0> it) {
        iLLLILIiLi1Ii(str);
        boolean z = false;
        while (it.hasNext()) {
            if (z) {
                iLLLILIiLi1Ii(str2);
            }
            i1LIL11l((o0OOO0O0) it.next());
            z = true;
        }
        iLLLILIiLi1Ii(str3);
        return this;
    }

    public final String IiiL1llIIi(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    public OooO0o i1LIL11l(o0OOO0O0 o0ooo0o0) {
        o0ooo0o0.illlI1lLIL(this);
        return this;
    }

    public final void iILiI1lll(char c) {
        if (c == 9) {
            iLLLILIiLi1Ii("\\t");
        } else if (c == 10) {
            iLLLILIiLi1Ii("\\n");
        } else if (c == 13) {
            iLLLILIiLi1Ii("\\r");
        } else if (c != '\"') {
            I11lLL1(c);
        } else {
            iLLLILIiLi1Ii("\\\"");
        }
    }

    public void iLLLILIiLi1Ii(String str) {
        for (int i = 0; i < str.length(); i++) {
            I11lLL1(str.charAt(i));
        }
    }

    public OooO0o iiI1L1iI(Object obj) {
        if (obj == null) {
            iLLLILIiLi1Ii("null");
        } else if (obj instanceof String) {
            I1iIiIi((String) obj);
        } else if (obj instanceof Character) {
            I11lLL1('\"');
            iILiI1lll(((Character) obj).charValue());
            I11lLL1('\"');
        } else if (obj instanceof Short) {
            I11lLL1('<');
            iLLLILIiLi1Ii(IiiL1llIIi(obj));
            iLLLILIiLi1Ii("s>");
        } else if (obj instanceof Long) {
            I11lLL1('<');
            iLLLILIiLi1Ii(IiiL1llIIi(obj));
            iLLLILIiLi1Ii("L>");
        } else if (obj instanceof Float) {
            I11lLL1('<');
            iLLLILIiLi1Ii(IiiL1llIIi(obj));
            iLLLILIiLi1Ii("F>");
        } else if (obj.getClass().isArray()) {
            iilLiIIIi11i("[", ", ", "]", new ILiLII1ILi(obj));
        } else {
            I11lLL1('<');
            iLLLILIiLi1Ii(IiiL1llIIi(obj));
            I11lLL1('>');
        }
        return this;
    }

    public OooO0o iiIliillii(String str) {
        iLLLILIiLi1Ii(str);
        return this;
    }

    public final <T> OooO0o iilLiIIIi11i(String str, String str2, String str3, Iterator<T> it) {
        return IiIIlIL(str, str2, str3, new o0OOO0OO(it));
    }

    public <T> OooO0o iilLil1i11I1(String str, String str2, String str3, T... tArr) {
        return il1LilLllii(str, str2, str3, Arrays.asList(tArr));
    }

    public <T> OooO0o il1LilLllii(String str, String str2, String str3, Iterable<T> iterable) {
        return iilLiIIIi11i(str, str2, str3, iterable.iterator());
    }

    public OooO0o illlI1lLIL(String str, String str2, String str3, Iterable<? extends o0OOO0O0> iterable) {
        return IiIIlIL(str, str2, str3, iterable.iterator());
    }
}
