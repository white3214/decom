package top.tntok.autobot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public final class ill1LlIILIl extends i1iLlIill1I {
    public static final Set<Class<? extends Annotation>> i1LIL11l = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Class[]{BeforeClass.class, AfterClass.class, Before.class, After.class})));

    public final void il1LilLllii(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", new Object[]{cls.getSimpleName()})));
    }

    public List<Exception> illlI1lLIL(C0436o0OoO0o o0ooo0o) {
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : o0ooo0o.i1LIL11l()) {
            for (Class next : i1LIL11l) {
                if (annotation.annotationType().isAssignableFrom(next)) {
                    il1LilLllii(arrayList, next);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
