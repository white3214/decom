package top.tntok.autobot;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

public final class iLIililLI11 {
    public int i1LIL11l = 0;
    public final List<ILLiiL1ill1lI> iiI1L1iI;
    public boolean il1LilLllii;
    public boolean illlI1lLIL;

    public iLIililLI11(List<ILLiiL1ill1lI> list) {
        this.iiI1L1iI = list;
    }

    public boolean i1LIL11l(IOException iOException) {
        this.il1LilLllii = true;
        if (!this.illlI1lLIL || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }

    public ILLiiL1ill1lI iiI1L1iI(SSLSocket sSLSocket) throws IOException {
        ILLiiL1ill1lI iLLiiL1ill1lI;
        int i = this.i1LIL11l;
        int size = this.iiI1L1iI.size();
        while (true) {
            if (i >= size) {
                iLLiiL1ill1lI = null;
                break;
            }
            iLLiiL1ill1lI = this.iiI1L1iI.get(i);
            if (iLLiiL1ill1lI.illlI1lLIL(sSLSocket)) {
                this.i1LIL11l = i + 1;
                break;
            }
            i++;
        }
        if (iLLiiL1ill1lI != null) {
            this.illlI1lLIL = illlI1lLIL(sSLSocket);
            C0139o00OO00o.iiI1L1iI.illlI1lLIL(iLLiiL1ill1lI, sSLSocket, this.il1LilLllii);
            return iLLiiL1ill1lI;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.il1LilLllii + ", modes=" + this.iiI1L1iI + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean illlI1lLIL(SSLSocket sSLSocket) {
        for (int i = this.i1LIL11l; i < this.iiI1L1iI.size(); i++) {
            if (this.iiI1L1iI.get(i).illlI1lLIL(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
