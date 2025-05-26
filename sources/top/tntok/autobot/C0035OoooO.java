package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;

/* renamed from: top.tntok.autobot.OoooO  reason: case insensitive filesystem */
public class C0035OoooO extends C0267o00ooOoO {
    public Class<?> iiI1L1iI;

    public C0035OoooO(Class<?> cls) {
        this.iiI1L1iI = cls;
    }

    public List<o0O0OOOo> iiI1L1iI(C0265o00ooOo o00oooo) {
        Object[] enumConstants = this.iiI1L1iI.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(o0O0OOOo.iiI1L1iI(obj.toString(), obj));
        }
        return arrayList;
    }
}
