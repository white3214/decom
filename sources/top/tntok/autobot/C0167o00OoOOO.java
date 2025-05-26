package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: top.tntok.autobot.o00OoOOO  reason: case insensitive filesystem */
public final class C0167o00OoOOO {
    public static String I11lLL1(String str, iIII1lLI111[] iiii1lli111Arr) {
        String str2 = str;
        iIII1lLI111[] iiii1lli111Arr2 = iiii1lli111Arr;
        int i = 70;
        StringBuilder sb = new StringBuilder(C0387o0OOoO0o.iiI1L1iI("OxaWbNiNPno=\n", "d3/lGPjiWFo=\n"));
        sb.append(str2);
        sb.append(C0387o0OOoO0o.iiI1L1iI("alcLmhDdNrk5CA==\n", "SjJl+X+5U8s=\n"));
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        int length = iiii1lli111Arr2.length;
        int i2 = 0;
        while (i2 < length) {
            iIII1lLI111 iiii1lli111 = iiii1lli111Arr2[i2];
            MediaCodecInfo[] iiI1L1iI = iIli1Lil1llL.iiI1L1iI(mediaCodecList, iiii1lli111.il1LilLllii());
            int length2 = iiI1L1iI.length;
            int i3 = 0;
            while (i3 < length2) {
                MediaCodecInfo mediaCodecInfo = iiI1L1iI[i3];
                int length3 = sb.length();
                sb.append(C0387o0OOoO0o.iiI1L1iI("Er5g6mErUA==\n", "GJ5AykEGfaI=\n"));
                sb.append(str2);
                sb.append(C0387o0OOoO0o.iiI1L1iI("m6E1yMwAfw==\n", "tsJarKljQjA=\n"));
                sb.append(iiii1lli111.iiI1L1iI());
                sb.append(C0387o0OOoO0o.iiI1L1iI("uBoC\n", "mDcvS7v5vHQ=\n"));
                sb.append(str2);
                sb.append(C0387o0OOoO0o.iiI1L1iI("w0jOjWJImEzT\n", "7i2g7g0s/T4=\n"));
                sb.append(mediaCodecInfo.getName());
                if (Build.VERSION.SDK_INT >= 29) {
                    int length4 = sb.length() - length3;
                    if (length4 < i) {
                        sb.append(String.format(C0387o0OOoO0o.iiI1L1iI("jQ==\n", "qIEQ0K3j+z4=\n") + (70 - length4) + C0387o0OOoO0o.iiI1L1iI("ag==\n", "GdDJB1Ctx4U=\n"), new Object[]{" "}));
                    }
                    sb.append(C0387o0OOoO0o.iiI1L1iI("P5A=\n", "H7j1mauZcA4=\n"));
                    sb.append(iilLiIIIi11i(mediaCodecInfo));
                    sb.append(')');
                    if (mediaCodecInfo.isVendor()) {
                        sb.append(C0387o0OOoO0o.iiI1L1iI("TQwLzegumxcw\n", "bVd9qIZK9GU=\n"));
                    }
                    if (mediaCodecInfo.isAlias()) {
                        sb.append(C0387o0OOoO0o.iiI1L1iI("w3fDP37rqWeFMNBz\n", "41+iUxeK2kc=\n"));
                        sb.append(mediaCodecInfo.getCanonicalName());
                        sb.append(')');
                    }
                }
                i3++;
                i = 70;
            }
            i2++;
            i = 70;
        }
        return sb.toString();
    }

    public static String IiIIlIL(int i) {
        if (i == 0) {
            return C0387o0OOoO0o.iiI1L1iI("GkCdGHo=\n", "fDLydg7k29g=\n");
        }
        if (i == 1) {
            return C0387o0OOoO0o.iiI1L1iI("A5dT5A==\n", "YfYwj0xLBzw=\n");
        }
        if (i != 2) {
            return C0387o0OOoO0o.iiI1L1iI("/kkPtV0G4A==\n", "iydk2zJxjqQ=\n");
        }
        return C0387o0OOoO0o.iiI1L1iI("u9Pl7pNI0oc=\n", "3quRi+Ems+s=\n");
    }

    public static SortedSet<Integer> IiiL1llIIi(Range<Integer>[] rangeArr) {
        TreeSet treeSet = new TreeSet();
        for (Range<Integer> upper : rangeArr) {
            treeSet.add(upper.getUpper());
        }
        return treeSet;
    }

    public static String i1LIL11l() {
        return illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("u34XouIoDdaWZxSl+A==\n", "9xdk1sJHa/Y=\n"), OooOO0O.i1L1lLllLLlIi());
    }

    public static /* synthetic */ int iILiI1lll(OooOOO0 oooOOO0, OooOOO0 oooOOO02) {
        int i = -Boolean.compare(oooOOO0.illlI1lLIL(), oooOOO02.illlI1lLIL());
        if (i != 0) {
            return i;
        }
        int compare = Objects.compare(oooOOO0.iiI1L1iI(), oooOOO02.iiI1L1iI(), new C0484o0OoooOo());
        if (compare != 0) {
            return compare;
        }
        return Objects.compare(oooOOO0.i1LIL11l(), oooOOO02.i1LIL11l(), new C0484o0OoooOo());
    }

    public static String iLLLILIiLi1Ii() {
        return I11lLL1(C0387o0OOoO0o.iiI1L1iI("xvdilzM=\n", "sJ4G8lzWBnI=\n"), C0493o0o000OO.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011a A[Catch:{ CameraAccessException -> 0x016c }, LOOP:2: B:31:0x0118->B:32:0x011a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String iiIliillii(boolean r15) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "K+9GH6IC1owE51gO8AzDlg==\n"
            java.lang.String r2 = "Z4Y1a4JtsKw=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            r0.<init>(r1)
            android.hardware.camera2.CameraManager r1 = top.tntok.autobot.o0OOOO0o.i1LIL11l()
            java.lang.String[] r2 = r1.getCameraIdList()     // Catch:{ CameraAccessException -> 0x016c }
            if (r2 == 0) goto L_0x0160
            int r3 = r2.length     // Catch:{ CameraAccessException -> 0x016c }
            if (r3 != 0) goto L_0x001c
            goto L_0x0160
        L_0x001c:
            int r3 = r2.length     // Catch:{ CameraAccessException -> 0x016c }
            r4 = 0
            r5 = 0
        L_0x001f:
            if (r5 >= r3) goto L_0x0177
            r6 = r2[r5]     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r7 = "b1M8hma5vK0EHnnUJ7n4qlg=\n"
            java.lang.String r8 = "ZXMcpkaUkc4=\n"
            java.lang.String r7 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r7, r8)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r7)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r6)     // Catch:{ CameraAccessException -> 0x016c }
            android.hardware.camera2.CameraCharacteristics r7 = r1.getCameraCharacteristics(r6)     // Catch:{ CameraAccessException -> 0x016c }
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.Object r8 = r7.get(r8)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ CameraAccessException -> 0x016c }
            int r8 = r8.intValue()     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r9 = "p1ZJmwM=\n"
            java.lang.String r10 = "h3ZpuyuVkgc=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r9)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r8 = IiIIlIL(r8)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r8)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r8 = "yE0=\n"
            java.lang.String r9 = "5G3wgEm5Kwo=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r8)     // Catch:{ CameraAccessException -> 0x016c }
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.Object r8 = r7.get(r8)     // Catch:{ CameraAccessException -> 0x016c }
            android.graphics.Rect r8 = (android.graphics.Rect) r8     // Catch:{ CameraAccessException -> 0x016c }
            int r9 = r8.width()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r9)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r9 = "9Q==\n"
            java.lang.String r10 = "jTTZOMd5IT4=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r9)     // Catch:{ CameraAccessException -> 0x016c }
            int r8 = r8.height()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r8)     // Catch:{ CameraAccessException -> 0x016c }
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch:{ Exception -> 0x009a }
            java.lang.Object r8 = r7.get(r8)     // Catch:{ Exception -> 0x009a }
            android.util.Range[] r8 = (android.util.Range[]) r8     // Catch:{ Exception -> 0x009a }
            java.util.SortedSet r8 = IiiL1llIIi(r8)     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = "hFEF9cMu\n"
            java.lang.String r10 = "qHFjhbATQjg=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ Exception -> 0x009a }
            r0.append(r9)     // Catch:{ Exception -> 0x009a }
            r0.append(r8)     // Catch:{ Exception -> 0x009a }
            goto L_0x00b5
        L_0x009a:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x016c }
            r9.<init>()     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r10 = "1SCgbCKQjGXib7JlMpCDfPcmuWEk3Icq8D20bSOQkGviKqYgIN+QKvUuuGU00cI=\n"
            java.lang.String r11 = "lk/VAEaw4go=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r11)     // Catch:{ CameraAccessException -> 0x016c }
            r9.append(r10)     // Catch:{ CameraAccessException -> 0x016c }
            r9.append(r6)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r6 = r9.toString()     // Catch:{ CameraAccessException -> 0x016c }
            top.tntok.autobot.C0525o0oOO.iilLiIIIi11i(r6, r8)     // Catch:{ CameraAccessException -> 0x016c }
        L_0x00b5:
            r6 = 41
            r0.append(r6)     // Catch:{ CameraAccessException -> 0x016c }
            if (r15 == 0) goto L_0x015c
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ CameraAccessException -> 0x016c }
            android.hardware.camera2.params.StreamConfigurationMap r7 = (android.hardware.camera2.params.StreamConfigurationMap) r7     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.Class<android.media.MediaCodec> r8 = android.media.MediaCodec.class
            android.util.Size[] r8 = r7.getOutputSizes(r8)     // Catch:{ CameraAccessException -> 0x016c }
            if (r8 == 0) goto L_0x00f7
            int r9 = r8.length     // Catch:{ CameraAccessException -> 0x016c }
            if (r9 != 0) goto L_0x00d0
            goto L_0x00f7
        L_0x00d0:
            int r9 = r8.length     // Catch:{ CameraAccessException -> 0x016c }
            r10 = 0
        L_0x00d2:
            if (r10 >= r9) goto L_0x0102
            r11 = r8[r10]     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r12 = "i7O4uLc42t2hvrg=\n"
            java.lang.String r13 = "gZOYmJcY+v0=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r13)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r12)     // Catch:{ CameraAccessException -> 0x016c }
            int r12 = r11.getWidth()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r12)     // Catch:{ CameraAccessException -> 0x016c }
            r12 = 120(0x78, float:1.68E-43)
            r0.append(r12)     // Catch:{ CameraAccessException -> 0x016c }
            int r11 = r11.getHeight()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r11)     // Catch:{ CameraAccessException -> 0x016c }
            int r10 = r10 + 1
            goto L_0x00d2
        L_0x00f7:
            java.lang.String r8 = "dZjsMBfkfe9fkKJ/WaF0\n"
            java.lang.String r9 = "f7jMEDfEXc8=\n"
            java.lang.String r8 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r8, r9)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r8)     // Catch:{ CameraAccessException -> 0x016c }
        L_0x0102:
            android.util.Size[] r8 = r7.getHighSpeedVideoSizes()     // Catch:{ CameraAccessException -> 0x016c }
            if (r8 == 0) goto L_0x015c
            int r9 = r8.length     // Catch:{ CameraAccessException -> 0x016c }
            if (r9 <= 0) goto L_0x015c
            java.lang.String r9 = "zjjIIZj9uc2tf4Ahy6384KA4i2DIqez3oTjALJW++Oihaoks0LT+7elrmGTdubC/\n"
            java.lang.String r10 = "xBjoAbjdmYU=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r9)     // Catch:{ CameraAccessException -> 0x016c }
            int r9 = r8.length     // Catch:{ CameraAccessException -> 0x016c }
            r10 = 0
        L_0x0118:
            if (r10 >= r9) goto L_0x015c
            r11 = r8[r10]     // Catch:{ CameraAccessException -> 0x016c }
            android.util.Range[] r12 = r7.getHighSpeedVideoFpsRanges()     // Catch:{ CameraAccessException -> 0x016c }
            java.util.SortedSet r12 = IiiL1llIIi(r12)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r13 = "XoNBDG/ZrnV0jkE=\n"
            java.lang.String r14 = "VKNhLE/5jlU=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r13)     // Catch:{ CameraAccessException -> 0x016c }
            int r13 = r11.getWidth()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r13)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r13 = "cg==\n"
            java.lang.String r14 = "CociblddNlU=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r13)     // Catch:{ CameraAccessException -> 0x016c }
            int r11 = r11.getHeight()     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r11)     // Catch:{ CameraAccessException -> 0x016c }
            java.lang.String r11 = "JzYmqBBA\n"
            java.lang.String r13 = "Bx5A2GN9IGM=\n"
            java.lang.String r11 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r11, r13)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r11)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r12)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r6)     // Catch:{ CameraAccessException -> 0x016c }
            int r10 = r10 + 1
            goto L_0x0118
        L_0x015c:
            int r5 = r5 + 1
            goto L_0x001f
        L_0x0160:
            java.lang.String r15 = "wlAOdCTwzfOmFQc=\n"
            java.lang.String r1 = "yHAuVATYo5w=\n"
            java.lang.String r15 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r15, r1)     // Catch:{ CameraAccessException -> 0x016c }
            r0.append(r15)     // Catch:{ CameraAccessException -> 0x016c }
            goto L_0x0177
        L_0x016c:
            java.lang.String r15 = "9bG3xm18rQqc9OSVbTCpB5b0888=\n"
            java.lang.String r1 = "/5GX5k1UzGk=\n"
            java.lang.String r15 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r15, r1)
            r0.append(r15)
        L_0x0177:
            java.lang.String r15 = r0.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0167o00OoOOO.iiIliillii(boolean):java.lang.String");
    }

    @TargetApi(29)
    public static String iilLiIIIi11i(MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo.isSoftwareOnly()) {
            return C0387o0OOoO0o.iiI1L1iI("JaU=\n", "VtJK2xITAxU=\n");
        }
        if (mediaCodecInfo.isHardwareAccelerated()) {
            return C0387o0OOoO0o.iiI1L1iI("I3Q=\n", "SwN5pDUU1ww=\n");
        }
        return C0387o0OOoO0o.iiI1L1iI("ciZ8wWki\n", "Gl8eswBGRSE=\n");
    }

    public static String iilLil1i11I1() {
        StringBuilder sb = new StringBuilder(C0387o0OOoO0o.iiI1L1iI("I+Grm3cFAyML4aufOwsccFU=\n", "b4jY71dqZQM=\n"));
        C0028Oooo00o il1LilLllii = o0OOOO0o.il1LilLllii();
        int[] iilLil1i11I1 = il1LilLllii.iilLil1i11I1();
        if (iilLil1i11I1 == null || iilLil1i11I1.length == 0) {
            sb.append(C0387o0OOoO0o.iiI1L1iI("juXAkPeHF9DqoMk=\n", "hMXgsNeveb8=\n"));
        } else {
            for (int i : iilLil1i11I1) {
                sb.append(C0387o0OOoO0o.iiI1L1iI("re3plL0mahnOvrnY/HJqFMPw\n", "p83JtJ0LR30=\n"));
                sb.append(i);
                sb.append(C0387o0OOoO0o.iiI1L1iI("CQ1CvN0=\n", "KS1inPUhcIU=\n"));
                Oooo000 I11lLL1 = il1LilLllii.I11lLL1(i);
                if (I11lLL1 != null) {
                    C0363o0OOOo0O iilLil1i11I12 = I11lLL1.iilLil1i11I1();
                    sb.append(iilLil1i11I12.illlI1lLIL());
                    sb.append(C0387o0OOoO0o.iiI1L1iI("wA==\n", "uCep/aGTJfg=\n"));
                    sb.append(iilLil1i11I12.iiI1L1iI());
                } else {
                    sb.append(C0387o0OOoO0o.iiI1L1iI("HlnLqRqILRoDX8ai\n", "bTCxzDr9Q3E=\n"));
                }
                sb.append(C0387o0OOoO0o.iiI1L1iI("Gg==\n", "M/iL7LyCApk=\n"));
            }
        }
        return sb.toString();
    }

    public static String il1LilLllii() {
        return I11lLL1(C0387o0OOoO0o.iiI1L1iI("BUl8c9s=\n", "ZDwYGrQT3Xc=\n"), iLiI1Llil.values());
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static String illlI1lLIL(String str, List<OooOOO0> list) {
        StringBuilder sb = new StringBuilder(str);
        Collections.sort(list, new C0165o00OoOO());
        for (OooOOO0 next : list) {
            String iiI1L1iI = next.iiI1L1iI();
            int length = 30 - iiI1L1iI.length();
            sb.append("\n ");
            if (next.illlI1lLIL()) {
                sb.append(C0387o0OOoO0o.iiI1L1iI("lUc=\n", "v2dhV/Nfkm8=\n"));
            } else {
                sb.append(C0387o0OOoO0o.iiI1L1iI("rls=\n", "g3vJQ+buF0Q=\n"));
            }
            sb.append(iiI1L1iI);
            if (length > 0) {
                sb.append(String.format(C0387o0OOoO0o.iiI1L1iI("WQ==\n", "fHp7PWSD768=\n") + length + C0387o0OOoO0o.iiI1L1iI("sw==\n", "wI9/lMp+q7E=\n"), new Object[]{" "}));
            } else {
                sb.append("\n   ");
                sb.append(String.format(C0387o0OOoO0o.iiI1L1iI("7NAXPQ==\n", "yeMnTo2upvQ=\n"), new Object[]{" "}));
            }
            sb.append(" ");
            sb.append(next.i1LIL11l());
        }
        return sb.toString();
    }
}
