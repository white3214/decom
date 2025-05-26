package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;

/* renamed from: top.tntok.autobot.o0oO0O00  reason: case insensitive filesystem */
public abstract class C0522o0oO0O00 implements C0429o0Oo0ooO {

    /* renamed from: top.tntok.autobot.o0oO0O00$iiI1L1iI */
    public class iiI1L1iI extends C0374o0OOo00o {
        public final /* synthetic */ C0374o0OOo00o i1LIL11l;
        public final /* synthetic */ C0009OooO0oO iiI1L1iI;

        public iiI1L1iI(C0009OooO0oO oooO0oO, C0374o0OOo00o o0ooo00o) {
            this.iiI1L1iI = oooO0oO;
            this.i1LIL11l = o0ooo00o;
        }

        public void iiI1L1iI() throws Throwable {
            ArrayList arrayList = new ArrayList();
            C0522o0oO0O00.this.IL1lILLLL1L(this.iiI1L1iI, arrayList);
            try {
                this.i1LIL11l.iiI1L1iI();
                C0522o0oO0O00.this.i111iLiiIIill(this.iiI1L1iI, arrayList);
            } catch (iLILliI1 e) {
                arrayList.add(e);
                C0522o0oO0O00.this.I1iIiIi(e, this.iiI1L1iI, arrayList);
            } catch (Throwable th) {
                C0522o0oO0O00.this.iilLiIIIi11i(this.iiI1L1iI, arrayList);
                throw th;
            }
            C0522o0oO0O00.this.iilLiIIIi11i(this.iiI1L1iI, arrayList);
            C0191o00o00O0.iiI1L1iI(arrayList);
        }
    }

    public final void I1iIiIi(iLILliI1 ilillii1, C0009OooO0oO oooO0oO, List<Throwable> list) {
        try {
            if (ilillii1 instanceof i1i1111LLILli) {
                iILiI1lll((i1i1111LLILli) ilillii1, oooO0oO);
            } else {
                IiiL1llIIi(ilillii1, oooO0oO);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public final void IL1lILLLL1L(C0009OooO0oO oooO0oO, List<Throwable> list) {
        try {
            i1L1lLllLLlIi(oooO0oO);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public final void i111iLiiIIill(C0009OooO0oO oooO0oO, List<Throwable> list) {
        try {
            iL1LIlIlI(oooO0oO);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public void iILiI1lll(i1i1111LLILli i1i1111llilli, C0009OooO0oO oooO0oO) {
        IiiL1llIIi(i1i1111llilli, oooO0oO);
    }

    public final void iLLLILIiLi1Ii(Throwable th, C0009OooO0oO oooO0oO, List<Throwable> list) {
        try {
            I11lLL1(th, oooO0oO);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    public C0374o0OOo00o iiI1L1iI(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO) {
        return new iiI1L1iI(oooO0oO, o0ooo00o);
    }

    public final void iilLiIIIi11i(C0009OooO0oO oooO0oO, List<Throwable> list) {
        try {
            IiIIlIL(oooO0oO);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public void IiIIlIL(C0009OooO0oO oooO0oO) {
    }

    public void i1L1lLllLLlIi(C0009OooO0oO oooO0oO) {
    }

    public void iL1LIlIlI(C0009OooO0oO oooO0oO) {
    }

    public void I11lLL1(Throwable th, C0009OooO0oO oooO0oO) {
    }

    @Deprecated
    public void IiiL1llIIi(iLILliI1 ilillii1, C0009OooO0oO oooO0oO) {
    }
}
