package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient //当前使用eureka的server
public class AppRibbon
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppRibbon.class,args);
    }
}
