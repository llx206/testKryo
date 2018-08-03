package org.apache.dubbo.benchmark;

import org.apache.dubbo.summary.bean.SummaryPage;
import org.apache.dubbo.summary.bean.SummaryUser;
import org.apache.dubbo.summary.service.SummaryUserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleClient {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        SummaryUserService summaryUserService = (SummaryUserService) context.getBean("summaryUserService");
        SummaryPage<SummaryUser> page = summaryUserService.listUser(1);
        System.out.println(">>> " + page);
//        summaryUserService = (SummaryUserService) context.getBean("userService2");
//        page = summaryUserService.listUser(2);
//        System.out.println(">>> " + page);
    }
}
