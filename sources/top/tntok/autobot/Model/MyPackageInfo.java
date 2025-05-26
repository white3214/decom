package top.tntok.autobot.Model;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import top.tntok.autobot.C0033Oooo0oO;
import top.tntok.autobot.C0387o0OOoO0o;

public class MyPackageInfo {
    public final List<MyActivityInfo> activities;
    public final MyApplicationInfo applicationInfo;
    public final SubPackageInfo packageInfo;
    public final List<MyPermissionInfo> permissions;
    public final List<MyProviderInfo> providers;
    public final List<MyActivityInfo> receivers;
    public final List<MyFeatureInfo> reqFeatures;
    public final String[] requestedPermissions;
    public final List<MyServiceInfo> services;
    public String singnatures;

    public static class MyActivityInfo {
        public String applicationInfo;
        public String[] attributionTags;
        public int banner;
        public int colorMode;
        public int configChanges;
        public int descriptionRes;
        public boolean directBootAware;
        public int documentLaunchMode;
        public boolean enabled;
        public boolean exported;
        public int flags;
        public int icon;
        public int labelRes;
        public int launchMode;
        public int logo;
        public int maxRecents;
        public String metaData;
        public String name;
        public String nonLocalizedLabel;
        public String packageName;
        public String parentActivityName;
        public String permission;
        public int persistableMode;
        public String processName;
        public String requiredDisplayCategory;
        public int screenOrientation;
        public int softInputMode;
        public String splitName;
        public String targetActivity;
        public String taskAffinity;
        public int theme;
        public int uiOptions;
        public String windowLayout;

        public MyActivityInfo(ActivityInfo activityInfo) {
            String str;
            this.banner = activityInfo.banner;
            this.icon = activityInfo.icon;
            this.labelRes = activityInfo.labelRes;
            this.logo = activityInfo.logo;
            this.name = activityInfo.name;
            CharSequence charSequence = activityInfo.nonLocalizedLabel;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            this.nonLocalizedLabel = str;
            this.packageName = activityInfo.packageName;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                this.attributionTags = activityInfo.attributionTags;
            }
            this.descriptionRes = activityInfo.descriptionRes;
            if (i >= 24) {
                this.directBootAware = activityInfo.directBootAware;
            }
            this.enabled = activityInfo.enabled;
            this.exported = activityInfo.exported;
            this.processName = activityInfo.processName;
            if (i >= 26) {
                this.splitName = activityInfo.splitName;
            }
            if (i >= 26) {
                this.colorMode = activityInfo.colorMode;
            }
            this.configChanges = activityInfo.configChanges;
            this.documentLaunchMode = activityInfo.documentLaunchMode;
            this.flags = activityInfo.flags;
            this.launchMode = activityInfo.launchMode;
            this.maxRecents = activityInfo.maxRecents;
            this.parentActivityName = activityInfo.parentActivityName;
            this.permission = activityInfo.permission;
            this.persistableMode = activityInfo.persistableMode;
            this.screenOrientation = activityInfo.screenOrientation;
            this.softInputMode = activityInfo.softInputMode;
            this.targetActivity = activityInfo.targetActivity;
            this.taskAffinity = activityInfo.taskAffinity;
            this.theme = activityInfo.theme;
            this.uiOptions = activityInfo.uiOptions;
        }

        public static List<MyActivityInfo> transform(ActivityInfo[] activityInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (activityInfoArr != null && activityInfoArr.length > 0) {
                for (ActivityInfo myActivityInfo : activityInfoArr) {
                    arrayList.add(new MyActivityInfo(myActivityInfo));
                }
            }
            return arrayList;
        }
    }

    public static class MyApplicationInfo {
        public String appComponentFactory;
        public String backupAgentName;
        public int category;
        public String className;
        public int compatibleWidthLimitDp;
        public int compileSdkVersion;
        public String compileSdkVersionCodename;
        public String dataDir;
        public int descriptionRes;
        public String deviceProtectedDataDir;
        public boolean enabled;
        public int flags;
        public int largestWidthLimitDp;
        public String manageSpaceActivityName;
        public int minSdkVersion;
        public String nativeLibraryDir;
        public String permission;
        public String processName;
        public String publicSourceDir;
        public int requiresSmallestWidthDp;
        public String[] sharedLibraryFiles;
        public String sourceDir;
        public String[] splitNames;
        public String[] splitPublicSourceDirs;
        public String[] splitSourceDirs;
        public String storageUuid;
        public int targetSdkVersion;
        public String taskAffinity;
        public int theme;
        public int uiOptions;
        public int uid;

        public MyApplicationInfo(ApplicationInfo applicationInfo) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.appComponentFactory = applicationInfo.appComponentFactory;
            }
            this.backupAgentName = applicationInfo.backupAgentName;
            if (i >= 26) {
                this.category = applicationInfo.category;
            }
            this.className = applicationInfo.className;
            this.compatibleWidthLimitDp = applicationInfo.compatibleWidthLimitDp;
            if (i >= 31) {
                this.compileSdkVersion = applicationInfo.compileSdkVersion;
            }
            if (i >= 31) {
                this.compileSdkVersionCodename = applicationInfo.compileSdkVersionCodename;
            }
            this.dataDir = applicationInfo.dataDir;
            this.descriptionRes = applicationInfo.descriptionRes;
            if (i >= 24) {
                this.deviceProtectedDataDir = applicationInfo.deviceProtectedDataDir;
            }
            this.enabled = applicationInfo.enabled;
            this.flags = applicationInfo.flags;
            this.largestWidthLimitDp = applicationInfo.largestWidthLimitDp;
            this.manageSpaceActivityName = applicationInfo.manageSpaceActivityName;
            if (i >= 24) {
                this.minSdkVersion = applicationInfo.minSdkVersion;
            }
            this.nativeLibraryDir = applicationInfo.nativeLibraryDir;
            this.permission = applicationInfo.permission;
            this.processName = applicationInfo.processName;
            this.publicSourceDir = applicationInfo.publicSourceDir;
            this.requiresSmallestWidthDp = applicationInfo.requiresSmallestWidthDp;
            this.sharedLibraryFiles = applicationInfo.sharedLibraryFiles;
            this.sourceDir = applicationInfo.sourceDir;
            if (i >= 26) {
                this.splitNames = applicationInfo.splitNames;
            }
            this.splitPublicSourceDirs = applicationInfo.splitPublicSourceDirs;
            this.splitSourceDirs = applicationInfo.splitSourceDirs;
            if (i >= 26) {
                this.storageUuid = applicationInfo.storageUuid.toString();
            }
            this.targetSdkVersion = applicationInfo.targetSdkVersion;
            this.taskAffinity = applicationInfo.taskAffinity;
            this.theme = applicationInfo.theme;
            this.uiOptions = applicationInfo.uiOptions;
            this.uid = applicationInfo.uid;
        }
    }

    public static class MyFeatureInfo {
        public int flags;
        public String name;
        public int reqGlEsVersion;
        public int version;

        public MyFeatureInfo(FeatureInfo featureInfo) {
            this.flags = featureInfo.flags;
            this.name = featureInfo.name;
            this.reqGlEsVersion = featureInfo.reqGlEsVersion;
            if (Build.VERSION.SDK_INT >= 24) {
                this.version = featureInfo.version;
            }
        }

        public static List<MyFeatureInfo> transform(FeatureInfo[] featureInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (featureInfoArr != null && featureInfoArr.length > 0) {
                for (FeatureInfo myFeatureInfo : featureInfoArr) {
                    arrayList.add(new MyFeatureInfo(myFeatureInfo));
                }
            }
            return arrayList;
        }
    }

    public static class MyPermissionInfo {
        public int banner;
        public int descriptionRes;
        public int flags;
        public String group;
        public int icon;
        public int labelRes;
        public int logo;
        public String metaData;
        public String name;
        public String nonLocalizedDescription;
        public String nonLocalizedLabel;
        public String packageName;
        public int protectionLevel;

        public MyPermissionInfo(PermissionInfo permissionInfo) {
            String str;
            this.banner = permissionInfo.banner;
            this.icon = permissionInfo.icon;
            this.labelRes = permissionInfo.labelRes;
            this.logo = permissionInfo.logo;
            this.name = permissionInfo.name;
            CharSequence charSequence = permissionInfo.nonLocalizedLabel;
            String str2 = null;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            this.nonLocalizedLabel = str;
            this.packageName = permissionInfo.packageName;
            this.descriptionRes = permissionInfo.descriptionRes;
            this.flags = permissionInfo.flags;
            this.group = permissionInfo.group;
            CharSequence charSequence2 = permissionInfo.nonLocalizedDescription;
            this.nonLocalizedDescription = charSequence2 != null ? charSequence2.toString() : str2;
            this.protectionLevel = permissionInfo.protectionLevel;
        }

        public static List<MyPermissionInfo> transform(PermissionInfo[] permissionInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (permissionInfoArr != null && permissionInfoArr.length > 0) {
                for (PermissionInfo myPermissionInfo : permissionInfoArr) {
                    arrayList.add(new MyPermissionInfo(myPermissionInfo));
                }
            }
            return arrayList;
        }
    }

    public static class MyProviderInfo {
        public String applicationInfo;
        public String[] attributionTags;
        public String authority;
        public int banner;
        public int descriptionRes;
        public boolean directBootAware;
        public boolean enabled;
        public boolean exported;
        public int flags;
        public boolean forceUriPermissions;
        public boolean grantUriPermissions;
        public int icon;
        public int initOrder;
        public boolean isSyncable;
        public int labelRes;
        public int logo;
        public String metaData;
        public boolean multiprocess;
        public String name;
        public String nonLocalizedLabel;
        public String packageName;
        public String pathPermissions;
        public String processName;
        public String readPermission;
        public String splitName;
        public String uriPermissionPatterns;
        public String writePermission;

        public MyProviderInfo(ProviderInfo providerInfo) {
            String str;
            this.banner = providerInfo.banner;
            this.icon = providerInfo.icon;
            this.labelRes = providerInfo.labelRes;
            this.logo = providerInfo.logo;
            this.name = providerInfo.name;
            CharSequence charSequence = providerInfo.nonLocalizedLabel;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            this.nonLocalizedLabel = str;
            this.packageName = providerInfo.packageName;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                this.attributionTags = providerInfo.attributionTags;
            }
            this.descriptionRes = providerInfo.descriptionRes;
            if (i >= 24) {
                this.directBootAware = providerInfo.directBootAware;
            }
            this.enabled = providerInfo.enabled;
            this.exported = providerInfo.exported;
            this.processName = providerInfo.processName;
            if (i >= 26) {
                this.splitName = providerInfo.splitName;
            }
            this.authority = providerInfo.authority;
            this.flags = providerInfo.flags;
            if (i >= 29) {
                this.forceUriPermissions = providerInfo.forceUriPermissions;
            }
            this.grantUriPermissions = providerInfo.grantUriPermissions;
            this.initOrder = providerInfo.initOrder;
            this.multiprocess = providerInfo.multiprocess;
            this.readPermission = providerInfo.readPermission;
            this.writePermission = providerInfo.writePermission;
        }

        public static List<MyProviderInfo> transform(ProviderInfo[] providerInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (providerInfoArr != null && providerInfoArr.length > 0) {
                for (ProviderInfo myProviderInfo : providerInfoArr) {
                    arrayList.add(new MyProviderInfo(myProviderInfo));
                }
            }
            return arrayList;
        }
    }

    public static class MyServiceInfo {
        public String applicationInfo;
        public String[] attributionTags;
        public int banner;
        public int descriptionRes;
        public boolean directBootAware;
        public boolean enabled;
        public boolean exported;
        public int flags;
        public int icon;
        public int labelRes;
        public int logo;
        public String metaData;
        public String name;
        public String nonLocalizedLabel;
        public String packageName;
        public String permission;
        public String processName;
        public String splitName;

        public MyServiceInfo(ServiceInfo serviceInfo) {
            String str;
            this.banner = serviceInfo.banner;
            this.icon = serviceInfo.icon;
            this.labelRes = serviceInfo.labelRes;
            this.logo = serviceInfo.logo;
            this.name = serviceInfo.name;
            CharSequence charSequence = serviceInfo.nonLocalizedLabel;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            this.nonLocalizedLabel = str;
            this.packageName = serviceInfo.packageName;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                this.attributionTags = serviceInfo.attributionTags;
            }
            this.descriptionRes = serviceInfo.descriptionRes;
            if (i >= 24) {
                this.directBootAware = serviceInfo.directBootAware;
            }
            this.enabled = serviceInfo.enabled;
            this.exported = serviceInfo.exported;
            this.processName = serviceInfo.processName;
            if (i >= 26) {
                this.splitName = serviceInfo.splitName;
            }
            this.flags = serviceInfo.flags;
            this.permission = serviceInfo.permission;
        }

        public static List<MyServiceInfo> transform(ServiceInfo[] serviceInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (serviceInfoArr != null && serviceInfoArr.length > 0) {
                for (ServiceInfo myServiceInfo : serviceInfoArr) {
                    arrayList.add(new MyServiceInfo(myServiceInfo));
                }
            }
            return arrayList;
        }
    }

    public static class SubPackageInfo {
        public String attributions;
        public int baseRevisionCode;
        public String configPreferences;
        public String featureGroups;
        public long firstInstallTime;
        public int[] gids;
        public String icon = C0387o0OOoO0o.iiI1L1iI("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\n", "p0vsd7gkem4=\n");
        public int installLocation;
        public String instrumentation;
        public boolean isApex;
        public String label;
        public long lastUpdateTime;
        public String packageName;
        public int[] requestedPermissionsFlags;
        public String services;
        public String sharedUserId;
        public int sharedUserLabel;
        public String[] splitNames;
        public int[] splitRevisionCodes;
        public int versionCode;
        public String versionName;

        public SubPackageInfo(PackageInfo packageInfo, PackageManager packageManager) {
            Drawable drawable;
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                this.baseRevisionCode = packageInfo.baseRevisionCode;
            }
            this.firstInstallTime = packageInfo.firstInstallTime;
            this.gids = packageInfo.gids;
            this.installLocation = packageInfo.installLocation;
            if (i >= 29) {
                this.isApex = packageInfo.isApex;
            }
            this.lastUpdateTime = packageInfo.lastUpdateTime;
            this.packageName = packageInfo.packageName;
            this.requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
            this.sharedUserId = packageInfo.sharedUserId;
            this.sharedUserLabel = packageInfo.sharedUserLabel;
            this.splitNames = packageInfo.splitNames;
            if (i >= 22) {
                this.splitRevisionCodes = packageInfo.splitRevisionCodes;
            }
            this.versionCode = packageInfo.versionCode;
            this.versionName = packageInfo.versionName;
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
                        this.icon = C0387o0OOoO0o.iiI1L1iI("OUmc0Ks29KY6TcfB/ziipTxbjYelcw==\n", "XSjosZFfmcc=\n") + C0033Oooo0oO.iiI1L1iI(drawable);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(4:6|(1:8)(1:9)|10|15)(2:11|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        r3.singnatures = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0055 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0074 A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x005b A[Catch:{ Exception -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MyPackageInfo(android.content.pm.PackageInfo r4, android.content.pm.PackageManager r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            top.tntok.autobot.Model.MyPackageInfo$SubPackageInfo r1 = new top.tntok.autobot.Model.MyPackageInfo$SubPackageInfo
            r1.<init>(r4, r5)
            r3.packageInfo = r1
            top.tntok.autobot.Model.MyPackageInfo$MyApplicationInfo r5 = new top.tntok.autobot.Model.MyPackageInfo$MyApplicationInfo
            android.content.pm.ApplicationInfo r1 = r4.applicationInfo
            r5.<init>(r1)
            r3.applicationInfo = r5
            android.content.pm.ActivityInfo[] r5 = r4.activities
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyActivityInfo.transform(r5)
            r3.activities = r5
            android.content.pm.ActivityInfo[] r5 = r4.receivers
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyActivityInfo.transform(r5)
            r3.receivers = r5
            android.content.pm.ServiceInfo[] r5 = r4.services
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyServiceInfo.transform(r5)
            r3.services = r5
            android.content.pm.PermissionInfo[] r5 = r4.permissions
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyPermissionInfo.transform(r5)
            r3.permissions = r5
            android.content.pm.FeatureInfo[] r5 = r4.reqFeatures
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyFeatureInfo.transform(r5)
            r3.reqFeatures = r5
            android.content.pm.ProviderInfo[] r5 = r4.providers
            java.util.List r5 = top.tntok.autobot.Model.MyPackageInfo.MyProviderInfo.transform(r5)
            r3.providers = r5
            java.lang.String[] r5 = r4.requestedPermissions
            r3.requestedPermissions = r5
            r5 = 0
            android.content.pm.Signature[] r1 = r4.signatures     // Catch:{ Exception -> 0x0055 }
            r1 = r1[r5]     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0055 }
            r3.singnatures = r1     // Catch:{ Exception -> 0x0055 }
            goto L_0x0079
        L_0x0055:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0077 }
            r2 = 28
            if (r1 < r2) goto L_0x0074
            android.content.pm.SigningInfo r1 = r4.signingInfo     // Catch:{ Exception -> 0x0077 }
            if (r1 != 0) goto L_0x0063
            r4 = 0
            goto L_0x0071
        L_0x0063:
            android.content.pm.SigningInfo r4 = r4.signingInfo     // Catch:{ Exception -> 0x0077 }
            android.content.pm.Signature[] r4 = r4.getApkContentsSigners()     // Catch:{ Exception -> 0x0077 }
            r4 = r4[r5]     // Catch:{ Exception -> 0x0077 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0077 }
        L_0x0071:
            r3.singnatures = r4     // Catch:{ Exception -> 0x0077 }
            goto L_0x0079
        L_0x0074:
            r3.singnatures = r0     // Catch:{ Exception -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r3.singnatures = r0
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.Model.MyPackageInfo.<init>(android.content.pm.PackageInfo, android.content.pm.PackageManager):void");
    }
}
