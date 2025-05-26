package top.tntok.autobot;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o00oOo00  reason: case insensitive filesystem */
public class C0235o00oOo00 extends ProxySelector {
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
