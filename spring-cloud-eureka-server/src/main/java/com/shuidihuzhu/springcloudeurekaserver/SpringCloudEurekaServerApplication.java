package com.shuidihuzhu.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-01-12
 */
@EurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }

}
