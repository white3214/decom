package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class iiiiI1iILL11I extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final long cutoff;

    public iiiiI1iILL11I(long j) {
        this(j, true);
    }

    public boolean accept(File file) {
        if (this.acceptOlder != C0086o000OoO.IillLillLLIii(file, this.cutoff)) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.acceptOlder) {
            str = "<=";
        } else {
            str = ">";
        }
        return super.toString() + "(" + str + this.cutoff + ")";
    }

    public iiiiI1iILL11I(long j, boolean z) {
        this.acceptOlder = z;
        this.cutoff = j;
    }

    public iiiiI1iILL11I(Date date) {
        this(date, true);
    }

    public iiiiI1iILL11I(Date date, boolean z) {
        this(date.getTime(), z);
    }

    public iiiiI1iILL11I(File file) {
        this(file, true);
    }

    public iiiiI1iILL11I(File file, boolean z) {
        this(file.lastModified(), z);
    }
}
