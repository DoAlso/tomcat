package com.tomcat.context;

/**
 * @ClassName TomcatContext
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/10/8 14:50
 */
public interface TomcatContext {
    /**
     *
     * @param className
     */
    public void addListener(String className);

    /**
     *
     * @param clazz
     */
    public void addListener(Class<?> clazz);
}
