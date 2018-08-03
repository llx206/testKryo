package org.apache.dubbo.benchmark;

import org.apache.dubbo.benchmark.bean.Page;
import org.apache.dubbo.benchmark.bean.User;
import org.apache.dubbo.benchmark.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleClient {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserService userService = (UserService) context.getBean("userService1");
        Page<User> page = userService.listUser(1);
        System.out.println(">>> " + page);
        userService = (UserService) context.getBean("userService2");
        page = userService.listUser(2);
        System.out.println(">>> " + page);
    }
}
