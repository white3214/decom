package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.IBinder;
import android.system.Os;
import java.lang.reflect.Method;

@SuppressLint({"PrivateApi", "SoonBlockedPrivateApi", "BlockedPrivateApi"})
@TargetApi(34)
/* renamed from: top.tntok.autobot.OooOooo  reason: case insensitive filesystem */
public final class C0025OooOooo {
    public static Method i1LIL11l;
    public static final Class<?> iiI1L1iI;
    public static Method illlI1lLIL;

    static {
        Class<String> cls = String.class;
        Class<?> cls2 = null;
        try {
            cls2 = ((ClassLoader) Class.forName(C0387o0OOoO0o.iiI1L1iI("JzEg5WU5JmYrNynlbTk2cTYwLKcqODE6BzIsuHcbLXUgOz+NZTQ2ezYn\n", "RF5NywRXQhQ=\n")).getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("t63m7mRCHnK1rPDDf0Y5e6Y=\n", "1N+DjxAnXR4=\n"), new Class[]{cls, cls, cls, ClassLoader.class, Integer.TYPE, Boolean.TYPE, cls}).invoke((Object) null, new Object[]{Os.getenv(C0387o0OOoO0o.iiI1L1iI("BOePfr1LvNkF6Jl4u0quzwTunX6w\n", "V77cKvgG75w=\n")), null, null, ClassLoader.getSystemClassLoader(), 0, Boolean.TRUE, null})).loadClass(C0387o0OOoO0o.iiI1L1iI("o9lov8MqgLqv32G/0SGWvqXEK/XLN5Skoc8r1cs3lKShz0b+zDCWp6w=\n", "wLYFkaJE5Mg=\n"));
            Method declaredMethod = Runtime.class.getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("khelB7B9/JCfCr1T\n", "/njEY/wUnuI=\n"), new Class[]{Class.class, cls});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Runtime.getRuntime(), new Object[]{cls2, C0387o0OOoO0o.iiI1L1iI("3mHc8vtpesbMasr28XJt\n", "vw+4gJQAHpk=\n")});
        } catch (Throwable th) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("YBgKFLL/FOBXVxYWv6sT7k8eBR32mxP8UxseAZWwFPtRGBM=\n", "I3d/eNbfeo8=\n"), th);
        }
        iiI1L1iI = cls2;
    }

    public static Method i1LIL11l() throws NoSuchMethodException {
        if (i1LIL11l == null) {
            i1LIL11l = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("P90Rsmn62Rw72QmmaPDaGTnBMY1q5sQ=\n", "WLhl4gGDqnU=\n"), new Class[]{Long.TYPE});
        }
        return i1LIL11l;
    }

    public static Method iiI1L1iI() throws NoSuchMethodException {
        if (illlI1lLIL == null) {
            illlI1lLIL = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("mqlYYU/snaWerUB1TuaeoJy1ZVVU\n", "/cwsMSeV7sw=\n"), (Class[]) null);
        }
        return illlI1lLIL;
    }

    public static IBinder il1LilLllii(long j) {
        try {
            return (IBinder) i1LIL11l().invoke((Object) null, new Object[]{Long.valueOf(j)});
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("qYRMOL6FnDaey1A6rMqZPMqGXCCyypY=\n", "6us5VNql8lk=\n"), e);
            return null;
        }
    }

    public static long[] illlI1lLIL() {
        try {
            return (long[]) iiI1L1iI().invoke((Object) null, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("EtH7RadoCb4lnudHtScMtHHT612rJwM=\n", "Ub6OKcNIZ9E=\n"), e);
            return null;
        }
    }
}
