package top.tntok.autobot;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: top.tntok.autobot.o0Oo00oo  reason: case insensitive filesystem */
public class C0408o0Oo00oo extends C0305o0O0Ooo0 {
    public final Serializable i1LIL11l = UUID.randomUUID();

    public C0408o0Oo00oo(Reader reader) {
        super(reader);
    }

    public void IiIl11II(Throwable th) throws IOException {
        C0406o0Oo00o0.il1LilLllii(th, this.i1LIL11l);
    }

    public boolean i111iLiiIIill(Throwable th) {
        return C0406o0Oo00o0.illlI1lLIL(th, this.i1LIL11l);
    }

    public void il1LilLllii(IOException iOException) throws IOException {
        throw new C0406o0Oo00o0(iOException, this.i1LIL11l);
    }
}
