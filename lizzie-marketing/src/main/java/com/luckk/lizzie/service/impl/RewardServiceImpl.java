package com.luckk.lizzie.service.impl;

import com.luck.lizzie.aspect.Degrade;
import com.luck.lizzie.aspect.DetailLog;
import com.luckk.lizzie.dto.RewardInfoDTO;
import com.luckk.lizzie.service.RewardService;
import com.luckk.lizzie.service.RewardStrategy;
import com.luckk.lizzie.service.RewardStrategyFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:04
 * @PackageName: com.luckk.lizzie.service.impl
 * @ClassName: RewardServiceImpl
 * @Version 1.0
 */
// @Service
// @org.apache.dubbo.config.annotation.Service
@org.apache.dubbo.config.annotation.Service(version = "1.0.0")
public class RewardServiceImpl implements RewardService {

    private final RewardStrategyFactory rewardStrategyFactory;

    public RewardServiceImpl(RewardStrategyFactory rewardStrategyFactory) {
        this.rewardStrategyFactory = rewardStrategyFactory;
    }

    @Override
    @DetailLog
    @Degrade
    public void rewardSingleUser(RewardInfoDTO rewardInfoDTO) {
        if (rewardInfoDTO == null || StringUtils.isEmpty(rewardInfoDTO.getRewardType()) || StringUtils.isEmpty(rewardInfoDTO.getUserId())) {
            throw new InvalidParameterException();
        }
        System.out.println("has reward");
        RewardStrategy rewardStrategy = rewardStrategyFactory.getStrategy(rewardInfoDTO.getRewardType());
        if (rewardStrategy == null) {
            throw new InvalidParameterException();
        }
        rewardStrategy.doReward();
    }


}
