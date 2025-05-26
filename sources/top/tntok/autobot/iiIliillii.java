package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.InputEvent;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlSerializer;
import top.tntok.autobot.Model.ClipChangedListener;
import top.tntok.autobot.Model.MyPackageInfo;
import top.tntok.autobot.Model.NotificationListener;
import top.tntok.autobot.Model.RotationLister;
import top.tntok.autobot.Model.ShortPackageInfo;
import top.tntok.autobot.o0000O0;

public class iiIliillii {
    public static int I11lLL1 = 0;
    public static UiAutomation I1iIiIi;
    public static iI1LI1ILLllI I1l1iIll1lIi1;
    public static final String IL1lILLLL1L = C0387o0OOoO0o.iiI1L1iI("+NqAiiwmZJqT1pPwczQAvtvW3IFXfAiB/56OySZYQNPFuw==\n", "o+a+rAsEOOI=\n");
    public static int ILl1iII11Ll1 = 0;
    public static C0028Oooo00o Ii1liIIIiLi = o0OOOO0o.il1LilLllii();
    public static final File IiIIlIL = new File(C0387o0OOoO0o.iiI1L1iI("BNImoPUQaBpeyGy7+Q4=\n", "K6FCw5RiDDU=\n"));
    public static final KeyCharacterMap IiiL1llIIi = KeyCharacterMap.load(-1);
    public static iI1LI1ILLllI IilL11ii1I1Il;
    public static C0194o00o00o0 i111iLiiIIill = null;
    public static AccessibilityNodeInfo i11liIIl11Ii1;
    public static o0OOOOO i1L1lLllLLlIi;
    public static int i1iiLIil1ILi = 0;
    public static C0533o0oOoOoo iILiI1lll = new C0533o0oOoOoo();
    public static final Pattern iL1LIlIlI = Pattern.compile(C0387o0OOoO0o.iiI1L1iI("VD0E9kjjcFU/MReMF/EUcXcxWP0zuRxOU3kKtUKdVBxpXA==\n", "DwE60G/BLC0=\n"));
    public static int iLLLILIiLi1Ii = 0;
    public static MediaPlayer iiLIIiIli = new MediaPlayer();
    public static volatile iiIliillii iiiiI1iILL11I;
    public static final File iilLiIIIi11i = new File(C0387o0OOoO0o.iiI1L1iI("dyVbAac2NXEtPxEItSs/\n", "WFY/YsZEUV4=\n"));
    public static final AtomicBoolean iilLil1i11I1 = new AtomicBoolean();
    public final MotionEvent.PointerProperties[] i1LIL11l = new MotionEvent.PointerProperties[10];
    public final o0O0OO0 iiI1L1iI = new o0O0OO0();
    public long iiIliillii;
    public final Context il1LilLllii = FakeContext.iiI1L1iI();
    public final MotionEvent.PointerCoords[] illlI1lLIL = new MotionEvent.PointerCoords[10];

    public class i1LIL11l implements RotationLister.iiI1L1iI {
        public i1LIL11l() {
        }

        public void onRotationChanged(int i) {
            System.out.println(C0387o0OOoO0o.iiI1L1iI("XDrw3ZEHNK0Abu+pzR1D3C0UmayRd12jVjfz3oUxN6cRbvePzgRi\n", "uYt/OCiS0js=\n"));
            iiIliillii.IL11lll11();
        }
    }

    public class iiI1L1iI implements UiAutomation.OnAccessibilityEventListener {
        public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            Object obj;
            boolean z;
            int eventType = accessibilityEvent.getEventType();
            if (eventType == 32 || eventType == 8) {
                CharSequence packageName = accessibilityEvent.getPackageName();
                AccessibilityNodeInfo rootInActiveWindow = iiIliillii.I1iIiIi.getRootInActiveWindow();
                if (rootInActiveWindow != null) {
                    obj = rootInActiveWindow.getPackageName();
                } else {
                    obj = "";
                }
                AccessibilityNodeInfo unused = iiIliillii.i11liIIl11Ii1 = rootInActiveWindow;
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append(C0387o0OOoO0o.iiI1L1iI("QnemT6zSr5A=\n", "bwDPIci92K0=\n"));
                if (rootInActiveWindow != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                sb.append(C0387o0OOoO0o.iiI1L1iI("Qw/xg4GwlPIrHv2F2Ow=\n", "ZX+Q4OrR85c=\n"));
                sb.append(obj);
                printStream.println(sb.toString());
            }
            if (eventType == 64) {
                String charSequence = accessibilityEvent.getPackageName().toString();
                accessibilityEvent.getText().toString();
                Notification notification = (Notification) accessibilityEvent.getParcelableData();
                if (iiIliillii.i111iLiiIIill != null && notification != null) {
                    iiIliillii.i111iLiiIIill.iiI1L1iI(notification, charSequence);
                }
            }
        }
    }

    static {
        IL11lll11();
        try {
            IilL11ii1I1Il = o0OOOO0o.iiI1L1iI().i1LIL11l();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            I1l1iIll1lIi1 = o0OOOO0o.iiI1L1iI().il1LilLllii();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        new Thread(new C0421o0Oo0o00()).start();
    }

    public iiIliillii() {
        I1LiliILi1lI1();
        iLLLILIiLi1Ii(new RotationLister(new i1LIL11l()));
    }

    public static boolean I1i1iiiI(int i, int i2, int i3, int i4, int i5) {
        long uptimeMillis = SystemClock.uptimeMillis();
        return i1i1111LLILli(new KeyEvent(uptimeMillis, uptimeMillis, i, i2, i3, i4, -1, 0, 0, 257), i5);
    }

    public static iiIliillii IIIlll1lll() {
        if (iiiiI1iILL11I == null) {
            synchronized (iiIliillii.class) {
                try {
                    if (iiiiI1iILL11I == null) {
                        iiiiI1iILL11I = new iiIliillii();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return iiiiI1iILL11I;
    }

    public static int IIi1l1i() {
        return o0OOOO0o.I1iIiIi().IiiL1llIIi();
    }

    public static String IIlL1llI1() {
        CharSequence iLLLILIiLi1Ii2;
        IiIIl1LI1i illlI1lLIL2 = o0OOOO0o.illlI1lLIL();
        if (illlI1lLIL2 == null || (iLLLILIiLi1Ii2 = illlI1lLIL2.iLLLILIiLi1Ii()) == null) {
            return null;
        }
        return iLLLILIiLi1Ii2.toString();
    }

    public static void IL11lll11() {
        C0363o0OOOo0O iilLil1i11I12 = Ii1liIIIiLi.I11lLL1(0).iilLil1i11I1();
        ILl1iII11Ll1 = iilLil1i11I12.iiI1L1iI();
        i1iiLIil1ILi = iilLil1i11I12.illlI1lLIL();
    }

    public static int ILiliIiI(String str) throws Exception {
        int i = 0;
        for (char iLILliI1 : str.toCharArray()) {
            if (iLILliI1(iLILliI1)) {
                i++;
            }
        }
        return i;
    }

    public static void Ii1liIIIiLi() {
        try {
            AccessibilityNodeInfo rootInActiveWindow = iILiI1lll.iiIliillii().getRootInActiveWindow();
            if (rootInActiveWindow == null) {
                System.err.println(C0387o0OOoO0o.iiI1L1iI("ZMRhFHbhzU1U+l97VrSCVwH4XD9B+59GVeNBNUG/zUFYtmYycL6eV2DjRzRJuplKTvhxKU2/ikYP\n", "IZYzWyTb7SM=\n"));
                return;
            }
            Oooo000 I11lLL12 = o0OOOO0o.il1LilLllii().I11lLL1(0);
            C0363o0OOOo0O iilLil1i11I12 = I11lLL12.iilLil1i11I1();
            iILiI1lll.iiIliillii(rootInActiveWindow, IiIIlIL, I11lLL12.iiIliillii(), iilLil1i11I12.illlI1lLIL(), iilLil1i11I12.iiI1L1iI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(16)
    public static void IiIl11II(AccessibilityNodeInfo accessibilityNodeInfo, boolean z, XmlSerializer xmlSerializer, int i) throws IOException {
        int i2 = i + 1;
        if (i2 > 200 || accessibilityNodeInfo == null) {
            return;
        }
        if (z || accessibilityNodeInfo.isVisibleToUser()) {
            xmlSerializer.startTag((String) null, C0387o0OOoO0o.iiI1L1iI("HdOppQ==\n", "c7zNwFoCUp0=\n"));
            int i3 = iLLLILIiLi1Ii;
            iLLLILIiLi1Ii = i3 + 1;
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("G2cQg8c=\n", "cgl05r+B6MI=\n"), String.valueOf(i3));
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("5Jc1jEU=\n", "h/tU/zbjihY=\n"), i1iI1iiLL1(accessibilityNodeInfo));
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("HrWXamPGMhsY\n", "fdn+CQinUHc=\n"), String.valueOf(accessibilityNodeInfo.isClickable()));
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("ekrqDvlxh8xjduoC6Q==\n", "DCOZZ5sd4pg=\n"), String.valueOf(accessibilityNodeInfo.isVisibleToUser()));
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("IOKkzNLDnA==\n", "RYzFrr6m+OI=\n"), String.valueOf(accessibilityNodeInfo.isEnabled()));
            String IilliIIIlI1ll = IilliIIIlI1ll(accessibilityNodeInfo);
            if (IilliIIIlI1ll == null) {
                xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("Y6tLrxpSyllYqg==\n", "Ec44wG8gqTw=\n"), "");
            } else {
                xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("XxfBAmilrqVkFg==\n", "LXKybR3XzcA=\n"), IilliIIIlI1ll);
            }
            String iLlIllll = iLlIllll(accessibilityNodeInfo);
            if (iLlIllll == null) {
                xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("oiBYqQ==\n", "1kUg3Zjq4/A=\n"), "");
            } else {
                xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("YKUXUQ==\n", "FMBvJXDc8Gg=\n"), iLlIllll);
            }
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            xmlSerializer.attribute((String) null, C0387o0OOoO0o.iiI1L1iI("me50ZpE=\n", "+4EBCPVKcoE=\n"), String.format(C0387o0OOoO0o.iiI1L1iI("iTj/QK04oDuAebc=\n", "rFzTZckUhV8=\n"), new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)}));
            int childCount = accessibilityNodeInfo.getChildCount();
            if (childCount > 0) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    IiIl11II(accessibilityNodeInfo.getChild(i4), z, xmlSerializer, i2);
                }
            }
            xmlSerializer.endTag((String) null, C0387o0OOoO0o.iiI1L1iI("x9k2Yw==\n", "qbZSBnbG2ag=\n"));
        }
    }

    public static void Iiiiii1l1I1L1() {
        try {
            iILiI1lll.iiI1L1iI();
            iILiI1lll.iLLLILIiLi1Ii(false);
            UiAutomation iiIliillii2 = iILiI1lll.iiIliillii();
            I1iIiIi = iiIliillii2;
            iiIliillii2.setOnAccessibilityEventListener(new iiI1L1iI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(18)
    public static String IilliIIIlI1ll(AccessibilityNodeInfo accessibilityNodeInfo) {
        String viewIdResourceName;
        if (accessibilityNodeInfo == null || (viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName()) == null) {
            return "";
        }
        return viewIdResourceName.trim();
    }

    @TargetApi(16)
    public static JSONObject Il1llillili(AccessibilityNodeInfo accessibilityNodeInfo, boolean z, int i) {
        int i2 = i + 1;
        JSONObject jSONObject = null;
        if (i2 > 200) {
            return null;
        }
        if (accessibilityNodeInfo != null && (z || accessibilityNodeInfo.isVisibleToUser())) {
            jSONObject = new JSONObject();
            try {
                int i3 = iLLLILIiLi1Ii;
                iLLLILIiLi1Ii = i3 + 1;
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("ZJrl+iA=\n", "DfSBn1gG5m4=\n"), i3);
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("sChDq68=\n", "00Qi2NzrJ3A=\n"), i1iI1iiLL1(accessibilityNodeInfo));
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("MgblYUSrLbI0\n", "UWqMAi/KT94=\n"), accessibilityNodeInfo.isClickable());
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("h9QqiIzFAbKe6CqEnA==\n", "8b1Z4e6pZOY=\n"), accessibilityNodeInfo.isVisibleToUser());
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("74loWGNi8Q==\n", "iucJOg8HlZg=\n"), accessibilityNodeInfo.isEnabled());
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("+XEYNXrm8A==\n", "mhl9VhGDlL4=\n"), accessibilityNodeInfo.isChecked());
                String IilliIIIlI1ll = IilliIIIlI1ll(accessibilityNodeInfo);
                if (IilliIIIlI1ll == null) {
                    jSONObject.put(C0387o0OOoO0o.iiI1L1iI("/nn745y4YO7FeA==\n", "jByIjOnKA4s=\n"), "");
                } else {
                    jSONObject.put(C0387o0OOoO0o.iiI1L1iI("4tKNS+zqsRrZ0w==\n", "kLf+JJmY0n8=\n"), IilliIIIlI1ll);
                }
                String iLlIllll = iLlIllll(accessibilityNodeInfo);
                if (iLlIllll == null) {
                    jSONObject.put(C0387o0OOoO0o.iiI1L1iI("SExplQ==\n", "PCkR4YPMocQ=\n"), "");
                } else {
                    jSONObject.put(C0387o0OOoO0o.iiI1L1iI("l/DfQg==\n", "45WnNnP+OaY=\n"), iLlIllll);
                }
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                jSONObject.put(C0387o0OOoO0o.iiI1L1iI("kpxAzXE=\n", "8PM1oxV5ug0=\n"), String.format(C0387o0OOoO0o.iiI1L1iI("HPUh5/4kcIEVtGk=\n", "OZENwpoIVeU=\n"), new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)}));
                int childCount = accessibilityNodeInfo.getChildCount();
                if (childCount > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        JSONObject Il1llillili = Il1llillili(accessibilityNodeInfo.getChild(i4), z, i2);
                        if (Il1llillili != null) {
                            jSONArray.put(Il1llillili);
                        }
                    }
                    jSONObject.put(C0387o0OOoO0o.iiI1L1iI("P1emltwyza0=\n", "XD/P+rhAqMM=\n"), jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static boolean i1i1111LLILli(InputEvent inputEvent, int i) {
        return o0OOOO0o.iiIliillii().iilLil1i11I1(inputEvent, i);
    }

    public static String i1iI1iiLL1(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence className;
        if (accessibilityNodeInfo == null || (className = accessibilityNodeInfo.getClassName()) == null) {
            return "";
        }
        return className.toString().trim();
    }

    public static boolean iLILliI1(char c) {
        char[] cArr;
        String il1LilLllii2 = C0156o00Oo0Oo.il1LilLllii(c);
        if (il1LilLllii2 != null) {
            cArr = il1LilLllii2.toCharArray();
        } else {
            cArr = new char[]{c};
        }
        KeyEvent[] events = IiiL1llIIi.getEvents(cArr);
        if (events == null) {
            return false;
        }
        for (KeyEvent i1i1111LLILli : events) {
            if (!i1i1111LLILli(i1i1111LLILli, 0)) {
                return false;
            }
        }
        return true;
    }

    public static String iLlIllll(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        CharSequence contentDescription;
        if (accessibilityNodeInfo == null) {
            return "";
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (text != null) {
            str = text.toString().trim();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (contentDescription = accessibilityNodeInfo.getContentDescription()) != null) {
            str = contentDescription.toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return iL1LIlIlI.matcher(str).replaceAll("").replaceAll(C0130o00O0o00.iLLLILIiLi1Ii, C0387o0OOoO0o.iiI1L1iI("KA==\n", "BVpers1neBg=\n"));
    }

    public boolean I11iLiiIi(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = 1;
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = i5;
        }
        double d = (double) i6;
        double d2 = ((double) (i9 - i7)) / d;
        double d3 = ((double) (i10 - i8)) / d;
        boolean iLI1L1l1li = iLI1L1l1li(0, 0, new C0293o0O0O0oo(i7, i8), 1.0f, 0);
        if (z) {
            SystemClock.sleep(600);
        }
        while (i11 < i6) {
            long currentTimeMillis = System.currentTimeMillis();
            double d4 = (double) i11;
            iLI1L1l1li &= iLI1L1l1li(2, 0, new C0293o0O0O0oo(((int) (d2 * d4)) + i7, ((int) (d4 * d3)) + i8), 1.0f, 0);
            if (!iLI1L1l1li) {
                break;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j = 5;
            long j2 = 5 - currentTimeMillis2;
            if (j2 < 0) {
                j2 = 0;
            }
            if (j2 <= 5) {
                j = j2;
            }
            SystemClock.sleep(j);
            i11++;
            int i12 = i3;
            int i13 = i4;
        }
        if (z) {
            SystemClock.sleep(100);
        }
        return iLI1L1l1li(1, 0, new C0293o0O0O0oo(i3, i4), 1.0f, 0) & iLI1L1l1li;
    }

    public void I11lLL1(C0194o00o00o0 o00o00o0) {
        i111iLiiIIill = o00o00o0;
    }

    public JSONArray I1I11Il1(String str) throws Exception {
        o0o0000.iilLil1i11I1();
        try {
            return new JSONArray(I1l1iIll1lIi1.IIL1Ll1I111(str));
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray(C0387o0OOoO0o.iiI1L1iI("A7c=\n", "WOrlScCASyY=\n"));
        }
    }

    public JSONArray I1IIIi1i1ILl() {
        ArrayList arrayList = new ArrayList();
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (T t : Collections.list(inetAddresses.getInetAddresses())) {
                    if (!t.isLoopbackAddress() && (t instanceof Inet4Address)) {
                        arrayList.add(t.getHostAddress());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONArray(arrayList);
    }

    public boolean I1IILIil1lLlL(String str, boolean z) throws Exception {
        boolean ilLIlLiIILl1 = ilLIlLiIILl1(str);
        if (z && Build.VERSION.SDK_INT >= 24) {
            iiLl11ILL(279, 0);
        }
        return ilLIlLiIILl1;
    }

    public String I1ILilil1I() throws IOException {
        return C0387o0OOoO0o.iiI1L1iI("CYUMXSEWGqkKgVdWaxoQ8w+FC1ktS1s=\n", "beR4PBt/d8g=\n") + Ilili11iLIl.iiIliillii(IiL1llLiil1());
    }

    public void I1Ii1ILliII(double d, double d2) {
        ilLIlL1ILi(d, d2, 600);
    }

    public boolean I1LiILiLLIl1l(String str, String str2) throws Exception {
        o0o0000.iilLil1i11I1();
        try {
            return IilL11ii1I1Il.II1l1IliI1Li1(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void I1LiliILi1lI1() {
        for (int i = 0; i < 10; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.toolType = 1;
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = 0.0f;
            pointerCoords.size = 0.0f;
            this.i1LIL11l[i] = pointerProperties;
            this.illlI1lLIL[i] = pointerCoords;
        }
    }

    public void I1iIiIi(double d, double d2) {
        IL11lll11();
        C0293o0O0O0oo i1L1lLllLLlIi2 = i1L1lLllLLlIi(d, d2);
        if (iLI1L1l1li(0, 0, i1L1lLllLLlIi2, 1.0f, 0)) {
            SystemClock.sleep(100);
            iLI1L1l1li(1, 0, i1L1lLllLLlIi2, 1.0f, 0);
            return;
        }
        try {
            C0357o0OOOOo.i1LIL11l(String.format(C0387o0OOoO0o.iiI1L1iI("Jfs79zFq08Y8tW7mZW/D\n", "TJVLgkVKp6c=\n"), new Object[]{Integer.valueOf(i1L1lLllLLlIi2.iiI1L1iI()), Integer.valueOf(i1L1lLllLLlIi2.i1LIL11l())}), false, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void I1l1iIll1lIi1(String str, String str2, String str3, String str4, long j, long j2, int i) {
        String str5;
        String str6;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        if (!C0391o0OOoOo0.iiI1L1iI(str4)) {
            str5 = Ilili11iLIl.i1LIL11l(str4);
        } else {
            str5 = "";
        }
        if (this.il1LilLllii != null) {
            try {
                Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("xSHAQ08DuvLCO94ZEhau9Mkk3kNdFK/pySCDGV0EsA==\n", "pk6tbTx324A=\n"));
                intent.setComponent(new ComponentName(C0387o0OOoO0o.iiI1L1iI("Qs8JEc4PzuVdjhhKzg7Y5UI=\n", "NqB5P7phuoo=\n"), C0387o0OOoO0o.iiI1L1iI("7ChQfG+/Di/zaUEnb74YL+xpUjd4tBM2/TUOBnqiERL9JEU7bbQI\n", "mEcgUhvRekA=\n")));
                intent.putExtra(C0387o0OOoO0o.iiI1L1iI("GOOv+47G\n", "eYDbkuGo5tU=\n"), str7);
                intent.putExtra(C0387o0OOoO0o.iiI1L1iI("1M8HEA==\n", "uq5qdfXmPP0=\n"), str8);
                if (!C0391o0OOoOo0.iiI1L1iI(str3)) {
                    intent.putExtra(C0387o0OOoO0o.iiI1L1iI("5UygFg==\n", "lS3UfrsKTcM=\n"), str9);
                } else {
                    intent.putExtra(C0387o0OOoO0o.iiI1L1iI("EmUeY4ap\n", "YQZsCvbdoLU=\n"), str5);
                }
                try {
                    intent.putExtra(C0387o0OOoO0o.iiI1L1iI("0LF2cVQ=\n", "tNQaEC3jn8k=\n"), j);
                    try {
                        intent.putExtra(C0387o0OOoO0o.iiI1L1iI("w+5BlQf8IBI=\n", "qoA18HWKQX4=\n"), j2);
                        try {
                            intent.putExtra(C0387o0OOoO0o.iiI1L1iI("a4aaFw==\n", "B+n1ZwidRDw=\n"), i);
                            this.il1LilLllii.sendBroadcast(intent);
                            return;
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
            }
        }
        long j3 = j;
        long j4 = j2;
        int i2 = i;
        try {
            String str10 = (C0387o0OOoO0o.iiI1L1iI("9H3TBjlZZ6v2cYAQaxtn7/Z/nko4Qme98WWAEGVXc7v6eoBKKlVypvp+3RAqRW3vuH7TECRGKLv7\nZJwPZVdzu/pynBBkGHSq9nWaEi5EKJv0Y5g2LlVjpuN1gQ==\n", "lRDzZEs2Bs8=\n") + String.format(C0387o0OOoO0o.iiI1L1iI("SpY0UpiQXKEe0nZZy5VO\n", "arsZN+uwPcI=\n"), new Object[]{str7})) + String.format(C0387o0OOoO0o.iiI1L1iI("mwUPyifDN4vWTQKKJw==\n", "uygir1TjWeo=\n"), new Object[]{str8});
            if (!C0391o0OOoOo0.iiI1L1iI(str3)) {
                str6 = str10 + String.format(C0387o0OOoO0o.iiI1L1iI("1f+gEcx3WpGBuq1RzA==\n", "9dKNdL9XKvA=\n"), new Object[]{str9});
            } else {
                str6 = str10 + String.format(C0387o0OOoO0o.iiI1L1iI("iUVgDLntAxfbAT0d6ugD\n", "qWhNacrNcHQ=\n"), new Object[]{str5});
            }
            C0357o0OOOOo.i1LIL11l(((str6 + String.format(C0387o0OOoO0o.iiI1L1iI("DtLvg2EZZPBCnrvGKF0=\n", "Lv/C5g05AJU=\n"), new Object[]{Long.valueOf(j)})) + String.format(C0387o0OOoO0o.iiI1L1iI("Qt6XUUVQdEcWlshCSBw9DAY=\n", "YvO6NClwHSk=\n"), new Object[]{Long.valueOf(j2)})) + String.format(C0387o0OOoO0o.iiI1L1iI("4LKiM+U/lEGv769z6A==\n", "wJ+PVowf+C4=\n"), new Object[]{Integer.valueOf(i)}), false, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean I1lLLLlliILlI(int i) throws Exception {
        return iiLl11ILL(i, 0);
    }

    public void I1llIillii1() {
        try {
            iiLIIiIli.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void II1l1IliI1Li1(String str) {
        o0OOOO0o.iiI1L1iI().IilL11ii1I1Il(str, IIllllLiIlIl(str));
    }

    public void IIL1Ll1I111() {
        I1i1iiiI(0, 113, 0, 12288, 0);
        I1i1iiiI(0, 29, 0, 12288, 0);
        I1i1iiiI(1, 29, 0, 12288, 0);
        I1i1iiiI(1, 113, 0, C0084o000Oo0O.i111iLiiIIill, 0);
    }

    public String IILiIL1i11Li(String str) throws o0OOOOOO {
        return o0OOOOO.iilLil1i11I1(str);
    }

    public void IIlLLll1ll1(String str) {
        o0OOOO0o.iiI1L1iI().iiIliillii(str);
    }

    public JSONObject IIlLill(String str) {
        try {
            return new JSONObject(new Gson().toJson((Object) new MyPackageInfo(o0OOOO0o.I11lLL1().il1LilLllii(str), iliilLllIl1())));
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public boolean IIlllIIi1ii(MotionEvent.PointerCoords[]... pointerCoordsArr) {
        MotionEvent.PointerCoords[][] pointerCoordsArr2 = pointerCoordsArr;
        if (pointerCoordsArr2.length >= 2) {
            int i = 0;
            for (MotionEvent.PointerCoords[] pointerCoordsArr3 : pointerCoordsArr2) {
                if (i < pointerCoordsArr3.length) {
                    i = pointerCoordsArr3.length;
                }
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCoordsArr2.length];
            MotionEvent.PointerCoords[] pointerCoordsArr4 = new MotionEvent.PointerCoords[pointerCoordsArr2.length];
            for (int i2 = 0; i2 < pointerCoordsArr2.length; i2++) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = i2;
                pointerProperties.toolType = 1;
                pointerPropertiesArr[i2] = pointerProperties;
                pointerCoordsArr4[i2] = pointerCoordsArr2[i2][0];
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent.PointerCoords[] pointerCoordsArr5 = pointerCoordsArr4;
            boolean IiiIIil1l = IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 0, 1, pointerPropertiesArr, pointerCoordsArr4, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
            int i3 = 1;
            while (i3 < pointerCoordsArr2.length) {
                int i4 = i3 + 1;
                IiiIIil1l &= IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), illiiliIILI(5, i3), i4, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                i3 = i4;
            }
            for (int i5 = 1; i5 < i - 1; i5++) {
                for (int i6 = 0; i6 < pointerCoordsArr2.length; i6++) {
                    MotionEvent.PointerCoords[] pointerCoordsArr6 = pointerCoordsArr2[i6];
                    if (pointerCoordsArr6.length > i5) {
                        pointerCoordsArr5[i6] = pointerCoordsArr6[i5];
                    } else {
                        pointerCoordsArr5[i6] = pointerCoordsArr6[pointerCoordsArr6.length - 1];
                    }
                }
                IiiIIil1l &= IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 2, pointerCoordsArr2.length, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                SystemClock.sleep(5);
            }
            for (int i7 = 0; i7 < pointerCoordsArr2.length; i7++) {
                MotionEvent.PointerCoords[] pointerCoordsArr7 = pointerCoordsArr2[i7];
                pointerCoordsArr5[i7] = pointerCoordsArr7[pointerCoordsArr7.length - 1];
            }
            int i8 = 1;
            while (i8 < pointerCoordsArr2.length) {
                int i9 = i8 + 1;
                IiiIIil1l &= IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), illiiliIILI(6, i8), i9, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                i8 = i9;
            }
            return IiiIIil1l & IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 1, 1, pointerPropertiesArr, pointerCoordsArr5, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("ZreSZ3dgX2Bdq4V2d3NCYFmmiH02ZEh8C6SOYXdxWS9Hp4BgIzAfL1utiH0jdV98\n", "K8LhE1cQLQ8=\n"));
    }

    public String IIllllLiIlIl(String str) {
        String iLLLILIiLi1Ii2 = o0OOOO0o.I11lLL1().iLLLILIiLi1Ii(str);
        if (C0391o0OOoOo0.iiI1L1iI(iLLLILIiLi1Ii2)) {
            return C0387o0OOoO0o.iiI1L1iI("rBCO9QE=\n", "yWL8mnOnen0=\n");
        }
        return iLLLILIiLi1Ii2;
    }

    public Map<String, String> IL111l1() {
        return o0OOOO0o.iILiI1lll().iiIliillii();
    }

    @TargetApi(21)
    public AccessibilityNodeInfo IL1IiilLlLI() {
        List<AccessibilityWindowInfo> list;
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        try {
            list = I1iIiIi.getWindows();
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            list = null;
        }
        int i = 0;
        for (AccessibilityWindowInfo next : list) {
            AccessibilityNodeInfo root = next.getRoot();
            if (root != null) {
                Rect rect = new Rect();
                next.getBoundsInScreen(rect);
                if (((float) rect.height()) > 50.0f && rect.height() > i) {
                    i = rect.height();
                    accessibilityNodeInfo = root;
                }
            }
        }
        return accessibilityNodeInfo;
    }

    public int IL1lILLLL1L(String str) throws Exception {
        o0o0000.iilLil1i11I1();
        try {
            return IilL11ii1I1Il.IiIl11II(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void ILIiLLLL1iiii(String str) throws Exception {
        i1L1llI1LlL1l(C0387o0OOoO0o.iiI1L1iI("L1KCckX6ew==\n", "TjjdHCSXHvQ=\n"), str);
    }

    public JSONObject ILiLII1ILi() {
        HashMap<String, String> i1L1lLllLLlIi2 = o0OOOO0o.iiI1L1iI().i1L1lLllLLlIi();
        i1L1lLllLLlIi2.put(C0387o0OOoO0o.iiI1L1iI("ClSTKA==\n", "ZzX6RmchDlY=\n"), o0OOOO0o.I11lLL1().iLLLILIiLi1Ii(i1L1lLllLLlIi2.get(C0387o0OOoO0o.iiI1L1iI("IG0FqUn6I/ExYQM=\n", "UAxmwiidRr8=\n"))));
        return new JSONObject(i1L1lLllLLlIi2);
    }

    public boolean ILl1iII11Ll1(long j, Point[] pointArr) {
        Point[] pointArr2 = pointArr;
        if (pointArr2.length >= 2) {
            long ceil = (long) Math.ceil((double) (j / ((long) pointArr2.length)));
            if (ceil < 5) {
                ceil = 5;
            }
            int length = pointArr2.length;
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[length];
            for (int i = 0; i < pointArr2.length; i++) {
                Point point = pointArr2[i];
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoords.x = (float) point.x;
                pointerCoords.y = (float) point.y;
                pointerCoords.pressure = 1.0f;
                pointerCoords.size = 1.0f;
                pointerCoordsArr[i] = pointerCoords;
            }
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = 0;
            pointerProperties.toolType = 1;
            MotionEvent.PointerProperties[] pointerPropertiesArr = {pointerProperties};
            MotionEvent.PointerCoords[] pointerCoordsArr2 = {pointerCoordsArr[0]};
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent.PointerProperties[] pointerPropertiesArr2 = pointerPropertiesArr;
            boolean IiiIIil1l = IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 0, 1, pointerPropertiesArr, pointerCoordsArr2, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
            for (int i2 = 0; i2 < pointArr2.length; i2++) {
                pointerCoordsArr2[0] = pointerCoordsArr[i2];
                IiiIIil1l &= IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 2, 1, pointerPropertiesArr2, pointerCoordsArr2, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
                SystemClock.sleep(ceil);
            }
            pointerCoordsArr2[0] = pointerCoordsArr[length - 1];
            return IiiIIil1l & IiiIIil1l(MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 1, 1, pointerPropertiesArr2, pointerCoordsArr2, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("tuGVpdyzk/bFpqXwtpPmrObqxvv5y8Dnu/CmpNGa\n", "Xk4iQ1Mjd0g=\n"));
    }

    @TargetApi(16)
    public AccessibilityNodeInfo ILllI11() {
        AccessibilityNodeInfo accessibilityNodeInfo;
        try {
            accessibilityNodeInfo = I1iIiIi.getRootInActiveWindow();
        } catch (Exception e) {
            e.printStackTrace();
            accessibilityNodeInfo = null;
        }
        if (accessibilityNodeInfo == null) {
            accessibilityNodeInfo = IL1IiilLlLI();
        }
        if (accessibilityNodeInfo == null) {
            return i11liIIl11Ii1;
        }
        return accessibilityNodeInfo;
    }

    public void IiIIlIL(String str) {
        try {
            o0OOOO0o.IiiL1llIIi().il1LilLllii(str);
        } catch (Exception e) {
            e.printStackTrace();
            Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("Mll5sXF+pLY6WWmmcGPu+TBDdKxwOYTREns=\n", "Uzcdwx4XwJg=\n"));
            intent.setData(Uri.parse(C0387o0OOoO0o.iiI1L1iI("unl5sQ==\n", "zhwVi+BHaVQ=\n") + str));
            o0OOOO0o.iiI1L1iI().iL1LIlIlI(intent);
        }
    }

    public byte[] IiL1llLiil1() throws IOException {
        return iL1lL1LL(1.0f, 50);
    }

    public final boolean IiiIIil1l(InputEvent inputEvent) {
        return iLIIl1IliLlLI(inputEvent, true);
    }

    @SuppressLint({"MissingPermission"})
    public JSONObject IiiIlLl1il1i() throws Exception {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        String str4 = Build.BRAND;
        String str5 = Build.ID;
        String str6 = Build.DISPLAY;
        String str7 = Build.PRODUCT;
        String str8 = Build.DEVICE;
        String str9 = Build.BOARD;
        String str10 = Build.MANUFACTURER;
        String str11 = Build.MODEL;
        String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("BSsrsQ==\n", "a15H3eWdhlY=\n");
        String iiI1L1iI3 = C0387o0OOoO0o.iiI1L1iI("0BRW4g==\n", "vmE6jgkCAN4=\n");
        String iiI1L1iI4 = C0387o0OOoO0o.iiI1L1iI("8c3fJA==\n", "n7izSEv/Wj4=\n");
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            iiI1L1iI2 = Build.SOC_MANUFACTURER;
            iiI1L1iI3 = Build.SOC_MODEL;
            iiI1L1iI4 = Build.SKU;
        }
        String str12 = Build.BOOTLOADER;
        String str13 = Build.HARDWARE;
        if (i > 26) {
            try {
                str = Build.getSerial();
            } catch (Exception unused) {
                str = Build.SERIAL;
            }
        } else {
            str = Build.SERIAL;
        }
        String str14 = str;
        String iiI1L1iI5 = C0387o0OOoO0o.iiI1L1iI("b5LJ3g==\n", "AeelsrLzq1o=\n");
        try {
            iiI1L1iI5 = Arrays.deepToString(Build.SUPPORTED_ABIS);
        } catch (Exception unused2) {
        }
        StringBuilder sb = new StringBuilder();
        String str15 = str13;
        sb.append(Build.VERSION.SDK_INT);
        sb.append("");
        String sb2 = sb.toString();
        String str16 = Build.VERSION.RELEASE;
        String str17 = sb2;
        Oooo000 I11lLL12 = Ii1liIIIiLi.I11lLL1(0);
        C0363o0OOOo0O iilLil1i11I12 = I11lLL12.iilLil1i11I1();
        String str18 = str12;
        HashMap hashMap = new HashMap();
        String str19 = iiI1L1iI5;
        String str20 = iiI1L1iI3;
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("iRurgzk=\n", "/nLP91F10Fg=\n"), Integer.valueOf(iilLil1i11I12.illlI1lLIL()));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("71AfYGB3\n", "hzV2BwgDZqc=\n"), Integer.valueOf(iilLil1i11I12.iiI1L1iI()));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("OVAgv3AXDDE=\n", "Sz9U3gR+Y18=\n"), Integer.valueOf(I11lLL12.iiIliillii()));
        o0000O0.i1LIL11l iilLil1i11I13 = o0000O0.iilLil1i11I1();
        HashMap hashMap2 = new HashMap();
        if (iilLil1i11I13 != null) {
            str2 = iiI1L1iI2;
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("Ri5WyQ8=\n", "MkEiqGOFPGo=\n"), Long.valueOf(iilLil1i11I13.iiI1L1iI));
            str3 = str11;
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("USfBlA==\n", "N1Wk8QMYrho=\n"), Long.valueOf(iilLil1i11I13.i1LIL11l));
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("2ozjwEwLgwE=\n", "ruOXoSBY93M=\n"), iilLil1i11I13.illlI1lLIL);
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("UAKIM2yjyg==\n", "NnDtVj/XuL8=\n"), iilLil1i11I13.il1LilLllii);
        } else {
            str2 = iiI1L1iI2;
            str3 = str11;
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("Ijrf+mg=\n", "VlWrmwQ2QoQ=\n"), -1);
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("k6gG3Q==\n", "9dpjuMuql0A=\n"), -1);
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("cX2gQrP8h8k=\n", "BRLUI9+v87s=\n"), -1);
            hashMap2.put(C0387o0OOoO0o.iiI1L1iI("bwVpz0Hevg==\n", "CXcMqhKqzBQ=\n"), -1);
        }
        o0000O0.iiI1L1iI iiIliillii2 = o0000O0.iiIliillii();
        HashMap hashMap3 = new HashMap();
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("VoD1GMi+dDVHhA==\n", "Juiadq3qG0E=\n"), Long.valueOf(iiIliillii2.iiI1L1iI));
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("WBRU0jyTF4dN\n", "KHw7vFnVZeI=\n"), Long.valueOf(iiIliillii2.i1LIL11l));
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("NnvFs51z87Inf/mpig==\n", "RhOq3fgnnMY=\n"), iiIliillii2.illlI1lLIL);
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("qveVoqLU+Di/zI6+\n", "2p/6zMeSil0=\n"), iiIliillii2.il1LilLllii);
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("GFBJupe2akMfVUY=\n", "azQq2+XSPiw=\n"), Long.valueOf(iiIliillii2.iiIliillii));
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("cxiq2YfZX2dlGQ==\n", "AHzJuPW9GRU=\n"), Long.valueOf(iiIliillii2.iilLil1i11I1));
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("SPU7bWafdzJP8DRfYIk=\n", "O5FYDBT7I10=\n"), iiIliillii2.I11lLL1);
        hashMap3.put(C0387o0OOoO0o.iiI1L1iI("7/zGKHSNszT5/fY9dA==\n", "nJilSQbp9UY=\n"), iiIliillii2.iLLLILIiLi1Ii);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("xQPy2cVUBDzUHPLTxQ==\n", "pm+bvKsgUlk=\n"), 12405);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("SujsQiQ=\n", "KJqNLEBTdRU=\n"), str4);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("xfg=\n", "rJxwGv8WdeI=\n"), str5);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("bCVdMIYCMQ==\n", "CEwuQOpjSE8=\n"), str6);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("lkwvtrvx0A==\n", "5j5A0s6SpJs=\n"), str7);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("1gDMiO1i\n", "smW64Y4Hwg4=\n"), str8);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("Vye9z3E=\n", "NUjcvRUTSSk=\n"), str9);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("fZaUvRJDGGVlhZ+6\n", "EPf6yHQiexE=\n"), str10);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("kvbT2lI=\n", "/5m3vz6KcNI=\n"), str3);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("rBkJ\n", "33J8aQ6t1+w=\n"), iiI1L1iI4);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("W+h0qaz+yy1J5GORv/XM\n", "KIcX5M2Qvks=\n"), str2);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("DppNw84Z87c=\n", "ffUujqF9lts=\n"), str20);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("xBk3sA==\n", "pXtewzBnjeM=\n"), str19);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("supIyrntq2219w==\n", "0IUnvtWCygk=\n"), str18);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("0QXWJhGCWlI=\n", "uWSkQmbjKDc=\n"), str15);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("OL1xnsXq\n", "S9gD96SGDAM=\n"), str14);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("lfEfWOSe\n", "5pV0EYrqQkg=\n"), str17);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("Tqw+rKg/IQ==\n", "PMlSyclMRJo=\n"), str16);
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("nPxUpcvinEiW80g=\n", "+JUn1aeD5QE=\n"), new JSONObject(hashMap));
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("BaoUdirlBzUOoA==\n", "aM95GVicTls=\n"), new JSONObject(hashMap2));
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("gAcBufHmg90=\n", "5G5y0riI5bI=\n"), new JSONObject(hashMap3));
        jSONObject.put(C0387o0OOoO0o.iiI1L1iI("/VPlkyVTf9v3UPw=\n", "mTaT+kY2DJI=\n"), new JSONObject(IL111l1()));
        return jSONObject;
    }

    public void IiiL1llIIi(String str) {
        o0OOOO0o.I11lLL1().iiI1L1iI(str);
    }

    public void IilL11ii1I1Il() {
        try {
            o0OOOO0o.IiiL1llIIi().iiI1L1iI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(16)
    public JSONObject IillLillLLIii(boolean z) {
        if (z) {
            try {
                I1iIiIi.waitForIdle(500, C0470o0Ooo0Oo.iLLLILIiLi1Ii);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AccessibilityNodeInfo i1iLlIill1I = i1iLlIill1I();
        if (i1iLlIill1I != null) {
            i1iLlIill1I.refresh();
        }
        JSONObject Il1llillili = Il1llillili(i1iLlIill1I, false, 0);
        if (Il1llillili == null) {
            return new JSONObject();
        }
        return Il1llillili;
    }

    public void IlLLlIi1iI1li() {
        I11lLL1 = 2;
        OooOO0O.IilL11ii1I1Il(0, true);
        if (!OooOO0O.I1iIiIi(0)) {
            try {
                I1lLLLlliILlI(26);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public JSONArray IliiLiLliIl() throws JSONException {
        ArrayList<String> i1LIL11l2 = o0OOOO0o.I11lLL1().i1LIL11l();
        ArrayList arrayList = new ArrayList();
        PackageManager iliilLllIl1 = iliilLllIl1();
        Iterator<String> it = i1LIL11l2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShortPackageInfo(o0OOOO0o.I11lLL1().il1LilLllii(it.next()), iliilLllIl1));
        }
        try {
            return new JSONArray(new Gson().toJson((Object) arrayList));
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray(i1LIL11l2);
        }
    }

    public void Ilili11iLIl() {
        if (iILiI1lll.I11lLL1()) {
            try {
                iILiI1lll.i1LIL11l();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void IllLlI1IiIL(String str) {
        iiLIIiIli.reset();
        iiLIIiIli.setAudioStreamType(3);
        try {
            iiLIIiIli.setDataSource(str);
            iiLIIiIli.prepare();
            iiLIIiIli.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        r6.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[SYNTHETIC, Splitter:B:27:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:2:0x0006] */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i111iLiiIIill(boolean r6) throws java.lang.Exception {
        /*
            r5 = this;
            top.tntok.autobot.o0o0000.iilLil1i11I1()
            r0 = 0
            if (r6 == 0) goto L_0x001a
            android.app.UiAutomation r6 = I1iIiIi     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 3000(0xbb8, double:1.482E-320)
            r6.waitForIdle(r1, r3)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
            goto L_0x001a
        L_0x0010:
            r6 = move-exception
            goto L_0x006d
        L_0x0012:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ Exception -> 0x0017, all -> 0x0010 }
            goto L_0x001a
        L_0x0017:
            r6 = move-exception
            r1 = r0
            goto L_0x005f
        L_0x001a:
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.i1iLlIill1I()     // Catch:{ Exception -> 0x0017, all -> 0x0010 }
            if (r6 == 0) goto L_0x0023
            r6.refresh()     // Catch:{ Exception -> 0x0017, all -> 0x0010 }
        L_0x0023:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0017, all -> 0x0010 }
            r1.<init>()     // Catch:{ Exception -> 0x0017, all -> 0x0010 }
            org.xmlpull.v1.XmlSerializer r2 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "XPAMrD0=\n"
            java.lang.String r4 = "CaRKgQULAJc=\n"
            java.lang.String r3 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r3, r4)     // Catch:{ Exception -> 0x005e }
            r2.setOutput(r1, r3)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "DxYfw8w=\n"
            java.lang.String r4 = "WkJZ7vSpR0A=\n"
            java.lang.String r3 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r3, r4)     // Catch:{ Exception -> 0x005e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005e }
            r2.startDocument(r3, r4)     // Catch:{ Exception -> 0x005e }
            r3 = 0
            IiIl11II(r6, r3, r2, r3)     // Catch:{ Exception -> 0x005e }
            r2.endDocument()     // Catch:{ Exception -> 0x005e }
            r2.flush()     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x005e }
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005a:
            return r6
        L_0x005b:
            r6 = move-exception
            r0 = r1
            goto L_0x006d
        L_0x005e:
            r6 = move-exception
        L_0x005f:
            r6.printStackTrace()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006c:
            return r0
        L_0x006d:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0077:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iiIliillii.i111iLiiIIill(boolean):java.lang.String");
    }

    public void i11iLLllliI() {
        if (this.il1LilLllii != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(ComponentName.unflattenFromString(C0387o0OOoO0o.iiI1L1iI("SoJ1ihQGBatVw2TRFAcTq0rCK8UDHBiyV5l8ijQNArB/jnHNFgEFvQ==\n", "Pu0FpGBoccQ=\n")));
                intent.setFlags(268468224);
                this.il1LilLllii.startActivity(intent);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            C0357o0OOOOo.i1LIL11l(C0387o0OOoO0o.iiI1L1iI("hQ1qqQP4BcTETST6A/YHnpAOPrUctxbFkA8otQO2WdGHFCOsHu0OnrAFOa42+gPZkgk+o1e0EZDU\nGHvqR6lPgNRQ\n", "5GBK2neZd7A=\n"), false, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean i11liIIl11Ii1(List<o000OOo0> list) throws Exception {
        o0o0000.iilLil1i11I1();
        I1LiliILi1lI1();
        long iiI1L1iI2 = o000OOo0.iiI1L1iI(list);
        boolean z = true;
        long j = 0;
        do {
            for (int i = 0; i < list.size(); i++) {
                o000OOo0 o000ooo0 = list.get(i);
                o000ooo0.iLLLILIiLi1Ii(j);
                C0293o0O0O0oo i1LIL11l2 = o000ooo0.i1LIL11l();
                if (i1LIL11l2 != null) {
                    if (o000ooo0.iiIliillii == 2) {
                        long j2 = (long) i;
                        long j3 = j2;
                        long j4 = j2;
                        C0293o0O0O0oo o0o0o0oo = i1LIL11l2;
                        z = z & iLI1L1l1li(0, j3, o0o0o0oo, 1.0f, 0) & iLI1L1l1li(2, j4, o0o0o0oo, 1.0f, 0);
                    }
                    if (o000ooo0.iiIliillii == 3) {
                        z &= iLI1L1l1li(2, (long) i, i1LIL11l2, 1.0f, 0);
                    }
                    if (o000ooo0.iiIliillii == 4) {
                        long j5 = (long) i;
                        long j6 = j5;
                        long j7 = j5;
                        C0293o0O0O0oo o0o0o0oo2 = i1LIL11l2;
                        z = z & iLI1L1l1li(2, j6, o0o0o0oo2, 1.0f, 0) & iLI1L1l1li(1, j7, o0o0o0oo2, 1.0f, 0);
                    }
                }
            }
            List<o000OOo0> list2 = list;
            if (j % 2 == 0) {
                SystemClock.sleep(1);
            }
            j++;
        } while (j <= iiI1L1iI2);
        return z;
    }

    public void i1IL1lILl1L1I() {
        if (!iILiI1lll.I11lLL1()) {
            try {
                Iiiiii1l1I1L1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C0293o0O0O0oo i1L1lLllLLlIi(double d, double d2) {
        int i = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        if (i <= 0 && d2 <= 1.0d) {
            return new C0293o0O0O0oo((int) Math.round(d * ((double) i1iiLIil1ILi)), (int) Math.round(d2 * ((double) ILl1iII11Ll1)));
        }
        if (i < 0) {
            d = 1.0d;
        }
        if (d2 < 1.0d) {
            d2 = 1.0d;
        }
        return new C0293o0O0O0oo((int) Math.round(d), (int) Math.round(d2));
    }

    public void i1L1llI1LlL1l(String str, String str2) throws Exception {
        o0OOOOO.IiIIlIL(str, str2);
    }

    public String i1LiiIlIL1I() {
        try {
            return IILiIL1i11Li(C0387o0OOoO0o.iiI1L1iI("OO5iKfMSHU4=\n", "WYQ9XZx5eCA=\n"));
        } catch (o0OOOOOO e) {
            e.printStackTrace();
            return "";
        }
    }

    public void i1LlL1iILLLil() {
        int i;
        boolean z;
        if (I11lLL1 == 0) {
            i = 2;
        } else {
            i = 0;
        }
        I11lLL1 = i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        OooOO0O.IilL11ii1I1Il(0, z);
    }

    public AccessibilityNodeInfo i1iLlIill1I() {
        for (int i = 0; i < 3; i++) {
            AccessibilityNodeInfo ILllI11 = ILllI11();
            if (ILllI11 != null) {
                return ILllI11;
            }
            i11iLLllliI();
            SystemClock.sleep(1000);
        }
        return null;
    }

    public void i1iiLIil1ILi(JSONArray jSONArray) throws Exception {
        o0o0000.iilLil1i11I1();
        IL11lll11();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            long j = jSONObject.getLong(C0387o0OOoO0o.iiI1L1iI("aTK3+uc=\n", "DVfbm57zGxA=\n"));
            long j2 = jSONObject.getLong(C0387o0OOoO0o.iiI1L1iI("Jj4N5CPLJss=\n", "Qkt/hVeiSaU=\n"));
            JSONArray jSONArray2 = jSONObject.getJSONArray(C0387o0OOoO0o.iiI1L1iI("Ev/oU3mC\n", "YpCBPQ3x2ug=\n"));
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArray2.length()) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                arrayList2.add(i2, i1L1lLllLLlIi(jSONObject2.optDouble(C0387o0OOoO0o.iiI1L1iI("xw==\n", "v1roGerD2lY=\n"), 0.0d), jSONObject2.optDouble(C0387o0OOoO0o.iiI1L1iI("tg==\n", "zzKvR/2BT4k=\n"), 0.0d)));
                i2++;
                JSONArray jSONArray3 = jSONArray;
                i = i;
            }
            arrayList.add(new o000OOo0(j, j2, arrayList2));
            i++;
        }
        i11liIIl11Ii1(arrayList);
    }

    public void iILiI1lll() {
        IIL1Ll1I111();
        I1i1iiiI(0, 67, 0, 12288, 0);
        I1i1iiiI(1, 67, 0, 12288, 0);
    }

    public Bitmap iILlLIlli() {
        Bitmap bitmap;
        Oooo000 I11lLL12 = Ii1liIIIiLi.I11lLL1(0);
        C0363o0OOOo0O iilLil1i11I12 = I11lLL12.iilLil1i11I1();
        if (Build.VERSION.SDK_INT >= 34) {
            bitmap = o0OOOO0o.I1iIiIi().i111iLiiIIill(iilLil1i11I12.illlI1lLIL(), iilLil1i11I12.iiI1L1iI(), I11lLL12.iiIliillii());
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return C0398o0OOooOO.i111iLiiIIill(iilLil1i11I12.illlI1lLIL(), iilLil1i11I12.iiI1L1iI(), I11lLL12.iiIliillii());
        }
        return bitmap;
    }

    public void iIiL11iL(String str, String str2) {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            for (String sendTextMessage : smsManager.divideMessage(str2)) {
                smsManager.sendTextMessage(str, (String) null, sendTextMessage, (PendingIntent) null, (PendingIntent) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("1jZZm9TFtATeNkmM1dj+S9QsVIbVgoZj8g8=\n", "t1g96bus0Co=\n"));
            intent.setData(Uri.parse(C0387o0OOoO0o.iiI1L1iI("ATkYFmaM\n", "clRrYgm2skE=\n") + str));
            intent.putExtra(C0387o0OOoO0o.iiI1L1iI("uXBmMb2PI9I=\n", "yh0Vbt/gR6s=\n"), str2);
            intent.setType(C0387o0OOoO0o.iiI1L1iI("H8LDKSZ+smEGxcMqI3mkPATB1Co0faU=\n", "aaynB0cQ1hM=\n"));
            o0OOOO0o.iiI1L1iI().iL1LIlIlI(intent);
        }
    }

    public int iL1LIlIlI(String str) throws Exception {
        o0o0000.iilLil1i11I1();
        try {
            return I1l1iIll1lIi1.I1LiILiLLIl1l(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public byte[] iL1lL1LL(float f, int i) throws IOException {
        Bitmap bitmap;
        if (i < 10) {
            i = 10;
        }
        if (i > 100) {
            i = 100;
        }
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (iILiI1lll.I11lLL1()) {
            bitmap = I1iIiIi.takeScreenshot();
        } else {
            bitmap = iILlLIlli();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        bitmap.recycle();
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public boolean iLI1L1l1li(int i, long j, C0293o0O0O0oo o0o0o0oo, float f, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5 = i;
        long uptimeMillis = SystemClock.uptimeMillis();
        int illlI1lLIL2 = this.iiI1L1iI.illlI1lLIL(j);
        if (illlI1lLIL2 == -1) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("KGwwbFsV5LBcczAlWADvuw8jOSNEVP6mCWA3bFMC76cI\n", "fANfTDZ0isk=\n"));
            return false;
        }
        C0536o0ooO i1LIL11l2 = this.iiI1L1iI.i1LIL11l(illlI1lLIL2);
        i1LIL11l2.iilLil1i11I1(o0o0o0oo);
        i1LIL11l2.I11lLL1(f);
        if (i5 == 1) {
            z = true;
        } else {
            z = false;
        }
        i1LIL11l2.iLLLILIiLi1Ii(z);
        int I11lLL12 = this.iiI1L1iI.I11lLL1(this.i1LIL11l, this.illlI1lLIL);
        if (I11lLL12 == 1) {
            if (i5 == 0) {
                this.iiIliillii = uptimeMillis;
            }
        } else if (i5 == 1) {
            i5 = (illlI1lLIL2 << 8) | 6;
        } else if (i5 == 0) {
            i5 = (illlI1lLIL2 << 8) | 5;
        }
        int i6 = i5;
        if ((i2 & -2) != 0) {
            i3 = 8194;
        } else {
            i3 = 4098;
        }
        if (i3 != 8194) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        return iLIIl1IliLlLI(MotionEvent.obtain(this.iiIliillii, uptimeMillis, i6, I11lLL12, this.i1LIL11l, this.illlI1lLIL, 0, i4, 1.0f, 1.0f, 0, 0, i3, 0), true);
    }

    public boolean iLIIl1IliLlLI(InputEvent inputEvent, boolean z) {
        return o0OOOO0o.iiIliillii().iilLil1i11I1(inputEvent, 0);
    }

    public void iLLLILIiLi1Ii(RotationLister rotationLister) {
        o0OOOO0o.I1iIiIi().iL1LIlIlI(rotationLister, 0);
    }

    public boolean iLiI1Llil(int i, long j, double d, double d2, float f, int i2) {
        double d3 = d;
        double d4 = d2;
        return iLI1L1l1li(i, j, i1L1lLllLLlIi(d, d2), f, i2);
    }

    public void iLlI1iL1lIIL(double d, double d2, double d3, double d4, int i) {
        IL11lll11();
        C0293o0O0O0oo i1L1lLllLLlIi2 = i1L1lLllLLlIi(d, d2);
        C0293o0O0O0oo i1L1lLllLLlIi3 = i1L1lLllLLlIi(d3, d4);
        if (!I11iLiiIi(i1L1lLllLLlIi2.iiI1L1iI(), i1L1lLllLLlIi2.i1LIL11l(), i1L1lLllLLlIi3.iiI1L1iI(), i1L1lLllLLlIi3.i1LIL11l(), i / 5, false)) {
            try {
                C0357o0OOOOo.i1LIL11l(String.format(C0387o0OOoO0o.iiI1L1iI("aWejayQVHTVpebY+dVFOZ2Qp9npwEApiJW0=\n", "AAnTHlA1bkI=\n"), new Object[]{Integer.valueOf(i1L1lLllLLlIi2.iiI1L1iI()), Integer.valueOf(i1L1lLllLLlIi2.i1LIL11l()), Integer.valueOf(i1L1lLllLLlIi3.iiI1L1iI()), Integer.valueOf(i1L1lLllLLlIi3.i1LIL11l()), Integer.valueOf(i)}), false, 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void iiIliillii(ClipChangedListener clipChangedListener) {
        o0OOOO0o.illlI1lLIL().i1LIL11l(clipChangedListener);
    }

    public void iiL1l1iLliL() {
        I11lLL1 = 0;
        OooOO0O.IilL11ii1I1Il(0, false);
    }

    public void iiLIIiIli(JSONObject jSONObject) throws Exception {
        o0o0000.iilLil1i11I1();
        IL11lll11();
        long j = jSONObject.getLong(C0387o0OOoO0o.iiI1L1iI("j8m0zf027h0=\n", "67zGrIlfgXM=\n"));
        JSONArray jSONArray = jSONObject.getJSONArray(C0387o0OOoO0o.iiI1L1iI("qyfJjNki\n", "20ig4q1RjkA=\n"));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(i, i1L1lLllLLlIi(jSONObject2.optDouble(C0387o0OOoO0o.iiI1L1iI("zw==\n", "txMJ3Dg5yL0=\n"), 0.0d), jSONObject2.optDouble(C0387o0OOoO0o.iiI1L1iI("Dw==\n", "dtuDDUyHEvE=\n"), 0.0d)));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new o000OOo0(0, j, arrayList));
        i11liIIl11Ii1(arrayList2);
    }

    public boolean iiLl11ILL(int i, int i2) {
        if (!I1i1iiiI(0, i, 0, 0, i2) || !I1i1iiiI(1, i, 0, 0, i2)) {
            return false;
        }
        return true;
    }

    public JSONArray iiiiI1iILL11I(String str) throws Exception {
        o0o0000.iilLil1i11I1();
        try {
            return new JSONArray(IilL11ii1I1Il.ilLIlL1ILi(str));
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray(C0387o0OOoO0o.iiI1L1iI("2ug=\n", "gbWN6qKE7sE=\n"));
        }
    }

    public void iilLiIIIi11i() {
        Iterator<String> it = o0OOOO0o.I11lLL1().i1LIL11l().iterator();
        while (it.hasNext()) {
            o0OOOO0o.iilLil1i11I1().iiI1L1iI(it.next());
        }
    }

    public void iilLil1i11I1(NotificationListener notificationListener) {
        o0OOOO0o.iilLil1i11I1().il1LilLllii(notificationListener);
    }

    public void il1LilLllii(String str) throws Exception {
        o0OOOOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("jmPxodL3uso=\n", "7wmu1b2c36Q=\n"), str);
    }

    public String il1l1IlL() throws o0OOOOOO {
        return IILiIL1i11Li(C0387o0OOoO0o.iiI1L1iI("LAAZuccugw==\n", "TWpG16ZD5gg=\n"));
    }

    public void ilIILlI1l11i() {
        I1i1iiiI(0, 113, 0, 12288, 0);
        I1i1iiiI(0, 50, 0, 12288, 0);
        I1i1iiiI(1, 50, 0, 12288, 0);
        I1i1iiiI(1, 113, 0, C0084o000Oo0O.i111iLiiIIill, 0);
    }

    public void ilLIlL1ILi(double d, double d2, int i) {
        IL11lll11();
        C0293o0O0O0oo i1L1lLllLLlIi2 = i1L1lLllLLlIi(d, d2);
        if (iLI1L1l1li(0, 0, i1L1lLllLLlIi2, 1.0f, 0)) {
            SystemClock.sleep((long) i);
            iLI1L1l1li(1, 0, i1L1lLllLLlIi2, 1.0f, 0);
            return;
        }
        try {
            C0357o0OOOOo.i1LIL11l(String.format(C0387o0OOoO0o.iiI1L1iI("Qpr7+hcfDC9ChO6vRltffU/UrutDGht4DpA=\n", "K/SLj2M/f1g=\n"), new Object[]{Integer.valueOf(i1L1lLllLLlIi2.iiI1L1iI()), Integer.valueOf(i1L1lLllLLlIi2.i1LIL11l()), Integer.valueOf(i1L1lLllLLlIi2.iiI1L1iI()), Integer.valueOf(i1L1lLllLLlIi2.i1LIL11l()), Integer.valueOf(i)}), false, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean ilLIlLiIILl1(String str) {
        IiIIl1LI1i illlI1lLIL2 = o0OOOO0o.illlI1lLIL();
        if (illlI1lLIL2 == null) {
            return false;
        }
        String IIlL1llI1 = IIlL1llI1();
        if (IIlL1llI1 != null && IIlL1llI1.equals(str)) {
            return true;
        }
        AtomicBoolean atomicBoolean = iilLil1i11I1;
        atomicBoolean.set(true);
        boolean iilLiIIIi11i2 = illlI1lLIL2.iilLiIIIi11i(str);
        atomicBoolean.set(false);
        return iilLiIIIi11i2;
    }

    public void ilLilIL() {
        I1l1iIll1lIi1(C0387o0OOoO0o.iiI1L1iI("fxK87w==\n", "GmrZjEjaUBg=\n"), C0387o0OOoO0o.iiI1L1iI("QaxY9fIm3TxYqw==\n", "Mtg3hbNKsRI=\n"), "", C0387o0OOoO0o.iiI1L1iI("wxl2btECrWPVA353/guyDMgTRWjeFKplj0w=\n", "pncRB79n3k0=\n"), 0, 0, 1);
    }

    public final PackageManager iliilLllIl1() {
        Context context = this.il1LilLllii;
        if (context != null) {
            try {
                return context.getPackageManager();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean illi1IL1() {
        return !iILiI1lll.I11lLL1();
    }

    public JSONObject illi1LIILLiL() {
        Oooo000 I11lLL12 = Ii1liIIIiLi.I11lLL1(0);
        C0363o0OOOo0O iilLil1i11I12 = I11lLL12.iilLil1i11I1();
        HashMap hashMap = new HashMap();
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("jfkp7bg=\n", "+pBNmdCQBtQ=\n"), Integer.valueOf(iilLil1i11I12.illlI1lLIL()));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("gwTWxJOT\n", "62G/o/vn+Jo=\n"), Integer.valueOf(iilLil1i11I12.iiI1L1iI()));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("UP2h3sRhscI=\n", "IpLVv7AI3qw=\n"), Integer.valueOf(I11lLL12.iiIliillii()));
        return new JSONObject(hashMap);
    }

    public final int illiiliIILI(int i, int i2) {
        return i + (i2 << 8);
    }
}
