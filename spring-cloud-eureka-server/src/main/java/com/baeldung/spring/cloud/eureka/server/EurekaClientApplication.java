package com.baeldung.spring.cloud.eureka.server;

import com.netflix.appinfo.ApplicationInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    @Autowired
    private ApplicationInfoManager applicationInfoManager;

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(EurekaClientApplication.class, args);
       EurekaClientApplication server =  context.getBean(EurekaClientApplication.class);
        System.out.println();
    }
}
