package top.tntok.autobot;

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o00Oo00o  reason: case insensitive filesystem */
public class C0153o00Oo00o implements C0481o0OoooO {
    public final HttpServletRequest iiI1L1iI;

    public C0153o00Oo00o(HttpServletRequest httpServletRequest) {
        this.iiI1L1iI = httpServletRequest;
    }

    public String i1LIL11l() {
        return this.iiI1L1iI.getContentType();
    }

    public long iiI1L1iI() {
        try {
            return Long.parseLong(this.iiI1L1iI.getHeader(C0060o0000OOo.I11lLL1));
        } catch (NumberFormatException unused) {
            return (long) this.iiI1L1iI.getContentLength();
        }
    }

    @Deprecated
    public int iiIliillii() {
        return this.iiI1L1iI.getContentLength();
    }

    public String il1LilLllii() {
        return this.iiI1L1iI.getCharacterEncoding();
    }

    public InputStream illlI1lLIL() throws IOException {
        return this.iiI1L1iI.getInputStream();
    }

    public String toString() {
        return String.format("ContentLength=%s, ContentType=%s", new Object[]{Long.valueOf(iiI1L1iI()), i1LIL11l()});
    }
}
