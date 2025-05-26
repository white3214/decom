package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Display;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"PrivateApi,DiscouragedPrivateApi"})
/* renamed from: top.tntok.autobot.Oooo00o  reason: case insensitive filesystem */
public final class C0028Oooo00o {
    public static final long il1LilLllii = 4;
    public Method i1LIL11l;
    public final Object iiI1L1iI;
    public Method illlI1lLIL;

    /* renamed from: top.tntok.autobot.Oooo00o$i1LIL11l */
    public interface i1LIL11l {
        void iiI1L1iI(int i);
    }

    /* renamed from: top.tntok.autobot.Oooo00o$illlI1lLIL */
    public static final class illlI1lLIL {
        public final Object iiI1L1iI;

        public illlI1lLIL(Object obj) {
            this.iiI1L1iI = obj;
        }
    }

    public C0028Oooo00o(Object obj) {
        this.iiI1L1iI = obj;
    }

    public static int IiiL1llIIi(String str) {
        Pattern compile = Pattern.compile(C0387o0OOoO0o.iiI1L1iI("J4xXamhLIcc7n0sG\n", "YcAWLTcQYOo=\n"));
        int i = 0;
        if (str == null) {
            return 0;
        }
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            try {
                i = Display.class.getDeclaredField(matcher.group()).getInt((Object) null) | i;
            } catch (ReflectiveOperationException unused) {
            }
        }
        return i;
    }

    public static C0028Oooo00o i1LIL11l() {
        try {
            return new C0028Oooo00o(Class.forName(C0387o0OOoO0o.iiI1L1iI("tjgUehG9u8i/NwJsCbWtg/kyGXsOuL6f+RIZew64vp+aNx5pGbGtobs5EmkS\n", "11ZwCH7U3+Y=\n")).getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("WYM7ezDVsytQhSo=\n", "PuZPMl6mx0o=\n"), (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    public static Oooo000 iILiI1lll(String str, int i) {
        Matcher matcher = Pattern.compile(C0387o0OOoO0o.iiI1L1iI("E6EVTt19y6go80cHmXXAtz7xWQ+EWeq4IrxxB45g6L80yFsIkkz//GOrCkLddO2tPe1UF7R0pA==\n", "TYE1bv0QhN4=\n") + i + C0387o0OOoO0o.iiI1L1iI("+C4dG1IEON6XQ30dVA1BvvZ2R1ISBFbJ5ikbblUNXur2LHkDUx0juf8qCAxSBAz9omVWWhFKXrqN\nNA8KIw9XvPw7DhMaQRDhv3BbE1Z/Tr/vWQkaUA5BvvZoQ0obVi3mt2dJE1Z/Tr/vWQka\n", "1gQiM34kfpI=\n"), 8).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        int IiiL1llIIi = IiiL1llIIi(matcher.group(1));
        int parseInt = Integer.parseInt(matcher.group(2));
        int parseInt2 = Integer.parseInt(matcher.group(3));
        int parseInt3 = Integer.parseInt(matcher.group(4));
        int parseInt4 = Integer.parseInt(matcher.group(5));
        return new Oooo000(i, new C0363o0OOOo0O(parseInt, parseInt2), parseInt3, Integer.parseInt(matcher.group(6)), IiiL1llIIi, parseInt4);
    }

    public static Oooo000 iLLLILIiLi1Ii(int i) {
        try {
            return iILiI1lll(Ii1l11i1IiL1.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("LosK4m8Idw==\n", "Sv5nkhxxBGE=\n"), C0387o0OOoO0o.iiI1L1iI("yQB2e850tw==\n", "rWkFC6IVzmA=\n")), i);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JOEow4z++h4TrjrKnP7wGBT+Mc6R/v0fAeF9yZqx+VFF6ijCmK3tAkfqNNyYsvUIRa4y2pyu4QU=\n", "Z45dr+jelHE=\n"), e);
            return null;
        }
    }

    public static /* synthetic */ Object iilLiIIIi11i(i1LIL11l i1lil11l, Object obj, Method method, Object[] objArr) throws Throwable {
        if (C0387o0OOoO0o.iiI1L1iI("2HljTiGBmvDOVE9GPJaT9Q==\n", "txcnJ1Lx9pE=\n").equals(method.getName())) {
            i1lil11l.iiI1L1iI(objArr[0].intValue());
        }
        if (C0387o0OOoO0o.iiI1L1iI("tmoEzcEGDQU=\n", "wgVXubNvY2I=\n").equals(method.getName())) {
            return C0387o0OOoO0o.iiI1L1iI("9AZRNu4l5VHZHFYj7CHu\n", "sG8iRoJEnB0=\n");
        }
        return null;
    }

    public Oooo000 I11lLL1(int i) {
        try {
            Object invoke = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("P7wHN4pFQOk5oDodhVk=\n", "WNlzc+M2MIU=\n"), new Class[]{Integer.TYPE}).invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i)});
            if (invoke == null) {
                return iLLLILIiLi1Ii(i);
            }
            Class<?> cls = invoke.getClass();
            int i2 = cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("HsChVjIb5kMby7JX\n", "cq/GP1F6ihQ=\n")).getInt(invoke);
            int i3 = cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("w/dH2HylJ+rK8UfZaw==\n", "r5ggsR/ES6I=\n")).getInt(invoke);
            return new Oooo000(i, new C0363o0OOOo0O(i2, i3), cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("9HJkM0ZIGF4=\n", "hh0QUjIhdzA=\n")).getInt(invoke), cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("vEwskV9nXuWzRg==\n", "0C1V9C00KoQ=\n")).getInt(invoke), cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("aq/owVU=\n", "DMOJpiYVxXU=\n")).getInt(invoke), cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("2+SGn6bdETXS5ZKfscU5Ad4=\n", "t4vh9sW8fXE=\n")).getInt(invoke));
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|3|4|5|7|8|9|10|11|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0096 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public top.tntok.autobot.C0028Oooo00o.illlI1lLIL I1iIiIi(top.tntok.autobot.C0028Oooo00o.i1LIL11l r17, android.os.Handler r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            java.lang.Class<android.os.Handler> r6 = android.os.Handler.class
            java.lang.String r8 = "OnLi642oEYIzffT9laAHyXV47+qSrRTVdVjv6pKtFNUWfej4haQHiB919emOoAzgMm/y/IykBw==\n"
            java.lang.String r9 = "WxyGmeLBdaw=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)     // Catch:{ Exception -> 0x0066 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x0066 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0066 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0066 }
            r10[r4] = r8     // Catch:{ Exception -> 0x0066 }
            top.tntok.autobot.Oooo00O r11 = new top.tntok.autobot.Oooo00O     // Catch:{ Exception -> 0x0066 }
            r12 = r17
            r11.<init>(r12)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r9 = java.lang.reflect.Proxy.newProxyInstance(r9, r10, r11)     // Catch:{ Exception -> 0x0066 }
            r10 = 4
            java.lang.Object r12 = r1.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Class r12 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.String r13 = "AO7ZedwCTzw24s1gwxdTAhv4ynXBE1g=\n"
            java.lang.String r14 = "cou+EK92Kk4=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Class[] r14 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0068 }
            r14[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0068 }
            r14[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Class r15 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x0068 }
            r14[r3] = r15     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r14[r2] = r15     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r14)     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Object r13 = r1.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.String r15 = "eRTd3EvfCJF1EtTcWdkJj3Y=\n"
            java.lang.String r7 = "Gnuw8iqxbOM=\n"
            java.lang.String r7 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r15, r7)     // Catch:{ NoSuchMethodException -> 0x0068 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0068 }
            r0[r4] = r9     // Catch:{ NoSuchMethodException -> 0x0068 }
            r0[r5] = r18     // Catch:{ NoSuchMethodException -> 0x0068 }
            r0[r3] = r14     // Catch:{ NoSuchMethodException -> 0x0068 }
            r0[r2] = r7     // Catch:{ NoSuchMethodException -> 0x0068 }
            r12.invoke(r13, r0)     // Catch:{ NoSuchMethodException -> 0x0068 }
            goto L_0x00b9
        L_0x0066:
            r0 = move-exception
            goto L_0x00c0
        L_0x0068:
            java.lang.Object r0 = r1.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.String r7 = "ZG91VIadzgZSY2FNmYjSOH95ZlibjNk=\n"
            java.lang.String r12 = "FgoSPfXpq3Q=\n"
            java.lang.String r7 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r7, r12)     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0096 }
            r12[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0096 }
            r12[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x0096 }
            r12[r3] = r13     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.reflect.Method r0 = r0.getMethod(r7, r12)     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Object r7 = r1.iiI1L1iI     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0096 }
            r2[r4] = r9     // Catch:{ NoSuchMethodException -> 0x0096 }
            r2[r5] = r18     // Catch:{ NoSuchMethodException -> 0x0096 }
            r2[r3] = r10     // Catch:{ NoSuchMethodException -> 0x0096 }
            r0.invoke(r7, r2)     // Catch:{ NoSuchMethodException -> 0x0096 }
            goto L_0x00b9
        L_0x0096:
            java.lang.Object r0 = r1.iiI1L1iI     // Catch:{ Exception -> 0x0066 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = "A5CILAco9NM1nJw1GD3o7RiGmyAaOeM=\n"
            java.lang.String r7 = "cfXvRXRckaE=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0066 }
            r7[r4] = r8     // Catch:{ Exception -> 0x0066 }
            r7[r5] = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r7)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r2 = r1.iiI1L1iI     // Catch:{ Exception -> 0x0066 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0066 }
            r3[r4] = r9     // Catch:{ Exception -> 0x0066 }
            r3[r5] = r18     // Catch:{ Exception -> 0x0066 }
            r0.invoke(r2, r3)     // Catch:{ Exception -> 0x0066 }
        L_0x00b9:
            top.tntok.autobot.Oooo00o$illlI1lLIL r0 = new top.tntok.autobot.Oooo00o$illlI1lLIL     // Catch:{ Exception -> 0x0066 }
            r2 = 0
            r0.<init>(r9)     // Catch:{ Exception -> 0x0066 }
            return r0
        L_0x00c0:
            java.lang.String r2 = "lydtdKJi9PegaGp9oSvp7LE6OHyvMer0tTE4dK8x7v26LWo=\n"
            java.lang.String r3 = "1EgYGMZCmpg=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            top.tntok.autobot.C0525o0oOO.il1LilLllii(r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0028Oooo00o.I1iIiIi(top.tntok.autobot.Oooo00o$i1LIL11l, android.os.Handler):top.tntok.autobot.Oooo00o$illlI1lLIL");
    }

    public void IL1lILLLL1L(illlI1lLIL illli1llil) {
        try {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("Sr/fn+2ahH5DsMmJ9ZKSNQW10p7yn4EpBZXSnvKfgSlmsNWM5ZaSdG+4yJ3ukpkcQqLPiOyWkg==\n", "K9G77YLz4FA=\n"));
            this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("0dLEyCUpMuPBzvLEMTAt9t3w3942JS/y1g==\n", "pLy2rUJAQZc=\n"), new Class[]{cls}).invoke(this.iiI1L1iI, new Object[]{illli1llil.iiI1L1iI});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("XcxxXLFaNztqg3Fepx8+PW3XYUL1HjAnbs9lSfUWMCdqxmpVpw==\n", "HqMEMNV6WVQ=\n"), e);
        }
    }

    public final Method IiIIlIL() throws NoSuchMethodException {
        if (this.illlI1lLIL == null) {
            this.illlI1lLIL = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("bS074JLsUft2Ozr5luZ10GgtOA==\n", "H0hKlfefJb8=\n"), new Class[]{Integer.TYPE, Boolean.TYPE});
        }
        return this.illlI1lLIL;
    }

    @TargetApi(35)
    public boolean i1L1lLllLLlIi(int i, boolean z) {
        try {
            return ((Boolean) IiIIlIL().invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("EOxzUkO7JmUno29QUfQjb3PuY0pP9Cw=\n", "U4MGPiebSAo=\n"), e);
            return false;
        }
    }

    public final Method iiIliillii() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("zG/Qn/pfjIvdacCf4n6zkd9x1Ic=\n", "rx21/o462uI=\n");
            Class cls = Integer.TYPE;
            this.i1LIL11l = DisplayManager.class.getMethod(iiI1L1iI2, new Class[]{String.class, cls, cls, cls, Surface.class});
        }
        return this.i1LIL11l;
    }

    public int[] iilLil1i11I1() {
        try {
            return (int[]) this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("od4rfyJUGCGnwhZfOA==\n", "xrtfO0snaE0=\n"), (Class[]) null).invoke(this.iiI1L1iI, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    public VirtualDisplay il1LilLllii(String str, int i, int i2, int i3, Surface surface) throws Exception {
        return (VirtualDisplay) iiIliillii().invoke((Object) null, new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), surface});
    }

    public VirtualDisplay illlI1lLIL(String str, int i, int i2, int i3, Surface surface, int i4) throws Exception {
        Constructor<DisplayManager> declaredConstructor = DisplayManager.class.getDeclaredConstructor(new Class[]{Context.class});
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(new Object[]{FakeContext.iiI1L1iI()}).createVirtualDisplay(str, i, i2, i3, surface, i4);
    }
}
