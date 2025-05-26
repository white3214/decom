package top.tntok.autobot;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import top.tntok.autobot.C0102o000o0o0;

/* renamed from: top.tntok.autobot.o0O0oooo  reason: case insensitive filesystem */
public class C0338o0O0oooo implements Closeable {
    public final Map<String, String> I11lLL1 = new HashMap();
    public boolean IiIIlIL;
    public List<String> IiiL1llIIi;
    public C0231o00oOOo i1LIL11l;
    public i1LIL11l iILiI1lll = i1LIL11l.DEFAULT;
    public C0288o0O00o0 iLLLILIiLi1Ii;
    public long iiIliillii;
    public boolean iilLiIIIi11i;
    public final Map<String, String> iilLil1i11I1 = new iiI1L1iI();
    public InputStream il1LilLllii;
    public String illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0O0oooo$i1LIL11l */
    public enum i1LIL11l {
        DEFAULT,
        ALWAYS,
        NEVER
    }

    /* renamed from: top.tntok.autobot.o0O0oooo$iiI1L1iI */
    public class iiI1L1iI extends HashMap<String, String> {
        public iiI1L1iI() {
        }

        /* renamed from: illlI1lLIL */
        public String put(String str, String str2) {
            String str3;
            Map iiI1L1iI = C0338o0O0oooo.this.I11lLL1;
            if (str == null) {
                str3 = str;
            } else {
                str3 = str.toLowerCase();
            }
            iiI1L1iI.put(str3, str2);
            return (String) super.put(str, str2);
        }
    }

    public C0338o0O0oooo(C0231o00oOOo o00oooo, String str, InputStream inputStream, long j) {
        this.i1LIL11l = o00oooo;
        this.illlI1lLIL = str;
        boolean z = false;
        if (inputStream == null) {
            this.il1LilLllii = new ByteArrayInputStream(new byte[0]);
            this.iiIliillii = 0;
        } else {
            this.il1LilLllii = inputStream;
            this.iiIliillii = j;
        }
        this.IiIIlIL = this.iiIliillii < 0 ? true : z;
        this.iilLiIIIi11i = true;
        this.IiiL1llIIi = new ArrayList(10);
    }

    public static C0338o0O0oooo I1IILIil1lLlL(C0231o00oOOo o00oooo, String str, String str2) {
        byte[] bArr;
        iLLiiii11 illiiii11 = new iLLiiii11(str);
        if (str2 == null) {
            return iIiL11iL(o00oooo, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        try {
            if (!Charset.forName(illiiii11.iiIliillii()).newEncoder().canEncode(str2)) {
                illiiii11 = illiiii11.I11lLL1();
            }
            bArr = str2.getBytes(illiiii11.iiIliillii());
        } catch (UnsupportedEncodingException e) {
            C0222o00oO00O.I1l1iIll1lIi1.log(Level.SEVERE, "encoding problem, responding nothing", e);
            bArr = new byte[0];
        }
        return iIiL11iL(o00oooo, illiiii11.illlI1lLIL(), new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public static C0338o0O0oooo IL11lll11(C0231o00oOOo o00oooo, String str, InputStream inputStream) {
        return new C0338o0O0oooo(o00oooo, str, inputStream, -1);
    }

    public static C0338o0O0oooo iILlLIlli(String str) {
        return I1IILIil1lLlL(C0376o0OOo0O0.OK, C0222o00oO00O.Ii1liIIIiLi, str);
    }

    public static C0338o0O0oooo iIiL11iL(C0231o00oOOo o00oooo, String str, InputStream inputStream, long j) {
        return new C0338o0O0oooo(o00oooo, str, inputStream, j);
    }

    public static C0338o0O0oooo ilLIlLiIILl1(C0231o00oOOo o00oooo, String str, byte[] bArr) {
        return iIiL11iL(o00oooo, str, new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public void I11iLiiIi(boolean z) {
        this.iilLiIIIi11i = z;
    }

    public void I1ILilil1I(C0288o0O00o0 o0o00o0) {
        this.iLLLILIiLi1Ii = o0o00o0;
    }

    public InputStream I1LiILiLLIl1l() {
        return this.il1LilLllii;
    }

    public C0231o00oOOo I1lLLLlliILlI() {
        return this.i1LIL11l;
    }

    public void I1llIillii1(boolean z) {
        this.IiIIlIL = z;
    }

    public final void II1l1IliI1Li1(OutputStream outputStream, long j) throws IOException {
        boolean z;
        long j2;
        byte[] bArr = new byte[((int) C0102o000o0o0.iiI1L1iI.I11lLL1)];
        if (j == -1) {
            z = true;
        } else {
            z = false;
        }
        while (true) {
            if (j > 0 || z) {
                if (z) {
                    j2 = 16384;
                } else {
                    j2 = Math.min(j, C0102o000o0o0.iiI1L1iI.I11lLL1);
                }
                int read = this.il1LilLllii.read(bArr, 0, (int) j2);
                if (read > 0) {
                    try {
                        outputStream.write(bArr, 0, read);
                    } catch (Exception unused) {
                        if (this.il1LilLllii != null) {
                            this.il1LilLllii.close();
                        }
                    }
                    if (!z) {
                        j -= (long) read;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public String IIL1Ll1I111() {
        return this.illlI1lLIL;
    }

    public long IIlLLll1ll1(PrintWriter printWriter, long j) {
        String ilLIlL1ILi = ilLIlL1ILi("content-length");
        if (ilLIlL1ILi != null) {
            try {
                return Long.parseLong(ilLIlL1ILi);
            } catch (NumberFormatException unused) {
                Logger logger = C0222o00oO00O.I1l1iIll1lIi1;
                logger.severe("content-length was no number " + ilLIlL1ILi);
                return j;
            }
        } else {
            printWriter.print("Content-Length: " + j + C0130o00O0o00.IiIIlIL);
            return j;
        }
    }

    public void ILIiLLLL1iiii(PrintWriter printWriter, String str, String str2) {
        printWriter.append(str).append(": ").append(str2).append(C0130o00O0o00.IiIIlIL);
    }

    public List<String> IiIl11II() {
        return this.IiiL1llIIi;
    }

    public void IiL1llLiil1(C0231o00oOOo o00oooo) {
        this.i1LIL11l = o00oooo;
    }

    public void close() throws IOException {
        InputStream inputStream = this.il1LilLllii;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public void i111iLiiIIill(boolean z) {
        if (z) {
            this.iilLil1i11I1.put("connection", "close");
        } else {
            this.iilLil1i11I1.remove("connection");
        }
    }

    public final void i11iLLllliI(OutputStream outputStream, long j) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if (i1IL1lILl1L1I()) {
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Exception unused) {
                InputStream inputStream = this.il1LilLllii;
                if (inputStream != null) {
                    inputStream.close();
                }
                gZIPOutputStream = null;
            }
            if (gZIPOutputStream != null) {
                II1l1IliI1Li1(gZIPOutputStream, -1);
                gZIPOutputStream.finish();
                return;
            }
            return;
        }
        II1l1IliI1Li1(outputStream, j);
    }

    public boolean i1IL1lILl1L1I() {
        i1LIL11l i1lil11l = this.iILiI1lll;
        if (i1lil11l == i1LIL11l.DEFAULT) {
            if (IIL1Ll1I111() == null) {
                return false;
            }
            if (IIL1Ll1I111().toLowerCase().contains("text/") || IIL1Ll1I111().toLowerCase().contains("/json")) {
                return true;
            }
            return false;
        } else if (i1lil11l == i1LIL11l.ALWAYS) {
            return true;
        } else {
            return false;
        }
    }

    public void i1L1llI1LlL1l(OutputStream outputStream) {
        long j;
        String str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.i1LIL11l != null) {
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, new iLLiiii11(this.illlI1lLIL).iiIliillii())), false);
                printWriter.append("HTTP/1.1 ").append(this.i1LIL11l.iiI1L1iI()).append(" \r\n");
                String str2 = this.illlI1lLIL;
                if (str2 != null) {
                    ILIiLLLL1iiii(printWriter, "Content-Type", str2);
                }
                if (ilLIlL1ILi("date") == null) {
                    ILIiLLLL1iiii(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry next : this.iilLil1i11I1.entrySet()) {
                    ILIiLLLL1iiii(printWriter, (String) next.getKey(), (String) next.getValue());
                }
                for (String ILIiLLLL1iiii : this.IiiL1llIIi) {
                    ILIiLLLL1iiii(printWriter, "Set-Cookie", ILIiLLLL1iiii);
                }
                if (ilLIlL1ILi("connection") == null) {
                    if (this.iilLiIIIi11i) {
                        str = C0099o000o0OO.iilLiIIIi11i;
                    } else {
                        str = "close";
                    }
                    ILIiLLLL1iiii(printWriter, "Connection", str);
                }
                if (ilLIlL1ILi("content-length") != null) {
                    iL1lL1LL(false);
                }
                if (i1IL1lILl1L1I()) {
                    ILIiLLLL1iiii(printWriter, "Content-Encoding", "gzip");
                    I1llIillii1(true);
                }
                if (this.il1LilLllii != null) {
                    j = this.iiIliillii;
                } else {
                    j = 0;
                }
                if (this.iLLLILIiLi1Ii != C0288o0O00o0.HEAD && this.IiIIlIL) {
                    ILIiLLLL1iiii(printWriter, "Transfer-Encoding", "chunked");
                } else if (!i1IL1lILl1L1I()) {
                    j = IIlLLll1ll1(printWriter, j);
                }
                printWriter.append(C0130o00O0o00.IiIIlIL);
                printWriter.flush();
                ilLilIL(outputStream, j);
                outputStream.flush();
                C0222o00oO00O.i1iiLIil1ILi(this.il1LilLllii);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e) {
            C0222o00oO00O.I1l1iIll1lIi1.log(Level.SEVERE, "Could not send response to the client", e);
        }
    }

    public void i1LIL11l(String str) {
        this.IiiL1llIIi.add(str);
    }

    public void i1LlL1iILLLil(String str) {
        this.illlI1lLIL = str;
    }

    public C0338o0O0oooo iL1lL1LL(boolean z) {
        i1LIL11l i1lil11l;
        if (z) {
            i1lil11l = i1LIL11l.ALWAYS;
        } else {
            i1lil11l = i1LIL11l.NEVER;
        }
        this.iILiI1lll = i1lil11l;
        return this;
    }

    public void iLlI1iL1lIIL(InputStream inputStream) {
        this.il1LilLllii = inputStream;
    }

    public boolean iiLl11ILL() {
        return "close".equals(ilLIlL1ILi("connection"));
    }

    public void il1LilLllii(String str, String str2) {
        this.iilLil1i11I1.put(str, str2);
    }

    public C0288o0O00o0 ilIILlI1l11i() {
        return this.iLLLILIiLi1Ii;
    }

    public String ilLIlL1ILi(String str) {
        return this.I11lLL1.get(str.toLowerCase());
    }

    public final void ilLilIL(OutputStream outputStream, long j) throws IOException {
        if (this.iLLLILIiLi1Ii == C0288o0O00o0.HEAD || !this.IiIIlIL) {
            i11iLLllliI(outputStream, j);
            return;
        }
        iIiIl1llILlI iiiil1llilli = new iIiIl1llILlI(outputStream);
        i11iLLllliI(iiiil1llilli, -1);
        try {
            iiiil1llilli.iiI1L1iI();
        } catch (Exception unused) {
            if (this.il1LilLllii != null) {
                this.il1LilLllii.close();
            }
        }
    }
}
