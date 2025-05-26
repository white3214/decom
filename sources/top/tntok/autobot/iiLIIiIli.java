package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.IContentProvider;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.provider.ContactsContract;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"PrivateApi,DiscouragedPrivateApi"})
public final class iiLIIiIli {
    public int I11lLL1;
    public int IiIIlIL;
    public Method i1LIL11l;
    public Method iLLLILIiLi1Ii;
    public final IInterface iiI1L1iI;
    public Method iiIliillii;
    public Method iilLil1i11I1;
    public Method il1LilLllii;
    public boolean illlI1lLIL = true;

    public iiLIIiIli(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public static iiLIIiIli iiI1L1iI() {
        try {
            return new iiLIIiIli((IInterface) Class.forName(C0387o0OOoO0o.iiI1L1iI("e0AYr0h4KjF7XgzzZnI6dmxHCKRqcCB+fUsOk0ZlJ2l/\n", "Gi583ScRTh8=\n")).getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("P77kM0UBFaY0rw==\n", "WNuQdyBndNM=\n"), (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    public final Method I11lLL1() throws NoSuchMethodException {
        if (this.iiIliillii == null) {
            this.iiIliillii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("hmOdGw5eAm2QXI4bAGwRZw==\n", "4AzveGsNdgI=\n"), new Class[]{String.class, Integer.TYPE});
        }
        return this.iiIliillii;
    }

    public ComponentName I1iIiIi() {
        List<ActivityManager.RunningTaskInfo> IiiL1llIIi = IiiL1llIIi(1);
        if (IiiL1llIIi != null) {
            return IiiL1llIIi.get(0).topActivity;
        }
        return null;
    }

    public void IL1lILLLL1L(String str, IBinder iBinder) {
        try {
            IiIIlIL().invoke(this.iiI1L1iI, new Object[]{str, iBinder});
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("ck3i0dQZJvtFAv7TxlYj8RFP8snYViw=\n", "MSKXvbA5SJQ=\n"), e);
        }
    }

    public int Ii1liIIIiLi(Intent intent, Bundle bundle) {
        Object[] objArr;
        try {
            Method iilLiIIIi11i = iilLiIIIi11i();
            if (this.IiIIlIL != 0) {
                objArr = new Object[]{null, C0387o0OOoO0o.iiI1L1iI("zu22W9ddXsHC679bxVtf38E=\n", "rYLbdbYzOrM=\n"), intent, null, null, null, 0, 0, null, bundle, -2};
            } else {
                objArr = new Object[]{null, C0387o0OOoO0o.iiI1L1iI("2ry1JSbMWJnWurwlNMpZh9U=\n", "udPYC0eiPOs=\n"), null, intent, null, null, null, 0, 0, null, bundle, -2};
            }
            return ((Integer) iilLiIIIi11i.invoke(this.iiI1L1iI, objArr)).intValue();
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("4VBD23odcX/WH1/ZaFJ0dYJSU8N2Uns=\n", "oj82tx49HxA=\n"), e);
            return 0;
        }
    }

    public final Method IiIIlIL() throws NoSuchMethodException {
        if (this.il1LilLllii == null) {
            this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("kpVqftsI2i+OhGJ/2T3rL5aZY3TfKOE0hYJpcME=\n", "4PAHEa1tmUA=\n"), new Class[]{String.class, IBinder.class});
        }
        return this.il1LilLllii;
    }

    public List<ActivityManager.RunningTaskInfo> IiiL1llIIi(int i) {
        try {
            return (List) iILiI1lll().invoke(this.iiI1L1iI, this.I11lLL1 != 0 ? new Object[]{Integer.valueOf(i), 0} : new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("U/j14gDIGztkt+ngEoceMTD65foMhxE=\n", "EJeAjmTodVQ=\n"), e);
            return null;
        }
    }

    public boolean IilL11ii1I1Il(String str, String str2) {
        Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("Tb/YY4h7aeVFv8h0iWYjqk+l1X6JPECKZZ8=\n", "LNG8EecSDcs=\n"));
        intent.addFlags(270532608);
        intent.addCategory(C0387o0OOoO0o.iiI1L1iI("epz7FBC2Y6pynOsDEasp53qG+gEQrX6qV7PKKDyXQtY=\n", "G/KfZn/fB4Q=\n"));
        intent.setComponent(new ComponentName(str, str2));
        Ii1liIIIiLi(intent, (Bundle) null);
        return true;
    }

    public int i111iLiiIIill(Intent intent, Bundle bundle) {
        return Ii1liIIIiLi(intent, bundle);
    }

    public HashMap<String, String> i1L1lLllLLlIi() {
        ComponentName I1iIiIi = I1iIiIi();
        String shortClassName = I1iIiIi.getShortClassName();
        String className = I1iIiIi.getClassName();
        String packageName = I1iIiIi.getPackageName();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("trLTeVw+Jle2qfJqRRg=\n", "xdq8Cyh9SjY=\n"), shortClassName);
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("0/0wS1jy21HV\n", "sJFROCu8ujw=\n"), className);
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("+haiIA9tmlrrGqQ=\n", "infBS24K/xQ=\n"), packageName);
        return hashMap;
    }

    public iI1LI1ILLllI i1LIL11l() {
        Binder binder = new Binder();
        String authority = ContactsContract.CommonDataKinds.Phone.CONTENT_URI.getAuthority();
        return new iI1LI1ILLllI(this, iilLil1i11I1(authority, binder), authority, binder);
    }

    public final Method iILiI1lll() throws NoSuchMethodException {
        if (this.iilLil1i11I1 == null) {
            try {
                this.iilLil1i11I1 = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("RFA9t6j41GU=\n", "IzVJ48mLvxY=\n"), new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                Class<?> cls = this.iiI1L1iI.getClass();
                String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("POg7y3MonJI=\n", "W41PnxJb9+E=\n");
                Class cls2 = Integer.TYPE;
                this.iilLil1i11I1 = cls.getMethod(iiI1L1iI2, new Class[]{cls2, cls2});
                this.I11lLL1 = 1;
            }
        }
        return this.iilLil1i11I1;
    }

    public int iL1LIlIlI(Intent intent) {
        return i111iLiiIIill(intent, (Bundle) null);
    }

    public final Method iLLLILIiLi1Ii() throws NoSuchMethodException {
        Class<IBinder> cls = IBinder.class;
        Class<String> cls2 = String.class;
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("pZ4lQg47M5usjwFzDiMumqeJFHkVMDWQo5c=\n", "wvtRAWFVR/4=\n"), new Class[]{cls2, Integer.TYPE, cls, cls2});
            } catch (NoSuchMethodException unused) {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("PhkpTgZcEQg3CA1/BkQMCTwOGHUdVxcDOBA=\n", "WXxdDWkyZW0=\n"), new Class[]{cls2, Integer.TYPE, cls});
                this.illlI1lLIL = false;
            }
        }
        return this.i1LIL11l;
    }

    public void iiIliillii(String str) {
        try {
            I11lLL1().invoke(this.iiI1L1iI, new Object[]{str, -2});
        } catch (Throwable th) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GFKIt/xIXQEvHZS17gdYC3tQmK/wB1c=\n", "Wz3925hoM24=\n"), th);
        }
    }

    public final Method iilLiIIIi11i() throws NoSuchMethodException, ClassNotFoundException {
        Class<Bundle> cls = Bundle.class;
        Class<IBinder> cls2 = IBinder.class;
        Class<Intent> cls3 = Intent.class;
        Class<String> cls4 = String.class;
        if (this.iLLLILIiLi1Ii == null) {
            Class<?> cls5 = Class.forName(C0387o0OOoO0o.iiI1L1iI("91tML+CgSOT3RVhzxohcuvpcSzz7oEOkwl1aOO6t\n", "ljUoXY/JLMo=\n"));
            Class<?> cls6 = Class.forName(C0387o0OOoO0o.iiI1L1iI("QpnsrqCDWKxCh/jyn5hT5Eqb7a6GhFrt\n", "I/eI3M/qPII=\n"));
            try {
                Class<?> cls7 = this.iiI1L1iI.getClass();
                String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("4rhnZq8FiMH4um9gogWY4OKpdEOyMIPz9K1yYakh\n", "kcwGFNtE67U=\n");
                Class cls8 = Integer.TYPE;
                this.iLLLILIiLi1Ii = cls7.getMethod(iiI1L1iI2, new Class[]{cls5, cls4, cls4, cls3, cls4, cls2, cls4, cls8, cls8, cls6, cls, cls8});
            } catch (NoSuchMethodException unused) {
                Class<?> cls9 = this.iiI1L1iI.getClass();
                String iiI1L1iI3 = C0387o0OOoO0o.iiI1L1iI("7Wz+ZEUa29D3bvZiSBrL8e197Q==\n", "nhifFjFbuKQ=\n");
                Class cls10 = Integer.TYPE;
                this.iLLLILIiLi1Ii = cls9.getMethod(iiI1L1iI3, new Class[]{cls5, cls4, cls3, cls4, cls2, cls4, cls10, cls10, cls6, cls, cls10});
                this.IiIIlIL = 1;
            }
        }
        return this.iLLLILIiLi1Ii;
    }

    @TargetApi(29)
    public IContentProvider iilLil1i11I1(String str, IBinder iBinder) {
        try {
            Object invoke = iLLLILIiLi1Ii().invoke(this.iiI1L1iI, this.illlI1lLIL ? new Object[]{str, 0, iBinder, null} : new Object[]{str, 0, iBinder});
            if (invoke == null) {
                return null;
            }
            Field declaredField = invoke.getClass().getDeclaredField(C0387o0OOoO0o.iiI1L1iI("DGXKLk3LTNk=\n", "fBelWCSvKas=\n"));
            declaredField.setAccessible(true);
            return (IContentProvider) declaredField.get(invoke);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("jjNwrPJku+e5fGyu4Cu+7e0xYLT+K7E=\n", "zVwFwJZE1Yg=\n"), e);
            return null;
        }
    }

    public iI1LI1ILLllI il1LilLllii() {
        String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("VWKL\n", "Jg/4/27BPjw=\n");
        Binder binder = new Binder();
        return new iI1LI1ILLllI(this, iilLil1i11I1(iiI1L1iI2, binder), iiI1L1iI2, binder);
    }

    public iI1LI1ILLllI illlI1lLIL() {
        Binder binder = new Binder();
        IContentProvider iilLil1i11I12 = iilLil1i11I1(C0387o0OOoO0o.iiI1L1iI("HWNjpE6Xq+s=\n", "bgYX0Cf5zJg=\n"), binder);
        if (iilLil1i11I12 == null) {
            return null;
        }
        return new iI1LI1ILLllI(this, iilLil1i11I12, C0387o0OOoO0o.iiI1L1iI("02YrF2f9sOA=\n", "oANfYw6T15M=\n"), binder);
    }
}
