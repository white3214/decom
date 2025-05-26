package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* renamed from: top.tntok.autobot.o0Oo0oo0  reason: case insensitive filesystem */
public class C0428o0Oo0oo0 {
    public List<C0422o0Oo0o0O> i1LIL11l = new ArrayList();
    public List<C0422o0Oo0o0O> iiI1L1iI = new ArrayList();
    public boolean iiIliillii = false;
    public int il1LilLllii = 0;
    public List<C0423o0Oo0o0o> illlI1lLIL = new ArrayList();

    /* renamed from: top.tntok.autobot.o0Oo0oo0$iiI1L1iI */
    public class iiI1L1iI implements C0300o0O0Oo0o {
        public final /* synthetic */ C0534o0oOoo00 iiI1L1iI;

        public iiI1L1iI(C0534o0oOoo00 o0oooo00) {
            this.iiI1L1iI = o0oooo00;
        }

        public void iiI1L1iI() throws Throwable {
            this.iiI1L1iI.IIllllLiIlIl();
        }
    }

    public synchronized Enumeration<C0422o0Oo0o0O> I11lLL1() {
        return Collections.enumeration(this.i1LIL11l);
    }

    public void I1iIiIi(C0532o0oOo0o0 o0ooo0o0, C0300o0O0Oo0o o0o0oo0o) {
        try {
            o0o0oo0o.iiI1L1iI();
        } catch (IillLillLLIii e) {
            i1LIL11l(o0ooo0o0, e);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable th) {
            iiI1L1iI(o0ooo0o0, th);
        }
    }

    public void IL1lILLLL1L(C0532o0oOo0o0 o0ooo0o0) {
        int illlI1lLIL2 = o0ooo0o0.illlI1lLIL();
        synchronized (this) {
            this.il1LilLllii += illlI1lLIL2;
        }
        for (C0423o0Oo0o0o iiIliillii2 : il1LilLllii()) {
            iiIliillii2.iiIliillii(o0ooo0o0);
        }
    }

    public synchronized Enumeration<C0422o0Oo0o0O> IiIIlIL() {
        return Collections.enumeration(this.iiI1L1iI);
    }

    public void IiiL1llIIi(C0534o0oOoo00 o0oooo00) {
        IL1lILLLL1L(o0oooo00);
        I1iIiIi(o0oooo00, new iiI1L1iI(o0oooo00));
        iiIliillii(o0oooo00);
    }

    public synchronized boolean i111iLiiIIill() {
        boolean z;
        if (iLLLILIiLi1Ii() == 0 && iilLil1i11I1() == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean i1L1lLllLLlIi() {
        return this.iiIliillii;
    }

    public synchronized void i1LIL11l(C0532o0oOo0o0 o0ooo0o0, IillLillLLIii iillLillLLIii) {
        this.iiI1L1iI.add(new C0422o0Oo0o0O(o0ooo0o0, iillLillLLIii));
        for (C0423o0Oo0o0o iiI1L1iI2 : il1LilLllii()) {
            iiI1L1iI2.iiI1L1iI(o0ooo0o0, iillLillLLIii);
        }
    }

    public synchronized int iILiI1lll() {
        return this.il1LilLllii;
    }

    public synchronized void iL1LIlIlI() {
        this.iiIliillii = true;
    }

    public synchronized int iLLLILIiLi1Ii() {
        return this.iiI1L1iI.size();
    }

    public synchronized void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
        this.i1LIL11l.add(new C0422o0Oo0o0O(o0ooo0o0, th));
        for (C0423o0Oo0o0o i1LIL11l2 : il1LilLllii()) {
            i1LIL11l2.i1LIL11l(o0ooo0o0, th);
        }
    }

    public void iiIliillii(C0532o0oOo0o0 o0ooo0o0) {
        for (C0423o0Oo0o0o iilLil1i11I1 : il1LilLllii()) {
            iilLil1i11I1.iilLil1i11I1(o0ooo0o0);
        }
    }

    public synchronized void iilLiIIIi11i(C0423o0Oo0o0o o0oo0o0o) {
        this.illlI1lLIL.remove(o0oo0o0o);
    }

    public synchronized int iilLil1i11I1() {
        return this.i1LIL11l.size();
    }

    public final synchronized List<C0423o0Oo0o0o> il1LilLllii() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.illlI1lLIL);
        return arrayList;
    }

    public synchronized void illlI1lLIL(C0423o0Oo0o0o o0oo0o0o) {
        this.illlI1lLIL.add(o0oo0o0o);
    }
}
