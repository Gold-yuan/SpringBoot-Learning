package com.didispace;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

	private static final Log log = LogFactory.getLog(Application.class);
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
    	System.out.println("......ApplicationPreparedEvent......");
        log.info("......ApplicationPreparedEvent......");
    }

}
