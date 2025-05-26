package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o00oo  reason: case insensitive filesystem */
public class C0246o00oo extends iilLiIIIi11i implements ilLLLlIilil1i, Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final List<o00O00o0> fileFilters;

    public C0246o00oo() {
        this.fileFilters = new ArrayList();
    }

    public boolean accept(File file) {
        for (o00O00o0 accept : this.fileFilters) {
            if (accept.accept(file)) {
                return true;
            }
        }
        return false;
    }

    public void i1LIL11l(List<o00O00o0> list) {
        this.fileFilters.clear();
        this.fileFilters.addAll(list);
    }

    public void iiI1L1iI(o00O00o0 o00o00o0) {
        this.fileFilters.add(o00o00o0);
    }

    public boolean il1LilLllii(o00O00o0 o00o00o0) {
        return this.fileFilters.remove(o00o00o0);
    }

    public List<o00O00o0> illlI1lLIL() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.fileFilters != null) {
            for (int i = 0; i < this.fileFilters.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                o00O00o0 o00o00o0 = this.fileFilters.get(i);
                if (o00o00o0 == null) {
                    str = "null";
                } else {
                    str = o00o00o0.toString();
                }
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C0246o00oo(List<o00O00o0> list) {
        if (list == null) {
            this.fileFilters = new ArrayList();
        } else {
            this.fileFilters = new ArrayList(list);
        }
    }

    public boolean accept(File file, String str) {
        for (o00O00o0 accept : this.fileFilters) {
            if (accept.accept(file, str)) {
                return true;
            }
        }
        return false;
    }

    public C0246o00oo(o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        if (o00o00o0 == null || o00o00o02 == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        this.fileFilters = new ArrayList(2);
        iiI1L1iI(o00o00o0);
        iiI1L1iI(o00o00o02);
    }
}
