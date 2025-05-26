package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0O0Oo  reason: case insensitive filesystem */
public enum C0297o0O0Oo {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    /* access modifiers changed from: public */
    C0297o0O0Oo(String str) {
        this.protocol = str;
    }

    public static C0297o0O0Oo iiI1L1iI(String str) throws IOException {
        C0297o0O0Oo o0o0oo = HTTP_1_0;
        if (str.equals(o0o0oo.protocol)) {
            return o0o0oo;
        }
        C0297o0O0Oo o0o0oo2 = HTTP_1_1;
        if (str.equals(o0o0oo2.protocol)) {
            return o0o0oo2;
        }
        C0297o0O0Oo o0o0oo3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(o0o0oo3.protocol)) {
            return o0o0oo3;
        }
        C0297o0O0Oo o0o0oo4 = HTTP_2;
        if (str.equals(o0o0oo4.protocol)) {
            return o0o0oo4;
        }
        C0297o0O0Oo o0o0oo5 = SPDY_3;
        if (str.equals(o0o0oo5.protocol)) {
            return o0o0oo5;
        }
        C0297o0O0Oo o0o0oo6 = QUIC;
        if (str.equals(o0o0oo6.protocol)) {
            return o0o0oo6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.protocol;
    }
}
