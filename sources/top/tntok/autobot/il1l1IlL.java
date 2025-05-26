package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class il1l1IlL extends iilLiIIIi11i implements ilLLLlIilil1i, Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    private final List<o00O00o0> fileFilters;

    public il1l1IlL() {
        this.fileFilters = new ArrayList();
    }

    public boolean accept(File file) {
        if (this.fileFilters.isEmpty()) {
            return false;
        }
        for (o00O00o0 accept : this.fileFilters) {
            if (!accept.accept(file)) {
                return false;
            }
        }
        return true;
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

    public il1l1IlL(List<o00O00o0> list) {
        if (list == null) {
            this.fileFilters = new ArrayList();
        } else {
            this.fileFilters = new ArrayList(list);
        }
    }

    public boolean accept(File file, String str) {
        if (this.fileFilters.isEmpty()) {
            return false;
        }
        for (o00O00o0 accept : this.fileFilters) {
            if (!accept.accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public il1l1IlL(o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        if (o00o00o0 == null || o00o00o02 == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        this.fileFilters = new ArrayList(2);
        iiI1L1iI(o00o00o0);
        iiI1L1iI(o00o00o02);
    }
}
