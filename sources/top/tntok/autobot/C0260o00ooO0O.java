package top.tntok.autobot;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: top.tntok.autobot.o00ooO0O  reason: case insensitive filesystem */
public final class C0260o00ooO0O {
    public final C0261o00ooO0o iiI1L1iI;

    public C0260o00ooO0O(C0261o00ooO0o o00ooo0o) {
        this.iiI1L1iI = o00ooo0o;
    }

    public List<C0009OooO0oO> i1LIL11l(Collection<C0009OooO0oO> collection) throws o00OO0OO {
        List<C0009OooO0oO> iilLil1i11I1 = this.iiI1L1iI.iilLil1i11I1(Collections.unmodifiableCollection(collection));
        if (!this.iiI1L1iI.iLLLILIiLi1Ii()) {
            return iilLil1i11I1;
        }
        HashSet hashSet = new HashSet(collection);
        if (hashSet.containsAll(iilLil1i11I1)) {
            HashSet hashSet2 = new HashSet(iilLil1i11I1);
            if (hashSet2.size() != iilLil1i11I1.size()) {
                throw new o00OO0OO("Ordering duplicated items");
            } else if (hashSet2.containsAll(hashSet)) {
                return iilLil1i11I1;
            } else {
                throw new o00OO0OO("Ordering removed items");
            }
        } else {
            throw new o00OO0OO("Ordering added items");
        }
    }

    public void iiI1L1iI(Object obj) throws o00OO0OO {
        if (obj instanceof C0258o00ooO0) {
            ((C0258o00ooO0) obj).iilLil1i11I1(this);
        }
    }
}
