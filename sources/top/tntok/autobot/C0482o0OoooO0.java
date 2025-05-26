package top.tntok.autobot;

@Deprecated
/* renamed from: top.tntok.autobot.o0OoooO0  reason: case insensitive filesystem */
public class C0482o0OoooO0 extends C0470o0Ooo0Oo {
    public C0482o0OoooO0(C0473o0Ooo0oO o0ooo0oo) {
        super(o0ooo0oo);
    }

    public C0470o0Ooo0Oo IiIl11II(C0473o0Ooo0oO o0ooo0oo, int i) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, Integer.valueOf(i));
        return new C0470o0Ooo0Oo(C0473o0Ooo0oO.IIi1l1i(iiLIIiIli(), C0473o0Ooo0oO.illi1LIILLiL(o0ooo0oo).IL1IiilLlLI(i)));
    }

    public int Iiiiii1l1I1L1(C0473o0Ooo0oO o0ooo0oo) {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo);
        return IilL11ii1I1Il().i111iLiiIIill(C0473o0Ooo0oO.IIi1l1i(iiLIIiIli(), C0473o0Ooo0oO.illi1LIILLiL(o0ooo0oo)));
    }

    public C0470o0Ooo0Oo IillLillLLIii(C0473o0Ooo0oO o0ooo0oo, String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str);
        if (str != null) {
            int Iiiiii1l1I1L1 = Iiiiii1l1I1L1(o0ooo0oo);
            for (int i = 0; i < Iiiiii1l1I1L1; i++) {
                C0470o0Ooo0Oo IiIl11II = IiIl11II(o0ooo0oo, i);
                if (str.equals(IiIl11II.ILl1iII11Ll1()) || IiIl11II.iILiI1lll(new C0473o0Ooo0oO().Il1llillili(str)).IiIIlIL()) {
                    return IiIl11II;
                }
            }
        }
        throw new C0472o0Ooo0o0("for text= \"" + str + "\"");
    }

    public C0470o0Ooo0Oo Il1llillili(C0473o0Ooo0oO o0ooo0oo, String str) throws C0472o0Ooo0o0 {
        C0447o0OoOOo.IiiL1llIIi(o0ooo0oo, str);
        if (str != null) {
            int Iiiiii1l1I1L1 = Iiiiii1l1I1L1(o0ooo0oo);
            for (int i = 0; i < Iiiiii1l1I1L1; i++) {
                C0470o0Ooo0Oo IiIl11II = IiIl11II(o0ooo0oo, i);
                String IL1lILLLL1L = IiIl11II.IL1lILLLL1L();
                if ((IL1lILLLL1L != null && IL1lILLLL1L.contains(str)) || IiIl11II.iILiI1lll(new C0473o0Ooo0oO().iILiI1lll(str)).IiIIlIL()) {
                    return IiIl11II;
                }
            }
        }
        throw new C0472o0Ooo0o0("for description= \"" + str + "\"");
    }
}
