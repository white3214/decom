package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"PrivateApi"})
/* renamed from: top.tntok.autobot.o0OOooOO  reason: case insensitive filesystem */
public final class C0398o0OOooOO {
    public static Method I11lLL1 = null;
    public static Method IiIIlIL = null;
    public static final int i1LIL11l = 0;
    public static Method iLLLILIiLi1Ii = null;
    public static final Class<?> iiI1L1iI;
    public static Method iiIliillii = null;
    public static int iilLiIIIi11i = 0;
    public static Method iilLil1i11I1 = null;
    public static Method il1LilLllii = null;
    public static final int illlI1lLIL = 2;

    static {
        try {
            iiI1L1iI = Class.forName(C0387o0OOoO0o.iiI1L1iI("CuCogV1U6nwd56mEHG77IA3vr5ZxUuAmGeGg\n", "a47M8zI9jlI=\n"));
        } catch (ClassNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    public static Method I11lLL1() throws NoSuchMethodException {
        if (il1LilLllii == null) {
            if (Build.VERSION.SDK_INT < 29) {
                il1LilLllii = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("roDqIDZrGY+Ai9oLMHIZmrA=\n", "yeWeYkMCdfs=\n"), new Class[]{Integer.TYPE});
            } else {
                il1LilLllii = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("9aojy8DGwCn8rjvGx8HVN/O2A+3F18s=\n", "ks9Xgq6ypVs=\n"), (Class[]) null);
            }
        }
        return il1LilLllii;
    }

    public static Method I1iIiIi() throws NoSuchMethodException {
        if (iiIliillii == null) {
            iiIliillii = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("qmy459MgQKm4cJzMzTZCiLZtqQ==\n", "2QnMo7pTMMU=\n"), new Class[]{IBinder.class, Integer.TYPE});
        }
        return iiIliillii;
    }

    public static void I1l1iIll1lIi1(IBinder iBinder, int i, Rect rect, Rect rect2) {
        try {
            Class<Rect> cls = Rect.class;
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("GdljAdv/VTULxUc33eZAOh7VeCs=\n", "arwXRbKMJVk=\n"), new Class[]{IBinder.class, Integer.TYPE, cls, cls}).invoke((Object) null, new Object[]{iBinder, Integer.valueOf(i), rect, rect2});
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static boolean IL1lILLLL1L() {
        try {
            iLLLILIiLi1Ii();
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public static void Ii1liIIIiLi(IBinder iBinder, int i) {
        try {
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("mY4jUnT8DWaLkht3ZOoPWZ6KNH0=\n", "6utXFh2PfQo=\n"), new Class[]{IBinder.class, Integer.TYPE}).invoke((Object) null, new Object[]{iBinder, Integer.valueOf(i)});
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static Method IiIIlIL() throws NoSuchMethodException {
        if (iilLil1i11I1 == null) {
            iilLil1i11I1 = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("53Fig9Q2JbHjdXqX1TwmtOFtQrzXKjg=\n", "gBQW07xPVtg=\n"), new Class[]{Long.TYPE});
        }
        return iilLil1i11I1;
    }

    public static IBinder IiiL1llIIi(long j) {
        try {
            return (IBinder) IiIIlIL().invoke((Object) null, new Object[]{Long.valueOf(j)});
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("eP5KrP72GL5PsVau7LkdtBv8WrTyuRI=\n", "O5E/wJrWdtE=\n"), e);
            return null;
        }
    }

    public static boolean IilL11ii1I1Il(IBinder iBinder, int i) {
        try {
            I1iIiIi().invoke((Object) null, new Object[]{iBinder, Integer.valueOf(i)});
            return true;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("vu5CjKv221mJoV6OubneU93sUpSnudE=\n", "/YE34M/WtTY=\n"), e);
            return false;
        }
    }

    public static Bitmap i111iLiiIIill(int i, int i2, int i3) {
        Object[] objArr;
        try {
            Method iILiI1lll = iILiI1lll();
            int i4 = iilLiIIIi11i;
            if (i4 == 1) {
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2)};
            } else if (i4 == 2) {
                objArr = new Object[]{new Rect(0, 0, i, i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            } else if (i4 != 3) {
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2)};
            } else {
                return (Bitmap) il1LilLllii().invoke(iILiI1lll.invoke((Object) null, new Object[]{iilLil1i11I1()}), (Object[]) null);
            }
            return (Bitmap) iILiI1lll.invoke((Object) null, objArr);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("yKEsIpZ3DN//7jAghDgJ1aujPDqaOAY=\n", "i85ZTvJXYrA=\n"), e);
            return null;
        }
    }

    public static boolean i1L1lLllLLlIi() {
        try {
            I11lLL1();
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public static IBinder i1LIL11l(String str, boolean z) throws Exception {
        return (IBinder) iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("fiy8RSCEdbduLrVFLQ==\n", "HV7ZJFThMd4=\n"), new Class[]{String.class, Boolean.TYPE}).invoke((Object) null, new Object[]{str, Boolean.valueOf(z)});
    }

    public static Method iILiI1lll() throws NoSuchMethodException {
        if (iLLLILIiLi1Ii == null) {
            try {
                iLLLILIiLi1Ii = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("lfC2T0tWj/if4rZXX10=\n", "9pHGOz4k6rw=\n"), new Class[]{Class.forName(C0387o0OOoO0o.iiI1L1iI("vzxvbf3EP2KoO25ovP4uPrgzaHrRwjU4rD1nO9bEKDyyM3Jc890vOaw3Sm313g==\n", "3lILH5KtW0w=\n"))});
                iilLiIIIi11i = 3;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Class<?> cls = iiI1L1iI;
                    String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("iH2MSjRPZneUag==\n", "+x7+L1EhFR8=\n");
                    Class cls2 = Integer.TYPE;
                    iLLLILIiLi1Ii = cls.getMethod(iiI1L1iI2, new Class[]{Rect.class, cls2, cls2, cls2});
                    iilLiIIIi11i = 2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Class<?> cls3 = iiI1L1iI;
                    String iiI1L1iI3 = C0387o0OOoO0o.iiI1L1iI("Kvs2U4AaP6M27A==\n", "WZhENuV0TMs=\n");
                    Class cls4 = Integer.TYPE;
                    iLLLILIiLi1Ii = cls3.getMethod(iiI1L1iI3, new Class[]{cls4, cls4});
                    iilLiIIIi11i = 1;
                }
            }
        }
        return iLLLILIiLi1Ii;
    }

    public static void iL1LIlIlI() {
        try {
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("IW2CQuINjXw9fIRY3xCC\n", "Th3nLLZ/7BI=\n"), (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static Method iLLLILIiLi1Ii() throws NoSuchMethodException {
        if (I11lLL1 == null) {
            I11lLL1 = iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("xvXKU19OLN3C8dJHXkQv2MDp92dE\n", "oZC+Azc3X7Q=\n"), (Class[]) null);
        }
        return I11lLL1;
    }

    public static void iiI1L1iI() {
        try {
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("MqW0tUmFkmk/urqlWLiPZg==\n", "UcnbxizR4Ag=\n"), (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static IBinder iiIliillii() {
        try {
            Method I11lLL12 = I11lLL1();
            if (Build.VERSION.SDK_INT >= 29) {
                return (IBinder) I11lLL12.invoke((Object) null, (Object[]) null);
            }
            return (IBinder) I11lLL12.invoke((Object) null, new Object[]{0});
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("DAAtbly9Bp87TzFsTvIDlW8CPXZQ8gw=\n", "T29YAjidaPA=\n"), e);
            return null;
        }
    }

    public static void iiLIIiIli(IBinder iBinder, Surface surface) {
        try {
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("bh4kICFEQ+J8AgMROlFS7Xg=\n", "HXtQZEg3M44=\n"), new Class[]{IBinder.class, Surface.class}).invoke((Object) null, new Object[]{iBinder, surface});
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static long[] iilLiIIIi11i() {
        try {
            return (long[]) iLLLILIiLi1Ii().invoke((Object) null, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Yc7R6wVt0DVWgc3pFyLVPwLMwfMJIto=\n", "IqGkh2FNvlo=\n"), e);
            return null;
        }
    }

    public static Object iilLil1i11I1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("+abUFlAf1M7uodUTESXFkv6p0wF8Gd6U6qfcQHsfw5D0qcknXgbEleqt8RZYBZSi7aHcAFoE\n", "mMiwZD92sOA=\n"));
        Constructor<?> constructor = cls.getConstructor(new Class[]{IBinder.class});
        return cls.getMethod(C0387o0OOoO0o.iiI1L1iI("tuUWNIs=\n", "1JB/WO9SuHk=\n"), (Class[]) null).invoke(constructor.newInstance(new Object[]{iiIliillii()}), (Object[]) null);
    }

    public static Method il1LilLllii() throws ClassNotFoundException, NoSuchMethodException {
        if (IiIIlIL == null) {
            IiIIlIL = Class.forName(C0387o0OOoO0o.iiI1L1iI("BUFs06yxrAMSRm3W7Yu9XwJOa8SAt6ZZFkBkhZC7ukgBQXvJrKyATBZLf8CxvYpYAklt0w==\n", "ZC8IocPYyC0=\n")).getMethod(C0387o0OOoO0o.iiI1L1iI("OxScuv3iU8U=\n", "Wmfe04mPMrU=\n"), (Class[]) null);
        }
        return IiIIlIL;
    }

    public static void illlI1lLIL(IBinder iBinder) {
        try {
            iiI1L1iI.getMethod(C0387o0OOoO0o.iiI1L1iI("tjfTVl2Nvnm7IdBOTps=\n", "0lKgIi/ixz0=\n"), new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder});
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
