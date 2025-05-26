package top.tntok.autobot;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: top.tntok.autobot.o00Oo0O0  reason: case insensitive filesystem */
public class C0155o00Oo0O0 extends C0292o0O0O0oO {
    public final Method I11lLL1;
    public final Class<?> IiIIlIL;
    public final Class<?> iLLLILIiLi1Ii;
    public final Method iiIliillii;
    public final Method iilLil1i11I1;

    /* renamed from: top.tntok.autobot.o00Oo0O0$iiI1L1iI */
    public static class iiI1L1iI implements InvocationHandler {
        public boolean i1LIL11l;
        public final List<String> iiI1L1iI;
        public String illlI1lLIL;

        public iiI1L1iI(List<String> list) {
            this.iiI1L1iI = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C0487o0OooooO.i1LIL11l;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.i1LIL11l = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.iiI1L1iI;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = (String) list.get(i);
                            if (this.iiI1L1iI.contains(str)) {
                                this.illlI1lLIL = str;
                                return str;
                            }
                        }
                        String str2 = this.iiI1L1iI.get(0);
                        this.illlI1lLIL = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.illlI1lLIL = (String) objArr[0];
                return null;
            }
        }
    }

    public C0155o00Oo0O0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.iiIliillii = method;
        this.iilLil1i11I1 = method2;
        this.I11lLL1 = method3;
        this.iLLLILIiLi1Ii = cls;
        this.IiIIlIL = cls2;
    }

    public static C0292o0O0O0oO iiiiI1iILL11I() {
        Class<SSLSocket> cls = SSLSocket.class;
        try {
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
            return new C0155o00Oo0O0(cls2.getMethod("put", new Class[]{cls, cls3}), cls2.getMethod("get", new Class[]{cls}), cls2.getMethod("remove", new Class[]{cls}), cls4, cls5);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        try {
            iiI1L1iI iii1l1ii = (iiI1L1iI) Proxy.getInvocationHandler(this.iilLil1i11I1.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = iii1l1ii.i1LIL11l;
            if (!z && iii1l1ii.illlI1lLIL == null) {
                C0292o0O0O0oO.I1iIiIi().iiLIIiIli(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return iii1l1ii.illlI1lLIL;
            }
        } catch (InvocationTargetException e) {
            e = e;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, String str, List<C0297o0O0Oo> list) {
        List<String> i1LIL11l = C0292o0O0O0oO.i1LIL11l(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C0292o0O0O0oO.class.getClassLoader(), new Class[]{this.iLLLILIiLi1Ii, this.IiIIlIL}, new iiI1L1iI(i1LIL11l));
            this.iiIliillii.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    public void iiI1L1iI(SSLSocket sSLSocket) {
        try {
            this.I11lLL1.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }
}
