package top.tntok.autobot;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OoOOoO  reason: case insensitive filesystem */
public final class C0449o0OoOOoO {
    public static final String[] i1LIL11l = {"org.junit.runner.", "org.junit.runners.", "org.junit.experimental.runners.", "org.junit.internal.", "junit.extensions", "junit.framework", "junit.runner", "junit.textui"};
    public static final Method iiI1L1iI = IiiL1llIIi();
    public static final String[] il1LilLllii = {"sun.reflect.", "java.lang.reflect.", "jdk.internal.reflect.", "org.junit.rules.RunRules.<init>(", "org.junit.rules.RunRules.applyAll(", "org.junit.runners.RuleContainer.apply(", "junit.framework.TestCase.runBare("};
    public static final String[] illlI1lLIL = {"org.junit.internal.StackTracesTest"};

    /* renamed from: top.tntok.autobot.o0OoOOoO$i1LIL11l */
    public enum i1LIL11l {
        PROCESSING_OTHER_CODE {
            public i1LIL11l iiI1L1iI(String str) {
                if (C0449o0OoOOoO.i1L1lLllLLlIi(str)) {
                    return i1LIL11l.PROCESSING_TEST_FRAMEWORK_CODE;
                }
                return this;
            }
        },
        PROCESSING_TEST_FRAMEWORK_CODE {
            public i1LIL11l iiI1L1iI(String str) {
                if (C0449o0OoOOoO.I1iIiIi(str)) {
                    return i1LIL11l.PROCESSING_REFLECTION_CODE;
                }
                if (C0449o0OoOOoO.i1L1lLllLLlIi(str)) {
                    return this;
                }
                return i1LIL11l.PROCESSING_OTHER_CODE;
            }
        },
        PROCESSING_REFLECTION_CODE {
            public i1LIL11l iiI1L1iI(String str) {
                if (C0449o0OoOOoO.I1iIiIi(str)) {
                    return this;
                }
                if (C0449o0OoOOoO.i1L1lLllLLlIi(str)) {
                    return i1LIL11l.PROCESSING_TEST_FRAMEWORK_CODE;
                }
                return i1LIL11l.DONE;
            }
        },
        DONE {
            public i1LIL11l iiI1L1iI(String str) {
                return this;
            }
        };

        public final i1LIL11l i1LIL11l(StackTraceElement stackTraceElement) {
            return iiI1L1iI(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "()");
        }

        public abstract i1LIL11l iiI1L1iI(String str);
    }

    /* renamed from: top.tntok.autobot.o0OoOOoO$iiI1L1iI */
    public class iiI1L1iI extends AbstractList<T> {
        public final /* synthetic */ List iiI1L1iI;

        public iiI1L1iI(List list) {
            this.iiI1L1iI = list;
        }

        public T get(int i) {
            List list = this.iiI1L1iI;
            return list.get((list.size() - i) - 1);
        }

        public int size() {
            return this.iiI1L1iI.size();
        }
    }

    public static String I11lLL1(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean I1iIiIi(String str) {
        return iILiI1lll(str, il1LilLllii);
    }

    public static List<String> IiIIlIL(Throwable th) {
        List asList = Arrays.asList(th.getStackTrace());
        int size = asList.size();
        i1LIL11l i1lil11l = i1LIL11l.PROCESSING_OTHER_CODE;
        for (StackTraceElement i1LIL11l2 : il1LilLllii(asList)) {
            i1lil11l = i1lil11l.i1LIL11l(i1LIL11l2);
            if (i1lil11l == i1LIL11l.DONE) {
                ArrayList arrayList = new ArrayList(size + 2);
                arrayList.add("");
                for (StackTraceElement stackTraceElement : asList.subList(0, size)) {
                    arrayList.add("\tat " + stackTraceElement);
                }
                if (th.getCause() != null) {
                    arrayList.add("\t... " + (asList.size() - arrayList.size()) + " trimmed");
                }
                return arrayList;
            }
            size--;
        }
        return Collections.emptyList();
    }

    public static Method IiiL1llIIi() {
        try {
            return Throwable.class.getMethod("getSuppressed", (Class[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean i1L1lLllLLlIi(String str) {
        if (!iILiI1lll(str, i1LIL11l) || iILiI1lll(str, illlI1lLIL)) {
            return false;
        }
        return true;
    }

    public static boolean iILiI1lll(String str, String[] strArr) {
        for (String startsWith : strArr) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static Exception iL1LIlIlI(Throwable th) throws Exception {
        IL1lILLLL1L(th);
        return null;
    }

    public static String iLLLILIiLi1Ii(Throwable th) {
        List<String> IiIIlIL = IiIIlIL(th);
        if (IiIIlIL.isEmpty()) {
            return iilLil1i11I1(th);
        }
        StringBuilder sb = new StringBuilder(th.toString());
        illlI1lLIL(IiIIlIL, sb);
        illlI1lLIL(iiIliillii(th), sb);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031 A[Catch:{ IOException -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> iiIliillii(java.lang.Throwable r4) {
        /*
            java.lang.Throwable r0 = r4.getCause()
            if (r0 != 0) goto L_0x000c
            boolean r0 = iilLiIIIi11i(r4)
            if (r0 == 0) goto L_0x0053
        L_0x000c:
            java.lang.String r0 = iilLil1i11I1(r4)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.StringReader r2 = new java.io.StringReader
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            java.lang.String r4 = r0.substring(r4)
            r2.<init>(r4)
            r1.<init>(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x002b:
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = "Caused by: "
            boolean r2 = r0.startsWith(r2)     // Catch:{ IOException -> 0x0053 }
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = r0.trim()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = "Suppressed: "
            boolean r2 = r2.startsWith(r3)     // Catch:{ IOException -> 0x0053 }
            if (r2 == 0) goto L_0x002b
        L_0x0045:
            r4.add(r0)     // Catch:{ IOException -> 0x0053 }
        L_0x0048:
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0053 }
            if (r0 == 0) goto L_0x0052
            r4.add(r0)     // Catch:{ IOException -> 0x0053 }
            goto L_0x0048
        L_0x0052:
            return r4
        L_0x0053:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0449o0OoOOoO.iiIliillii(java.lang.Throwable):java.util.List");
    }

    public static boolean iilLiIIIi11i(Throwable th) {
        Method method = iiI1L1iI;
        if (method == null) {
            return false;
        }
        try {
            if (((Throwable[]) method.invoke(th, (Object[]) null)).length != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String iilLil1i11I1(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static <T> List<T> il1LilLllii(List<T> list) {
        return new iiI1L1iI(list);
    }

    public static void illlI1lLIL(List<String> list, StringBuilder sb) {
        for (String str : list) {
            sb.append(String.format("%s%n", new Object[]{str}));
        }
    }

    public static <T extends Throwable> void IL1lILLLL1L(Throwable th) throws Throwable {
        throw th;
    }
}
