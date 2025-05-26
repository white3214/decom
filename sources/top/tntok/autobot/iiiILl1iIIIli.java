package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.runner.notification.iiI1L1iI;

@Deprecated
public class iiiILl1iIIIli {
    public C0417o0Oo0Oo i1LIL11l;
    public iiI1L1iI iiI1L1iI;
    public final Runnable il1LilLllii;
    public C0009OooO0oO illlI1lLIL;

    public iiiILl1iIIIli(iiI1L1iI iii1l1ii, C0417o0Oo0Oo o0oo0oo, C0009OooO0oO oooO0oO, Runnable runnable) {
        this.iiI1L1iI = iii1l1ii;
        this.i1LIL11l = o0oo0oo;
        this.illlI1lLIL = oooO0oO;
        this.il1LilLllii = runnable;
    }

    public final void i1LIL11l() {
        for (Method invoke : this.i1LIL11l.iiI1L1iI()) {
            try {
                invoke.invoke((Object) null, (Object[]) null);
            } catch (InvocationTargetException e) {
                iiI1L1iI(e.getTargetException());
            } catch (Throwable th) {
                iiI1L1iI(th);
            }
        }
    }

    public void iiI1L1iI(Throwable th) {
        this.iiI1L1iI.iilLil1i11I1(new o00O0O(this.illlI1lLIL, th));
    }

    public void iiIliillii() {
        this.il1LilLllii.run();
    }

    public void il1LilLllii() {
        try {
            illlI1lLIL();
            iiIliillii();
        } catch (C0548ooOO unused) {
        } catch (Throwable th) {
            i1LIL11l();
            throw th;
        }
        i1LIL11l();
    }

    public final void illlI1lLIL() throws C0548ooOO {
        try {
            for (Method invoke : this.i1LIL11l.illlI1lLIL()) {
                invoke.invoke((Object) null, (Object[]) null);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (iLILliI1 unused) {
            throw new C0548ooOO();
        } catch (Throwable th) {
            iiI1L1iI(th);
            throw new C0548ooOO();
        }
    }
}
