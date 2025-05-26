package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OooO0  reason: case insensitive filesystem */
public class C0475o0OooO0 {
    public o0OO000 iiI1L1iI;

    public C0475o0OooO0(List<o00O0O> list) {
        this(new C0151o00Oo0(list).iiI1L1iI());
    }

    public static C0475o0OooO0 il1LilLllii(C0328o0O0oo o0o0oo) {
        return new C0475o0OooO0(new C0148o00OOooO().I11lLL1(o0o0oo));
    }

    public static C0475o0OooO0 illlI1lLIL(Class<?> cls) {
        return il1LilLllii(C0328o0O0oo.iiI1L1iI(cls));
    }

    public List<o00O0O> i1LIL11l() {
        return this.iiI1L1iI.iilLiIIIi11i();
    }

    public int iiI1L1iI() {
        return this.iiI1L1iI.iilLiIIIi11i().size();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C0437o0OoO0o0(new PrintStream(byteArrayOutputStream)).iiIliillii(this.iiI1L1iI);
        return byteArrayOutputStream.toString();
    }

    public C0475o0OooO0(o0OO000 o0oo000) {
        this.iiI1L1iI = o0oo000;
    }
}
