package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.suppliers.TestedOn;

/* renamed from: top.tntok.autobot.o0OoO0Oo  reason: case insensitive filesystem */
public class C0435o0OoO0Oo extends C0267o00ooOoO {
    public List<o0O0OOOo> iiI1L1iI(C0265o00ooOo o00oooo) {
        ArrayList arrayList = new ArrayList();
        for (int valueOf : ((TestedOn) o00oooo.I11lLL1(TestedOn.class)).ints()) {
            arrayList.add(o0O0OOOo.iiI1L1iI("ints", Integer.valueOf(valueOf)));
        }
        return arrayList;
    }
}
