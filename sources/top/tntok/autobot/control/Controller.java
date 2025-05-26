package top.tntok.autobot.control;

import android.content.IOnPrimaryClipChangedListener;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import top.tntok.autobot.C0014OooOOo0;
import top.tntok.autobot.C0156o00Oo0Oo;
import top.tntok.autobot.C0167o00OoOOO;
import top.tntok.autobot.C0293o0O0O0oo;
import top.tntok.autobot.C0363o0OOOo0O;
import top.tntok.autobot.C0387o0OOoO0o;
import top.tntok.autobot.C0396o0OOooO;
import top.tntok.autobot.C0466o0Ooo00O;
import top.tntok.autobot.C0496o0o000oO;
import top.tntok.autobot.C0525o0oOO;
import top.tntok.autobot.C0536o0ooO;
import top.tntok.autobot.I1LILl1ILllii;
import top.tntok.autobot.ILLLLI1I1;
import top.tntok.autobot.IiIIl1LI1i;
import top.tntok.autobot.IiiIIil1l;
import top.tntok.autobot.OooOO0O;
import top.tntok.autobot.OooOOO0;
import top.tntok.autobot.OooOOOO;
import top.tntok.autobot.i11ILLI1I;
import top.tntok.autobot.iI11ilILI;
import top.tntok.autobot.iILIILIIl;
import top.tntok.autobot.iIllLiL1iILl;
import top.tntok.autobot.o00O;
import top.tntok.autobot.o0O0OO0;
import top.tntok.autobot.o0O0OOO;
import top.tntok.autobot.o0O0OOO0;
import top.tntok.autobot.o0O0o;
import top.tntok.autobot.o0OOOO0o;

public class Controller implements IiiIIil1l, C0496o0o000oO {
    public static final int ILl1iII11Ll1 = -1;
    public static final /* synthetic */ boolean i11liIIl11Ii1 = false;
    public static final ScheduledExecutorService i1iiLIil1ILi = Executors.newSingleThreadScheduledExecutor();
    public static final int iiLIIiIli = 0;
    public final I1LILl1ILllii I11lLL1;
    public final AtomicReference<iiI1L1iI> I1iIiIi = new AtomicReference<>();
    public C0396o0OOooO I1l1iIll1lIi1;
    public long IL1lILLLL1L;
    public final MotionEvent.PointerCoords[] Ii1liIIIiLi = new MotionEvent.PointerCoords[10];
    public final boolean IiIIlIL;
    public final KeyCharacterMap IiiL1llIIi = KeyCharacterMap.load(-1);
    public boolean IilL11ii1I1Il;
    public final MotionEvent.PointerProperties[] i111iLiiIIill = new MotionEvent.PointerProperties[10];
    public final Object i1L1lLllLLlIi = new Object();
    public Thread i1LIL11l;
    public final AtomicBoolean iILiI1lll = new AtomicBoolean();
    public final o0O0OO0 iL1LIlIlI = new o0O0OO0();
    public final C0014OooOOo0 iLLLILIiLi1Ii;
    public ExecutorService iiI1L1iI;
    public final boolean iiIliillii;
    public final boolean iilLiIIIi11i;
    public final i11ILLI1I iilLil1i11I1;
    public final int il1LilLllii;
    public C0466o0Ooo00O illlI1lLIL;

    public static final class iiI1L1iI {
        public final o0O0OOO i1LIL11l;
        public final int iiI1L1iI;

        public iiI1L1iI(int i, o0O0OOO o0o0ooo) {
            this.iiI1L1iI = i;
            this.i1LIL11l = o0o0ooo;
        }
    }

    public Controller(i11ILLI1I i11illi1i, I1LILl1ILllii i1LILl1ILllii, o0O0o o0o0o) {
        int iiLIIiIli2 = o0o0o.iiLIIiIli();
        this.il1LilLllii = iiLIIiIli2;
        this.iilLil1i11I1 = i11illi1i;
        this.I11lLL1 = i1LILl1ILllii;
        boolean Ii1liIIIiLi2 = o0o0o.Ii1liIIIiLi();
        this.IiIIlIL = Ii1liIIIiLi2;
        this.iilLiIIIi11i = o0o0o.IIIlll1lll();
        i111iLiiIIill();
        this.iLLLILIiLi1Ii = new C0014OooOOo0(i11illi1i);
        boolean iiLIIiIli3 = OooOO0O.iiLIIiIli(iiLIIiIli2);
        this.iiIliillii = iiLIIiIli3;
        if (!iiLIIiIli3) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("HcZtjoviIjAxxmmI36M1I3TGco/fsTI2JMdvj5qmZyA72j2ImqEoKDDJb4Lfpi41JMR8goziJSMy\nx2+e34MpIibHdJ/f83c=\n", "VKgd+//CR0Y=\n"));
        }
        if (Ii1liIIIiLi2) {
            IiIIl1LI1i illlI1lLIL2 = o0OOOO0o.illlI1lLIL();
            if (illlI1lLIL2 != null) {
                illlI1lLIL2.i1LIL11l(new IOnPrimaryClipChangedListener.Stub() {
                    public void dispatchPrimaryClipChanged() {
                        String iilLil1i11I1;
                        if (!Controller.this.iILiI1lll.get() && (iilLil1i11I1 = OooOO0O.iilLil1i11I1()) != null) {
                            Controller.this.iLLLILIiLi1Ii.iiIliillii(OooOOOO.i1LIL11l(iilLil1i11I1));
                        }
                    }
                });
            } else {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("bIvgnRqBU+BNhbKaVoVC7EODpYxayEDtUp3tjhebV+cChqWKAY1G7AKApYgfi0aiQ4qk3hWHTvJX\nkKWMVp9K7k7ErpECyFTtUI8=\n", "IuTA/nboI4I=\n"));
            }
        }
    }

    public static /* synthetic */ void i11liIIl11Ii1(int i) {
        C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("KiNRMy07UioIJVAgKDRMKgMqRQ==\n", "bEwjUERVNQo=\n"));
        OooOO0O.IilL11ii1I1Il(i, false);
    }

    public static void il1l1IlL(int i) {
        i1iiLIil1ILi.schedule(new ILLLLI1I1(i), 200, TimeUnit.MILLISECONDS);
    }

    public final void I1I11Il1() {
        o0OOOO0o.iiI1L1iI().iL1LIlIlI(new Intent(C0387o0OOoO0o.iiI1L1iI("MJorMU8bJWMikTs3SRwmPn+8DhFkLQoICLYAAnI2Hh4UoBsKbjUS\n", "UfRPQyByQU0=\n")));
    }

    public final boolean I1IIIi1i1ILl(String str, boolean z, long j) {
        this.iILiI1lll.set(true);
        boolean Ii1liIIIiLi2 = OooOO0O.Ii1liIIIiLi(str);
        this.iILiI1lll.set(false);
        if (Ii1liIIIiLi2) {
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("j+h87fF+Xean5Hrm/XoP4ev+b/A=\n", "y40KhJIbfYU=\n"));
        }
        if (z && Build.VERSION.SDK_INT >= 24 && this.iiIliillii) {
            IIlL1llI1(279, 0);
        }
        if (j != 0) {
            this.iLLLILIiLi1Ii.iiIliillii(OooOOOO.iiI1L1iI(j));
        }
        return Ii1liIIIiLi2;
    }

    public final Pair<C0293o0O0O0oo, Integer> I1iIiIi(o0O0OOO0 o0o0ooo0) {
        int i;
        C0293o0O0O0oo o0o0o0oo;
        iiI1L1iI iii1l1ii = this.I1iIiIi.get();
        if (iii1l1ii != null) {
            o0o0o0oo = iii1l1ii.i1LIL11l.illlI1lLIL(o0o0ooo0);
            if (o0o0o0oo != null) {
                i = iii1l1ii.iiI1L1iI;
            } else if (!C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
                return null;
            } else {
                C0363o0OOOo0O i1LIL11l2 = o0o0ooo0.i1LIL11l();
                C0363o0OOOo0O i1LIL11l3 = iii1l1ii.i1LIL11l.i1LIL11l();
                C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("FeyHcDWAsmYz+IBrLor8dzCrjGkii+Y2O+6HejWE5nM4q49wNcXhfybuyQ==\n", "XIvpH0flkhY=\n") + i1LIL11l2 + C0387o0OOoO0o.iiI1L1iI("IgWS82BBX6N2DYLvaFYapHEN\n", "Ai3xhhIzOs0=\n") + i1LIL11l3 + C0387o0OOoO0o.iiI1L1iI("Zw==\n", "TtkMp5IPr6E=\n"));
                return null;
            }
        } else {
            o0o0o0oo = o0o0ooo0.iiI1L1iI();
            i = this.il1LilLllii;
        }
        return Pair.create(o0o0o0oo, Integer.valueOf(i));
    }

    public final boolean I1l1iIll1lIi1(int i, int i2, int i3, int i4) {
        if (this.IilL11ii1I1Il && i == 1 && (i2 == 26 || i2 == 224)) {
            il1l1IlL(this.il1LilLllii);
        }
        return IilL11ii1I1Il(i, i2, i3, i4, 0);
    }

    public void IIIlll1lll(C0396o0OOooO o0ooooo) {
        this.I1l1iIll1lIi1 = o0ooooo;
    }

    public final void IILiIL1i11Li(String str) {
        if (this.iiI1L1iI == null) {
            this.iiI1L1iI = Executors.newSingleThreadExecutor();
        }
        this.iiI1L1iI.submit(new iIllLiL1iILl(this, str));
    }

    public final boolean IIlL1llI1(int i, int i2) {
        return OooOO0O.iL1LIlIlI(i, IiiL1llIIi(), i2);
    }

    public final iiI1L1iI IIlLill(long j) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis() + j;
        synchronized (this.i1L1lLllLLlIi) {
            try {
                iiI1L1iI iii1l1ii = this.I1iIiIi.get();
                while (iii1l1ii == null) {
                    long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                    if (currentTimeMillis2 < 0) {
                        return null;
                    }
                    this.i1L1lLllLLlIi.wait(currentTimeMillis2);
                    iii1l1ii = this.I1iIiIi.get();
                }
                return iii1l1ii;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void IL111l1() {
        if (this.I1l1iIll1lIi1 != null) {
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("jsxn+FCSzKGo0XbvWpLdpavAdw==\n", "2KUDnT+yr8A=\n"));
            this.I1l1iIll1lIi1.iLLLILIiLi1Ii();
        }
    }

    /* renamed from: IL1IiilLlLI */
    public final void IliiLiLliIl(String str) {
        OooOOO0 oooOOO0;
        boolean startsWith = str.startsWith(C0387o0OOoO0o.iiI1L1iI("MQ==\n", "GkX2jZs2+dY=\n"));
        if (startsWith) {
            str = str.substring(1);
        }
        if (str.startsWith(C0387o0OOoO0o.iiI1L1iI("EA==\n", "LyqPcj8NXc8=\n"))) {
            str = str.substring(1);
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("Xy7Q6tvbeGJhO5/I0Mx5ZGY4n+jO2HglIXKfocrAYngvMd7wntxqYGp8zObTzSt/ZjHaoA==\n", "D1y/ib6oCws=\n"));
            List<OooOOO0> il1LilLllii2 = OooOO0O.il1LilLllii(str);
            if (il1LilLllii2.isEmpty()) {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("I5tJLBJfj1wCgQcpQknASE2aCCAHD40=\n", "bfRpTWIvrzo=\n") + str + C0387o0OOoO0o.iiI1L1iI("8g==\n", "0PeNiGUUnGo=\n"));
                return;
            } else if (il1LilLllii2.size() > 1) {
                C0525o0oOO.IiIIlIL(C0167o00OoOOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("3qkTp0ZQb+315lKiWBl49+WoV/JOVmy4/qdetwgb\n", "kMYz0ig5Hpg=\n") + str + C0387o0OOoO0o.iiI1L1iI("U+I=\n", "cdjk86zDDk8=\n"), il1LilLllii2));
                return;
            } else {
                oooOOO0 = il1LilLllii2.get(0);
            }
        } else {
            oooOOO0 = OooOO0O.iiIliillii(str);
            if (oooOOO0 == null) {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("Pq9BUsig12cftQ9XmLaYc1CwAFDTsZBkUOI=\n", "cMBhM7jQ9wE=\n") + str + C0387o0OOoO0o.iiI1L1iI("Lg==\n", "DMeOgnmdscw=\n"));
                return;
            }
        }
        int i1L1lLllLLlIi2 = i1L1lLllLLlIi();
        if (i1L1lLllLLlIi2 == -1) {
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("ZzndmD+9FS0JMpSAIb4DOgk/mdMlvUIwXTePh3GzEjMJdA==\n", "KVb981HSYkM=\n") + str + C0387o0OOoO0o.iiI1L1iI("PQ==\n", "H3lopC0ZWQg=\n"));
            return;
        }
        C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("o7W/xzo7c/PQoK7FbnA=\n", "8MHetU5SHZQ=\n") + oooOOO0.iiI1L1iI() + C0387o0OOoO0o.iiI1L1iI("V6B1\n", "dYAuRqrokaQ=\n") + oooOOO0.i1LIL11l() + C0387o0OOoO0o.iiI1L1iI("LeN3BMRdWEwAr3kTxA==\n", "cMMYauQ5MT8=\n") + i1L1lLllLLlIi2 + C0387o0OOoO0o.iiI1L1iI("Pk15\n", "EGNXFQ7vSIE=\n"));
        OooOO0O.I1l1iIll1lIi1(oooOOO0.i1LIL11l(), i1L1lLllLLlIi2, startsWith);
    }

    public final C0466o0Ooo00O IL1lILLLL1L() {
        if (this.illlI1lLIL == null) {
            this.illlI1lLIL = new C0466o0Ooo00O(this.iLLLILIiLi1Ii);
        }
        return this.illlI1lLIL;
    }

    public final int ILl1iII11Ll1(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (!Ii1liIIIiLi(c)) {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("kVRRpR73iH+mG02nELKFZPJYTKgI95M7\n", "0jskyXrX5hA=\n") + String.format(C0387o0OOoO0o.iiI1L1iI("m/S4kQ==\n", "vsSM6aFKtkk=\n"), new Object[]{Integer.valueOf(c)}));
            } else {
                i++;
            }
        }
        return i;
    }

    public final boolean Ii1liIIIiLi(char c) {
        char[] cArr;
        String il1LilLllii2 = C0156o00Oo0Oo.il1LilLllii(c);
        if (il1LilLllii2 != null) {
            cArr = il1LilLllii2.toCharArray();
        } else {
            cArr = new char[]{c};
        }
        KeyEvent[] events = this.IiiL1llIIi.getEvents(cArr);
        if (events == null) {
            return false;
        }
        int IiiL1llIIi2 = IiiL1llIIi();
        for (KeyEvent IiiL1llIIi3 : events) {
            if (!OooOO0O.IiiL1llIIi(IiiL1llIIi3, IiiL1llIIi2, 0)) {
                return false;
            }
        }
        return true;
    }

    public final int IiiL1llIIi() {
        int i = this.il1LilLllii;
        if (i != -1) {
            return i;
        }
        iiI1L1iI iii1l1ii = this.I1iIiIi.get();
        if (iii1l1ii == null) {
            return 0;
        }
        return iii1l1ii.iiI1L1iI;
    }

    public final boolean IilL11ii1I1Il(int i, int i2, int i3, int i4, int i5) {
        return OooOO0O.iILiI1lll(i, i2, i3, i4, IiiL1llIIi(), i5);
    }

    public final void IilliIIIlI1ll(boolean z) {
        String str;
        String str2;
        int i = this.il1LilLllii;
        boolean z2 = false;
        if (i == -1) {
            i = 0;
        }
        if (OooOO0O.IilL11ii1I1Il(i, z)) {
            if (this.il1LilLllii != -1 && !z) {
                z2 = true;
            }
            this.IilL11ii1I1Il = z2;
            StringBuilder sb = new StringBuilder();
            sb.append(C0387o0OOoO0o.iiI1L1iI("LunNa4CwRPAD/8tugqxE4B/+1WeH9Q==\n", "aoy7AuPVZJQ=\n"));
            if (z) {
                str = "QTo=\n";
                str2 = "LlQKf6g2j38=\n";
            } else {
                str = "yhgb\n";
                str2 = "pX594kr00Fc=\n";
            }
            sb.append(C0387o0OOoO0o.iiI1L1iI(str, str2));
            C0525o0oOO.iiIliillii(sb.toString());
            I1LILl1ILllii i1LILl1ILllii = this.I11lLL1;
            if (i1LILl1ILllii != null) {
                i1LILl1ILllii.iLLLILIiLi1Ii(!z);
            }
        }
    }

    public final void i111iLiiIIill() {
        for (int i = 0; i < 10; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.toolType = 1;
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = 0.0f;
            pointerCoords.size = 0.0f;
            this.i111iLiiIIill[i] = pointerProperties;
            this.Ii1liIIIiLi[i] = pointerCoords;
        }
    }

    public final int i1L1lLllLLlIi() {
        int i = this.il1LilLllii;
        if (i != -1) {
            return i;
        }
        try {
            iiI1L1iI IIlLill = IIlLill(1000);
            if (IIlLill != null) {
                return IIlLill.iiI1L1iI;
            }
        } catch (InterruptedException unused) {
        }
        return -1;
    }

    public void i1LIL11l(IiiIIil1l.iiI1L1iI iii1l1ii) {
        Thread thread = new Thread(new iILIILIIl(this, iii1l1ii), C0387o0OOoO0o.iiI1L1iI("QNbUwRraAghR3NnD\n", "I7m6tWi1biU=\n"));
        this.i1LIL11l = thread;
        thread.start();
        this.iLLLILIiLi1Ii.iilLil1i11I1();
    }

    public final boolean i1iI1iiLL1(int i) {
        int i2 = this.il1LilLllii;
        if (i2 == -1 || OooOO0O.I1iIiIi(i2)) {
            return IilL11ii1I1Il(i, 4, 0, 0, 0);
        }
        if (i != 0) {
            return true;
        }
        if (this.IilL11ii1I1Il) {
            il1l1IlL(this.il1LilLllii);
        }
        return IIlL1llI1(26, 0);
    }

    public final boolean i1iiLIil1ILi(int i, long j, o0O0OOO0 o0o0ooo0, float f, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        int i12 = i;
        long j4 = j;
        int i13 = i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<C0293o0O0O0oo, Integer> I1iIiIi2 = I1iIiIi(o0o0ooo0);
        if (I1iIiIi2 == null) {
            return false;
        }
        C0293o0O0O0oo o0o0o0oo = (C0293o0O0O0oo) I1iIiIi2.first;
        int intValue = ((Integer) I1iIiIi2.second).intValue();
        int illlI1lLIL2 = this.iL1LIlIlI.illlI1lLIL(j4);
        if (illlI1lLIL2 == -1) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("nRPmE82N+9zpDOZazpjw17pc71zSzOHKvB/hE8Wa8Mu9\n", "yXyJM6DslaU=\n"));
            return false;
        }
        C0536o0ooO i1LIL11l2 = this.iL1LIlIlI.i1LIL11l(illlI1lLIL2);
        i1LIL11l2.iilLil1i11I1(o0o0o0oo);
        i1LIL11l2.I11lLL1(f);
        if (((i13 | i3) & -2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (j4 != -1 || (i12 != 7 && !z)) {
            this.i111iLiiIIill[illlI1lLIL2].toolType = 1;
            if (i12 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            i1LIL11l2.iLLLILIiLi1Ii(z2);
            i5 = 4098;
            i4 = 0;
        } else {
            this.i111iLiiIIill[illlI1lLIL2].toolType = 3;
            if (i3 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            i1LIL11l2.iLLLILIiLi1Ii(z3);
            i4 = i3;
            i5 = 8194;
        }
        int I11lLL12 = this.iL1LIlIlI.I11lLL1(this.i111iLiiIIill, this.Ii1liIIIiLi);
        if (I11lLL12 == 1) {
            if (i12 == 0) {
                this.IL1lILLLL1L = uptimeMillis;
            }
        } else if (i12 == 1) {
            i12 = (illlI1lLIL2 << 8) | 6;
        } else if (i12 == 0) {
            i12 = (illlI1lLIL2 << 8) | 5;
        }
        int i14 = i12;
        if (Build.VERSION.SDK_INT < 23 || i5 != 8194) {
            i8 = i5;
            i7 = i4;
            i6 = I11lLL12;
            j2 = uptimeMillis;
            i9 = intValue;
        } else if (i14 == 0) {
            if (i13 == i4) {
                long j5 = this.IL1lILLLL1L;
                MotionEvent.PointerProperties[] pointerPropertiesArr = this.i111iLiiIIill;
                i10 = I11lLL12;
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = pointerPropertiesArr;
                i11 = intValue;
                j3 = uptimeMillis;
                if (!OooOO0O.IiiL1llIIi(MotionEvent.obtain(j5, uptimeMillis, 0, i10, pointerPropertiesArr2, this.Ii1liIIIiLi, 0, i4, 1.0f, 1.0f, 0, 0, i5, 0), i11, 0)) {
                    return false;
                }
            } else {
                i10 = I11lLL12;
                i11 = intValue;
                j3 = uptimeMillis;
            }
            MotionEvent obtain = MotionEvent.obtain(this.IL1lILLLL1L, j3, 11, i10, this.i111iLiiIIill, this.Ii1liIIIiLi, 0, i4, 1.0f, 1.0f, 0, 0, i5, 0);
            if (o00O.I11lLL1(obtain, i13) && OooOO0O.IiiL1llIIi(obtain, i11, 0)) {
                return true;
            }
            return false;
        } else {
            i6 = I11lLL12;
            int i15 = intValue;
            j2 = uptimeMillis;
            if (i14 == 1) {
                MotionEvent obtain2 = MotionEvent.obtain(this.IL1lILLLL1L, j2, 12, i6, this.i111iLiiIIill, this.Ii1liIIIiLi, 0, i4, 1.0f, 1.0f, 0, 0, i5, 0);
                if (!o00O.I11lLL1(obtain2, i13) || !OooOO0O.IiiL1llIIi(obtain2, i15, 0)) {
                    return false;
                }
                if (i4 == 0) {
                    int i16 = i15;
                    int i17 = i4;
                    if (!OooOO0O.IiiL1llIIi(MotionEvent.obtain(this.IL1lILLLL1L, j2, 1, i6, this.i111iLiiIIill, this.Ii1liIIIiLi, 0, i17, 1.0f, 1.0f, 0, 0, i5, 0), i16, 0)) {
                        return false;
                    }
                }
                return true;
            }
            i9 = i15;
            i8 = i5;
            i7 = i4;
        }
        return OooOO0O.IiiL1llIIi(MotionEvent.obtain(this.IL1lILLLL1L, j2, i14, i6, this.i111iLiiIIill, this.Ii1liIIIiLi, 0, i7, 1.0f, 1.0f, 0, 0, i8, 0), i9, 0);
    }

    public final void iILiI1lll(int i) {
        String iilLil1i11I12;
        int i2;
        if (i != 0 && Build.VERSION.SDK_INT >= 24 && this.iiIliillii) {
            if (i == 1) {
                i2 = 278;
            } else {
                i2 = 277;
            }
            IIlL1llI1(i2, 2);
        }
        if (!this.IiIIlIL && (iilLil1i11I12 = OooOO0O.iilLil1i11I1()) != null) {
            this.iLLLILIiLi1Ii.iiIliillii(OooOOOO.i1LIL11l(iilLil1i11I12));
        }
    }

    public final boolean iL1LIlIlI() throws IOException {
        try {
            iI11ilILI iiI1L1iI2 = this.iilLil1i11I1.iiI1L1iI();
            switch (iiI1L1iI2.I1IIIi1i1ILl()) {
                case 0:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    I1l1iIll1lIi1(iiI1L1iI2.i1L1lLllLLlIi(), iiI1L1iI2.iiLIIiIli(), iiI1L1iI2.IIlL1llI1(), iiI1L1iI2.ILl1iII11Ll1());
                    return true;
                case 1:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    ILl1iII11Ll1(iiI1L1iI2.il1l1IlL());
                    return true;
                case 2:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    i1iiLIil1ILi(iiI1L1iI2.i1L1lLllLLlIi(), iiI1L1iI2.iiiiI1iILL11I(), iiI1L1iI2.IliiLiLliIl(), iiI1L1iI2.I1I11Il1(), iiI1L1iI2.IL1lILLLL1L(), iiI1L1iI2.iL1LIlIlI());
                    return true;
                case 3:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    iiLIIiIli(iiI1L1iI2.IliiLiLliIl(), iiI1L1iI2.IilL11ii1I1Il(), iiI1L1iI2.IilliIIIlI1ll(), iiI1L1iI2.iL1LIlIlI());
                    return true;
                case 4:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    i1iI1iiLL1(iiI1L1iI2.i1L1lLllLLlIi());
                    return true;
                case 5:
                    OooOO0O.i1LIL11l();
                    return true;
                case 6:
                    OooOO0O.illlI1lLIL();
                    return true;
                case 7:
                    OooOO0O.iiI1L1iI();
                    return true;
                case 8:
                    iILiI1lll(iiI1L1iI2.i111iLiiIIill());
                    return true;
                case 9:
                    I1IIIi1i1ILl(iiI1L1iI2.il1l1IlL(), iiI1L1iI2.i11liIIl11Ii1(), iiI1L1iI2.IL111l1());
                    return true;
                case 10:
                    if (!this.iiIliillii) {
                        return true;
                    }
                    IilliIIIlI1ll(iiI1L1iI2.i1iiLIil1ILi());
                    return true;
                case 11:
                    OooOO0O.i111iLiiIIill(IiiL1llIIi());
                    return true;
                case 12:
                    IL1lILLLL1L().IiIIlIL(iiI1L1iI2.I1l1iIll1lIi1(), iiI1L1iI2.IIIlll1lll(), iiI1L1iI2.i1iI1iiLL1(), iiI1L1iI2.il1l1IlL(), iiI1L1iI2.Ii1liIIIiLi());
                    return true;
                case 13:
                    IL1lILLLL1L().iILiI1lll(iiI1L1iI2.I1l1iIll1lIi1(), iiI1L1iI2.Ii1liIIIiLi());
                    return true;
                case 14:
                    IL1lILLLL1L().il1LilLllii(iiI1L1iI2.I1l1iIll1lIi1());
                    return true;
                case 15:
                    I1I11Il1();
                    return true;
                case 16:
                    IILiIL1i11Li(iiI1L1iI2.il1l1IlL());
                    return true;
                case 17:
                    IL111l1();
                    return true;
                default:
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void iiI1L1iI() {
        Thread thread = this.i1LIL11l;
        if (thread != null) {
            thread.interrupt();
        }
        this.iLLLILIiLi1Ii.I11lLL1();
    }

    public final boolean iiLIIiIli(o0O0OOO0 o0o0ooo0, float f, float f2, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<C0293o0O0O0oo, Integer> I1iIiIi2 = I1iIiIi(o0o0ooo0);
        if (I1iIiIi2 == null) {
            return false;
        }
        C0293o0O0O0oo o0o0o0oo = (C0293o0O0O0oo) I1iIiIi2.first;
        int intValue = ((Integer) I1iIiIi2.second).intValue();
        this.i111iLiiIIill[0].id = 0;
        MotionEvent.PointerCoords pointerCoords = this.Ii1liIIIiLi[0];
        pointerCoords.x = (float) o0o0o0oo.iiI1L1iI();
        pointerCoords.y = (float) o0o0o0oo.i1LIL11l();
        pointerCoords.setAxisValue(10, f);
        pointerCoords.setAxisValue(9, f2);
        return OooOO0O.IiiL1llIIi(MotionEvent.obtain(this.IL1lILLLL1L, uptimeMillis, 8, 1, this.i111iLiiIIill, this.Ii1liIIIiLi, 0, i, 1.0f, 1.0f, 0, 0, 8194, 0), intValue, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void iiiiI1iILL11I(top.tntok.autobot.IiiIIil1l.iiI1L1iI r5) {
        /*
            r4 = this;
            r0 = 1
            r4.iilLiIIIi11i()     // Catch:{ IOException -> 0x001c }
            java.lang.String r1 = "yQIn/4wsqrnvH2n4iiy2pe8J\n"
            java.lang.String r2 = "im1Ji/5DxtU=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            top.tntok.autobot.C0525o0oOO.iiI1L1iI(r1)
            top.tntok.autobot.o0Ooo00O r1 = r4.illlI1lLIL
            if (r1 == 0) goto L_0x0016
        L_0x0013:
            r1.iilLil1i11I1()
        L_0x0016:
            r5.iiI1L1iI(r0)
            goto L_0x003a
        L_0x001a:
            r1 = move-exception
            goto L_0x003b
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "C8a/ha95T0ct2/GUr2RMWQ==\n"
            java.lang.String r3 = "SKnR8d0WIys=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)     // Catch:{ all -> 0x001a }
            top.tntok.autobot.C0525o0oOO.il1LilLllii(r2, r1)     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "3k731e+erSD4U7nS6Z6xPPhF\n"
            java.lang.String r2 = "nSGZoZ3xwUw=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            top.tntok.autobot.C0525o0oOO.iiI1L1iI(r1)
            top.tntok.autobot.o0Ooo00O r1 = r4.illlI1lLIL
            if (r1 == 0) goto L_0x0016
            top.tntok.autobot.o0Ooo00O r1 = r4.illlI1lLIL
            goto L_0x0013
        L_0x003a:
            return
        L_0x003b:
            java.lang.String r2 = "+CFU0RUPAMLePBrWEw8c3t4q\n"
            java.lang.String r3 = "u046pWdgbK4=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)
            top.tntok.autobot.C0525o0oOO.iiI1L1iI(r2)
            top.tntok.autobot.o0Ooo00O r2 = r4.illlI1lLIL
            if (r2 == 0) goto L_0x004d
            r2.iilLil1i11I1()
        L_0x004d:
            r5.iiI1L1iI(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.control.Controller.iiiiI1iILL11I(top.tntok.autobot.IiiIIil1l$iiI1L1iI):void");
    }

    public final void iilLiIIIi11i() throws IOException {
        int i;
        if (this.iilLiIIIi11i && (i = this.il1LilLllii) == 0 && !OooOO0O.I1iIiIi(i)) {
            OooOO0O.iL1LIlIlI(26, this.il1LilLllii, 0);
            SystemClock.sleep(500);
        }
        boolean z = true;
        while (!Thread.currentThread().isInterrupted() && z) {
            z = iL1LIlIlI();
        }
    }

    public void il1LilLllii(int i, o0O0OOO o0o0ooo) {
        if (this.I1iIiIi.getAndSet(new iiI1L1iI(i, o0o0ooo)) == null) {
            synchronized (this.i1L1lLllLLlIi) {
                this.i1L1lLllLLlIi.notify();
            }
        }
    }

    public void illlI1lLIL() throws InterruptedException {
        Thread thread = this.i1LIL11l;
        if (thread != null) {
            thread.join();
        }
        this.iLLLILIiLi1Ii.i1LIL11l();
    }
}
