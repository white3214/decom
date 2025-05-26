package top.tntok.autobot;

import android.app.UiAutomation;
import android.hardware.display.DisplayManagerGlobal;
import android.os.Binder;
import android.os.IPowerManager;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.view.Display;
import android.view.IWindowManager;

/* renamed from: top.tntok.autobot.o0OOOOOo  reason: case insensitive filesystem */
public class C0356o0OOOOOo extends C0467o0Ooo00o {
    public static final String I11lLL1 = "o0OOOOOo";

    public C0356o0OOOOOo(UiAutomation uiAutomation) {
        super(uiAutomation);
    }

    public static String i111iLiiIIill() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == 0) {
            return "root";
        }
        if (callingUid != 2000) {
            return null;
        }
        return "com.android.shell";
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.String, android.database.Cursor] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[SYNTHETIC, Splitter:B:24:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[Catch:{ RemoteException -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long I11lLL1() {
        /*
            r12 = this;
            android.app.IActivityManager r0 = android.app.ActivityManager.getService()     // Catch:{ RemoteException -> 0x0057 }
            android.net.Uri r3 = android.provider.Settings.Secure.CONTENT_URI     // Catch:{ RemoteException -> 0x0057 }
            java.lang.String r7 = r3.getAuthority()     // Catch:{ RemoteException -> 0x0057 }
            android.os.Binder r8 = new android.os.Binder     // Catch:{ RemoteException -> 0x0057 }
            r8.<init>()     // Catch:{ RemoteException -> 0x0057 }
            r9 = 0
            r10 = 0
            java.lang.String r1 = "*uiautomator*"
            android.app.ContentProviderHolder r1 = r0.getContentProviderExternal(r7, r9, r8, r1)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x005c
            android.content.IContentProvider r11 = r1.provider     // Catch:{ all -> 0x0059 }
            android.content.AttributionSource r2 = new android.content.AttributionSource     // Catch:{ all -> 0x004c }
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = i111iLiiIIill()     // Catch:{ all -> 0x004c }
            r2.<init>(r1, r4, r10)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "name=?"
            java.lang.String r5 = "long_press_timeout"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ all -> 0x004c }
            android.os.Bundle r5 = android.content.ContentResolver.createSqlQueryBundle(r1, r5, r10)     // Catch:{ all -> 0x004c }
            r6 = 0
            r1 = r11
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x004c }
            boolean r1 = r10.moveToFirst()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x004e
            int r1 = r10.getInt(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r1
            goto L_0x0050
        L_0x004c:
            r1 = move-exception
            goto L_0x0073
        L_0x004e:
            r1 = 0
        L_0x0050:
            r10.close()     // Catch:{ RemoteException -> 0x0057 }
            r0.removeContentProviderExternalAsUser(r7, r8, r9)     // Catch:{ RemoteException -> 0x0057 }
            return r1
        L_0x0057:
            r0 = move-exception
            goto L_0x007e
        L_0x0059:
            r1 = move-exception
            r11 = r10
            goto L_0x0073
        L_0x005c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r2.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "Could not find provider: "
            r2.append(r3)     // Catch:{ all -> 0x0059 }
            r2.append(r7)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0059 }
            r1.<init>(r2)     // Catch:{ all -> 0x0059 }
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0073:
            if (r10 == 0) goto L_0x0078
            r10.close()     // Catch:{ RemoteException -> 0x0057 }
        L_0x0078:
            if (r11 == 0) goto L_0x007d
            r0.removeContentProviderExternalAsUser(r7, r8, r9)     // Catch:{ RemoteException -> 0x0057 }
        L_0x007d:
            throw r1     // Catch:{ RemoteException -> 0x0057 }
        L_0x007e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error reading long press timeout setting."
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0356o0OOOOOo.I11lLL1():long");
    }

    public boolean IiIIlIL() {
        try {
            return IPowerManager.Stub.asInterface(ServiceManager.getService("power")).isInteractive();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public Display i1LIL11l() {
        return DisplayManagerGlobal.getInstance().getRealDisplay(0);
    }

    public int iilLil1i11I1() {
        try {
            return IWindowManager.Stub.asInterface(ServiceManager.getService("window")).getDefaultDisplayRotation();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
