package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface Flow {
    public static final String i1LIL11l = "this";
    public static final String iiI1L1iI = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String iiIliillii = "this";
    public static final String il1LilLllii = "The return value of this method";
    public static final String illlI1lLIL = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
