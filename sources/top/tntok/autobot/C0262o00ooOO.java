package top.tntok.autobot;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: top.tntok.autobot.o00ooOO  reason: case insensitive filesystem */
public final class C0262o00ooOO {
    public Method I11lLL1;
    public Method i1LIL11l;
    public int iLLLILIiLi1Ii;
    public final IInterface iiI1L1iI;
    public int iiIliillii;
    public Method iilLil1i11I1;
    public Method il1LilLllii;
    public int illlI1lLIL;

    public C0262o00ooOO(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public final Method I11lLL1() throws NoSuchMethodException {
        Class<String> cls = String.class;
        Class<Intent> cls2 = Intent.class;
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("S8Z+CCK/NZJf3W87OIIykFPHch8o\n", "OrMbelv2W+Y=\n"), new Class[]{cls2, cls, Long.TYPE, Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                Class<?> cls3 = this.iiI1L1iI.getClass();
                String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("8cRkxRBewWHl33X2CmPGY+nFaNIa\n", "gLEBt2kXrxU=\n");
                Class cls4 = Integer.TYPE;
                this.i1LIL11l = cls3.getMethod(iiI1L1iI2, new Class[]{cls2, cls, cls4, cls4});
                this.illlI1lLIL = 1;
            }
        }
        return this.i1LIL11l;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        return (java.util.List) r11;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.content.pm.ResolveInfo> IiIIlIL(android.content.Intent r11, int r12) {
        /*
            r10 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 4
            r4 = 0
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r12 = r12 | r5
            r5 = 0
            java.lang.reflect.Method r6 = r10.I11lLL1()     // Catch:{ Exception -> 0x0028 }
            int r7 = r10.illlI1lLIL     // Catch:{ Exception -> 0x0028 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r7 = r11.getType()     // Catch:{ Exception -> 0x0028 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0028 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0028 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0028 }
            r3[r4] = r11     // Catch:{ Exception -> 0x0028 }
            r3[r2] = r7     // Catch:{ Exception -> 0x0028 }
            r3[r1] = r12     // Catch:{ Exception -> 0x0028 }
            r3[r0] = r8     // Catch:{ Exception -> 0x0028 }
            goto L_0x0041
        L_0x0028:
            r11 = move-exception
            goto L_0x0055
        L_0x002a:
            java.lang.String r7 = r11.getType()     // Catch:{ Exception -> 0x0028 }
            long r8 = (long) r12     // Catch:{ Exception -> 0x0028 }
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0028 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0028 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0028 }
            r3[r4] = r11     // Catch:{ Exception -> 0x0028 }
            r3[r2] = r7     // Catch:{ Exception -> 0x0028 }
            r3[r1] = r12     // Catch:{ Exception -> 0x0028 }
            r3[r0] = r8     // Catch:{ Exception -> 0x0028 }
        L_0x0041:
            android.os.IInterface r11 = r10.iiI1L1iI     // Catch:{ Exception -> 0x0028 }
            java.lang.Object r11 = r6.invoke(r11, r3)     // Catch:{ Exception -> 0x0028 }
            java.lang.reflect.Method r12 = r10.iilLil1i11I1()     // Catch:{ Exception -> 0x0052 }
            java.lang.Object r12 = r12.invoke(r11, r5)     // Catch:{ Exception -> 0x0052 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ Exception -> 0x0052 }
            return r12
        L_0x0052:
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x0028 }
            return r11
        L_0x0055:
            java.lang.String r12 = "L9/Og4PURPEYkNKBkZtB+0zd3puPm04=\n"
            java.lang.String r0 = "bLC77+f0Kp4=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r0)
            top.tntok.autobot.C0525o0oOO.il1LilLllii(r12, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0262o00ooOO.IiIIlIL(android.content.Intent, int):java.util.List");
    }

    public ArrayList<String> i1LIL11l() {
        Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("Cj30wNCtFVECPeTX0bBfHggn+d3R6jw+Ih0=\n", "a1OQsr/EcX8=\n"), (Uri) null);
        intent.addCategory(C0387o0OOoO0o.iiI1L1iI("aj3VCQfxvF5iPcUeBuz2E2on1BwH6qFeRxLkNSvQnSI=\n", "C1Oxe2iY2HA=\n"));
        List<ResolveInfo> IiIIlIL = IiIIlIL(intent, 0);
        HashSet hashSet = new HashSet();
        for (ResolveInfo next : IiIIlIL) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("Fgx/jFCvv2AKD2PZ\n", "ZGkM4zzZ2ik=\n") + next);
            hashSet.add(next.activityInfo.packageName);
        }
        return new ArrayList<>(hashSet);
    }

    public String iLLLILIiLi1Ii(String str) {
        ResolveInfo next;
        Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("08xNmV96fXzbzF2OXmc3M9HWQIRePVQT++w=\n", "sqIp6zATGVI=\n"), (Uri) null);
        intent.addCategory(C0387o0OOoO0o.iiI1L1iI("+evvcrHQ6Ajx6/9lsM2iRfnx7mexy/UI1MTeTp3xyXQ=\n", "mIWLAN65jCY=\n"));
        intent.setPackage(str);
        List<ResolveInfo> IiIIlIL = IiIIlIL(intent, 0);
        for (ResolveInfo resolveInfo : IiIIlIL) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("ApxdjTszE08en0HY\n", "cPku4ldFdgY=\n") + resolveInfo);
        }
        if (IiIIlIL.size() <= 0 || (next = IiIIlIL.iterator().next()) == null) {
            return "";
        }
        return next.activityInfo.name;
    }

    public boolean iiI1L1iI(String str) {
        try {
            illlI1lLIL().invoke(this.iiI1L1iI, new Object[]{str, null, 0});
            return true;
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("pBWIb8SaQMmTWpRt1tVFw8cXmHfI1Uo=\n", "53r9A6C6LqY=\n"), e);
            return false;
        }
    }

    public final Method iiIliillii() throws NoSuchMethodException {
        Class<String> cls = String.class;
        if (this.I11lLL1 == null) {
            try {
                this.I11lLL1 = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("JVhmaA3/P/wlWFtWCvM=\n", "Qj0SOGycVJ0=\n"), new Class[]{cls, Long.TYPE, Integer.TYPE});
            } catch (Exception unused) {
                Class<?> cls2 = this.iiI1L1iI.getClass();
                String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("KheVyJyHDH0qF6j2m4s=\n", "TXLhmP3kZxw=\n");
                Class cls3 = Integer.TYPE;
                this.I11lLL1 = cls2.getMethod(iiI1L1iI2, new Class[]{cls, cls3, cls3});
                this.iLLLILIiLi1Ii = 1;
            }
        }
        return this.I11lLL1;
    }

    public final Method iilLil1i11I1() throws NoSuchMethodException {
        if (this.iilLil1i11I1 == null) {
            try {
                this.iilLil1i11I1 = Class.forName(C0387o0OOoO0o.iiI1L1iI("S0cPSz1IHhdJRgVNN08OF1pERWkzUxlcRkwPdTtSDmpGQAhc\n", "KilrOVIhejk=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("w0xj8/vHQg==\n", "pCkXv5K0NhA=\n"), (Class[]) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.iilLil1i11I1;
    }

    public PackageInfo il1LilLllii(String str) {
        try {
            return (PackageInfo) iiIliillii().invoke(this.iiI1L1iI, this.iLLLILIiLi1Ii != 0 ? new Object[]{str, 4239, 0} : new Object[]{str, 4239L, 0});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("5Q1YW+TJ3DzSQkRZ9obZNoYPSEPohtY=\n", "pmItN4DpslM=\n"), e);
            return null;
        }
    }

    public final Method illlI1lLIL() {
        if (this.il1LilLllii == null) {
            try {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("afo1cxVcrxpm/zNzE3SwBF/lNWAjfKsL\n", "CpZQEmcd32o=\n"), new Class[]{String.class, Class.forName(C0387o0OOoO0o.iiI1L1iI("G5qtHqm7VMIZm6cYo7xEwgqZ5yWWs1OHG5OsKKemUaMYh6wesLdC\n", "evTJbMbSMOw=\n")), Integer.TYPE});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.il1LilLllii;
    }
}
