package com.fangming.extension;

import java.lang.annotation.*;

/**
 * Created by Jack on 2017/7/13.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Adaptive {

    String[] value() default {};
}
