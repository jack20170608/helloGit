package com.fangming;

import java.lang.annotation.*;

/**
 * Created by Jack on 2017/7/11.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {
    /**
     * @return
     */
    String value() default "cool";
}
