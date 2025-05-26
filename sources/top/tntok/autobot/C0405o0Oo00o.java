package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: top.tntok.autobot.o0Oo00o  reason: case insensitive filesystem */
public class C0405o0Oo00o extends oo0OOoo {
    public final Serializable i1LIL11l = UUID.randomUUID();

    public C0405o0Oo00o(InputStream inputStream) {
        super(inputStream);
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
