package top.tntok.autobot;

import android.app.IInstrumentationWatcher;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Debug;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.SystemClock;
import android.test.RepetitiveTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import top.tntok.autobot.C0447o0OoOOo;

/* renamed from: top.tntok.autobot.o0oOOOoo  reason: case insensitive filesystem */
public class C0528o0oOOOoo {
    public static final String I1iIiIi = "UiAutomatorHandlerThread";
    public static final int IiiL1llIIi = 0;
    public static final int iILiI1lll = -1;
    public static final String iilLiIIIi11i = "o0oOOOoo";
    public final C0112o000ooO I11lLL1 = new iiI1L1iI();
    public HandlerThread IiIIlIL;
    public boolean i1LIL11l;
    public final List<C0423o0Oo0o0o> iLLLILIiLi1Ii = new ArrayList();
    public boolean iiI1L1iI;
    public List<String> iiIliillii = null;
    public final illlI1lLIL iilLil1i11I1 = new illlI1lLIL(this, (iiI1L1iI) null);
    public C0527o0oOOO0o il1LilLllii;
    public Bundle illlI1lLIL = null;

    /* renamed from: top.tntok.autobot.o0oOOOoo$i1LIL11l */
    public class i1LIL11l implements Thread.UncaughtExceptionHandler {
        public i1LIL11l() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String unused = C0528o0oOOOoo.iilLiIIIi11i;
            Bundle bundle = new Bundle();
            bundle.putString("shortMsg", th.getClass().getName());
            bundle.putString("longMsg", th.getMessage());
            C0528o0oOOOoo.this.iilLil1i11I1.i1LIL11l((ComponentName) null, 0, bundle);
            System.exit(-1);
        }
    }

    /* renamed from: top.tntok.autobot.o0oOOOoo$iiI1L1iI */
    public class iiI1L1iI implements C0112o000ooO {
        public iiI1L1iI() {
        }

        public void iiI1L1iI(int i, Bundle bundle) {
            C0528o0oOOOoo.this.iilLil1i11I1.illlI1lLIL((ComponentName) null, i, bundle);
        }
    }

    /* renamed from: top.tntok.autobot.o0oOOOoo$iiIliillii */
    public class iiIliillii extends oo0oO0 implements il1LilLllii {
        public final boolean illlI1lLIL;

        public iiIliillii(PrintStream printStream, boolean z) {
            super(printStream);
            this.illlI1lLIL = z;
        }

        public void il1LilLllii(Throwable th) {
            if (this.illlI1lLIL) {
                iLLLILIiLi1Ii().printf("Test run aborted due to unexpected exeption: %s", new Object[]{th.getMessage()});
                th.printStackTrace(iLLLILIiLi1Ii());
            }
        }

        public void illlI1lLIL(C0428o0Oo0oo0 o0oo0oo0, long j, Bundle bundle) {
            i111iLiiIIill(j);
            if (this.illlI1lLIL) {
                i1L1lLllLLlIi(o0oo0oo0);
                IL1lILLLL1L(o0oo0oo0);
            }
            iL1LIlIlI(o0oo0oo0);
        }
    }

    /* renamed from: top.tntok.autobot.o0oOOOoo$iilLil1i11I1 */
    public class iilLil1i11I1 implements il1LilLllii {
        public static final String I1iIiIi = "test";
        public static final String IL1lILLLL1L = "UiAutomatorTestRunner";
        public static final int Ii1liIIIiLi = -1;
        public static final String IiiL1llIIi = "class";
        public static final int IilL11ii1I1Il = -2;
        public static final int i111iLiiIIill = 1;
        public static final String i1L1lLllLLlIi = "numiterations";
        public static final String iILiI1lll = "current";
        public static final String iL1LIlIlI = "stack";
        public static final String iilLiIIIi11i = "numtests";
        public final ByteArrayOutputStream I11lLL1;
        public Bundle i1LIL11l;
        public final PrintStream iLLLILIiLi1Ii;
        public final Bundle iiI1L1iI;
        public String iiIliillii = null;
        public final iiIliillii iilLil1i11I1;
        public int il1LilLllii = 0;
        public int illlI1lLIL = 0;

        public iilLil1i11I1(int i) {
            Bundle bundle = new Bundle();
            this.iiI1L1iI = bundle;
            bundle.putString("id", IL1lILLLL1L);
            bundle.putInt(iilLiIIIi11i, i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.I11lLL1 = byteArrayOutputStream;
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            this.iLLLILIiLi1Ii = printStream;
            this.iilLil1i11I1 = new iiIliillii(printStream, false);
        }

        public void i1LIL11l(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
            this.i1LIL11l.putString(iL1LIlIlI, il11iII1.iILiI1lll(th));
            this.il1LilLllii = -1;
            this.i1LIL11l.putString("stream", String.format("\nError in %s:\n%s", new Object[]{((C0534o0oOoo00) o0ooo0o0).illi1LIILLiL(), il11iII1.iILiI1lll(th)}));
            this.iilLil1i11I1.i1LIL11l(o0ooo0o0, th);
        }

        public void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, IillLillLLIii iillLillLLIii) {
            this.i1LIL11l.putString(iL1LIlIlI, il11iII1.iILiI1lll(iillLillLLIii));
            this.il1LilLllii = -2;
            this.i1LIL11l.putString("stream", String.format("\nFailure in %s:\n%s", new Object[]{((C0534o0oOoo00) o0ooo0o0).illi1LIILLiL(), il11iII1.iILiI1lll(iillLillLLIii)}));
            this.iilLil1i11I1.iiI1L1iI(o0ooo0o0, iillLillLLIii);
        }

        public void iiIliillii(C0532o0oOo0o0 o0ooo0o0) {
            String name = o0ooo0o0.getClass().getName();
            String illi1LIILLiL = ((C0534o0oOoo00) o0ooo0o0).illi1LIILLiL();
            Bundle bundle = new Bundle(this.iiI1L1iI);
            this.i1LIL11l = bundle;
            bundle.putString(IiiL1llIIi, name);
            this.i1LIL11l.putString(I1iIiIi, illi1LIILLiL);
            Bundle bundle2 = this.i1LIL11l;
            int i = this.illlI1lLIL + 1;
            this.illlI1lLIL = i;
            bundle2.putInt(iILiI1lll, i);
            if (!name.equals(this.iiIliillii)) {
                this.i1LIL11l.putString("stream", String.format("\n%s:", new Object[]{name}));
                this.iiIliillii = name;
            } else {
                this.i1LIL11l.putString("stream", "");
            }
            try {
                Method method = o0ooo0o0.getClass().getMethod(illi1LIILLiL, (Class[]) null);
                if (method.isAnnotationPresent(RepetitiveTest.class)) {
                    this.i1LIL11l.putInt(i1L1lLllLLlIi, method.getAnnotation(RepetitiveTest.class).numIterations());
                }
            } catch (NoSuchMethodException unused) {
            }
            C0528o0oOOOoo.this.I11lLL1.iiI1L1iI(1, this.i1LIL11l);
            this.il1LilLllii = 0;
            this.iilLil1i11I1.iiIliillii(o0ooo0o0);
        }

        public void iilLil1i11I1(C0532o0oOo0o0 o0ooo0o0) {
            if (this.il1LilLllii == 0) {
                this.i1LIL11l.putString("stream", ".");
            }
            C0528o0oOOOoo.this.I11lLL1.iiI1L1iI(this.il1LilLllii, this.i1LIL11l);
            this.iilLil1i11I1.iilLil1i11I1(o0ooo0o0);
        }

        public void il1LilLllii(Throwable th) {
            this.iLLLILIiLi1Ii.println(String.format("Test run aborted due to unexpected exception: %s", new Object[]{th.getMessage()}));
            th.printStackTrace(this.iLLLILIiLi1Ii);
        }

        public void illlI1lLIL(C0428o0Oo0oo0 o0oo0oo0, long j, Bundle bundle) {
            this.iilLil1i11I1.illlI1lLIL(o0oo0oo0, j, bundle);
            bundle.putString("stream", String.format("\nTest results for %s=%s", new Object[]{getClass().getSimpleName(), this.I11lLL1.toString()}));
            this.iLLLILIiLi1Ii.close();
            C0528o0oOOOoo.this.I11lLL1.iiI1L1iI(-1, bundle);
        }
    }

    /* renamed from: top.tntok.autobot.o0oOOOoo$il1LilLllii */
    public interface il1LilLllii extends C0423o0Oo0o0o {
        void il1LilLllii(Throwable th);

        void illlI1lLIL(C0428o0Oo0oo0 o0oo0oo0, long j, Bundle bundle);
    }

    public void I11lLL1(C0534o0oOoo00 o0oooo00) {
        C0469o0Ooo0O0 o0ooo0o0 = (C0469o0Ooo0O0) o0oooo00;
        o0ooo0o0.I1LiliILi1lI1(this.I11lLL1);
        o0ooo0o0.IiiIIil1l(this.il1LilLllii);
        o0ooo0o0.iLILliI1(this.illlI1lLIL);
    }

    public void IiIIlIL(List<String> list, Bundle bundle, boolean z, boolean z2) {
        Thread.setDefaultUncaughtExceptionHandler(new i1LIL11l());
        this.iiIliillii = list;
        this.illlI1lLIL = bundle;
        this.iiI1L1iI = z;
        this.i1LIL11l = z2;
        iilLiIIIi11i();
        System.exit(0);
    }

    public void iLLLILIiLi1Ii(C0423o0Oo0o0o o0oo0o0o) {
        this.iLLLILIiLi1Ii.remove(o0oo0o0o);
    }

    public C0416o0Oo0OOo iiIliillii(ClassLoader classLoader) {
        return new C0416o0Oo0OOo(classLoader, iilLil1i11I1());
    }

    public void iilLiIIIi11i() {
        il1LilLllii il1lillllii;
        C0416o0Oo0OOo iiIliillii2 = iiIliillii(getClass().getClassLoader());
        try {
            iiIliillii2.il1LilLllii(this.iiIliillii);
            if (this.iiI1L1iI) {
                Debug.waitForDebugger();
            }
            HandlerThread handlerThread = new HandlerThread("UiAutomatorHandlerThread");
            this.IiIIlIL = handlerThread;
            handlerThread.setDaemon(true);
            this.IiIIlIL.start();
            C0526o0oOO0Oo o0ooo0oo = new C0526o0oOO0Oo();
            o0ooo0oo.iiI1L1iI();
            long uptimeMillis = SystemClock.uptimeMillis();
            C0428o0Oo0oo0 o0oo0oo0 = new C0428o0Oo0oo0();
            String string = this.illlI1lLIL.getString("outputFormat");
            List<C0534o0oOoo00> iilLil1i11I12 = iiIliillii2.iilLil1i11I1();
            Bundle bundle = new Bundle();
            if ("simple".equals(string)) {
                il1lillllii = new iiIliillii(System.out, true);
            } else {
                il1lillllii = new iilLil1i11I1(iilLil1i11I12.size());
            }
            try {
                o0ooo0oo.iiIliillii(this.i1LIL11l);
                C0527o0oOOO0o I1iIiIi2 = C0527o0oOOO0o.I1iIiIi();
                this.il1LilLllii = I1iIiIi2;
                I1iIiIi2.Ii1liIIIiLi(new C0356o0OOOOOo(o0ooo0oo.illlI1lLIL()));
                String string2 = this.illlI1lLIL.getString("traceOutputMode");
                if (string2 != null) {
                    C0447o0OoOOo.il1LilLllii il1lillllii2 = (C0447o0OoOOo.il1LilLllii) Enum.valueOf(C0447o0OoOOo.il1LilLllii.class, string2);
                    if (il1lillllii2 != C0447o0OoOOo.il1LilLllii.FILE) {
                        if (il1lillllii2 == C0447o0OoOOo.il1LilLllii.ALL) {
                        }
                        C0447o0OoOOo.il1LilLllii().iilLiIIIi11i(il1lillllii2);
                    }
                    String string3 = this.illlI1lLIL.getString("traceLogFilename");
                    if (string3 != null) {
                        C0447o0OoOOo.il1LilLllii().IiIIlIL(string3);
                        C0447o0OoOOo.il1LilLllii().iilLiIIIi11i(il1lillllii2);
                    } else {
                        throw new RuntimeException("Name of log file not specified. Please specify it using traceLogFilename parameter");
                    }
                }
                o0oo0oo0.illlI1lLIL(il1lillllii);
                for (C0423o0Oo0o0o illlI1lLIL2 : this.iLLLILIiLi1Ii) {
                    o0oo0oo0.illlI1lLIL(illlI1lLIL2);
                }
                for (C0534o0oOoo00 next : iilLil1i11I12) {
                    I11lLL1(next);
                    next.i1LIL11l(o0oo0oo0);
                }
            } catch (Throwable th) {
                il1lillllii.illlI1lLIL(o0oo0oo0, SystemClock.uptimeMillis() - uptimeMillis, bundle);
                o0ooo0oo.i1LIL11l();
                o0ooo0oo.iiIliillii(false);
                this.IiIIlIL.quit();
                throw th;
            }
            il1lillllii.illlI1lLIL(o0oo0oo0, SystemClock.uptimeMillis() - uptimeMillis, bundle);
            o0ooo0oo.i1LIL11l();
            o0ooo0oo.iiIliillii(false);
            this.IiIIlIL.quit();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public C0468o0Ooo0O iilLil1i11I1() {
        return new C0468o0Ooo0O();
    }

    public void il1LilLllii(C0423o0Oo0o0o o0oo0o0o) {
        if (!this.iLLLILIiLi1Ii.contains(o0oo0o0o)) {
            this.iLLLILIiLi1Ii.add(o0oo0o0o);
        }
    }

    /* renamed from: top.tntok.autobot.o0oOOOoo$illlI1lLIL */
    public class illlI1lLIL implements IInstrumentationWatcher {
        public final boolean iiI1L1iI;

        public illlI1lLIL() {
            this.iiI1L1iI = true;
        }

        public void i1LIL11l(ComponentName componentName, int i, Bundle bundle) {
            synchronized (this) {
                if (bundle != null) {
                    try {
                        for (String next : bundle.keySet()) {
                            PrintStream printStream = System.out;
                            printStream.println("INSTRUMENTATION_RESULT: " + next + "=" + bundle.get(next));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                PrintStream printStream2 = System.out;
                printStream2.println("INSTRUMENTATION_CODE: " + i);
                notifyAll();
            }
        }

        public IBinder iiI1L1iI() {
            throw new UnsupportedOperationException("I'm just a fake!");
        }

        public void illlI1lLIL(ComponentName componentName, int i, Bundle bundle) {
            synchronized (this) {
                if (bundle != null) {
                    try {
                        for (String next : bundle.keySet()) {
                            PrintStream printStream = System.out;
                            printStream.println("INSTRUMENTATION_STATUS: " + next + "=" + bundle.get(next));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                PrintStream printStream2 = System.out;
                printStream2.println("INSTRUMENTATION_STATUS_CODE: " + i);
                notifyAll();
            }
        }

        public /* synthetic */ illlI1lLIL(C0528o0oOOOoo o0oooooo, iiI1L1iI iii1l1ii) {
            this();
        }
    }
}
