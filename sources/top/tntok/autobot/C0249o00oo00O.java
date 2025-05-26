package top.tntok.autobot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: top.tntok.autobot.o00oo00O  reason: case insensitive filesystem */
public final class C0249o00oo00O {
    public static final Logger iiI1L1iI = Logger.getLogger(C0249o00oo00O.class.getName());

    /* renamed from: top.tntok.autobot.o00oo00O$i1LIL11l */
    public class i1LIL11l implements C0370o0OOOooO {
        public final /* synthetic */ C0446o0OoOOOo i1LIL11l;
        public final /* synthetic */ InputStream illlI1lLIL;

        public i1LIL11l(C0446o0OoOOOo o0oooooo, InputStream inputStream) {
            this.i1LIL11l = o0oooooo;
            this.illlI1lLIL = inputStream;
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0;
            } else {
                try {
                    this.i1LIL11l.iLLLILIiLi1Ii();
                    o0OOO00 iiIiili = iiILIlLLiIL.iiIiili(1);
                    int read = this.illlI1lLIL.read(iiIiili.iiI1L1iI, iiIiili.illlI1lLIL, (int) Math.min(j, (long) (8192 - iiIiili.illlI1lLIL)));
                    if (read == -1) {
                        return -1;
                    }
                    iiIiili.illlI1lLIL += read;
                    long j2 = (long) read;
                    iiILIlLLiIL.illlI1lLIL += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C0249o00oo00O.iiIliillii(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() throws IOException {
            this.illlI1lLIL.close();
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }

        public String toString() {
            return "source(" + this.illlI1lLIL + ")";
        }
    }

    /* renamed from: top.tntok.autobot.o00oo00O$iiI1L1iI */
    public class iiI1L1iI implements C0361o0OOOo0 {
        public final /* synthetic */ C0446o0OoOOOo i1LIL11l;
        public final /* synthetic */ OutputStream illlI1lLIL;

        public iiI1L1iI(C0446o0OoOOOo o0oooooo, OutputStream outputStream) {
            this.i1LIL11l = o0oooooo;
            this.illlI1lLIL = outputStream;
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, j);
            while (j > 0) {
                this.i1LIL11l.iLLLILIiLi1Ii();
                o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
                int min = (int) Math.min(j, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
                this.illlI1lLIL.write(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
                int i = o0ooo00.i1LIL11l + min;
                o0ooo00.i1LIL11l = i;
                long j2 = (long) min;
                j -= j2;
                iiILIlLLiIL.illlI1lLIL -= j2;
                if (i == o0ooo00.illlI1lLIL) {
                    iiILIlLLiIL.i1LIL11l = o0ooo00.i1LIL11l();
                    o0OOO00o.iiI1L1iI(o0ooo00);
                }
            }
        }

        public void close() throws IOException {
            this.illlI1lLIL.close();
        }

        public void flush() throws IOException {
            this.illlI1lLIL.flush();
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }

        public String toString() {
            return "sink(" + this.illlI1lLIL + ")";
        }
    }

    /* renamed from: top.tntok.autobot.o00oo00O$il1LilLllii */
    public class il1LilLllii extends iLIIl1IliLlLI {
        public final /* synthetic */ Socket iILiI1lll;

        public il1LilLllii(Socket socket) {
            this.iILiI1lll = socket;
        }

        public IOException Ii1liIIIiLi(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void i1iiLIil1ILi() {
            try {
                this.iILiI1lll.close();
            } catch (Exception e) {
                Logger logger = C0249o00oo00O.iiI1L1iI;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.iILiI1lll, e);
            } catch (AssertionError e2) {
                if (C0249o00oo00O.iiIliillii(e2)) {
                    Logger logger2 = C0249o00oo00O.iiI1L1iI;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.iILiI1lll, e2);
                    return;
                }
                throw e2;
            }
        }
    }

    public static C0361o0OOOo0 I11lLL1(OutputStream outputStream) {
        return iLLLILIiLi1Ii(outputStream, new C0446o0OoOOOo());
    }

    public static C0370o0OOOooO I1iIiIi(InputStream inputStream, C0446o0OoOOOo o0oooooo) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (o0oooooo != null) {
            return new i1LIL11l(o0oooooo, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    @IgnoreJRERequirement
    public static C0370o0OOOooO IL1lILLLL1L(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return iILiI1lll(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static C0361o0OOOo0 IiIIlIL(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            iLIIl1IliLlLI iL1LIlIlI = iL1LIlIlI(socket);
            return iL1LIlIlI.iiLIIiIli(iLLLILIiLi1Ii(socket.getOutputStream(), iL1LIlIlI));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static C0370o0OOOooO IiiL1llIIi(File file) throws FileNotFoundException {
        if (file != null) {
            return iILiI1lll(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static C0370o0OOOooO i1L1lLllLLlIi(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            iLIIl1IliLlLI iL1LIlIlI = iL1LIlIlI(socket);
            return iL1LIlIlI.ILl1iII11Ll1(I1iIiIi(socket.getInputStream(), iL1LIlIlI));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    public static C0361o0OOOo0 i1LIL11l() {
        return new illlI1lLIL();
    }

    public static C0370o0OOOooO iILiI1lll(InputStream inputStream) {
        return I1iIiIi(inputStream, new C0446o0OoOOOo());
    }

    public static iLIIl1IliLlLI iL1LIlIlI(Socket socket) {
        return new il1LilLllii(socket);
    }

    public static C0361o0OOOo0 iLLLILIiLi1Ii(OutputStream outputStream, C0446o0OoOOOo o0oooooo) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (o0oooooo != null) {
            return new iiI1L1iI(o0oooooo, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static C0361o0OOOo0 iiI1L1iI(File file) throws FileNotFoundException {
        if (file != null) {
            return I11lLL1(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static boolean iiIliillii(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    @IgnoreJRERequirement
    public static C0361o0OOOo0 iilLiIIIi11i(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return I11lLL1(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static C0361o0OOOo0 iilLil1i11I1(File file) throws FileNotFoundException {
        if (file != null) {
            return I11lLL1(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static ILL1iL1LiiI il1LilLllii(C0370o0OOOooO o0oooooo) {
        return new C0313o0O0o0o(o0oooooo);
    }

    public static Iiii1LiI11i illlI1lLIL(C0361o0OOOo0 o0oooo0) {
        return new C0314o0O0o0o0(o0oooo0);
    }

    /* renamed from: top.tntok.autobot.o00oo00O$illlI1lLIL */
    public class illlI1lLIL implements C0361o0OOOo0 {
        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            iiILIlLLiIL.skip(j);
        }

        public C0446o0OoOOOo timeout() {
            return C0446o0OoOOOo.il1LilLllii;
        }

        public void close() throws IOException {
        }

        public void flush() throws IOException {
        }
    }
}
