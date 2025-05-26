package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o0O0oOo  reason: case insensitive filesystem */
public class C0324o0O0oOo extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final Pattern pattern;

    public C0324o0O0oOo(String str) {
        if (str != null) {
            this.pattern = Pattern.compile(str);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }

    public C0324o0O0oOo(String str, o00O000o o00o000o) {
        if (str != null) {
            this.pattern = Pattern.compile(str, (o00o000o == null || o00o000o.IiIIlIL()) ? 0 : 2);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public C0324o0O0oOo(String str, int i) {
        if (str != null) {
            this.pattern = Pattern.compile(str, i);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public C0324o0O0oOo(Pattern pattern2) {
        if (pattern2 != null) {
            this.pattern = pattern2;
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }
}
