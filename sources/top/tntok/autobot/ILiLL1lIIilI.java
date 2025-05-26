package top.tntok.autobot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class ILiLL1lIIilI {
    public final String i1LIL11l;
    public final String iiI1L1iI;
    public final String illlI1lLIL;

    public ILiLL1lIIilI(String str, String str2) {
        this(str, str2, 30);
    }

    public static String i1LIL11l(int i) {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        instance.add(5, i);
        return simpleDateFormat.format(instance.getTime());
    }

    public String iiI1L1iI() {
        return String.format("%s=%s; expires=%s", new Object[]{this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL});
    }

    public ILiLL1lIIilI(String str, String str2, int i) {
        this.iiI1L1iI = str;
        this.i1LIL11l = str2;
        this.illlI1lLIL = i1LIL11l(i);
    }

    public ILiLL1lIIilI(String str, String str2, String str3) {
        this.iiI1L1iI = str;
        this.i1LIL11l = str2;
        this.illlI1lLIL = str3;
    }
}
