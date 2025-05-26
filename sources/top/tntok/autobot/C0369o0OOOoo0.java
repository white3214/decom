package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OOOoo0  reason: case insensitive filesystem */
public class C0369o0OOOoo0 extends C0261o00ooO0o implements Comparator<C0009OooO0oO> {
    public static final C0369o0OOOoo0 il1LilLllii = new C0369o0OOOoo0(new iiI1L1iI());
    public final Comparator<C0009OooO0oO> illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OOOoo0$iiI1L1iI */
    public class iiI1L1iI implements Comparator<C0009OooO0oO> {
        /* renamed from: iiI1L1iI */
        public int compare(C0009OooO0oO oooO0oO, C0009OooO0oO oooO0oO2) {
            return 0;
        }
    }

    public C0369o0OOOoo0(Comparator<C0009OooO0oO> comparator) {
        this.illlI1lLIL = comparator;
    }

    /* renamed from: IiIIlIL */
    public int compare(C0009OooO0oO oooO0oO, C0009OooO0oO oooO0oO2) {
        return this.illlI1lLIL.compare(oooO0oO, oooO0oO2);
    }

    public void i1LIL11l(Object obj) {
        if (obj instanceof C0367o0OOOoOo) {
            ((C0367o0OOOoOo) obj).il1LilLllii(this);
        }
    }

    public boolean iLLLILIiLi1Ii() {
        return false;
    }

    public final List<C0009OooO0oO> iilLil1i11I1(Collection<C0009OooO0oO> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, this);
        return arrayList;
    }
}
