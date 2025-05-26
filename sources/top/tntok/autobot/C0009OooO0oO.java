package top.tntok.autobot;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.OooO0oO  reason: case insensitive filesystem */
public class C0009OooO0oO implements Serializable {
    public static final Pattern i1LIL11l = Pattern.compile("([\\s\\S]*)\\((.*)\\)");
    public static final C0009OooO0oO il1LilLllii = new C0009OooO0oO((Class<?>) null, "Test mechanism", new Annotation[0]);
    public static final C0009OooO0oO illlI1lLIL = new C0009OooO0oO((Class<?>) null, "No Tests", new Annotation[0]);
    private static final long serialVersionUID = 1;
    private final Annotation[] fAnnotations;
    private final Collection<C0009OooO0oO> fChildren;
    private final String fDisplayName;
    private volatile Class<?> fTestClass;
    private final Serializable fUniqueId;

    public C0009OooO0oO(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    public static C0009OooO0oO I11lLL1(Class<?> cls, String str) {
        return new C0009OooO0oO(cls, IiiL1llIIi(str, cls.getName()), new Annotation[0]);
    }

    public static C0009OooO0oO IiIIlIL(String str, String str2, Serializable serializable) {
        return new C0009OooO0oO((Class<?>) null, IiiL1llIIi(str2, str), serializable, new Annotation[0]);
    }

    public static String IiiL1llIIi(String str, String str2) {
        return String.format("%s(%s)", new Object[]{str, str2});
    }

    public static C0009OooO0oO iLLLILIiLi1Ii(Class<?> cls, String str, Annotation... annotationArr) {
        return new C0009OooO0oO(cls, IiiL1llIIi(str, cls.getName()), annotationArr);
    }

    public static C0009OooO0oO iiIliillii(String str, Serializable serializable, Annotation... annotationArr) {
        return new C0009OooO0oO((Class<?>) null, str, serializable, annotationArr);
    }

    public static C0009OooO0oO iilLiIIIi11i(String str, String str2, Annotation... annotationArr) {
        return new C0009OooO0oO((Class<?>) null, IiiL1llIIi(str2, str), annotationArr);
    }

    public static C0009OooO0oO iilLil1i11I1(String str, Annotation... annotationArr) {
        return new C0009OooO0oO((Class<?>) null, str, annotationArr);
    }

    public static C0009OooO0oO il1LilLllii(Class<?> cls, Annotation... annotationArr) {
        return new C0009OooO0oO(cls, cls.getName(), annotationArr);
    }

    public static C0009OooO0oO illlI1lLIL(Class<?> cls) {
        return new C0009OooO0oO(cls, cls.getName(), cls.getAnnotations());
    }

    public Collection<Annotation> I1iIiIi() {
        return Arrays.asList(this.fAnnotations);
    }

    public boolean I1l1iIll1lIi1() {
        return !iiLIIiIli();
    }

    public String IL1lILLLL1L() {
        if (this.fTestClass != null) {
            return this.fTestClass.getName();
        }
        return ILl1iII11Ll1(2, toString());
    }

    public final String ILl1iII11Ll1(int i, String str) {
        Matcher matcher = i1LIL11l.matcher(toString());
        if (matcher.matches()) {
            return matcher.group(i);
        }
        return str;
    }

    public Class<?> Ii1liIIIiLi() {
        if (this.fTestClass != null) {
            return this.fTestClass;
        }
        String IL1lILLLL1L = IL1lILLLL1L();
        if (IL1lILLLL1L == null) {
            return null;
        }
        try {
            this.fTestClass = Class.forName(IL1lILLLL1L, false, getClass().getClassLoader());
            return this.fTestClass;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean IilL11ii1I1Il() {
        return equals(illlI1lLIL);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0009OooO0oO)) {
            return false;
        }
        return this.fUniqueId.equals(((C0009OooO0oO) obj).fUniqueId);
    }

    public int hashCode() {
        return this.fUniqueId.hashCode();
    }

    public String i111iLiiIIill() {
        return ILl1iII11Ll1(1, (String) null);
    }

    public ArrayList<C0009OooO0oO> i1L1lLllLLlIi() {
        return new ArrayList<>(this.fChildren);
    }

    public C0009OooO0oO i1LIL11l() {
        return new C0009OooO0oO(this.fTestClass, this.fDisplayName, this.fAnnotations);
    }

    public int i1iiLIil1ILi() {
        if (iiLIIiIli()) {
            return 1;
        }
        int i = 0;
        for (C0009OooO0oO i1iiLIil1ILi : this.fChildren) {
            i += i1iiLIil1ILi.i1iiLIil1ILi();
        }
        return i;
    }

    public <T extends Annotation> T iILiI1lll(Class<T> cls) {
        for (Annotation annotation : this.fAnnotations) {
            if (annotation.annotationType().equals(cls)) {
                return (Annotation) cls.cast(annotation);
            }
        }
        return null;
    }

    public String iL1LIlIlI() {
        return this.fDisplayName;
    }

    public void iiI1L1iI(C0009OooO0oO oooO0oO) {
        this.fChildren.add(oooO0oO);
    }

    public boolean iiLIIiIli() {
        return this.fChildren.isEmpty();
    }

    public String toString() {
        return iL1LIlIlI();
    }

    public C0009OooO0oO(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.fChildren = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        } else if (serializable != null) {
            this.fTestClass = cls;
            this.fDisplayName = str;
            this.fUniqueId = serializable;
            this.fAnnotations = annotationArr;
        } else {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
    }
}
