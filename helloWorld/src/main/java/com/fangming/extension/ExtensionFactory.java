package com.fangming.extension;

/**
 * Created by Jack on 2017/7/13.
 */
@SPI
public interface ExtensionFactory {

    <T> T getExtension(Class<T> type, String name);
}
