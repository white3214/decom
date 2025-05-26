package top.tntok.autobot;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class o0OO0o00 {
    public List<InetSocketAddress> I11lLL1 = Collections.emptyList();
    public final C0397o0OOooO0 i1LIL11l;
    public final List<o0OO0OoO> iLLLILIiLi1Ii = new ArrayList();
    public final ILl1iII11Ll1 iiI1L1iI;
    public List<Proxy> iiIliillii = Collections.emptyList();
    public int iilLil1i11I1;
    public final C0042OoooOo0 il1LilLllii;
    public final iiIIl1I illlI1lLIL;

    public static final class iiI1L1iI {
        public int i1LIL11l = 0;
        public final List<o0OO0OoO> iiI1L1iI;

        public iiI1L1iI(List<o0OO0OoO> list) {
            this.iiI1L1iI = list;
        }

        public boolean i1LIL11l() {
            if (this.i1LIL11l < this.iiI1L1iI.size()) {
                return true;
            }
            return false;
        }

        public List<o0OO0OoO> iiI1L1iI() {
            return new ArrayList(this.iiI1L1iI);
        }

        public o0OO0OoO illlI1lLIL() {
            if (i1LIL11l()) {
                List<o0OO0OoO> list = this.iiI1L1iI;
                int i = this.i1LIL11l;
                this.i1LIL11l = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public o0OO0o00(ILl1iII11Ll1 iLl1iII11Ll1, C0397o0OOooO0 o0ooooo0, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0) {
        this.iiI1L1iI = iLl1iII11Ll1;
        this.i1LIL11l = o0ooooo0;
        this.illlI1lLIL = iiiil1i;
        this.il1LilLllii = ooooOo0;
        I11lLL1(iLl1iII11Ll1.iILiI1lll(), iLl1iII11Ll1.I11lLL1());
    }

    public static String iiI1L1iI(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    public final void I11lLL1(C0109o000oo00 o000oo00, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.iiIliillii = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.iiI1L1iI.IiIIlIL().select(o000oo00.IIllllLiIlIl());
            if (select == null || select.isEmpty()) {
                list = C0487o0OooooO.ILl1iII11Ll1(Proxy.NO_PROXY);
            } else {
                list = C0487o0OooooO.iiLIIiIli(select);
            }
            this.iiIliillii = list;
        }
        this.iilLil1i11I1 = 0;
    }

    public boolean i1LIL11l() {
        if (illlI1lLIL() || !this.iLLLILIiLi1Ii.isEmpty()) {
            return true;
        }
        return false;
    }

    public final Proxy iiIliillii() throws IOException {
        if (illlI1lLIL()) {
            List<Proxy> list = this.iiIliillii;
            int i = this.iilLil1i11I1;
            this.iilLil1i11I1 = i + 1;
            Proxy proxy = list.get(i);
            iilLil1i11I1(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.iiI1L1iI.iILiI1lll().iL1LIlIlI() + "; exhausted proxy configurations: " + this.iiIliillii);
    }

    public final void iilLil1i11I1(Proxy proxy) throws IOException {
        String str;
        int i;
        this.I11lLL1 = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.iiI1L1iI.iILiI1lll().iL1LIlIlI();
            i = this.iiI1L1iI.iILiI1lll().il1l1IlL();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = iiI1L1iI(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.I11lLL1.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.il1LilLllii.IiiL1llIIi(this.illlI1lLIL, str);
            List<InetAddress> iiI1L1iI2 = this.iiI1L1iI.illlI1lLIL().iiI1L1iI(str);
            if (!iiI1L1iI2.isEmpty()) {
                this.il1LilLllii.iilLiIIIi11i(this.illlI1lLIL, str, iiI1L1iI2);
                int size = iiI1L1iI2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.I11lLL1.add(new InetSocketAddress(iiI1L1iI2.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.iiI1L1iI.illlI1lLIL() + " returned no addresses for " + str);
        }
    }

    public iiI1L1iI il1LilLllii() throws IOException {
        if (i1LIL11l()) {
            ArrayList arrayList = new ArrayList();
            while (illlI1lLIL()) {
                Proxy iiIliillii2 = iiIliillii();
                int size = this.I11lLL1.size();
                for (int i = 0; i < size; i++) {
                    o0OO0OoO o0oo0ooo = new o0OO0OoO(this.iiI1L1iI, iiIliillii2, this.I11lLL1.get(i));
                    if (this.i1LIL11l.illlI1lLIL(o0oo0ooo)) {
                        this.iLLLILIiLi1Ii.add(o0oo0ooo);
                    } else {
                        arrayList.add(o0oo0ooo);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.iLLLILIiLi1Ii);
                this.iLLLILIiLi1Ii.clear();
            }
            return new iiI1L1iI(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final boolean illlI1lLIL() {
        if (this.iilLil1i11I1 < this.iiIliillii.size()) {
            return true;
        }
        return false;
    }
}
