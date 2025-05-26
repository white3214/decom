package org.junit.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.runner.notification.iiI1L1iI;
import top.tntok.autobot.C0009OooO0oO;
import top.tntok.autobot.C0136o00O0oo;
import top.tntok.autobot.C0270o00ooo0;
import top.tntok.autobot.C0346o0OO0oOO;
import top.tntok.autobot.C0402o0OOoooO;
import top.tntok.autobot.IliiLiLliIl;

public class Suite extends C0270o00ooo0<C0346o0OO0oOO> {
    public final List<C0346o0OO0oOO> iilLil1i11I1;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SuiteClasses {
        Class<?>[] value();
    }

    public Suite(Class<?> cls, C0402o0OOoooO o0oooooo) throws C0136o00O0oo {
        this(o0oooooo, cls, iliilLllIl1(cls));
    }

    public static C0346o0OO0oOO IIlLill() {
        try {
            return new Suite((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (C0136o00O0oo unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    public static Class<?>[] iliilLllIl1(Class<?> cls) throws C0136o00O0oo {
        SuiteClasses suiteClasses = (SuiteClasses) cls.getAnnotation(SuiteClasses.class);
        if (suiteClasses != null) {
            return suiteClasses.value();
        }
        throw new C0136o00O0oo(String.format("class '%s' must have a SuiteClasses annotation", new Object[]{cls.getName()}));
    }

    /* renamed from: IILiIL1i11Li */
    public C0009OooO0oO iL1LIlIlI(C0346o0OO0oOO o0oo0ooo) {
        return o0oo0ooo.iiI1L1iI();
    }

    public List<C0346o0OO0oOO> i111iLiiIIill() {
        return this.iilLil1i11I1;
    }

    /* renamed from: illiiliIILI */
    public void i1iiLIil1ILi(C0346o0OO0oOO o0oo0ooo, iiI1L1iI iii1l1ii) {
        o0oo0ooo.i1LIL11l(iii1l1ii);
    }

    public Suite(C0402o0OOoooO o0oooooo, Class<?>[] clsArr) throws C0136o00O0oo {
        this((Class<?>) null, o0oooooo.iilLil1i11I1((Class<?>) null, clsArr));
    }

    public Suite(Class<?> cls, Class<?>[] clsArr) throws C0136o00O0oo {
        this(new IliiLiLliIl(), cls, clsArr);
    }

    public Suite(C0402o0OOoooO o0oooooo, Class<?> cls, Class<?>[] clsArr) throws C0136o00O0oo {
        this(cls, o0oooooo.iilLil1i11I1(cls, clsArr));
    }

    public Suite(Class<?> cls, List<C0346o0OO0oOO> list) throws C0136o00O0oo {
        super(cls);
        this.iilLil1i11I1 = Collections.unmodifiableList(list);
    }
}
