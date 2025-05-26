package top.tntok.autobot;

import android.graphics.Rect;
import java.util.Objects;

/* renamed from: top.tntok.autobot.o0OOOo0O  reason: case insensitive filesystem */
public final class C0363o0OOOo0O {
    public static final /* synthetic */ boolean illlI1lLIL = false;
    public final int i1LIL11l;
    public final int iiI1L1iI;

    public C0363o0OOOo0O(int i, int i2) {
        this.iiI1L1iI = i;
        this.i1LIL11l = i2;
    }

    public C0363o0OOOo0O I11lLL1() {
        boolean z;
        int i;
        int i2;
        if (il1LilLllii()) {
            return this;
        }
        int i3 = this.i1LIL11l;
        int i4 = this.iiI1L1iI;
        if (i3 > i4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i3;
        } else {
            i = i4;
        }
        if (z) {
            i3 = i4;
        }
        int i5 = i & -8;
        int i6 = (i3 + 4) & -8;
        if (i6 > i5) {
            i6 = i5;
        }
        if (z) {
            i2 = i6;
        } else {
            i2 = i5;
        }
        if (!z) {
            i5 = i6;
        }
        return new C0363o0OOOo0O(i2, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0363o0OOOo0O.class != obj.getClass()) {
            return false;
        }
        C0363o0OOOo0O o0oooo0o = (C0363o0OOOo0O) obj;
        if (this.iiI1L1iI == o0oooo0o.iiI1L1iI && this.i1LIL11l == o0oooo0o.i1LIL11l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.iiI1L1iI), Integer.valueOf(this.i1LIL11l)});
    }

    public int i1LIL11l() {
        return Math.max(this.iiI1L1iI, this.i1LIL11l);
    }

    public Rect iLLLILIiLi1Ii() {
        return new Rect(0, 0, this.iiI1L1iI, this.i1LIL11l);
    }

    public int iiI1L1iI() {
        return this.i1LIL11l;
    }

    public C0363o0OOOo0O iiIliillii(int i) {
        boolean z;
        int i2;
        int i3;
        if (i == 0) {
            return this;
        }
        int i4 = this.i1LIL11l;
        int i5 = this.iiI1L1iI;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i4;
        } else {
            i2 = i5;
        }
        if (i2 <= i) {
            return this;
        }
        if (z) {
            i4 = i5;
        }
        int i6 = (i4 * i) / i2;
        if (z) {
            i3 = i6;
        } else {
            i3 = i;
        }
        if (!z) {
            i = i6;
        }
        return new C0363o0OOOo0O(i3, i);
    }

    public C0363o0OOOo0O iilLil1i11I1() {
        return new C0363o0OOOo0O(this.i1LIL11l, this.iiI1L1iI);
    }

    public boolean il1LilLllii() {
        if ((this.iiI1L1iI & 7) == 0 && (this.i1LIL11l & 7) == 0) {
            return true;
        }
        return false;
    }

    public int illlI1lLIL() {
        return this.iiI1L1iI;
    }

    public String toString() {
        return this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("QQ==\n", "OdXyXuQTDwo=\n") + this.i1LIL11l;
    }
}
