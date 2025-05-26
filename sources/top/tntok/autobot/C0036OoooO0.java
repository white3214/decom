package top.tntok.autobot;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: top.tntok.autobot.OoooO0  reason: case insensitive filesystem */
public class C0036OoooO0 {
    public static String i1LIL11l(String str, String str2) throws Exception {
        if (C0391o0OOoOo0.iiI1L1iI(str) || C0391o0OOoOo0.iiI1L1iI(str2)) {
            return null;
        }
        Cipher instance = Cipher.getInstance(C0387o0OOoO0o.iiI1L1iI("ZFYQiK9S21d1WAD030H4HEF6LcA=\n", "JRNDp+oRmXg=\n"));
        instance.init(1, new SecretKeySpec(str2.getBytes(), C0387o0OOoO0o.iiI1L1iI("9Oc2\n", "taJlAWfweGg=\n")));
        return Ilili11iLIl.iiIliillii(instance.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static String iiI1L1iI(String str, String str2) throws Exception {
        if (C0391o0OOoOo0.iiI1L1iI(str) || C0391o0OOoOo0.iiI1L1iI(str2)) {
            return null;
        }
        byte[] illlI1lLIL = Ilili11iLIl.illlI1lLIL(str);
        Cipher instance = Cipher.getInstance(C0387o0OOoO0o.iiI1L1iI("ZxZxsJK4UIh2GGHM4qtzw0I6TPg=\n", "JlMin9f7Eqc=\n"));
        instance.init(2, new SecretKeySpec(str2.getBytes(), C0387o0OOoO0o.iiI1L1iI("GFT4\n", "WRGrtwbM+n4=\n")));
        return new String(instance.doFinal(illlI1lLIL));
    }

    public static void illlI1lLIL(String[] strArr) throws Exception {
    }
}
