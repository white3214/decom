package top.tntok.autobot;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManagerGlobal;
import android.os.Environment;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Display;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TableLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;
import top.tntok.autobot.C0528o0oOOOoo;

public class iILiI1lll {
    public static final String[] i1LIL11l = {GridView.class.getName(), GridLayout.class.getName(), ListView.class.getName(), TableLayout.class.getName()};
    public static final String iiI1L1iI = "iILiI1lll";

    public static boolean I11lLL1(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!accessibilityNodeInfo.isClickable() || !accessibilityNodeInfo.isEnabled() || !IiIIlIL(accessibilityNodeInfo.getContentDescription()).isEmpty() || !IiIIlIL(accessibilityNodeInfo.getText()).isEmpty()) {
            return true;
        }
        return iiI1L1iI(accessibilityNodeInfo);
    }

    public static String IiIIlIL(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return iilLiIIIi11i(charSequence);
    }

    public static void i1LIL11l(AccessibilityNodeInfo accessibilityNodeInfo, XmlSerializer xmlSerializer, int i, int i2, int i3) throws IOException {
        xmlSerializer.startTag("", "node");
        if (!iLLLILIiLi1Ii(accessibilityNodeInfo) && !I11lLL1(accessibilityNodeInfo)) {
            xmlSerializer.attribute("", "NAF", Boolean.toString(true));
        }
        xmlSerializer.attribute("", "index", Integer.toString(i));
        xmlSerializer.attribute("", "text", IiIIlIL(accessibilityNodeInfo.getText()));
        xmlSerializer.attribute("", "resource-id", IiIIlIL(accessibilityNodeInfo.getViewIdResourceName()));
        xmlSerializer.attribute("", C0528o0oOOOoo.iilLil1i11I1.IiiL1llIIi, IiIIlIL(accessibilityNodeInfo.getClassName()));
        xmlSerializer.attribute("", "package", IiIIlIL(accessibilityNodeInfo.getPackageName()));
        xmlSerializer.attribute("", "content-desc", IiIIlIL(accessibilityNodeInfo.getContentDescription()));
        xmlSerializer.attribute("", "checkable", Boolean.toString(accessibilityNodeInfo.isCheckable()));
        xmlSerializer.attribute("", "checked", Boolean.toString(accessibilityNodeInfo.isChecked()));
        xmlSerializer.attribute("", "clickable", Boolean.toString(accessibilityNodeInfo.isClickable()));
        xmlSerializer.attribute("", "enabled", Boolean.toString(accessibilityNodeInfo.isEnabled()));
        xmlSerializer.attribute("", "focusable", Boolean.toString(accessibilityNodeInfo.isFocusable()));
        xmlSerializer.attribute("", "focused", Boolean.toString(accessibilityNodeInfo.isFocused()));
        xmlSerializer.attribute("", "scrollable", Boolean.toString(accessibilityNodeInfo.isScrollable()));
        xmlSerializer.attribute("", "long-clickable", Boolean.toString(accessibilityNodeInfo.isLongClickable()));
        xmlSerializer.attribute("", "password", Boolean.toString(accessibilityNodeInfo.isPassword()));
        xmlSerializer.attribute("", "selected", Boolean.toString(accessibilityNodeInfo.isSelected()));
        xmlSerializer.attribute("", "bounds", I1iIiIi.iiI1L1iI(accessibilityNodeInfo, i2, i3).toShortString());
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i4);
            if (child == null) {
                String.format("Null child %d/%d, parent: %s", new Object[]{Integer.valueOf(i4), Integer.valueOf(childCount), accessibilityNodeInfo.toString()});
            } else if (child.isVisibleToUser()) {
                i1LIL11l(child, xmlSerializer, i4, i2, i3);
                child.recycle();
            } else {
                String.format("Skipping invisible child: %s", new Object[]{child.toString()});
            }
        }
        xmlSerializer.endTag("", "node");
    }

    public static boolean iLLLILIiLi1Ii(AccessibilityNodeInfo accessibilityNodeInfo) {
        String IiIIlIL = IiIIlIL(accessibilityNodeInfo.getClassName());
        for (String endsWith : i1LIL11l) {
            if (IiIIlIL.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean iiI1L1iI(AccessibilityNodeInfo accessibilityNodeInfo) {
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (!IiIIlIL(child.getContentDescription()).isEmpty() || !IiIIlIL(child.getText()).isEmpty() || iiI1L1iI(child)) {
                return true;
            }
        }
        return false;
    }

    public static void iiIliillii(AccessibilityNodeInfo accessibilityNodeInfo, File file, int i, int i2, int i3) {
        if (accessibilityNodeInfo != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                FileWriter fileWriter = new FileWriter(file);
                XmlSerializer newSerializer = Xml.newSerializer();
                StringWriter stringWriter = new StringWriter();
                newSerializer.setOutput(stringWriter);
                newSerializer.startDocument(C0514o0o00oO.iilLil1i11I1, Boolean.TRUE);
                newSerializer.startTag("", "hierarchy");
                newSerializer.attribute("", "rotation", Integer.toString(i));
                i1LIL11l(accessibilityNodeInfo, newSerializer, 0, i2, i3);
                newSerializer.endTag("", "hierarchy");
                newSerializer.endDocument();
                fileWriter.write(stringWriter.toString());
                fileWriter.close();
            } catch (IOException unused) {
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Fetch time: ");
            sb.append(uptimeMillis2 - uptimeMillis);
            sb.append("ms");
        }
    }

    public static String iilLiIIIi11i(CharSequence charSequence) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt < 1 || charAt > 8) && ((charAt < 11 || charAt > 12) && ((charAt < 14 || charAt > 31) && ((charAt < 127 || charAt > 132) && ((charAt < 134 || charAt > 159) && ((charAt < 64976 || charAt > 64991) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && ((charAt < 65534 || charAt > 65535) && (charAt < 65534 || charAt > 65535)))))))))))))))))))))) {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append(".");
            }
        }
        return stringBuffer.toString();
    }

    public static void iilLil1i11I1(SparseArray<List<AccessibilityWindowInfo>> sparseArray, File file, DisplayManagerGlobal displayManagerGlobal) {
        int i;
        SparseArray<List<AccessibilityWindowInfo>> sparseArray2 = sparseArray;
        if (sparseArray.size() != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                FileWriter fileWriter = new FileWriter(file);
                XmlSerializer newSerializer = Xml.newSerializer();
                StringWriter stringWriter = new StringWriter();
                newSerializer.setOutput(stringWriter);
                newSerializer.startDocument(C0514o0o00oO.iilLil1i11I1, Boolean.TRUE);
                newSerializer.startTag("", "displays");
                int size = sparseArray.size();
                int i2 = 0;
                while (i2 < size) {
                    int keyAt = sparseArray2.keyAt(i2);
                    Display realDisplay = displayManagerGlobal.getRealDisplay(keyAt);
                    if (realDisplay != null) {
                        List valueAt = sparseArray2.valueAt(i2);
                        if (!valueAt.isEmpty()) {
                            newSerializer.startTag("", "display");
                            newSerializer.attribute("", "id", Integer.toString(keyAt));
                            int rotation = realDisplay.getRotation();
                            Point point = new Point();
                            realDisplay.getSize(point);
                            int size2 = valueAt.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                int i4 = point.x;
                                int i5 = point.y;
                                int i6 = i3;
                                AccessibilityWindowInfo accessibilityWindowInfo = (AccessibilityWindowInfo) valueAt.get(i3);
                                List list = valueAt;
                                int i7 = i4;
                                illlI1lLIL(accessibilityWindowInfo, newSerializer, i6, i7, i5, rotation);
                                i3 = i6 + 1;
                                DisplayManagerGlobal displayManagerGlobal2 = displayManagerGlobal;
                                i2 = i2;
                                size2 = size2;
                                point = point;
                                valueAt = list;
                                SparseArray<List<AccessibilityWindowInfo>> sparseArray3 = sparseArray;
                            }
                            i = i2;
                            newSerializer.endTag("", "display");
                            i2 = i + 1;
                            sparseArray2 = sparseArray;
                        }
                    }
                    i = i2;
                    i2 = i + 1;
                    sparseArray2 = sparseArray;
                }
                newSerializer.endTag("", "displays");
                newSerializer.endDocument();
                fileWriter.write(stringWriter.toString());
                fileWriter.close();
            } catch (IOException unused) {
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Fetch time: ");
            sb.append(uptimeMillis2 - uptimeMillis);
            sb.append("ms");
        }
    }

    public static void il1LilLllii(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2, int i3) {
        File file = new File(Environment.getDataDirectory(), "local");
        if (!file.exists()) {
            file.mkdir();
            file.setExecutable(true, false);
            file.setWritable(true, false);
            file.setReadable(true, false);
        }
        iiIliillii(accessibilityNodeInfo, new File(new File(Environment.getDataDirectory(), "local"), "window_dump.xml"), i, i2, i3);
    }

    public static void illlI1lLIL(AccessibilityWindowInfo accessibilityWindowInfo, XmlSerializer xmlSerializer, int i, int i2, int i3, int i4) throws IOException {
        String str;
        AccessibilityWindowInfo accessibilityWindowInfo2 = accessibilityWindowInfo;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        xmlSerializer2.startTag("", "window");
        xmlSerializer2.attribute("", "index", Integer.toString(i));
        CharSequence iiI1L1iI2 = accessibilityWindowInfo.getTitle();
        if (iiI1L1iI2 != null) {
            str = iiI1L1iI2.toString();
        } else {
            str = "";
        }
        xmlSerializer2.attribute("", "title", str);
        Rect rect = new Rect();
        accessibilityWindowInfo.getBoundsInScreen(rect);
        xmlSerializer2.attribute("", "bounds", rect.toShortString());
        xmlSerializer2.attribute("", "active", Boolean.toString(accessibilityWindowInfo.isActive()));
        xmlSerializer2.attribute("", "focused", Boolean.toString(accessibilityWindowInfo.isFocused()));
        xmlSerializer2.attribute("", "accessibility-focused", Boolean.toString(accessibilityWindowInfo.isAccessibilityFocused()));
        xmlSerializer2.attribute("", "id", Integer.toString(accessibilityWindowInfo.getId()));
        xmlSerializer2.attribute("", "layer", Integer.toString(accessibilityWindowInfo.getLayer()));
        xmlSerializer2.attribute("", "type", AccessibilityWindowInfo.typeToString(accessibilityWindowInfo.getType()));
        int childCount = accessibilityWindowInfo.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            AccessibilityWindowInfo child = accessibilityWindowInfo.getChild(i5);
            if (child == null) {
                String.format("Null window child %d/%d, parent: %s", new Object[]{Integer.valueOf(i5), Integer.valueOf(childCount), accessibilityWindowInfo.getTitle()});
            } else {
                illlI1lLIL(child, xmlSerializer, i5, i2, i3, i4);
                child.recycle();
            }
        }
        AccessibilityNodeInfo root = accessibilityWindowInfo.getRoot();
        if (root != null) {
            xmlSerializer2.startTag("", "hierarchy");
            xmlSerializer2.attribute("", "rotation", Integer.toString(i4));
            i1LIL11l(root, xmlSerializer2, 0, i2, i3);
            root.recycle();
            xmlSerializer2.endTag("", "hierarchy");
        }
        xmlSerializer2.endTag("", "window");
    }
}
