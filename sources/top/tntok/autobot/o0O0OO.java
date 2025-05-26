package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import javax.portlet.ActionRequest;

public class o0O0OO implements C0481o0OoooO {
    public final ActionRequest iiI1L1iI;

    public o0O0OO(ActionRequest actionRequest) {
        this.iiI1L1iI = actionRequest;
    }

    public String i1LIL11l() {
        return this.iiI1L1iI.getContentType();
    }

    public long iiI1L1iI() {
        try {
            return Long.parseLong(this.iiI1L1iI.getProperty(C0060o0000OOo.I11lLL1));
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
        return this.iiI1L1iI.getPortletInputStream();
    }

    public String toString() {
        return String.format("ContentLength=%s, ContentType=%s", new Object[]{Long.valueOf(iiI1L1iI()), i1LIL11l()});
    }
}
