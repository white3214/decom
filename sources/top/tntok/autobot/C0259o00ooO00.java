package top.tntok.autobot;

import java.util.Collections;
import java.util.List;
import org.junit.FixMethodOrder;

/* renamed from: top.tntok.autobot.o00ooO00  reason: case insensitive filesystem */
public final class C0259o00ooO00 extends i1iLlIill1I {
    public List<Exception> iiI1L1iI(C0418o0Oo0Oo0 o0oo0oo0) {
        if (o0oo0oo0.iiI1L1iI(FixMethodOrder.class) != null) {
            return Collections.singletonList(new Exception("@FixMethodOrder cannot be combined with @OrderWith"));
        }
        return Collections.emptyList();
    }
}
