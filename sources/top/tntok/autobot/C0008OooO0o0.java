package top.tntok.autobot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.OooO0o0  reason: case insensitive filesystem */
public class C0008OooO0o0<T> extends IlLLlIi1iI1li<T> {
    public static final Pattern iiIliillii = Pattern.compile("%([0-9]+)");
    public final String i1LIL11l;
    public final Object[] il1LilLllii;
    public final C0175o00Ooo00<T> illlI1lLIL;

    public C0008OooO0o0(String str, C0175o00Ooo00<T> o00ooo00, Object[] objArr) {
        this.i1LIL11l = str;
        this.illlI1lLIL = o00ooo00;
        this.il1LilLllii = (Object[]) objArr.clone();
    }

    public static <T> C0175o00Ooo00<T> iiIliillii(String str, C0175o00Ooo00<T> o00ooo00, Object... objArr) {
        return new C0008OooO0o0(str, o00ooo00, objArr);
    }

    public boolean i1LIL11l(Object obj) {
        return this.illlI1lLIL.i1LIL11l(obj);
    }

    public void il1LilLllii(Object obj, OooO0o oooO0o) {
        this.illlI1lLIL.il1LilLllii(obj, oooO0o);
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        Matcher matcher = iiIliillii.matcher(this.i1LIL11l);
        int i = 0;
        while (matcher.find()) {
            oooO0o.iiIliillii(this.i1LIL11l.substring(i, matcher.start()));
            oooO0o.iiI1L1iI(this.il1LilLllii[Integer.parseInt(matcher.group(1))]);
            i = matcher.end();
        }
        if (i < this.i1LIL11l.length()) {
            oooO0o.iiIliillii(this.i1LIL11l.substring(i));
        }
    }
}
