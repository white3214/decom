package top.tntok.autobot;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLDecoder;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: top.tntok.autobot.o00oO00O  reason: case insensitive filesystem */
public abstract class C0222o00oO00O {
    public static final Pattern I1iIiIi = Pattern.compile(iILiI1lll, 2);
    public static final Logger I1l1iIll1lIi1 = Logger.getLogger(C0222o00oO00O.class.getName());
    public static final Pattern IL1lILLLL1L = Pattern.compile(i1L1lLllLLlIi);
    public static final String Ii1liIIIiLi = "text/html";
    public static final Pattern IiiL1llIIi = Pattern.compile(iilLiIIIi11i, 2);
    public static final String IilL11ii1I1Il = "NanoHttpd.QUERY_STRING";
    public static final String i111iLiiIIill = "text/plain";
    public static final String i1L1lLllLLlIi = "[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]";
    public static final String iILiI1lll = "([ |\t]*content-type[ |\t]*:)(.*)";
    public static final int iL1LIlIlI = 5000;
    public static Map<String, String> iiLIIiIli = null;
    public static final String iilLiIIIi11i = "([ |\t]*Content-Disposition[ |\t]*:)(.*)";
    public List<C0117o000oooO<C0115o000ooo, C0338o0O0oooo>> I11lLL1;
    public C0114o000ooOO<C0132o00O0o0o> IiIIlIL;
    public final int i1LIL11l;
    public C0113o000ooO0 iLLLILIiLi1Ii;
    public final String iiI1L1iI;
    public Thread iiIliillii;
    public C0117o000oooO<C0115o000ooo, C0338o0O0oooo> iilLil1i11I1;
    public C0116o000ooo0<ServerSocket, IOException> il1LilLllii;
    public volatile ServerSocket illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00oO00O$iiI1L1iI */
    public class iiI1L1iI implements C0117o000oooO<C0115o000ooo, C0338o0O0oooo> {
        public iiI1L1iI() {
        }

        /* renamed from: i1LIL11l */
        public C0338o0O0oooo iiI1L1iI(C0115o000ooo o000ooo) {
            return C0222o00oO00O.this.i11liIIl11Ii1(o000ooo);
        }
    }

    public C0222o00oO00O(int i) {
        this((String) null, i);
    }

    public static String I11lLL1(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            I1l1iIll1lIi1.log(Level.WARNING, "Encoding not supported, ignored", e);
            return null;
        }
    }

    public static SSLServerSocketFactory I1l1iIll1lIi1(byte[] bArr, String str) throws IOException {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            char[] charArray = str.toCharArray();
            instance.load(byteArrayInputStream, charArray);
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance2.init(instance, charArray);
            return Ii1liIIIiLi(instance, instance2);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static Map<String, String> ILl1iII11Ll1() {
        if (iiLIIiIli == null) {
            HashMap hashMap = new HashMap();
            iiLIIiIli = hashMap;
            iL1LIlIlI(hashMap, "META-INF/nanohttpd/default-mimetypes.properties");
            iL1LIlIlI(iiLIIiIli, "META-INF/nanohttpd/mimetypes.properties");
            if (iiLIIiIli.isEmpty()) {
                I1l1iIll1lIi1.log(Level.WARNING, "no mime types found in the classpath! please provide mimetypes.properties");
            }
        }
        return iiLIIiIli;
    }

    public static SSLServerSocketFactory Ii1liIIIiLi(KeyStore keyStore, KeyManagerFactory keyManagerFactory) throws IOException {
        try {
            return IilL11ii1I1Il(keyStore, keyManagerFactory.getKeyManagers());
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static SSLServerSocketFactory IilL11ii1I1Il(KeyStore keyStore, KeyManager[] keyManagerArr) throws IOException {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            SSLContext instance2 = SSLContext.getInstance("TLS");
            instance2.init(keyManagerArr, instance.getTrustManagers(), (SecureRandom) null);
            return instance2.getServerSocketFactory();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static SSLServerSocketFactory i111iLiiIIill(String str, char[] cArr) throws IOException {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            InputStream resourceAsStream = C0222o00oO00O.class.getResourceAsStream(str);
            if (resourceAsStream != null) {
                instance.load(resourceAsStream, cArr);
                KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                instance2.init(instance, cArr);
                return Ii1liIIIiLi(instance, instance2);
            }
            throw new IOException("Unable to load keystore from classpath: " + str);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static final void i1iiLIil1ILi(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                I1l1iIll1lIi1.log(Level.SEVERE, "Could not close", e);
            }
        }
    }

    public static void iL1LIlIlI(Map<String, String> map, String str) {
        InputStream inputStream;
        try {
            Enumeration<URL> resources = C0222o00oO00O.class.getClassLoader().getResources(str);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                Properties properties = new Properties();
                inputStream = null;
                try {
                    inputStream = nextElement.openStream();
                    properties.load(inputStream);
                } catch (IOException e) {
                    Logger logger = I1l1iIll1lIi1;
                    Level level = Level.SEVERE;
                    logger.log(level, "could not load mimetypes from " + nextElement, e);
                }
                i1iiLIil1ILi(inputStream);
                map.putAll(properties);
            }
        } catch (IOException unused) {
            Logger logger2 = I1l1iIll1lIi1;
            Level level2 = Level.INFO;
            logger2.log(level2, "no mime types available at " + str);
        } catch (Throwable th) {
            i1iiLIil1ILi(inputStream);
            throw th;
        }
    }

    public static Map<String, List<String>> iiIliillii(String str) {
        String I11lLL12;
        String str2;
        HashMap hashMap = new HashMap();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    I11lLL12 = I11lLL1(nextToken.substring(0, indexOf));
                } else {
                    I11lLL12 = I11lLL1(nextToken);
                }
                String trim = I11lLL12.trim();
                if (!hashMap.containsKey(trim)) {
                    hashMap.put(trim, new ArrayList());
                }
                if (indexOf >= 0) {
                    str2 = I11lLL1(nextToken.substring(indexOf + 1));
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    ((List) hashMap.get(trim)).add(str2);
                }
            }
        }
        return hashMap;
    }

    public static String iilLiIIIi11i(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str2 = ILl1iII11Ll1().get(str.substring(lastIndexOf + 1).toLowerCase());
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "application/octet-stream";
        }
        return str2;
    }

    public static Map<String, List<String>> iilLil1i11I1(Map<String, String> map) {
        return iiIliillii(map.get(IilL11ii1I1Il));
    }

    public void I1I11Il1(C0116o000ooo0<ServerSocket, IOException> o000ooo0) {
        this.il1LilLllii = o000ooo0;
    }

    public void I1IIIi1i1ILl() {
        try {
            i1iiLIil1ILi(this.illlI1lLIL);
            this.iLLLILIiLi1Ii.illlI1lLIL();
            Thread thread = this.iiIliillii;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            I1l1iIll1lIi1.log(Level.SEVERE, "Could not stop all connections", e);
        }
    }

    public C0114o000ooOO<C0132o00O0o0o> I1iIiIi() {
        return this.IiIIlIL;
    }

    public void IIlL1llI1() throws IOException {
        IL111l1(iL1LIlIlI);
    }

    public void IL111l1(int i) throws IOException {
        il1l1IlL(i, true);
    }

    public final boolean IL1lILLLL1L() {
        if (!IilliIIIlI1ll() || this.illlI1lLIL.isClosed() || !this.iiIliillii.isAlive()) {
            return false;
        }
        return true;
    }

    public final int IiIIlIL() {
        if (this.illlI1lLIL == null) {
            return -1;
        }
        return this.illlI1lLIL.getLocalPort();
    }

    public ServerSocket IiiL1llIIi() {
        return this.illlI1lLIL;
    }

    public final boolean IilliIIIlI1ll() {
        if (this.illlI1lLIL == null || this.iiIliillii == null) {
            return false;
        }
        return true;
    }

    public void IliiLiLliIl(C0117o000oooO<C0115o000ooo, C0338o0O0oooo> o000oooo) {
        this.iilLil1i11I1 = o000oooo;
    }

    @Deprecated
    public C0338o0O0oooo i11liIIl11Ii1(C0115o000ooo o000ooo) {
        return C0338o0O0oooo.I1IILIil1lLlL(C0376o0OOo0O0.NOT_FOUND, i111iLiiIIill, "Not Found");
    }

    public C0338o0O0oooo i1L1lLllLLlIi(C0115o000ooo o000ooo) {
        for (C0117o000oooO<C0115o000ooo, C0338o0O0oooo> iiI1L1iI2 : this.I11lLL1) {
            C0338o0O0oooo o0o0oooo = (C0338o0O0oooo) iiI1L1iI2.iiI1L1iI(o000ooo);
            if (o0o0oooo != null) {
                return o0o0oooo;
            }
        }
        return this.iilLil1i11I1.iiI1L1iI(o000ooo);
    }

    public synchronized void i1LIL11l() {
        I1IIIi1i1ILl();
    }

    public void i1iI1iiLL1(C0114o000ooOO<C0132o00O0o0o> o000oooo) {
        this.IiIIlIL = o000oooo;
    }

    public C0116o000ooo0<ServerSocket, IOException> iILiI1lll() {
        return this.il1LilLllii;
    }

    public String iLLLILIiLi1Ii() {
        return this.iiI1L1iI;
    }

    public void iiI1L1iI(C0117o000oooO<C0115o000ooo, C0338o0O0oooo> o000oooo) {
        this.I11lLL1.add(o000oooo);
    }

    public void iiLIIiIli(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
        this.il1LilLllii = new o0OO(sSLServerSocketFactory, strArr);
    }

    public void iiiiI1iILL11I(C0113o000ooO0 o000ooo0) {
        this.iLLLILIiLi1Ii = o000ooo0;
    }

    public o0OOOO00 il1LilLllii(int i) {
        return new o0OOOO00(this, i);
    }

    public void il1l1IlL(int i, boolean z) throws IOException {
        this.illlI1lLIL = iILiI1lll().iiI1L1iI();
        this.illlI1lLIL.setReuseAddress(true);
        o0OOOO00 il1LilLllii2 = il1LilLllii(i);
        Thread thread = new Thread(il1LilLllii2);
        this.iiIliillii = thread;
        thread.setDaemon(z);
        this.iiIliillii.setName("NanoHttpd Main Listener");
        this.iiIliillii.start();
        while (!il1LilLllii2.i1LIL11l() && il1LilLllii2.iiI1L1iI() == null) {
            try {
                Thread.sleep(10);
            } catch (Throwable unused) {
            }
        }
        if (il1LilLllii2.iiI1L1iI() != null) {
            throw il1LilLllii2.iiI1L1iI();
        }
    }

    public iIiIl1LIi illlI1lLIL(Socket socket, InputStream inputStream) {
        return new iIiIl1LIi(this, inputStream, socket);
    }

    /* renamed from: top.tntok.autobot.o00oO00O$i1LIL11l */
    public static final class i1LIL11l extends Exception {
        private static final long serialVersionUID = 6569838532917408380L;
        private final C0376o0OOo0O0 status;

        public i1LIL11l(C0376o0OOo0O0 o0ooo0o0, String str) {
            super(str);
            this.status = o0ooo0o0;
        }

        public C0376o0OOo0O0 iiI1L1iI() {
            return this.status;
        }

        public i1LIL11l(C0376o0OOo0O0 o0ooo0o0, String str, Exception exc) {
            super(str, exc);
            this.status = o0ooo0o0;
        }
    }

    public C0222o00oO00O(String str, int i) {
        this.il1LilLllii = new iL1I1LL1lIliI();
        this.I11lLL1 = new ArrayList(4);
        this.iiI1L1iI = str;
        this.i1LIL11l = i;
        i1iI1iiLL1(new ILi1iI1lLiL());
        iiiiI1iILL11I(new IiiI1LIIl());
        this.iilLil1i11I1 = new iiI1L1iI();
    }
}
