package top.tntok.autobot;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0531o0oOo0O0;

/* renamed from: top.tntok.autobot.OooOooO  reason: case insensitive filesystem */
public final class C0024OooOooO {
    public static final /* synthetic */ boolean iLLLILIiLi1Ii = false;
    public final Deque<C0531o0oOo0O0> I11lLL1 = new ArrayDeque();
    public int i1LIL11l = 5;
    public int iiI1L1iI = 64;
    public final Deque<C0531o0oOo0O0.iiI1L1iI> iiIliillii = new ArrayDeque();
    public final Deque<C0531o0oOo0O0.iiI1L1iI> iilLil1i11I1 = new ArrayDeque();
    @Nullable
    public ExecutorService il1LilLllii;
    @Nullable
    public Runnable illlI1lLIL;

    public C0024OooOooO(ExecutorService executorService) {
        this.il1LilLllii = executorService;
    }

    public void I11lLL1(C0531o0oOo0O0.iiI1L1iI iii1l1ii) {
        iii1l1ii.I1iIiIi().decrementAndGet();
        iilLil1i11I1(this.iilLil1i11I1, iii1l1ii);
    }

    public synchronized int I1iIiIi() {
        return this.iiIliillii.size();
    }

    public synchronized int IL1lILLLL1L() {
        return this.iilLil1i11I1.size() + this.I11lLL1.size();
    }

    public void Ii1liIIIiLi(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.i1LIL11l = i;
            }
            IiiL1llIIi();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + i);
    }

    public synchronized int IiIIlIL() {
        return this.iiI1L1iI;
    }

    public final boolean IiiL1llIIi() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C0531o0oOo0O0.iiI1L1iI> it = this.iiIliillii.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0531o0oOo0O0.iiI1L1iI next = it.next();
                    if (this.iilLil1i11I1.size() >= this.iiI1L1iI) {
                        break;
                    } else if (next.I1iIiIi().get() < this.i1LIL11l) {
                        it.remove();
                        next.I1iIiIi().incrementAndGet();
                        arrayList.add(next);
                        this.iilLil1i11I1.add(next);
                    }
                }
                if (IL1lILLLL1L() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                while (true) {
                }
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C0531o0oOo0O0.iiI1L1iI) arrayList.get(i)).i1L1lLllLLlIi(il1LilLllii());
        }
        return z;
    }

    public void i111iLiiIIill(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.iiI1L1iI = i;
            }
            IiiL1llIIi();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + i);
    }

    public synchronized List<iiIIl1I> i1L1lLllLLlIi() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.I11lLL1);
            for (C0531o0oOo0O0.iiI1L1iI IL1lILLLL1L : this.iilLil1i11I1) {
                arrayList.add(IL1lILLLL1L.IL1lILLLL1L());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void i1LIL11l(C0531o0oOo0O0.iiI1L1iI iii1l1ii) {
        C0531o0oOo0O0.iiI1L1iI iiIliillii2;
        synchronized (this) {
            try {
                this.iiIliillii.add(iii1l1ii);
                if (!iii1l1ii.IL1lILLLL1L().iiIliillii && (iiIliillii2 = iiIliillii(iii1l1ii.iL1LIlIlI())) != null) {
                    iii1l1ii.Ii1liIIIiLi(iiIliillii2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        IiiL1llIIi();
    }

    public synchronized List<iiIIl1I> iILiI1lll() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C0531o0oOo0O0.iiI1L1iI IL1lILLLL1L : this.iiIliillii) {
                arrayList.add(IL1lILLLL1L.IL1lILLLL1L());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized void iL1LIlIlI(@Nullable Runnable runnable) {
        this.illlI1lLIL = runnable;
    }

    public void iLLLILIiLi1Ii(C0531o0oOo0O0 o0ooo0o0) {
        iilLil1i11I1(this.I11lLL1, o0ooo0o0);
    }

    public synchronized void iiI1L1iI() {
        try {
            for (C0531o0oOo0O0.iiI1L1iI IL1lILLLL1L : this.iiIliillii) {
                IL1lILLLL1L.IL1lILLLL1L().i1LIL11l();
            }
            for (C0531o0oOo0O0.iiI1L1iI IL1lILLLL1L2 : this.iilLil1i11I1) {
                IL1lILLLL1L2.IL1lILLLL1L().i1LIL11l();
            }
            for (C0531o0oOo0O0 i1LIL11l2 : this.I11lLL1) {
                i1LIL11l2.i1LIL11l();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    @Nullable
    public final C0531o0oOo0O0.iiI1L1iI iiIliillii(String str) {
        for (C0531o0oOo0O0.iiI1L1iI next : this.iilLil1i11I1) {
            if (next.iL1LIlIlI().equals(str)) {
                return next;
            }
        }
        for (C0531o0oOo0O0.iiI1L1iI next2 : this.iiIliillii) {
            if (next2.iL1LIlIlI().equals(str)) {
                return next2;
            }
        }
        return null;
    }

    public synchronized int iilLiIIIi11i() {
        return this.i1LIL11l;
    }

    public final <T> void iilLil1i11I1(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.illlI1lLIL;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!IiiL1llIIi() && runnable != null) {
            runnable.run();
        }
    }

    public synchronized ExecutorService il1LilLllii() {
        try {
            if (this.il1LilLllii == null) {
                this.il1LilLllii = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0487o0OooooO.IILiIL1i11Li("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.il1LilLllii;
    }

    public synchronized void illlI1lLIL(C0531o0oOo0O0 o0ooo0o0) {
        this.I11lLL1.add(o0ooo0o0);
    }

    public C0024OooOooO() {
    }
}
