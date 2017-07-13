package com.fangming.extension;

import com.google.common.collect.Maps;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/**
 * Created by Jack on 2017/7/13.
 */
public class ExtensionLoader<T> {

    private static final Log logger = LogFactory.getLog(ExtensionLoader.class);

    private static final String SERVICES_DIRECTORY = "META-INF/services/";

    private static final String DUBBO_DIRECTORY = "META-INF/dubbo";

    private static final String DUBBO_INTERNAL_DIRECTORY = DUBBO_DIRECTORY + "internal/";

    private static final Pattern NAME_SEPARATOR = Pattern.compile("\\s*[,]+\\s*");

    //================

    private static final ConcurrentMap<Class<?>, ExtensionLoader<?>> EXTENSION_LOADERS = Maps.newConcurrentMap();

    private static final ConcurrentMap<Class<?>, Object> EXTENSION_INSTANCES = Maps.newConcurrentMap();


}
