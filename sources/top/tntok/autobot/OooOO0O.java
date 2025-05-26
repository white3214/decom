package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.InputEvent;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class OooOO0O {
    public static final boolean I11lLL1 = false;
    public static final int i1LIL11l = 0;
    public static final /* synthetic */ boolean iLLLILIiLi1Ii = false;
    public static final int iiI1L1iI = -1;
    public static final int iiIliillii = 1;
    public static final int iilLil1i11I1 = 2;
    public static final int il1LilLllii = 0;
    public static final int illlI1lLIL = 2;

    public static int I11lLL1(int i) {
        if (i == 0) {
            return o0OOOO0o.I1iIiIi().IiiL1llIIi();
        }
        return o0OOOO0o.il1LilLllii().I11lLL1(i).iiIliillii();
    }

    public static boolean I1iIiIi(int i) {
        return o0OOOO0o.iLLLILIiLi1Ii().illlI1lLIL(i);
    }

    public static void I1l1iIll1lIi1(String str, int i, boolean z) {
        Bundle bundle;
        Intent IiIIlIL = IiIIlIL(FakeContext.iiI1L1iI().getPackageManager(), str);
        if (IiIIlIL == null) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("TCNmYic1n5h9J2l4LWHTmnosa2RoKNGPaix8LC4uzdtuMngs\n", "D0IIDEhBv/s=\n") + str);
            return;
        }
        IiIIlIL.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityOptions iiI1L1iI2 = ActivityOptions.makeBasic();
            ActivityOptions unused = iiI1L1iI2.setLaunchDisplayId(i);
            bundle = iiI1L1iI2.toBundle();
        } else {
            bundle = null;
        }
        iiLIIiIli iiI1L1iI3 = o0OOOO0o.iiI1L1iI();
        if (z) {
            iiI1L1iI3.iiIliillii(str);
        }
        iiI1L1iI3.i111iLiiIIill(IiIIlIL, bundle);
    }

    public static boolean IL1lILLLL1L(int i) {
        if (!I1iIiIi(i)) {
            return true;
        }
        return iL1LIlIlI(26, i, 0);
    }

    public static OooOOO0 ILl1iII11Ll1(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
        boolean z = true;
        if ((applicationInfo.flags & 1) == 0) {
            z = false;
        }
        return new OooOOO0(applicationInfo.packageName, charSequence, z);
    }

    public static boolean Ii1liIIIiLi(String str) {
        IiIIl1LI1i illlI1lLIL2 = o0OOOO0o.illlI1lLIL();
        if (illlI1lLIL2 == null) {
            return false;
        }
        String iilLil1i11I12 = iilLil1i11I1();
        if (iilLil1i11I12 == null || !iilLil1i11I12.equals(str)) {
            return illlI1lLIL2.iilLiIIIi11i(str);
        }
        return false;
    }

    public static Intent IiIIlIL(PackageManager packageManager, String str) {
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        return packageManager.getLeanbackLaunchIntentForPackage(str);
    }

    public static boolean IiiL1llIIi(InputEvent inputEvent, int i, int i2) {
        if (!iiLIIiIli(i)) {
            throw new AssertionError(C0387o0OOoO0o.iiI1L1iI("vdAyuEBYqtKKny66Th2nyd7WKaRRDOTYiNopoAQRop3fzDKkVBe2yY32KaRRDIHLm9EzpwxR\n", "/r9H1CR4xL0=\n"));
        } else if (i == 0 || o00O.iLLLILIiLi1Ii(inputEvent, i)) {
            return o0OOOO0o.iiIliillii().iilLil1i11I1(inputEvent, i2);
        } else {
            return false;
        }
    }

    public static boolean IilL11ii1I1Il(int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        long[] jArr;
        IBinder iBinder;
        int i3 = Build.VERSION.SDK_INT;
        boolean z4 = true;
        if (i3 >= 29) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && i3 >= 34 && Build.BRAND.equalsIgnoreCase(C0387o0OOoO0o.iiI1L1iI("m/wFtGI=\n", "85Nr2xDtlWo=\n")) && C0398o0OOooOO.i1L1lLllLLlIi()) {
            z2 = false;
        }
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (z2) {
            if (i3 < 34 || C0398o0OOooOO.IL1lILLLL1L()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                jArr = C0025OooOooo.illlI1lLIL();
            } else {
                jArr = C0398o0OOooOO.iilLiIIIi11i();
            }
            if (jArr == null) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("6DEIPOBXarHffho18Fd0ttItFDPlGyS6wi0NPOUOJLfPLQ==\n", "q159UIR3BN4=\n"));
                return false;
            }
            for (long j : jArr) {
                if (z3) {
                    iBinder = C0025OooOooo.il1LilLllii(j);
                } else {
                    iBinder = C0398o0OOooOO.IiiL1llIIi(j);
                }
                z4 &= C0398o0OOooOO.IilL11ii1I1Il(iBinder, i2);
            }
            return z4;
        }
        IBinder iiIliillii2 = C0398o0OOooOO.iiIliillii();
        if (iiIliillii2 != null) {
            return C0398o0OOooOO.IilL11ii1I1Il(iiIliillii2, i2);
        }
        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("vICdpVEQZj+Lz4+sQRBqJZaDnORcXig0lpyYpVRJ\n", "/+/oyTUwCFA=\n"));
        return false;
    }

    public static void i111iLiiIIill(int i) {
        String str;
        String str2;
        C0512o0o00o00 I1iIiIi = o0OOOO0o.I1iIiIi();
        boolean I1iIiIi2 = I1iIiIi.I1iIiIi(i);
        int I11lLL12 = (I11lLL1(i) & 1) ^ 1;
        if (I11lLL12 == 0) {
            str = "9YcswU96Yhw=\n";
            str2 = "hehetT0bC2g=\n";
        } else {
            str = "tCuSYvcYESS9\n";
            str2 = "2Er8BoR7cFQ=\n";
        }
        String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI(str, str2);
        C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("WlI5GfVfofJxQy4E/1XvoGxSPgXzSfXleg1v\n", "HjdPcJY6gYA=\n") + iiI1L1iI2);
        I1iIiIi.i1LIL11l(i, I11lLL12);
        if (!I1iIiIi2) {
            I1iIiIi.Ii1liIIIiLi(i);
        }
    }

    public static List<OooOOO0> i1L1lLllLLlIi() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = FakeContext.iiI1L1iI().getPackageManager();
        for (ApplicationInfo ILl1iII11Ll1 : iilLiIIIi11i(packageManager)) {
            arrayList.add(ILl1iII11Ll1(packageManager, ILl1iII11Ll1));
        }
        return arrayList;
    }

    public static void i1LIL11l() {
        o0OOOO0o.iilLiIIIi11i().illlI1lLIL();
    }

    public static boolean iILiI1lll(int i, int i2, int i3, int i4, int i5, int i6) {
        long uptimeMillis = SystemClock.uptimeMillis();
        return IiiL1llIIi(new KeyEvent(uptimeMillis, uptimeMillis, i, i2, i3, i4, -1, 0, 0, 257), i5, i6);
    }

    public static boolean iL1LIlIlI(int i, int i2, int i3) {
        if (!iILiI1lll(0, i, 0, 0, i2, i3) || !iILiI1lll(1, i, 0, 0, i2, i3)) {
            return false;
        }
        return true;
    }

    public static String iLLLILIiLi1Ii() {
        return Build.MODEL;
    }

    public static void iiI1L1iI() {
        o0OOOO0o.iilLiIIIi11i().iiI1L1iI();
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static OooOOO0 iiIliillii(String str) {
        PackageManager packageManager = FakeContext.iiI1L1iI().getPackageManager();
        for (ApplicationInfo next : packageManager.getInstalledApplications(128)) {
            if (str.equals(next.packageName)) {
                return ILl1iII11Ll1(packageManager, next);
            }
        }
        return null;
    }

    public static boolean iiLIIiIli(int i) {
        if (i == 0 || Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static List<ApplicationInfo> iilLiIIIi11i(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo next : packageManager.getInstalledApplications(128)) {
            if (next.enabled && IiIIlIL(packageManager, next.packageName) != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String iilLil1i11I1() {
        CharSequence iLLLILIiLi1Ii2;
        IiIIl1LI1i illlI1lLIL2 = o0OOOO0o.illlI1lLIL();
        if (illlI1lLIL2 == null || (iLLLILIiLi1Ii2 = illlI1lLIL2.iLLLILIiLi1Ii()) == null) {
            return null;
        }
        return iLLLILIiLi1Ii2.toString();
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static List<OooOOO0> il1LilLllii(String str) {
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.getDefault());
        PackageManager packageManager = FakeContext.iiI1L1iI().getPackageManager();
        for (ApplicationInfo next : iilLiIIIi11i(packageManager)) {
            String charSequence = packageManager.getApplicationLabel(next).toString();
            if (charSequence.toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                boolean z = true;
                if ((next.flags & 1) == 0) {
                    z = false;
                }
                arrayList.add(new OooOOO0(next.packageName, charSequence, z));
            }
        }
        return arrayList;
    }

    public static void illlI1lLIL() {
        o0OOOO0o.iilLiIIIi11i().il1LilLllii();
    }
}
