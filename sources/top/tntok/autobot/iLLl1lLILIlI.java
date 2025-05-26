package top.tntok.autobot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

@Deprecated
public class iLLl1lLILIlI {
    public static final int iiI1L1iI = 4096;

    @Deprecated
    public static void I11lLL1(String str, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        i1LIL11l(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void IiIIlIL(String str, Writer writer) throws IOException {
        writer.write(str);
    }

    @Deprecated
    public static void IiiL1llIIi(byte[] bArr, Writer writer) throws IOException {
        illlI1lLIL(new ByteArrayInputStream(bArr), writer);
    }

    public static int i1LIL11l(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        int i = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return i;
            }
            writer.write(cArr, 0, read);
            i += read;
        }
    }

    public static void iILiI1lll(byte[] bArr, Writer writer, String str) throws IOException {
        il1LilLllii(new ByteArrayInputStream(bArr), writer, str);
    }

    public static void iLLLILIiLi1Ii(String str, OutputStream outputStream, String str2) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        i1LIL11l(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static int iiI1L1iI(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return i;
            }
            outputStream.write(bArr, 0, read);
            i += read;
        }
    }

    @Deprecated
    public static void iiIliillii(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        i1LIL11l(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void iilLiIIIi11i(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }

    public static void iilLil1i11I1(Reader reader, OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        i1LIL11l(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void il1LilLllii(InputStream inputStream, Writer writer, String str) throws IOException {
        i1LIL11l(new InputStreamReader(inputStream, str), writer);
    }

    @Deprecated
    public static void illlI1lLIL(InputStream inputStream, Writer writer) throws IOException {
        i1LIL11l(new InputStreamReader(inputStream, Charset.defaultCharset()), writer);
    }
}
