package top.tntok.autobot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;

public abstract class il11iII1 implements C0423o0Oo0o0o {
    public static final String i1LIL11l = "suite";
    public static boolean iiIliillii = true;
    public static int il1LilLllii = I1iIiIi("maxmessage", 500);
    public static Properties illlI1lLIL;
    public boolean iiI1L1iI = true;

    public static int I1iIiIi(String str, int i) {
        String i1L1lLllLLlIi = i1L1lLllLLlIi(str);
        if (i1L1lLllLLlIi == null) {
            return i;
        }
        try {
            return Integer.parseInt(i1L1lLllLLlIi);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[SYNTHETIC, Splitter:B:17:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void I1l1iIll1lIi1() {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0030, SecurityException -> 0x002e, all -> 0x0029 }
            java.io.File r2 = iL1LIlIlI()     // Catch:{ IOException -> 0x0030, SecurityException -> 0x002e, all -> 0x0029 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0030, SecurityException -> 0x002e, all -> 0x0029 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            java.util.Properties r2 = IL1lILLLL1L()     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            iiiiI1iILL11I(r0)     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            java.util.Properties r0 = IL1lILLLL1L()     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            r0.load(r1)     // Catch:{ IOException -> 0x0026, SecurityException -> 0x0023, all -> 0x0021 }
            r1.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0041
        L_0x0021:
            r0 = move-exception
            goto L_0x0032
        L_0x0023:
            r0 = r1
            goto L_0x0038
        L_0x0026:
            r0 = r1
            goto L_0x003e
        L_0x0029:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0032
        L_0x002e:
            goto L_0x0038
        L_0x0030:
            goto L_0x003e
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r0
        L_0x0038:
            if (r0 == 0) goto L_0x0041
        L_0x003a:
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0041
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x003a
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.il11iII1.I1l1iIll1lIi1():void");
    }

    public static String IL111l1(String str) {
        if (il1LilLllii == -1 || str.length() <= il1LilLllii) {
            return str;
        }
        return str.substring(0, il1LilLllii) + "...";
    }

    public static Properties IL1lILLLL1L() {
        if (illlI1lLIL == null) {
            Properties properties = new Properties();
            illlI1lLIL = properties;
            properties.put("loading", "true");
            illlI1lLIL.put("filterstack", "true");
            I1l1iIll1lIi1();
        }
        return illlI1lLIL;
    }

    public static void ILl1iII11Ll1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(iL1LIlIlI());
        try {
            IL1lILLLL1L().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    public static String IiiL1llIIi(String str) {
        if (IliiLiLliIl()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return stringWriter.toString();
                }
                if (!iilLiIIIi11i(readLine)) {
                    printWriter.println(readLine);
                }
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public static boolean IliiLiLliIl() {
        if (!i1L1lLllLLlIi("filterstack").equals("true") || !iiIliillii) {
            return true;
        }
        return false;
    }

    public static void i11liIIl11Ii1(String str, String str2) {
        IL1lILLLL1L().put(str, str2);
    }

    public static String i1L1lLllLLlIi(String str) {
        return IL1lILLLL1L().getProperty(str);
    }

    public static String iILiI1lll(Throwable th) {
        return IiiL1llIIi(C0449o0OoOOoO.I11lLL1(th));
    }

    public static File iL1LIlIlI() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    public static void iiiiI1iILL11I(Properties properties) {
        illlI1lLIL = properties;
    }

    public static boolean iilLiIIIi11i(String str) {
        String[] strArr = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (int i = 0; i < 8; i++) {
            if (str.indexOf(strArr[i]) > 0) {
                return true;
            }
        }
        return false;
    }

    public abstract void I1I11Il1(String str);

    public abstract void IIlL1llI1(String str);

    public Class<?> Ii1liIIIiLi(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public String IiIIlIL(String str) {
        if (str.startsWith("Default package for")) {
            return str.substring(str.lastIndexOf(".") + 1);
        }
        return str;
    }

    public String IilL11ii1I1Il(String[] strArr) {
        String str = null;
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i].equals("-noloading")) {
                i1iiLIil1ILi(false);
            } else if (strArr[i].equals("-nofilterstack")) {
                iiIliillii = false;
            } else if (strArr[i].equals("-c")) {
                i++;
                if (strArr.length > i) {
                    str = IiIIlIL(strArr[i]);
                } else {
                    System.out.println("Missing Test class name");
                }
            } else {
                str = strArr[i];
            }
            i++;
        }
        return str;
    }

    public C0532o0oOo0o0 i111iLiiIIill(String str) {
        if (str.length() <= 0) {
            I11lLL1();
            return null;
        }
        try {
            Class<?> Ii1liIIIiLi = Ii1liIIIiLi(str);
            try {
                Method method = Ii1liIIIiLi.getMethod(i1LIL11l, (Class[]) null);
                if (!Modifier.isStatic(method.getModifiers())) {
                    iiLIIiIli("Suite() method must be static");
                    return null;
                }
                try {
                    C0532o0oOo0o0 o0ooo0o0 = (C0532o0oOo0o0) method.invoke((Object) null, (Object[]) null);
                    if (o0ooo0o0 == null) {
                        return o0ooo0o0;
                    }
                    I11lLL1();
                    return o0ooo0o0;
                } catch (InvocationTargetException e) {
                    iiLIIiIli("Failed to invoke suite():" + e.getTargetException().toString());
                    return null;
                } catch (IllegalAccessException e2) {
                    iiLIIiIli("Failed to invoke suite():" + e2.toString());
                    return null;
                }
            } catch (Exception unused) {
                I11lLL1();
                return new C0432o0OoO000(Ii1liIIIiLi);
            }
        } catch (ClassNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null) {
                str = message;
            }
            iiLIIiIli("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e4) {
            iiLIIiIli("Error: " + e4.toString());
            return null;
        }
    }

    public synchronized void i1LIL11l(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
        i1iI1iiLL1(1, o0ooo0o0, th);
    }

    public abstract void i1iI1iiLL1(int i, C0532o0oOo0o0 o0ooo0o0, Throwable th);

    public void i1iiLIil1ILi(boolean z) {
        this.iiI1L1iI = z;
    }

    public String iLLLILIiLi1Ii(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    public synchronized void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, IillLillLLIii iillLillLLIii) {
        i1iI1iiLL1(2, o0ooo0o0, iillLillLLIii);
    }

    public synchronized void iiIliillii(C0532o0oOo0o0 o0ooo0o0) {
        IIlL1llI1(o0ooo0o0.toString());
    }

    public abstract void iiLIIiIli(String str);

    public synchronized void iilLil1i11I1(C0532o0oOo0o0 o0ooo0o0) {
        I1I11Il1(o0ooo0o0.toString());
    }

    public boolean il1l1IlL() {
        if (!i1L1lLllLLlIi("loading").equals("true") || !this.iiI1L1iI) {
            return false;
        }
        return true;
    }

    public void I11lLL1() {
    }
}
