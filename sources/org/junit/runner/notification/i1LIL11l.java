package org.junit.runner.notification;

import org.junit.runner.notification.RunListener;
import top.tntok.autobot.C0009OooO0oO;
import top.tntok.autobot.o00O0O;
import top.tntok.autobot.o0OO000;

@RunListener.ThreadSafe
public final class i1LIL11l extends RunListener {
    public final Object i1LIL11l;
    public final RunListener iiI1L1iI;

    public i1LIL11l(RunListener runListener, Object obj) {
        this.iiI1L1iI = runListener;
        this.i1LIL11l = obj;
    }

    public void I11lLL1(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.I11lLL1(oooO0oO);
        }
    }

    public void IiIIlIL(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.IiIIlIL(oooO0oO);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1LIL11l)) {
            return false;
        }
        return this.iiI1L1iI.equals(((i1LIL11l) obj).iiI1L1iI);
    }

    public int hashCode() {
        return this.iiI1L1iI.hashCode();
    }

    public void i1LIL11l(o00O0O o00o0o) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.i1LIL11l(o00o0o);
        }
    }

    public void iLLLILIiLi1Ii(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.iLLLILIiLi1Ii(oooO0oO);
        }
    }

    public void iiI1L1iI(o00O0O o00o0o) {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.iiI1L1iI(o00o0o);
        }
    }

    public void iiIliillii(o0OO000 o0oo000) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.iiIliillii(o0oo000);
        }
    }

    public void iilLil1i11I1(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.iilLil1i11I1(oooO0oO);
        }
    }

    public void il1LilLllii(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.il1LilLllii(oooO0oO);
        }
    }

    public void illlI1lLIL(C0009OooO0oO oooO0oO) throws Exception {
        synchronized (this.i1LIL11l) {
            this.iiI1L1iI.illlI1lLIL(oooO0oO);
        }
    }

    public String toString() {
        return this.iiI1L1iI.toString() + " (with synchronization wrapper)";
    }
}
