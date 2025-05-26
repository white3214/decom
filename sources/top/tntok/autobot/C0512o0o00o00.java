package top.tntok.autobot;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.IInterface;
import android.view.IDisplayFoldListener;
import android.view.IDisplayWindowListener;
import android.view.IRotationWatcher;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0o00o00  reason: case insensitive filesystem */
public final class C0512o0o00o00 {
    public Method I11lLL1;
    public Method I1iIiIi = null;
    public Method IL1lILLLL1L;
    public Constructor IiIIlIL = null;
    public Method IiiL1llIIi = null;
    public Method i1L1lLllLLlIi = null;
    public Method i1LIL11l;
    public Method iILiI1lll = null;
    public int iLLLILIiLi1Ii;
    public final IInterface iiI1L1iI;
    public Method iiIliillii;
    public Method iilLiIIIi11i = null;
    public int iilLil1i11I1;
    public int il1LilLllii;
    public Method illlI1lLIL;

    public C0512o0o00o00(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public static C0512o0o00o00 iiI1L1iI() {
        return new C0512o0o00o00(o0OOOO0o.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("XEG3nE0L\n", "KyjZ+CJ8cgA=\n"), C0387o0OOoO0o.iiI1L1iI("G7gOmHldeKIMvw+dOH1L5RSyBZ1bVXLtHbMY\n", "etZq6hY0HIw=\n")));
    }

    public Object I11lLL1() throws ReflectiveOperationException {
        if (this.iILiI1lll == null) {
            this.iILiI1lll = Class.forName(C0387o0OOoO0o.iiI1L1iI("j3iPtSKcD32Zf4WjIoJFAI1kjqIjtgojmmOZog==\n", "7hbrx031a1M=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("ixrfiSYTlzSGC/mJIgKxP40k05smE6oomg==\n", "6Gi66FJ2xE0=\n"), (Class[]) null);
        }
        return this.iILiI1lll.invoke((Object) null, (Object[]) null);
    }

    public boolean I1iIiIi(int i) {
        try {
            Method iilLiIIIi11i2 = iilLiIIIi11i();
            if (this.iilLil1i11I1 == 0) {
                return ((Boolean) iilLiIIIi11i2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i)})).booleanValue();
            } else if (i == 0) {
                return ((Boolean) iilLiIIIi11i2.invoke(this.iiI1L1iI, (Object[]) null)).booleanValue();
            } else {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("+ELIxgByIObSB8/AHWYt9dIH2cYadzX9xEmLxwFiYefeV9vGHGIk8ItIxYkafijni0PO3wd1JA==\n", "qyerqW4WQZQ=\n"));
                return false;
            }
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("2pUKL1RN7+3t2hYtRgLq57mXGjdYAuU=\n", "mfp/QzBtgYI=\n"), e);
            return false;
        }
    }

    @TargetApi(30)
    public void I1l1iIll1lIi1(IDisplayWindowListener iDisplayWindowListener) {
        try {
            this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("L8m0KmHBmU8/1YImddiGWiPwryFix513M9SyKmjNmA==\n", "WqfGTwao6js=\n"), new Class[]{IDisplayWindowListener.class}).invoke(this.iiI1L1iI, new Object[]{iDisplayWindowListener});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("T2q0TBfK0Ft4JbROAY/ZXX9xpFJTjtdHfGmgWVOd11poarYAH4PNQGlrpFI=\n", "DAXBIHPqvjQ=\n"), e);
        }
    }

    @TargetApi(30)
    public int[] IL1lILLLL1L(IDisplayWindowListener iDisplayWindowListener) {
        try {
            return (int[]) this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("EYc4LWM/Rccniyw0fCpZ4gqMOytnB0nGF4cxIWI=\n", "Y+JfRBBLILU=\n"), new Class[]{IDisplayWindowListener.class}).invoke(this.iiI1L1iI, new Object[]{iDisplayWindowListener});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("tBSumScNPcKDW6mQJEQg2ZIJ+5EqXiPBlgL7gipDN8KAW7ecMFk2w5IJ\n", "93vb9UMtU60=\n"), e);
            return null;
        }
    }

    public void Ii1liIIIiLi(int i) {
        try {
            Method iILiI1lll2 = iILiI1lll();
            int i2 = this.iLLLILIiLi1Ii;
            if (i2 == 0) {
                iILiI1lll2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i), C0387o0OOoO0o.iiI1L1iI("4ULHoJYHqLT6QMKRiQrqtPtO2w==\n", "kiG1w+Z+i8A=\n")});
            } else if (i2 == 1) {
                iILiI1lll2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i)});
            } else if (i != 0) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("T2RsstfwO1JlIWu0yuQ2QWUhfbLN9S5Jc28vs9bgelNpcX+yy+A/RDxuYf3N/DNTPGVqq9D3Pw==\n", "HAEP3bmUWiA=\n"));
            } else {
                iILiI1lll2.invoke(this.iiI1L1iI, (Object[]) null);
            }
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("1NxvJjUOum7jk3MkJ0G/ZLfefz45QbA=\n", "l7MaSlEu1AE=\n"), e);
        }
    }

    public final Method IiIIlIL() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            Class<?> cls = this.iiI1L1iI.getClass();
            try {
                this.i1LIL11l = cls.getMethod(C0387o0OOoO0o.iiI1L1iI("Hq64rHtswIQVv4iBbXrNkACZo5x/fsieFw==\n", "ecvM6B4KofE=\n"), (Class[]) null);
            } catch (NoSuchMethodException unused) {
                this.i1LIL11l = cls.getMethod(C0387o0OOoO0o.iiI1L1iI("z4otjFbTdIXBgDc=\n", "qO9Z3jmnFfE=\n"), (Class[]) null);
            }
        }
        return this.i1LIL11l;
    }

    public int IiiL1llIIi() {
        try {
            return ((Integer) IiIIlIL().invoke(this.iiI1L1iI, (Object[]) null)).intValue();
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("jCk4gIEztaK7ZiSCk3ywqO8rKJiNfL8=\n", "z0ZN7OUT280=\n"), e);
            return 0;
        }
    }

    @TargetApi(29)
    public void IilL11ii1I1Il(IDisplayFoldListener iDisplayFoldListener) {
        try {
            this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("Oms6mSpfrhkqdwyVPkaxDDZDJ5AperQeO2AmmT8=\n", "TwVI/E023W0=\n"), new Class[]{IDisplayFoldListener.class}).invoke(this.iiI1L1iI, new Object[]{iDisplayFoldListener});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Xld6dt5IAKNpGHp0yA0JpW5MamiaDAe/bVRuY5oOAaB5GGNzyRwLonhK\n", "HTgPGrpobsw=\n"), e);
        }
    }

    public Bitmap i111iLiiIIill(int i, int i2, int i3) {
        try {
            Method iilLil1i11I12 = iilLil1i11I1();
            Object iiIliillii2 = iiIliillii(new Rect(0, 0, i, i2));
            Object I11lLL12 = I11lLL1();
            iilLil1i11I12.invoke(this.iiI1L1iI, new Object[]{0, iiIliillii2, I11lLL12});
            Object invoke = il1LilLllii().invoke(I11lLL12, (Object[]) null);
            Method illlI1lLIL2 = illlI1lLIL();
            PrintStream printStream = System.out;
            printStream.println(C0387o0OOoO0o.iiI1L1iI("U4Lvdyo=\n", "fq/CWgdAgtU=\n") + illlI1lLIL2);
            return (Bitmap) illlI1lLIL2.invoke(invoke, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("ri5AkqGLzYWZYVyQs8TIj80sUIqtxMc=\n", "7UE1/sWro+o=\n"), e);
            return null;
        }
    }

    @TargetApi(29)
    public void i1L1lLllLLlIi(IDisplayFoldListener iDisplayFoldListener) {
        try {
            this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("gxXK6bX0J+m1Gd7wquE73Z4cycyv8zb+nxXf\n", "8XCtgMaAQps=\n"), new Class[]{IDisplayFoldListener.class}).invoke(this.iiI1L1iI, new Object[]{iDisplayFoldListener});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("8+zWxzprocjEo9HOOSK809Xxg883OL/L0fqDzTEnq4fc6tDfOyWq1Q==\n", "sIOjq15Lz6c=\n"), e);
        }
    }

    public void i1LIL11l(int i, int i2) {
        try {
            Method iLLLILIiLi1Ii2 = iLLLILIiLi1Ii();
            int i3 = this.il1LilLllii;
            if (i3 == 0) {
                iLLLILIiLi1Ii2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), C0387o0OOoO0o.iiI1L1iI("0MO3QpdhGWbRxaBbgkpVdMLUrE6J\n", "o6DFIecYOgA=\n")});
            } else if (i3 == 1) {
                iLLLILIiLi1Ii2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            } else if (i != 0) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("RCwvFUbPr2puaSgTW9uieW5pPhVcyrpxeCdsFEff7mtiOTwVWt+rfDcmIlpcw6drNy0pDEHIqw==\n", "F0lMeiirzhg=\n"));
            } else {
                iLLLILIiLi1Ii2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i2)});
            }
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("lv6BEy20/BWhsZ0RP/v5H/X8kQsh+/Y=\n", "1ZH0f0mUkno=\n"), e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        r7.I11lLL1 = r7.iiI1L1iI.getClass().getMethod(top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("v0qNgd/UYZC/S4OY\n", "yyLs9o27FfE=\n"), (java.lang.Class[]) null);
        r7.iLLLILIiLi1Ii = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method iILiI1lll() throws java.lang.NoSuchMethodException {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.reflect.Method r3 = r7.I11lLL1
            if (r3 != 0) goto L_0x005c
            android.os.IInterface r3 = r7.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.String r4 = "2ABTPJHlUErACUsZuvhCTsUHXA==\n"
            java.lang.String r5 = "rGgyS9WMIzo=\n"
            java.lang.String r4 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7.I11lLL1 = r3     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7.iLLLILIiLi1Ii = r2     // Catch:{ NoSuchMethodException -> 0x0028 }
            goto L_0x005c
        L_0x0028:
            android.os.IInterface r3 = r7.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.String r4 = "Wffit2erBgtB/vqSTLYUD0Tw7Q==\n"
            java.lang.String r5 = "LZ+DwCPCdXs=\n"
            java.lang.String r4 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0045 }
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.reflect.Method r2 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0045 }
            r7.I11lLL1 = r2     // Catch:{ NoSuchMethodException -> 0x0045 }
            r7.iLLLILIiLi1Ii = r1     // Catch:{ NoSuchMethodException -> 0x0045 }
            goto L_0x005c
        L_0x0045:
            android.os.IInterface r1 = r7.iiI1L1iI
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "v0qNgd/UYZC/S4OY\n"
            java.lang.String r3 = "yyLs9o27FfE=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)
            r7.I11lLL1 = r1
            r7.iLLLILIiLi1Ii = r0
        L_0x005c:
            java.lang.reflect.Method r0 = r7.I11lLL1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0512o0o00o00.iILiI1lll():java.lang.reflect.Method");
    }

    public void iL1LIlIlI(IRotationWatcher iRotationWatcher, int i) {
        Class<IRotationWatcher> cls = IRotationWatcher.class;
        try {
            Class<?> cls2 = this.iiI1L1iI.getClass();
            try {
                cls2.getMethod(C0387o0OOoO0o.iiI1L1iI("m77fM/xipyCNq8I/+g==\n", "7N+rUJQwyFQ=\n"), new Class[]{cls, Integer.TYPE}).invoke(this.iiI1L1iI, new Object[]{iRotationWatcher, Integer.valueOf(i)});
            } catch (NoSuchMethodException unused) {
                if (i != 0) {
                    C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("+yyrW+pKErvRaaxd914fqNFpulvwTwegxyfoWutaU7rdObhb9loWrYgmphTwRhq6iC2tQu1NFg==\n", "qEnINIQuc8k=\n"));
                    return;
                }
                cls2.getMethod(C0387o0OOoO0o.iiI1L1iI("HqIuihe7wHwItzOGEQ==\n", "acNa6X/prwg=\n"), new Class[]{cls}).invoke(this.iiI1L1iI, new Object[]{iRotationWatcher});
            }
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("t8v151e0a1WAhPLuVP12TpHWoPlc4GROncvuq0T1cVmcwfI=\n", "9KSAizOUBTo=\n"), e);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method iLLLILIiLi1Ii() throws java.lang.NoSuchMethodException {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.reflect.Method r3 = r7.illlI1lLIL
            if (r3 != 0) goto L_0x0066
            android.os.IInterface r3 = r7.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x002b }
            java.lang.Class r3 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x002b }
            java.lang.String r4 = "nEgdD6NwdLCJShQLoEdfrZtOEQW3\n"
            java.lang.String r5 = "+jp4atkVMNk=\n"
            java.lang.String r4 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r4, r5)     // Catch:{ NoSuchMethodException -> 0x002b }
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x002b }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x002b }
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x002b }
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x002b }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x002b }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x002b }
            r7.illlI1lLIL = r3     // Catch:{ NoSuchMethodException -> 0x002b }
            r7.il1LilLllii = r2     // Catch:{ NoSuchMethodException -> 0x002b }
            goto L_0x0066
        L_0x002b:
            android.os.IInterface r3 = r7.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class r3 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "5x9PsZ2/mgbyHUa1noixG+AZQ7uJ\n"
            java.lang.String r5 = "gW0q1Ofa3m8=\n"
            java.lang.String r4 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004a }
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            r7.illlI1lLIL = r3     // Catch:{ NoSuchMethodException -> 0x004a }
            r7.il1LilLllii = r1     // Catch:{ NoSuchMethodException -> 0x004a }
            goto L_0x0066
        L_0x004a:
            android.os.IInterface r3 = r7.iiI1L1iI
            java.lang.Class r3 = r3.getClass()
            java.lang.String r4 = "6nsDqdt49ev4aBKlznM=\n"
            java.lang.String r5 = "jAlmzKEdp4Q=\n"
            java.lang.String r4 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r4, r5)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r1[r2] = r5
            java.lang.reflect.Method r1 = r3.getMethod(r4, r1)
            r7.illlI1lLIL = r1
            r7.il1LilLllii = r0
        L_0x0066:
            java.lang.reflect.Method r0 = r7.illlI1lLIL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0512o0o00o00.iLLLILIiLi1Ii():java.lang.reflect.Method");
    }

    public Object iiIliillii(Rect rect) throws ReflectiveOperationException {
        if (this.IiIIlIL == null || this.iilLiIIIi11i == null || this.IiiL1llIIi == null) {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("WUtJyctVS2NPTEPfy0sBHltXSN7Kf049TFBf3oB/Tj1MUF/e5U5IPhxnWNLIWEo/\n", "OCUtu6Q8L00=\n"));
            this.iilLiIIIi11i = cls.getMethod(C0387o0OOoO0o.iiI1L1iI("umtxCWUBGcSsTXc1eg==\n", "yQ4FWgp0a6c=\n"), new Class[]{Rect.class});
            this.IiIIlIL = cls.getConstructor((Class[]) null);
            this.IiiL1llIIi = cls.getMethod(C0387o0OOoO0o.iiI1L1iI("wctyl1U=\n", "o74b+zG7YQM=\n"), (Class[]) null);
        }
        Object newInstance = this.IiIIlIL.newInstance((Object[]) null);
        return this.IiiL1llIIi.invoke(this.iilLiIIIi11i.invoke(newInstance, new Object[]{rect}), (Object[]) null);
    }

    public void iiLIIiIli(IRotationWatcher iRotationWatcher) {
        try {
            this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("U39ndY3ZFkxVe35zlNITQlV5Yn+J\n", "IRoKGvu8RCM=\n"), new Class[]{IRotationWatcher.class}).invoke(this.iiI1L1iI, new Object[]{iRotationWatcher});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("AJpJRMfE2MQ31UlG0YHRwjCBWVqDltnfIoFVR83Ewco3llRN0Q==\n", "Q/U8KKPktqs=\n"), e);
        }
    }

    public final Method iilLiIIIi11i() throws NoSuchMethodException {
        if (this.iiIliillii == null) {
            try {
                this.iiIliillii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("pj8/qrDMUNy2HhS3oshV0qEKCay52VI=\n", "z0x7w8O8PL0=\n"), new Class[]{Integer.TYPE});
                this.iilLil1i11I1 = 0;
            } catch (NoSuchMethodException unused) {
                this.iiIliillii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("fUrdjj9eFux7V8mTJEUH6w==\n", "FDmP4Us/YoU=\n"), (Class[]) null);
                this.iilLil1i11I1 = 1;
            }
        }
        return this.iiIliillii;
    }

    public final Method iilLil1i11I1() throws ReflectiveOperationException {
        if (this.IL1lILLLL1L == null) {
            this.IL1lILLLL1L = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("ipvMI27Rbf6Aicw7eto=\n", "6fq8VxujCLo=\n"), new Class[]{Integer.TYPE, Class.forName(C0387o0OOoO0o.iiI1L1iI("P3CY8FQrUH0pd5LmVDUaAD1smedVAVUjKmuO5x8BVSMqa47nejBTIA==\n", "Xh78gjtCNFM=\n")), Class.forName(C0387o0OOoO0o.iiI1L1iI("mqVTPJCctcuMolkqkIL/tpi5UiuRtrCVj75FK9umspeerlkNnoWlkImueyeMgbSLnrk=\n", "+8s3Tv/10eU=\n"))});
        }
        return this.IL1lILLLL1L;
    }

    public Method il1LilLllii() throws ReflectiveOperationException {
        if (this.I1iIiIi == null) {
            this.I1iIiIi = Class.forName(C0387o0OOoO0o.iiI1L1iI("inumJOmq4dWcfKwy6bSrqIhnpzPogOSLn2CwM6KQ/JWIfbA56KzwiLh2sDPjrcaam2G3JOOP7Iif\ncKwz9A==\n", "6xXCVobDhfs=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("RBu5Xqzolb9R\n", "I37NHNmO89o=\n"), (Class[]) null);
        }
        return this.I1iIiIi;
    }

    public Method illlI1lLIL() throws ReflectiveOperationException {
        if (this.i1L1lLllLLlIi == null) {
            this.i1L1lLllLLlIi = Class.forName(C0387o0OOoO0o.iiI1L1iI("9F1WZvhQWmviWlxw+E4QFvZBV3H5el814UZAcbNqXTfwVlxn/1ZKDfRBVmP2S1sH4FVUceU=\n", "lTMyFJc5PkU=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("eLnbwUdSFzA=\n", "GcqZqDM/dkA=\n"), (Class[]) null);
        }
        return this.i1L1lLllLLlIi;
    }
}
