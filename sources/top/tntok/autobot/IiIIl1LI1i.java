package top.tntok.autobot;

import android.content.ClipData;
import android.content.IOnPrimaryClipChangedListener;
import android.os.Build;
import android.os.IInterface;
import java.lang.reflect.Method;

public final class IiIIl1LI1i {
    public int I11lLL1;
    public Method i1LIL11l;
    public final IInterface iiI1L1iI;
    public int iiIliillii;
    public int iilLil1i11I1;
    public Method il1LilLllii;
    public Method illlI1lLIL;

    public IiIIl1LI1i(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public static void IiIIlIL(Method method, int i, IInterface iInterface, ClipData clipData) throws ReflectiveOperationException {
        if (Build.VERSION.SDK_INT < 29) {
            method.invoke(iInterface, new Object[]{clipData, C0387o0OOoO0o.iiI1L1iI("rJ0lrPmAZSegmyys64ZkOaM=\n", "z/JIgpjuAVU=\n")});
        } else if (i == 0) {
            method.invoke(iInterface, new Object[]{clipData, C0387o0OOoO0o.iiI1L1iI("xB9pLABqckbIGWAsEmxzWMs=\n", "p3AEAmEEFjQ=\n"), 0});
        } else if (i == 1) {
            method.invoke(iInterface, new Object[]{clipData, C0387o0OOoO0o.iiI1L1iI("Chk40a/PiZ8GHzHRvcmIgQU=\n", "aXZV/86h7e0=\n"), null, 0});
        } else if (i != 2) {
            method.invoke(iInterface, new Object[]{clipData, C0387o0OOoO0o.iiI1L1iI("6v2DCsdYwu3m+4oK1V7D8+U=\n", "iZLuJKY2pp8=\n"), null, 0, 0, Boolean.TRUE});
        } else {
            method.invoke(iInterface, new Object[]{clipData, C0387o0OOoO0o.iiI1L1iI("Ytm1erYfCiBu37x6pBkLPm0=\n", "AbbYVNdxblI=\n"), null, 0, 0});
        }
    }

    public static void iiI1L1iI(Method method, int i, IInterface iInterface, IOnPrimaryClipChangedListener iOnPrimaryClipChangedListener) throws ReflectiveOperationException {
        if (Build.VERSION.SDK_INT < 29) {
            method.invoke(iInterface, new Object[]{iOnPrimaryClipChangedListener, C0387o0OOoO0o.iiI1L1iI("A4G+umCCkFsPh7e6coSRRQw=\n", "YO7TlAHs9Ck=\n")});
        } else if (i == 0) {
            method.invoke(iInterface, new Object[]{iOnPrimaryClipChangedListener, C0387o0OOoO0o.iiI1L1iI("RI0JdcHTSopIiwB109VLlEs=\n", "J+JkW6C9Lvg=\n"), 0});
        } else if (i != 1) {
            method.invoke(iInterface, new Object[]{iOnPrimaryClipChangedListener, C0387o0OOoO0o.iiI1L1iI("I6mTrFgC6b0vr5qsSgTooyw=\n", "QMb+gjlsjc8=\n"), null, 0, 0});
        } else {
            method.invoke(iInterface, new Object[]{iOnPrimaryClipChangedListener, C0387o0OOoO0o.iiI1L1iI("0jiVmSBbfKjePpyZMl19tt0=\n", "sVf4t0E1GNo=\n"), null, 0});
        }
    }

    public static ClipData iilLil1i11I1(Method method, int i, IInterface iInterface) throws ReflectiveOperationException {
        if (Build.VERSION.SDK_INT < 29) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("8JGM+Wo35YL8l4X5eDHknP8=\n", "k/7h1wtZgfA=\n")});
        } else if (i == 0) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("cNAExvkpXp581g3G6y9fgH8=\n", "E79p6JhHOuw=\n"), 0});
        } else if (i == 1) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("UpqDK81kHztenIor32IeJV0=\n", "MfXuBawKe0k=\n"), null, 0});
        } else if (i == 2) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("l3Zz5RF5TfmbcHrlA39M55g=\n", "9Bkey3AXKYs=\n"), null, 0, 0});
        } else if (i == 3) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("hJvSsfiKf46Indux6ox+kIs=\n", "5/S/n5nkG/w=\n"), 0, null});
        } else if (i == 4) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("KHj9WhdOtyEkfvRaBUi2Pyc=\n", "SxeQdHYg01M=\n"), null, 0, 0, Boolean.TRUE});
        } else if (i != 5) {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("EX4OhAsppHkdeAeEGS+lZx4=\n", "chFjqmpHwAs=\n"), null, 0, 0, null});
        } else {
            return (ClipData) method.invoke(iInterface, new Object[]{C0387o0OOoO0o.iiI1L1iI("paNbHF2bNkWppVIcT503W6o=\n", "xsw2Mjz1Ujc=\n"), null, null, null, 0, 0, Boolean.TRUE});
        }
    }

    public static IiIIl1LI1i illlI1lLIL() {
        IInterface IiIIlIL = o0OOOO0o.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("X28g3vaw0ElY\n", "PANJrpTfsTs=\n"), C0387o0OOoO0o.iiI1L1iI("gntCcnP+50SAekh0efn3RKpWSmls9ewLkXE=\n", "4xUmAByXg2o=\n"));
        if (IiIIlIL == null) {
            return null;
        }
        return new IiIIl1LI1i(IiIIlIL);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = r12.iiI1L1iI.getClass().getMethod(top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("NDlaY4x2iuM1JW1fl28=\n", "R1wuM/4f54I=\n"), new java.lang.Class[]{r2, r1, r1, java.lang.Integer.TYPE});
        r12.illlI1lLIL = r8;
        r12.iilLil1i11I1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("TJWWm+fq3xdNiaGn/PM=\n", "P/Diy5WDsnY=\n");
        r11 = java.lang.Integer.TYPE;
        r8 = r8.getMethod(r9, new java.lang.Class[]{r2, r1, r1, r11, r11});
        r12.illlI1lLIL = r8;
        r12.iilLil1i11I1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0098, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("TbRou+ihk4pMqF+H87g=\n", "PtEc65rI/us=\n");
        r1 = java.lang.Integer.TYPE;
        r12.illlI1lLIL = r8.getMethod(r9, new java.lang.Class[]{r2, r1, r1, r1, r1, java.lang.Boolean.TYPE});
        r12.iilLil1i11I1 = 3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method I11lLL1() throws java.lang.NoSuchMethodException {
        /*
            r12 = this;
            r0 = 5
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class<android.content.ClipData> r2 = android.content.ClipData.class
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            java.lang.reflect.Method r8 = r12.illlI1lLIL
            if (r8 != 0) goto L_0x00c1
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 >= r9) goto L_0x002f
            android.os.IInterface r0 = r12.iiI1L1iI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r3 = "kLVCUisDKZCRqXVuMBo=\n"
            java.lang.String r4 = "49A2AllqRPE=\n"
            java.lang.String r3 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r3, r4)
            java.lang.Class[] r4 = new java.lang.Class[r7]
            r4[r6] = r2
            r4[r5] = r1
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)
            r12.illlI1lLIL = r0
            return r0
        L_0x002f:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0050 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0050 }
            java.lang.String r9 = "PN5jgRpwGsg9wlS9AWk=\n"
            java.lang.String r10 = "T7sX0WgZd6k=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0050 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0050 }
            r10[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0050 }
            r10[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0050 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0050 }
            r10[r7] = r11     // Catch:{ NoSuchMethodException -> 0x0050 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0050 }
            r12.illlI1lLIL = r8     // Catch:{ NoSuchMethodException -> 0x0050 }
            r12.iilLil1i11I1 = r6     // Catch:{ NoSuchMethodException -> 0x0050 }
            return r8
        L_0x0050:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0073 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0073 }
            java.lang.String r9 = "NDlaY4x2iuM1JW1fl28=\n"
            java.lang.String r10 = "R1wuM/4f54I=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0073 }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0073 }
            r10[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0073 }
            r10[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0073 }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x0073 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0073 }
            r10[r4] = r11     // Catch:{ NoSuchMethodException -> 0x0073 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0073 }
            r12.illlI1lLIL = r8     // Catch:{ NoSuchMethodException -> 0x0073 }
            r12.iilLil1i11I1 = r5     // Catch:{ NoSuchMethodException -> 0x0073 }
            return r8
        L_0x0073:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0098 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0098 }
            java.lang.String r9 = "TJWWm+fq3xdNiaGn/PM=\n"
            java.lang.String r10 = "P/Diy5WDsnY=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0098 }
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0098 }
            r10[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0098 }
            r10[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0098 }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x0098 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0098 }
            r10[r4] = r11     // Catch:{ NoSuchMethodException -> 0x0098 }
            r10[r3] = r11     // Catch:{ NoSuchMethodException -> 0x0098 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0098 }
            r12.illlI1lLIL = r8     // Catch:{ NoSuchMethodException -> 0x0098 }
            r12.iilLil1i11I1 = r7     // Catch:{ NoSuchMethodException -> 0x0098 }
            return r8
        L_0x0098:
            android.os.IInterface r8 = r12.iiI1L1iI
            java.lang.Class r8 = r8.getClass()
            java.lang.String r9 = "TbRou+ihk4pMqF+H87g=\n"
            java.lang.String r10 = "PtEc65rI/us=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)
            r10 = 6
            java.lang.Class[] r10 = new java.lang.Class[r10]
            r10[r6] = r2
            r10[r5] = r1
            r10[r7] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r10[r4] = r1
            r10[r3] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r10[r0] = r1
            java.lang.reflect.Method r0 = r8.getMethod(r9, r10)
            r12.illlI1lLIL = r0
            r12.iilLil1i11I1 = r4
        L_0x00c1:
            java.lang.reflect.Method r0 = r12.illlI1lLIL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IiIIl1LI1i.I11lLL1():java.lang.reflect.Method");
    }

    public boolean i1LIL11l(IOnPrimaryClipChangedListener iOnPrimaryClipChangedListener) {
        try {
            iiI1L1iI(il1LilLllii(), this.I11lLL1, this.iiI1L1iI, iOnPrimaryClipChangedListener);
            return true;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("HhTWfL7/RE4pW8p+rLBBRH0WxmSysE4=\n", "XXujENrfKiE=\n"), e);
            return false;
        }
    }

    public CharSequence iLLLILIiLi1Ii() {
        try {
            ClipData iilLil1i11I12 = iilLil1i11I1(iiIliillii(), this.iiIliillii, this.iiI1L1iI);
            if (iilLil1i11I12 != null) {
                if (iilLil1i11I12.getItemCount() != 0) {
                    return iilLil1i11I12.getItemAt(0).getText();
                }
            }
            return null;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("bp06Iagk7yNZ0iYjumvqKQ2fKjmka+U=\n", "LfJPTcwEgUw=\n"), e);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = r12.iiI1L1iI.getClass().getMethod(top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("XbxhlLeTPvhIoFaorIo=\n", "OtkVxMX6U5k=\n"), new java.lang.Class[]{r1, r1, java.lang.Integer.TYPE});
        r12.i1LIL11l = r8;
        r12.iiIliillii = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("Qk0+58ufWWJXUQnb0IY=\n", "JShKt7n2NAM=\n");
        r11 = java.lang.Integer.TYPE;
        r8 = r8.getMethod(r9, new java.lang.Class[]{r1, r1, r11, r11});
        r12.i1LIL11l = r8;
        r12.iiIliillii = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r8 = r12.iiI1L1iI.getClass().getMethod(top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("8KpCX3whCSLltnVjZzg=\n", "l882Dw5IZEM=\n"), new java.lang.Class[]{r1, java.lang.Integer.TYPE, r1});
        r12.i1LIL11l = r8;
        r12.iiIliillii = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("LBzGQYRNmlA5APF9n1Q=\n", "S3myEfYk9zE=\n");
        r11 = java.lang.Integer.TYPE;
        r8 = r8.getMethod(r9, new java.lang.Class[]{r1, r1, r11, r11, java.lang.Boolean.TYPE});
        r12.i1LIL11l = r8;
        r12.iiIliillii = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("kzlGwDEVJFyGJXH8Kgw=\n", "9FwykEN8ST0=\n");
        r11 = java.lang.Integer.TYPE;
        r8 = r8.getMethod(r9, new java.lang.Class[]{r1, r1, r1, r1, r11, r11, java.lang.Boolean.TYPE});
        r12.i1LIL11l = r8;
        r12.iiIliillii = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0102, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0103, code lost:
        r8 = r12.iiI1L1iI.getClass();
        r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("87Cb20tZz3nmrKznUEA=\n", "lNXvizkwohg=\n");
        r6 = java.lang.Integer.TYPE;
        r12.i1LIL11l = r8.getMethod(r9, new java.lang.Class[]{r1, r1, r6, r6, r1});
        r12.iiIliillii = 6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method iiIliillii() throws java.lang.NoSuchMethodException {
        /*
            r12 = this;
            r0 = 6
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            java.lang.reflect.Method r8 = r12.i1LIL11l
            if (r8 != 0) goto L_0x0127
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 >= r9) goto L_0x002c
            android.os.IInterface r0 = r12.iiI1L1iI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "upztld9U2/OvgNqpxE0=\n"
            java.lang.String r3 = "3fmZxa09tpI=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            java.lang.Class[] r3 = new java.lang.Class[r7]
            r3[r6] = r1
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)
            r12.i1LIL11l = r0
            return r0
        L_0x002c:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.String r9 = "/YmS5/GxEB/olaXb6qg=\n"
            java.lang.String r10 = "muzmt4PYfX4=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x004b }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004b }
            r10[r7] = r11     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x004b }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x004b }
            r12.iiIliillii = r6     // Catch:{ NoSuchMethodException -> 0x004b }
            return r8
        L_0x004b:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x006c }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x006c }
            java.lang.String r9 = "XbxhlLeTPvhIoFaorIo=\n"
            java.lang.String r10 = "OtkVxMX6U5k=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x006c }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x006c }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x006c }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x006c }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x006c }
            r10[r5] = r11     // Catch:{ NoSuchMethodException -> 0x006c }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x006c }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x006c }
            r12.iiIliillii = r7     // Catch:{ NoSuchMethodException -> 0x006c }
            return r8
        L_0x006c:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x008f }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x008f }
            java.lang.String r9 = "Qk0+58ufWWJXUQnb0IY=\n"
            java.lang.String r10 = "JShKt7n2NAM=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x008f }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x008f }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x008f }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x008f }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x008f }
            r10[r5] = r11     // Catch:{ NoSuchMethodException -> 0x008f }
            r10[r4] = r11     // Catch:{ NoSuchMethodException -> 0x008f }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x008f }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x008f }
            r12.iiIliillii = r5     // Catch:{ NoSuchMethodException -> 0x008f }
            return r8
        L_0x008f:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x00b0 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x00b0 }
            java.lang.String r9 = "8KpCX3whCSLltnVjZzg=\n"
            java.lang.String r10 = "l882Dw5IZEM=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00b0 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00b0 }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x00b0 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b0 }
            r10[r7] = r11     // Catch:{ NoSuchMethodException -> 0x00b0 }
            r10[r5] = r1     // Catch:{ NoSuchMethodException -> 0x00b0 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00b0 }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x00b0 }
            r12.iiIliillii = r4     // Catch:{ NoSuchMethodException -> 0x00b0 }
            return r8
        L_0x00b0:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.String r9 = "LBzGQYRNmlA5APF9n1Q=\n"
            java.lang.String r10 = "S3myEfYk9zE=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r10[r5] = r11     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r10[r4] = r11     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r10[r3] = r11     // Catch:{ NoSuchMethodException -> 0x00d7 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x00d7 }
            r12.iiIliillii = r3     // Catch:{ NoSuchMethodException -> 0x00d7 }
            return r8
        L_0x00d7:
            android.os.IInterface r8 = r12.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0103 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0103 }
            java.lang.String r9 = "kzlGwDEVJFyGJXH8Kgw=\n"
            java.lang.String r10 = "9FwykEN8ST0=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10 = 7
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r6] = r1     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r7] = r1     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r4] = r1     // Catch:{ NoSuchMethodException -> 0x0103 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r3] = r11     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r2] = r11     // Catch:{ NoSuchMethodException -> 0x0103 }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0103 }
            r10[r0] = r11     // Catch:{ NoSuchMethodException -> 0x0103 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0103 }
            r12.i1LIL11l = r8     // Catch:{ NoSuchMethodException -> 0x0103 }
            r12.iiIliillii = r2     // Catch:{ NoSuchMethodException -> 0x0103 }
            return r8
        L_0x0103:
            android.os.IInterface r8 = r12.iiI1L1iI
            java.lang.Class r8 = r8.getClass()
            java.lang.String r9 = "87Cb20tZz3nmrKznUEA=\n"
            java.lang.String r10 = "lNXvizkwohg=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r2[r6] = r1
            r2[r7] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r2[r5] = r6
            r2[r4] = r6
            r2[r3] = r1
            java.lang.reflect.Method r1 = r8.getMethod(r9, r2)
            r12.i1LIL11l = r1
            r12.iiIliillii = r0
        L_0x0127:
            java.lang.reflect.Method r0 = r12.i1LIL11l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IiIIl1LI1i.iiIliillii():java.lang.reflect.Method");
    }

    public boolean iilLiIIIi11i(CharSequence charSequence) {
        try {
            IiIIlIL(I11lLL1(), this.iilLil1i11I1, this.iiI1L1iI, ClipData.newPlainText((CharSequence) null, charSequence));
            return true;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JWwR6qlQnY0SIw3oux+Yh0ZuAfKlH5c=\n", "ZgNkhs1w8+I=\n"), e);
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method il1LilLllii() throws java.lang.NoSuchMethodException {
        /*
            r11 = this;
            r0 = 4
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.reflect.Method r5 = r11.il1LilLllii
            if (r5 != 0) goto L_0x0097
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            java.lang.Class<android.content.IOnPrimaryClipChangedListener> r7 = android.content.IOnPrimaryClipChangedListener.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r5 >= r6) goto L_0x002e
            android.os.IInterface r0 = r11.iiI1L1iI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = "fECCAMudzBJvXaU80ITiG3xKgTXduMgAaUGINcs=\n"
            java.lang.String r5 = "HSTmULn0oXM=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r5)
            java.lang.Class[] r4 = new java.lang.Class[r4]
            r4[r3] = r7
            r4[r2] = r8
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)
            r11.il1LilLllii = r0
            goto L_0x0097
        L_0x002e:
            android.os.IInterface r5 = r11.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x004f }
            java.lang.String r6 = "nYNCBgCVcZOOnmU6G4xfmp2JQTMWsHWBiIJIMwA=\n"
            java.lang.String r9 = "/OcmVnL8HPI=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)     // Catch:{ NoSuchMethodException -> 0x004f }
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x004f }
            r9[r3] = r7     // Catch:{ NoSuchMethodException -> 0x004f }
            r9[r2] = r8     // Catch:{ NoSuchMethodException -> 0x004f }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004f }
            r9[r4] = r10     // Catch:{ NoSuchMethodException -> 0x004f }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r9)     // Catch:{ NoSuchMethodException -> 0x004f }
            r11.il1LilLllii = r5     // Catch:{ NoSuchMethodException -> 0x004f }
            r11.I11lLL1 = r3     // Catch:{ NoSuchMethodException -> 0x004f }
            goto L_0x0097
        L_0x004f:
            android.os.IInterface r5 = r11.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0072 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x0072 }
            java.lang.String r6 = "L364AuzAEcQ8Y58+99k/zS90uzf65RXWOn+yN+w=\n"
            java.lang.String r9 = "ThrcUp6pfKU=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0072 }
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0072 }
            r9[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0072 }
            r9[r2] = r8     // Catch:{ NoSuchMethodException -> 0x0072 }
            r9[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0072 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0072 }
            r9[r1] = r10     // Catch:{ NoSuchMethodException -> 0x0072 }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0072 }
            r11.il1LilLllii = r5     // Catch:{ NoSuchMethodException -> 0x0072 }
            r11.I11lLL1 = r2     // Catch:{ NoSuchMethodException -> 0x0072 }
            goto L_0x0097
        L_0x0072:
            android.os.IInterface r5 = r11.iiI1L1iI
            java.lang.Class r5 = r5.getClass()
            java.lang.String r6 = "07qu2XzHOprAp4nlZ94Uk9Owrexq4j6Ixruk7Hw=\n"
            java.lang.String r9 = "st7KiQ6uV/s=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r9)
            r9 = 5
            java.lang.Class[] r9 = new java.lang.Class[r9]
            r9[r3] = r7
            r9[r2] = r8
            r9[r4] = r8
            java.lang.Class r2 = java.lang.Integer.TYPE
            r9[r1] = r2
            r9[r0] = r2
            java.lang.reflect.Method r0 = r5.getMethod(r6, r9)
            r11.il1LilLllii = r0
            r11.I11lLL1 = r4
        L_0x0097:
            java.lang.reflect.Method r0 = r11.il1LilLllii
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IiIIl1LI1i.il1LilLllii():java.lang.reflect.Method");
    }
}
