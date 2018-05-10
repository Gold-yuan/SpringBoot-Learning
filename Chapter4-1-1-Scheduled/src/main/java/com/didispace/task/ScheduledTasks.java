package com.didispace.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) // 每5秒
    public void reportCurrentTime() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
    }
    
    @Scheduled(fixedDelay = 5000) // 上一次执行完毕时间点之后5秒再执行
    public void reportCurrentTime1() {
    	System.out.println("当前时间：" + dateFormat.format(new Date()));
    }
    
    @Scheduled(cron="*/5 * * * * *")
    public void reportCurrentTime2() {
    	System.out.println("当前时间：" + dateFormat.format(new Date()));
    }

}
