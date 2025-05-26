package org.junit.runner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.validator.ValidateWith;
import top.tntok.autobot.C0259o00ooO00;
import top.tntok.autobot.C0261o00ooO0o;

@Inherited
@Target({ElementType.TYPE})
@ValidateWith(C0259o00ooO00.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderWith {
    Class<? extends C0261o00ooO0o.illlI1lLIL> value();
}
