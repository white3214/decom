package top.tntok.autobot;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: top.tntok.autobot.o00O0O0o  reason: case insensitive filesystem */
public final /* synthetic */ class C0122o00O0O0o implements C0125o00O0Oo0 {
    public final /* synthetic */ Function i1LIL11l;
    public final /* synthetic */ C0125o00O0Oo0 iiI1L1iI;

    public /* synthetic */ C0122o00O0O0o(C0125o00O0Oo0 o00o0oo0, Function function) {
        this.iiI1L1iI = o00o0oo0;
        this.i1LIL11l = function;
    }

    public /* synthetic */ oOO00O andThen(Consumer consumer) {
        return C0123o00O0OOo.iiI1L1iI(this, consumer);
    }

    public final Object apply(Object obj) {
        return this.i1LIL11l.apply(this.iiI1L1iI.apply(obj));
    }

    public /* synthetic */ C0125o00O0Oo0 compose(Function function) {
        return C0123o00O0OOo.iiIliillii(this, function);
    }

    public /* synthetic */ C0124o00O0Oo i1LIL11l(C0124o00O0Oo o00o0oo) {
        return C0123o00O0OOo.iLLLILIiLi1Ii(this, o00o0oo);
    }

    public /* synthetic */ oOO00O iiI1L1iI(oOO00O ooo00o) {
        return C0123o00O0OOo.i1LIL11l(this, ooo00o);
    }

    public /* synthetic */ C0125o00O0Oo0 iiIliillii(C0125o00O0Oo0 o00o0oo0) {
        return C0123o00O0OOo.iilLil1i11I1(this, o00o0oo0);
    }

    public /* synthetic */ C0125o00O0Oo0 il1LilLllii(C0125o00O0Oo0 o00o0oo0) {
        return C0123o00O0OOo.il1LilLllii(this, o00o0oo0);
    }

    public /* synthetic */ C0124o00O0Oo illlI1lLIL(Supplier supplier) {
        return C0123o00O0OOo.I11lLL1(this, supplier);
    }

    public /* synthetic */ C0125o00O0Oo0 andThen(Function function) {
        return C0123o00O0OOo.illlI1lLIL(this, function);
    }
}
