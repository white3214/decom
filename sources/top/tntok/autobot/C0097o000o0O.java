package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0100o000o0Oo;

/* renamed from: top.tntok.autobot.o000o0O  reason: case insensitive filesystem */
public final class C0097o000o0O implements Closeable {
    public static final int I1I11Il1 = 16777216;
    public static final ExecutorService I1IIIi1i1ILl = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0487o0OooooO.IILiIL1i11Li("OkHttp Http2Connection", true));
    public static final int IIlL1llI1 = 2;
    public static final int IL111l1 = 3;
    public static final /* synthetic */ boolean IilliIIIlI1ll = false;
    public static final int i1iI1iiLL1 = 1;
    public static final long il1l1IlL = 1000000000;
    public int I11lLL1;
    public long I1iIiIi = 0;
    public long I1l1iIll1lIi1;
    public long IL1lILLLL1L = 0;
    public final o0OOOO ILl1iII11Ll1;
    public long Ii1liIIIiLi = 0;
    public final ScheduledExecutorService IiIIlIL;
    public final C0308o0O0o00 IiiL1llIIi;
    public long IilL11ii1I1Il = 0;
    public final Set<Integer> IliiLiLliIl;
    public long i111iLiiIIill = 0;
    public final C0101o000o0o i11liIIl11Ii1;
    public long i1L1lLllLLlIi = 0;
    public final boolean i1LIL11l;
    public final Socket i1iiLIil1ILi;
    public long iILiI1lll = 0;
    public long iL1LIlIlI = 0;
    public boolean iLLLILIiLi1Ii;
    public final String iiIliillii;
    public o0OOOO iiLIIiIli = new o0OOOO();
    public final iILiI1lll iiiiI1iILL11I;
    public final ExecutorService iilLiIIIi11i;
    public int iilLil1i11I1;
    public final Map<Integer, C0102o000o0o0> il1LilLllii = new LinkedHashMap();
    public final iilLiIIIi11i illlI1lLIL;

    /* renamed from: top.tntok.autobot.o000o0O$I11lLL1 */
    public class I11lLL1 extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ C0039OoooOO0 illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public I11lLL1(String str, Object[] objArr, int i, C0039OoooOO0 ooooOO0) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = ooooOO0;
        }

        public void iILiI1lll() {
            C0097o000o0O.this.IiiL1llIIi.il1LilLllii(this.i1LIL11l, this.illlI1lLIL);
            synchronized (C0097o000o0O.this) {
                C0097o000o0O.this.IliiLiLliIl.remove(Integer.valueOf(this.i1LIL11l));
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$IiIIlIL */
    public final class IiIIlIL extends C0248o00oo000 {
        public IiIIlIL() {
            super("OkHttp %s ping", C0097o000o0O.this.iiIliillii);
        }

        public void iILiI1lll() {
            boolean z;
            synchronized (C0097o000o0O.this) {
                if (C0097o000o0O.this.I1iIiIi < C0097o000o0O.this.iILiI1lll) {
                    z = true;
                } else {
                    C0097o000o0O.IiIl11II(C0097o000o0O.this);
                    z = false;
                }
            }
            if (z) {
                C0097o000o0O.this.iIiL11iL((IOException) null);
            } else {
                C0097o000o0O.this.iillllIL(false, 1, 0);
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$IiiL1llIIi */
    public final class IiiL1llIIi extends C0248o00oo000 {
        public final boolean i1LIL11l;
        public final int il1LilLllii;
        public final int illlI1lLIL;

        public IiiL1llIIi(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C0097o000o0O.this.iiIliillii, Integer.valueOf(i), Integer.valueOf(i2));
            this.i1LIL11l = z;
            this.illlI1lLIL = i;
            this.il1LilLllii = i2;
        }

        public void iILiI1lll() {
            C0097o000o0O.this.iillllIL(this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii);
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$i1LIL11l */
    public class i1LIL11l extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ long illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i1LIL11l(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = j;
        }

        public void iILiI1lll() {
            try {
                C0097o000o0O.this.i11liIIl11Ii1.iILlLIlli(this.i1LIL11l, this.illlI1lLIL);
            } catch (IOException e) {
                C0097o000o0O.this.iIiL11iL(e);
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$iLLLILIiLi1Ii */
    public static class iLLLILIiLi1Ii {
        public boolean I11lLL1;
        public String i1LIL11l;
        public int iLLLILIiLi1Ii;
        public Socket iiI1L1iI;
        public iilLiIIIi11i iiIliillii = iilLiIIIi11i.iiI1L1iI;
        public C0308o0O0o00 iilLil1i11I1 = C0308o0O0o00.iiI1L1iI;
        public Iiii1LiI11i il1LilLllii;
        public ILL1iL1LiiI illlI1lLIL;

        public iLLLILIiLi1Ii(boolean z) {
            this.I11lLL1 = z;
        }

        public iLLLILIiLi1Ii i1LIL11l(iilLiIIIi11i iilliiiii11i) {
            this.iiIliillii = iilliiiii11i;
            return this;
        }

        public C0097o000o0O iiI1L1iI() {
            return new C0097o000o0O(this);
        }

        public iLLLILIiLi1Ii iiIliillii(Socket socket) throws IOException {
            String str;
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress instanceof InetSocketAddress) {
                str = ((InetSocketAddress) remoteSocketAddress).getHostName();
            } else {
                str = remoteSocketAddress.toString();
            }
            return iilLil1i11I1(socket, str, C0249o00oo00O.il1LilLllii(C0249o00oo00O.i1L1lLllLLlIi(socket)), C0249o00oo00O.illlI1lLIL(C0249o00oo00O.IiIIlIL(socket)));
        }

        public iLLLILIiLi1Ii iilLil1i11I1(Socket socket, String str, ILL1iL1LiiI iLL1iL1LiiI, Iiii1LiI11i iiii1LiI11i) {
            this.iiI1L1iI = socket;
            this.i1LIL11l = str;
            this.illlI1lLIL = iLL1iL1LiiI;
            this.il1LilLllii = iiii1LiI11i;
            return this;
        }

        public iLLLILIiLi1Ii il1LilLllii(C0308o0O0o00 o0o0o00) {
            this.iilLil1i11I1 = o0o0o00;
            return this;
        }

        public iLLLILIiLi1Ii illlI1lLIL(int i) {
            this.iLLLILIiLi1Ii = i;
            return this;
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$iiI1L1iI */
    public class iiI1L1iI extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ C0039OoooOO0 illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiI1L1iI(String str, Object[] objArr, int i, C0039OoooOO0 ooooOO0) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = ooooOO0;
        }

        public void iILiI1lll() {
            try {
                C0097o000o0O.this.I11lLL1L11Lil(this.i1LIL11l, this.illlI1lLIL);
            } catch (IOException e) {
                C0097o000o0O.this.iIiL11iL(e);
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$iiIliillii */
    public class iiIliillii extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ boolean il1LilLllii;
        public final /* synthetic */ List illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiIliillii(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = list;
            this.il1LilLllii = z;
        }

        public void iILiI1lll() {
            boolean i1LIL11l2 = C0097o000o0O.this.IiiL1llIIi.i1LIL11l(this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii);
            if (i1LIL11l2) {
                try {
                    C0097o000o0O.this.i11liIIl11Ii1.iiLl11ILL(this.i1LIL11l, C0039OoooOO0.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (i1LIL11l2 || this.il1LilLllii) {
                synchronized (C0097o000o0O.this) {
                    C0097o000o0O.this.IliiLiLliIl.remove(Integer.valueOf(this.i1LIL11l));
                }
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$iilLil1i11I1 */
    public class iilLil1i11I1 extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ boolean iiIliillii;
        public final /* synthetic */ int il1LilLllii;
        public final /* synthetic */ IiILIlLLiIL illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iilLil1i11I1(String str, Object[] objArr, int i, IiILIlLLiIL iiILIlLLiIL, int i2, boolean z) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = iiILIlLLiIL;
            this.il1LilLllii = i2;
            this.iiIliillii = z;
        }

        public void iILiI1lll() {
            try {
                boolean illlI1lLIL2 = C0097o000o0O.this.IiiL1llIIi.illlI1lLIL(this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii);
                if (illlI1lLIL2) {
                    C0097o000o0O.this.i11liIIl11Ii1.iiLl11ILL(this.i1LIL11l, C0039OoooOO0.CANCEL);
                }
                if (illlI1lLIL2 || this.iiIliillii) {
                    synchronized (C0097o000o0O.this) {
                        C0097o000o0O.this.IliiLiLliIl.remove(Integer.valueOf(this.i1LIL11l));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$il1LilLllii */
    public class il1LilLllii extends C0248o00oo000 {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ List illlI1lLIL;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public il1LilLllii(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.i1LIL11l = i;
            this.illlI1lLIL = list;
        }

        public void iILiI1lll() {
            if (C0097o000o0O.this.IiiL1llIIi.iiI1L1iI(this.i1LIL11l, this.illlI1lLIL)) {
                try {
                    C0097o000o0O.this.i11liIIl11Ii1.iiLl11ILL(this.i1LIL11l, C0039OoooOO0.CANCEL);
                    synchronized (C0097o000o0O.this) {
                        C0097o000o0O.this.IliiLiLliIl.remove(Integer.valueOf(this.i1LIL11l));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$illlI1lLIL */
    public class illlI1lLIL extends C0248o00oo000 {
        public illlI1lLIL(String str, Object... objArr) {
            super(str, objArr);
        }

        public void iILiI1lll() {
            C0097o000o0O.this.iillllIL(false, 2, 0);
        }
    }

    public C0097o000o0O(iLLLILIiLi1Ii illliliili1ii) {
        int i;
        iLLLILIiLi1Ii illliliili1ii2 = illliliili1ii;
        o0OOOO o0oooo = new o0OOOO();
        this.ILl1iII11Ll1 = o0oooo;
        this.IliiLiLliIl = new LinkedHashSet();
        this.IiiL1llIIi = illliliili1ii2.iilLil1i11I1;
        boolean z = illliliili1ii2.I11lLL1;
        this.i1LIL11l = z;
        this.illlI1lLIL = illliliili1ii2.iiIliillii;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.I11lLL1 = i;
        if (z) {
            this.I11lLL1 = i + 2;
        }
        if (z) {
            this.iiLIIiIli.IiiL1llIIi(7, I1I11Il1);
        }
        String str = illliliili1ii2.i1LIL11l;
        this.iiIliillii = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C0487o0OooooO.IILiIL1i11Li(C0487o0OooooO.Ii1liIIIiLi("OkHttp %s Writer", str), false));
        this.IiIIlIL = scheduledThreadPoolExecutor;
        if (illliliili1ii2.iLLLILIiLi1Ii != 0) {
            IiIIlIL iiIIlIL = new IiIIlIL();
            int i2 = illliliili1ii2.iLLLILIiLi1Ii;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iiIIlIL, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.iilLiIIIi11i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0487o0OooooO.IILiIL1i11Li(C0487o0OooooO.Ii1liIIIiLi("OkHttp %s Push Observer", str), true));
        o0oooo.IiiL1llIIi(7, 65535);
        o0oooo.IiiL1llIIi(5, 16384);
        this.I1l1iIll1lIi1 = (long) o0oooo.iiIliillii();
        this.i1iiLIil1ILi = illliliili1ii2.iiI1L1iI;
        this.i11liIIl11Ii1 = new C0101o000o0o(illliliili1ii2.il1LilLllii, z);
        this.iiiiI1iILL11I = new iILiI1lll(new C0100o000o0Oo(illliliili1ii2.illlI1lLIL, z));
    }

    public static /* synthetic */ long I1lLLLlliILlI(C0097o000o0O o000o0o) {
        long j = o000o0o.IL1lILLLL1L;
        o000o0o.IL1lILLLL1L = 1 + j;
        return j;
    }

    public static /* synthetic */ long IiIl11II(C0097o000o0O o000o0o) {
        long j = o000o0o.iILiI1lll;
        o000o0o.iILiI1lll = 1 + j;
        return j;
    }

    public static /* synthetic */ long iiLl11ILL(C0097o000o0O o000o0o) {
        long j = o000o0o.i111iLiiIIill;
        o000o0o.i111iLiiIIill = 1 + j;
        return j;
    }

    public static /* synthetic */ long il1LilLllii(C0097o000o0O o000o0o) {
        long j = o000o0o.I1iIiIi;
        o000o0o.I1iIiIi = 1 + j;
        return j;
    }

    public void I11iLiiIi(int i, C0039OoooOO0 ooooOO0) {
        IIlLLll1ll1(new I11lLL1("OkHttp %s Push Reset[%s]", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, ooooOO0));
    }

    public void I11lLL1L11Lil(int i, C0039OoooOO0 ooooOO0) throws IOException {
        this.i11liIIl11Ii1.iiLl11ILL(i, ooooOO0);
    }

    public synchronized C0102o000o0o0 I1IILIil1lLlL(int i) {
        return this.il1LilLllii.get(Integer.valueOf(i));
    }

    public boolean I1ILilil1I(int i) {
        if (i == 0 || (i & 1) != 0) {
            return false;
        }
        return true;
    }

    public void I1llIillii1(int i, List<C0090o000Ooo0> list, boolean z) {
        try {
            IIlLLll1ll1(new iiIliillii("OkHttp %s Push Headers[%s]", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    public C0102o000o0o0 II1l1IliI1Li1(List<C0090o000Ooo0> list, boolean z) throws IOException {
        return i1L1llI1LlL1l(0, list, z);
    }

    public final synchronized void IIlLLll1ll1(C0248o00oo000 o00oo000) {
        if (!this.iLLLILIiLi1Ii) {
            this.iilLiIIIi11i.execute(o00oo000);
        }
    }

    public synchronized void IL11lll11() throws InterruptedException {
        while (this.i111iLiiIIill < this.iL1LIlIlI) {
            wait();
        }
    }

    public void ILI1Iil1li(int i, long j) {
        try {
            this.IiIIlIL.execute(new i1LIL11l("OkHttp Window Update %s stream %d", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public synchronized int ILIiLLLL1iiii() {
        return this.ILl1iII11Ll1.iilLil1i11I1(Integer.MAX_VALUE);
    }

    public synchronized C0102o000o0o0 IiL1llLiil1(int i) {
        C0102o000o0o0 remove;
        remove = this.il1LilLllii.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void IlLLlIi1iI1li(boolean z) throws IOException {
        if (z) {
            this.i11liIIl11Ii1.i1LIL11l();
            this.i11liIIl11Ii1.IL11lll11(this.iiLIIiIli);
            int iiIliillii2 = this.iiLIIiIli.iiIliillii();
            if (iiIliillii2 != 65535) {
                this.i11liIIl11Ii1.iILlLIlli(0, (long) (iiIliillii2 - 65535));
            }
        }
        new Thread(this.iiiiI1iILL11I).start();
    }

    public void Ilili11iLIl(C0039OoooOO0 ooooOO0) throws IOException {
        synchronized (this.i11liIIl11Ii1) {
            synchronized (this) {
                if (!this.iLLLILIiLi1Ii) {
                    this.iLLLILIiLi1Ii = true;
                    int i = this.iilLil1i11I1;
                    this.i11liIIl11Ii1.I1LiILiLLIl1l(i, ooooOO0, C0487o0OooooO.iiI1L1iI);
                }
            }
        }
    }

    public void close() {
        iILlLIlli(C0039OoooOO0.NO_ERROR, C0039OoooOO0.CANCEL, (IOException) null);
    }

    public void flush() throws IOException {
        this.i11liIIl11Ii1.flush();
    }

    public synchronized int i11iLLllliI() {
        return this.il1LilLllii.size();
    }

    public void i1IL1lILl1L1I(o0OOOO o0oooo) throws IOException {
        synchronized (this.i11liIIl11Ii1) {
            synchronized (this) {
                if (!this.iLLLILIiLi1Ii) {
                    this.iiLIIiIli.iilLiIIIi11i(o0oooo);
                } else {
                    throw new IliiLiLi();
                }
            }
            this.i11liIIl11Ii1.IL11lll11(o0oooo);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[Catch:{ all -> 0x0013, all -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final top.tntok.autobot.C0102o000o0o0 i1L1llI1LlL1l(int r11, java.util.List<top.tntok.autobot.C0090o000Ooo0> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            top.tntok.autobot.o000o0o r7 = r10.i11liIIl11Ii1
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0056 }
            int r0 = r10.I11lLL1     // Catch:{ all -> 0x0013 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0015
            top.tntok.autobot.OoooOO0 r0 = top.tntok.autobot.C0039OoooOO0.REFUSED_STREAM     // Catch:{ all -> 0x0013 }
            r10.Ilili11iLIl(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            r11 = move-exception
            goto L_0x0078
        L_0x0015:
            boolean r0 = r10.iLLLILIiLi1Ii     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0072
            int r8 = r10.I11lLL1     // Catch:{ all -> 0x0013 }
            int r0 = r8 + 2
            r10.I11lLL1 = r0     // Catch:{ all -> 0x0013 }
            top.tntok.autobot.o000o0o0 r9 = new top.tntok.autobot.o000o0o0     // Catch:{ all -> 0x0013 }
            r5 = 0
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0013 }
            if (r13 == 0) goto L_0x003d
            long r0 = r10.I1l1iIll1lIi1     // Catch:{ all -> 0x0013 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003d
            long r0 = r9.i1LIL11l     // Catch:{ all -> 0x0013 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r13 = 0
            goto L_0x003e
        L_0x003d:
            r13 = 1
        L_0x003e:
            boolean r0 = r9.i1L1lLllLLlIi()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x004d
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r0 = r10.il1LilLllii     // Catch:{ all -> 0x0013 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0013 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0013 }
        L_0x004d:
            monitor-exit(r10)     // Catch:{ all -> 0x0013 }
            if (r11 != 0) goto L_0x0058
            top.tntok.autobot.o000o0o r11 = r10.i11liIIl11Ii1     // Catch:{ all -> 0x0056 }
            r11.ilLIlL1ILi(r6, r8, r12)     // Catch:{ all -> 0x0056 }
            goto L_0x0061
        L_0x0056:
            r11 = move-exception
            goto L_0x007a
        L_0x0058:
            boolean r0 = r10.i1LIL11l     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x006a
            top.tntok.autobot.o000o0o r0 = r10.i11liIIl11Ii1     // Catch:{ all -> 0x0056 }
            r0.I1lLLLlliILlI(r11, r8, r12)     // Catch:{ all -> 0x0056 }
        L_0x0061:
            monitor-exit(r7)     // Catch:{ all -> 0x0056 }
            if (r13 == 0) goto L_0x0069
            top.tntok.autobot.o000o0o r11 = r10.i11liIIl11Ii1
            r11.flush()
        L_0x0069:
            return r9
        L_0x006a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0056 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0056 }
            throw r11     // Catch:{ all -> 0x0056 }
        L_0x0072:
            top.tntok.autobot.IliiLiLi r11 = new top.tntok.autobot.IliiLiLi     // Catch:{ all -> 0x0013 }
            r11.<init>()     // Catch:{ all -> 0x0013 }
            throw r11     // Catch:{ all -> 0x0013 }
        L_0x0078:
            monitor-exit(r10)     // Catch:{ all -> 0x0013 }
            throw r11     // Catch:{ all -> 0x0056 }
        L_0x007a:
            monitor-exit(r7)     // Catch:{ all -> 0x0056 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0097o000o0O.i1L1llI1LlL1l(int, java.util.List, boolean):top.tntok.autobot.o000o0o0");
    }

    public C0102o000o0o0 i1LlL1iILLLil(int i, List<C0090o000Ooo0> list, boolean z) throws IOException {
        if (!this.i1LIL11l) {
            return i1L1llI1LlL1l(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public void iILil1IilI1l() {
        synchronized (this) {
            this.iL1LIlIlI++;
        }
        iillllIL(false, 3, 1330343787);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:(2:0|1)|3|(2:13|(5:15|16|17|33|18))|20|21|22|23|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iILlLIlli(top.tntok.autobot.C0039OoooOO0 r4, top.tntok.autobot.C0039OoooOO0 r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            r3.Ilili11iLIl(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r4 = r3.il1LilLllii     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r4 != 0) goto L_0x0028
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r4 = r3.il1LilLllii     // Catch:{ all -> 0x0026 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r0 = r3.il1LilLllii     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            top.tntok.autobot.o000o0o0[] r0 = new top.tntok.autobot.C0102o000o0o0[r0]     // Catch:{ all -> 0x0026 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0026 }
            top.tntok.autobot.o000o0o0[] r4 = (top.tntok.autobot.C0102o000o0o0[]) r4     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r0 = r3.il1LilLllii     // Catch:{ all -> 0x0026 }
            r0.clear()     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r4 = move-exception
            goto L_0x004d
        L_0x0028:
            r4 = 0
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0038
            int r0 = r4.length
            r1 = 0
        L_0x002e:
            if (r1 >= r0) goto L_0x0038
            r2 = r4[r1]
            r2.il1LilLllii(r5, r6)     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0038:
            top.tntok.autobot.o000o0o r4 = r3.i11liIIl11Ii1     // Catch:{ IOException -> 0x003d }
            r4.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            java.net.Socket r4 = r3.i1iiLIil1ILi     // Catch:{ IOException -> 0x0042 }
            r4.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            java.util.concurrent.ScheduledExecutorService r4 = r3.IiIIlIL
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.iilLiIIIi11i
            r4.shutdown()
            return
        L_0x004d:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0097o000o0O.iILlLIlli(top.tntok.autobot.OoooOO0, top.tntok.autobot.OoooOO0, java.io.IOException):void");
    }

    public final void iIiL11iL(@Nullable IOException iOException) {
        C0039OoooOO0 ooooOO0 = C0039OoooOO0.PROTOCOL_ERROR;
        iILlLIlli(ooooOO0, ooooOO0, iOException);
    }

    public void iL1lL1LL() {
        synchronized (this) {
            try {
                long j = this.IL1lILLLL1L;
                long j2 = this.i1L1lLllLLlIi;
                if (j >= j2) {
                    this.i1L1lLllLLlIi = j2 + 1;
                    this.Ii1liIIIiLi = System.nanoTime() + il1l1IlL;
                    try {
                        this.IiIIlIL.execute(new illlI1lLIL("OkHttp %s ping", this.iiIliillii));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void iLLi1LIi(int i, boolean z, List<C0090o000Ooo0> list) throws IOException {
        this.i11liIIl11Ii1.ilLIlL1ILi(z, i, list);
    }

    public void iLLlLIIliLl(int i, C0039OoooOO0 ooooOO0) {
        try {
            this.IiIIlIL.execute(new iiI1L1iI("OkHttp %s stream %d", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, ooooOO0));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void iLlI1iL1lIIL(int i, List<C0090o000Ooo0> list) {
        synchronized (this) {
            try {
                if (this.IliiLiLliIl.contains(Integer.valueOf(i))) {
                    iLLlLIIliLl(i, C0039OoooOO0.PROTOCOL_ERROR);
                    return;
                }
                this.IliiLiLliIl.add(Integer.valueOf(i));
                try {
                    IIlLLll1ll1(new il1LilLllii("OkHttp %s Push Request[%s]", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void iiIiili() throws InterruptedException {
        iILil1IilI1l();
        IL11lll11();
    }

    public void iiL1l1iLliL() throws IOException {
        IlLLlIi1iI1li(true);
    }

    public void iillllIL(boolean z, int i, int i2) {
        try {
            this.i11liIIl11Ii1.ilIILlI1l11i(z, i, i2);
        } catch (IOException e) {
            iIiL11iL(e);
        }
    }

    public synchronized void il11iII1(long j) {
        long j2 = this.IilL11ii1I1Il + j;
        this.IilL11ii1I1Il = j2;
        if (j2 >= ((long) (this.iiLIIiIli.iiIliillii() / 2))) {
            ILI1Iil1li(0, this.IilL11ii1I1Il);
            this.IilL11ii1I1Il = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean ilLIlLiIILl1(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.iLLLILIiLi1Ii     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.IL1lILLLL1L     // Catch:{ all -> 0x0018 }
            long r4 = r6.i1L1lLllLLlIi     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.Ii1liIIIiLi     // Catch:{ all -> 0x0018 }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0097o000o0O.ilLIlLiIILl1(long):boolean");
    }

    public void ilLilIL(int i, ILL1iL1LiiI iLL1iL1LiiI, int i2, boolean z) throws IOException {
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        long j = (long) i2;
        iLL1iL1LiiI.IIIlll1lll(j);
        iLL1iL1LiiI.IIlllIIi1ii(iiILIlLLiIL, j);
        if (iiILIlLLiIL.iLLi1LIi() == j) {
            IIlLLll1ll1(new iilLil1i11I1("OkHttp %s Push Data[%s]", new Object[]{this.iiIliillii, Integer.valueOf(i)}, i, iiILIlLLiIL, i2, z));
            return;
        }
        throw new IOException(iiILIlLLiIL.iLLi1LIi() + " != " + i2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.i11liIIl11Ii1.IIL1Ll1I111());
        r6 = (long) r3;
        r8.I1l1iIll1lIi1 -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iliiI1Ii1iIl(int r9, boolean r10, top.tntok.autobot.IiILIlLLiIL r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            top.tntok.autobot.o000o0o r12 = r8.i11liIIl11Ii1
            r12.il1LilLllii(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.I1l1iIll1lIi1     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0032
            java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r3 = r8.il1LilLllii     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            r9 = move-exception
            goto L_0x0065
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0032:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0028 }
            int r4 = (int) r3     // Catch:{ all -> 0x0028 }
            top.tntok.autobot.o000o0o r3 = r8.i11liIIl11Ii1     // Catch:{ all -> 0x0028 }
            int r3 = r3.IIL1Ll1I111()     // Catch:{ all -> 0x0028 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0028 }
            long r4 = r8.I1l1iIll1lIi1     // Catch:{ all -> 0x0028 }
            long r6 = (long) r3     // Catch:{ all -> 0x0028 }
            long r4 = r4 - r6
            r8.I1l1iIll1lIi1 = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            long r12 = r12 - r6
            top.tntok.autobot.o000o0o r4 = r8.i11liIIl11Ii1
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.il1LilLllii(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0028 }
            r9.interrupt()     // Catch:{ all -> 0x0028 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0028 }
            r9.<init>()     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0097o000o0O.iliiI1Ii1iIl(int, boolean, top.tntok.autobot.IiILIlLLiIL, long):void");
    }

    /* renamed from: top.tntok.autobot.o000o0O$iILiI1lll */
    public class iILiI1lll extends C0248o00oo000 implements C0100o000o0Oo.i1LIL11l {
        public final C0100o000o0Oo i1LIL11l;

        /* renamed from: top.tntok.autobot.o000o0O$iILiI1lll$i1LIL11l */
        public class i1LIL11l extends C0248o00oo000 {
            public final /* synthetic */ boolean i1LIL11l;
            public final /* synthetic */ o0OOOO illlI1lLIL;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public i1LIL11l(String str, Object[] objArr, boolean z, o0OOOO o0oooo) {
                super(str, objArr);
                this.i1LIL11l = z;
                this.illlI1lLIL = o0oooo;
            }

            public void iILiI1lll() {
                iILiI1lll.this.I1iIiIi(this.i1LIL11l, this.illlI1lLIL);
            }
        }

        /* renamed from: top.tntok.autobot.o000o0O$iILiI1lll$iiI1L1iI */
        public class iiI1L1iI extends C0248o00oo000 {
            public final /* synthetic */ C0102o000o0o0 i1LIL11l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public iiI1L1iI(String str, Object[] objArr, C0102o000o0o0 o000o0o0) {
                super(str, objArr);
                this.i1LIL11l = o000o0o0;
            }

            public void iILiI1lll() {
                try {
                    C0097o000o0O.this.illlI1lLIL.iilLil1i11I1(this.i1LIL11l);
                } catch (IOException e) {
                    C0292o0O0O0oO I1iIiIi = C0292o0O0O0oO.I1iIiIi();
                    I1iIiIi.iiLIIiIli(4, "Http2Connection.Listener failure for " + C0097o000o0O.this.iiIliillii, e);
                    try {
                        this.i1LIL11l.il1LilLllii(C0039OoooOO0.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: top.tntok.autobot.o000o0O$iILiI1lll$illlI1lLIL */
        public class illlI1lLIL extends C0248o00oo000 {
            public illlI1lLIL(String str, Object... objArr) {
                super(str, objArr);
            }

            public void iILiI1lll() {
                C0097o000o0O o000o0o = C0097o000o0O.this;
                o000o0o.illlI1lLIL.iiIliillii(o000o0o);
            }
        }

        public iILiI1lll(C0100o000o0Oo o000o0oo) {
            super("OkHttp %s", C0097o000o0O.this.iiIliillii);
            this.i1LIL11l = o000o0oo;
        }

        /* JADX WARNING: type inference failed for: r4v12, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void I1iIiIi(boolean r7, top.tntok.autobot.o0OOOO r8) {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                top.tntok.autobot.o000o0O r2 = top.tntok.autobot.C0097o000o0O.this
                top.tntok.autobot.o000o0o r2 = r2.i11liIIl11Ii1
                monitor-enter(r2)
                top.tntok.autobot.o000o0O r3 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x0067 }
                monitor-enter(r3)     // Catch:{ all -> 0x0067 }
                top.tntok.autobot.o000o0O r4 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o0OOOO r4 = r4.ILl1iII11Ll1     // Catch:{ all -> 0x001c }
                int r4 = r4.iiIliillii()     // Catch:{ all -> 0x001c }
                if (r7 == 0) goto L_0x001f
                top.tntok.autobot.o000o0O r7 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o0OOOO r7 = r7.ILl1iII11Ll1     // Catch:{ all -> 0x001c }
                r7.iiI1L1iI()     // Catch:{ all -> 0x001c }
                goto L_0x001f
            L_0x001c:
                r7 = move-exception
                goto L_0x0099
            L_0x001f:
                top.tntok.autobot.o000o0O r7 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o0OOOO r7 = r7.ILl1iII11Ll1     // Catch:{ all -> 0x001c }
                r7.iilLiIIIi11i(r8)     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o000o0O r7 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o0OOOO r7 = r7.ILl1iII11Ll1     // Catch:{ all -> 0x001c }
                int r7 = r7.iiIliillii()     // Catch:{ all -> 0x001c }
                r8 = -1
                r5 = 0
                if (r7 == r8) goto L_0x005a
                if (r7 == r4) goto L_0x005a
                int r7 = r7 - r4
                long r7 = (long) r7     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o000o0O r4 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r4 = r4.il1LilLllii     // Catch:{ all -> 0x001c }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x001c }
                if (r4 != 0) goto L_0x005c
                top.tntok.autobot.o000o0O r4 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r4 = r4.il1LilLllii     // Catch:{ all -> 0x001c }
                java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o000o0O r5 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x001c }
                java.util.Map<java.lang.Integer, top.tntok.autobot.o000o0o0> r5 = r5.il1LilLllii     // Catch:{ all -> 0x001c }
                int r5 = r5.size()     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o000o0o0[] r5 = new top.tntok.autobot.C0102o000o0o0[r5]     // Catch:{ all -> 0x001c }
                java.lang.Object[] r4 = r4.toArray(r5)     // Catch:{ all -> 0x001c }
                r5 = r4
                top.tntok.autobot.o000o0o0[] r5 = (top.tntok.autobot.C0102o000o0o0[]) r5     // Catch:{ all -> 0x001c }
                goto L_0x005c
            L_0x005a:
                r7 = 0
            L_0x005c:
                monitor-exit(r3)     // Catch:{ all -> 0x001c }
                top.tntok.autobot.o000o0O r3 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ IOException -> 0x0069 }
                top.tntok.autobot.o000o0o r4 = r3.i11liIIl11Ii1     // Catch:{ IOException -> 0x0069 }
                top.tntok.autobot.o0OOOO r3 = r3.ILl1iII11Ll1     // Catch:{ IOException -> 0x0069 }
                r4.iiI1L1iI(r3)     // Catch:{ IOException -> 0x0069 }
                goto L_0x006f
            L_0x0067:
                r7 = move-exception
                goto L_0x009b
            L_0x0069:
                r3 = move-exception
                top.tntok.autobot.o000o0O r4 = top.tntok.autobot.C0097o000o0O.this     // Catch:{ all -> 0x0067 }
                r4.iIiL11iL(r3)     // Catch:{ all -> 0x0067 }
            L_0x006f:
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                if (r5 == 0) goto L_0x0082
                int r2 = r5.length
                r3 = 0
            L_0x0074:
                if (r3 >= r2) goto L_0x0082
                r4 = r5[r3]
                monitor-enter(r4)
                r4.iiI1L1iI(r7)     // Catch:{ all -> 0x007f }
                monitor-exit(r4)     // Catch:{ all -> 0x007f }
                int r3 = r3 + r0
                goto L_0x0074
            L_0x007f:
                r7 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x007f }
                throw r7
            L_0x0082:
                java.util.concurrent.ExecutorService r7 = top.tntok.autobot.C0097o000o0O.I1IIIi1i1ILl
                top.tntok.autobot.o000o0O$iILiI1lll$illlI1lLIL r8 = new top.tntok.autobot.o000o0O$iILiI1lll$illlI1lLIL
                java.lang.String r2 = "OkHttp %s settings"
                top.tntok.autobot.o000o0O r3 = top.tntok.autobot.C0097o000o0O.this
                java.lang.String r3 = r3.iiIliillii
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r1] = r3
                r8.<init>(r2, r0)
                r7.execute(r8)
                return
            L_0x0099:
                monitor-exit(r3)     // Catch:{ all -> 0x001c }
                throw r7     // Catch:{ all -> 0x0067 }
            L_0x009b:
                monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0097o000o0O.iILiI1lll.I1iIiIi(boolean, top.tntok.autobot.o0OOOO):void");
        }

        public void IiiL1llIIi(int i, long j) {
            if (i == 0) {
                synchronized (C0097o000o0O.this) {
                    C0097o000o0O o000o0o = C0097o000o0O.this;
                    o000o0o.I1l1iIll1lIi1 += j;
                    o000o0o.notifyAll();
                }
                return;
            }
            C0102o000o0o0 I1IILIil1lLlL = C0097o000o0O.this.I1IILIil1lLlL(i);
            if (I1IILIil1lLlL != null) {
                synchronized (I1IILIil1lLlL) {
                    I1IILIil1lLlL.iiI1L1iI(j);
                }
            }
        }

        public void i1LIL11l(boolean z, int i, int i2, List<C0090o000Ooo0> list) {
            if (C0097o000o0O.this.I1ILilil1I(i)) {
                C0097o000o0O.this.I1llIillii1(i, list, z);
                return;
            }
            synchronized (C0097o000o0O.this) {
                try {
                    C0102o000o0o0 I1IILIil1lLlL = C0097o000o0O.this.I1IILIil1lLlL(i);
                    if (I1IILIil1lLlL != null) {
                        I1IILIil1lLlL.i111iLiiIIill(C0487o0OooooO.iliilLllIl1(list), z);
                    } else if (!C0097o000o0O.this.iLLLILIiLi1Ii) {
                        C0097o000o0O o000o0o = C0097o000o0O.this;
                        if (i > o000o0o.iilLil1i11I1) {
                            if (i % 2 != o000o0o.I11lLL1 % 2) {
                                int i3 = i;
                                C0102o000o0o0 o000o0o0 = new C0102o000o0o0(i3, C0097o000o0O.this, false, z, C0487o0OooooO.iliilLllIl1(list));
                                C0097o000o0O o000o0o2 = C0097o000o0O.this;
                                o000o0o2.iilLil1i11I1 = i;
                                o000o0o2.il1LilLllii.put(Integer.valueOf(i), o000o0o0);
                                C0097o000o0O.I1IIIi1i1ILl.execute(new iiI1L1iI("OkHttp %s stream %d", new Object[]{C0097o000o0O.this.iiIliillii, Integer.valueOf(i)}, o000o0o0));
                            }
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }

        public void iILiI1lll() {
            C0039OoooOO0 ooooOO0;
            C0039OoooOO0 ooooOO02 = C0039OoooOO0.INTERNAL_ERROR;
            e = null;
            try {
                this.i1LIL11l.il1LilLllii(this);
                while (this.i1LIL11l.i1LIL11l(false, this)) {
                }
                ooooOO0 = C0039OoooOO0.NO_ERROR;
                try {
                    C0097o000o0O.this.iILlLIlli(ooooOO0, C0039OoooOO0.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C0039OoooOO0 ooooOO03 = C0039OoooOO0.PROTOCOL_ERROR;
                        C0097o000o0O.this.iILlLIlli(ooooOO03, ooooOO03, e);
                        C0487o0OooooO.I11lLL1(this.i1LIL11l);
                    } catch (Throwable th) {
                        th = th;
                        C0097o000o0O.this.iILlLIlli(ooooOO0, ooooOO02, e);
                        C0487o0OooooO.I11lLL1(this.i1LIL11l);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                ooooOO0 = ooooOO02;
                C0039OoooOO0 ooooOO032 = C0039OoooOO0.PROTOCOL_ERROR;
                C0097o000o0O.this.iILlLIlli(ooooOO032, ooooOO032, e);
                C0487o0OooooO.I11lLL1(this.i1LIL11l);
            } catch (Throwable th2) {
                th = th2;
                ooooOO0 = ooooOO02;
                C0097o000o0O.this.iILlLIlli(ooooOO0, ooooOO02, e);
                C0487o0OooooO.I11lLL1(this.i1LIL11l);
                throw th;
            }
            C0487o0OooooO.I11lLL1(this.i1LIL11l);
        }

        public void iLLLILIiLi1Ii(boolean z, int i, ILL1iL1LiiI iLL1iL1LiiI, int i2) throws IOException {
            if (C0097o000o0O.this.I1ILilil1I(i)) {
                C0097o000o0O.this.ilLilIL(i, iLL1iL1LiiI, i2, z);
                return;
            }
            C0102o000o0o0 I1IILIil1lLlL = C0097o000o0O.this.I1IILIil1lLlL(i);
            if (I1IILIil1lLlL == null) {
                C0097o000o0O.this.iLLlLIIliLl(i, C0039OoooOO0.PROTOCOL_ERROR);
                long j = (long) i2;
                C0097o000o0O.this.il11iII1(j);
                iLL1iL1LiiI.skip(j);
                return;
            }
            I1IILIil1lLlL.iL1LIlIlI(iLL1iL1LiiI, i2);
            if (z) {
                I1IILIil1lLlL.i111iLiiIIill(C0487o0OooooO.illlI1lLIL, true);
            }
        }

        public void iiI1L1iI(int i, int i2, List<C0090o000Ooo0> list) {
            C0097o000o0O.this.iLlI1iL1lIIL(i2, list);
        }

        public void iiIliillii(int i, C0039OoooOO0 ooooOO0) {
            if (C0097o000o0O.this.I1ILilil1I(i)) {
                C0097o000o0O.this.I11iLiiIi(i, ooooOO0);
                return;
            }
            C0102o000o0o0 IiL1llLiil1 = C0097o000o0O.this.IiL1llLiil1(i);
            if (IiL1llLiil1 != null) {
                IiL1llLiil1.Ii1liIIIiLi(ooooOO0);
            }
        }

        public void iilLil1i11I1(boolean z, o0OOOO o0oooo) {
            try {
                C0097o000o0O.this.IiIIlIL.execute(new i1LIL11l("OkHttp %s ACK Settings", new Object[]{C0097o000o0O.this.iiIliillii}, z, o0oooo));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void il1LilLllii(boolean z, int i, int i2) {
            if (z) {
                synchronized (C0097o000o0O.this) {
                    if (i == 1) {
                        try {
                            C0097o000o0O.il1LilLllii(C0097o000o0O.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        C0097o000o0O.I1lLLLlliILlI(C0097o000o0O.this);
                    } else if (i == 3) {
                        C0097o000o0O.iiLl11ILL(C0097o000o0O.this);
                        C0097o000o0O.this.notifyAll();
                    }
                }
                return;
            }
            try {
                C0097o000o0O.this.IiIIlIL.execute(new IiiL1llIIi(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void illlI1lLIL(int i, C0039OoooOO0 ooooOO0, ili11iILI1l ili11iili1l) {
            C0102o000o0o0[] o000o0o0Arr;
            ili11iili1l.illiiliIILI();
            synchronized (C0097o000o0O.this) {
                o000o0o0Arr = (C0102o000o0o0[]) C0097o000o0O.this.il1LilLllii.values().toArray(new C0102o000o0o0[C0097o000o0O.this.il1LilLllii.size()]);
                boolean unused = C0097o000o0O.this.iLLLILIiLi1Ii = true;
            }
            for (C0102o000o0o0 o000o0o0 : o000o0o0Arr) {
                if (o000o0o0.iilLiIIIi11i() > i && o000o0o0.I1iIiIi()) {
                    o000o0o0.Ii1liIIIiLi(C0039OoooOO0.REFUSED_STREAM);
                    C0097o000o0O.this.IiL1llLiil1(o000o0o0.iilLiIIIi11i());
                }
            }
        }

        public void IiIIlIL() {
        }

        public void iilLiIIIi11i(int i, String str, ili11iILI1l ili11iili1l, String str2, int i2, long j) {
        }

        public void I11lLL1(int i, int i2, int i3, boolean z) {
        }
    }

    /* renamed from: top.tntok.autobot.o000o0O$iilLiIIIi11i */
    public static abstract class iilLiIIIi11i {
        public static final iilLiIIIi11i iiI1L1iI = new iiI1L1iI();

        /* renamed from: top.tntok.autobot.o000o0O$iilLiIIIi11i$iiI1L1iI */
        public class iiI1L1iI extends iilLiIIIi11i {
            public void iilLil1i11I1(C0102o000o0o0 o000o0o0) throws IOException {
                o000o0o0.il1LilLllii(C0039OoooOO0.REFUSED_STREAM, (IOException) null);
            }
        }

        public abstract void iilLil1i11I1(C0102o000o0o0 o000o0o0) throws IOException;

        public void iiIliillii(C0097o000o0O o000o0o) {
        }
    }
}
