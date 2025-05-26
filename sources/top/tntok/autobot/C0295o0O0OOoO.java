package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: top.tntok.autobot.o0O0OOoO  reason: case insensitive filesystem */
public class C0295o0O0OOoO extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    private final o00O000o caseSensitivity;
    private final String[] prefixes;

    public C0295o0O0OOoO(String str) {
        this(str, o00O000o.SENSITIVE);
    }

    public boolean accept(File file) {
        String name = file.getName();
        for (String iilLil1i11I1 : this.prefixes) {
            if (this.caseSensitivity.iilLil1i11I1(name, iilLil1i11I1)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.prefixes != null) {
            for (int i = 0; i < this.prefixes.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.prefixes[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C0295o0O0OOoO(String str, o00O000o o00o000o) {
        if (str != null) {
            this.prefixes = new String[]{str};
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The prefix must not be null");
    }

    public boolean accept(File file, String str) {
        for (String iilLil1i11I1 : this.prefixes) {
            if (this.caseSensitivity.iilLil1i11I1(str, iilLil1i11I1)) {
                return true;
            }
        }
        return false;
    }

    public C0295o0O0OOoO(String... strArr) {
        this(strArr, o00O000o.SENSITIVE);
    }

    public C0295o0O0OOoO(String[] strArr, o00O000o o00o000o) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.prefixes = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The array of prefixes must not be null");
    }

    public C0295o0O0OOoO(List<String> list) {
        this(list, o00O000o.SENSITIVE);
    }

    public C0295o0O0OOoO(List<String> list, o00O000o o00o000o) {
        if (list != null) {
            this.prefixes = (String[]) list.toArray(o00O00o0.iiI1L1iI);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The list of prefixes must not be null");
    }
}
