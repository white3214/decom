package top.tntok.autobot;

import android.content.ComponentName;
import android.os.IInterface;
import android.service.notification.INotificationListener;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o00oOO  reason: case insensitive filesystem */
public class C0227o00oOO {
    public Method i1LIL11l;
    public final IInterface iiI1L1iI;
    public int iiIliillii;
    public Method il1LilLllii;
    public int illlI1lLIL;

    public C0227o00oOO(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public final Method i1LIL11l() throws NoSuchMethodException {
        if (this.il1LilLllii == null) {
            try {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("OJJj6dDZuNo3vWL+3NOQ1TqHZOXbxg==\n", "W/MNirW1+bY=\n"), new Class[]{String.class, Integer.TYPE});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return this.il1LilLllii;
    }

    public void iiI1L1iI(String str) {
        try {
            i1LIL11l().invoke(this.iiI1L1iI, this.illlI1lLIL != 0 ? new Object[]{str, 0} : new Object[]{str, 0});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("c+2YSfhMLLpEooRL6gMpsBDviFH0AyY=\n", "MILtJZxsQtU=\n"), e);
        }
    }

    public void il1LilLllii(INotificationListener iNotificationListener) {
        Object[] objArr;
        try {
            Method illlI1lLIL2 = illlI1lLIL();
            if (this.illlI1lLIL != 0) {
                objArr = new Object[]{iNotificationListener, new ComponentName(C0387o0OOoO0o.iiI1L1iI("RCGi1gRu1cJIJ6vWFmjU3Es=\n", "J07P+GUAsbA=\n"), getClass().getCanonicalName()), 0};
            } else {
                objArr = new Object[]{iNotificationListener, new ComponentName(C0387o0OOoO0o.iiI1L1iI("y+KHf7Huiz/H5I5/o+iKIcQ=\n", "qI3qUdCA700=\n"), getClass().getCanonicalName()), 0};
            }
            illlI1lLIL2.invoke(this.iiI1L1iI, objArr);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("2Q5llm7i+KnuQXmUfK39o7oMdY5irfI=\n", "mmEQ+grClsY=\n"), e);
        }
    }

    public final Method illlI1lLIL() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("OVfXKN4eik8HW8M1yASKTw==\n", "SzKwQa1q7z0=\n"), new Class[]{INotificationListener.class, ComponentName.class, Integer.TYPE});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return this.i1LIL11l;
    }
}
