package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoO0O  reason: case insensitive filesystem */
public class C0386o0OOoO0O extends C0393o0OOoo0 {
    public C0386o0OOoO0O(boolean z, String str) {
        super("ending with", z, str);
    }

    public static C0175o00Ooo00<String> IiiL1llIIi(String str) {
        return new C0386o0OOoO0O(false, str);
    }

    public static C0175o00Ooo00<String> iILiI1lll(String str) {
        return new C0386o0OOoO0O(true, str);
    }

    public boolean IiIIlIL(String str) {
        return I11lLL1(str).endsWith(I11lLL1(this.iilLil1i11I1));
    }
}
