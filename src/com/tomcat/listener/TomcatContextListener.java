package com.tomcat.listener;


import com.tomcat.event.TomcatContextEvent;

import java.util.EventListener;

/**
 * @ClassName TomcatContextListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/10/8 14:59
 */
public interface TomcatContextListener extends EventListener {

    public void init(TomcatContextEvent tce);

    public void destroy(TomcatContextEvent tce);

}
