package com.luckk.lizzie.service.impl;

import com.luckk.lizzie.enm.RewardTypeEnum;
import com.luckk.lizzie.service.RewardStrategy;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:12
 * @PackageName: com.luckk.lizzie.service.impl
 * @ClassName: VipRewardStrategy
 * @Version 1.0
 */
@Service
@Slf4j
public class VipRewardStrategy implements RewardStrategy {
    @Override
    public String getStrategyId() {
        return RewardTypeEnum.VIP_REWARD.getBizCode();
    }

    @Override
    public void doReward() {
        log.info("进行Vip奖励发放");
    }
}
