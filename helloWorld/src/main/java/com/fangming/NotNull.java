package com.fangming;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by Jack on 2017/7/11.
 */
@Documented
@Target(value = {PARAMETER, LOCAL_VARIABLE,FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    String message() default "";
}
