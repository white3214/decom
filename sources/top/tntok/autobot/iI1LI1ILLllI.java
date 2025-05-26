package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract;
import android.provider.Telephony;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class iI1LI1ILLllI implements Closeable {
    public static final String I1I11Il1 = C0387o0OOoO0o.iiI1L1iI("mgcMO1E=\n", "7GZgTjT+nUE=\n");
    public static final String I1l1iIll1lIi1 = C0387o0OOoO0o.iiI1L1iI("pMThox4ORweG7A==\n", "44G1/G13NHM=\n");
    public static final String ILl1iII11Ll1 = C0387o0OOoO0o.iiI1L1iI("cYdY0UE2liRXrg==\n", "NsIMjiZa+UY=\n");
    public static final String Ii1liIIIiLi = C0387o0OOoO0o.iiI1L1iI("v6+gYjpJ\n", "zMrDF0gs1K0=\n");
    public static final String IilL11ii1I1Il = C0387o0OOoO0o.iiI1L1iI("iZpazb8b\n", "7vY1r953xSM=\n");
    public static final String IliiLiLliIl = C0387o0OOoO0o.iiI1L1iI("zV0rldg=\n", "kihY8Kq+geU=\n");
    public static final String i111iLiiIIill = C0387o0OOoO0o.iiI1L1iI("7XWDs3Db\n", "ngzwxxW22Kc=\n");
    public static final String i11liIIl11Ii1 = C0387o0OOoO0o.iiI1L1iI("mVkatzK0JZa7aQ==\n", "yQxO6EHRRuM=\n");
    public static final String i1iiLIil1ILi = C0387o0OOoO0o.iiI1L1iI("kAP8Iq7nDFSlOw==\n", "wFaofd2efyA=\n");
    public static final String iiLIIiIli = C0387o0OOoO0o.iiI1L1iI("OSHifazJykQMAQ==\n", "fmS2It+sqTE=\n");
    public static final String iiiiI1iILL11I = C0387o0OOoO0o.iiI1L1iI("IiXhWqW/LmUTHA==\n", "cnC1BcLTQQc=\n");
    public int I11lLL1;
    public int I1iIiIi;
    public int IL1lILLLL1L;
    public int IiIIlIL;
    public int IiiL1llIIi;
    public Method i1L1lLllLLlIi;
    public final iiLIIiIli i1LIL11l;
    public Method iILiI1lll;
    public Object iL1LIlIlI;
    public Method iLLLILIiLi1Ii;
    public final IBinder iiIliillii;
    public Method iilLiIIIi11i;
    public Method iilLil1i11I1;
    public final String il1LilLllii;
    public final Object illlI1lLIL;

    public iI1LI1ILLllI(iiLIIiIli iiliiiili, Object obj, String str, IBinder iBinder) {
        this.i1LIL11l = iiliiiili;
        this.illlI1lLIL = obj;
        this.il1LilLllii = str;
        this.iiIliillii = iBinder;
    }

    public static String IIlLLll1ll1() {
        return C0387o0OOoO0o.iiI1L1iI("jEGotScVZvyAR6G1NRNn4oM=\n", "7y7Fm0Z7Ao4=\n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String IL11lll11(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1243020381(0xffffffffb5e903a3, float:-1.7360911E-6)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -906273929(0xffffffffc9fb5b77, float:-2059118.9)
            if (r0 == r1) goto L_0x0020
            r1 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = i111iLiiIIill
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = Ii1liIIIiLi
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = IilL11ii1I1Il
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x005e
            if (r0 == r3) goto L_0x005b
            if (r0 != r2) goto L_0x003e
            java.lang.String r4 = ILl1iII11Ll1
            return r4
        L_0x003e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "11Imus63Vw/qXTK3x+QT\n"
            java.lang.String r3 = "njxQ26LeMy8=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x005b:
            java.lang.String r4 = I1l1iIll1lIi1
            return r4
        L_0x005e:
            java.lang.String r4 = iiLIIiIli
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.IL11lll11(java.lang.String):java.lang.String");
    }

    @Nullable
    public static Bundle i1LIL11l(@Nullable String str, @Nullable String[] strArr) {
        return il1LilLllii(str, strArr, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String iIiL11iL(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1243020381(0xffffffffb5e903a3, float:-1.7360911E-6)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -906273929(0xffffffffc9fb5b77, float:-2059118.9)
            if (r0 == r1) goto L_0x0020
            r1 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = i111iLiiIIill
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = Ii1liIIIiLi
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = IilL11ii1I1Il
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x005e
            if (r0 == r3) goto L_0x005b
            if (r0 != r2) goto L_0x003e
            java.lang.String r4 = iiiiI1iILL11I
            return r4
        L_0x003e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "exmThisHQDFGFoeLIlQE\n"
            java.lang.String r3 = "Mnfl50duJBE=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x005b:
            java.lang.String r4 = i1iiLIil1ILi
            return r4
        L_0x005e:
            java.lang.String r4 = i11liIIl11Ii1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.iIiL11iL(java.lang.String):java.lang.String");
    }

    @Nullable
    public static Bundle il1LilLllii(@Nullable String str, @Nullable String[] strArr, @Nullable String str2) {
        if (str == null && strArr == null && str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString(C0387o0OOoO0o.iiI1L1iI("ZYwJtdecUT91lwi1wdhUd2PPHrbU2EZgaIcOs9GaWw==\n", "BOJtx7j1NQU=\n"), str);
        }
        if (strArr != null) {
            bundle.putStringArray(C0387o0OOoO0o.iiI1L1iI("V2VeucCwplFHfl+51vSjGVEmSbrD9LEOWm5Zv8a2rEZXeV24\n", "Ngs6y6/Zwms=\n"), strArr);
        }
        if (str2 != null) {
            bundle.putString(C0387o0OOoO0o.iiI1L1iI("syxs8izhKsCjN23yOqUviLVve/EvpT2VoDYl7zHsK4g=\n", "0kIIgEOITvo=\n"), str2);
        }
        return bundle;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0082 */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method I1IILIil1lLlL() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        /*
            r16 = this;
            r0 = r16
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.Class<android.os.Bundle> r9 = android.os.Bundle.class
            java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
            java.lang.Class<android.net.Uri> r11 = android.net.Uri.class
            java.lang.reflect.Method r12 = r0.iLLLILIiLi1Ii
            if (r12 != 0) goto L_0x00e5
            java.lang.String r12 = "Qc1kJ6V5JlBDzG4hr342UGHXdCejcjcKScxuBqVlMB1F\n"
            java.lang.String r13 = "IKMAVcoQQn4=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.Object r13 = r0.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.Class r13 = r13.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.String r14 = "Crhg/7w=\n"
            java.lang.String r15 = "e80FjcXnfRM=\n"
            java.lang.String r14 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r14, r15)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.String r15 = "1cE8HDM3x7Lb3HYnHz/N/9HDNA8oN8zy58Y/AD0y\n"
            java.lang.String r1 = "tK9Yblxeo5w=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r15, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.Class[] r15 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r15[r3] = r12     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r15[r8] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r15[r7] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r15[r6] = r9     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r15[r5] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            java.lang.reflect.Method r1 = r13.getMethod(r14, r15)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r0.iLLLILIiLi1Ii = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            r0.IiIIlIL = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0050 }
            goto L_0x00e5
        L_0x0050:
            java.lang.Object r1 = r0.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            java.lang.String r12 = "xeVKfrI=\n"
            java.lang.String r13 = "tJAvDMt3b7k=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            java.lang.String r13 = "D33f9OrIKtgBYJXPxsAglQt/1+fxyCGYPXrc6OTN\n"
            java.lang.String r14 = "bhO7hoWhTvY=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r14 = 6
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r3] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r8] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r7] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r6] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r5] = r9     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r15[r4] = r13     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            java.lang.reflect.Method r1 = r1.getMethod(r12, r15)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r0.iLLLILIiLi1Ii = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            r0.IiIIlIL = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0082 }
            goto L_0x00e5
        L_0x0082:
            java.lang.Object r1 = r0.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.String r12 = "YV+cKd4=\n"
            java.lang.String r13 = "ECr5W6dfD1Y=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.String r13 = "xL1dcgVpAnvKoBdJKWEINsC/VWEeaQk79rpebgts\n"
            java.lang.String r14 = "pdM5AGoAZlU=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r14[r3] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r14[r8] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r14[r7] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r14[r6] = r9     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r14[r5] = r13     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            java.lang.reflect.Method r1 = r1.getMethod(r12, r14)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r0.iLLLILIiLi1Ii = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            r0.IiIIlIL = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00b1 }
            goto L_0x00e5
        L_0x00b1:
            java.lang.Object r1 = r0.illlI1lLIL
            java.lang.Class r1 = r1.getClass()
            java.lang.String r9 = "XZU+tOc=\n"
            java.lang.String r12 = "LOBbxp4IhFI=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r12)
            java.lang.String r12 = "zMZTOU0GB2vC2xkCYQ4NJsjEWypWBgwr/sFQJUMD\n"
            java.lang.String r13 = "rag3SyJvY0U=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            r13 = 7
            java.lang.Class[] r13 = new java.lang.Class[r13]
            r13[r3] = r2
            r13[r8] = r11
            r13[r7] = r10
            r13[r6] = r2
            r13[r5] = r10
            r13[r4] = r2
            r2 = 6
            r13[r2] = r12
            java.lang.reflect.Method r1 = r1.getMethod(r9, r13)
            r0.iLLLILIiLi1Ii = r1
            r0.IiIIlIL = r8
        L_0x00e5:
            java.lang.reflect.Method r1 = r0.iLLLILIiLi1Ii
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.I1IILIil1lLlL():java.lang.reflect.Method");
    }

    public int I1LiILiLLIl1l(@Nullable String str) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String[] strArr;
        String str2;
        Method I1IILIil1lLlL = I1IILIil1lLlL();
        Method iiLl11ILL = iiLl11ILL();
        if (I1IILIil1lLlL == null || iiLl11ILL == null) {
            return 0;
        }
        if (!C0391o0OOoOo0.iiI1L1iI(str)) {
            str2 = C0387o0OOoO0o.iiI1L1iI("EYW2bYDEZV9P\n", "cOHSH+W3FmI=\n");
            strArr = new String[]{str};
        } else {
            str2 = null;
            strArr = null;
        }
        Uri uri = Telephony.Sms.CONTENT_URI;
        Uri withAppendedPath = Uri.withAppendedPath(uri, C0387o0OOoO0o.iiI1L1iI("M+68\n", "QY/Ln274UhY=\n"));
        Cursor ilLilIL = ilLilIL(uri, (String[]) null, str2, strArr, C0387o0OOoO0o.iiI1L1iI("1pffSeyhGm3R\n", "svarLMzFfx4=\n"));
        int i = 0;
        while (ilLilIL.moveToNext()) {
            System.out.println(C0387o0OOoO0o.iiI1L1iI("qmtBNPkAA8hu38j+S0hv1yZrQTT5yKZF\n", "h0ZsGdTli2g=\n"));
            for (int i2 = 0; i2 < ilLilIL.getColumnCount(); i2++) {
                String columnName = ilLilIL.getColumnName(i2);
                String string = ilLilIL.getString(i2);
                System.out.println(columnName + C0387o0OOoO0o.iiI1L1iI("zw==\n", "9YS/XbSBOvo=\n") + string);
            }
            i += i111iLiiIIill(withAppendedPath, C0387o0OOoO0o.iiI1L1iI("2/oni2o=\n", "hJNDtlWhe34=\n"), new String[]{ilLilIL.getString(ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("8ZKZ\n", "rvv9vc3GXQo=\n")))});
            System.out.println(C0387o0OOoO0o.iiI1L1iI("UVgPq4a9I17skKgZhr3o+1FY\n", "fHUihquQxdY=\n"));
        }
        ilLilIL.close();
        return i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method I1lLLLlliILlI() throws java.lang.NoSuchMethodException {
        /*
            r11 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.reflect.Method r8 = r11.iilLil1i11I1
            if (r8 != 0) goto L_0x00a4
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r8 < r9) goto L_0x003b
            java.lang.Object r8 = r11.illlI1lLIL
            java.lang.Class r8 = r8.getClass()
            java.lang.String r9 = "cLh1cQ==\n"
            java.lang.String r10 = "E9kZHYsgF9U=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)
            java.lang.Class r10 = top.tntok.autobot.C0513o0o00o0O.iiI1L1iI()
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r2[r7] = r10
            r2[r6] = r0
            r2[r5] = r0
            r2[r4] = r0
            r2[r3] = r1
            java.lang.reflect.Method r0 = r8.getMethod(r9, r2)
            r11.iilLil1i11I1 = r0
            r11.I11lLL1 = r7
            goto L_0x00a4
        L_0x003b:
            java.lang.Object r8 = r11.illlI1lLIL     // Catch:{ NoSuchMethodException -> 0x0061 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0061 }
            java.lang.String r9 = "YtWE2A==\n"
            java.lang.String r10 = "AbTotL+3Hc8=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10 = 6
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r3] = r0     // Catch:{ NoSuchMethodException -> 0x0061 }
            r10[r2] = r1     // Catch:{ NoSuchMethodException -> 0x0061 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0061 }
            r11.iilLil1i11I1 = r8     // Catch:{ NoSuchMethodException -> 0x0061 }
            r11.I11lLL1 = r6     // Catch:{ NoSuchMethodException -> 0x0061 }
            goto L_0x00a4
        L_0x0061:
            java.lang.Object r8 = r11.illlI1lLIL     // Catch:{ NoSuchMethodException -> 0x0084 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0084 }
            java.lang.String r9 = "tcGS1A==\n"
            java.lang.String r10 = "1qD+uJ7X5Ao=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0084 }
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0084 }
            r2[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0084 }
            r2[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0084 }
            r2[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0084 }
            r2[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0084 }
            r2[r3] = r1     // Catch:{ NoSuchMethodException -> 0x0084 }
            java.lang.reflect.Method r2 = r8.getMethod(r9, r2)     // Catch:{ NoSuchMethodException -> 0x0084 }
            r11.iilLil1i11I1 = r2     // Catch:{ NoSuchMethodException -> 0x0084 }
            r11.I11lLL1 = r5     // Catch:{ NoSuchMethodException -> 0x0084 }
            goto L_0x00a4
        L_0x0084:
            java.lang.Object r2 = r11.illlI1lLIL
            java.lang.Class r2 = r2.getClass()
            java.lang.String r8 = "FccA3A==\n"
            java.lang.String r9 = "dqZssCET/SU=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)
            java.lang.Class[] r3 = new java.lang.Class[r3]
            r3[r7] = r0
            r3[r6] = r0
            r3[r5] = r0
            r3[r4] = r1
            java.lang.reflect.Method r0 = r2.getMethod(r8, r3)
            r11.iilLil1i11I1 = r0
            r11.I11lLL1 = r4
        L_0x00a4:
            java.lang.reflect.Method r0 = r11.iilLil1i11I1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.I1lLLLlliILlI():java.lang.reflect.Method");
    }

    public boolean II1l1IliI1Li1(String str, String str2) {
        try {
            if (C0391o0OOoOo0.iiI1L1iI(str) || C0391o0OOoOo0.iiI1L1iI(str2)) {
                throw new Exception(C0387o0OOoO0o.iiI1L1iI("nq6zHAAR/3rMyplsVg2IJeaiwmk/TY91noC6Hwsn80PLy59BVAOh\n", "di8n+7OqG8A=\n"));
            }
            if (iILlLIlli() != null) {
                IiIl11II(str2);
                ContentValues contentValues = new ContentValues();
                Long valueOf = Long.valueOf(ContentUris.parseId(i1L1llI1LlL1l(ContactsContract.RawContacts.CONTENT_URI, contentValues)));
                contentValues.clear();
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("anQyfViWH+d5djF9Up0=\n", "GBVFIjv5cZM=\n"), valueOf);
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("0xMsK50=\n", "t3JYSqy3CMY=\n"), str);
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("Z9Z0NfnEquc=\n", "Cr8ZUI292oI=\n"), C0387o0OOoO0o.iiI1L1iI("BFctZzaWP3kdUC1nNI0peB1LZyAjnTYkHFgkLA==\n", "cjlJSVf4Wws=\n"));
                Uri uri = ContactsContract.Data.CONTENT_URI;
                i1L1llI1LlL1l(uri, contentValues);
                contentValues.clear();
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("xqsEe0XMl0jVqQd7T8c=\n", "tMpzJCaj+Tw=\n"), valueOf);
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("0cDH1ks=\n", "taGzt3o0E30=\n"), str2);
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("CssrFWef5Zg=\n", "Z6JGcBPmlf0=\n"), C0387o0OOoO0o.iiI1L1iI("zeCYtfab6OXU55i19ID+5NT80vLjkOG4y+aT9fKq+qU=\n", "u478m5f1jJc=\n"));
                contentValues.put(C0387o0OOoO0o.iiI1L1iI("iKDxAq4=\n", "7MGFY5y6U5Q=\n"), 2);
                i1L1llI1LlL1l(uri, contentValues);
            }
            return true;
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("O3+dD7GJbSNJF7xR0JY/R3lB516R\n", "3fAP6jQshaI=\n"), e);
            return false;
        }
    }

    public ArrayList IIL1Ll1I111(@Nullable String str) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String[] strArr;
        String str2;
        String str3;
        String str4;
        Method I1IILIil1lLlL = I1IILIil1lLlL();
        ArrayList arrayList = new ArrayList();
        if (I1IILIil1lLlL != null) {
            if (!C0391o0OOoOo0.iiI1L1iI(str)) {
                str2 = C0387o0OOoO0o.iiI1L1iI("n6EOwqiEG3fB\n", "/sVqsM33aEo=\n");
                strArr = new String[]{str};
            } else {
                str2 = null;
                strArr = null;
            }
            Cursor ilLilIL = ilLilIL(Telephony.Sms.CONTENT_URI, (String[]) null, str2, strArr, C0387o0OOoO0o.iiI1L1iI("rM6IW1ScmU+r\n", "yK/8PnT4/Dw=\n"));
            while (ilLilIL.moveToNext()) {
                HashMap hashMap = new HashMap();
                int columnIndex = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("2hl2\n", "hXAStAgmulo=\n"));
                int columnIndex2 = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("PKs5lMg3nA==\n", "Xc9d5q1E7x0=\n"));
                int columnIndex3 = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("G+Mozw==\n", "eYxMtjB4FKM=\n"));
                int columnIndex4 = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("pWkFnA==\n", "wQhx+cXRrKw=\n"));
                int columnIndex5 = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("rrshgg==\n", "2sJR50SbX7E=\n"));
                int columnIndex6 = ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("Rbu5qKOg\n", "Ns7b98rEaEE=\n"));
                String string = ilLilIL.getString(columnIndex);
                String string2 = ilLilIL.getString(columnIndex2);
                String string3 = ilLilIL.getString(columnIndex3);
                long j = ilLilIL.getLong(columnIndex4);
                int i = ilLilIL.getInt(columnIndex5);
                String string4 = ilLilIL.getString(columnIndex6);
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("Fq8=\n", "f8uC4MM8IeU=\n"), string);
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("MEZFToHZ\n", "XjMoLOSrS5E=\n"), string2);
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("U6o5dw==\n", "McVdDu76dHo=\n"), string3);
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("X/1OJA==\n", "O5w6QdHo19Y=\n"), Long.valueOf(j));
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("niLqgCFMeA==\n", "+kOe5XI4Cmc=\n"), new Date(j).toGMTString());
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("/nrtYQ==\n", "igOdBIz4XOo=\n"), Integer.valueOf(i));
                String iiI1L1iI = C0387o0OOoO0o.iiI1L1iI("KJ8izjAvLg==\n", "XOZSq2NbXMs=\n");
                if (i == 1) {
                    str3 = "D2jmMDNYag==\n";
                    str4 = "fQ2FVVouD+M=\n";
                } else {
                    str3 = "cN5Itg==\n";
                    str4 = "A7sm0kZ6Y70=\n";
                }
                hashMap.put(iiI1L1iI, C0387o0OOoO0o.iiI1L1iI(str3, str4));
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("t7tgPy8=\n", "xM4CVkvc7KQ=\n"), string4);
                arrayList.add(hashMap);
                System.out.println(C0387o0OOoO0o.iiI1L1iI("hrFlTs8bZcKGsWVO\n", "q5xIY+I2SO8=\n"));
                for (int i2 = 0; i2 < ilLilIL.getColumnCount(); i2++) {
                    String columnName = ilLilIL.getColumnName(i2);
                    String string5 = ilLilIL.getString(i2);
                    System.out.println(columnName + C0387o0OOoO0o.iiI1L1iI("Bg==\n", "PBP0kOJEcnc=\n") + string5);
                }
                System.out.println(C0387o0OOoO0o.iiI1L1iI("+iiDFCJOQRb6KIMU\n", "1wWuOQ9jbDs=\n"));
            }
            ilLilIL.close();
        }
        return arrayList;
    }

    public String ILIiLLLL1iiii(String str, String str2) throws o0OOOOOO {
        String IL11lll11 = IL11lll11(str);
        Bundle bundle = new Bundle();
        bundle.putInt(IliiLiLliIl, 0);
        try {
            Bundle iiI1L1iI = iiI1L1iI(IL11lll11, str2, bundle);
            if (iiI1L1iI == null) {
                return null;
            }
            return iiI1L1iI.getString(I1I11Il1);
        } catch (Exception e) {
            throw new o0OOOOOO(str, C0387o0OOoO0o.iiI1L1iI("0g54\n", "tWsMAQY3Na4=\n"), str2, (String) null, e);
        }
    }

    public int IiIl11II(@Nullable String str) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String[] strArr;
        String str2;
        Method I1IILIil1lLlL = I1IILIil1lLlL();
        Method iiLl11ILL = iiLl11ILL();
        if (I1IILIil1lLlL == null || iiLl11ILL == null) {
            return 0;
        }
        if (!C0391o0OOoOo0.iiI1L1iI(str)) {
            str2 = C0387o0OOoO0o.iiI1L1iI("lqZudcMmvQ==\n", "8scaFPIbglM=\n");
            strArr = new String[]{str};
        } else {
            str2 = null;
            strArr = null;
        }
        Cursor ilLilIL = ilLilIL(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{C0387o0OOoO0o.iiI1L1iI("334vdIYV\n", "sxFAH/NlpM4=\n"), C0387o0OOoO0o.iiI1L1iI("ChoFSiv8DF4AEhtf\n", "bnN2OkeddQE=\n"), C0387o0OOoO0o.iiI1L1iI("yhlE2eGDy6A=\n", "uXY2rb7ortk=\n"), C0387o0OOoO0o.iiI1L1iI("K+ZKfO+aa0kh7Q==\n", "SIkkCI75HxY=\n"), C0387o0OOoO0o.iiI1L1iI("pYm1chk=\n", "wejBEyj2pmo=\n")}, str2, strArr, (String) null);
        int i = 0;
        while (ilLilIL.moveToNext()) {
            System.out.println(C0387o0OOoO0o.iiI1L1iI("AI/d4trgjnjEO1QndpHha5ZGSnXaKCv1AI/d\n", "LaLwz/cFBtg=\n"));
            for (int i2 = 0; i2 < ilLilIL.getColumnCount(); i2++) {
                String columnName = ilLilIL.getColumnName(i2);
                String string = ilLilIL.getString(i2);
                System.out.println(columnName + C0387o0OOoO0o.iiI1L1iI("Qw==\n", "eTSJ3zJDJSw=\n") + string);
            }
            i += i111iLiiIIill(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, ilLilIL.getString(ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("z88JmF7w\n", "o6Bm8yuA2vI=\n")))), (String) null, (String[]) null);
            System.out.println(C0387o0OOoO0o.iiI1L1iI("uaRkAERdHEoEbMOyRF3X77mk\n", "lIlJLWlw+sI=\n"));
        }
        ilLilIL.close();
        return i;
    }

    public void close() {
        this.i1LIL11l.IL1lILLLL1L(this.il1LilLllii, this.iiIliillii);
    }

    public int i111iLiiIIill(Uri uri, String str, String[] strArr) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object[] objArr;
        try {
            Method iiLl11ILL = iiLl11ILL();
            int i = this.IiiL1llIIi;
            if (i == 2) {
                objArr = new Object[]{IIlLLll1ll1(), null, uri, i1LIL11l(str, strArr)};
            } else if (i != 3) {
                objArr = new Object[]{IIlLLll1ll1(), uri, str, strArr};
            } else {
                objArr = new Object[]{ilIILlI1l11i(), uri, i1LIL11l(str, strArr)};
            }
            return ((Integer) iiLl11ILL.invoke(this.illlI1lLIL, objArr)).intValue();
        } catch (InvocationTargetException e) {
            e = e;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GjSktYpOSCIte7i3mAFNKHk2tK2GAUI=\n", "WVvR2e5uJk0=\n"), e);
            return 0;
        } catch (IllegalAccessException e2) {
            e = e2;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GjSktYpOSCIte7i3mAFNKHk2tK2GAUI=\n", "WVvR2e5uJk0=\n"), e);
            return 0;
        } catch (NoSuchMethodException e3) {
            e = e3;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GjSktYpOSCIte7i3mAFNKHk2tK2GAUI=\n", "WVvR2e5uJk0=\n"), e);
            return 0;
        } catch (ClassNotFoundException e4) {
            e = e4;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GjSktYpOSCIte7i3mAFNKHk2tK2GAUI=\n", "WVvR2e5uJk0=\n"), e);
            return 0;
        } catch (InstantiationException e5) {
            e = e5;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("GjSktYpOSCIte7i3mAFNKHk2tK2GAUI=\n", "WVvR2e5uJk0=\n"), e);
            return 0;
        }
    }

    public void i11iLLllliI(String str, String str2, String str3) throws o0OOOOOO {
        String iIiL11iL = iIiL11iL(str);
        Bundle bundle = new Bundle();
        bundle.putInt(IliiLiLliIl, 0);
        bundle.putString(I1I11Il1, str3);
        try {
            iiI1L1iI(iIiL11iL, str2, bundle);
        } catch (Exception e) {
            throw new o0OOOOOO(str, C0387o0OOoO0o.iiI1L1iI("t2XW\n", "xxCiwDHQry8=\n"), str2, str3, e);
        }
    }

    public Uri i1L1llI1LlL1l(Uri uri, ContentValues contentValues) {
        Object[] objArr;
        try {
            Method iILlLIlli = iILlLIlli();
            int i = this.I1iIiIi;
            if (i == 2) {
                objArr = new Object[]{IIlLLll1ll1(), null, uri, contentValues, null};
            } else if (i != 3) {
                objArr = new Object[]{IIlLLll1ll1(), uri, contentValues};
            } else {
                objArr = new Object[]{ilIILlI1l11i(), uri, contentValues, null};
            }
            return (Uri) iILlLIlli.invoke(this.illlI1lLIL, objArr);
        } catch (InvocationTargetException e) {
            e = e;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Kl3UZFPkATwdEshmQasENklfxHxfqws=\n", "aTKhCDfEb1M=\n"), e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Kl3UZFPkATwdEshmQasENklfxHxfqws=\n", "aTKhCDfEb1M=\n"), e);
            return null;
        } catch (NoSuchMethodException e3) {
            e = e3;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Kl3UZFPkATwdEshmQasENklfxHxfqws=\n", "aTKhCDfEb1M=\n"), e);
            return null;
        } catch (ClassNotFoundException e4) {
            e = e4;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Kl3UZFPkATwdEshmQasENklfxHxfqws=\n", "aTKhCDfEb1M=\n"), e);
            return null;
        } catch (InstantiationException e5) {
            e = e5;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Kl3UZFPkATwdEshmQasENklfxHxfqws=\n", "aTKhCDfEb1M=\n"), e);
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003e */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method iILlLIlli() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        /*
            r13 = this;
            r0 = 4
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class<android.content.ContentValues> r7 = android.content.ContentValues.class
            java.lang.Class<android.net.Uri> r8 = android.net.Uri.class
            java.lang.reflect.Method r9 = r13.iILiI1lll
            if (r9 != 0) goto L_0x0080
            java.lang.String r9 = "crnOMpgPHNZwuMQ0kggM1lKj3jKeBA2MerjEE5gTCpt2\n"
            java.lang.String r10 = "E9eqQPdmePg=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.Object r10 = r13.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.Class r10 = r10.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.String r11 = "Eh5ijHnn\n"
            java.lang.String r12 = "e3AR6QuTSjo=\n"
            java.lang.String r11 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.Class[] r12 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r12[r1] = r9     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r12[r4] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r12[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r12[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r9 = r10.getMethod(r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r13.iILiI1lll = r9     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            r13.I1iIiIi = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003e }
            goto L_0x0080
        L_0x003e:
            java.lang.Object r9 = r13.illlI1lLIL     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.String r10 = "T0dO1SOa\n"
            java.lang.String r11 = "Jik9sFHuVzM=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r11)     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11 = 5
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11[r3] = r8     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11[r2] = r7     // Catch:{ NoSuchMethodException -> 0x0062 }
            r11[r0] = r5     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.reflect.Method r0 = r9.getMethod(r10, r11)     // Catch:{ NoSuchMethodException -> 0x0062 }
            r13.iILiI1lll = r0     // Catch:{ NoSuchMethodException -> 0x0062 }
            r13.I1iIiIi = r3     // Catch:{ NoSuchMethodException -> 0x0062 }
            goto L_0x0080
        L_0x0062:
            java.lang.Object r0 = r13.illlI1lLIL
            java.lang.Class r0 = r0.getClass()
            java.lang.String r5 = "J7LUr4hg\n"
            java.lang.String r9 = "TtynyvoUm+g=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r9)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r2[r1] = r6
            r2[r4] = r8
            r2[r3] = r7
            java.lang.reflect.Method r0 = r0.getMethod(r5, r2)
            r13.iILiI1lll = r0
            r13.I1iIiIi = r4
        L_0x0080:
            java.lang.reflect.Method r0 = r13.iILiI1lll
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.iILlLIlli():java.lang.reflect.Method");
    }

    public final Bundle iiI1L1iI(String str, String str2, Bundle bundle) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object[] objArr;
        try {
            Method I1lLLLlliILlI = I1lLLLlliILlI();
            if (Build.VERSION.SDK_INT < 31 || this.I11lLL1 != 0) {
                int i = this.I11lLL1;
                if (i == 1) {
                    objArr = new Object[]{C0387o0OOoO0o.iiI1L1iI("0AkP9VTHqErcDwb1RsGpVN8=\n", "s2Zi2zWpzDg=\n"), null, C0387o0OOoO0o.iiI1L1iI("02GzxR80Op0=\n", "oATHsXZaXe4=\n"), str, str2, bundle};
                } else if (i != 2) {
                    objArr = new Object[]{C0387o0OOoO0o.iiI1L1iI("qeDBO/9XQR6l5sg77VFAAKY=\n", "yo+sFZ45JWw=\n"), str, str2, bundle};
                } else {
                    objArr = new Object[]{C0387o0OOoO0o.iiI1L1iI("tCBOLda4rF64JkctxL6tQLs=\n", "108jA7fWyCw=\n"), C0387o0OOoO0o.iiI1L1iI("U4ucMweDrMw=\n", "IO7oR27ty78=\n"), str, str2, bundle};
                }
            } else {
                objArr = new Object[]{FakeContext.iiI1L1iI().getAttributionSource(), C0387o0OOoO0o.iiI1L1iI("pPuEfh0j3IU=\n", "157wCnRNu/Y=\n"), str, str2, bundle};
            }
            return (Bundle) I1lLLLlliILlI.invoke(this.illlI1lLIL, objArr);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("2BKOVhA25tjvXZJUAnnj0rsQnk4ceew=\n", "m337OnQWiLc=\n"), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005b, code lost:
        r12.iilLiIIIi11i = r12.illlI1lLIL.getClass().getMethod(top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI("v1EExQQi\n", "2zRooHBHjHs=\n"), new java.lang.Class[]{r7, r6, r7, java.lang.String[].class});
        r12.IiiL1llIIi = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003a */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method iiLl11ILL() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        /*
            r12 = this;
            r0 = 4
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 3
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.reflect.Method r8 = r12.iilLiIIIi11i
            if (r8 != 0) goto L_0x007d
            java.lang.String r8 = "3MbQktRfoVDex9qU3lixUPzcwJLSVLAK1Mfas9RDtx3Y\n"
            java.lang.String r9 = "vai04Ls2xX4=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.Object r9 = r12.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.Class r9 = r9.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.String r10 = "Uj3DxMhP\n"
            java.lang.String r11 = "NlivobwqZRs=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            r11[r1] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            r11[r3] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            r11[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            java.lang.reflect.Method r8 = r9.getMethod(r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            r12.iilLiIIIi11i = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            r12.IiiL1llIIi = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003a }
            goto L_0x007d
        L_0x003a:
            java.lang.Object r8 = r12.illlI1lLIL     // Catch:{ NoSuchMethodException -> 0x005b }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x005b }
            java.lang.String r9 = "bro43ZUc\n"
            java.lang.String r10 = "Ct9UuOF5XB4=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ NoSuchMethodException -> 0x005b }
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x005b }
            r10[r1] = r7     // Catch:{ NoSuchMethodException -> 0x005b }
            r10[r3] = r7     // Catch:{ NoSuchMethodException -> 0x005b }
            r10[r2] = r6     // Catch:{ NoSuchMethodException -> 0x005b }
            r10[r4] = r5     // Catch:{ NoSuchMethodException -> 0x005b }
            java.lang.reflect.Method r5 = r8.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x005b }
            r12.iilLiIIIi11i = r5     // Catch:{ NoSuchMethodException -> 0x005b }
            r12.IiiL1llIIi = r2     // Catch:{ NoSuchMethodException -> 0x005b }
            goto L_0x007d
        L_0x005b:
            java.lang.Object r5 = r12.illlI1lLIL
            java.lang.Class r5 = r5.getClass()
            java.lang.String r8 = "v1EExQQi\n"
            java.lang.String r9 = "2zRooHBHjHs=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r0[r1] = r7
            r0[r3] = r6
            r0[r2] = r7
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r4] = r1
            java.lang.reflect.Method r0 = r5.getMethod(r8, r0)
            r12.iilLiIIIi11i = r0
            r12.IiiL1llIIi = r3
        L_0x007d:
            java.lang.reflect.Method r0 = r12.iilLiIIIi11i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.iiLl11ILL():java.lang.reflect.Method");
    }

    @SuppressLint({"PrivateApi"})
    public final Object ilIILlI1l11i() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (this.iL1LIlIlI == null) {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("2JhPtiLd0AzamUWwKNrADPiCX7Yk1sFW0JlFlyLBxkHc0mmxJNjQR8s=\n", "ufYrxE20tCI=\n"));
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(Binder.getCallingUid())});
            cls.getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("vCKaAOqeIUqoIqAx5pg=\n", "z0fuUIv9Sis=\n"), new Class[]{String.class}).invoke(newInstance, new Object[]{IIlLLll1ll1()});
            this.iL1LIlIlI = cls.getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("4DL0XAQ=\n", "gkedMGDU2Pg=\n"), (Class[]) null).invoke(newInstance, (Object[]) null);
        }
        return this.iL1LIlIlI;
    }

    public ArrayList ilLIlL1ILi(@Nullable String str) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String[] strArr;
        String str2;
        Method I1IILIil1lLlL = I1IILIil1lLlL();
        ArrayList arrayList = new ArrayList();
        if (I1IILIil1lLlL != null) {
            if (!C0391o0OOoOo0.iiI1L1iI(str)) {
                str2 = C0387o0OOoO0o.iiI1L1iI("wjyBZF4qmA==\n", "pl31BW8Xp2E=\n");
                strArr = new String[]{str};
            } else {
                str2 = null;
                strArr = null;
            }
            Cursor ilLilIL = ilLilIL(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{C0387o0OOoO0o.iiI1L1iI("1geGNU7u\n", "umjpXjue4U8=\n"), C0387o0OOoO0o.iiI1L1iI("/v4z/nCYX9T09i3r\n", "mpdAjhz5Jos=\n"), C0387o0OOoO0o.iiI1L1iI("xjydzBsgrjo=\n", "tVPvuERLy0M=\n"), C0387o0OOoO0o.iiI1L1iI("mRQJn1EtJqyTHw==\n", "+ntn6zBOUvM=\n"), C0387o0OOoO0o.iiI1L1iI("Lb12NBY=\n", "SdwCVSfoEK8=\n")}, str2, strArr, (String) null);
            while (ilLilIL.moveToNext()) {
                HashMap hashMap = new HashMap();
                String string = ilLilIL.getString(ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("DWktWx3YcrAHYTNO\n", "aQBeK3G5C+8=\n")));
                String string2 = ilLilIL.getString(ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("i7ycyJM=\n", "793oqaJFP9g=\n")));
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("vHk=\n", "1R1e9bzfaM8=\n"), ilLilIL.getString(ilLilIL.getColumnIndex(C0387o0OOoO0o.iiI1L1iI("PeIpv5fX\n", "UY1G1OKnsyE=\n"))));
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("tGP6OQ==\n", "2gKXXBjFf3I=\n"), string);
                hashMap.put(C0387o0OOoO0o.iiI1L1iI("YVrh9ltI\n", "Dy+MlD462q4=\n"), string2);
                arrayList.add(hashMap);
            }
            ilLilIL.close();
        }
        return arrayList;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003f */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method ilLIlLiIILl1() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        /*
            r14 = this;
            r0 = 5
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            java.lang.Class<android.content.ContentValues> r7 = android.content.ContentValues.class
            java.lang.Class<android.net.Uri> r8 = android.net.Uri.class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.reflect.Method r10 = r14.i1L1lLllLLlIi
            if (r10 != 0) goto L_0x0086
            java.lang.String r10 = "e+dXzRfbPcl55l3LHdwtyVv9R80R0CyTc+Zd7BfHK4R/\n"
            java.lang.String r11 = "Gokzv3iyWec=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Object r11 = r14.illlI1lLIL     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r11 = r11.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.String r12 = "1OFPvGu2\n"
            java.lang.String r13 = "oZEr3R/TTFY=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class[] r13 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r13[r1] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r13[r5] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r13[r4] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r13[r3] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Method r10 = r11.getMethod(r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r14.i1L1lLllLLlIi = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r14.IL1lILLLL1L = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            goto L_0x0086
        L_0x003f:
            java.lang.Object r10 = r14.illlI1lLIL     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.String r11 = "EIJTs/s1\n"
            java.lang.String r12 = "ZfI30o9Q8EY=\n"
            java.lang.String r11 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r11, r12)     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.Class[] r12 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0062 }
            r12[r1] = r9     // Catch:{ NoSuchMethodException -> 0x0062 }
            r12[r5] = r9     // Catch:{ NoSuchMethodException -> 0x0062 }
            r12[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0062 }
            r12[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0062 }
            r12[r2] = r6     // Catch:{ NoSuchMethodException -> 0x0062 }
            java.lang.reflect.Method r6 = r10.getMethod(r11, r12)     // Catch:{ NoSuchMethodException -> 0x0062 }
            r14.i1L1lLllLLlIi = r6     // Catch:{ NoSuchMethodException -> 0x0062 }
            r14.IL1lILLLL1L = r4     // Catch:{ NoSuchMethodException -> 0x0062 }
            goto L_0x0086
        L_0x0062:
            java.lang.Object r6 = r14.illlI1lLIL
            java.lang.Class r6 = r6.getClass()
            java.lang.String r10 = "aNV652YS\n"
            java.lang.String r11 = "HaUehhJ3lZA=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r11)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r0[r1] = r9
            r0[r5] = r8
            r0[r4] = r7
            r0[r3] = r9
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r2] = r1
            java.lang.reflect.Method r0 = r6.getMethod(r10, r0)
            r14.i1L1lLllLLlIi = r0
            r14.IL1lILLLL1L = r5
        L_0x0086:
            java.lang.reflect.Method r0 = r14.i1L1lLllLLlIi
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iI1LI1ILLllI.ilLIlLiIILl1():java.lang.reflect.Method");
    }

    public final Cursor ilLilIL(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object[] objArr;
        try {
            Method I1IILIil1lLlL = I1IILIil1lLlL();
            int i = this.IiIIlIL;
            if (i == 2) {
                objArr = new Object[]{IIlLLll1ll1(), uri, strArr, il1LilLllii(str, strArr2, str2), null};
            } else if (i == 3) {
                objArr = new Object[]{IIlLLll1ll1(), null, uri, strArr, il1LilLllii(str, strArr2, str2), null};
            } else if (i != 4) {
                objArr = new Object[]{IIlLLll1ll1(), uri, strArr, str, strArr2, str2, null};
            } else {
                objArr = new Object[]{ilIILlI1l11i(), uri, strArr, il1LilLllii(str, strArr2, str2), null};
            }
            return (Cursor) I1IILIil1lLlL.invoke(this.illlI1lLIL, objArr);
        } catch (InvocationTargetException e) {
            e = e;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JterB9jYlugRmLcFypeT4kXVux/Ul5w=\n", "Zbjea7z4+Ic=\n"), e);
            throw e;
        } catch (IllegalAccessException e2) {
            e = e2;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JterB9jYlugRmLcFypeT4kXVux/Ul5w=\n", "Zbjea7z4+Ic=\n"), e);
            throw e;
        } catch (NoSuchMethodException e3) {
            e = e3;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JterB9jYlugRmLcFypeT4kXVux/Ul5w=\n", "Zbjea7z4+Ic=\n"), e);
            throw e;
        } catch (ClassNotFoundException e4) {
            e = e4;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JterB9jYlugRmLcFypeT4kXVux/Ul5w=\n", "Zbjea7z4+Ic=\n"), e);
            throw e;
        } catch (InstantiationException e5) {
            e = e5;
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JterB9jYlugRmLcFypeT4kXVux/Ul5w=\n", "Zbjea7z4+Ic=\n"), e);
            throw e;
        }
    }
}
