package top.tntok.autobot;

import java.lang.Throwable;
import org.hamcrest.Factory;

/* renamed from: top.tntok.autobot.o0OoOO0o  reason: case insensitive filesystem */
public class C0442o0OoOO0o<T extends Throwable> extends C0460o0OoOoo0<T> {
    public final C0175o00Ooo00<?> il1LilLllii;

    public C0442o0OoOO0o(C0175o00Ooo00<?> o00ooo00) {
        this.il1LilLllii = o00ooo00;
    }

    @Factory
    public static <T extends Throwable> C0175o00Ooo00<T> iLLLILIiLi1Ii(C0175o00Ooo00<?> o00ooo00) {
        return new C0442o0OoOO0o(o00ooo00);
    }

    /* renamed from: I11lLL1 */
    public void iiIliillii(T t, OooO0o oooO0o) {
        oooO0o.iiIliillii("cause ");
        this.il1LilLllii.il1LilLllii(t.getCause(), oooO0o);
    }

    /* renamed from: IiIIlIL */
    public boolean iilLil1i11I1(T t) {
        return this.il1LilLllii.i1LIL11l(t.getCause());
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("exception with cause ");
        oooO0o.i1LIL11l(this.il1LilLllii);
    }
}
