package top.tntok.autobot;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

public class o0O0OO0 {
    public static final int i1LIL11l = 10;
    public final List<C0536o0ooO> iiI1L1iI = new ArrayList();

    public int I11lLL1(MotionEvent.PointerProperties[] pointerPropertiesArr, MotionEvent.PointerCoords[] pointerCoordsArr) {
        int size = this.iiI1L1iI.size();
        for (int i = 0; i < size; i++) {
            C0536o0ooO o0ooo = this.iiI1L1iI.get(i);
            pointerPropertiesArr[i].id = o0ooo.i1LIL11l();
            C0293o0O0O0oo illlI1lLIL = o0ooo.illlI1lLIL();
            pointerCoordsArr[i].x = (float) illlI1lLIL.iiI1L1iI();
            pointerCoordsArr[i].y = (float) illlI1lLIL.i1LIL11l();
            pointerCoordsArr[i].pressure = o0ooo.il1LilLllii();
        }
        iiI1L1iI();
        return size;
    }

    public C0536o0ooO i1LIL11l(int i) {
        return this.iiI1L1iI.get(i);
    }

    public final void iiI1L1iI() {
        for (int size = this.iiI1L1iI.size() - 1; size >= 0; size--) {
            if (this.iiI1L1iI.get(size).iiIliillii()) {
                this.iiI1L1iI.remove(size);
            }
        }
    }

    public final boolean iiIliillii(int i) {
        for (int i2 = 0; i2 < this.iiI1L1iI.size(); i2++) {
            if (this.iiI1L1iI.get(i2).i1LIL11l() == i) {
                return false;
            }
        }
        return true;
    }

    public final int iilLil1i11I1() {
        for (int i = 0; i < 10; i++) {
            if (iiIliillii(i)) {
                return i;
            }
        }
        return -1;
    }

    public final int il1LilLllii(long j) {
        for (int i = 0; i < this.iiI1L1iI.size(); i++) {
            if (this.iiI1L1iI.get(i).iiI1L1iI() == j) {
                return i;
            }
        }
        return -1;
    }

    public int illlI1lLIL(long j) {
        int il1LilLllii = il1LilLllii(j);
        if (il1LilLllii != -1) {
            return il1LilLllii;
        }
        if (this.iiI1L1iI.size() >= 10) {
            return -1;
        }
        int iilLil1i11I1 = iilLil1i11I1();
        if (iilLil1i11I1 != -1) {
            this.iiI1L1iI.add(new C0536o0ooO(j, iilLil1i11I1));
            return this.iiI1L1iI.size() - 1;
        }
        throw new AssertionError(C0387o0OOoO0o.iiI1L1iI("yFhUKpyMJVGWRFQ+jcF+AoQXUCWQrz5M31JPN8iAOlLUXlg3yJ0/Q8wXXGSEhjRD1BdUIMiAJALZ\nQVwthIg1Tt0=\n", "uDc9ROjpVyI=\n"));
    }
}
