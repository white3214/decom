package top.tntok.autobot;

import android.app.UiAutomation;
import android.graphics.Point;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.InputEvent;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class o00OO000 {
    public static final int I11lLL1 = 5;
    public static final boolean iiIliillii = Log.isLoggable(o00OO000.class.getSimpleName(), 3);
    public static final long iilLil1i11I1 = 100;
    public static final String il1LilLllii = "o00OO000";
    public final C0467o0Ooo00o i1LIL11l;
    public final KeyCharacterMap iiI1L1iI = KeyCharacterMap.load(-1);
    public long illlI1lLIL;

    public class i1LIL11l implements Runnable {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ int iiI1L1iI;

        public i1LIL11l(int i, int i2) {
            this.iiI1L1iI = i;
            this.i1LIL11l = i2;
        }

        public void run() {
            if (o00OO000.this.il1l1IlL(this.iiI1L1iI, this.i1LIL11l)) {
                SystemClock.sleep(100);
                boolean unused = o00OO000.this.IilliIIIlI1ll(this.iiI1L1iI, this.i1LIL11l);
            }
        }
    }

    public class iiI1L1iI implements Runnable {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ int iiI1L1iI;

        public iiI1L1iI(int i, int i2) {
            this.iiI1L1iI = i;
            this.i1LIL11l = i2;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis;
            long j2 = uptimeMillis;
            long j3 = uptimeMillis;
            KeyEvent keyEvent = r1;
            KeyEvent keyEvent2 = new KeyEvent(j, j2, 0, this.iiI1L1iI, 0, this.i1LIL11l, -1, 0, 0, 257);
            if (o00OO000.this.IiiL1llIIi(keyEvent)) {
                boolean unused = o00OO000.this.IiiL1llIIi(new KeyEvent(j3, j3, 1, this.iiI1L1iI, 0, this.i1LIL11l, -1, 0, 0, 257));
            }
        }
    }

    public class iiIliillii implements UiAutomation.AccessibilityEventFilter {
        public int iiI1L1iI;

        public iiIliillii(int i) {
            this.iiI1L1iI = i;
        }

        public boolean accept(AccessibilityEvent accessibilityEvent) {
            int eventType = accessibilityEvent.getEventType();
            int i = this.iiI1L1iI;
            if ((eventType & i) == 0) {
                return false;
            }
            int i2 = (~accessibilityEvent.getEventType()) & i;
            this.iiI1L1iI = i2;
            if (i2 != 0) {
                return false;
            }
            return true;
        }
    }

    public class iilLil1i11I1 implements UiAutomation.AccessibilityEventFilter {
        public int iiI1L1iI;

        public iilLil1i11I1(int i) {
            this.iiI1L1iI = i;
        }

        public boolean accept(AccessibilityEvent accessibilityEvent) {
            if ((accessibilityEvent.getEventType() & this.iiI1L1iI) != 0) {
                return true;
            }
            return false;
        }
    }

    public class il1LilLllii implements UiAutomation.AccessibilityEventFilter {
        public List<AccessibilityEvent> i1LIL11l;
        public int iiI1L1iI;

        public il1LilLllii(int i, List<AccessibilityEvent> list) {
            this.iiI1L1iI = i;
            this.i1LIL11l = list;
        }

        public boolean accept(AccessibilityEvent accessibilityEvent) {
            if ((accessibilityEvent.getEventType() & this.iiI1L1iI) == 0) {
                return false;
            }
            this.i1LIL11l.add(AccessibilityEvent.obtain(accessibilityEvent));
            return false;
        }
    }

    public class illlI1lLIL implements Runnable {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ int iiI1L1iI;
        public final /* synthetic */ int iiIliillii;
        public final /* synthetic */ int il1LilLllii;
        public final /* synthetic */ int illlI1lLIL;

        public illlI1lLIL(int i, int i2, int i3, int i4, int i5) {
            this.iiI1L1iI = i;
            this.i1LIL11l = i2;
            this.illlI1lLIL = i3;
            this.il1LilLllii = i4;
            this.iiIliillii = i5;
        }

        public void run() {
            o00OO000.this.I1I11Il1(this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii);
        }
    }

    public o00OO000(C0467o0Ooo00o o0ooo00o) {
        this.i1LIL11l = o0ooo00o;
    }

    public final Runnable I11lLL1(int i, int i2) {
        return new i1LIL11l(i, i2);
    }

    public boolean I1I11Il1(int i, int i2, int i3, int i4, int i5) {
        return i1iI1iiLL1(i, i2, i3, i4, i5, false);
    }

    public final boolean I1IIIi1i1ILl(int i, int i2) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("touchMove (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
        }
        MotionEvent obtain = MotionEvent.obtain(this.illlI1lLIL, SystemClock.uptimeMillis(), 2, (float) i, (float) i2, 1);
        obtain.setSource(4098);
        return IiiL1llIIi(obtain);
    }

    public boolean I1iIiIi(int i, int i2) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("longTapNoSync (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
        }
        if (!il1l1IlL(i, i2)) {
            return false;
        }
        SystemClock.sleep(this.i1LIL11l.I11lLL1());
        if (IilliIIIlI1ll(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean I1l1iIll1lIi1(int i, int i2) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendKey (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
        } else {
            int i3 = i;
            int i4 = i2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!IiiL1llIIi(new KeyEvent(uptimeMillis, uptimeMillis, 0, i, 0, i2, -1, 0, 0, 257)) || !IiiL1llIIi(new KeyEvent(uptimeMillis, uptimeMillis, 1, i, 0, i2, -1, 0, 0, 257))) {
            return false;
        }
        return true;
    }

    public void IIIlll1lll() {
        this.i1LIL11l.I1iIiIi(-2);
    }

    public boolean IIlL1llI1(Point[] pointArr, int i) {
        int i2;
        int i3;
        int i4;
        Point[] pointArr2 = pointArr;
        int i5 = i;
        if (i5 == 0) {
            i2 = 1;
        } else {
            i2 = i5;
        }
        int i6 = 0;
        if (pointArr2.length == 0) {
            return false;
        }
        Point point = pointArr2[0];
        boolean il1l1IlL = il1l1IlL(point.x, point.y);
        while (i6 < pointArr2.length) {
            int i7 = i6 + 1;
            if (i7 < pointArr2.length) {
                Point point2 = pointArr2[i7];
                int i8 = point2.x;
                Point point3 = pointArr2[i6];
                double d = (double) i2;
                double d2 = ((double) (i8 - point3.x)) / d;
                double d3 = ((double) (point2.y - point3.y)) / d;
                int i9 = 1;
                while (true) {
                    if (i9 >= i5) {
                        break;
                    }
                    Point point4 = pointArr2[i6];
                    i4 = i2;
                    double d4 = (double) i9;
                    int i10 = i6;
                    i3 = i7;
                    il1l1IlL &= I1IIIi1i1ILl(point4.x + ((int) (d2 * d4)), point4.y + ((int) (d4 * d3)));
                    if (!il1l1IlL) {
                        break;
                    }
                    SystemClock.sleep(5);
                    i9++;
                    i2 = i4;
                    i6 = i10;
                    i7 = i3;
                }
            }
            i4 = i2;
            i3 = i7;
            i2 = i4;
            i6 = i3;
        }
        return IilliIIIlI1ll(pointArr2[pointArr2.length - 1].x, pointArr2[pointArr2.length - 1].y) & il1l1IlL;
    }

    public boolean IL111l1() {
        return this.i1LIL11l.iilLiIIIi11i(3);
    }

    public boolean IL1IiilLlLI() throws RemoteException {
        if (iILiI1lll()) {
            return false;
        }
        I1l1iIll1lIi1(26, 0);
        return true;
    }

    public boolean IL1lILLLL1L() {
        return this.i1LIL11l.iilLiIIIi11i(5);
    }

    public boolean ILl1iII11Ll1(String str) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendText (");
            sb.append(str);
            sb.append(")");
        }
        KeyEvent[] events = this.iiI1L1iI.getEvents(str.toCharArray());
        if (events == null) {
            return true;
        }
        long illlI1lLIL2 = ILiI1LilIi.i1LIL11l().illlI1lLIL();
        for (KeyEvent changeTimeRepeat : events) {
            if (!IiiL1llIIi(KeyEvent.changeTimeRepeat(changeTimeRepeat, SystemClock.uptimeMillis(), 0))) {
                return false;
            }
            SystemClock.sleep(illlI1lLIL2);
        }
        return true;
    }

    public final AccessibilityEvent Ii1liIIIiLi(Runnable runnable, UiAutomation.AccessibilityEventFilter accessibilityEventFilter, long j) {
        try {
            return this.i1LIL11l.iiI1L1iI(runnable, accessibilityEventFilter, j);
        } catch (Exception | TimeoutException unused) {
            return null;
        }
    }

    public final AccessibilityEvent IiIIlIL(List<AccessibilityEvent> list, int i) {
        for (int size = list.size(); size > 0; size--) {
            AccessibilityEvent accessibilityEvent = list.get(size - 1);
            if (accessibilityEvent.getEventType() == i) {
                return accessibilityEvent;
            }
        }
        return null;
    }

    public final boolean IiiL1llIIi(InputEvent inputEvent) {
        return this.i1LIL11l.iLLLILIiLi1Ii(inputEvent, true);
    }

    public boolean IilL11ii1I1Il(int i, int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("scrollSwipe (");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(")");
        illlI1lLIL illli1llil = new illlI1lLIL(i, i2, i3, i4, i5);
        ArrayList arrayList = new ArrayList();
        Ii1liIIIiLi(illli1llil, new il1LilLllii(4096, arrayList), ILiI1LilIi.i1LIL11l().il1LilLllii());
        AccessibilityEvent IiIIlIL = IiIIlIL(arrayList, 4096);
        boolean z = false;
        if (IiIIlIL == null) {
            i111iLiiIIill(arrayList);
            return false;
        }
        if (IiIIlIL.getFromIndex() != -1 && IiIIlIL.getToIndex() != -1 && IiIIlIL.getItemCount() != -1) {
            if (IiIIlIL.getFromIndex() == 0 || IiIIlIL.getItemCount() - 1 == IiIIlIL.getToIndex()) {
                z = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("scrollSwipe reached scroll end: ");
            sb2.append(z);
        } else if (!(IiIIlIL.getScrollX() == -1 || IiIIlIL.getScrollY() == -1)) {
            if (i == i3) {
                if (IiIIlIL.getScrollY() == 0 || IiIIlIL.getScrollY() == IiIIlIL.getMaxScrollY()) {
                    z = true;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Vertical scrollSwipe reached scroll end: ");
                sb3.append(z);
            } else if (i2 == i4) {
                if (IiIIlIL.getScrollX() == 0 || IiIIlIL.getScrollX() == IiIIlIL.getMaxScrollX()) {
                    z = true;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Horizontal scrollSwipe reached scroll end: ");
                sb4.append(z);
            }
        }
        i111iLiiIIill(arrayList);
        return !z;
    }

    public final boolean IilliIIIlI1ll(int i, int i2) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("touchUp (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
        }
        MotionEvent obtain = MotionEvent.obtain(this.illlI1lLIL, SystemClock.uptimeMillis(), 1, (float) i, (float) i2, 1);
        obtain.setSource(4098);
        this.illlI1lLIL = 0;
        return IiiL1llIIi(obtain);
    }

    public boolean IliiLiLliIl() throws RemoteException {
        if (!iILiI1lll()) {
            return false;
        }
        I1l1iIll1lIi1(26, 0);
        return true;
    }

    public final void i111iLiiIIill(List<AccessibilityEvent> list) {
        for (AccessibilityEvent recycle : list) {
            recycle.recycle();
        }
        list.clear();
    }

    public void i11liIIl11Ii1() {
        this.i1LIL11l.I1iIiIi(0);
    }

    public boolean i1L1lLllLLlIi() {
        return this.i1LIL11l.iilLiIIIi11i(4);
    }

    public boolean i1iI1iiLL1(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7 = i3;
        int i8 = i4;
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = i5;
        }
        double d = (double) i6;
        double d2 = ((double) (i7 - i)) / d;
        double d3 = ((double) (i8 - i2)) / d;
        boolean il1l1IlL = il1l1IlL(i, i2);
        if (z) {
            SystemClock.sleep(this.i1LIL11l.I11lLL1());
        }
        for (int i9 = 1; i9 < i6; i9++) {
            double d4 = (double) i9;
            il1l1IlL &= I1IIIi1i1ILl(i + ((int) (d2 * d4)), i2 + ((int) (d4 * d3)));
            if (!il1l1IlL) {
                break;
            }
            SystemClock.sleep(5);
        }
        if (z) {
            SystemClock.sleep(100);
        }
        return IilliIIIlI1ll(i7, i8) & il1l1IlL;
    }

    public void i1iiLIil1ILi() {
        this.i1LIL11l.I1iIiIi(1);
    }

    public boolean iILiI1lll() throws RemoteException {
        return this.i1LIL11l.IiIIlIL();
    }

    public boolean iL1LIlIlI(MotionEvent.PointerCoords[]... pointerCoordsArr) {
        MotionEvent.PointerCoords[][] pointerCoordsArr2 = pointerCoordsArr;
        if (pointerCoordsArr2.length >= 2) {
            int i = 0;
            for (MotionEvent.PointerCoords[] pointerCoordsArr3 : pointerCoordsArr2) {
                if (i < pointerCoordsArr3.length) {
                    i = pointerCoordsArr3.length;
                }
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCoordsArr2.length];
            MotionEvent.PointerCoords[] pointerCoordsArr4 = new MotionEvent.PointerCoords[pointerCoordsArr2.length];
            for (int i2 = 0; i2 < pointerCoordsArr2.length; i2++) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = i2;
                pointerProperties.toolType = 1;
                pointerPropertiesArr[i2] = pointerProperties;
                pointerCoordsArr4[i2] = pointerCoordsArr2[i2][0];
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent.PointerCoords[] pointerCoordsArr5 = pointerCoordsArr4;
            boolean IiiL1llIIi = IiiL1llIIi(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 0, 1, pointerPropertiesArr, pointerCoordsArr4, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
            int i3 = 1;
            while (i3 < pointerCoordsArr2.length) {
                int i4 = i3 + 1;
                IiiL1llIIi &= IiiL1llIIi(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), iilLiIIIi11i(5, i3), i4, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                i3 = i4;
            }
            for (int i5 = 1; i5 < i - 1; i5++) {
                for (int i6 = 0; i6 < pointerCoordsArr2.length; i6++) {
                    MotionEvent.PointerCoords[] pointerCoordsArr6 = pointerCoordsArr2[i6];
                    if (pointerCoordsArr6.length > i5) {
                        pointerCoordsArr5[i6] = pointerCoordsArr6[i5];
                    } else {
                        pointerCoordsArr5[i6] = pointerCoordsArr6[pointerCoordsArr6.length - 1];
                    }
                }
                IiiL1llIIi &= IiiL1llIIi(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 2, pointerCoordsArr2.length, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                SystemClock.sleep(5);
            }
            for (int i7 = 0; i7 < pointerCoordsArr2.length; i7++) {
                MotionEvent.PointerCoords[] pointerCoordsArr7 = pointerCoordsArr2[i7];
                pointerCoordsArr5[i7] = pointerCoordsArr7[pointerCoordsArr7.length - 1];
            }
            int i8 = 1;
            while (i8 < pointerCoordsArr2.length) {
                int i9 = i8 + 1;
                IiiL1llIIi &= IiiL1llIIi(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), iilLiIIIi11i(6, i8), i9, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                i8 = i9;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("x ");
            sb.append(pointerCoordsArr5[0].x);
            return IiiL1llIIi & IiiL1llIIi(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 1, 1, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
        }
        throw new IllegalArgumentException("Must provide coordinates for at least 2 pointers");
    }

    public void iLLLILIiLi1Ii() {
        this.i1LIL11l.I1iIiIi(-1);
    }

    public boolean iiIliillii(int i, int i2, long j) {
        String.format("clickAndWaitForNewWindow(%d, %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (Ii1liIIIiLi(I11lLL1(i, i2), new iiIliillii(2080), j) != null) {
            return true;
        }
        return false;
    }

    public boolean iiLIIiIli(int i, int i2, int i3, long j) {
        if (Ii1liIIIiLi(new iiI1L1iI(i, i2), new iilLil1i11I1(i3), j) != null) {
            return true;
        }
        return false;
    }

    public void iiiiI1iILL11I() {
        this.i1LIL11l.I1iIiIi(3);
    }

    public final int iilLiIIIi11i(int i, int i2) {
        return i + (i2 << 8);
    }

    public boolean iilLil1i11I1(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("clickNoSync (");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        if (!il1l1IlL(i, i2)) {
            return false;
        }
        SystemClock.sleep(100);
        if (IilliIIIlI1ll(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean il1LilLllii(int i, int i2, long j) {
        String.format("clickAndSync(%d, %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (Ii1liIIIiLi(I11lLL1(i, i2), new iilLil1i11I1(2052), j) != null) {
            return true;
        }
        return false;
    }

    public final boolean il1l1IlL(int i, int i2) {
        if (iiIliillii) {
            StringBuilder sb = new StringBuilder();
            sb.append("touchDown (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.illlI1lLIL = uptimeMillis;
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) i, (float) i2, 1);
        obtain.setSource(4098);
        return IiiL1llIIi(obtain);
    }
}
