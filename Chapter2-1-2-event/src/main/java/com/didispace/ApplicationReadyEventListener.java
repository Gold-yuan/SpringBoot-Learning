package com.didispace;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

	private static final Log log = LogFactory.getLog(Application.class);
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
    	System.out.println("......ApplicationReadyEvent......");
        log.info("......ApplicationReadyEvent......");
    }

}
