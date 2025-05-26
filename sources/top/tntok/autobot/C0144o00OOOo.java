package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.notification.RunListener;

/* renamed from: top.tntok.autobot.o00OOOo  reason: case insensitive filesystem */
public class C0144o00OOOo extends HashMap<C0009OooO0oO, C0532o0oOo0o0> {
    public static final C0144o00OOOo i1LIL11l = new C0144o00OOOo();
    private static final long serialVersionUID = 1;

    /* renamed from: top.tntok.autobot.o00OOOo$iiI1L1iI */
    public class iiI1L1iI extends RunListener {
        public final /* synthetic */ C0428o0Oo0oo0 iiI1L1iI;

        public iiI1L1iI(C0428o0Oo0oo0 o0oo0oo0) {
            this.iiI1L1iI = o0oo0oo0;
        }

        public void I11lLL1(C0009OooO0oO oooO0oO) throws Exception {
            this.iiI1L1iI.IL1lILLLL1L(C0144o00OOOo.this.illlI1lLIL(oooO0oO));
        }

        public void i1LIL11l(o00O0O o00o0o) throws Exception {
            this.iiI1L1iI.iiI1L1iI(C0144o00OOOo.this.illlI1lLIL(o00o0o.iiI1L1iI()), o00o0o.i1LIL11l());
        }

        public void illlI1lLIL(C0009OooO0oO oooO0oO) throws Exception {
            this.iiI1L1iI.iiIliillii(C0144o00OOOo.this.illlI1lLIL(oooO0oO));
        }
    }

    public static C0144o00OOOo I11lLL1() {
        return i1LIL11l;
    }

    public org.junit.runner.notification.iiI1L1iI iLLLILIiLi1Ii(C0428o0Oo0oo0 o0oo0oo0, C0145o00OOOo0 o00oooo0) {
        org.junit.runner.notification.iiI1L1iI iii1l1ii = new org.junit.runner.notification.iiI1L1iI();
        iii1l1ii.il1LilLllii(new iiI1L1iI(o0oo0oo0));
        return iii1l1ii;
    }

    public List<C0532o0oOo0o0> iiIliillii(C0009OooO0oO oooO0oO) {
        if (oooO0oO.iiLIIiIli()) {
            return Arrays.asList(new C0532o0oOo0o0[]{illlI1lLIL(oooO0oO)});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0009OooO0oO> it = oooO0oO.i1L1lLllLLlIi().iterator();
        while (it.hasNext()) {
            arrayList.add(illlI1lLIL(it.next()));
        }
        return arrayList;
    }

    public C0532o0oOo0o0 iilLil1i11I1(C0009OooO0oO oooO0oO) {
        if (oooO0oO.iiLIIiIli()) {
            return new C0146o00OOOoO(oooO0oO);
        }
        C0432o0OoO000 o0ooo000 = new C0432o0OoO000(oooO0oO.iL1LIlIlI());
        Iterator<C0009OooO0oO> it = oooO0oO.i1L1lLllLLlIi().iterator();
        while (it.hasNext()) {
            o0ooo000.iiI1L1iI(illlI1lLIL(it.next()));
        }
        return o0ooo000;
    }

    public C0532o0oOo0o0 illlI1lLIL(C0009OooO0oO oooO0oO) {
        if (oooO0oO.I1l1iIll1lIi1()) {
            return iilLil1i11I1(oooO0oO);
        }
        if (!containsKey(oooO0oO)) {
            put(oooO0oO, iilLil1i11I1(oooO0oO));
        }
        return (C0532o0oOo0o0) get(oooO0oO);
    }
}
