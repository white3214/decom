package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OO0o0O  reason: case insensitive filesystem */
public class C0344o0OO0o0O {
    public static final Comparator<i1LIL11l> il1LilLllii = new iiI1L1iI();
    public final List<C0429o0Oo0ooO> i1LIL11l = new ArrayList();
    public final IdentityHashMap<Object, Integer> iiI1L1iI = new IdentityHashMap<>();
    public final List<C0183o00Ooooo> illlI1lLIL = new ArrayList();

    /* renamed from: top.tntok.autobot.o0OO0o0O$i1LIL11l */
    public static class i1LIL11l {
        public static final int iiIliillii = 0;
        public static final int il1LilLllii = 1;
        public final int i1LIL11l;
        public final Object iiI1L1iI;
        public final int illlI1lLIL;

        public i1LIL11l(Object obj, int i, Integer num) {
            int i2;
            this.iiI1L1iI = obj;
            this.i1LIL11l = i;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            this.illlI1lLIL = i2;
        }
    }

    /* renamed from: top.tntok.autobot.o0OO0o0O$iiI1L1iI */
    public class iiI1L1iI implements Comparator<i1LIL11l> {
        public final int i1LIL11l(int i, int i2) {
            if (i < i2) {
                return 1;
            }
            if (i == i2) {
                return 0;
            }
            return -1;
        }

        /* renamed from: iiI1L1iI */
        public int compare(i1LIL11l i1lil11l, i1LIL11l i1lil11l2) {
            int i1LIL11l = i1LIL11l(i1lil11l.illlI1lLIL, i1lil11l2.illlI1lLIL);
            if (i1LIL11l != 0) {
                return i1LIL11l;
            }
            return i1lil11l.i1LIL11l - i1lil11l2.i1LIL11l;
        }
    }

    public void i1LIL11l(C0429o0Oo0ooO o0oo0ooo) {
        this.i1LIL11l.add(o0oo0ooo);
    }

    public void iiI1L1iI(C0183o00Ooooo o00ooooo) {
        this.illlI1lLIL.add(o00ooooo);
    }

    public List<Object> iiIliillii() {
        ArrayList arrayList = new ArrayList();
        for (i1LIL11l i1lil11l : il1LilLllii()) {
            arrayList.add(i1lil11l.iiI1L1iI);
        }
        return arrayList;
    }

    public void iilLil1i11I1(Object obj, int i) {
        this.iiI1L1iI.put(obj, Integer.valueOf(i));
    }

    public final List<i1LIL11l> il1LilLllii() {
        ArrayList arrayList = new ArrayList(this.illlI1lLIL.size() + this.i1LIL11l.size());
        for (C0183o00Ooooo next : this.illlI1lLIL) {
            arrayList.add(new i1LIL11l(next, 0, this.iiI1L1iI.get(next)));
        }
        for (C0429o0Oo0ooO next2 : this.i1LIL11l) {
            arrayList.add(new i1LIL11l(next2, 1, this.iiI1L1iI.get(next2)));
        }
        Collections.sort(arrayList, il1LilLllii);
        return arrayList;
    }

    public C0374o0OOo00o illlI1lLIL(C0436o0OoO0o o0ooo0o, C0009OooO0oO oooO0oO, Object obj, C0374o0OOo00o o0ooo00o) {
        if (this.illlI1lLIL.isEmpty() && this.i1LIL11l.isEmpty()) {
            return o0ooo00o;
        }
        for (i1LIL11l next : il1LilLllii()) {
            if (next.i1LIL11l == 1) {
                o0ooo00o = ((C0429o0Oo0ooO) next.iiI1L1iI).iiI1L1iI(o0ooo00o, oooO0oO);
            } else {
                o0ooo00o = ((C0183o00Ooooo) next.iiI1L1iI).iiI1L1iI(o0ooo00o, o0ooo0o, obj);
            }
        }
        return o0ooo00o;
    }
}
