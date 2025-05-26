package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: top.tntok.autobot.o000oOoO  reason: case insensitive filesystem */
public class C0105o000oOoO extends C0489o0o000 {
    public List<Throwable> iiI1L1iI = new ArrayList();

    /* renamed from: top.tntok.autobot.o000oOoO$iiI1L1iI */
    public class iiI1L1iI implements Callable<Object> {
        public final /* synthetic */ Object i1LIL11l;
        public final /* synthetic */ String iiI1L1iI;
        public final /* synthetic */ C0175o00Ooo00 illlI1lLIL;

        public iiI1L1iI(String str, Object obj, C0175o00Ooo00 o00ooo00) {
            this.iiI1L1iI = str;
            this.i1LIL11l = obj;
            this.illlI1lLIL = o00ooo00;
        }

        public Object call() throws Exception {
            Il1llillili.IiIl11II(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL);
            return this.i1LIL11l;
        }
    }

    public void I11lLL1(Class<? extends Throwable> cls, C0444o0OoOOO0 o0ooooo0) {
        try {
            Il1llillili.IillLillLLIii(cls, o0ooooo0);
        } catch (AssertionError e) {
            illlI1lLIL(e);
        }
    }

    public void i1LIL11l() throws Throwable {
        C0191o00o00O0.iiI1L1iI(this.iiI1L1iI);
    }

    public <T> void iiIliillii(T t, C0175o00Ooo00<T> o00ooo00) {
        iilLil1i11I1("", t, o00ooo00);
    }

    public <T> void iilLil1i11I1(String str, T t, C0175o00Ooo00<T> o00ooo00) {
        il1LilLllii(new iiI1L1iI(str, t, o00ooo00));
    }

    public <T> T il1LilLllii(Callable<T> callable) {
        try {
            return callable.call();
        } catch (iLILliI1 e) {
            AssertionError assertionError = new AssertionError("Callable threw AssumptionViolatedException");
            assertionError.initCause(e);
            illlI1lLIL(assertionError);
            return null;
        } catch (Throwable th) {
            illlI1lLIL(th);
            return null;
        }
    }

    public void illlI1lLIL(Throwable th) {
        if (th != null) {
            this.iiI1L1iI.add(th);
            return;
        }
        throw new NullPointerException("Error cannot be null");
    }
}
