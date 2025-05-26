package top.tntok.autobot.Model;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import top.tntok.autobot.C0033Oooo0oO;
import top.tntok.autobot.C0387o0OOoO0o;
import top.tntok.autobot.C0391o0OOoOo0;

public class ShortPackageInfo {
    public Long firstInstallTime;
    public String icon = C0387o0OOoO0o.iiI1L1iI("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\n", "gX2pjMnCSok=\n");
    public String label;
    public Long lastUpdateTime;
    public int minSdkVersion;
    public String packageName;
    public int targetSdkVersion;
    public int versionCode;
    public String versionName;

    public ShortPackageInfo(PackageInfo packageInfo, PackageManager packageManager) {
        Drawable drawable;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        this.packageName = applicationInfo.packageName;
        this.versionCode = packageInfo.versionCode;
        this.versionName = packageInfo.versionName;
        if (Build.VERSION.SDK_INT >= 24) {
            this.minSdkVersion = applicationInfo.minSdkVersion;
        }
        this.targetSdkVersion = packageInfo.applicationInfo.targetSdkVersion;
        this.firstInstallTime = Long.valueOf(packageInfo.firstInstallTime);
        this.lastUpdateTime = Long.valueOf(packageInfo.lastUpdateTime);
        if (packageManager != null) {
            try {
                this.label = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                try {
                    drawable = packageInfo.applicationInfo.loadIcon(packageManager);
                } catch (Exception e) {
                    e.printStackTrace();
                    drawable = packageInfo.applicationInfo.loadLogo(packageManager);
                }
                if (drawable != null) {
                    String iiI1L1iI = C0033Oooo0oO.iiI1L1iI(drawable);
                    if (!C0391o0OOoOo0.iiI1L1iI(iiI1L1iI)) {
                        this.icon = C0387o0OOoO0o.iiI1L1iI("QTd6vPEDOUtCMyGtpQ1vSEQla+v/Rg==\n", "JVYO3ctqVCo=\n") + iiI1L1iI;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
