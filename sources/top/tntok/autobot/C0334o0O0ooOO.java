package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o0O0ooOO  reason: case insensitive filesystem */
public abstract class C0334o0O0ooOO {

    /* renamed from: top.tntok.autobot.o0O0ooOO$i1LIL11l */
    public class i1LIL11l extends C0334o0O0ooOO {
        public final /* synthetic */ int i1LIL11l;
        public final /* synthetic */ C0179o00OooO0 iiI1L1iI;
        public final /* synthetic */ int il1LilLllii;
        public final /* synthetic */ byte[] illlI1lLIL;

        public i1LIL11l(C0179o00OooO0 o00oooo0, int i, byte[] bArr, int i2) {
            this.iiI1L1iI = o00oooo0;
            this.i1LIL11l = i;
            this.illlI1lLIL = bArr;
            this.il1LilLllii = i2;
        }

        @Nullable
        public C0179o00OooO0 i1LIL11l() {
            return this.iiI1L1iI;
        }

        public long iiI1L1iI() {
            return (long) this.i1LIL11l;
        }

        public void iilLiIIIi11i(Iiii1LiI11i iiii1LiI11i) throws IOException {
            iiii1LiI11i.iLLLILIiLi1Ii(this.illlI1lLIL, this.il1LilLllii, this.i1LIL11l);
        }
    }

    /* renamed from: top.tntok.autobot.o0O0ooOO$iiI1L1iI */
    public class iiI1L1iI extends C0334o0O0ooOO {
        public final /* synthetic */ ili11iILI1l i1LIL11l;
        public final /* synthetic */ C0179o00OooO0 iiI1L1iI;

        public iiI1L1iI(C0179o00OooO0 o00oooo0, ili11iILI1l ili11iili1l) {
            this.iiI1L1iI = o00oooo0;
            this.i1LIL11l = ili11iili1l;
        }

        @Nullable
        public C0179o00OooO0 i1LIL11l() {
            return this.iiI1L1iI;
        }

        public long iiI1L1iI() throws IOException {
            return (long) this.i1LIL11l.illiiliIILI();
        }

        public void iilLiIIIi11i(Iiii1LiI11i iiii1LiI11i) throws IOException {
            iiii1LiI11i.ILiLII1ILi(this.i1LIL11l);
        }
    }

    /* renamed from: top.tntok.autobot.o0O0ooOO$illlI1lLIL */
    public class illlI1lLIL extends C0334o0O0ooOO {
        public final /* synthetic */ File i1LIL11l;
        public final /* synthetic */ C0179o00OooO0 iiI1L1iI;

        public illlI1lLIL(C0179o00OooO0 o00oooo0, File file) {
            this.iiI1L1iI = o00oooo0;
            this.i1LIL11l = file;
        }

        @Nullable
        public C0179o00OooO0 i1LIL11l() {
            return this.iiI1L1iI;
        }

        public long iiI1L1iI() {
            return this.i1LIL11l.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
            r3.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r0 != null) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void iilLiIIIi11i(top.tntok.autobot.Iiii1LiI11i r3) throws java.io.IOException {
            /*
                r2 = this;
                java.io.File r0 = r2.i1LIL11l
                top.tntok.autobot.o0OOOooO r0 = top.tntok.autobot.C0249o00oo00O.IiiL1llIIi(r0)
                r3.Ii1liIIIiLi(r0)     // Catch:{ all -> 0x000f }
                if (r0 == 0) goto L_0x000e
                r0.close()
            L_0x000e:
                return
            L_0x000f:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0011 }
            L_0x0011:
                r1 = move-exception
                if (r0 == 0) goto L_0x001c
                r0.close()     // Catch:{ all -> 0x0018 }
                goto L_0x001c
            L_0x0018:
                r0 = move-exception
                r3.addSuppressed(r0)
            L_0x001c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0334o0O0ooOO.illlI1lLIL.iilLiIIIi11i(top.tntok.autobot.Iiii1LiI11i):void");
        }
    }

    public static C0334o0O0ooOO I11lLL1(@Nullable C0179o00OooO0 o00oooo0, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C0487o0OooooO.iilLil1i11I1((long) bArr.length, (long) i, (long) i2);
            return new i1LIL11l(o00oooo0, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static C0334o0O0ooOO iiIliillii(@Nullable C0179o00OooO0 o00oooo0, ili11iILI1l ili11iili1l) {
        return new iiI1L1iI(o00oooo0, ili11iili1l);
    }

    public static C0334o0O0ooOO iilLil1i11I1(@Nullable C0179o00OooO0 o00oooo0, byte[] bArr) {
        return I11lLL1(o00oooo0, bArr, 0, bArr.length);
    }

    public static C0334o0O0ooOO il1LilLllii(@Nullable C0179o00OooO0 o00oooo0, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (o00oooo0 != null) {
            Charset iiI1L1iI2 = o00oooo0.iiI1L1iI();
            if (iiI1L1iI2 == null) {
                o00oooo0 = C0179o00OooO0.il1LilLllii(o00oooo0 + "; charset=utf-8");
            } else {
                charset = iiI1L1iI2;
            }
        }
        return iilLil1i11I1(o00oooo0, str.getBytes(charset));
    }

    public static C0334o0O0ooOO illlI1lLIL(@Nullable C0179o00OooO0 o00oooo0, File file) {
        if (file != null) {
            return new illlI1lLIL(o00oooo0, file);
        }
        throw new NullPointerException("file == null");
    }

    public boolean IiIIlIL() {
        return false;
    }

    @Nullable
    public abstract C0179o00OooO0 i1LIL11l();

    public boolean iLLLILIiLi1Ii() {
        return false;
    }

    public long iiI1L1iI() throws IOException {
        return -1;
    }

    public abstract void iilLiIIIi11i(Iiii1LiI11i iiii1LiI11i) throws IOException;
}
