package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00Ooo0  reason: case insensitive filesystem */
public class C0174o00Ooo0 {
    public static <T> void i1LIL11l(String str, T t, C0175o00Ooo00<? super T> o00ooo00) {
        if (!o00ooo00.i1LIL11l(t)) {
            C0384o0OOoO0 o0oooo0 = new C0384o0OOoO0();
            o0oooo0.iiIliillii(str).iiIliillii("\nExpected: ").i1LIL11l(o00ooo00).iiIliillii("\n     but: ");
            o00ooo00.il1LilLllii(t, o0oooo0);
            throw new AssertionError(o0oooo0.toString());
        }
    }

    public static <T> void iiI1L1iI(T t, C0175o00Ooo00<? super T> o00ooo00) {
        i1LIL11l("", t, o00ooo00);
    }

    public static void illlI1lLIL(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
