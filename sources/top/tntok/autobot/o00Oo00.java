package top.tntok.autobot;

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class o00Oo00 extends o0000OO0 {
    public static final String IL1lILLLL1L = "POST";

    public o00Oo00() {
    }

    public static final boolean I1IIIi1i1ILl(HttpServletRequest httpServletRequest) {
        if (!IL1lILLLL1L.equalsIgnoreCase(httpServletRequest.getMethod())) {
            return false;
        }
        return C0060o0000OOo.Ii1liIIIiLi(new C0153o00Oo00o(httpServletRequest));
    }

    public List<o00000O0> IIIlll1lll(HttpServletRequest httpServletRequest) throws C0062o0000Oo0 {
        return iiiiI1iILL11I(new C0153o00Oo00o(httpServletRequest));
    }

    public Map<String, List<o00000O0>> IilliIIIlI1ll(HttpServletRequest httpServletRequest) throws C0062o0000Oo0 {
        return i11liIIl11Ii1(new C0153o00Oo00o(httpServletRequest));
    }

    public C0058o00000oO il1l1IlL(HttpServletRequest httpServletRequest) throws C0062o0000Oo0, IOException {
        return super.i1L1lLllLLlIi(new C0153o00Oo00o(httpServletRequest));
    }

    public o00Oo00(o00000O o00000o) {
        super(o00000o);
    }
}
