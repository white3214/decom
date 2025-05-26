package top.tntok.autobot;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

public final class o0OO0OoO {
    public final Proxy i1LIL11l;
    public final ILl1iII11Ll1 iiI1L1iI;
    public final InetSocketAddress illlI1lLIL;

    public o0OO0OoO(ILl1iII11Ll1 iLl1iII11Ll1, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (iLl1iII11Ll1 == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.iiI1L1iI = iLl1iII11Ll1;
            this.i1LIL11l = proxy;
            this.illlI1lLIL = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OO0OoO) {
            o0OO0OoO o0oo0ooo = (o0OO0OoO) obj;
            if (!o0oo0ooo.iiI1L1iI.equals(this.iiI1L1iI) || !o0oo0ooo.i1LIL11l.equals(this.i1LIL11l) || !o0oo0ooo.illlI1lLIL.equals(this.illlI1lLIL)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode()) * 31) + this.illlI1lLIL.hashCode();
    }

    public Proxy i1LIL11l() {
        return this.i1LIL11l;
    }

    public ILl1iII11Ll1 iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public InetSocketAddress il1LilLllii() {
        return this.illlI1lLIL;
    }

    public boolean illlI1lLIL() {
        if (this.iiI1L1iI.IiIIlIL == null || this.i1LIL11l.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Route{" + this.illlI1lLIL + "}";
    }
}
