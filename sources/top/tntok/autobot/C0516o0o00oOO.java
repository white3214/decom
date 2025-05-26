package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0o00oOO  reason: case insensitive filesystem */
public class C0516o0o00oOO extends IOException {
    private static final long serialVersionUID = 1;
    private final String bomEncoding;
    private final String contentTypeEncoding;
    private final String contentTypeMime;
    private final String xmlEncoding;
    private final String xmlGuessEncoding;

    public C0516o0o00oOO(String str, String str2, String str3, String str4) {
        this(str, (String) null, (String) null, str2, str3, str4);
    }

    public String i1LIL11l() {
        return this.contentTypeEncoding;
    }

    public String iiI1L1iI() {
        return this.bomEncoding;
    }

    public String iiIliillii() {
        return this.xmlGuessEncoding;
    }

    public String il1LilLllii() {
        return this.xmlEncoding;
    }

    public String illlI1lLIL() {
        return this.contentTypeMime;
    }

    public C0516o0o00oOO(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.contentTypeMime = str2;
        this.contentTypeEncoding = str3;
        this.bomEncoding = str4;
        this.xmlGuessEncoding = str5;
        this.xmlEncoding = str6;
    }
}
