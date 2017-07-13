package com.fangming.extension;

import com.fangming.utils.PrintUtils;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by Jack on 2017/7/13.
 */
public class ExtensionLoaderTest {

    @Test
    public void testPattern(){
        Pattern p1 = Pattern.compile("\\s*[,]+\\s*");
        String helloWorld = "Id,name ,    good  ,tab";
        String [] strArray = p1.split(helloWorld);

        System.out.println(PrintUtils.toString(strArray));
    }
}
