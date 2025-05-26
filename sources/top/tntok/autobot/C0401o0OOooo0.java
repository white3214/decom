package top.tntok.autobot;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import top.tntok.autobot.IiiIIil1l;

/* renamed from: top.tntok.autobot.o0OOooo0  reason: case insensitive filesystem */
public class C0401o0OOooo0 implements IiiIIil1l {
    public static final int I1iIiIi = 10;
    public static final String IL1lILLLL1L = C0387o0OOoO0o.iiI1L1iI("8s2LYQcLLHjrw94pDxgwMfre\n", "n6zzTGF7X1U=\n");
    public static final int i111iLiiIIill = 3;
    public static final int i1L1lLllLLlIi = 100000;
    public static final int[] iL1LIlIlI = {2560, 1920, 1600, 1280, 1024, 800};
    public final boolean I11lLL1;
    public int IiIIlIL;
    public final AtomicBoolean IiiL1llIIi = new AtomicBoolean();
    public final C0379o0OOo0o i1LIL11l;
    public final iiiiL1i1LllL iILiI1lll = new iiiiL1i1LllL();
    public boolean iLLLILIiLi1Ii;
    public final C0396o0OOooO iiI1L1iI;
    public final int iiIliillii;
    public Thread iilLiIIIi11i;
    public final float iilLil1i11I1;
    public final List<iii1iLI1l1l1> il1LilLllii;
    public final String illlI1lLIL;

    public C0401o0OOooo0(C0396o0OOooO o0ooooo, C0379o0OOo0o o0ooo0o, o0O0o o0o0o) {
        this.iiI1L1iI = o0ooooo;
        this.i1LIL11l = o0ooo0o;
        this.iiIliillii = o0o0o.iLlIllll();
        this.iilLil1i11I1 = o0o0o.IL111l1();
        this.il1LilLllii = o0o0o.ILiLII1ILi();
        this.illlI1lLIL = o0o0o.Il1llillili();
        this.I11lLL1 = o0o0o.ILl1iII11Ll1();
    }

    private static MediaCodec I11lLL1(iIII1lLI111 iiii1lli111, String str) throws IOException, i1iliIlLli {
        if (str != null) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("M/pRwOrT8ipQ7VrC8d75P1DqTYHw2/EoSqgT\n", "cIg0oZ66nE0=\n") + str + C0387o0OOoO0o.iiI1L1iI("9A==\n", "08TsXb51zeI=\n"));
            try {
                MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
                String iiI1L1iI2 = iilL1lILLL.iiI1L1iI(createByCodecName);
                if (iiii1lli111.il1LilLllii().equals(iiI1L1iI2)) {
                    return createByCodecName;
                }
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("O3Bou6XvRD8Odmi7uO9VKB18LLilvQFz\n", "bRkM3srPIVE=\n") + str + C0387o0OOoO0o.iiI1L1iI("TzjU\n", "bRj8Jqfq2KI=\n") + iiI1L1iI2 + C0387o0OOoO0o.iiI1L1iI("krTp85OKd2HU4K3xl400Z5v34viTmnd7wuTovN4=\n", "u5SNnPb5Vw8=\n") + iiii1lli111.il1LilLllii() + C0387o0OOoO0o.iiI1L1iI("xw==\n", "7uE2Z6Aw5rI=\n"));
                throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("7Vj61vmxXDjQFvzX6KxdPtYW7cD7pgN7\n", "pDaZuYvDOVs=\n") + str);
            } catch (IllegalArgumentException unused) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("IpcMoA7rIEQXkQygE+ti\n", "dP5oxWHLRSo=\n") + str + C0387o0OOoO0o.iiI1L1iI("tkI1noeZ\n", "kWJT8fW51Fk=\n") + iiii1lli111.iiI1L1iI() + C0387o0OOoO0o.iiI1L1iI("eEl2rf3SlQ82QxM=\n", "WCcZ2d20+no=\n") + C0167o00OoOOO.iLLLILIiLi1Ii());
                throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("tWR3P1gpBSCFZH8+UzsZOsA=\n", "4AocUTdeawA=\n") + str);
            } catch (IOException e) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("I+q8pfwXRlsUpaq7/VZcUUDzoK39WAhRDuamrf1FCBM=\n", "YIXJyZg3KDQ=\n") + str + C0387o0OOoO0o.iiI1L1iI("jdn1I23n\n", "qvmTTB/Hm/I=\n") + iiii1lli111.iiI1L1iI() + C0130o00O0o00.iLLLILIiLi1Ii + C0167o00OoOOO.iLLLILIiLi1Ii());
                throw e;
            }
        } else {
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(iiii1lli111.il1LilLllii());
                C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("f9liJnq8Fl1Oz2RoePIDW07PeXI9uw==\n", "KqoLSB2cYDQ=\n") + createEncoderByType.getName() + C0387o0OOoO0o.iiI1L1iI("eA==\n", "X2KtnEmfXRE=\n"));
                return createEncoderByType;
            } catch (IOException | IllegalArgumentException e2) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("aAOvtlFK8uRfTLmoUAvo7gsIv7xUH/D/CxqzvlAFvO5FD7W+UBi87UQe+g==\n", "K2za2jVqnIs=\n") + iiii1lli111.iiI1L1iI() + C0130o00O0o00.iLLLILIiLi1Ii + C0167o00OoOOO.iLLLILIiLi1Ii());
                throw e2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void IiIIlIL(IiiIIil1l.iiI1L1iI iii1l1ii) {
        String str;
        String str2;
        Looper.prepare();
        try {
            IiiL1llIIi();
            str = "GYdJaFh1J64+ll5sUHJpumqXT2JNa2K5\n";
            str2 = "SuQ7DT0bB90=\n";
        } catch (i1iliIlLli unused) {
            str = "EYx2AGB+aWc2nWEEaHknc2KccAp1YCxw\n";
            str2 = "Qu8EZQUQSRQ=\n";
        } catch (IOException e) {
            if (!o00O000.iiI1L1iI(e)) {
                C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("0eCAZD8VsSzk5oBoPlL0J/X7i3M=\n", "h4nkAVA11EI=\n"), e);
            }
            str = "AguZ1ELrpkklGo7QSuzoXXEbn95X9eNe\n";
            str2 = "UWjrsSeFhjo=\n";
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("U7UYW5wsAr10pA9flCtMqSClHlGJMkeq\n", "ANZqPvlCIs4=\n"));
            iii1l1ii.iiI1L1iI(true);
            throw th;
        }
        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI(str, str2));
        iii1l1ii.iiI1L1iI(true);
    }

    public static int iiIliillii(C0363o0OOOo0O o0oooo0o) {
        int max = Math.max(o0oooo0o.illlI1lLIL(), o0oooo0o.iiI1L1iI());
        for (int i : iL1LIlIlI) {
            if (i < max) {
                return i;
            }
        }
        return 0;
    }

    public static MediaFormat iilLil1i11I1(String str, int i, float f, List<iii1iLI1l1l1> list) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(C0387o0OOoO0o.iiI1L1iI("PxZCeg==\n", "Un8vH3oGVuI=\n"), str);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("JX7GdiGuYQ==\n", "RxeyBEDaBJU=\n"), i);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("snbUCmzNCUKgYQ==\n", "1AS1ZwngeyM=\n"), 60);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("QV8EtQbbI3lQXQmu\n", "IjBo2nT2RRY=\n"), 2130708361);
        if (Build.VERSION.SDK_INT >= 24) {
            mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("acB0sOxlQCNkyH0=\n", "Cq8Y355IMkI=\n"), 2);
        }
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("RZ6iyw2V7NlF3bDcHo7omA==\n", "LLPEuWz4ifQ=\n"), 10);
        mediaFormat.setLong(C0387o0OOoO0o.iiI1L1iI("lORrQqoUbc+U5G1OpBUzkoDzekquTSHZkuRp\n", "5oEbJ8tgQL8=\n"), 100000);
        if (f > 0.0f) {
            mediaFormat.setFloat(IL1lILLLL1L, f);
        }
        if (list != null) {
            for (iii1iLI1l1l1 next : list) {
                String iiI1L1iI2 = next.iiI1L1iI();
                Object i1LIL11l2 = next.i1LIL11l();
                iIli1Lil1llL.i1LIL11l(mediaFormat, iiI1L1iI2, i1LIL11l2);
                C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("kYoDs2y35HijhgT2bOfzfqiNR6Vm4703\n", "x+Nn1gOXhxc=\n") + iiI1L1iI2 + C0387o0OOoO0o.iiI1L1iI("LeA=\n", "Dcjdnsu8dZk=\n") + i1LIL11l2.getClass().getSimpleName() + C0387o0OOoO0o.iiI1L1iI("dxCv9w==\n", "XjCS11VMsGU=\n") + i1LIL11l2);
            }
        }
        return mediaFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r14.iiI1L1iI.iiIliillii() == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0136, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0130 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0157 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[SYNTHETIC, Splitter:B:83:0x0154] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015c A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0145 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0136 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0136 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IiiL1llIIi() throws java.io.IOException, top.tntok.autobot.i1iliIlLli {
        /*
            r14 = this;
            top.tntok.autobot.o0OOo0o r0 = r14.i1LIL11l
            top.tntok.autobot.iIII1lLI111 r0 = r0.illlI1lLIL()
            java.lang.String r1 = r14.illlI1lLIL
            android.media.MediaCodec r1 = I11lLL1(r0, r1)
            java.lang.String r0 = r0.il1LilLllii()
            int r2 = r14.iiIliillii
            float r3 = r14.iilLil1i11I1
            java.util.List<top.tntok.autobot.iii1iLI1l1l1> r4 = r14.il1LilLllii
            android.media.MediaFormat r0 = iilLil1i11I1(r0, r2, r3, r4)
            top.tntok.autobot.o0OOooO r2 = r14.iiI1L1iI
            top.tntok.autobot.iiiiL1i1LllL r3 = r14.iILiI1lll
            r2.illlI1lLIL(r3)
            r2 = 0
            r3 = 0
        L_0x0023:
            top.tntok.autobot.iiiiL1i1LllL r4 = r14.iILiI1lll     // Catch:{ all -> 0x003d }
            r4.i1LIL11l()     // Catch:{ all -> 0x003d }
            top.tntok.autobot.o0OOooO r4 = r14.iiI1L1iI     // Catch:{ all -> 0x003d }
            r4.iilLil1i11I1()     // Catch:{ all -> 0x003d }
            top.tntok.autobot.o0OOooO r4 = r14.iiI1L1iI     // Catch:{ all -> 0x003d }
            top.tntok.autobot.o0OOOo0O r4 = r4.iiI1L1iI()     // Catch:{ all -> 0x003d }
            r5 = 1
            if (r3 != 0) goto L_0x0040
            top.tntok.autobot.o0OOo0o r3 = r14.i1LIL11l     // Catch:{ all -> 0x003d }
            r3.IiIIlIL(r4)     // Catch:{ all -> 0x003d }
            r3 = 1
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            goto L_0x0160
        L_0x0040:
            java.lang.String r6 = "oLJeaC0=\n"
            java.lang.String r7 = "19s6HEVjB3c=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ all -> 0x003d }
            int r7 = r4.illlI1lLIL()     // Catch:{ all -> 0x003d }
            r0.setInteger(r6, r7)     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "NHGQD7MY\n"
            java.lang.String r7 = "XBT5aNts9z8=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ all -> 0x003d }
            int r7 = r4.iiI1L1iI()     // Catch:{ all -> 0x003d }
            r0.setInteger(r6, r7)     // Catch:{ all -> 0x003d }
            r6 = 0
            r1.configure(r0, r6, r6, r5)     // Catch:{ IllegalStateException -> 0x00dd, IllegalArgumentException -> 0x00db, IOException -> 0x00d8, all -> 0x00d5 }
            android.view.Surface r7 = r1.createInputSurface()     // Catch:{ IllegalStateException -> 0x00dd, IllegalArgumentException -> 0x00db, IOException -> 0x00d8, all -> 0x00d5 }
            top.tntok.autobot.o0OOooO r8 = r14.iiI1L1iI     // Catch:{ IllegalStateException -> 0x00d3, IllegalArgumentException -> 0x00d1, IOException -> 0x00cd, all -> 0x00cb }
            r8.iilLiIIIi11i(r7)     // Catch:{ IllegalStateException -> 0x00d3, IllegalArgumentException -> 0x00d1, IOException -> 0x00cd, all -> 0x00cb }
            r1.start()     // Catch:{ IllegalStateException -> 0x00c9, IllegalArgumentException -> 0x00c7, IOException -> 0x00c4, all -> 0x00bf }
            top.tntok.autobot.iiiiL1i1LllL r8 = r14.iILiI1lll     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            r8.il1LilLllii(r1)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            java.util.concurrent.atomic.AtomicBoolean r8 = r14.IiiL1llIIi     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            boolean r8 = r8.get()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            if (r8 == 0) goto L_0x007d
        L_0x007b:
            r5 = 0
            goto L_0x00a8
        L_0x007d:
            top.tntok.autobot.iiiiL1i1LllL r8 = r14.iILiI1lll     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            boolean r8 = r8.i1LIL11l()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            if (r8 != 0) goto L_0x0098
            top.tntok.autobot.o0OOo0o r8 = r14.i1LIL11l     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            r14.iLLLILIiLi1Ii(r1, r8)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            goto L_0x0098
        L_0x008b:
            r0 = move-exception
            r2 = 1
            r9 = 1
            goto L_0x0146
        L_0x0090:
            r8 = move-exception
        L_0x0091:
            r9 = 1
        L_0x0092:
            r10 = 1
            goto L_0x00df
        L_0x0094:
            r8 = move-exception
            goto L_0x0091
        L_0x0096:
            r8 = move-exception
            goto L_0x0091
        L_0x0098:
            java.util.concurrent.atomic.AtomicBoolean r8 = r14.IiiL1llIIi     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            boolean r8 = r8.get()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            if (r8 != 0) goto L_0x007b
            top.tntok.autobot.o0OOooO r8 = r14.iiI1L1iI     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            boolean r4 = r8.iiIliillii()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x0094, IOException -> 0x0090, all -> 0x008b }
            if (r4 != 0) goto L_0x007b
        L_0x00a8:
            top.tntok.autobot.iiiiL1i1LllL r4 = r14.iILiI1lll     // Catch:{ all -> 0x003d }
            r4.il1LilLllii(r6)     // Catch:{ all -> 0x003d }
            top.tntok.autobot.o0OOooO r4 = r14.iiI1L1iI     // Catch:{ all -> 0x003d }
            r4.IiiL1llIIi()     // Catch:{ all -> 0x003d }
            r1.stop()     // Catch:{ IllegalStateException -> 0x00b5 }
        L_0x00b5:
            r1.reset()     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x0136
        L_0x00ba:
            r7.release()     // Catch:{ all -> 0x003d }
            goto L_0x0136
        L_0x00bf:
            r0 = move-exception
            r2 = 1
        L_0x00c1:
            r9 = 0
            goto L_0x0146
        L_0x00c4:
            r8 = move-exception
        L_0x00c5:
            r9 = 0
            goto L_0x0092
        L_0x00c7:
            r8 = move-exception
            goto L_0x00c5
        L_0x00c9:
            r8 = move-exception
            goto L_0x00c5
        L_0x00cb:
            r0 = move-exception
            goto L_0x00c1
        L_0x00cd:
            r8 = move-exception
        L_0x00ce:
            r9 = 0
            r10 = 0
            goto L_0x00df
        L_0x00d1:
            r8 = move-exception
            goto L_0x00ce
        L_0x00d3:
            r8 = move-exception
            goto L_0x00ce
        L_0x00d5:
            r0 = move-exception
            r7 = r6
            goto L_0x00c1
        L_0x00d8:
            r8 = move-exception
        L_0x00d9:
            r7 = r6
            goto L_0x00ce
        L_0x00db:
            r8 = move-exception
            goto L_0x00d9
        L_0x00dd:
            r8 = move-exception
            goto L_0x00d9
        L_0x00df:
            boolean r11 = top.tntok.autobot.o00O000.i1LIL11l(r8)     // Catch:{ all -> 0x0142 }
            if (r11 != 0) goto L_0x0145
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r11.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "IQthx7KAh9UHBHLco5uMnUIPY8GogNja\n"
            java.lang.String r13 = "YmoRs8fy4vo=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.Class r12 = r8.getClass()     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "Jcg=\n"
            java.lang.String r13 = "H+jBfh8YuG0=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = r8.getMessage()     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0142 }
            top.tntok.autobot.C0525o0oOO.illlI1lLIL(r11)     // Catch:{ all -> 0x0142 }
            boolean r4 = r14.iilLiIIIi11i(r4)     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0141
            top.tntok.autobot.iiiiL1i1LllL r4 = r14.iILiI1lll     // Catch:{ all -> 0x003d }
            r4.il1LilLllii(r6)     // Catch:{ all -> 0x003d }
            if (r10 == 0) goto L_0x012b
            top.tntok.autobot.o0OOooO r4 = r14.iiI1L1iI     // Catch:{ all -> 0x003d }
            r4.IiiL1llIIi()     // Catch:{ all -> 0x003d }
        L_0x012b:
            if (r9 == 0) goto L_0x0130
            r1.stop()     // Catch:{ IllegalStateException -> 0x0130 }
        L_0x0130:
            r1.reset()     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x0136
            goto L_0x00ba
        L_0x0136:
            if (r5 != 0) goto L_0x0023
            r1.release()
            top.tntok.autobot.o0OOooO r0 = r14.iiI1L1iI
            r0.I11lLL1()
            return
        L_0x0141:
            throw r8     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            r2 = r10
            goto L_0x0146
        L_0x0145:
            throw r8     // Catch:{ all -> 0x0142 }
        L_0x0146:
            top.tntok.autobot.iiiiL1i1LllL r3 = r14.iILiI1lll     // Catch:{ all -> 0x003d }
            r3.il1LilLllii(r6)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0152
            top.tntok.autobot.o0OOooO r2 = r14.iiI1L1iI     // Catch:{ all -> 0x003d }
            r2.IiiL1llIIi()     // Catch:{ all -> 0x003d }
        L_0x0152:
            if (r9 == 0) goto L_0x0157
            r1.stop()     // Catch:{ IllegalStateException -> 0x0157 }
        L_0x0157:
            r1.reset()     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x015f
            r7.release()     // Catch:{ all -> 0x003d }
        L_0x015f:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0160:
            r1.release()
            top.tntok.autobot.o0OOooO r1 = r14.iiI1L1iI
            r1.I11lLL1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0401o0OOooo0.IiiL1llIIi():void");
    }

    public void i1LIL11l(IiiIIil1l.iiI1L1iI iii1l1ii) {
        Thread thread = new Thread(new C0399o0OOooOo(this, iii1l1ii), C0387o0OOoO0o.iiI1L1iI("ex1TrSA=\n", "DXQ3yE+YTGk=\n"));
        this.iilLiIIIi11i = thread;
        thread.start();
    }

    public final void iLLLILIiLi1Ii(MediaCodec mediaCodec, C0379o0OOo0o o0ooo0o) throws IOException {
        boolean z;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        do {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, -1);
            try {
                if ((bufferInfo.flags & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (dequeueOutputBuffer >= 0 && bufferInfo.size > 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                    if ((bufferInfo.flags & 2) == 0) {
                        this.iLLLILIiLi1Ii = true;
                        this.IiIIlIL = 0;
                    }
                    o0ooo0o.iLLLILIiLi1Ii(outputBuffer, bufferInfo);
                }
                if (dequeueOutputBuffer >= 0) {
                    continue;
                }
            } finally {
                if (dequeueOutputBuffer >= 0) {
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        } while (!z);
    }

    public void iiI1L1iI() {
        if (this.iilLiIIIi11i != null) {
            this.IiiL1llIIi.set(true);
            this.iILiI1lll.illlI1lLIL();
        }
    }

    public final boolean iilLiIIIi11i(C0363o0OOOo0O o0oooo0o) {
        int iiIliillii2;
        if (this.iLLLILIiLi1Ii) {
            int i = this.IiIIlIL + 1;
            this.IiIIlIL = i;
            if (i >= 3) {
                return false;
            }
            SystemClock.sleep(50);
            return true;
        } else if (!this.I11lLL1 || (iiIliillii2 = iiIliillii(o0oooo0o)) == 0 || !this.iiI1L1iI.IiIIlIL(iiIliillii2)) {
            return false;
        } else {
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("VX1x9K46OsInb2zyv3N5yA==\n", "BxgFhtdTVKU=\n") + iiIliillii2 + C0387o0OOoO0o.iiI1L1iI("W/7Y\n", "ddD2NsYJYyU=\n"));
            return true;
        }
    }

    public void illlI1lLIL() throws InterruptedException {
        Thread thread = this.iilLiIIIi11i;
        if (thread != null) {
            thread.join();
        }
    }
}
