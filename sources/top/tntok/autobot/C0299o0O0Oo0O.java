package top.tntok.autobot;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: top.tntok.autobot.o0O0Oo0O  reason: case insensitive filesystem */
public class C0299o0O0Oo0O {
    public Properties i1LIL11l = new Properties();
    public String iiI1L1iI;

    public C0299o0O0Oo0O(String str) {
        this.iiI1L1iI = str;
        i1LIL11l();
    }

    public final void i1LIL11l() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(this.iiI1L1iI);
            this.i1LIL11l.load(fileInputStream);
            fileInputStream.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public String iiI1L1iI(String str) {
        return this.i1LIL11l.getProperty(str);
    }

    public void iiIliillii(String str, String str2) {
        this.i1LIL11l.setProperty(str, str2);
    }

    public void il1LilLllii() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(this.iiI1L1iI);
            this.i1LIL11l.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void illlI1lLIL(String[] strArr) {
    }
}
