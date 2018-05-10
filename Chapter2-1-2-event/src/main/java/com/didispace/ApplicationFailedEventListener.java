package com.didispace;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

	private static final Log log = LogFactory.getLog(Application.class);
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
    	System.out.println("......ApplicationFailedEvent......");
        log.info("......ApplicationFailedEvent......");
    }

}
