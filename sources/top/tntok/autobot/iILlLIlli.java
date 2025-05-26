package top.tntok.autobot;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import top.tntok.autobot.IiiIIil1l;

public final class iILlLIlli implements IiiIIil1l {
    public static final int I1iIiIi = 48000;
    public static final int i1L1lLllLLlIi = 2;
    public final BlockingQueue<il1LilLllii> I11lLL1 = new ArrayBlockingQueue(64);
    public HandlerThread IiIIlIL;
    public Thread IiiL1llIIi;
    public final C0379o0OOo0o i1LIL11l;
    public boolean iILiI1lll;
    public Thread iLLLILIiLi1Ii;
    public final I1i1iiiI iiI1L1iI;
    public final String iiIliillii;
    public Thread iilLiIIIi11i;
    public final BlockingQueue<illlI1lLIL> iilLil1i11I1 = new ArrayBlockingQueue(64);
    public final List<iii1iLI1l1l1> il1LilLllii;
    public final int illlI1lLIL;

    public static class il1LilLllii {
        public final MediaCodec.BufferInfo i1LIL11l;
        public final int iiI1L1iI;

        public il1LilLllii(int i, MediaCodec.BufferInfo bufferInfo) {
            this.iiI1L1iI = i;
            this.i1LIL11l = bufferInfo;
        }
    }

    public static class illlI1lLIL {
        public final int iiI1L1iI;

        public illlI1lLIL(int i) {
            this.iiI1L1iI = i;
        }
    }

    public iILlLIlli(I1i1iiiI i1i1iiiI, C0379o0OOo0o o0ooo0o, o0O0o o0o0o) {
        this.iiI1L1iI = i1i1iiiI;
        this.i1LIL11l = o0ooo0o;
        this.illlI1lLIL = o0o0o.illlI1lLIL();
        this.il1LilLllii = o0o0o.iiIliillii();
        this.iiIliillii = o0o0o.I11lLL1();
    }

    public static MediaCodec IiiL1llIIi(iIII1lLI111 iiii1lli111, String str) throws IOException, i1iliIlLli {
        if (str != null) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("S73JQSQtugEortlEOSv0A2asw0Q1NvQEce/CQT0h7kYv\n", "CM+sIFBE1GY=\n") + str + C0387o0OOoO0o.iiI1L1iI("Rw==\n", "YBWrn9skSrg=\n"));
            try {
                MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
                String iiI1L1iI2 = iilL1lILLL.iiI1L1iI(createByCodecName);
                if (iiii1lli111.il1LilLllii().equals(iiI1L1iI2)) {
                    return createByCodecName;
                }
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("FWcg9hC9arg3fSD6Db17ryR3ZPkQ7y/0\n", "VBJEn3+dD9Y=\n") + str + C0387o0OOoO0o.iiI1L1iI("n5lL\n", "vbljV0btQ/8=\n") + iiI1L1iI2 + C0387o0OOoO0o.iiI1L1iI("mz0gtumAgw3daWS07YfAC5J+K73pkIMXy20h+aQ=\n", "sh1E2Yzzo2M=\n") + iiii1lli111.il1LilLllii() + C0387o0OOoO0o.iiI1L1iI("rQ==\n", "hIhfk9t9MFc=\n"));
                throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("GtsLxWNgNAQnlQ3Ecn01AiGVHNNhd2tH\n", "U7VoqhESUWc=\n") + str);
            } catch (IllegalArgumentException unused) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("nFiFliET7Mq+QoWaPBOu\n", "3S3h/04ziaQ=\n") + str + C0387o0OOoO0o.iiI1L1iI("uau7iIF1\n", "novd5/NVkhU=\n") + iiii1lli111.iiI1L1iI() + C0387o0OOoO0o.iiI1L1iI("8yLa7KCZ9zu9KL8=\n", "00y1mID/mE4=\n") + C0167o00OoOOO.il1LilLllii());
                throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("1pNemZ9ipRPmk1aYlHC5CaM=\n", "g/019/AVyzM=\n") + str);
            } catch (IOException e) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("iThLaizfYle+d110LZ54Xeo2S2IhkCxdpDRRYi2NLB8=\n", "ylc+Bkj/DDg=\n") + str + C0387o0OOoO0o.iiI1L1iI("dcgwtLpk\n", "UuhW28hE4QE=\n") + iiii1lli111.iiI1L1iI() + C0130o00O0o00.iLLLILIiLi1Ii + C0167o00OoOOO.il1LilLllii());
                throw e;
            }
        } else {
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(iiii1lli111.il1LilLllii());
                C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("mRwbzf6L+x6oBh2D/MX5BKgKAJm5jA==\n", "zG9yo5mrmms=\n") + createEncoderByType.getName() + C0387o0OOoO0o.iiI1L1iI("ug==\n", "nUFEoFDI2+o=\n"));
                return createEncoderByType;
            } catch (IOException | IllegalArgumentException e2) {
                C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("HpDLnRuvElEp392DGu4IW32b25ce+hBKfZ7LlRbgXFsznNGVGv1cWDKNng==\n", "Xf++8X+PfD4=\n") + iiii1lli111.iiI1L1iI() + C0130o00O0o00.iLLLILIiLi1Ii + C0167o00OoOOO.il1LilLllii());
                throw e2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i111iLiiIIill(IiiIIil1l.iiI1L1iI iii1l1ii) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            iILiI1lll();
            str3 = "TT0g2V07GCZvJyDVQDsOPGM4NNVW\n";
            str4 = "DEhEsDIbfUg=\n";
        } catch (i1iliIlLli unused) {
            str = "80v43HVIHy/RUfjQaEgJNd1O7NB+\n";
            str2 = "sj6ctRpoekE=\n";
        } catch (ILiliIiI unused2) {
            str3 = "nt2nb15zrea8x6djQ3O7/LDYs2NV\n";
            str4 = "36jDBjFTyIg=\n";
        } catch (IOException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("k+HnSdwhzxux++dJ3WaKEKDm7FI=\n", "0pSDILMBqnU=\n"), e);
            str = "/clHWoiFInjf00dWlYU0YtPMU1aD\n";
            str2 = "vLwjM+elRxY=\n";
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("KJeHRHIF7PoKjYdIbwX64AaSk0h5\n", "aeLjLR0liZQ=\n"));
            iii1l1ii.iiI1L1iI(false);
            throw th;
        }
        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI(str3, str4));
        iii1l1ii.iiI1L1iI(false);
        return;
        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI(str, str2));
        iii1l1ii.iiI1L1iI(true);
    }

    public static MediaFormat iilLiIIIi11i(String str, int i, List<iii1iLI1l1l1> list) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(C0387o0OOoO0o.iiI1L1iI("dpHy9g==\n", "G/ifk1mzkk0=\n"), str);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("ptmUFcCIow==\n", "xLDgZ6H8xlQ=\n"), i);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("Z4S/9IC6vKRng6v0mg==\n", "BOzemu7f0Ik=\n"), 2);
        mediaFormat.setInteger(C0387o0OOoO0o.iiI1L1iI("xqei0eMUDDPUsqo=\n", "tcbPoY9xIUE=\n"), 48000);
        if (list != null) {
            for (iii1iLI1l1l1 next : list) {
                String iiI1L1iI2 = next.iiI1L1iI();
                Object i1LIL11l2 = next.i1LIL11l();
                iIli1Lil1llL.i1LIL11l(mediaFormat, iiI1L1iI2, i1LIL11l2);
                C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("ktNULGCINU63w1NlYNgiSLzIEDZq3GwB\n", "06YwRQ+oViE=\n") + iiI1L1iI2 + C0387o0OOoO0o.iiI1L1iI("zvg=\n", "7tDKGIuvWII=\n") + i1LIL11l2.getClass().getSimpleName() + C0387o0OOoO0o.iiI1L1iI("1dcBbw==\n", "/Pc8TxrCAjs=\n") + i1LIL11l2);
            }
        }
        return mediaFormat;
    }

    public final synchronized void I1iIiIi() {
        this.iILiI1lll = true;
        notify();
    }

    public final /* synthetic */ void IL1lILLLL1L(MediaCodec mediaCodec) {
        try {
            i1L1lLllLLlIi(mediaCodec, this.iiI1L1iI);
        } catch (IOException | InterruptedException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("LewKRUDBgT0c7RteSsGHLh72HA==\n", "bJluLC/h4lw=\n"), e);
        } catch (Throwable th) {
            I1iIiIi();
            throw th;
        }
        I1iIiIi();
    }

    public final void Ii1liIIIiLi(MediaCodec mediaCodec) throws IOException, InterruptedException {
        this.i1LIL11l.il1LilLllii();
        while (!Thread.currentThread().isInterrupted()) {
            il1LilLllii take = this.I11lLL1.take();
            try {
                this.i1LIL11l.iLLLILIiLi1Ii(mediaCodec.getOutputBuffer(take.iiI1L1iI), take.i1LIL11l);
            } finally {
                mediaCodec.releaseOutputBuffer(take.iiI1L1iI, false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:5:0x0009
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    public final synchronized void IilL11ii1I1Il() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.iILiI1lll     // Catch:{ InterruptedException -> 0x000c }
            if (r0 != 0) goto L_0x000c
            r1.wait()     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x0001
        L_0x0009:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            throw r0
        L_0x000c:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iILlLIlli.IilL11ii1I1Il():void");
    }

    @TargetApi(24)
    public final void i1L1lLllLLlIi(MediaCodec mediaCodec, I1i1iiiI i1i1iiiI) throws IOException, InterruptedException {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (!Thread.currentThread().isInterrupted()) {
            illlI1lLIL take = this.iilLil1i11I1.take();
            int il1LilLllii2 = i1i1iiiI.il1LilLllii(mediaCodec.getInputBuffer(take.iiI1L1iI), bufferInfo);
            if (il1LilLllii2 > 0) {
                mediaCodec.queueInputBuffer(take.iiI1L1iI, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            } else {
                throw new IOException(C0387o0OOoO0o.iiI1L1iI("X9SzuF32C2Bom7SxWLJFbmnfr7sD9g==\n", "HLvG1DnWZQ8=\n") + il1LilLllii2);
            }
        }
    }

    public void i1LIL11l(IiiIIil1l.iiI1L1iI iii1l1ii) {
        Thread thread = new Thread(new I1lLLLlliILlI(this, iii1l1ii), C0387o0OOoO0o.iiI1L1iI("YmnS+0e3OHhgc9L3Wg==\n", "Axy2kiiaXRY=\n"));
        this.iLLLILIiLi1Ii = thread;
        thread.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0124 A[Catch:{ InterruptedException -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012e A[Catch:{ InterruptedException -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0135 A[Catch:{ InterruptedException -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0146  */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iILiI1lll() throws java.io.IOException, top.tntok.autobot.i1iliIlLli, top.tntok.autobot.ILiliIiI {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 >= r1) goto L_0x0018
            java.lang.String r0 = "vFLvotHf796ORumn25uxl5RTq6LN3+XYiQf4vs6P5MWJQu/r3Jrt2I9Cq4rQm/nYlEOr+o8=\n"
            java.lang.String r1 = "/SeLy77/i7c=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            top.tntok.autobot.C0525o0oOO.IiIIlIL(r0)
            top.tntok.autobot.o0OOo0o r0 = r8.i1LIL11l
            r0.iiIliillii(r2)
            return
        L_0x0018:
            r0 = 1
            r1 = 0
            top.tntok.autobot.I1i1iiiI r3 = r8.iiI1L1iI     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            r3.i1LIL11l()     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            top.tntok.autobot.o0OOo0o r3 = r8.i1LIL11l     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            top.tntok.autobot.iIII1lLI111 r3 = r3.illlI1lLIL()     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            java.lang.String r4 = r8.iiIliillii     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            android.media.MediaCodec r4 = IiiL1llIIi(r3, r4)     // Catch:{ i1iliIlLli -> 0x00f1, all -> 0x00ed }
            android.os.HandlerThread r5 = new android.os.HandlerThread     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.String r6 = "QhJVwSMFkJ1LElI=\n"
            java.lang.String r7 = "L3cxqEIo8/I=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r5.<init>(r6)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r8.IiIIlIL = r5     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r5.start()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.String r3 = r3.il1LilLllii()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            int r5 = r8.illlI1lLIL     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.util.List<top.tntok.autobot.iii1iLI1l1l1> r6 = r8.il1LilLllii     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            android.media.MediaFormat r3 = iilLiIIIi11i(r3, r5, r6)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            top.tntok.autobot.iILlLIlli$i1LIL11l r5 = new top.tntok.autobot.iILlLIlli$i1LIL11l     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r5.<init>()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            android.os.HandlerThread r7 = r8.IiIIlIL     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            android.os.Looper r7 = r7.getLooper()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r6.<init>(r7)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r4.setCallback(r5, r6)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r4.configure(r3, r1, r1, r0)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            top.tntok.autobot.I1i1iiiI r1 = r8.iiI1L1iI     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r1.illlI1lLIL()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            top.tntok.autobot.iiLl11ILL r3 = new top.tntok.autobot.iiLl11ILL     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r3.<init>(r8, r4)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.String r5 = "XOBu59FSNtE=\n"
            java.lang.String r6 = "PZUKjr5/X78=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r1.<init>(r3, r5)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r8.iilLiIIIi11i = r1     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            top.tntok.autobot.IL11lll11 r3 = new top.tntok.autobot.IL11lll11     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r3.<init>(r8, r4)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.String r5 = "CEPGbekN+jQd\n"
            java.lang.String r6 = "aTaiBIYglUE=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r1.<init>(r3, r5)     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r8.IiiL1llIIi = r1     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            r4.start()     // Catch:{ i1iliIlLli -> 0x00eb, all -> 0x00e8 }
            java.lang.Thread r1 = r8.iilLiIIIi11i     // Catch:{ i1iliIlLli -> 0x00e5, all -> 0x00e3 }
            r1.start()     // Catch:{ i1iliIlLli -> 0x00e5, all -> 0x00e3 }
            java.lang.Thread r1 = r8.IiiL1llIIi     // Catch:{ i1iliIlLli -> 0x00e5, all -> 0x00e3 }
            r1.start()     // Catch:{ i1iliIlLli -> 0x00e5, all -> 0x00e3 }
            r8.IilL11ii1I1Il()     // Catch:{ i1iliIlLli -> 0x00e5, all -> 0x00e3 }
            android.os.HandlerThread r0 = r8.IiIIlIL
            if (r0 == 0) goto L_0x00a9
            android.os.Looper r0 = r0.getLooper()
            if (r0 == 0) goto L_0x00a9
            r0.quitSafely()
        L_0x00a9:
            java.lang.Thread r0 = r8.iilLiIIIi11i
            if (r0 == 0) goto L_0x00b0
            r0.interrupt()
        L_0x00b0:
            java.lang.Thread r0 = r8.IiiL1llIIi
            if (r0 == 0) goto L_0x00b7
            r0.interrupt()
        L_0x00b7:
            android.os.HandlerThread r0 = r8.IiIIlIL     // Catch:{ InterruptedException -> 0x00bf }
            if (r0 == 0) goto L_0x00c1
            r0.join()     // Catch:{ InterruptedException -> 0x00bf }
            goto L_0x00c1
        L_0x00bf:
            r0 = move-exception
            goto L_0x00dd
        L_0x00c1:
            java.lang.Thread r0 = r8.iilLiIIIi11i     // Catch:{ InterruptedException -> 0x00bf }
            if (r0 == 0) goto L_0x00c8
            r0.join()     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00c8:
            java.lang.Thread r0 = r8.IiiL1llIIi     // Catch:{ InterruptedException -> 0x00bf }
            if (r0 == 0) goto L_0x00cf
            r0.join()     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00cf:
            r4.stop()
            r4.release()
            top.tntok.autobot.I1i1iiiI r0 = r8.iiI1L1iI
            if (r0 == 0) goto L_0x00dc
            r0.iiI1L1iI()
        L_0x00dc:
            return
        L_0x00dd:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x00e3:
            r1 = move-exception
            goto L_0x00f5
        L_0x00e5:
            r1 = move-exception
            r2 = 1
            goto L_0x00fd
        L_0x00e8:
            r1 = move-exception
        L_0x00e9:
            r0 = 0
            goto L_0x00f5
        L_0x00eb:
            r1 = move-exception
            goto L_0x00fd
        L_0x00ed:
            r0 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x00e9
        L_0x00f1:
            r3 = move-exception
            r4 = r1
            r1 = r3
            goto L_0x00fd
        L_0x00f5:
            top.tntok.autobot.o0OOo0o r3 = r8.i1LIL11l     // Catch:{ all -> 0x00fb }
            r3.iiIliillii(r2)     // Catch:{ all -> 0x00fb }
            throw r1     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r1 = move-exception
            goto L_0x0105
        L_0x00fd:
            top.tntok.autobot.o0OOo0o r3 = r8.i1LIL11l     // Catch:{ all -> 0x0103 }
            r3.iiIliillii(r0)     // Catch:{ all -> 0x0103 }
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r1 = move-exception
            r0 = r2
        L_0x0105:
            android.os.HandlerThread r2 = r8.IiIIlIL
            if (r2 == 0) goto L_0x0112
            android.os.Looper r2 = r2.getLooper()
            if (r2 == 0) goto L_0x0112
            r2.quitSafely()
        L_0x0112:
            java.lang.Thread r2 = r8.iilLiIIIi11i
            if (r2 == 0) goto L_0x0119
            r2.interrupt()
        L_0x0119:
            java.lang.Thread r2 = r8.IiiL1llIIi
            if (r2 == 0) goto L_0x0120
            r2.interrupt()
        L_0x0120:
            android.os.HandlerThread r2 = r8.IiIIlIL     // Catch:{ InterruptedException -> 0x0128 }
            if (r2 == 0) goto L_0x012a
            r2.join()     // Catch:{ InterruptedException -> 0x0128 }
            goto L_0x012a
        L_0x0128:
            r0 = move-exception
            goto L_0x014a
        L_0x012a:
            java.lang.Thread r2 = r8.iilLiIIIi11i     // Catch:{ InterruptedException -> 0x0128 }
            if (r2 == 0) goto L_0x0131
            r2.join()     // Catch:{ InterruptedException -> 0x0128 }
        L_0x0131:
            java.lang.Thread r2 = r8.IiiL1llIIi     // Catch:{ InterruptedException -> 0x0128 }
            if (r2 == 0) goto L_0x0138
            r2.join()     // Catch:{ InterruptedException -> 0x0128 }
        L_0x0138:
            if (r4 == 0) goto L_0x0142
            if (r0 == 0) goto L_0x013f
            r4.stop()
        L_0x013f:
            r4.release()
        L_0x0142:
            top.tntok.autobot.I1i1iiiI r0 = r8.iiI1L1iI
            if (r0 == 0) goto L_0x0149
            r0.iiI1L1iI()
        L_0x0149:
            throw r1
        L_0x014a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iILlLIlli.iILiI1lll():void");
    }

    public final /* synthetic */ void iL1LIlIlI(MediaCodec mediaCodec) {
        try {
            Ii1liIIIiLi(mediaCodec);
        } catch (InterruptedException unused) {
        } catch (IOException e) {
            if (!o00O000.iiI1L1iI(e)) {
                C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("husyeMzfTqmk8TJ4zZgLorXsOWM=\n", "x55WEaP/K8c=\n"), e);
            }
        } catch (Throwable th) {
            I1iIiIi();
            throw th;
        }
        I1iIiIi();
    }

    public void iiI1L1iI() {
        if (this.iLLLILIiLi1Ii != null) {
            I1iIiIi();
        }
    }

    public void illlI1lLIL() throws InterruptedException {
        Thread thread = this.iLLLILIiLi1Ii;
        if (thread != null) {
            thread.join();
        }
    }

    public final class i1LIL11l extends MediaCodec.Callback {
        public i1LIL11l() {
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("wh7p0GHor/vqGK3cctmv7Q==\n", "j3uNuQCrwJ8=\n"), codecException);
            iILlLIlli.this.I1iIiIi();
        }

        @TargetApi(24)
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            try {
                iILlLIlli.this.iilLil1i11I1.put(new illlI1lLIL(i));
            } catch (InterruptedException unused) {
                iILlLIlli.this.I1iIiIi();
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            try {
                iILlLIlli.this.I11lLL1.put(new il1LilLllii(i, bufferInfo));
            } catch (InterruptedException unused) {
                iILlLIlli.this.I1iIiIi();
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        }
    }
}
