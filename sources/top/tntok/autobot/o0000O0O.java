package top.tntok.autobot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface o0000O0O {
    public static final o0000O0O iiI1L1iI = new iiI1L1iI();

    public class iiI1L1iI implements o0000O0O {
        public void I11lLL1(File file, File file2) throws IOException {
            iiI1L1iI(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        public C0370o0OOOooO i1LIL11l(File file) throws FileNotFoundException {
            return C0249o00oo00O.IiiL1llIIi(file);
        }

        public void iLLLILIiLi1Ii(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        iLLLILIiLi1Ii(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        public void iiI1L1iI(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        public boolean iiIliillii(File file) {
            return file.exists();
        }

        public long iilLil1i11I1(File file) {
            return file.length();
        }

        public C0361o0OOOo0 il1LilLllii(File file) throws FileNotFoundException {
            try {
                return C0249o00oo00O.iiI1L1iI(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0249o00oo00O.iiI1L1iI(file);
            }
        }

        public C0361o0OOOo0 illlI1lLIL(File file) throws FileNotFoundException {
            try {
                return C0249o00oo00O.iilLil1i11I1(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0249o00oo00O.iilLil1i11I1(file);
            }
        }
    }

    void I11lLL1(File file, File file2) throws IOException;

    C0370o0OOOooO i1LIL11l(File file) throws FileNotFoundException;

    void iLLLILIiLi1Ii(File file) throws IOException;

    void iiI1L1iI(File file) throws IOException;

    boolean iiIliillii(File file);

    long iilLil1i11I1(File file);

    C0361o0OOOo0 il1LilLllii(File file) throws FileNotFoundException;

    C0361o0OOOo0 illlI1lLIL(File file) throws FileNotFoundException;
}
