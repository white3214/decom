package top.tntok.autobot;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

public final class ILLiiL1ill1lI {
    public static final ILLiiL1ill1lI I11lLL1;
    public static final ILLiiL1ill1lI IiIIlIL;
    public static final ILLiiL1ill1lI iLLLILIiLi1Ii;
    public static final i1lLIl1L1lIL[] iiIliillii;
    public static final ILLiiL1ill1lI iilLiIIIi11i = new iiI1L1iI(false).illlI1lLIL();
    public static final i1lLIl1L1lIL[] iilLil1i11I1;
    public final boolean i1LIL11l;
    public final boolean iiI1L1iI;
    @Nullable
    public final String[] il1LilLllii;
    @Nullable
    public final String[] illlI1lLIL;

    static {
        i1lLIl1L1lIL i1llil1l1lil = i1lLIl1L1lIL.ili11iILI1l;
        i1lLIl1L1lIL i1llil1l1lil2 = i1lLIl1L1lIL.iL1ilIi1l11L1;
        i1lLIl1L1lIL i1llil1l1lil3 = i1lLIl1L1lIL.i1I1l11IL;
        i1lLIl1L1lIL i1llil1l1lil4 = i1lLIl1L1lIL.iLliII11iI;
        i1lLIl1L1lIL i1llil1l1lil5 = i1lLIl1L1lIL.IiIiilIiL1iLi;
        i1lLIl1L1lIL i1llil1l1lil6 = i1lLIl1L1lIL.iliilLIIilill;
        i1lLIl1L1lIL i1llil1l1lil7 = i1lLIl1L1lIL.IiILIlLLiIL;
        i1lLIl1L1lIL i1llil1l1lil8 = i1lLIl1L1lIL.iIliIIiiI;
        i1lLIl1L1lIL i1llil1l1lil9 = i1lLIl1L1lIL.iI1LILIILLI;
        i1lLIl1L1lIL[] i1llil1l1lilArr = {i1llil1l1lil, i1llil1l1lil2, i1llil1l1lil3, i1llil1l1lil4, i1llil1l1lil5, i1llil1l1lil6, i1llil1l1lil7, i1llil1l1lil8, i1llil1l1lil9};
        iiIliillii = i1llil1l1lilArr;
        i1lLIl1L1lIL[] i1llil1l1lilArr2 = {i1llil1l1lil, i1llil1l1lil2, i1llil1l1lil3, i1llil1l1lil4, i1llil1l1lil5, i1llil1l1lil6, i1llil1l1lil7, i1llil1l1lil8, i1llil1l1lil9, i1lLIl1L1lIL.iL1lL1LL, i1lLIl1L1lIL.i1IL1lILl1L1I, i1lLIl1L1lIL.iLI1L1l1li, i1lLIl1L1lIL.I1LiILiLLIl1l, i1lLIl1L1lIL.IilliIIIlI1ll, i1lLIl1L1lIL.IIlLill, i1lLIl1L1lIL.IiiL1llIIi};
        iilLil1i11I1 = i1llil1l1lilArr2;
        iiI1L1iI iiIliillii2 = new iiI1L1iI(true).iiIliillii(i1llil1l1lilArr);
        C0448o0OoOOo0 o0ooooo0 = C0448o0OoOOo0.TLS_1_3;
        C0448o0OoOOo0 o0ooooo02 = C0448o0OoOOo0.TLS_1_2;
        I11lLL1 = iiIliillii2.iLLLILIiLi1Ii(o0ooooo0, o0ooooo02).iilLil1i11I1(true).illlI1lLIL();
        iLLLILIiLi1Ii = new iiI1L1iI(true).iiIliillii(i1llil1l1lilArr2).iLLLILIiLi1Ii(o0ooooo0, o0ooooo02).iilLil1i11I1(true).illlI1lLIL();
        IiIIlIL = new iiI1L1iI(true).iiIliillii(i1llil1l1lilArr2).iLLLILIiLi1Ii(o0ooooo0, o0ooooo02, C0448o0OoOOo0.TLS_1_1, C0448o0OoOOo0.TLS_1_0).iilLil1i11I1(true).illlI1lLIL();
    }

    public ILLiiL1ill1lI(iiI1L1iI iii1l1ii) {
        this.iiI1L1iI = iii1l1ii.iiI1L1iI;
        this.illlI1lLIL = iii1l1ii.i1LIL11l;
        this.il1LilLllii = iii1l1ii.illlI1lLIL;
        this.i1LIL11l = iii1l1ii.il1LilLllii;
    }

    @Nullable
    public List<C0448o0OoOOo0> I11lLL1() {
        String[] strArr = this.il1LilLllii;
        if (strArr != null) {
            return C0448o0OoOOo0.i1LIL11l(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ILLiiL1ill1lI)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ILLiiL1ill1lI iLLiiL1ill1lI = (ILLiiL1ill1lI) obj;
        boolean z = this.iiI1L1iI;
        if (z != iLLiiL1ill1lI.iiI1L1iI) {
            return false;
        }
        if (!z || (Arrays.equals(this.illlI1lLIL, iLLiiL1ill1lI.illlI1lLIL) && Arrays.equals(this.il1LilLllii, iLLiiL1ill1lI.il1LilLllii) && this.i1LIL11l == iLLiiL1ill1lI.i1LIL11l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.iiI1L1iI) {
            return ((((527 + Arrays.hashCode(this.illlI1lLIL)) * 31) + Arrays.hashCode(this.il1LilLllii)) * 31) + (this.i1LIL11l ^ true ? 1 : 0);
        }
        return 17;
    }

    @Nullable
    public List<i1lLIl1L1lIL> i1LIL11l() {
        String[] strArr = this.illlI1lLIL;
        if (strArr != null) {
            return i1lLIl1L1lIL.illlI1lLIL(strArr);
        }
        return null;
    }

    public void iiI1L1iI(SSLSocket sSLSocket, boolean z) {
        ILLiiL1ill1lI iiIliillii2 = iiIliillii(sSLSocket, z);
        String[] strArr = iiIliillii2.il1LilLllii;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = iiIliillii2.illlI1lLIL;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public final ILLiiL1ill1lI iiIliillii(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.illlI1lLIL != null) {
            strArr = C0487o0OooooO.I1I11Il1(i1lLIl1L1lIL.i1LIL11l, sSLSocket.getEnabledCipherSuites(), this.illlI1lLIL);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.il1LilLllii != null) {
            strArr2 = C0487o0OooooO.I1I11Il1(C0487o0OooooO.iilLiIIIi11i, sSLSocket.getEnabledProtocols(), this.il1LilLllii);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int i11liIIl11Ii1 = C0487o0OooooO.i11liIIl11Ii1(i1lLIl1L1lIL.i1LIL11l, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && i11liIIl11Ii1 != -1) {
            strArr = C0487o0OooooO.iilLiIIIi11i(strArr, supportedCipherSuites[i11liIIl11Ii1]);
        }
        return new iiI1L1iI(this).il1LilLllii(strArr).I11lLL1(strArr2).illlI1lLIL();
    }

    public boolean iilLil1i11I1() {
        return this.i1LIL11l;
    }

    public boolean il1LilLllii() {
        return this.iiI1L1iI;
    }

    public boolean illlI1lLIL(SSLSocket sSLSocket) {
        if (!this.iiI1L1iI) {
            return false;
        }
        String[] strArr = this.il1LilLllii;
        if (strArr != null && !C0487o0OooooO.IL111l1(C0487o0OooooO.iilLiIIIi11i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.illlI1lLIL;
        if (strArr2 == null || C0487o0OooooO.IL111l1(i1lLIl1L1lIL.i1LIL11l, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (!this.iiI1L1iI) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(i1LIL11l(), "[all enabled]") + ", tlsVersions=" + Objects.toString(I11lLL1(), "[all enabled]") + ", supportsTlsExtensions=" + this.i1LIL11l + ")";
    }

    public static final class iiI1L1iI {
        @Nullable
        public String[] i1LIL11l;
        public boolean iiI1L1iI;
        public boolean il1LilLllii;
        @Nullable
        public String[] illlI1lLIL;

        public iiI1L1iI(boolean z) {
            this.iiI1L1iI = z;
        }

        public iiI1L1iI I11lLL1(String... strArr) {
            if (!this.iiI1L1iI) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.illlI1lLIL = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public iiI1L1iI i1LIL11l() {
            if (this.iiI1L1iI) {
                this.illlI1lLIL = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public iiI1L1iI iLLLILIiLi1Ii(C0448o0OoOOo0... o0ooooo0Arr) {
            if (this.iiI1L1iI) {
                String[] strArr = new String[o0ooooo0Arr.length];
                for (int i = 0; i < o0ooooo0Arr.length; i++) {
                    strArr[i] = o0ooooo0Arr[i].javaName;
                }
                return I11lLL1(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public iiI1L1iI iiI1L1iI() {
            if (this.iiI1L1iI) {
                this.i1LIL11l = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public iiI1L1iI iiIliillii(i1lLIl1L1lIL... i1llil1l1lilArr) {
            if (this.iiI1L1iI) {
                String[] strArr = new String[i1llil1l1lilArr.length];
                for (int i = 0; i < i1llil1l1lilArr.length; i++) {
                    strArr[i] = i1llil1l1lilArr[i].iiI1L1iI;
                }
                return il1LilLllii(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public iiI1L1iI iilLil1i11I1(boolean z) {
            if (this.iiI1L1iI) {
                this.il1LilLllii = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public iiI1L1iI il1LilLllii(String... strArr) {
            if (!this.iiI1L1iI) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.i1LIL11l = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public ILLiiL1ill1lI illlI1lLIL() {
            return new ILLiiL1ill1lI(this);
        }

        public iiI1L1iI(ILLiiL1ill1lI iLLiiL1ill1lI) {
            this.iiI1L1iI = iLLiiL1ill1lI.iiI1L1iI;
            this.i1LIL11l = iLLiiL1ill1lI.illlI1lLIL;
            this.illlI1lLIL = iLLiiL1ill1lI.il1LilLllii;
            this.il1LilLllii = iLLiiL1ill1lI.i1LIL11l;
        }
    }
}
