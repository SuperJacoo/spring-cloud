package com.shuidihuzhu.eureka01.springcloudeurekaserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-01-12
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer01Application.class, args);
    }

}
