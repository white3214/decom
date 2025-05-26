package top.tntok.autobot;

import java.util.function.Consumer;

public final /* synthetic */ class o00O0OO0 implements oOO00O {
    public final /* synthetic */ Consumer i1LIL11l;
    public final /* synthetic */ C0125o00O0Oo0 iiI1L1iI;

    public /* synthetic */ o00O0OO0(C0125o00O0Oo0 o00o0oo0, Consumer consumer) {
        this.iiI1L1iI = o00o0oo0;
        this.i1LIL11l = consumer;
    }

    public final void accept(Object obj) {
        C0126o00O0OoO.iiI1L1iI(this.i1LIL11l, this.iiI1L1iI.apply(obj));
    }

    public /* synthetic */ oOO00O iiI1L1iI(oOO00O ooo00o) {
        return o00O00O.iiI1L1iI(this, ooo00o);
    }
}
