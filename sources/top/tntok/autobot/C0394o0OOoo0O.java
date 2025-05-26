package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OOoo0O  reason: case insensitive filesystem */
public class C0394o0OOoo0O extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    private final o00O000o caseSensitivity;
    private final String[] suffixes;

    public C0394o0OOoo0O(String str) {
        this(str, o00O000o.SENSITIVE);
    }

    public boolean accept(File file) {
        String name = file.getName();
        for (String i1LIL11l : this.suffixes) {
            if (this.caseSensitivity.i1LIL11l(name, i1LIL11l)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.suffixes != null) {
            for (int i = 0; i < this.suffixes.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.suffixes[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C0394o0OOoo0O(String str, o00O000o o00o000o) {
        if (str != null) {
            this.suffixes = new String[]{str};
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The suffix must not be null");
    }

    public boolean accept(File file, String str) {
        for (String i1LIL11l : this.suffixes) {
            if (this.caseSensitivity.i1LIL11l(str, i1LIL11l)) {
                return true;
            }
        }
        return false;
    }

    public C0394o0OOoo0O(String... strArr) {
        this(strArr, o00O000o.SENSITIVE);
    }

    public C0394o0OOoo0O(String[] strArr, o00O000o o00o000o) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.suffixes = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The array of suffixes must not be null");
    }

    public C0394o0OOoo0O(List<String> list) {
        this(list, o00O000o.SENSITIVE);
    }

    public C0394o0OOoo0O(List<String> list, o00O000o o00o000o) {
        if (list != null) {
            this.suffixes = (String[]) list.toArray(o00O00o0.iiI1L1iI);
            this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
            return;
        }
        throw new IllegalArgumentException("The list of suffixes must not be null");
    }
}
