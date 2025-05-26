package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoOOO  reason: case insensitive filesystem */
public class C0389o0OOoOOO extends C0393o0OOoo0 {
    public C0389o0OOoOOO(boolean z, String str) {
        super("starting with", z, str);
    }

    public static C0175o00Ooo00<String> IiiL1llIIi(String str) {
        return new C0389o0OOoOOO(false, str);
    }

    public static C0175o00Ooo00<String> iILiI1lll(String str) {
        return new C0389o0OOoOOO(true, str);
    }

    public boolean IiIIlIL(String str) {
        return I11lLL1(str).startsWith(I11lLL1(this.iilLil1i11I1));
    }
}
