package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import java.lang.reflect.Method;

@SuppressLint({"PrivateApi,DiscouragedPrivateApi"})
public final class o0OOOO0o {
    public static C0294o0O0OOo I11lLL1;
    public static iiLIIiIli I1iIiIi;
    public static CameraManager IL1lILLLL1L;
    public static C0227o00oOO IiIIlIL;
    public static C0476o0OooOo IiiL1llIIi;
    public static C0535o0oOooO0 i1L1lLllLLlIi;
    public static final Long i1LIL11l;
    public static IiIIl1LI1i iILiI1lll;
    public static C0262o00ooOO iLLLILIiLi1Ii;
    public static final Method iiI1L1iI;
    public static C0028Oooo00o iiIliillii;
    public static C0541o0ooOOOO iilLiIIIi11i;
    public static o00O iilLil1i11I1;
    public static C0512o0o00o00 il1LilLllii;
    public static final int illlI1lLIL = 0;

    static {
        try {
            iiI1L1iI = Class.forName(C0387o0OOoO0o.iiI1L1iI("rbvG+k0oJGujpozbRzM2LK+w7+lMICcgvg==\n", "zNWiiCJBQEU=\n")).getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("0MhJ6ZW1n2/UyA==\n", "t609uvDH6QY=\n"), new Class[]{String.class});
            Long decode = Long.decode(C0387o0OOoO0o.iiI1L1iI("qp3i5vEN0pmrmuvm9g==\n", "m6rb1sY15qk=\n"));
            i1LIL11l = decode;
            if (System.currentTimeMillis() > decode.longValue()) {
                Process.killProcess(Process.myPid());
            }
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static C0262o00ooOO I11lLL1() {
        if (iLLLILIiLi1Ii == null) {
            iLLLILIiLi1Ii = new C0262o00ooOO(IiIIlIL(C0387o0OOoO0o.iiI1L1iI("NTU78wLgRw==\n", "RVRYmGOHIoc=\n"), C0387o0OOoO0o.iiI1L1iI("0LQyH8ViZMfStTgZz2V0x8G3eCT6amOC0L0zIMtlYY7UqA==\n", "sdpWbaoLAOk=\n")));
        }
        return iLLLILIiLi1Ii;
    }

    public static C0512o0o00o00 I1iIiIi() {
        if (il1LilLllii == null) {
            il1LilLllii = C0512o0o00o00.iiI1L1iI();
        }
        return il1LilLllii;
    }

    public static IInterface IiIIlIL(String str, String str2) {
        try {
            return (IInterface) Class.forName(str2 + C0387o0OOoO0o.iiI1L1iI("v4M17U4=\n", "m9BBmCz3bsI=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("obVr7TaoI/ChpUc=\n", "wMYig0LNUZY=\n"), new Class[]{IBinder.class}).invoke((Object) null, new Object[]{(IBinder) iiI1L1iI.invoke((Object) null, new Object[]{str})});
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static C0535o0oOooO0 IiiL1llIIi() {
        if (i1L1lLllLLlIi == null) {
            i1L1lLllLLlIi = new C0535o0oOooO0(IiIIlIL(C0387o0OOoO0o.iiI1L1iI("EAKScp+4Tw==\n", "ZGf+F/zXIl4=\n"), C0387o0OOoO0o.iiI1L1iI("ehBgGimDk1N2FmkaIYODRGsRbFhmmZJNfBxiWWako0R1Gm5bJb6SU28WblE=\n", "GX8NNEjt9yE=\n")));
        }
        return i1L1lLllLLlIi;
    }

    public static CameraManager i1LIL11l() {
        if (IL1lILLLL1L == null) {
            try {
                IL1lILLLL1L = CameraManager.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{FakeContext.iiI1L1iI()});
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return IL1lILLLL1L;
    }

    public static C0541o0ooOOOO iILiI1lll() {
        if (iilLiIIIi11i == null) {
            iilLiIIIi11i = new C0541o0ooOOOO(IiIIlIL(C0387o0OOoO0o.iiI1L1iI("Tp7d1to=\n", "PvayuL9U7gQ=\n"), C0387o0OOoO0o.iiI1L1iI("lnwhsyUYtUaaeiizLRilUYd9LfFqArRYkGMk8ioP/32hdiD4NB6+Wow=\n", "9RNMnUR20TQ=\n")));
        }
        return iilLiIIIi11i;
    }

    public static C0294o0O0OOo iLLLILIiLi1Ii() {
        if (I11lLL1 == null) {
            I11lLL1 = C0294o0O0OOo.iiI1L1iI();
        }
        return I11lLL1;
    }

    public static iiLIIiIli iiI1L1iI() {
        if (I1iIiIi == null) {
            I1iIiIi = iiLIIiIli.iiI1L1iI();
        }
        return I1iIiIi;
    }

    public static o00O iiIliillii() {
        if (iilLil1i11I1 == null) {
            iilLil1i11I1 = o00O.iiI1L1iI();
        }
        return iilLil1i11I1;
    }

    public static C0476o0OooOo iilLiIIIi11i() {
        if (IiiL1llIIi == null) {
            IiiL1llIIi = C0476o0OooOo.i1LIL11l();
        }
        return IiiL1llIIi;
    }

    public static C0227o00oOO iilLil1i11I1() {
        if (IiIIlIL == null) {
            IiIIlIL = new C0227o00oOO(IiIIlIL(C0387o0OOoO0o.iiI1L1iI("riFDKDtl0sm0J1gv\n", "wE43QV0Msag=\n"), C0387o0OOoO0o.iiI1L1iI("WaZbi3fzEqVZuE/XUdQZ/1GuVpp57h/kVoVel3n9E/k=\n", "OMg/+Riados=\n")));
        }
        return IiIIlIL;
    }

    public static C0028Oooo00o il1LilLllii() {
        if (iiIliillii == null) {
            iiIliillii = C0028Oooo00o.i1LIL11l();
        }
        return iiIliillii;
    }

    public static IiIIl1LI1i illlI1lLIL() {
        if (iILiI1lll == null) {
            iILiI1lll = IiIIl1LI1i.illlI1lLIL();
        }
        return iILiI1lll;
    }
}
