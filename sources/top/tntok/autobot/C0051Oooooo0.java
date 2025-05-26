package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;

/* renamed from: top.tntok.autobot.Oooooo0  reason: case insensitive filesystem */
public class C0051Oooooo0 {
    public final List<C0175o00Ooo00<?>> iiI1L1iI = new ArrayList();

    public final C0175o00Ooo00<Throwable> i1LIL11l() {
        if (this.iiI1L1iI.size() == 1) {
            return il1LilLllii(this.iiI1L1iI.get(0));
        }
        return I1i1LilILi.iiI1L1iI(iiIliillii());
    }

    public void iiI1L1iI(C0175o00Ooo00<?> o00ooo00) {
        this.iiI1L1iI.add(o00ooo00);
    }

    public final List<C0175o00Ooo00<? super Throwable>> iiIliillii() {
        return new ArrayList(this.iiI1L1iI);
    }

    public boolean iilLil1i11I1() {
        return !this.iiI1L1iI.isEmpty();
    }

    public C0175o00Ooo00<Throwable> illlI1lLIL() {
        return C0149o00OOooo.iilLiIIIi11i(i1LIL11l());
    }

    public final C0175o00Ooo00<Throwable> il1LilLllii(C0175o00Ooo00<?> o00ooo00) {
        return o00ooo00;
    }
}
