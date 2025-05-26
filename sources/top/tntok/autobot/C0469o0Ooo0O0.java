package top.tntok.autobot;

import android.app.ActivityThread;
import android.app.Application;
import android.content.ContentResolver;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;

@Deprecated
/* renamed from: top.tntok.autobot.o0Ooo0O0  reason: case insensitive filesystem */
public class C0469o0Ooo0O0 extends C0534o0oOoo00 {
    public static final String I11lLL1 = "com.android.testing.stubime";
    public static final int iLLLILIiLi1Ii = -1;
    public static final String iilLil1i11I1 = "disable_ime";
    public C0527o0oOOO0o i1LIL11l;
    public boolean iiIliillii = false;
    public C0112o000ooO il1LilLllii;
    public Bundle illlI1lLIL;

    public void I1LiliILi1lI1(C0112o000ooO o000ooo) {
        this.il1LilLllii = o000ooo;
    }

    public void ILiLII1ILi() throws Exception {
        if (this.iiIliillii) {
            Iiiiii1l1I1L1();
        }
        super.ILiLII1ILi();
    }

    public Bundle IiIl11II() {
        return this.illlI1lLIL;
    }

    public void IiiIIil1l(C0527o0oOOO0o o0oooo0o) {
        this.i1LIL11l = o0oooo0o;
    }

    public C0527o0oOOO0o IillLillLLIii() {
        return this.i1LIL11l;
    }

    public C0112o000ooO Il1llillili() {
        return this.il1LilLllii;
    }

    public void i1LiiIlIL1I() throws Exception {
        super.i1LiiIlIL1I();
        boolean equals = "true".equals(this.illlI1lLIL.getString(iilLil1i11I1));
        this.iiIliillii = equals;
        if (equals) {
            i1i1111LLILli();
        }
    }

    public final void i1i1111LLILli() {
        Application currentApplication = ActivityThread.currentApplication();
        if (currentApplication != null) {
            String str = null;
            for (InputMethodInfo next : ((InputMethodManager) currentApplication.getSystemService("input_method")).getInputMethodList()) {
                if (I11lLL1.equals(next.getComponent().getPackageName())) {
                    str = next.getId();
                }
            }
            if (str == null) {
                throw new RuntimeException(String.format("Required testing fixture missing: IME package (%s)", new Object[]{I11lLL1}));
            } else if (currentApplication.checkSelfPermission("android.permission.WRITE_SECURE_SETTINGS") == 0) {
                ContentResolver contentResolver = currentApplication.getContentResolver();
                Settings.Secure.putInt(contentResolver, "selected_input_method_subtype", -1);
                Settings.Secure.putString(contentResolver, "default_input_method", str);
            }
        } else {
            throw new RuntimeException("ActivityThread.currentApplication() is null.");
        }
    }

    public void iLIIl1IliLlLI(long j) {
        SystemClock.sleep(j);
    }

    public void iLILliI1(Bundle bundle) {
        this.illlI1lLIL = bundle;
    }

    public final void Iiiiii1l1I1L1() {
    }
}
