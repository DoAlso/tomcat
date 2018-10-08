package com.tomcat.event;

import com.tomcat.context.TomcatContext;

import java.util.EventObject;

/**
 * @ClassName TomcatContextEvent
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/10/8 14:46
 */
public class TomcatContextEvent extends EventObject {

    public TomcatContextEvent(TomcatContext source) {
        super(source);
    }

    public TomcatContext getTomcatContext(){
        return (TomcatContext) super.getSource();
    }
}
