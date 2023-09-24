package com.luckk.lizzie;

import com.google.common.collect.Lists;
import com.luckk.lizzie.service.CheckStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author liukun.inspire
 * @Date 2023/9/18 00:14
 * @PackageName: com.luckk.lizzie
 * @ClassName: LizzieLoginApplication
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LizzieLoginApplication {

    @Autowired
    CheckStrategyFactory factory;
    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(LizzieLoginApplication.class);

        // Map<String, CheckStrategyFactory> beansOfType = application.getBeansOfType(CheckStrategyFactory.class);
        CheckStrategyFactory bean = application.getBean(CheckStrategyFactory.class);
        System.out.println(bean.getStrategy("my"));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        List<List<Integer>> partition = Lists.partition(list, 5);
        System.out.println(partition.size());


    }
}
