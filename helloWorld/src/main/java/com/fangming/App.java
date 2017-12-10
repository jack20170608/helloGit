package com.fangming;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@MyAnnotation2(level = 1,money = 100,number = 127)
public class App 
{
    @MyAnnotation3
    @NotNull(message = "The Id filed should not be null" )
    public Long id;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Edit by Jack 275287908!" );
        System.out.println( "Hello Git!" );
        System.out.println( "Hello Git, as well!" );
        System.out.println( "Hello Deng lili !" );
        System.out.println( "Hello Fang Ming!" );

        App app = new App();
        App app2 = new App();
        app2.id = 100L;

        @SuppressWarnings("good")
        List list = new ArrayList();
        list.add(100L);
        list.add("good good");
        list.add("test git.");
        System.out.printf(list.toString());

        //Reflection to get annotation values
        Class clazz = App.class;
        MyAnnotation2 annotation2 = (MyAnnotation2) clazz.getAnnotation(MyAnnotation2.class);
        System.out.printf(annotation2.toString());

        try {

            Field field = clazz.getField("id");
            Annotation annotation = field.getAnnotation(MyAnnotation3.class);
            System.out.printf(annotation.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {

            Field field = clazz.getField("id");

            NotNull notNullAnnotation = field.getAnnotation(NotNull.class);
            Long value = (Long)field.get(app);
            if (value == null){
                System.out.println("The id field is null for app.");
                System.out.println(notNullAnnotation.message());
            }
            Long value2 = (Long) field.get(app2);
            if (value2 == null){
                System.out.println(notNullAnnotation.message());
            }else {
                System.out.println("The id field is not null for app2.");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
