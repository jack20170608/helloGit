package com.fangming;

import java.lang.annotation.*;

/**
 * Created by Jack on 2017/7/11.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {

    String [] value() default "good good study,day day up.";
    long level();
    int money();
    byte number();
}
