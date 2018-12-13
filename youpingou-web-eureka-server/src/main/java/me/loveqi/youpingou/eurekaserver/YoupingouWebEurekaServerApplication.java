package me.loveqi.youpingou.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YoupingouWebEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoupingouWebEurekaServerApplication.class, args);
    }

}

