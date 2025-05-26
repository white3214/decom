package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: top.tntok.autobot.o00o  reason: case insensitive filesystem */
public class C0184o00o extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final o00O000o caseSensitivity;
    private final String[] names;

    public C0184o00o(String str) {
        this(str, (o00O000o) null);
    }

    public boolean accept(File file) {
        String name = file.getName();
        for (String illlI1lLIL : this.names) {
            if (this.caseSensitivity.illlI1lLIL(name, illlI1lLIL)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.names != null) {
            for (int i = 0; i < this.names.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.names[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C0184o00o(String str, o00O000o o00o000o) {
        if (str != null) {
            this.names = new String[]{str};
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The wildcard must not be null");
    }

    public boolean accept(File file, String str) {
        for (String illlI1lLIL : this.names) {
            if (this.caseSensitivity.illlI1lLIL(str, illlI1lLIL)) {
                return true;
            }
        }
        return false;
    }

    public C0184o00o(String... strArr) {
        this(strArr, (o00O000o) null);
    }

    public C0184o00o(String[] strArr, o00O000o o00o000o) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.names = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The array of names must not be null");
    }

    public C0184o00o(List<String> list) {
        this(list, (o00O000o) null);
    }

    public C0184o00o(List<String> list, o00O000o o00o000o) {
        if (list != null) {
            this.names = (String[]) list.toArray(o00O00o0.iiI1L1iI);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The list of names must not be null");
    }
}
