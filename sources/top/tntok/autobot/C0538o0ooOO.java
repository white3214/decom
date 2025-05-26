package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.o0ooOO  reason: case insensitive filesystem */
public class C0538o0ooOO extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final o00O00o0 filter;

    public C0538o0ooOO(o00O00o0 o00o00o0) {
        if (o00o00o0 != null) {
            this.filter = o00o00o0;
            return;
        }
        throw new IllegalArgumentException("The filter must not be null");
    }

    public boolean accept(File file) {
        return !this.filter.accept(file);
    }

    public String toString() {
        return super.toString() + "(" + this.filter.toString() + ")";
    }

    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }
}
