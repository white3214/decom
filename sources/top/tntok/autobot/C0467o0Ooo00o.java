package top.tntok.autobot;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.UiAutomation;
import android.view.Display;
import android.view.InputEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.TimeoutException;

/* renamed from: top.tntok.autobot.o0Ooo00o  reason: case insensitive filesystem */
public abstract class C0467o0Ooo00o {
    public static final long iiIliillii = 500;
    public static final long iilLil1i11I1 = 10000;
    public static final String il1LilLllii = "o0Ooo00o";
    public final o00OO000 i1LIL11l = new o00OO000(this);
    public final UiAutomation iiI1L1iI;
    public final C0309o0O0o00o illlI1lLIL = new C0309o0O0o00o(this);

    public C0467o0Ooo00o(UiAutomation uiAutomation) {
        this.iiI1L1iI = uiAutomation;
    }

    public abstract long I11lLL1();

    public boolean I1iIiIi(int i) {
        return this.iiI1L1iI.setRotation(i);
    }

    public void IL1lILLLL1L() {
        iL1LIlIlI(10000);
    }

    public abstract boolean IiIIlIL();

    public void IiiL1llIIi(boolean z) {
        AccessibilityServiceInfo serviceInfo = this.iiI1L1iI.getServiceInfo();
        if (z) {
            serviceInfo.flags &= -3;
        } else {
            serviceInfo.flags |= 2;
        }
        this.iiI1L1iI.setServiceInfo(serviceInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031 A[SYNTHETIC, Splitter:B:20:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC, Splitter:B:26:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i1L1lLllLLlIi(java.io.File r6, int r7) {
        /*
            r5 = this;
            android.app.UiAutomation r0 = r5.iiI1L1iI
            android.graphics.Bitmap r0 = r0.takeScreenshot()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x002d, all -> 0x002b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002d, all -> 0x002b }
            r4.<init>(r6)     // Catch:{ IOException -> 0x002d, all -> 0x002b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x002d, all -> 0x002b }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r0.compress(r6, r7, r3)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r3.flush()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r3.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r0.recycle()
            r6 = 1
            return r6
        L_0x0025:
            r6 = move-exception
            r2 = r3
            goto L_0x002f
        L_0x0028:
            r2 = r3
            goto L_0x0038
        L_0x002b:
            r6 = move-exception
            goto L_0x002f
        L_0x002d:
            goto L_0x0038
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0.recycle()
            throw r6
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0467o0Ooo00o.i1L1lLllLLlIi(java.io.File, int):boolean");
    }

    public abstract Display i1LIL11l();

    public void iILiI1lll(UiAutomation.OnAccessibilityEventListener onAccessibilityEventListener) {
        this.iiI1L1iI.setOnAccessibilityEventListener(onAccessibilityEventListener);
    }

    public void iL1LIlIlI(long j) {
        try {
            this.iiI1L1iI.waitForIdle(500, j);
        } catch (TimeoutException unused) {
        }
    }

    public boolean iLLLILIiLi1Ii(InputEvent inputEvent, boolean z) {
        return this.iiI1L1iI.injectInputEvent(inputEvent, z);
    }

    public AccessibilityEvent iiI1L1iI(Runnable runnable, UiAutomation.AccessibilityEventFilter accessibilityEventFilter, long j) throws TimeoutException {
        return this.iiI1L1iI.executeAndWaitForEvent(runnable, accessibilityEventFilter, j);
    }

    public AccessibilityNodeInfo iiIliillii() {
        return this.iiI1L1iI.getRootInActiveWindow();
    }

    public boolean iilLiIIIi11i(int i) {
        return this.iiI1L1iI.performGlobalAction(i);
    }

    public abstract int iilLil1i11I1();

    public C0309o0O0o00o il1LilLllii() {
        return this.illlI1lLIL;
    }

    public o00OO000 illlI1lLIL() {
        return this.i1LIL11l;
    }
}
