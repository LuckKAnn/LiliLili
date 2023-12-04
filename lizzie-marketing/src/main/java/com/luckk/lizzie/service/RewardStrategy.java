package com.luckk.lizzie.service;

import com.luck.lizzie.factory.FactoryStrategy;
import com.luckk.lizzie.dto.RewardInfoDTO;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 16:59
 * @PackageName: com.luckk.lizzie.service
 * @ClassName: RewardStrategy
 * @Version 1.0
 */
public interface RewardStrategy extends FactoryStrategy<String> {

    void doReward();
}
