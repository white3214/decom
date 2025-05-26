package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.List;

@Deprecated
/* renamed from: top.tntok.autobot.o0o00Ooo  reason: case insensitive filesystem */
public class C0509o0o00Ooo extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public C0509o0o00Ooo(String str) {
        if (str != null) {
            this.wildcards = new String[]{str};
            return;
        }
        throw new IllegalArgumentException("The wildcard must not be null");
    }

    public boolean accept(File file, String str) {
        if (file != null && new File(file, str).isDirectory()) {
            return false;
        }
        for (String illi1LIILLiL : this.wildcards) {
            if (C0089o000Ooo.illi1LIILLiL(str, illi1LIILLiL)) {
                return true;
            }
        }
        return false;
    }

    public C0509o0o00Ooo(String... strArr) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.wildcards = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String illi1LIILLiL : this.wildcards) {
            if (C0089o000Ooo.illi1LIILLiL(file.getName(), illi1LIILLiL)) {
                return true;
            }
        }
        return false;
    }

    public C0509o0o00Ooo(List<String> list) {
        if (list != null) {
            this.wildcards = (String[]) list.toArray(o00O00o0.iiI1L1iI);
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
