package top.tntok.autobot;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import top.tntok.autobot.C0042OoooOo0;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.C0500o0o00O00;
import top.tntok.autobot.iiIIl1I;

/* renamed from: top.tntok.autobot.o00oOoOO  reason: case insensitive filesystem */
public class C0240o00oOoOO implements Cloneable, iiIIl1I.iiI1L1iI, C0500o0o00O00.iiI1L1iI {
    public static final List<C0297o0O0Oo> IL111l1 = C0487o0OooooO.ILl1iII11Ll1(C0297o0O0Oo.HTTP_2, C0297o0O0Oo.HTTP_1_1);
    public static final List<ILLiiL1ill1lI> il1l1IlL = C0487o0OooooO.ILl1iII11Ll1(ILLiiL1ill1lI.iLLLILIiLi1Ii, ILLiiL1ill1lI.iilLiIIIi11i);
    public final List<o00OO00O> I11lLL1;
    public final int I1I11Il1;
    public final SocketFactory I1iIiIi;
    public final IILl1LiIl1L I1l1iIll1lIi1;
    public final int IIlL1llI1;
    public final iilii1LIILi IL1lILLLL1L;
    public final boolean ILl1iII11Ll1;
    public final IIlLLll1ll1 Ii1liIIIiLi;
    public final ProxySelector IiIIlIL;
    @Nullable
    public final iL1ilIi1l11L1 IiiL1llIIi;
    public final IIlLLll1ll1 IilL11ii1I1Il;
    public final int IliiLiLliIl;
    public final II1l11I11IiiL i111iLiiIIill;
    public final boolean i11liIIl11Ii1;
    public final SSLSocketFactory i1L1lLllLLlIi;
    public final C0024OooOooO i1LIL11l;
    public final int i1iI1iiLL1;
    public final boolean i1iiLIil1ILi;
    @Nullable
    public final o00OO0 iILiI1lll;
    public final HostnameVerifier iL1LIlIlI;
    public final C0042OoooOo0.i1LIL11l iLLLILIiLi1Ii;
    public final List<ILLiiL1ill1lI> iiIliillii;
    public final C0031Oooo0o iiLIIiIli;
    public final int iiiiI1iILL11I;
    public final ii1ILilI1IL iilLiIIIi11i;
    public final List<o00OO00O> iilLil1i11I1;
    public final List<C0297o0O0Oo> il1LilLllii;
    @Nullable
    public final Proxy illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00oOoOO$iiI1L1iI */
    public class iiI1L1iI extends C0139o00OO00o {
        public void I11lLL1(C0337o0O0oooO.iiI1L1iI iii1l1ii, C0045Ooooo00 ooooo00) {
            iii1l1ii.IiiL1llIIi(ooooo00);
        }

        public iiIIl1I IiIIlIL(C0240o00oOoOO o00ooooo, C0333o0O0ooO0 o0o0ooo0) {
            return C0531o0oOo0O0.I11lLL1(o00ooooo, o0o0ooo0, true);
        }

        public void i1LIL11l(C0094o000o000.iiI1L1iI iii1l1ii, String str, String str2) {
            iii1l1ii.I11lLL1(str, str2);
        }

        public void iiI1L1iI(C0094o000o000.iiI1L1iI iii1l1ii, String str) {
            iii1l1ii.iilLil1i11I1(str);
        }

        public boolean iiIliillii(ILl1iII11Ll1 iLl1iII11Ll1, ILl1iII11Ll1 iLl1iII11Ll12) {
            return iLl1iII11Ll1.il1LilLllii(iLl1iII11Ll12);
        }

        public C0330o0O0oo0O iilLiIIIi11i(IILl1LiIl1L iILl1LiIl1L) {
            return iILl1LiIl1L.iiI1L1iI;
        }

        @Nullable
        public C0045Ooooo00 iilLil1i11I1(C0337o0O0oooO o0o0oooo) {
            return o0o0oooo.i1L1lLllLLlIi;
        }

        public int il1LilLllii(C0337o0O0oooO.iiI1L1iI iii1l1ii) {
            return iii1l1ii.illlI1lLIL;
        }

        public void illlI1lLIL(ILLiiL1ill1lI iLLiiL1ill1lI, SSLSocket sSLSocket, boolean z) {
            iLLiiL1ill1lI.iiI1L1iI(sSLSocket, z);
        }
    }

    static {
        C0139o00OO00o.iiI1L1iI = new iiI1L1iI();
    }

    public C0240o00oOoOO() {
        this(new i1LIL11l());
    }

    public static SSLSocketFactory iiiiI1iILL11I(X509TrustManager x509TrustManager) {
        try {
            SSLContext IL1lILLLL1L2 = C0292o0O0O0oO.I1iIiIi().IL1lILLLL1L();
            IL1lILLLL1L2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return IL1lILLLL1L2.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    @Nullable
    public iL1ilIi1l11L1 I11lLL1() {
        return this.IiiL1llIIi;
    }

    public List<C0297o0O0Oo> I1I11Il1() {
        return this.il1LilLllii;
    }

    public boolean I1IIIi1i1ILl() {
        return this.i11liIIl11Ii1;
    }

    public ii1ILilI1IL I1iIiIi() {
        return this.iilLiIIIi11i;
    }

    public HostnameVerifier I1l1iIll1lIi1() {
        return this.iL1LIlIlI;
    }

    public SSLSocketFactory IIIlll1lll() {
        return this.i1L1lLllLLlIi;
    }

    public IIlLLll1ll1 IIlL1llI1() {
        return this.Ii1liIIIiLi;
    }

    public ProxySelector IL111l1() {
        return this.IiIIlIL;
    }

    public int IL1IiilLlLI() {
        return this.i1iI1iiLL1;
    }

    public C0031Oooo0o IL1lILLLL1L() {
        return this.iiLIIiIli;
    }

    @Nullable
    public o00OO0 ILl1iII11Ll1() {
        iL1ilIi1l11L1 il1ilii1l11l1 = this.IiiL1llIIi;
        if (il1ilii1l11l1 != null) {
            return il1ilii1l11l1.i1LIL11l;
        }
        return this.iILiI1lll;
    }

    public boolean Ii1liIIIiLi() {
        return this.i1iiLIil1ILi;
    }

    public II1l11I11IiiL IiIIlIL() {
        return this.i111iLiiIIill;
    }

    public IILl1LiIl1L IiiL1llIIi() {
        return this.I1l1iIll1lIi1;
    }

    public boolean IilL11ii1I1Il() {
        return this.ILl1iII11Ll1;
    }

    public SocketFactory IilliIIIlI1ll() {
        return this.I1iIiIi;
    }

    public int IliiLiLliIl() {
        return this.IIlL1llI1;
    }

    public i1LIL11l i11liIIl11Ii1() {
        return new i1LIL11l(this);
    }

    public C0024OooOooO i1L1lLllLLlIi() {
        return this.i1LIL11l;
    }

    @Nullable
    public Proxy i1iI1iiLL1() {
        return this.illlI1lLIL;
    }

    public List<o00OO00O> i1iiLIil1ILi() {
        return this.I11lLL1;
    }

    public List<ILLiiL1ill1lI> iILiI1lll() {
        return this.iiIliillii;
    }

    public C0042OoooOo0.i1LIL11l iL1LIlIlI() {
        return this.iLLLILIiLi1Ii;
    }

    public int iLLLILIiLi1Ii() {
        return this.iiiiI1iILL11I;
    }

    public iiIIl1I iiIliillii(C0333o0O0ooO0 o0o0ooo0) {
        return C0531o0oOo0O0.I11lLL1(this, o0o0ooo0, false);
    }

    public List<o00OO00O> iiLIIiIli() {
        return this.iilLil1i11I1;
    }

    public int iilLiIIIi11i() {
        return this.IliiLiLliIl;
    }

    public IIlLLll1ll1 iilLil1i11I1() {
        return this.IilL11ii1I1Il;
    }

    public int il1l1IlL() {
        return this.I1I11Il1;
    }

    public C0500o0o00O00 illlI1lLIL(C0333o0O0ooO0 o0o0ooo0, C0498o0o00O o0o00o) {
        C0317o0O0oO o0o0oo = new C0317o0O0oO(o0o0ooo0, o0o00o, new Random(), (long) this.IIlL1llI1);
        o0o0oo.iL1LIlIlI(this);
        return o0o0oo;
    }

    public C0240o00oOoOO(i1LIL11l i1lil11l) {
        boolean z;
        this.i1LIL11l = i1lil11l.iiI1L1iI;
        this.illlI1lLIL = i1lil11l.i1LIL11l;
        this.il1LilLllii = i1lil11l.illlI1lLIL;
        List<ILLiiL1ill1lI> list = i1lil11l.il1LilLllii;
        this.iiIliillii = list;
        this.iilLil1i11I1 = C0487o0OooooO.iiLIIiIli(i1lil11l.iiIliillii);
        this.I11lLL1 = C0487o0OooooO.iiLIIiIli(i1lil11l.iilLil1i11I1);
        this.iLLLILIiLi1Ii = i1lil11l.I11lLL1;
        this.IiIIlIL = i1lil11l.iLLLILIiLi1Ii;
        this.iilLiIIIi11i = i1lil11l.IiIIlIL;
        this.IiiL1llIIi = i1lil11l.iilLiIIIi11i;
        this.iILiI1lll = i1lil11l.IiiL1llIIi;
        this.I1iIiIi = i1lil11l.iILiI1lll;
        Iterator<ILLiiL1ill1lI> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ILLiiL1ill1lI next = it.next();
                if (z || next.il1LilLllii()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = i1lil11l.I1iIiIi;
        if (sSLSocketFactory != null || !z) {
            this.i1L1lLllLLlIi = sSLSocketFactory;
            this.IL1lILLLL1L = i1lil11l.i1L1lLllLLlIi;
        } else {
            X509TrustManager il1l1IlL2 = C0487o0OooooO.il1l1IlL();
            this.i1L1lLllLLlIi = iiiiI1iILL11I(il1l1IlL2);
            this.IL1lILLLL1L = iilii1LIILi.i1LIL11l(il1l1IlL2);
        }
        if (this.i1L1lLllLLlIi != null) {
            C0292o0O0O0oO.I1iIiIi().I11lLL1(this.i1L1lLllLLlIi);
        }
        this.iL1LIlIlI = i1lil11l.IL1lILLLL1L;
        this.i111iLiiIIill = i1lil11l.iL1LIlIlI.I11lLL1(this.IL1lILLLL1L);
        this.Ii1liIIIiLi = i1lil11l.i111iLiiIIill;
        this.IilL11ii1I1Il = i1lil11l.Ii1liIIIiLi;
        this.I1l1iIll1lIi1 = i1lil11l.IilL11ii1I1Il;
        this.iiLIIiIli = i1lil11l.I1l1iIll1lIi1;
        this.ILl1iII11Ll1 = i1lil11l.iiLIIiIli;
        this.i1iiLIil1ILi = i1lil11l.ILl1iII11Ll1;
        this.i11liIIl11Ii1 = i1lil11l.i1iiLIil1ILi;
        this.iiiiI1iILL11I = i1lil11l.i11liIIl11Ii1;
        this.IliiLiLliIl = i1lil11l.iiiiI1iILL11I;
        this.I1I11Il1 = i1lil11l.IliiLiLliIl;
        this.i1iI1iiLL1 = i1lil11l.I1I11Il1;
        this.IIlL1llI1 = i1lil11l.i1iI1iiLL1;
        if (this.iilLil1i11I1.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.iilLil1i11I1);
        } else if (this.I11lLL1.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.I11lLL1);
        }
    }

    /* renamed from: top.tntok.autobot.o00oOoOO$i1LIL11l */
    public static final class i1LIL11l {
        public C0042OoooOo0.i1LIL11l I11lLL1;
        public int I1I11Il1;
        @Nullable
        public SSLSocketFactory I1iIiIi;
        public C0031Oooo0o I1l1iIll1lIi1;
        public HostnameVerifier IL1lILLLL1L;
        public boolean ILl1iII11Ll1;
        public IIlLLll1ll1 Ii1liIIIiLi;
        public ii1ILilI1IL IiIIlIL;
        @Nullable
        public o00OO0 IiiL1llIIi;
        public IILl1LiIl1L IilL11ii1I1Il;
        public int IliiLiLliIl;
        public IIlLLll1ll1 i111iLiiIIill;
        public int i11liIIl11Ii1;
        @Nullable
        public iilii1LIILi i1L1lLllLLlIi;
        @Nullable
        public Proxy i1LIL11l;
        public int i1iI1iiLL1;
        public boolean i1iiLIil1ILi;
        public SocketFactory iILiI1lll;
        public II1l11I11IiiL iL1LIlIlI;
        public ProxySelector iLLLILIiLi1Ii;
        public C0024OooOooO iiI1L1iI;
        public final List<o00OO00O> iiIliillii;
        public boolean iiLIIiIli;
        public int iiiiI1iILL11I;
        @Nullable
        public iL1ilIi1l11L1 iilLiIIIi11i;
        public final List<o00OO00O> iilLil1i11I1;
        public List<ILLiiL1ill1lI> il1LilLllii;
        public List<C0297o0O0Oo> illlI1lLIL;

        public i1LIL11l() {
            this.iiIliillii = new ArrayList();
            this.iilLil1i11I1 = new ArrayList();
            this.iiI1L1iI = new C0024OooOooO();
            this.illlI1lLIL = C0240o00oOoOO.IL111l1;
            this.il1LilLllii = C0240o00oOoOO.il1l1IlL;
            this.I11lLL1 = C0042OoooOo0.iILiI1lll(C0042OoooOo0.iiI1L1iI);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.iLLLILIiLi1Ii = proxySelector;
            if (proxySelector == null) {
                this.iLLLILIiLi1Ii = new C0235o00oOo00();
            }
            this.IiIIlIL = ii1ILilI1IL.iiI1L1iI;
            this.iILiI1lll = SocketFactory.getDefault();
            this.IL1lILLLL1L = C0238o00oOoO.iiI1L1iI;
            this.iL1LIlIlI = II1l11I11IiiL.illlI1lLIL;
            IIlLLll1ll1 iIlLLll1ll1 = IIlLLll1ll1.iiI1L1iI;
            this.i111iLiiIIill = iIlLLll1ll1;
            this.Ii1liIIIiLi = iIlLLll1ll1;
            this.IilL11ii1I1Il = new IILl1LiIl1L();
            this.I1l1iIll1lIi1 = C0031Oooo0o.iiI1L1iI;
            this.iiLIIiIli = true;
            this.ILl1iII11Ll1 = true;
            this.i1iiLIil1ILi = true;
            this.i11liIIl11Ii1 = 0;
            this.iiiiI1iILL11I = C0530o0oOo000.il1LilLllii;
            this.IliiLiLliIl = C0530o0oOo000.il1LilLllii;
            this.I1I11Il1 = C0530o0oOo000.il1LilLllii;
            this.i1iI1iiLL1 = 0;
        }

        @IgnoreJRERequirement
        public i1LIL11l I11lLL1(Duration duration) {
            this.i11liIIl11Ii1 = C0487o0OooooO.iiIliillii("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public i1LIL11l I1I11Il1(IIlLLll1ll1 iIlLLll1ll1) {
            if (iIlLLll1ll1 != null) {
                this.i111iLiiIIill = iIlLLll1ll1;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        public i1LIL11l I1IIIi1i1ILl(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            } else if (!(socketFactory instanceof SSLSocketFactory)) {
                this.iILiI1lll = socketFactory;
                return this;
            } else {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
        }

        public i1LIL11l I1iIiIi(ii1ILilI1IL ii1ilili1il) {
            if (ii1ilili1il != null) {
                this.IiIIlIL = ii1ilili1il;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        public i1LIL11l I1l1iIll1lIi1(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.IL1lILLLL1L = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public i1LIL11l IIIlll1lll(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.I1iIiIi = sSLSocketFactory;
                this.i1L1lLllLLlIi = iilii1LIILi.i1LIL11l(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        @IgnoreJRERequirement
        public i1LIL11l IILiIL1i11Li(Duration duration) {
            this.I1I11Il1 = C0487o0OooooO.iiIliillii("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public i1LIL11l IIlL1llI1(long j, TimeUnit timeUnit) {
            this.IliiLiLliIl = C0487o0OooooO.iiIliillii("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public i1LIL11l IL111l1(Duration duration) {
            this.IliiLiLliIl = C0487o0OooooO.iiIliillii("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public i1LIL11l IL1IiilLlLI(long j, TimeUnit timeUnit) {
            this.I1I11Il1 = C0487o0OooooO.iiIliillii("timeout", j, timeUnit);
            return this;
        }

        public i1LIL11l IL1lILLLL1L(C0031Oooo0o oooo0o) {
            if (oooo0o != null) {
                this.I1l1iIll1lIi1 = oooo0o;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        public List<o00OO00O> ILl1iII11Ll1() {
            return this.iilLil1i11I1;
        }

        public i1LIL11l Ii1liIIIiLi(boolean z) {
            this.ILl1iII11Ll1 = z;
            return this;
        }

        public i1LIL11l IiIIlIL(long j, TimeUnit timeUnit) {
            this.iiiiI1iILL11I = C0487o0OooooO.iiIliillii("timeout", j, timeUnit);
            return this;
        }

        public i1LIL11l IiiL1llIIi(IILl1LiIl1L iILl1LiIl1L) {
            if (iILl1LiIl1L != null) {
                this.IilL11ii1I1Il = iILl1LiIl1L;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public i1LIL11l IilL11ii1I1Il(boolean z) {
            this.iiLIIiIli = z;
            return this;
        }

        public i1LIL11l IilliIIIlI1ll(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.I1iIiIi = sSLSocketFactory;
                this.i1L1lLllLLlIi = C0292o0O0O0oO.I1iIiIi().illlI1lLIL(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        public i1LIL11l IliiLiLliIl(@Nullable Proxy proxy) {
            this.i1LIL11l = proxy;
            return this;
        }

        public i1LIL11l i111iLiiIIill(C0042OoooOo0.i1LIL11l i1lil11l) {
            if (i1lil11l != null) {
                this.I11lLL1 = i1lil11l;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        @IgnoreJRERequirement
        public i1LIL11l i11liIIl11Ii1(Duration duration) {
            this.i1iI1iiLL1 = C0487o0OooooO.iiIliillii("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public i1LIL11l i1L1lLllLLlIi(C0024OooOooO oooOooO) {
            if (oooOooO != null) {
                this.iiI1L1iI = oooOooO;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public i1LIL11l i1LIL11l(o00OO00O o00oo00o) {
            if (o00oo00o != null) {
                this.iilLil1i11I1.add(o00oo00o);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public i1LIL11l i1iI1iiLL1(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.iLLLILIiLi1Ii = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        public i1LIL11l i1iiLIil1ILi(long j, TimeUnit timeUnit) {
            this.i1iI1iiLL1 = C0487o0OooooO.iiIliillii("interval", j, timeUnit);
            return this;
        }

        public i1LIL11l iILiI1lll(List<ILLiiL1ill1lI> list) {
            this.il1LilLllii = C0487o0OooooO.iiLIIiIli(list);
            return this;
        }

        public i1LIL11l iL1LIlIlI(C0042OoooOo0 ooooOo0) {
            if (ooooOo0 != null) {
                this.I11lLL1 = C0042OoooOo0.iILiI1lll(ooooOo0);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public i1LIL11l iLLLILIiLi1Ii(II1l11I11IiiL iI1l11I11IiiL) {
            if (iI1l11I11IiiL != null) {
                this.iL1LIlIlI = iI1l11I11IiiL;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        public i1LIL11l iiI1L1iI(o00OO00O o00oo00o) {
            if (o00oo00o != null) {
                this.iiIliillii.add(o00oo00o);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public i1LIL11l iiIliillii(@Nullable iL1ilIi1l11L1 il1ilii1l11l1) {
            this.iilLiIIIi11i = il1ilii1l11l1;
            this.IiiL1llIIi = null;
            return this;
        }

        public List<o00OO00O> iiLIIiIli() {
            return this.iiIliillii;
        }

        public i1LIL11l iiiiI1iILL11I(List<C0297o0O0Oo> list) {
            ArrayList arrayList = new ArrayList(list);
            C0297o0O0Oo o0o0oo = C0297o0O0Oo.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(o0o0oo) && !arrayList.contains(C0297o0O0Oo.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            } else if (arrayList.contains(o0o0oo) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            } else if (arrayList.contains(C0297o0O0Oo.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            } else if (!arrayList.contains((Object) null)) {
                arrayList.remove(C0297o0O0Oo.SPDY_3);
                this.illlI1lLIL = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        @IgnoreJRERequirement
        public i1LIL11l iilLiIIIi11i(Duration duration) {
            this.iiiiI1iILL11I = C0487o0OooooO.iiIliillii("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public i1LIL11l iilLil1i11I1(long j, TimeUnit timeUnit) {
            this.i11liIIl11Ii1 = C0487o0OooooO.iiIliillii("timeout", j, timeUnit);
            return this;
        }

        public C0240o00oOoOO il1LilLllii() {
            return new C0240o00oOoOO(this);
        }

        public i1LIL11l il1l1IlL(boolean z) {
            this.i1iiLIil1ILi = z;
            return this;
        }

        public i1LIL11l illlI1lLIL(IIlLLll1ll1 iIlLLll1ll1) {
            if (iIlLLll1ll1 != null) {
                this.Ii1liIIIiLi = iIlLLll1ll1;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public i1LIL11l(C0240o00oOoOO o00ooooo) {
            ArrayList arrayList = new ArrayList();
            this.iiIliillii = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.iilLil1i11I1 = arrayList2;
            this.iiI1L1iI = o00ooooo.i1LIL11l;
            this.i1LIL11l = o00ooooo.illlI1lLIL;
            this.illlI1lLIL = o00ooooo.il1LilLllii;
            this.il1LilLllii = o00ooooo.iiIliillii;
            arrayList.addAll(o00ooooo.iilLil1i11I1);
            arrayList2.addAll(o00ooooo.I11lLL1);
            this.I11lLL1 = o00ooooo.iLLLILIiLi1Ii;
            this.iLLLILIiLi1Ii = o00ooooo.IiIIlIL;
            this.IiIIlIL = o00ooooo.iilLiIIIi11i;
            this.IiiL1llIIi = o00ooooo.iILiI1lll;
            this.iilLiIIIi11i = o00ooooo.IiiL1llIIi;
            this.iILiI1lll = o00ooooo.I1iIiIi;
            this.I1iIiIi = o00ooooo.i1L1lLllLLlIi;
            this.i1L1lLllLLlIi = o00ooooo.IL1lILLLL1L;
            this.IL1lILLLL1L = o00ooooo.iL1LIlIlI;
            this.iL1LIlIlI = o00ooooo.i111iLiiIIill;
            this.i111iLiiIIill = o00ooooo.Ii1liIIIiLi;
            this.Ii1liIIIiLi = o00ooooo.IilL11ii1I1Il;
            this.IilL11ii1I1Il = o00ooooo.I1l1iIll1lIi1;
            this.I1l1iIll1lIi1 = o00ooooo.iiLIIiIli;
            this.iiLIIiIli = o00ooooo.ILl1iII11Ll1;
            this.ILl1iII11Ll1 = o00ooooo.i1iiLIil1ILi;
            this.i1iiLIil1ILi = o00ooooo.i11liIIl11Ii1;
            this.i11liIIl11Ii1 = o00ooooo.iiiiI1iILL11I;
            this.iiiiI1iILL11I = o00ooooo.IliiLiLliIl;
            this.IliiLiLliIl = o00ooooo.I1I11Il1;
            this.I1I11Il1 = o00ooooo.i1iI1iiLL1;
            this.i1iI1iiLL1 = o00ooooo.IIlL1llI1;
        }
    }
}
