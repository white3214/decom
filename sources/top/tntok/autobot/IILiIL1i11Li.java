package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
public class IILiIL1i11Li extends IIlLill {
    public IILiIL1i11Li(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @Nullable
    public static C0292o0O0O0oO I1I11Il1() {
        if (!C0292o0O0O0oO.Ii1liIIIiLi()) {
            return null;
        }
        try {
            if (IIlLill.i1iI1iiLL1() >= 29) {
                return new IILiIL1i11Li(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    public final void IIlL1llI1(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Nullable
    @IgnoreJRERequirement
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        String iiI1L1iI = sSLSocket.getApplicationProtocol();
        if (iiI1L1iI == null || iiI1L1iI.isEmpty()) {
            return null;
        }
        return iiI1L1iI;
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, String str, List<C0297o0O0Oo> list) throws IOException {
        try {
            IIlL1llI1(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C0292o0O0O0oO.i1LIL11l(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
