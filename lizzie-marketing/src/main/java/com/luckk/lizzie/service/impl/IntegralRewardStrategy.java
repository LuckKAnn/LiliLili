package com.luckk.lizzie.service.impl;

import com.luckk.lizzie.enm.RewardTypeEnum;
import com.luckk.lizzie.service.RewardStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:12
 * @PackageName: com.luckk.lizzie.service.impl
 * @ClassName: IntegralRewardStrategy
 * @Version 1.0
 */
@Service
@Slf4j
public class IntegralRewardStrategy implements RewardStrategy {
    @Override
    public String getStrategyId() {
        return RewardTypeEnum.INTEGRAL_REWARD.getBizCode();
    }

    /**
     * 这种策略的具体实现类，如果内部还是我们的具体逻辑，那如果具体逻辑发生变更，大变更的话，
     * 还是和开闭原则发生冲突。一种方式是，其面向接口编程，接口注入不同的实现类来完成不同的功能要求
     * 本质上还可以满足开闭原则
     */
    @Override
    public void doReward() {

        log.info("执行积分奖励发放");

    }
}
