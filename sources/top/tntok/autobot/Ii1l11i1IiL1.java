package top.tntok.autobot;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public final class Ii1l11i1IiL1 {
    public static String i1LIL11l(String... strArr) throws IOException, InterruptedException {
        String str;
        Process exec = Runtime.getRuntime().exec(strArr);
        Scanner scanner = new Scanner(exec.getInputStream());
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            str = null;
        }
        int waitFor = exec.waitFor();
        if (waitFor == 0) {
            return str;
        }
        throw new IOException(C0387o0OOoO0o.iiI1L1iI("AIn9/SoHidc=\n", "Q+aQkEtp7fc=\n") + Arrays.toString(strArr) + C0387o0OOoO0o.iiI1L1iI("UQV8ljW71XcVV26LNKGbZBAbbIdg\n", "cXcZ4kDJuxI=\n") + waitFor);
    }

    public static void iiI1L1iI(String... strArr) throws IOException, InterruptedException {
        int waitFor = Runtime.getRuntime().exec(strArr).waitFor();
        if (waitFor != 0) {
            throw new IOException(C0387o0OOoO0o.iiI1L1iI("KshSVV9pSPk=\n", "aac/OD4HLNk=\n") + Arrays.toString(strArr) + C0387o0OOoO0o.iiI1L1iI("isOfdbik+mTOkY1oub60d8vdj2Tt\n", "qrH6Ac3WlAE=\n") + waitFor);
        }
    }

    public static String illlI1lLIL(String... strArr) throws IOException, InterruptedException {
        Process exec = Runtime.getRuntime().exec(strArr);
        String illlI1lLIL = o00O000.illlI1lLIL(exec.getInputStream());
        int waitFor = exec.waitFor();
        if (waitFor == 0) {
            return illlI1lLIL;
        }
        throw new IOException(C0387o0OOoO0o.iiI1L1iI("I8YEygbNdfU=\n", "YKlpp2ejEdU=\n") + Arrays.toString(strArr) + C0387o0OOoO0o.iiI1L1iI("Yce7ilBe7xgllamXUUShCyDZq5sF\n", "QbXe/iUsgX0=\n") + waitFor);
    }
}
