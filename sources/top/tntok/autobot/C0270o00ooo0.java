package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import top.tntok.autobot.C0344o0OO0o0O;

/* renamed from: top.tntok.autobot.o00ooo0  reason: case insensitive filesystem */
public abstract class C0270o00ooo0<T> extends C0346o0OO0oOO implements o000OO0O, C0258o00ooO0 {
    public static final List<C0419o0Oo0OoO> iiIliillii = Collections.singletonList(new IIi1l1i());
    public final C0418o0Oo0Oo0 i1LIL11l;
    public final Lock iiI1L1iI = new ReentrantLock();
    public volatile C0347o0OO0oOo il1LilLllii = new iiI1L1iI();
    public volatile List<T> illlI1lLIL = null;

    /* renamed from: top.tntok.autobot.o00ooo0$i1LIL11l */
    public class i1LIL11l extends C0374o0OOo00o {
        public final /* synthetic */ org.junit.runner.notification.iiI1L1iI iiI1L1iI;

        public i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
            this.iiI1L1iI = iii1l1ii;
        }

        public void iiI1L1iI() {
            C0270o00ooo0.this.i11liIIl11Ii1(this.iiI1L1iI);
        }
    }

    /* renamed from: top.tntok.autobot.o00ooo0$iiIliillii */
    public class iiIliillii implements Comparator<T> {
        public final /* synthetic */ C0369o0OOOoo0 i1LIL11l;

        public iiIliillii(C0369o0OOOoo0 o0ooooo0) {
            this.i1LIL11l = o0ooooo0;
        }

        public int compare(T t, T t2) {
            return this.i1LIL11l.compare(C0270o00ooo0.this.iL1LIlIlI(t), C0270o00ooo0.this.iL1LIlIlI(t2));
        }
    }

    /* renamed from: top.tntok.autobot.o00ooo0$il1LilLllii */
    public class il1LilLllii implements Runnable {
        public final /* synthetic */ org.junit.runner.notification.iiI1L1iI i1LIL11l;
        public final /* synthetic */ Object iiI1L1iI;

        public il1LilLllii(Object obj, org.junit.runner.notification.iiI1L1iI iii1l1ii) {
            this.iiI1L1iI = obj;
            this.i1LIL11l = iii1l1ii;
        }

        public void run() {
            C0270o00ooo0.this.i1iiLIil1ILi(this.iiI1L1iI, this.i1LIL11l);
        }
    }

    /* renamed from: top.tntok.autobot.o00ooo0$illlI1lLIL */
    public class illlI1lLIL extends C0374o0OOo00o {
        public final /* synthetic */ C0374o0OOo00o iiI1L1iI;

        public illlI1lLIL(C0374o0OOo00o o0ooo00o) {
            this.iiI1L1iI = o0ooo00o;
        }

        public void iiI1L1iI() throws Throwable {
            try {
                this.iiI1L1iI.iiI1L1iI();
            } finally {
                Thread.interrupted();
            }
        }
    }

    public C0270o00ooo0(Class<?> cls) throws C0136o00O0oo {
        this.i1LIL11l = IL1lILLLL1L(cls);
        IIlL1llI1();
    }

    private void IIlL1llI1() throws C0136o00O0oo {
        ArrayList arrayList = new ArrayList();
        I1iIiIi(arrayList);
        if (!arrayList.isEmpty()) {
            throw new C0141o00OO0o0(this.i1LIL11l.i1L1lLllLLlIi(), arrayList);
        }
    }

    public final boolean I1I11Il1() {
        if (iiI1L1iI().iILiI1lll(FixMethodOrder.class) != null) {
            return true;
        }
        return false;
    }

    public C0374o0OOo00o I1IIIi1i1ILl(C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = this.i1LIL11l.I1iIiIi(AfterClass.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new o0OO0o(o0ooo00o, I1iIiIi, (Object) null);
    }

    public void I1iIiIi(List<Throwable> list) {
        il1l1IlL(BeforeClass.class, true, list);
        il1l1IlL(AfterClass.class, true, list);
        IL111l1(list);
        iLLLILIiLi1Ii(list);
    }

    public Annotation[] I1l1iIll1lIi1() {
        return this.i1LIL11l.i1LIL11l();
    }

    public final C0374o0OOo00o IIIlll1lll(C0374o0OOo00o o0ooo00o) {
        List<C0429o0Oo0ooO> iILiI1lll = iILiI1lll();
        if (iILiI1lll.isEmpty()) {
            return o0ooo00o;
        }
        return new o0OO0oO(o0ooo00o, iILiI1lll, iiI1L1iI());
    }

    public final void IL111l1(List<Throwable> list) {
        C0345o0OO0o0o.il1LilLllii.IiIIlIL(iiLIIiIli(), list);
        C0345o0OO0o0o.iilLil1i11I1.IiIIlIL(iiLIIiIli(), list);
    }

    public final C0374o0OOo00o IL1IiilLlLI(C0374o0OOo00o o0ooo00o) {
        return new illlI1lLIL(o0ooo00o);
    }

    @Deprecated
    public C0418o0Oo0Oo0 IL1lILLLL1L(Class<?> cls) {
        return new C0418o0Oo0Oo0(cls);
    }

    public boolean ILl1iII11Ll1(T t) {
        return false;
    }

    public final List<T> Ii1liIIIiLi() {
        if (this.illlI1lLIL == null) {
            this.iiI1L1iI.lock();
            try {
                if (this.illlI1lLIL == null) {
                    this.illlI1lLIL = Collections.unmodifiableList(new ArrayList(i111iLiiIIill()));
                }
            } finally {
                this.iiI1L1iI.unlock();
            }
        }
        return this.illlI1lLIL;
    }

    public final boolean IiIIlIL() {
        for (Object ILl1iII11Ll1 : Ii1liIIIiLi()) {
            if (!ILl1iII11Ll1(ILl1iII11Ll1)) {
                return false;
            }
        }
        return true;
    }

    public C0374o0OOo00o IiiL1llIIi(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0374o0OOo00o iilLiIIIi11i = iilLiIIIi11i(iii1l1ii);
        if (!IiIIlIL()) {
            return IL1IiilLlLI(IIIlll1lll(I1IIIi1i1ILl(IilliIIIlI1ll(iilLiIIIi11i))));
        }
        return iilLiIIIi11i;
    }

    public String IilL11ii1I1Il() {
        return this.i1LIL11l.IL1lILLLL1L();
    }

    public C0374o0OOo00o IilliIIIlI1ll(C0374o0OOo00o o0ooo00o) {
        List<C0436o0OoO0o> I1iIiIi = this.i1LIL11l.I1iIiIi(BeforeClass.class);
        if (I1iIiIi.isEmpty()) {
            return o0ooo00o;
        }
        return new o0OO0oO0(o0ooo00o, I1iIiIi, (Object) null);
    }

    public void IliiLiLliIl(C0347o0OO0oOo o0oo0ooo) {
        this.il1LilLllii = o0oo0ooo;
    }

    public abstract List<T> i111iLiiIIill();

    public final void i11liIIl11Ii1(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0347o0OO0oOo o0oo0ooo = this.il1LilLllii;
        try {
            for (Object il1lillllii : Ii1liIIIiLi()) {
                o0oo0ooo.iiI1L1iI(new il1LilLllii(il1lillllii, iii1l1ii));
            }
        } finally {
            o0oo0ooo.i1LIL11l();
        }
    }

    public final Comparator<? super T> i1L1lLllLLlIi(C0369o0OOOoo0 o0ooooo0) {
        return new iiIliillii(o0ooooo0);
    }

    public void i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0034Oooo0oo oooo0oo = new C0034Oooo0oo(iii1l1ii, iiI1L1iI());
        oooo0oo.iLLLILIiLi1Ii();
        try {
            IiiL1llIIi(iii1l1ii).iiI1L1iI();
        } catch (iLILliI1 e) {
            oooo0oo.iiI1L1iI(e);
        } catch (C0377o0OOo0OO e2) {
            throw e2;
        } catch (Throwable th) {
            oooo0oo.I11lLL1();
            throw th;
        }
        oooo0oo.I11lLL1();
    }

    public final boolean i1iI1iiLL1(o000O0O o000o0o, T t) {
        return o000o0o.iiIliillii(iL1LIlIlI(t));
    }

    public abstract void i1iiLIil1ILi(T t, org.junit.runner.notification.iiI1L1iI iii1l1ii);

    public List<C0429o0Oo0ooO> iILiI1lll() {
        iilLil1i11I1 iillil1i11i1 = new iilLil1i11I1((iiI1L1iI) null);
        Class<ClassRule> cls = ClassRule.class;
        Class<C0429o0Oo0ooO> cls2 = C0429o0Oo0ooO.class;
        this.i1LIL11l.iiIliillii((Object) null, cls, cls2, iillil1i11i1);
        this.i1LIL11l.il1LilLllii((Object) null, cls, cls2, iillil1i11i1);
        return iillil1i11i1.illlI1lLIL();
    }

    public abstract C0009OooO0oO iL1LIlIlI(T t);

    public final void iLLLILIiLi1Ii(List<Throwable> list) {
        if (iiLIIiIli().i1L1lLllLLlIi() != null) {
            for (C0419o0Oo0OoO iiI1L1iI2 : iiIliillii) {
                list.addAll(iiI1L1iI2.iiI1L1iI(iiLIIiIli()));
            }
        }
    }

    public C0009OooO0oO iiI1L1iI() {
        C0009OooO0oO oooO0oO;
        Class<?> i1L1lLllLLlIi = iiLIIiIli().i1L1lLllLLlIi();
        if (i1L1lLllLLlIi == null || !i1L1lLllLLlIi.getName().equals(IilL11ii1I1Il())) {
            oooO0oO = C0009OooO0oO.iilLil1i11I1(IilL11ii1I1Il(), I1l1iIll1lIi1());
        } else {
            oooO0oO = C0009OooO0oO.il1LilLllii(i1L1lLllLLlIi, I1l1iIll1lIi1());
        }
        for (Object iL1LIlIlI : Ii1liIIIiLi()) {
            oooO0oO.iiI1L1iI(iL1LIlIlI(iL1LIlIlI));
        }
        return oooO0oO;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|10|11|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iiIliillii(top.tntok.autobot.o000O0O r5) throws top.tntok.autobot.C0529o0oOOo {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.iiI1L1iI
            r0.lock()
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0026 }
            java.util.List r1 = r4.Ii1liIIIiLi()     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0012:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0026 }
            boolean r3 = r4.i1iI1iiLL1(r5, r2)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x002c
            r5.iiI1L1iI(r2)     // Catch:{ o0oOOo -> 0x0028 }
            goto L_0x0012
        L_0x0026:
            r5 = move-exception
            goto L_0x004a
        L_0x0028:
            r1.remove()     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x002c:
            r1.remove()     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x0030:
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0026 }
            r4.illlI1lLIL = r5     // Catch:{ all -> 0x0026 }
            java.util.List<T> r5 = r4.illlI1lLIL     // Catch:{ all -> 0x0026 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r5 != 0) goto L_0x0044
            java.util.concurrent.locks.Lock r5 = r4.iiI1L1iI
            r5.unlock()
            return
        L_0x0044:
            top.tntok.autobot.o0oOOo r5 = new top.tntok.autobot.o0oOOo     // Catch:{ all -> 0x0026 }
            r5.<init>()     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x004a:
            java.util.concurrent.locks.Lock r0 = r4.iiI1L1iI
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0270o00ooo0.iiIliillii(top.tntok.autobot.o000O0O):void");
    }

    public final C0418o0Oo0Oo0 iiLIIiIli() {
        return this.i1LIL11l;
    }

    public final void iiiiI1iILL11I(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO, org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0034Oooo0oo oooo0oo = new C0034Oooo0oo(iii1l1ii, oooO0oO);
        oooo0oo.iilLil1i11I1();
        try {
            o0ooo00o.iiI1L1iI();
        } catch (iLILliI1 e) {
            oooo0oo.iiI1L1iI(e);
        } catch (Throwable th) {
            oooo0oo.il1LilLllii();
            throw th;
        }
        oooo0oo.il1LilLllii();
    }

    public C0374o0OOo00o iilLiIIIi11i(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        return new i1LIL11l(iii1l1ii);
    }

    public void iilLil1i11I1(C0260o00ooO0O o00ooo0o) throws o00OO0OO {
        if (!I1I11Il1()) {
            this.iiI1L1iI.lock();
            try {
                List Ii1liIIIiLi = Ii1liIIIiLi();
                LinkedHashMap linkedHashMap = new LinkedHashMap(Ii1liIIIiLi.size());
                for (Object next : Ii1liIIIiLi) {
                    C0009OooO0oO iL1LIlIlI = iL1LIlIlI(next);
                    List list = (List) linkedHashMap.get(iL1LIlIlI);
                    if (list == null) {
                        list = new ArrayList(1);
                        linkedHashMap.put(iL1LIlIlI, list);
                    }
                    list.add(next);
                    o00ooo0o.iiI1L1iI(next);
                }
                List<C0009OooO0oO> i1LIL11l2 = o00ooo0o.i1LIL11l(linkedHashMap.keySet());
                ArrayList arrayList = new ArrayList(Ii1liIIIiLi.size());
                for (C0009OooO0oO oooO0oO : i1LIL11l2) {
                    arrayList.addAll((Collection) linkedHashMap.get(oooO0oO));
                }
                this.illlI1lLIL = Collections.unmodifiableList(arrayList);
                this.iiI1L1iI.unlock();
            } catch (Throwable th) {
                this.iiI1L1iI.unlock();
                throw th;
            }
        }
    }

    public void il1LilLllii(C0369o0OOOoo0 o0ooooo0) {
        if (!I1I11Il1()) {
            this.iiI1L1iI.lock();
            try {
                for (Object i1LIL11l2 : Ii1liIIIiLi()) {
                    o0ooooo0.i1LIL11l(i1LIL11l2);
                }
                ArrayList arrayList = new ArrayList(Ii1liIIIiLi());
                Collections.sort(arrayList, i1L1lLllLLlIi(o0ooooo0));
                this.illlI1lLIL = Collections.unmodifiableList(arrayList);
                this.iiI1L1iI.unlock();
            } catch (Throwable th) {
                this.iiI1L1iI.unlock();
                throw th;
            }
        }
    }

    public void il1l1IlL(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        for (C0436o0OoO0o iiLIIiIli : iiLIIiIli().I1iIiIi(cls)) {
            iiLIIiIli.iiLIIiIli(z, list);
        }
    }

    /* renamed from: top.tntok.autobot.o00ooo0$iilLil1i11I1 */
    public static class iilLil1i11I1 implements C0178o00OooO<C0429o0Oo0ooO> {
        public final List<C0344o0OO0o0O.i1LIL11l> iiI1L1iI;

        public iilLil1i11I1() {
            this.iiI1L1iI = new ArrayList();
        }

        /* renamed from: i1LIL11l */
        public void iiI1L1iI(o000OO00<?> o000oo00, C0429o0Oo0ooO o0oo0ooo) {
            Integer num;
            ClassRule classRule = (ClassRule) o000oo00.iiI1L1iI(ClassRule.class);
            List<C0344o0OO0o0O.i1LIL11l> list = this.iiI1L1iI;
            if (classRule != null) {
                num = Integer.valueOf(classRule.order());
            } else {
                num = null;
            }
            list.add(new C0344o0OO0o0O.i1LIL11l(o0oo0ooo, 1, num));
        }

        public List<C0429o0Oo0ooO> illlI1lLIL() {
            Collections.sort(this.iiI1L1iI, C0344o0OO0o0O.il1LilLllii);
            ArrayList arrayList = new ArrayList(this.iiI1L1iI.size());
            for (C0344o0OO0o0O.i1LIL11l i1lil11l : this.iiI1L1iI) {
                arrayList.add((C0429o0Oo0ooO) i1lil11l.iiI1L1iI);
            }
            return arrayList;
        }

        public /* synthetic */ iilLil1i11I1(iiI1L1iI iii1l1ii) {
            this();
        }
    }

    public C0270o00ooo0(C0418o0Oo0Oo0 o0oo0oo0) throws C0136o00O0oo {
        this.i1LIL11l = (C0418o0Oo0Oo0) i1liLLILiLil1.iiI1L1iI(o0oo0oo0);
        IIlL1llI1();
    }

    /* renamed from: top.tntok.autobot.o00ooo0$iiI1L1iI */
    public class iiI1L1iI implements C0347o0OO0oOo {
        public iiI1L1iI() {
        }

        public void iiI1L1iI(Runnable runnable) {
            runnable.run();
        }

        public void i1LIL11l() {
        }
    }
}
