package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoO00  reason: case insensitive filesystem */
public class C0385o0OOoO00 extends C0393o0OOoo0 {
    public C0385o0OOoO00(boolean z, String str) {
        super("containing", z, str);
    }

    public static C0175o00Ooo00<String> IiiL1llIIi(String str) {
        return new C0385o0OOoO00(false, str);
    }

    public static C0175o00Ooo00<String> iILiI1lll(String str) {
        return new C0385o0OOoO00(true, str);
    }

    public boolean IiIIlIL(String str) {
        return I11lLL1(str).contains(I11lLL1(this.iilLil1i11I1));
    }
}
