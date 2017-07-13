package com.fangming.extension.factory;

import com.fangming.extension.Activate;
import com.fangming.extension.ExtensionFactory;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Jack on 2017/7/13.
 */
@Activate
public class AdaptiveExtensionFactory implements ExtensionFactory{

    private final List<ExtensionFactory> factories;

    public AdaptiveExtensionFactory() {
        this.factories = Lists.newArrayList();
    }




    @Override
    public <T> T getExtension(Class<T> type, String name) {
        return null;
    }
}
