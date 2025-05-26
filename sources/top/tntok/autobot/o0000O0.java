package top.tntok.autobot;

import android.os.Environment;
import android.os.StatFs;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class o0000O0 {
    public static DecimalFormat i1LIL11l = new DecimalFormat(C0387o0OOoO0o.iiI1L1iI("sEA=\n", "k3AHxRZhVTE=\n"));
    public static final int iiI1L1iI = -1;
    public static DecimalFormat illlI1lLIL = new DecimalFormat(C0387o0OOoO0o.iiI1L1iI("eVvAxA==\n", "Wmvu55TLrB4=\n"));

    public static class i1LIL11l {
        public long i1LIL11l;
        public long iiI1L1iI;
        public String il1LilLllii = o0000O0.i1LIL11l(this.i1LIL11l, false);
        public String illlI1lLIL;

        public i1LIL11l(long j, long j2) {
            long j3 = j * C0086o000OoO.iiI1L1iI;
            this.iiI1L1iI = j3;
            this.i1LIL11l = j2 * C0086o000OoO.iiI1L1iI;
            this.illlI1lLIL = o0000O0.i1LIL11l(j3, false);
        }
    }

    public static class iiI1L1iI {
        public String I11lLL1;
        public long i1LIL11l;
        public String iLLLILIiLi1Ii;
        public long iiI1L1iI;
        public long iiIliillii = 0;
        public long iilLil1i11I1 = 0;
        public String il1LilLllii;
        public String illlI1lLIL;

        public iiI1L1iI(long j, long j2, long j3, long j4) {
            this.iiI1L1iI = j;
            this.i1LIL11l = j2;
            this.illlI1lLIL = o0000O0.i1LIL11l(j, false);
            this.il1LilLllii = o0000O0.i1LIL11l(this.i1LIL11l, false);
            this.iiIliillii = j3;
            this.iilLil1i11I1 = j4;
            this.I11lLL1 = o0000O0.i1LIL11l(j3, false);
            this.iLLLILIiLi1Ii = o0000O0.i1LIL11l(this.iilLil1i11I1, false);
        }
    }

    public static i1LIL11l I11lLL1() {
        Pattern compile = Pattern.compile(C0387o0OOoO0o.iiI1L1iI("bHwG1oNSZSsZDE7BpWBiWRhDTNI=\n", "RCdn+/kTSHE=\n"));
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(C0387o0OOoO0o.iiI1L1iI("wYFEi2jTZtKDmFiCZA==\n", "7vE25Av8C7c=\n"), C0387o0OOoO0o.iiI1L1iI("hQ==\n", "9w8zhCNmCsI=\n"));
            long j = 0;
            long j2 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group.equalsIgnoreCase(C0387o0OOoO0o.iiI1L1iI("P1HpNueZNvE=\n", "cjSEYojtV50=\n"))) {
                            j = Long.parseLong(group2);
                        } else if (group.equalsIgnoreCase(C0387o0OOoO0o.iiI1L1iI("0Ev5qHGUjw==\n", "nS6U7gPx6u8=\n"))) {
                            j2 += Long.parseLong(group2);
                        }
                    }
                } else {
                    randomAccessFile.close();
                    return new i1LIL11l(j, j2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long IiIIlIL() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public static String i1LIL11l(long j, boolean z) {
        DecimalFormat decimalFormat;
        if (z) {
            decimalFormat = i1LIL11l;
        } else {
            decimalFormat = illlI1lLIL;
        }
        C0387o0OOoO0o.iiI1L1iI("psA=\n", "lo12oORwwAs=\n");
        if (j < C0086o000OoO.iiI1L1iI && j > 0) {
            return decimalFormat.format((double) j) + C0387o0OOoO0o.iiI1L1iI("/A==\n", "vse4WE4FA2g=\n");
        } else if (j < C0086o000OoO.illlI1lLIL) {
            return decimalFormat.format(((double) j) / 1024.0d) + C0387o0OOoO0o.iiI1L1iI("Lg==\n", "ZRPGJ7AJWm4=\n");
        } else if (j < C0086o000OoO.iiIliillii) {
            return decimalFormat.format(((double) j) / 1048576.0d) + C0387o0OOoO0o.iiI1L1iI("Cg==\n", "RyrsLFZ2kvY=\n");
        } else {
            return decimalFormat.format(((double) j) / 1.073741824E9d) + C0387o0OOoO0o.iiI1L1iI("FA==\n", "U4J78sEPE2s=\n");
        }
    }

    public static long iLLLILIiLi1Ii() {
        try {
            if (!iiI1L1iI()) {
                return -1;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean iiI1L1iI() {
        return Environment.getExternalStorageState().equals(C0387o0OOoO0o.iiI1L1iI("vymLMRwX4Q==\n", "0kb+X2hyhXI=\n"));
    }

    public static iiI1L1iI iiIliillii() {
        long il1LilLllii = il1LilLllii();
        return new iiI1L1iI(IiIIlIL(), il1LilLllii, iLLLILIiLi1Ii(), illlI1lLIL());
    }

    public static i1LIL11l iilLil1i11I1() {
        return I11lLL1();
    }

    public static long il1LilLllii() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long illlI1lLIL() {
        try {
            if (!iiI1L1iI()) {
                return -1;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception unused) {
            return -1;
        }
    }
}
