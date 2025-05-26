package top.tntok.autobot;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.o0Oo00o0  reason: case insensitive filesystem */
public class C0406o0Oo00o0 extends C0119o00O00Oo {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public C0406o0Oo00o0(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public static void il1LilLllii(Throwable th, Object obj) throws IOException {
        if (illlI1lLIL(th, obj)) {
            throw ((C0406o0Oo00o0) th).getCause();
        }
    }

    public static boolean illlI1lLIL(Throwable th, Object obj) {
        if (obj == null || !(th instanceof C0406o0Oo00o0) || !obj.equals(((C0406o0Oo00o0) th).tag)) {
            return false;
        }
        return true;
    }

    public Serializable i1LIL11l() {
        return this.tag;
    }

    /* renamed from: iiI1L1iI */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
