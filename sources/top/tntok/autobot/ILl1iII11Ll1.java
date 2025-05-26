package top.tntok.autobot;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import top.tntok.autobot.C0109o000oo00;

public final class ILl1iII11Ll1 {
    public final ProxySelector I11lLL1;
    @Nullable
    public final SSLSocketFactory IiIIlIL;
    @Nullable
    public final II1l11I11IiiL IiiL1llIIi;
    public final C0031Oooo0o i1LIL11l;
    @Nullable
    public final Proxy iLLLILIiLi1Ii;
    public final C0109o000oo00 iiI1L1iI;
    public final List<C0297o0O0Oo> iiIliillii;
    @Nullable
    public final HostnameVerifier iilLiIIIi11i;
    public final List<ILLiiL1ill1lI> iilLil1i11I1;
    public final IIlLLll1ll1 il1LilLllii;
    public final SocketFactory illlI1lLIL;

    public ILl1iII11Ll1(String str, int i, C0031Oooo0o oooo0o, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable II1l11I11IiiL iI1l11I11IiiL, IIlLLll1ll1 iIlLLll1ll1, @Nullable Proxy proxy, List<C0297o0O0Oo> list, List<ILLiiL1ill1lI> list2, ProxySelector proxySelector) {
        this.iiI1L1iI = new C0109o000oo00.iiI1L1iI().IIIlll1lll(sSLSocketFactory != null ? "https" : "http").i111iLiiIIill(str).i11liIIl11Ii1(i).iLLLILIiLi1Ii();
        if (oooo0o != null) {
            this.i1LIL11l = oooo0o;
            if (socketFactory != null) {
                this.illlI1lLIL = socketFactory;
                if (iIlLLll1ll1 != null) {
                    this.il1LilLllii = iIlLLll1ll1;
                    if (list != null) {
                        this.iiIliillii = C0487o0OooooO.iiLIIiIli(list);
                        if (list2 != null) {
                            this.iilLil1i11I1 = C0487o0OooooO.iiLIIiIli(list2);
                            if (proxySelector != null) {
                                this.I11lLL1 = proxySelector;
                                this.iLLLILIiLi1Ii = proxy;
                                this.IiIIlIL = sSLSocketFactory;
                                this.iilLiIIIi11i = hostnameVerifier;
                                this.IiiL1llIIi = iI1l11I11IiiL;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    public Proxy I11lLL1() {
        return this.iLLLILIiLi1Ii;
    }

    public ProxySelector IiIIlIL() {
        return this.I11lLL1;
    }

    @Nullable
    public SSLSocketFactory IiiL1llIIi() {
        return this.IiIIlIL;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ILl1iII11Ll1) {
            ILl1iII11Ll1 iLl1iII11Ll1 = (ILl1iII11Ll1) obj;
            if (!this.iiI1L1iI.equals(iLl1iII11Ll1.iiI1L1iI) || !il1LilLllii(iLl1iII11Ll1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode()) * 31) + this.il1LilLllii.hashCode()) * 31) + this.iiIliillii.hashCode()) * 31) + this.iilLil1i11I1.hashCode()) * 31) + this.I11lLL1.hashCode()) * 31) + Objects.hashCode(this.iLLLILIiLi1Ii)) * 31) + Objects.hashCode(this.IiIIlIL)) * 31) + Objects.hashCode(this.iilLiIIIi11i)) * 31) + Objects.hashCode(this.IiiL1llIIi);
    }

    public List<ILLiiL1ill1lI> i1LIL11l() {
        return this.iilLil1i11I1;
    }

    public C0109o000oo00 iILiI1lll() {
        return this.iiI1L1iI;
    }

    public IIlLLll1ll1 iLLLILIiLi1Ii() {
        return this.il1LilLllii;
    }

    @Nullable
    public II1l11I11IiiL iiI1L1iI() {
        return this.IiiL1llIIi;
    }

    @Nullable
    public HostnameVerifier iiIliillii() {
        return this.iilLiIIIi11i;
    }

    public SocketFactory iilLiIIIi11i() {
        return this.illlI1lLIL;
    }

    public List<C0297o0O0Oo> iilLil1i11I1() {
        return this.iiIliillii;
    }

    public boolean il1LilLllii(ILl1iII11Ll1 iLl1iII11Ll1) {
        if (!this.i1LIL11l.equals(iLl1iII11Ll1.i1LIL11l) || !this.il1LilLllii.equals(iLl1iII11Ll1.il1LilLllii) || !this.iiIliillii.equals(iLl1iII11Ll1.iiIliillii) || !this.iilLil1i11I1.equals(iLl1iII11Ll1.iilLil1i11I1) || !this.I11lLL1.equals(iLl1iII11Ll1.I11lLL1) || !Objects.equals(this.iLLLILIiLi1Ii, iLl1iII11Ll1.iLLLILIiLi1Ii) || !Objects.equals(this.IiIIlIL, iLl1iII11Ll1.IiIIlIL) || !Objects.equals(this.iilLiIIIi11i, iLl1iII11Ll1.iilLiIIIi11i) || !Objects.equals(this.IiiL1llIIi, iLl1iII11Ll1.IiiL1llIIi) || iILiI1lll().il1l1IlL() != iLl1iII11Ll1.iILiI1lll().il1l1IlL()) {
            return false;
        }
        return true;
    }

    public C0031Oooo0o illlI1lLIL() {
        return this.i1LIL11l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.iiI1L1iI.iL1LIlIlI());
        sb.append(":");
        sb.append(this.iiI1L1iI.il1l1IlL());
        if (this.iLLLILIiLi1Ii != null) {
            sb.append(", proxy=");
            sb.append(this.iLLLILIiLi1Ii);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.I11lLL1);
        }
        sb.append("}");
        return sb.toString();
    }
}
