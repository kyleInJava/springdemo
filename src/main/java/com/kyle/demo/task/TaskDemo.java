package com.kyle.demo.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TaskDemo {
	
	//每分钟执行一次，项目重启后就立刻执行
	@Scheduled(fixedRate=10*60*1000)
    public void refreshAccessToken() throws InterruptedException{
		System.err.println(" :hello world");
    }

}
