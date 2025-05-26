package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: top.tntok.autobot.o0o00OoO  reason: case insensitive filesystem */
public class C0508o0o00OoO extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final o00O000o caseSensitivity;
    private final String[] wildcards;

    public C0508o0o00OoO(String str) {
        this(str, o00O000o.SENSITIVE);
    }

    public boolean accept(File file, String str) {
        for (String IIi1l1i : this.wildcards) {
            if (C0089o000Ooo.IIi1l1i(str, IIi1l1i, this.caseSensitivity)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.wildcards != null) {
            for (int i = 0; i < this.wildcards.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.wildcards[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C0508o0o00OoO(String str, o00O000o o00o000o) {
        if (str != null) {
            this.wildcards = new String[]{str};
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The wildcard must not be null");
    }

    public boolean accept(File file) {
        String name = file.getName();
        for (String IIi1l1i : this.wildcards) {
            if (C0089o000Ooo.IIi1l1i(name, IIi1l1i, this.caseSensitivity)) {
                return true;
            }
        }
        return false;
    }

    public C0508o0o00OoO(String... strArr) {
        this(strArr, o00O000o.SENSITIVE);
    }

    public C0508o0o00OoO(String[] strArr, o00O000o o00o000o) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.wildcards = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    public C0508o0o00OoO(List<String> list) {
        this(list, o00O000o.SENSITIVE);
    }

    public C0508o0o00OoO(List<String> list, o00O000o o00o000o) {
        if (list != null) {
            this.wildcards = (String[]) list.toArray(o00O00o0.iiI1L1iI);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
