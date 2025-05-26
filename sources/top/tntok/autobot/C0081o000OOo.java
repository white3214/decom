package top.tntok.autobot;

import java.io.File;
import java.io.IOException;

/* renamed from: top.tntok.autobot.o000OOo  reason: case insensitive filesystem */
public class C0081o000OOo {
    public static final C0081o000OOo i1LIL11l = new C0081o000OOo("Normal");
    public static final C0081o000OOo illlI1lLIL = new iiI1L1iI();
    public final String iiI1L1iI;

    /* renamed from: top.tntok.autobot.o000OOo$iiI1L1iI */
    public static class iiI1L1iI extends C0081o000OOo {
        public iiI1L1iI() {
            super("Force");
        }

        public boolean illlI1lLIL(File file) throws IOException {
            C0086o000OoO.illiiliIILI(file);
            return true;
        }
    }

    public C0081o000OOo(String str) {
        this.iiI1L1iI = str;
    }

    public boolean i1LIL11l(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        try {
            return illlI1lLIL(file);
        } catch (IOException unused) {
            return false;
        }
    }

    public void iiI1L1iI(File file) throws IOException {
        if (file.exists() && !illlI1lLIL(file)) {
            throw new IOException("Deletion failed: " + file);
        }
    }

    public boolean illlI1lLIL(File file) throws IOException {
        return file.delete();
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.iiI1L1iI + "]";
    }
}
