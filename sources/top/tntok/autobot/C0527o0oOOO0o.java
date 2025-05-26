package top.tntok.autobot;

import android.app.UiAutomation;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: top.tntok.autobot.o0oOOO0o  reason: case insensitive filesystem */
public class C0527o0oOOO0o {
    public static C0527o0oOOO0o I11lLL1 = null;
    public static final String iiIliillii = "o0oOOO0o";
    public static final long iilLil1i11I1 = 1000;
    public final List<String> i1LIL11l = new ArrayList();
    public final HashMap<String, C0474o0Ooo0oo> iiI1L1iI = new HashMap<>();
    public C0467o0Ooo00o il1LilLllii;
    public boolean illlI1lLIL = false;

    /* renamed from: top.tntok.autobot.o0oOOO0o$i1LIL11l */
    public class i1LIL11l implements UiAutomation.AccessibilityEventFilter {
        public final /* synthetic */ String iiI1L1iI;

        public i1LIL11l(String str) {
            this.iiI1L1iI = str;
        }

        public boolean accept(AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 2048) {
                return false;
            }
            String str = this.iiI1L1iI;
            if (str == null || str.equals(accessibilityEvent.getPackageName())) {
                return true;
            }
            return false;
        }
    }

    public static C0527o0oOOO0o I1iIiIi() {
        if (I11lLL1 == null) {
            I11lLL1 = new C0527o0oOOO0o();
        }
        return I11lLL1;
    }

    @Deprecated
    public String I11lLL1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return iilLil1i11I1().il1LilLllii().i1L1lLllLLlIi();
    }

    public boolean I1I11Il1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(21);
    }

    public boolean I1IIIi1i1ILl() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().iiLIIiIli(3, 0, 2048, 1000);
    }

    public void I1LiliILi1lI1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iLILliI1(ILiI1LilIi.i1LIL11l().iiIliillii());
    }

    public boolean I1l1iIll1lIi1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        int iilLil1i11I12 = iilLil1i11I1().iilLil1i11I1();
        if (iilLil1i11I12 == 0 || iilLil1i11I12 == 2) {
            return true;
        }
        return false;
    }

    public boolean IIIlll1lll(int i, int i2) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2));
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().I1l1iIll1lIi1(i, i2);
    }

    public boolean IILiIL1i11Li() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().IL111l1();
    }

    public void IIi1l1i() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().i1iiLIil1ILi();
        I1LiliILi1lI1();
    }

    public boolean IIlL1llI1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(19);
    }

    public boolean IIlLill() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(84);
    }

    public void IIllllLiIlIl() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().i11liIIl11Ii1();
        I1LiliILi1lI1();
    }

    public boolean IL111l1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(67);
    }

    public boolean IL1IiilLlLI() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().iiLIIiIli(82, 0, 2048, 1000);
    }

    public String IL1lILLLL1L() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return Build.PRODUCT;
    }

    public boolean ILiLII1ILi(int i, int i2, int i3, int i4, int i5) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        return iilLil1i11I1().illlI1lLIL().I1I11Il1(i, i2, i3, i4, i5);
    }

    public boolean ILl1iII11Ll1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().i1L1lLllLLlIi();
    }

    public void ILllI11() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        this.i1LIL11l.clear();
    }

    public void Ii1liIIIiLi(C0467o0Ooo00o o0ooo00o) {
        this.il1LilLllii = o0ooo00o;
    }

    public int IiIIlIL() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        Display i1LIL11l2 = iilLil1i11I1().i1LIL11l();
        Point point = new Point();
        i1LIL11l2.getSize(point);
        return point.y;
    }

    public boolean IiIl11II(File file) {
        C0447o0OoOOo.IiiL1llIIi(file);
        return IillLillLLIii(file, 1.0f, 90);
    }

    public void IiiIIil1l() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        if (iilLil1i11I1().illlI1lLIL().IL1IiilLlLI()) {
            SystemClock.sleep(500);
        }
    }

    public void IiiIlLl1il1i() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().iiiiI1iILL11I();
        I1LiliILi1lI1();
    }

    public Point IiiL1llIIi() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        Display i1LIL11l2 = iilLil1i11I1().i1LIL11l();
        Point point = new Point();
        i1LIL11l2.getRealSize(point);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        i1LIL11l2.getRealMetrics(displayMetrics);
        float f = displayMetrics.density;
        point.x = Math.round(((float) point.x) / f);
        point.y = Math.round(((float) point.y) / f);
        return point;
    }

    public void Iiiiii1l1I1L1() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().IIIlll1lll();
    }

    public boolean IilL11ii1I1Il() {
        return this.illlI1lLIL;
    }

    public boolean IillLillLLIii(File file, float f, int i) {
        C0447o0OoOOo.IiiL1llIIi(file, Float.valueOf(f), Integer.valueOf(i));
        return iilLil1i11I1().i1L1lLllLLlIi(file, i);
    }

    public boolean IilliIIIlI1ll(int i) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i));
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().I1l1iIll1lIi1(i, 0);
    }

    public boolean Il1llillili(Point[] pointArr, int i) {
        C0447o0OoOOo.IiiL1llIIi(pointArr, Integer.valueOf(i));
        return iilLil1i11I1().illlI1lLIL().IIlL1llI1(pointArr, i);
    }

    public boolean IliiLiLliIl() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(20);
    }

    public boolean i111iLiiIIill(String str) {
        C0447o0OoOOo.IiiL1llIIi(str);
        return this.i1LIL11l.contains(str);
    }

    public boolean i11liIIl11Ii1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().iiLIIiIli(4, 0, 2048, 1000);
    }

    public String i1L1lLllLLlIi() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return iilLil1i11I1().il1LilLllii().iL1LIlIlI();
    }

    public boolean i1LIL11l(int i, int i2) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2));
        if (i >= iILiI1lll() || i2 >= IiIIlIL()) {
            return false;
        }
        return iilLil1i11I1().illlI1lLIL().iilLil1i11I1(i, i2);
    }

    public void i1LiiIlIL1I() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().IliiLiLliIl();
    }

    public boolean i1i1111LLILli(String str, long j) {
        C0447o0OoOOo.IiiL1llIIi(str, Long.valueOf(j));
        if (str != null && !str.equals(iLLLILIiLi1Ii())) {
            return false;
        }
        try {
            iilLil1i11I1().iiI1L1iI(new iiI1L1iI(), new i1LIL11l(str), j);
            return true;
        } catch (Exception | TimeoutException unused) {
            return false;
        }
    }

    public boolean i1iI1iiLL1() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Exceuting watcher: ");
        r3.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r5.illlI1lLIL = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i1iLlIill1I() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            top.tntok.autobot.C0447o0OoOOo.IiiL1llIIi(r1)
            boolean r1 = r5.illlI1lLIL
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.HashMap<java.lang.String, top.tntok.autobot.o0Ooo0oo> r1 = r5.iiI1L1iI
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, top.tntok.autobot.o0Ooo0oo> r3 = r5.iiI1L1iI
            java.lang.Object r3 = r3.get(r2)
            top.tntok.autobot.o0Ooo0oo r3 = (top.tntok.autobot.C0474o0Ooo0oo) r3
            if (r3 == 0) goto L_0x0015
            r4 = 1
            r5.illlI1lLIL = r4     // Catch:{ Exception -> 0x003d }
            boolean r3 = r3.iiI1L1iI()     // Catch:{ Exception -> 0x003d }
            if (r3 == 0) goto L_0x003a
            r5.iLlIllll(r2)     // Catch:{ Exception -> 0x003d }
            goto L_0x003a
        L_0x0038:
            r1 = move-exception
            goto L_0x004b
        L_0x003a:
            r5.illlI1lLIL = r0
            goto L_0x0015
        L_0x003d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Exceuting watcher: "
            r3.append(r4)     // Catch:{ all -> 0x0038 }
            r3.append(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x003a
        L_0x004b:
            r5.illlI1lLIL = r0
            throw r1
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0527o0oOOO0o.i1iLlIill1I():void");
    }

    public boolean i1iiLIil1ILi() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().illlI1lLIL().IL1lILLLL1L();
    }

    public int iILiI1lll() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        Display i1LIL11l2 = iilLil1i11I1().i1LIL11l();
        Point point = new Point();
        i1LIL11l2.getSize(point);
        return point.x;
    }

    public boolean iL1LIlIlI() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        if (this.i1LIL11l.size() > 0) {
            return true;
        }
        return false;
    }

    public void iLILliI1(long j) {
        C0447o0OoOOo.IiiL1llIIi(Long.valueOf(j));
        iilLil1i11I1().iL1LIlIlI(j);
    }

    public String iLLLILIiLi1Ii() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return iilLil1i11I1().il1LilLllii().IL1lILLLL1L();
    }

    public final void iLlIllll(String str) {
        C0447o0OoOOo.IiiL1llIIi(str);
        if (!i111iLiiIIill(str)) {
            this.i1LIL11l.add(str);
        }
    }

    public void iiI1L1iI() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().il1LilLllii().I11lLL1();
    }

    public void iiIliillii() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        iilLil1i11I1().illlI1lLIL().iLLLILIiLi1Ii();
    }

    public boolean iiLIIiIli() throws RemoteException {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return iilLil1i11I1().illlI1lLIL().iILiI1lll();
    }

    public boolean iiiiI1iILL11I() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(23);
    }

    public int iilLiIIIi11i() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        I1LiliILi1lI1();
        return iilLil1i11I1().iilLil1i11I1();
    }

    public C0467o0Ooo00o iilLil1i11I1() {
        C0467o0Ooo00o o0ooo00o = this.il1LilLllii;
        if (o0ooo00o != null) {
            return o0ooo00o;
        }
        throw new RuntimeException("UiDevice not initialized");
    }

    public void il1LilLllii(String str) {
        C0447o0OoOOo.IiiL1llIIi(str);
        AccessibilityNodeInfo I1iIiIi = iilLil1i11I1().il1LilLllii().I1iIiIi();
        if (I1iIiIi != null) {
            Display i1LIL11l2 = iilLil1i11I1().i1LIL11l();
            Point point = new Point();
            i1LIL11l2.getSize(point);
            iILiI1lll.iiIliillii(I1iIiIi, new File(new File(Environment.getDataDirectory(), "local/tmp"), str), i1LIL11l2.getRotation(), point.x, point.y);
        }
    }

    public boolean il1l1IlL() {
        C0447o0OoOOo.IiiL1llIIi(new Object[0]);
        return IilliIIIlI1ll(66);
    }

    public void iliilLllIl1(String str, C0474o0Ooo0oo o0ooo0oo) {
        C0447o0OoOOo.IiiL1llIIi(str, o0ooo0oo);
        if (!this.illlI1lLIL) {
            this.iiI1L1iI.put(str, o0ooo0oo);
            return;
        }
        throw new IllegalStateException("Cannot register new watcher from within another");
    }

    public void illi1LIILLiL(boolean z) {
        iilLil1i11I1().IiiL1llIIi(z);
    }

    public void illiiliIILI(String str) {
        C0447o0OoOOo.IiiL1llIIi(str);
        if (!this.illlI1lLIL) {
            this.iiI1L1iI.remove(str);
            return;
        }
        throw new IllegalStateException("Cannot remove a watcher from within another");
    }

    public boolean illlI1lLIL(int i, int i2, int i3, int i4, int i5) {
        C0447o0OoOOo.IiiL1llIIi(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        return iilLil1i11I1().illlI1lLIL().i1iI1iiLL1(i, i2, i3, i4, i5, true);
    }

    /* renamed from: top.tntok.autobot.o0oOOO0o$iiI1L1iI */
    public class iiI1L1iI implements Runnable {
        public iiI1L1iI() {
        }

        public void run() {
        }
    }
}
