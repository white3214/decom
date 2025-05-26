package top.tntok.autobot;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: top.tntok.autobot.o00oo0oO  reason: case insensitive filesystem */
public final class C0256o00oo0oO extends AbstractList<ili11iILI1l> implements RandomAccess {
    public final int[] i1LIL11l;
    public final ili11iILI1l[] iiI1L1iI;

    public C0256o00oo0oO(ili11iILI1l[] ili11iili1lArr, int[] iArr) {
        this.iiI1L1iI = ili11iili1lArr;
        this.i1LIL11l = iArr;
    }

    public static void iiI1L1iI(long j, IiILIlLLiIL iiILIlLLiIL, int i, List<ili11iILI1l> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        IiILIlLLiIL iiILIlLLiIL2;
        int i8;
        IiILIlLLiIL iiILIlLLiIL3 = iiILIlLLiIL;
        int i9 = i;
        List<ili11iILI1l> list3 = list;
        int i10 = i2;
        int i11 = i3;
        List<Integer> list4 = list2;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                if (list3.get(i12).illiiliIILI() >= i9) {
                    i12++;
                } else {
                    throw new AssertionError();
                }
            }
            ili11iILI1l ili11iili1l = list.get(i2);
            ili11iILI1l ili11iili1l2 = list3.get(i11 - 1);
            if (i9 == ili11iili1l.illiiliIILI()) {
                int intValue = list4.get(i10).intValue();
                int i13 = i10 + 1;
                i4 = i13;
                i5 = intValue;
                ili11iili1l = list3.get(i13);
            } else {
                i5 = -1;
                i4 = i10;
            }
            if (ili11iili1l.i1L1lLllLLlIi(i9) != ili11iili1l2.i1L1lLllLLlIi(i9)) {
                int i14 = 1;
                for (int i15 = i4 + 1; i15 < i11; i15++) {
                    if (list3.get(i15 - 1).i1L1lLllLLlIi(i9) != list3.get(i15).i1L1lLllLLlIi(i9)) {
                        i14++;
                    }
                }
                long illlI1lLIL = j + ((long) illlI1lLIL(iiILIlLLiIL)) + 2 + ((long) (i14 * 2));
                iiILIlLLiIL3.iilLil1i11I1(i14);
                iiILIlLLiIL3.iilLil1i11I1(i5);
                for (int i16 = i4; i16 < i11; i16++) {
                    byte i1L1lLllLLlIi = list3.get(i16).i1L1lLllLLlIi(i9);
                    if (i16 == i4 || i1L1lLllLLlIi != list3.get(i16 - 1).i1L1lLllLLlIi(i9)) {
                        iiILIlLLiIL3.iilLil1i11I1(i1L1lLllLLlIi & i1IL1lILl1L1I.iiI1L1iI);
                    }
                }
                IiILIlLLiIL iiILIlLLiIL4 = new IiILIlLLiIL();
                int i17 = i4;
                while (i17 < i11) {
                    byte i1L1lLllLLlIi2 = list3.get(i17).i1L1lLllLLlIi(i9);
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 >= i11) {
                            i7 = i11;
                            break;
                        } else if (i1L1lLllLLlIi2 != list3.get(i19).i1L1lLllLLlIi(i9)) {
                            i7 = i19;
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i18 == i7 && i9 + 1 == list3.get(i17).illiiliIILI()) {
                        iiILIlLLiIL3.iilLil1i11I1(list4.get(i17).intValue());
                        i8 = i7;
                        iiILIlLLiIL2 = iiILIlLLiIL4;
                    } else {
                        iiILIlLLiIL3.iilLil1i11I1((int) ((((long) illlI1lLIL(iiILIlLLiIL4)) + illlI1lLIL) * -1));
                        i8 = i7;
                        iiILIlLLiIL2 = iiILIlLLiIL4;
                        iiI1L1iI(illlI1lLIL, iiILIlLLiIL4, i9 + 1, list, i17, i7, list2);
                    }
                    iiILIlLLiIL4 = iiILIlLLiIL2;
                    i17 = i8;
                }
                IiILIlLLiIL iiILIlLLiIL5 = iiILIlLLiIL4;
                iiILIlLLiIL3.I1iIiIi(iiILIlLLiIL5, iiILIlLLiIL5.iLLi1LIi());
                return;
            }
            int min = Math.min(ili11iili1l.illiiliIILI(), ili11iili1l2.illiiliIILI());
            int i20 = 0;
            int i21 = i9;
            while (i21 < min && ili11iili1l.i1L1lLllLLlIi(i21) == ili11iili1l2.i1L1lLllLLlIi(i21)) {
                i20++;
                i21++;
            }
            long illlI1lLIL2 = 1 + j + ((long) illlI1lLIL(iiILIlLLiIL)) + 2 + ((long) i20);
            iiILIlLLiIL3.iilLil1i11I1(-i20);
            iiILIlLLiIL3.iilLil1i11I1(i5);
            int i22 = i9;
            while (true) {
                i6 = i9 + i20;
                if (i22 >= i6) {
                    break;
                }
                iiILIlLLiIL3.iilLil1i11I1(ili11iili1l.i1L1lLllLLlIi(i22) & i1IL1lILl1L1I.iiI1L1iI);
                i22++;
            }
            if (i4 + 1 != i11) {
                IiILIlLLiIL iiILIlLLiIL6 = new IiILIlLLiIL();
                iiILIlLLiIL3.iilLil1i11I1((int) ((((long) illlI1lLIL(iiILIlLLiIL6)) + illlI1lLIL2) * -1));
                iiI1L1iI(illlI1lLIL2, iiILIlLLiIL6, i6, list, i4, i3, list2);
                iiILIlLLiIL3.I1iIiIi(iiILIlLLiIL6, iiILIlLLiIL6.iLLi1LIi());
            } else if (i6 == list3.get(i4).illiiliIILI()) {
                iiILIlLLiIL3.iilLil1i11I1(list4.get(i4).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static C0256o00oo0oO il1LilLllii(ili11iILI1l... ili11iili1lArr) {
        if (ili11iili1lArr.length == 0) {
            return new C0256o00oo0oO(new ili11iILI1l[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(ili11iili1lArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, ili11iili1lArr[i2]), Integer.valueOf(i2));
        }
        if (((ili11iILI1l) arrayList.get(0)).illiiliIILI() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                ili11iILI1l ili11iili1l = (ili11iILI1l) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    ili11iILI1l ili11iili1l2 = (ili11iILI1l) arrayList.get(i5);
                    if (!ili11iili1l2.ILllI11(ili11iili1l)) {
                        continue;
                        break;
                    } else if (ili11iili1l2.illiiliIILI() == ili11iili1l.illiiliIILI()) {
                        throw new IllegalArgumentException("duplicate option: " + ili11iili1l2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            iiI1L1iI(0, iiILIlLLiIL, 0, arrayList, 0, arrayList.size(), arrayList2);
            int illlI1lLIL = illlI1lLIL(iiILIlLLiIL);
            int[] iArr = new int[illlI1lLIL];
            for (int i6 = 0; i6 < illlI1lLIL; i6++) {
                iArr[i6] = iiILIlLLiIL.readInt();
            }
            if (iiILIlLLiIL.Il1llillili()) {
                return new C0256o00oo0oO((ili11iILI1l[]) ili11iili1lArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static int illlI1lLIL(IiILIlLLiIL iiILIlLLiIL) {
        return (int) (iiILIlLLiIL.iLLi1LIi() / 4);
    }

    /* renamed from: i1LIL11l */
    public ili11iILI1l get(int i) {
        return this.iiI1L1iI[i];
    }

    public final int size() {
        return this.iiI1L1iI.length;
    }
}
