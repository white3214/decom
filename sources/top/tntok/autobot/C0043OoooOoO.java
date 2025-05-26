package top.tntok.autobot;

/* renamed from: top.tntok.autobot.OoooOoO  reason: case insensitive filesystem */
public class C0043OoooOoO<T> extends C0450o0OoOo<Iterable<? extends T>> {
    public final C0175o00Ooo00<? super T> il1LilLllii;

    public C0043OoooOoO(C0175o00Ooo00<? super T> o00ooo00) {
        this.il1LilLllii = o00ooo00;
    }

    public static <U> C0175o00Ooo00<Iterable<? extends U>> iilLil1i11I1(C0175o00Ooo00<U> o00ooo00) {
        return new C0043OoooOoO(o00ooo00);
    }

    /* renamed from: I11lLL1 */
    public boolean iiIliillii(Iterable<? extends T> iterable, OooO0o oooO0o) {
        for (Object next : iterable) {
            if (!this.il1LilLllii.i1LIL11l(next)) {
                oooO0o.iiIliillii("an item ");
                this.il1LilLllii.il1LilLllii(next, oooO0o);
                return false;
            }
        }
        return true;
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("every item is ").i1LIL11l(this.il1LilLllii);
    }
}
