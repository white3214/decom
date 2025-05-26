package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0ooOOo  reason: case insensitive filesystem */
public abstract class C0542o0ooOOo<T, U> extends C0450o0OoOo<T> {
    public static final C0547oo0oOOo I11lLL1 = new C0547oo0oOOo("featureValueOf", 1, 0);
    public final String iiIliillii;
    public final String iilLil1i11I1;
    public final C0175o00Ooo00<? super U> il1LilLllii;

    public C0542o0ooOOo(C0175o00Ooo00<? super U> o00ooo00, String str, String str2) {
        super(I11lLL1);
        this.il1LilLllii = o00ooo00;
        this.iiIliillii = str;
        this.iilLil1i11I1 = str2;
    }

    public boolean iiIliillii(T t, OooO0o oooO0o) {
        Object iilLil1i11I12 = iilLil1i11I1(t);
        if (this.il1LilLllii.i1LIL11l(iilLil1i11I12)) {
            return true;
        }
        oooO0o.iiIliillii(this.iilLil1i11I1).iiIliillii(" ");
        this.il1LilLllii.il1LilLllii(iilLil1i11I12, oooO0o);
        return false;
    }

    public abstract U iilLil1i11I1(T t);

    public final void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii(this.iiIliillii).iiIliillii(" ").i1LIL11l(this.il1LilLllii);
    }
}
