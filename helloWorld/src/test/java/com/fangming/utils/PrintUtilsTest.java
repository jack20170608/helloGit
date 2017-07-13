package com.fangming.utils;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Jack on 2017/7/13.
 */
public class PrintUtilsTest {

    @Test
    public void testPrint(){
        String [] strings = {"Hello","World"};
        Assert.assertEquals("[Hello,World]",PrintUtils.toString(strings));
    }
}
