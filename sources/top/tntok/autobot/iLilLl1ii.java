package top.tntok.autobot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class iLilLl1ii implements C0131o00O0o0O {
    public final OutputStream i1LIL11l;
    public final File iiI1L1iI;

    public iLilLl1ii(File file) throws IOException {
        File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.iiI1L1iI = createTempFile;
        this.i1LIL11l = new FileOutputStream(createTempFile);
    }

    public OutputStream i1LIL11l() throws Exception {
        return this.i1LIL11l;
    }

    public String iiI1L1iI() {
        return this.iiI1L1iI.getAbsolutePath();
    }

    public void il1LilLllii() throws Exception {
        C0222o00oO00O.i1iiLIil1ILi(this.i1LIL11l);
        if (!this.iiI1L1iI.delete()) {
            throw new Exception("could not delete temporary file: " + this.iiI1L1iI.getAbsolutePath());
        }
    }
}
