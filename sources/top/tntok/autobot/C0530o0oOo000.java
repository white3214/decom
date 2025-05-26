package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

/* renamed from: top.tntok.autobot.o0oOo000  reason: case insensitive filesystem */
public class C0530o0oOo000 extends C0052OoooooO {
    public static final String iiIliillii = "junit";
    public static final int il1LilLllii = 10000;
    public final boolean i1LIL11l;
    public final File iiI1L1iI;
    public File illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0oOo000$iiI1L1iI */
    public static class iiI1L1iI {
        public boolean i1LIL11l;
        public File iiI1L1iI;

        public iiI1L1iI iiIliillii(File file) {
            this.iiI1L1iI = file;
            return this;
        }

        public C0530o0oOo000 il1LilLllii() {
            return new C0530o0oOo000(this);
        }

        public iiI1L1iI illlI1lLIL() {
            this.i1LIL11l = true;
            return this;
        }
    }

    public C0530o0oOo000() {
        this((File) null);
    }

    public static File I11lLL1(File file) throws IOException {
        try {
            return IiIIlIL(file);
        } catch (ClassNotFoundException unused) {
            return iLLLILIiLi1Ii(file);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                IOException iOException = new IOException("Failed to create temporary folder in " + file);
                iOException.initCause(cause);
                throw iOException;
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create temporary folder in " + file, e2);
        }
    }

    public static File IiIIlIL(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object obj;
        Class<?> cls = Class.forName("java.nio.file.Files");
        Object newInstance = Array.newInstance(Class.forName("java.nio.file.attribute.FileAttribute"), 0);
        Class<?> cls2 = Class.forName("java.nio.file.Path");
        Class<String> cls3 = String.class;
        if (file != null) {
            obj = cls.getDeclaredMethod("createTempDirectory", new Class[]{cls2, cls3, newInstance.getClass()}).invoke((Object) null, new Object[]{File.class.getDeclaredMethod("toPath", (Class[]) null).invoke(file, (Object[]) null), iiIliillii, newInstance});
        } else {
            obj = cls.getDeclaredMethod("createTempDirectory", new Class[]{cls3, newInstance.getClass()}).invoke((Object) null, new Object[]{iiIliillii, newInstance});
        }
        return (File) cls2.getDeclaredMethod("toFile", (Class[]) null).invoke(obj, (Object[]) null);
    }

    public static File iLLLILIiLi1Ii(File file) throws IOException {
        File file2 = null;
        int i = 0;
        while (i < 10000) {
            File createTempFile = File.createTempFile(iiIliillii, ".tmp", file);
            String file3 = createTempFile.toString();
            File file4 = new File(file3.substring(0, file3.length() - 4));
            if (file4.mkdir()) {
                createTempFile.delete();
                return file4;
            }
            createTempFile.delete();
            i++;
            file2 = file4;
        }
        throw new IOException("Unable to create temporary directory in: " + file.toString() + ". Tried " + il1LilLllii + " times. Last attempted to create: " + file2.toString());
    }

    public static iiI1L1iI iiIliillii() {
        return new iiI1L1iI();
    }

    public File I1iIiIi(String str) throws IOException {
        File file = new File(IiiL1llIIi(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File IL1lILLLL1L(String str) throws IOException {
        return iL1LIlIlI(str);
    }

    public final boolean Ii1liIIIiLi() {
        File file = this.illlI1lLIL;
        if (file == null) {
            return true;
        }
        return i111iLiiIIill(file);
    }

    public File IiiL1llIIi() {
        File file = this.illlI1lLIL;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public final boolean i111iLiiIIill(File file) {
        if (file.delete()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File i111iLiiIIill : listFiles) {
                if (!i111iLiiIIill(i111iLiiIIill)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public File i1L1lLllLLlIi() throws IOException {
        return I11lLL1(IiiL1llIIi());
    }

    public void i1LIL11l() {
        iilLiIIIi11i();
    }

    public File iILiI1lll() throws IOException {
        return File.createTempFile(iiIliillii, (String) null, IiiL1llIIi());
    }

    public File iL1LIlIlI(String... strArr) throws IOException {
        if (strArr.length != 0) {
            File IiiL1llIIi = IiiL1llIIi();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                if (!new File(str).isAbsolute()) {
                    i2++;
                } else {
                    throw new IOException("folder path '" + str + "' is not a relative path");
                }
            }
            int length2 = strArr.length;
            boolean z = true;
            File file = null;
            File file2 = IiiL1llIIi;
            while (i < length2) {
                File file3 = new File(file, strArr[i]);
                File file4 = new File(IiiL1llIIi, file3.getPath());
                boolean mkdirs = file4.mkdirs();
                if (mkdirs || file4.isDirectory()) {
                    i++;
                    File file5 = file3;
                    file2 = file4;
                    z = mkdirs;
                    file = file5;
                } else if (file4.exists()) {
                    throw new IOException("a file with the path '" + file3.getPath() + "' exists");
                } else {
                    throw new IOException("could not create a folder with the path '" + file3.getPath() + "'");
                }
            }
            if (z) {
                return file2;
            }
            throw new IOException("a folder with the path '" + file.getPath() + "' already exists");
        }
        throw new IllegalArgumentException("must pass at least one path");
    }

    public void iilLiIIIi11i() {
        if (!Ii1liIIIiLi() && this.i1LIL11l) {
            Il1llillili.ILiliIiI("Unable to clean up temporary folder " + this.illlI1lLIL);
        }
    }

    public void iilLil1i11I1() throws IOException {
        this.illlI1lLIL = I11lLL1(this.iiI1L1iI);
    }

    public void illlI1lLIL() throws Throwable {
        iilLil1i11I1();
    }

    public C0530o0oOo000(File file) {
        this.iiI1L1iI = file;
        this.i1LIL11l = false;
    }

    public C0530o0oOo000(iiI1L1iI iii1l1ii) {
        this.iiI1L1iI = iii1l1ii.iiI1L1iI;
        this.i1LIL11l = iii1l1ii.i1LIL11l;
    }
}
