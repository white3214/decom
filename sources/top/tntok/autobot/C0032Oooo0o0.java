package top.tntok.autobot;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: top.tntok.autobot.Oooo0o0  reason: case insensitive filesystem */
public final /* synthetic */ class C0032Oooo0o0 {
    static {
        C0031Oooo0o oooo0o = C0031Oooo0o.iiI1L1iI;
    }

    public static /* synthetic */ List iiI1L1iI(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }
}
