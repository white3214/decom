package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.notification.RunListener;
import top.tntok.autobot.C0009OooO0oO;
import top.tntok.autobot.C0377o0OOo0OO;
import top.tntok.autobot.o00O0O;
import top.tntok.autobot.o0OO000;

public class iiI1L1iI {
    public volatile boolean i1LIL11l = false;
    public final List<RunListener> iiI1L1iI = new CopyOnWriteArrayList();

    public class I11lLL1 extends iilLiIIIi11i {
        public final /* synthetic */ o00O0O illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public I11lLL1(o00O0O o00o0o) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = o00o0o;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.iiI1L1iI(this.illlI1lLIL);
        }
    }

    public class IiIIlIL extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IiIIlIL(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.illlI1lLIL(this.illlI1lLIL);
        }
    }

    public class i1LIL11l extends iilLiIIIi11i {
        public final /* synthetic */ o0OO000 illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i1LIL11l(o0OO000 o0oo000) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = o0oo000;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.iiIliillii(this.illlI1lLIL);
        }
    }

    public class iLLLILIiLi1Ii extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iLLLILIiLi1Ii(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.il1LilLllii(this.illlI1lLIL);
        }
    }

    /* renamed from: org.junit.runner.notification.iiI1L1iI$iiI1L1iI  reason: collision with other inner class name */
    public class C0001iiI1L1iI extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0001iiI1L1iI(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.iilLil1i11I1(this.illlI1lLIL);
        }
    }

    public class iiIliillii extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiIliillii(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.I11lLL1(this.illlI1lLIL);
        }
    }

    public abstract class iilLiIIIi11i {
        public final List<RunListener> iiI1L1iI;

        public iilLiIIIi11i(iiI1L1iI iii1l1ii) {
            this(iii1l1ii.iiI1L1iI);
        }

        public void i1LIL11l() {
            int size = this.iiI1L1iI.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (RunListener next : this.iiI1L1iI) {
                try {
                    iiI1L1iI(next);
                    arrayList.add(next);
                } catch (Exception e) {
                    arrayList2.add(new o00O0O(C0009OooO0oO.il1LilLllii, e));
                }
            }
            iiI1L1iI.this.I11lLL1(arrayList, arrayList2);
        }

        public abstract void iiI1L1iI(RunListener runListener) throws Exception;

        public iilLiIIIi11i(List<RunListener> list) {
            this.iiI1L1iI = list;
        }
    }

    public class iilLil1i11I1 extends iilLiIIIi11i {
        public final /* synthetic */ List illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iilLil1i11I1(List list, List list2) {
            super(list);
            this.illlI1lLIL = list2;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            for (o00O0O i1LIL11l : this.illlI1lLIL) {
                runListener.i1LIL11l(i1LIL11l);
            }
        }
    }

    public class il1LilLllii extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public il1LilLllii(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.iLLLILIiLi1Ii(this.illlI1lLIL);
        }
    }

    public class illlI1lLIL extends iilLiIIIi11i {
        public final /* synthetic */ C0009OooO0oO illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public illlI1lLIL(C0009OooO0oO oooO0oO) {
            super(iiI1L1iI.this);
            this.illlI1lLIL = oooO0oO;
        }

        public void iiI1L1iI(RunListener runListener) throws Exception {
            runListener.IiIIlIL(this.illlI1lLIL);
        }
    }

    public final void I11lLL1(List<RunListener> list, List<o00O0O> list2) {
        if (!list2.isEmpty()) {
            new iilLil1i11I1(list, list2).i1LIL11l();
        }
    }

    public void I1iIiIi(C0009OooO0oO oooO0oO) {
        new il1LilLllii(oooO0oO).i1LIL11l();
    }

    public void IL1lILLLL1L() {
        this.i1LIL11l = true;
    }

    public void IiIIlIL(C0009OooO0oO oooO0oO) {
        new iLLLILIiLi1Ii(oooO0oO).i1LIL11l();
    }

    public void IiiL1llIIi(C0009OooO0oO oooO0oO) {
        new C0001iiI1L1iI(oooO0oO).i1LIL11l();
    }

    public RunListener i111iLiiIIill(RunListener runListener) {
        if (runListener.getClass().isAnnotationPresent(RunListener.ThreadSafe.class)) {
            return runListener;
        }
        return new i1LIL11l(runListener, this);
    }

    public void i1L1lLllLLlIi(C0009OooO0oO oooO0oO) {
        new illlI1lLIL(oooO0oO).i1LIL11l();
    }

    public void iILiI1lll(C0009OooO0oO oooO0oO) throws C0377o0OOo0OO {
        if (!this.i1LIL11l) {
            new iiIliillii(oooO0oO).i1LIL11l();
            return;
        }
        throw new C0377o0OOo0OO();
    }

    public void iL1LIlIlI(RunListener runListener) {
        if (runListener != null) {
            this.iiI1L1iI.remove(i111iLiiIIill(runListener));
            return;
        }
        throw new NullPointerException("Cannot remove a null listener");
    }

    public void iLLLILIiLi1Ii(C0009OooO0oO oooO0oO) {
        new IiIIlIL(oooO0oO).i1LIL11l();
    }

    public void iiIliillii(o00O0O o00o0o) {
        new I11lLL1(o00o0o).i1LIL11l();
    }

    public void iilLiIIIi11i(o0OO000 o0oo000) {
        new i1LIL11l(o0oo000).i1LIL11l();
    }

    public void iilLil1i11I1(o00O0O o00o0o) {
        I11lLL1(this.iiI1L1iI, Arrays.asList(new o00O0O[]{o00o0o}));
    }

    public void il1LilLllii(RunListener runListener) {
        if (runListener != null) {
            this.iiI1L1iI.add(i111iLiiIIill(runListener));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }

    public void illlI1lLIL(RunListener runListener) {
        if (runListener != null) {
            this.iiI1L1iI.add(0, i111iLiiIIill(runListener));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }
}
