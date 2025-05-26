package top.tntok.autobot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: top.tntok.autobot.o0OoOOo  reason: case insensitive filesystem */
public class C0447o0OoOOo {
    public static final int I11lLL1 = 5;
    public static C0447o0OoOOo IiIIlIL = null;
    public static final int iLLLILIiLi1Ii = 7;
    public static final String iiIliillii = "com.android.uiautomator.core";
    public static final int iilLil1i11I1 = 6;
    public static final String il1LilLllii = "(unknown method)";
    public List<iiIliillii> i1LIL11l = new ArrayList();
    public il1LilLllii iiI1L1iI = il1LilLllii.NONE;
    public File illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OoOOo$i1LIL11l */
    public class i1LIL11l implements iiIliillii {
        public SimpleDateFormat i1LIL11l = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        public PrintWriter iiI1L1iI;

        public i1LIL11l(File file) throws FileNotFoundException {
            this.iiI1L1iI = new PrintWriter(file);
        }

        public void close() {
            this.iiI1L1iI.close();
        }

        public void iiI1L1iI(String str) {
            this.iiI1L1iI.printf("%s %s\n", new Object[]{this.i1LIL11l.format(new Date()), str});
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOOo$iiI1L1iI */
    public static /* synthetic */ class iiI1L1iI {
        public static final /* synthetic */ int[] iiI1L1iI;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                top.tntok.autobot.o0OoOOo$il1LilLllii[] r0 = top.tntok.autobot.C0447o0OoOOo.il1LilLllii.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iiI1L1iI = r0
                top.tntok.autobot.o0OoOOo$il1LilLllii r1 = top.tntok.autobot.C0447o0OoOOo.il1LilLllii.FILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = iiI1L1iI     // Catch:{ NoSuchFieldError -> 0x001d }
                top.tntok.autobot.o0OoOOo$il1LilLllii r1 = top.tntok.autobot.C0447o0OoOOo.il1LilLllii.LOGCAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = iiI1L1iI     // Catch:{ NoSuchFieldError -> 0x0028 }
                top.tntok.autobot.o0OoOOo$il1LilLllii r1 = top.tntok.autobot.C0447o0OoOOo.il1LilLllii.ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0447o0OoOOo.iiI1L1iI.<clinit>():void");
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOOo$iiIliillii */
    public interface iiIliillii {
        void close();

        void iiI1L1iI(String str);
    }

    /* renamed from: top.tntok.autobot.o0OoOOo$il1LilLllii */
    public enum il1LilLllii {
        NONE,
        FILE,
        LOGCAT,
        ALL
    }

    /* renamed from: top.tntok.autobot.o0OoOOo$illlI1lLIL */
    public class illlI1lLIL implements iiIliillii {
        public static final String i1LIL11l = "UiAutomatorTrace";

        public illlI1lLIL() {
        }

        public /* synthetic */ illlI1lLIL(C0447o0OoOOo o0ooooo, iiI1L1iI iii1l1ii) {
            this();
        }

        public void close() {
        }

        public void iiI1L1iI(String str) {
        }
    }

    public static void IiiL1llIIi(Object... objArr) {
        il1LilLllii().i1LIL11l(objArr);
    }

    public static String iLLLILIiLi1Ii(Object obj) {
        if (!obj.getClass().isArray()) {
            return obj.toString();
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        return "[...]";
    }

    public static String iilLil1i11I1(String str, Object[] objArr) {
        if (objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iLLLILIiLi1Ii(objArr[0]));
        for (int i = 1; i < objArr.length; i++) {
            sb.append(str);
            sb.append(iLLLILIiLi1Ii(objArr[i]));
        }
        return sb.toString();
    }

    public static C0447o0OoOOo il1LilLllii() {
        if (IiIIlIL == null) {
            IiIIlIL = new C0447o0OoOOo();
        }
        return IiIIlIL;
    }

    public static String illlI1lLIL() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 7) {
            return il1LilLllii;
        }
        StackTraceElement stackTraceElement = stackTrace[5];
        StackTraceElement stackTraceElement2 = stackTrace[6];
        if (stackTraceElement2.getClassName().startsWith(iiIliillii)) {
            return null;
        }
        int lastIndexOf = stackTraceElement.getClassName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            lastIndexOf = 0;
        }
        int i = lastIndexOf + 1;
        if (i >= stackTraceElement.getClassName().length()) {
            return il1LilLllii;
        }
        return String.format("%s.%s from %s() at %s:%d", new Object[]{stackTraceElement.getClassName().substring(i), stackTraceElement.getMethodName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), Integer.valueOf(stackTraceElement2.getLineNumber())});
    }

    public final void I11lLL1(String str) {
        for (iiIliillii iiI1L1iI2 : this.i1LIL11l) {
            iiI1L1iI2.iiI1L1iI(str);
        }
    }

    public void IiIIlIL(String str) {
        this.illlI1lLIL = new File(str);
    }

    public final void i1LIL11l(Object[] objArr) {
        String illlI1lLIL2;
        if (this.iiI1L1iI != il1LilLllii.NONE && (illlI1lLIL2 = illlI1lLIL()) != null) {
            I11lLL1(String.format("%s (%s)", new Object[]{illlI1lLIL2, iilLil1i11I1(", ", objArr)}));
        }
    }

    public final void iiI1L1iI() {
        for (iiIliillii close : this.i1LIL11l) {
            close.close();
        }
        this.i1LIL11l.clear();
    }

    public boolean iiIliillii() {
        if (this.iiI1L1iI != il1LilLllii.NONE) {
            return true;
        }
        return false;
    }

    public void iilLiIIIi11i(il1LilLllii il1lillllii) {
        iiI1L1iI();
        this.iiI1L1iI = il1lillllii;
        try {
            int i = iiI1L1iI.iiI1L1iI[il1lillllii.ordinal()];
            if (i == 1) {
                File file = this.illlI1lLIL;
                if (file != null) {
                    this.i1LIL11l.add(new i1LIL11l(file));
                    return;
                }
                throw new IllegalArgumentException("Please provide a filename before attempting write trace to a file");
            } else if (i == 2) {
                this.i1LIL11l.add(new illlI1lLIL(this, (iiI1L1iI) null));
            } else if (i == 3) {
                this.i1LIL11l.add(new illlI1lLIL(this, (iiI1L1iI) null));
                File file2 = this.illlI1lLIL;
                if (file2 != null) {
                    this.i1LIL11l.add(new i1LIL11l(file2));
                    return;
                }
                throw new IllegalArgumentException("Please provide a filename before attempting write trace to a file");
            }
        } catch (FileNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open log file: ");
            sb.append(e.getMessage());
        }
    }
}
