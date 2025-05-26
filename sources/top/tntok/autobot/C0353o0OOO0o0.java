package top.tntok.autobot;

import java.io.Serializable;

/* renamed from: top.tntok.autobot.o0OOO0o0  reason: case insensitive filesystem */
public class C0353o0OOO0o0<T> extends IlLLlIi1iI1li<T> implements Serializable {
    private final String matcherDescription;

    public C0353o0OOO0o0(C0175o00Ooo00<T> o00ooo00) {
        this.matcherDescription = C0384o0OOoO0.i1L1lLllLLlIi(o00ooo00);
    }

    public static <T> C0175o00Ooo00<T> iiIliillii(C0175o00Ooo00<T> o00ooo00) {
        if (o00ooo00 == null || (o00ooo00 instanceof Serializable)) {
            return o00ooo00;
        }
        return new C0353o0OOO0o0(o00ooo00);
    }

    public boolean i1LIL11l(Object obj) {
        throw new UnsupportedOperationException("This Matcher implementation only captures the description");
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii(this.matcherDescription);
    }
}
