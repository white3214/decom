package top.tntok.autobot;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: top.tntok.autobot.o0Oo00oO  reason: case insensitive filesystem */
public class C0407o0Oo00oO extends C0303o0O0OoOo {
    public final Serializable i1LIL11l = UUID.randomUUID();

    public C0407o0Oo00oO(OutputStream outputStream) {
        super(outputStream);
    }

    public void IiIl11II(Exception exc) throws IOException {
        C0406o0Oo00o0.il1LilLllii(exc, this.i1LIL11l);
    }

    public boolean i111iLiiIIill(Exception exc) {
        return C0406o0Oo00o0.illlI1lLIL(exc, this.i1LIL11l);
    }

    public void il1LilLllii(IOException iOException) throws IOException {
        throw new C0406o0Oo00o0(iOException, this.i1LIL11l);
    }
}
