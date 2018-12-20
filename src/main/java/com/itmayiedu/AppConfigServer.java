package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author laowang
 * @date 2018/12/20 7:47 PM
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AppConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }
}
