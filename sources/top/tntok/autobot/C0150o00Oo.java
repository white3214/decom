package top.tntok.autobot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: top.tntok.autobot.o00Oo  reason: case insensitive filesystem */
public class C0150o00Oo extends Writer {
    public static final String il1LilLllii = ".lck";
    public final Writer i1LIL11l;
    public final File illlI1lLIL;

    public C0150o00Oo(String str) throws IOException {
        this(str, false, (String) null);
    }

    public void close() throws IOException {
        try {
            this.i1LIL11l.close();
        } finally {
            this.illlI1lLIL.delete();
        }
    }

    public void flush() throws IOException {
        this.i1LIL11l.flush();
    }

    public final Writer i1LIL11l(File file, Charset charset, boolean z) throws IOException {
        boolean exists = file.exists();
        try {
            return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), z), iIiiLi1LllI.illlI1lLIL(charset));
        } catch (IOException | RuntimeException e) {
            C0086o000OoO.IL1IiilLlLI(this.illlI1lLIL);
            if (!exists) {
                C0086o000OoO.IL1IiilLlLI(file);
            }
            throw e;
        }
    }

    public final void iiI1L1iI() throws IOException {
        synchronized (C0150o00Oo.class) {
            try {
                if (this.illlI1lLIL.createNewFile()) {
                    this.illlI1lLIL.deleteOnExit();
                } else {
                    throw new IOException("Can't write file, lock " + this.illlI1lLIL.getAbsolutePath() + " exists");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void il1LilLllii(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        } else if (!file.canWrite()) {
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
    }

    public void write(int i) throws IOException {
        this.i1LIL11l.write(i);
    }

    public C0150o00Oo(String str, boolean z) throws IOException {
        this(str, z, (String) null);
    }

    public void write(char[] cArr) throws IOException {
        this.i1LIL11l.write(cArr);
    }

    public C0150o00Oo(String str, boolean z, String str2) throws IOException {
        this(new File(str), z, str2);
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        this.i1LIL11l.write(cArr, i, i2);
    }

    public C0150o00Oo(File file) throws IOException {
        this(file, false, (String) null);
    }

    public void write(String str) throws IOException {
        this.i1LIL11l.write(str);
    }

    public C0150o00Oo(File file, boolean z) throws IOException {
        this(file, z, (String) null);
    }

    public void write(String str, int i, int i2) throws IOException {
        this.i1LIL11l.write(str, i, i2);
    }

    @Deprecated
    public C0150o00Oo(File file, boolean z, String str) throws IOException {
        this(file, Charset.defaultCharset(), z, str);
    }

    public C0150o00Oo(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    public C0150o00Oo(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    public C0150o00Oo(File file, Charset charset, boolean z, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            C0086o000OoO.i1iLlIill1I(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            C0086o000OoO.i1iLlIill1I(file2);
            il1LilLllii(file2);
            this.illlI1lLIL = new File(file2, absoluteFile.getName() + il1LilLllii);
            iiI1L1iI();
            this.i1LIL11l = i1LIL11l(absoluteFile, charset, z);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public C0150o00Oo(File file, String str, boolean z, String str2) throws IOException {
        this(file, iIiiLi1LllI.i1LIL11l(str), z, str2);
    }
}
