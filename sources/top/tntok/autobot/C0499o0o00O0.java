package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

/* renamed from: top.tntok.autobot.o0o00O0  reason: case insensitive filesystem */
public abstract class C0499o0o00O0 {
    public final C0115o000ooo I11lLL1;
    public OutputStream i1LIL11l;
    public final C0338o0O0oooo iLLLILIiLi1Ii;
    public final InputStream iiI1L1iI;
    public C0373o0OOo00O iiIliillii = C0373o0OOo00O.UNCONNECTED;
    public boolean iilLil1i11I1 = true;
    public final List<C0502o0o00O0o> il1LilLllii = new LinkedList();
    public C0247o00oo0 illlI1lLIL = null;

    /* renamed from: top.tntok.autobot.o0o00O0$iiI1L1iI */
    public class iiI1L1iI extends C0338o0O0oooo {
        public iiI1L1iI(C0231o00oOOo o00oooo, String str, InputStream inputStream, long j) {
            super(o00oooo, str, inputStream, j);
        }

        public void i1L1llI1LlL1l(OutputStream outputStream) {
            OutputStream unused = C0499o0o00O0.this.i1LIL11l = outputStream;
            C0373o0OOo00O unused2 = C0499o0o00O0.this.iiIliillii = C0373o0OOo00O.CONNECTING;
            super.i1L1llI1LlL1l(outputStream);
            C0373o0OOo00O unused3 = C0499o0o00O0.this.iiIliillii = C0373o0OOo00O.OPEN;
            C0499o0o00O0.this.i111iLiiIIill();
            C0499o0o00O0.this.I1l1iIll1lIi1();
        }
    }

    public C0499o0o00O0(C0115o000ooo o000ooo) {
        iiI1L1iI iii1l1ii = new iiI1L1iI(C0376o0OOo0O0.SWITCH_PROTOCOL, (String) null, (InputStream) null, 0);
        this.iLLLILIiLi1Ii = iii1l1ii;
        this.I11lLL1 = o000ooo;
        this.iiI1L1iI = o000ooo.illlI1lLIL();
        if (this.iilLil1i11I1) {
            iii1l1ii.iL1lL1LL(false);
        }
        iii1l1ii.il1LilLllii("upgrade", C0223o00oO00o.i11liIIl11Ii1);
        iii1l1ii.il1LilLllii("connection", C0223o00oO00o.IliiLiLliIl);
    }

    public final void I11lLL1(I1lILLiiI1iI i1lILLiiI1iI, String str, boolean z) {
        if (this.iiIliillii != C0373o0OOo00O.CLOSED) {
            InputStream inputStream = this.iiI1L1iI;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    C0223o00oO00o.ILl1iII11Ll1.log(Level.FINE, "close failed", e);
                }
            }
            OutputStream outputStream = this.i1LIL11l;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    C0223o00oO00o.ILl1iII11Ll1.log(Level.FINE, "close failed", e2);
                }
            }
            this.iiIliillii = C0373o0OOo00O.CLOSED;
            i1L1lLllLLlIi(i1lILLiiI1iI, str, z);
        }
    }

    public boolean I1iIiIi() {
        if (this.iiIliillii == C0373o0OOo00O.OPEN) {
            return true;
        }
        return false;
    }

    public final void I1l1iIll1lIi1() {
        while (this.iiIliillii == C0373o0OOo00O.OPEN) {
            try {
                iILiI1lll(C0502o0o00O0o.IiiL1llIIi(this.iiI1L1iI));
            } catch (CharacterCodingException e) {
                IL1lILLLL1L(e);
                I11lLL1(I1lILLiiI1iI.InvalidFramePayloadData, e.toString(), false);
            } catch (IOException e2) {
                IL1lILLLL1L(e2);
                if (e2 instanceof C0501o0o00O0O) {
                    I11lLL1(((C0501o0o00O0O) e2).iiI1L1iI(), ((C0501o0o00O0O) e2).i1LIL11l(), false);
                }
            } catch (Throwable th) {
                I11lLL1(I1lILLiiI1iI.InternalServerError, "Handler terminated without closing the connection.", false);
                throw th;
            }
        }
        I11lLL1(I1lILLiiI1iI.InternalServerError, "Handler terminated without closing the connection.", false);
    }

    public abstract void IL1lILLLL1L(IOException iOException);

    public void ILl1iII11Ll1(byte[] bArr) throws IOException {
        i1iiLIil1ILi(new C0502o0o00O0o(C0247o00oo0.Binary, true, bArr));
    }

    public abstract void Ii1liIIIiLi(C0502o0o00O0o o0o00o0o);

    public C0338o0O0oooo IiIIlIL() {
        return this.iLLLILIiLi1Ii;
    }

    public final void IiiL1llIIi(C0502o0o00O0o o0o00o0o) throws IOException {
        if (o0o00o0o.iilLil1i11I1() != C0247o00oo0.Continuation) {
            if (this.illlI1lLIL == null) {
                this.illlI1lLIL = o0o00o0o.iilLil1i11I1();
                this.il1LilLllii.clear();
                this.il1LilLllii.add(o0o00o0o);
                return;
            }
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Previous continuous frame sequence not completed.");
        } else if (o0o00o0o.iLLLILIiLi1Ii()) {
            if (this.illlI1lLIL != null) {
                this.il1LilLllii.add(o0o00o0o);
                iL1LIlIlI(new C0502o0o00O0o(this.illlI1lLIL, this.il1LilLllii));
                this.illlI1lLIL = null;
                this.il1LilLllii.clear();
                return;
            }
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Continuous frame sequence was not started.");
        } else if (this.illlI1lLIL != null) {
            this.il1LilLllii.add(o0o00o0o);
        } else {
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Continuous frame sequence was not started.");
        }
    }

    public void IilL11ii1I1Il(byte[] bArr) throws IOException {
        i1iiLIil1ILi(new C0502o0o00O0o(C0247o00oo0.Ping, true, bArr));
    }

    public abstract void i111iLiiIIill();

    public abstract void i1L1lLllLLlIi(I1lILLiiI1iI i1lILLiiI1iI, String str, boolean z);

    public synchronized void i1iiLIil1ILi(C0502o0o00O0o o0o00o0o) throws IOException {
        iilLil1i11I1(o0o00o0o);
        o0o00o0o.iiLIIiIli(this.i1LIL11l);
    }

    public final void iILiI1lll(C0502o0o00O0o o0o00o0o) throws IOException {
        iiIliillii(o0o00o0o);
        if (o0o00o0o.iilLil1i11I1() == C0247o00oo0.Close) {
            iilLiIIIi11i(o0o00o0o);
        } else if (o0o00o0o.iilLil1i11I1() == C0247o00oo0.Ping) {
            i1iiLIil1ILi(new C0502o0o00O0o(C0247o00oo0.Pong, true, o0o00o0o.il1LilLllii()));
        } else if (o0o00o0o.iilLil1i11I1() == C0247o00oo0.Pong) {
            Ii1liIIIiLi(o0o00o0o);
        } else if (!o0o00o0o.iLLLILIiLi1Ii() || o0o00o0o.iilLil1i11I1() == C0247o00oo0.Continuation) {
            IiiL1llIIi(o0o00o0o);
        } else if (this.illlI1lLIL != null) {
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Continuous frame sequence not completed.");
        } else if (o0o00o0o.iilLil1i11I1() == C0247o00oo0.Text || o0o00o0o.iilLil1i11I1() == C0247o00oo0.Binary) {
            iL1LIlIlI(o0o00o0o);
        } else {
            throw new C0501o0o00O0O(I1lILLiiI1iI.ProtocolError, "Non control or continuous frame expected.");
        }
    }

    public abstract void iL1LIlIlI(C0502o0o00O0o o0o00o0o);

    public C0115o000ooo iLLLILIiLi1Ii() {
        return this.I11lLL1;
    }

    public void iiLIIiIli(String str) throws IOException {
        i1iiLIil1ILi(new C0502o0o00O0o(C0247o00oo0.Text, true, str));
    }

    public final void iilLiIIIi11i(C0502o0o00O0o o0o00o0o) throws IOException {
        String str;
        I1lILLiiI1iI i1lILLiiI1iI = I1lILLiiI1iI.NormalClosure;
        if (o0o00o0o instanceof ilILLiI1IIi) {
            ilILLiI1IIi ilillii1iii = (ilILLiI1IIi) o0o00o0o;
            i1lILLiiI1iI = ilillii1iii.i1iiLIil1ILi();
            str = ilillii1iii.i11liIIl11Ii1();
        } else {
            str = "";
        }
        if (this.iiIliillii == C0373o0OOo00O.CLOSING) {
            I11lLL1(i1lILLiiI1iI, str, false);
        } else {
            il1LilLllii(i1lILLiiI1iI, str, true);
        }
    }

    public void il1LilLllii(I1lILLiiI1iI i1lILLiiI1iI, String str, boolean z) throws IOException {
        C0373o0OOo00O o0ooo00o = this.iiIliillii;
        this.iiIliillii = C0373o0OOo00O.CLOSING;
        if (o0ooo00o == C0373o0OOo00O.OPEN) {
            i1iiLIil1ILi(new ilILLiI1IIi(i1lILLiiI1iI, str));
        } else {
            I11lLL1(i1lILLiiI1iI, str, z);
        }
    }

    public void iiIliillii(C0502o0o00O0o o0o00o0o) {
    }

    public void iilLil1i11I1(C0502o0o00O0o o0o00o0o) {
    }
}
