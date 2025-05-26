package top.tntok.autobot;

import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class o0OO implements C0116o000ooo0<ServerSocket, IOException> {
    public String[] i1LIL11l;
    public SSLServerSocketFactory iiI1L1iI;

    public o0OO(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
        this.iiI1L1iI = sSLServerSocketFactory;
        this.i1LIL11l = strArr;
    }

    /* renamed from: i1LIL11l */
    public ServerSocket iiI1L1iI() throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.iiI1L1iI.createServerSocket();
        String[] strArr = this.i1LIL11l;
        if (strArr != null) {
            sSLServerSocket.setEnabledProtocols(strArr);
        } else {
            sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
        }
        sSLServerSocket.setUseClientMode(false);
        sSLServerSocket.setWantClientAuth(false);
        sSLServerSocket.setNeedClientAuth(false);
        return sSLServerSocket;
    }
}
