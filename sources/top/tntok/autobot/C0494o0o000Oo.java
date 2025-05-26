package top.tntok.autobot;

import android.graphics.Rect;

/* renamed from: top.tntok.autobot.o0o000Oo  reason: case insensitive filesystem */
public class C0494o0o000Oo {
    public i1iiLIil1ILi i1LIL11l;
    public C0363o0OOOo0O iiI1L1iI;

    public C0494o0o000Oo(C0363o0OOOo0O o0oooo0o) {
        this.iiI1L1iI = o0oooo0o;
    }

    public static Rect iilLiIIIi11i(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    public i1iiLIil1ILi I11lLL1() {
        i1iiLIil1ILi i1iiliil1ili = this.i1LIL11l;
        if (i1iiliil1ili == null) {
            return null;
        }
        return i1iiliil1ili.il1LilLllii();
    }

    public i1iiLIil1ILi IiIIlIL() {
        return this.i1LIL11l;
    }

    public void i1LIL11l(Rect rect, boolean z) {
        Rect rect2;
        if (z) {
            rect2 = iilLiIIIi11i(rect);
        } else {
            rect2 = rect;
        }
        double illlI1lLIL = (double) this.iiI1L1iI.illlI1lLIL();
        double iiI1L1iI2 = (double) this.iiI1L1iI.iiI1L1iI();
        int i = rect2.left;
        if (i >= 0 && rect2.top >= 0 && ((double) rect2.right) <= illlI1lLIL) {
            int i2 = rect2.bottom;
            if (((double) i2) <= iiI1L1iI2) {
                this.i1LIL11l = i1iiLIil1ILi.IiIIlIL(((double) i) / illlI1lLIL, 1.0d - (((double) i2) / iiI1L1iI2), ((double) rect2.width()) / illlI1lLIL, ((double) rect2.height()) / iiI1L1iI2).iiIliillii(this.i1LIL11l);
                this.iiI1L1iI = new C0363o0OOOo0O(rect2.width(), rect2.height());
                return;
            }
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("UAyu8Ow=\n", "E37BgMyW7Mg=\n") + rect2 + C0387o0OOoO0o.iiI1L1iI("8MfvacPUW5jw1v9vhthRm6XWt2vU1F7L+A==\n", "0KKXCqaxP+s=\n") + this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("FQ==\n", "PD0MDVRbpzo=\n"));
    }

    public C0363o0OOOo0O iLLLILIiLi1Ii() {
        return this.iiI1L1iI;
    }

    public void iiI1L1iI(double d) {
        if (d != 0.0d) {
            this.i1LIL11l = i1iiLIil1ILi.iilLiIIIi11i(-d).IilL11ii1I1Il(this.iiI1L1iI).i1LIL11l().iiIliillii(this.i1LIL11l);
        }
    }

    public void iiIliillii(C0363o0OOOo0O o0oooo0o) {
        if (!this.iiI1L1iI.equals(o0oooo0o)) {
            if (this.i1LIL11l == null) {
                this.i1LIL11l = i1iiLIil1ILi.I11lLL1;
            }
            this.iiI1L1iI = o0oooo0o;
        }
    }

    public void iilLil1i11I1(int i) {
        if (i != 0) {
            this.i1LIL11l = i1iiLIil1ILi.IiiL1llIIi(i).iiIliillii(this.i1LIL11l);
            if (i % 2 != 0) {
                this.iiI1L1iI = this.iiI1L1iI.iilLil1i11I1();
            }
        }
    }

    public void il1LilLllii(C0263o00ooOO0 o00oooo0) {
        if (o00oooo0.iiIliillii()) {
            this.i1LIL11l = i1iiLIil1ILi.illlI1lLIL().iiIliillii(this.i1LIL11l);
        }
        iilLil1i11I1((4 - o00oooo0.il1LilLllii()) % 4);
    }

    public void illlI1lLIL(int i, boolean z, C0263o00ooOO0 o00oooo0) {
        if (z) {
            iilLil1i11I1((4 - i) % 4);
        }
        il1LilLllii(o00oooo0);
    }
}
