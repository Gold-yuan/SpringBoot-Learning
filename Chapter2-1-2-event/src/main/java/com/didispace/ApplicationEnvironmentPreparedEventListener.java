package com.didispace;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	private static final Log log = LogFactory.getLog(Application.class);
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
    	System.out.println("......ApplicationEnvironmentPreparedEvent......");
        log.info("......ApplicationEnvironmentPreparedEvent......");
    }

}
