package com.luckk.lizzie.service;

import org.springframework.stereotype.Component;

/**
 * @Author liukun.inspire
 * @Date 2023/9/18 00:17
 * @PackageName: com.luckk.lizzie.service
 * @ClassName: CheckVipStrategy
 * @Version 1.0
 */
@Component
public class CheckVipStrategy implements CheckStrategy {
    @Override
    public String getStrategyId() {
        return "my";
    }
}
