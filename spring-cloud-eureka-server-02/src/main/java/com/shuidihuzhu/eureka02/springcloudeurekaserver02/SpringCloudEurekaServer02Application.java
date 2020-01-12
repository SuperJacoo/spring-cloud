package com.shuidihuzhu.eureka02.springcloudeurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-01-12
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer02Application.class, args);
    }

}
