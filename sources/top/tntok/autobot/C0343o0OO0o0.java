package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OO0o0  reason: case insensitive filesystem */
public class C0343o0OO0o0 implements C0429o0Oo0ooO {
    public static final C0343o0OO0o0 i1LIL11l = new C0343o0OO0o0(Collections.emptyList());
    public List<C0429o0Oo0ooO> iiI1L1iI;

    public C0343o0OO0o0(List<C0429o0Oo0ooO> list) {
        this.iiI1L1iI = list;
    }

    public static C0343o0OO0o0 il1LilLllii(C0429o0Oo0ooO o0oo0ooo) {
        return illlI1lLIL().i1LIL11l(o0oo0ooo);
    }

    public static C0343o0OO0o0 illlI1lLIL() {
        return i1LIL11l;
    }

    public C0343o0OO0o0 i1LIL11l(C0429o0Oo0ooO o0oo0ooo) {
        if (o0oo0ooo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0oo0ooo);
            arrayList.addAll(this.iiI1L1iI);
            return new C0343o0OO0o0(arrayList);
        }
        throw new NullPointerException("The enclosed rule must not be null");
    }

    public C0374o0OOo00o iiI1L1iI(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO) {
        return new o0OO0oO(o0ooo00o, this.iiI1L1iI, oooO0oO);
    }
}
