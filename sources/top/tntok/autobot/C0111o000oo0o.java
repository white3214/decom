package top.tntok.autobot;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import top.tntok.autobot.C0240o00oOoOO;
import top.tntok.autobot.C0333o0O0ooO0;

/* renamed from: top.tntok.autobot.o000oo0o  reason: case insensitive filesystem */
public class C0111o000oo0o {
    public static C0240o00oOoOO iiI1L1iI;

    /* renamed from: top.tntok.autobot.o000oo0o$i1LIL11l */
    public interface i1LIL11l {
        void i1LIL11l(int i, String str);

        void iiI1L1iI(String str);
    }

    /* renamed from: top.tntok.autobot.o000oo0o$iiI1L1iI */
    public class iiI1L1iI implements i1LIL11l {
        public void i1LIL11l(int i, String str) {
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("mlwoIA==\n", "/y5aGsTTFBU=\n") + i + C0387o0OOoO0o.iiI1L1iI("tacF\n", "mIoo7A3kc1I=\n") + str);
        }

        public void iiI1L1iI(String str) {
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("yTX2iZpg4A==\n", "L6BGbxfO2nM=\n") + str);
        }
    }

    static {
        C0240o00oOoOO.i1LIL11l i1lil11l = new C0240o00oOoOO.i1LIL11l();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        iiI1L1iI = i1lil11l.IiIIlIL(10, timeUnit).IIlL1llI1(30, timeUnit).IL1IiilLlLI(30, timeUnit).il1LilLllii();
    }

    public static long I11lLL1(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        iLLLILIiLi1Ii(str, new iiI1L1iI());
        return System.currentTimeMillis() - currentTimeMillis;
    }

    public static void IL1lILLLL1L(String str, String str2, i1LIL11l i1lil11l) {
        iL1LIlIlI(str, str2, i1lil11l);
    }

    public static void IiIIlIL(i1LIL11l i1lil11l, String str) {
        i1lil11l.i1LIL11l(-1, str);
    }

    public static void i1L1lLllLLlIi(String str, String str2, i1LIL11l i1lil11l) {
        illlI1lLIL(new C0108o000oo0(str, str2, i1lil11l));
    }

    public static void iL1LIlIlI(String str, String str2, i1LIL11l i1lil11l) {
        String str3;
        String str4;
        if (str2 != null) {
            str3 = "Id9SXA==\n";
            str4 = "cZABCAyuEWI=\n";
        } else {
            str3 = "B4Ku\n";
            str4 = "QMf6Z20JjV8=\n";
        }
        try {
            C0337o0O0oooO il1LilLllii = iiI1L1iI.iiIliillii(new C0333o0O0ooO0.iiI1L1iI().iilLiIIIi11i(C0387o0OOoO0o.iiI1L1iI(str3, str4), iilLil1i11I1(str2)).i111iLiiIIill(str).i1LIL11l()).il1LilLllii();
            iilLiIIIi11i(il1LilLllii.IiIl11II(), il1LilLllii.iiI1L1iI().iILlLIlli(), i1lil11l);
        } catch (IOException e) {
            e.printStackTrace();
            IiIIlIL(i1lil11l, e.getMessage());
        }
    }

    public static void iLLLILIiLi1Ii(String str, i1LIL11l i1lil11l) {
        iL1LIlIlI(str, (String) null, i1lil11l);
    }

    public static String iiIliillii(String str, String str2) {
        if (I11lLL1(str2) > I11lLL1(str)) {
            return str;
        }
        return str2;
    }

    public static void iilLiIIIi11i(int i, String str, i1LIL11l i1lil11l) {
        if (i >= 400) {
            try {
                str = new JSONObject(str).optString(C0387o0OOoO0o.iiI1L1iI("dpju\n", "G+uJeGBfE10=\n"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i1lil11l.i1LIL11l(i, str);
            return;
        }
        i1lil11l.iiI1L1iI(str);
    }

    public static C0334o0O0ooOO iilLil1i11I1(String str) {
        if (C0391o0OOoOo0.iiI1L1iI(str)) {
            return null;
        }
        return C0334o0O0ooOO.il1LilLllii(C0179o00OooO0.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("ZefjBCm94oht+P1HKq3skg==\n", "BJeTaEDeg/w=\n")), str);
    }

    public static void il1LilLllii(String str, i1LIL11l i1lil11l) {
        illlI1lLIL(new C0110o000oo0O(str, i1lil11l));
    }

    public static void illlI1lLIL(Runnable runnable) {
        Executors.newSingleThreadExecutor().execute(runnable);
    }

    public static void I1iIiIi(String[] strArr) {
    }
}
