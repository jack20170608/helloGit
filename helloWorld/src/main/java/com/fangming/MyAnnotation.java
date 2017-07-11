package com.fangming;

import java.lang.annotation.Annotation;

/**
 * Created by Jack on 2017/7/11.
 */
public class MyAnnotation implements java.lang.annotation.Annotation{

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
