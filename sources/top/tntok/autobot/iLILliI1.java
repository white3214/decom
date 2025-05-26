package top.tntok.autobot;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class iLILliI1 extends RuntimeException implements o0OOO0O0 {
    private static final long serialVersionUID = 2;
    private final String fAssumption;
    private final C0175o00Ooo00<?> fMatcher;
    private final Object fValue;
    private final boolean fValueMatcher;

    @Deprecated
    public iLILliI1(String str, boolean z, Object obj, C0175o00Ooo00<?> o00ooo00) {
        this.fAssumption = str;
        this.fValue = obj;
        this.fMatcher = o00ooo00;
        this.fValueMatcher = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("fAssumption", this.fAssumption);
        putFields.put("fValueMatcher", this.fValueMatcher);
        putFields.put("fMatcher", C0353o0OOO0o0.iiIliillii(this.fMatcher));
        putFields.put("fValue", C0354o0OOO0oO.iiI1L1iI(this.fValue));
        objectOutputStream.writeFields();
    }

    public String getMessage() {
        return C0384o0OOoO0.i1L1lLllLLlIi(this);
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        String str = this.fAssumption;
        if (str != null) {
            oooO0o.iiIliillii(str);
        }
        if (this.fValueMatcher) {
            if (this.fAssumption != null) {
                oooO0o.iiIliillii(": ");
            }
            oooO0o.iiIliillii("got: ");
            oooO0o.iiI1L1iI(this.fValue);
            if (this.fMatcher != null) {
                oooO0o.iiIliillii(", expected: ");
                oooO0o.i1LIL11l(this.fMatcher);
            }
        }
    }

    @Deprecated
    public iLILliI1(Object obj, C0175o00Ooo00<?> o00ooo00) {
        this((String) null, true, obj, o00ooo00);
    }

    @Deprecated
    public iLILliI1(String str, Object obj, C0175o00Ooo00<?> o00ooo00) {
        this(str, true, obj, o00ooo00);
    }

    @Deprecated
    public iLILliI1(String str) {
        this(str, false, (Object) null, (C0175o00Ooo00<?>) null);
    }

    @Deprecated
    public iLILliI1(String str, Throwable th) {
        this(str, false, (Object) null, (C0175o00Ooo00<?>) null);
        initCause(th);
    }
}
