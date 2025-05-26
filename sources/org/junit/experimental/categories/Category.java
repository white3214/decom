package org.junit.experimental.categories;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.validator.ValidateWith;
import top.tntok.autobot.ill1LlIILIl;

@Inherited
@ValidateWith(ill1LlIILIl.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Category {
    Class<?>[] value();
}
