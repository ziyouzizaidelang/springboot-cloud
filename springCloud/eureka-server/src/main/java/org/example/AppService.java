package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class AppService
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppService.class,args);
    }
}
