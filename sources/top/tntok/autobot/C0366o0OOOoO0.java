package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.o0OOOoO0  reason: case insensitive filesystem */
public class C0366o0OOOoO0 extends iilLiIIIi11i implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public C0366o0OOOoO0(long j) {
        this(j, true);
    }

    public boolean accept(File file) {
        boolean z;
        boolean z2 = this.acceptLarger;
        if (file.length() < this.size) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.acceptLarger) {
            str = ">=";
        } else {
            str = "<";
        }
        return super.toString() + "(" + str + this.size + ")";
    }

    public C0366o0OOOoO0(long j, boolean z) {
        if (j >= 0) {
            this.size = j;
            this.acceptLarger = z;
            return;
        }
        throw new IllegalArgumentException("The size must be non-negative");
    }
}
