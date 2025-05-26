package top.tntok.autobot;

import java.util.Objects;

public enum o00O000o {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !C0089o000Ooo.il1l1IlL());
    
    private static final long serialVersionUID = -6343169151696340687L;
    public final transient boolean i1LIL11l;
    private final String name;

    /* access modifiers changed from: public */
    o00O000o(String str, boolean z) {
        this.name = str;
        this.i1LIL11l = z;
    }

    public static o00O000o I11lLL1(String str) {
        for (o00O000o o00o000o : values()) {
            if (o00o000o.iLLLILIiLi1Ii().equals(str)) {
                return o00o000o;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object readResolve() {
        return I11lLL1(this.name);
    }

    public boolean IiIIlIL() {
        return this.i1LIL11l;
    }

    public boolean i1LIL11l(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.i1LIL11l, str.length() - length, str2, 0, length);
    }

    public String iLLLILIiLi1Ii() {
        return this.name;
    }

    public int iiI1L1iI(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        if (this.i1LIL11l) {
            return str.compareTo(str2);
        }
        return str.compareToIgnoreCase(str2);
    }

    public boolean iiIliillii(String str, int i, String str2) {
        return str.regionMatches(!this.i1LIL11l, i, str2, 0, str2.length());
    }

    public boolean iilLil1i11I1(String str, String str2) {
        return str.regionMatches(!this.i1LIL11l, 0, str2, 0, str2.length());
    }

    public int il1LilLllii(String str, int i, String str2) {
        int length = str.length() - str2.length();
        if (length < i) {
            return -1;
        }
        while (i <= length) {
            if (iiIliillii(str, i, str2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean illlI1lLIL(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        if (this.i1LIL11l) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public String toString() {
        return this.name;
    }
}
