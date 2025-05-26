package org.junit.experimental.theories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import top.tntok.autobot.C0371o0OOOooo;

@ParametersSuppliedBy(C0371o0OOOooo.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FromDataPoints {
    String value();
}
