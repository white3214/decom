package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

    public static class iiI1L1iI extends Throwable {
        private static final long serialVersionUID = 1;
    }

    Class<? extends Throwable> expected() default iiI1L1iI.class;

    long timeout() default 0;
}
