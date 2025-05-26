package top.tntok.autobot;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.ActivityManager;
import android.app.IActivityController;
import android.app.IActivityManager;
import android.app.UiAutomation;
import android.app.UiAutomationConnection;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.RemoteException;

/* renamed from: top.tntok.autobot.o0oOO0Oo  reason: case insensitive filesystem */
public class C0526o0oOO0Oo {
    public static final String illlI1lLIL = "UiAutomatorHandlerThread";
    public UiAutomation i1LIL11l;
    public final HandlerThread iiI1L1iI = new HandlerThread("UiAutomatorHandlerThread");

    /* renamed from: top.tntok.autobot.o0oOO0Oo$i1LIL11l */
    public class i1LIL11l extends IActivityController.Stub {
        public i1LIL11l() {
        }

        public boolean i1LIL11l(Intent intent, String str) throws RemoteException {
            return true;
        }

        public boolean iiI1L1iI(String str) throws RemoteException {
            return true;
        }

        public int iiIliillii(String str, int i, String str2) throws RemoteException {
            return 0;
        }

        public int iilLil1i11I1(String str) throws RemoteException {
            return 0;
        }

        public int il1LilLllii(String str, int i, String str2) throws RemoteException {
            return 0;
        }

        public boolean illlI1lLIL(String str, int i, String str2, String str3, long j, String str4) throws RemoteException {
            return true;
        }
    }

    public void i1LIL11l() {
        if (this.iiI1L1iI.isAlive()) {
            this.i1LIL11l.disconnect();
            this.iiI1L1iI.quit();
            return;
        }
        throw new IllegalStateException("Already disconnected!");
    }

    public void iiI1L1iI() {
        if (!this.iiI1L1iI.isAlive()) {
            this.iiI1L1iI.start();
            UiAutomation uiAutomation = new UiAutomation(this.iiI1L1iI.getLooper(), new UiAutomationConnection());
            this.i1LIL11l = uiAutomation;
            uiAutomation.connect();
            return;
        }
        throw new IllegalStateException("Already connected!");
    }

    public void iiIliillii(boolean z) {
        IActivityManager service = ActivityManager.getService();
        if (service == null) {
            throw new RuntimeException("Can't manage monkey status; is the system running?");
        } else if (z) {
            try {
                service.setActivityController(new i1LIL11l(), true);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            service.setActivityController((IActivityController) null, true);
        }
    }

    public void il1LilLllii(boolean z) {
        AccessibilityServiceInfo serviceInfo = this.i1LIL11l.getServiceInfo();
        if (z) {
            serviceInfo.flags &= -3;
        } else {
            serviceInfo.flags |= 2;
        }
        this.i1LIL11l.setServiceInfo(serviceInfo);
    }

    public UiAutomation illlI1lLIL() {
        return this.i1LIL11l;
    }
}
