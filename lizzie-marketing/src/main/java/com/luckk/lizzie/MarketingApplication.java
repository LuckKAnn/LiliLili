package com.luckk.lizzie;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 16:58
 * @PackageName: com.luckk.lizzie
 * @ClassName: MarketingApplication
 * @Version 1.0
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableDubbo
public class MarketingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketingApplication.class);
    }

}
