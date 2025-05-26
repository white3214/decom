package top.tntok.autobot;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: top.tntok.autobot.o0oOO  reason: case insensitive filesystem */
public final class C0525o0oOO {
    public static final String i1LIL11l = C0387o0OOoO0o.iiI1L1iI("PArGLqZ3CPtH\n", "Z3mjXNASeqY=\n");
    public static final String iiI1L1iI = C0387o0OOoO0o.iiI1L1iI("ZZvVKb9k\n", "FvinSs8dZfs=\n");
    public static iiI1L1iI iiIliillii = iiI1L1iI.il1LilLllii;
    public static final PrintStream il1LilLllii = new PrintStream(new FileOutputStream(FileDescriptor.err));
    public static final PrintStream illlI1lLIL = new PrintStream(new FileOutputStream(FileDescriptor.out));

    /* renamed from: top.tntok.autobot.o0oOO$i1LIL11l */
    public static class i1LIL11l extends OutputStream {
        public void write(byte[] bArr) {
        }

        public void write(byte[] bArr, int i, int i2) {
        }

        public void write(int i) {
        }
    }

    /* renamed from: top.tntok.autobot.o0oOO$iiI1L1iI */
    public enum iiI1L1iI {
        i1LIL11l,
        illlI1lLIL,
        il1LilLllii,
        iiIliillii,
        iilLil1i11I1
    }

    public static boolean I11lLL1(iiI1L1iI iii1l1ii) {
        if (iii1l1ii.ordinal() >= iiIliillii.ordinal()) {
            return true;
        }
        return false;
    }

    public static void IiIIlIL(String str) {
        iilLiIIIi11i(str, (Throwable) null);
    }

    public static void i1LIL11l() {
        PrintStream printStream = new PrintStream(new i1LIL11l());
        System.setOut(printStream);
        System.setErr(printStream);
    }

    public static void iLLLILIiLi1Ii(String str) {
        if (I11lLL1(iiI1L1iI.i1LIL11l)) {
            PrintStream printStream = illlI1lLIL;
            printStream.print(C0387o0OOoO0o.iiI1L1iI("NTmVJp2nhMpOHLUGqY2l0lRq\n", "bkrwVOvC9pc=\n") + str + 10);
        }
    }

    public static void iiI1L1iI(String str) {
        if (I11lLL1(iiI1L1iI.illlI1lLIL)) {
            PrintStream printStream = illlI1lLIL;
            printStream.print(C0387o0OOoO0o.iiI1L1iI("gOpPNbSDELz73W8Fl6FYwQ==\n", "25kqR8LmYuE=\n") + str + 10);
        }
    }

    public static void iiIliillii(String str) {
        if (I11lLL1(iiI1L1iI.il1LilLllii)) {
            PrintStream printStream = illlI1lLIL;
            printStream.print(C0387o0OOoO0o.iiI1L1iI("qtCzsdU6WnDR6piF7GUI\n", "8aPWw6NfKC0=\n") + str + 10);
        }
    }

    public static void iilLiIIIi11i(String str, Throwable th) {
        if (I11lLL1(iiI1L1iI.iiIliillii)) {
            PrintStream printStream = il1LilLllii;
            printStream.print(C0387o0OOoO0o.iiI1L1iI("p62MjQpGWYrciaitMhkL\n", "/N7p/3wjK9c=\n") + str + 10);
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    public static void iilLil1i11I1(iiI1L1iI iii1l1ii) {
        iiIliillii = iii1l1ii;
    }

    public static void il1LilLllii(String str, Throwable th) {
        if (I11lLL1(iiI1L1iI.iilLil1i11I1)) {
            PrintStream printStream = il1LilLllii;
            printStream.print(C0387o0OOoO0o.iiI1L1iI("plT1hkQqGKfdYsKmfR1Q2g==\n", "/SeQ9DJPavo=\n") + str + 10);
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    public static void illlI1lLIL(String str) {
        il1LilLllii(str, (Throwable) null);
    }
}
