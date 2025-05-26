package top.tntok.autobot;

import java.lang.Throwable;
import org.hamcrest.Factory;

/* renamed from: top.tntok.autobot.o0OoOO  reason: case insensitive filesystem */
public class C0440o0OoOO<T extends Throwable> extends C0460o0OoOoo0<T> {
    public final C0175o00Ooo00<String> il1LilLllii;

    public C0440o0OoOO(C0175o00Ooo00<String> o00ooo00) {
        this.il1LilLllii = o00ooo00;
    }

    @Factory
    public static <T extends Throwable> C0175o00Ooo00<T> iLLLILIiLi1Ii(C0175o00Ooo00<String> o00ooo00) {
        return new C0440o0OoOO(o00ooo00);
    }

    /* renamed from: I11lLL1 */
    public void iiIliillii(T t, OooO0o oooO0o) {
        oooO0o.iiIliillii("message ");
        this.il1LilLllii.il1LilLllii(t.getMessage(), oooO0o);
    }

    /* renamed from: IiIIlIL */
    public boolean iilLil1i11I1(T t) {
        return this.il1LilLllii.i1LIL11l(t.getMessage());
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("exception with message ");
        oooO0o.i1LIL11l(this.il1LilLllii);
    }
}
