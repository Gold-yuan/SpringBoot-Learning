package com.didispace;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

	private static final Log log = LogFactory.getLog(Application.class);
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
    	System.out.println("......ApplicationStartingEvent......");
        log.info("......ApplicationStartingEvent......");
    }

}
