package com.luckk.lizzie.enm;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:13
 * @PackageName: com.luckk.lizzie.enm
 * @ClassName: RewardTypeEnum
 * @Version 1.0
 */
public enum RewardTypeEnum {

    INTEGRAL_REWARD(1, "reward_integral"),
    VIP_REWARD(2, "reward_vip");
    private int code;
    private String bizCode;

    RewardTypeEnum(int code, String bizCode) {

        this.code = code;
        this.bizCode = bizCode;
    }


    public int getCode() {
        return code;
    }



    public String getBizCode() {
        return bizCode;
    }


}
