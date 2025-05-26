package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;

/* renamed from: top.tntok.autobot.o00oOo0O  reason: case insensitive filesystem */
public class C0236o00oOo0O {
    public static <E> List<C0175o00Ooo00<? super E>> iiI1L1iI(C0175o00Ooo00<? super E>[] o00ooo00Arr) {
        ArrayList arrayList = new ArrayList(o00ooo00Arr.length);
        int length = o00ooo00Arr.length;
        for (int i = 0; i < length; i++) {
            C0175o00Ooo00<Object> o00ooo00 = o00ooo00Arr[i];
            arrayList.add(o00ooo00 == null ? o00OOO0O.I11lLL1() : o00ooo00);
        }
        return arrayList;
    }
}
