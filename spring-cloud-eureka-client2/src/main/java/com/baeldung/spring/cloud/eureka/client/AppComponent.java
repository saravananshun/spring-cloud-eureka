package com.baeldung.spring.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppComponent {

    @Autowired
    private DiscoveryClient loadBalancerClient;

    public String greeting() {

        List<ServiceInstance> serviceInstance = loadBalancerClient.getInstances("SPRING-CLOUD-EUREKA-CLIENT");
        System.out.println("serviceInstance " + serviceInstance);

        return "Hello";
    }
}
