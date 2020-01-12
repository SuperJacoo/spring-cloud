package com.shuidihuzhu.eureka03.springcloudeurekaserver03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-01-12
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer03Application.class, args);
    }

}
