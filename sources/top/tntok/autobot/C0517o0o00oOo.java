package top.tntok.autobot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o0o00oOo  reason: case insensitive filesystem */
public class C0517o0o00oOo extends Writer {
    public static final int I11lLL1 = 8192;
    public static final Pattern iLLLILIiLi1Ii = C0514o0o00oO.Ii1liIIIiLi;
    public final OutputStream i1LIL11l;
    public Writer iiIliillii;
    public String iilLil1i11I1;
    public StringWriter il1LilLllii;
    public final String illlI1lLIL;

    public C0517o0o00oOo(OutputStream outputStream) {
        this(outputStream, (String) null);
    }

    public void close() throws IOException {
        if (this.iiIliillii == null) {
            this.iilLil1i11I1 = this.illlI1lLIL;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.i1LIL11l, this.iilLil1i11I1);
            this.iiIliillii = outputStreamWriter;
            outputStreamWriter.write(this.il1LilLllii.toString());
        }
        this.iiIliillii.close();
    }

    public void flush() throws IOException {
        Writer writer = this.iiIliillii;
        if (writer != null) {
            writer.flush();
        }
    }

    public String i1LIL11l() {
        return this.illlI1lLIL;
    }

    public final void iiI1L1iI(char[] cArr, int i, int i2) throws IOException {
        int i3;
        StringBuffer buffer = this.il1LilLllii.getBuffer();
        if (buffer.length() + i2 > 8192) {
            i3 = 8192 - buffer.length();
        } else {
            i3 = i2;
        }
        this.il1LilLllii.write(cArr, i, i3);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int indexOf = buffer.indexOf("?>");
                if (indexOf > 0) {
                    Matcher matcher = iLLLILIiLi1Ii.matcher(buffer.substring(0, indexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase(Locale.ROOT);
                        this.iilLil1i11I1 = upperCase;
                        this.iilLil1i11I1 = upperCase.substring(1, upperCase.length() - 1);
                    } else {
                        this.iilLil1i11I1 = this.illlI1lLIL;
                    }
                } else if (buffer.length() >= 8192) {
                    this.iilLil1i11I1 = this.illlI1lLIL;
                }
            } else {
                this.iilLil1i11I1 = this.illlI1lLIL;
            }
            if (this.iilLil1i11I1 != null) {
                this.il1LilLllii = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.i1LIL11l, this.iilLil1i11I1);
                this.iiIliillii = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i2 > i3) {
                    this.iiIliillii.write(cArr, i + i3, i2 - i3);
                }
            }
        }
    }

    public String il1LilLllii() {
        return this.iilLil1i11I1;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.il1LilLllii != null) {
            iiI1L1iI(cArr, i, i2);
        } else {
            this.iiIliillii.write(cArr, i, i2);
        }
    }

    public C0517o0o00oOo(OutputStream outputStream, String str) {
        this.il1LilLllii = new StringWriter(8192);
        this.i1LIL11l = outputStream;
        this.illlI1lLIL = str == null ? C0514o0o00oO.iilLil1i11I1 : str;
    }

    public C0517o0o00oOo(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    public C0517o0o00oOo(File file, String str) throws FileNotFoundException {
        this((OutputStream) new FileOutputStream(file), str);
    }
}
