package com.luck.lizzie.factory;

/**
 * @Author liukun.inspire
 * @Date 2023/9/14 17:44
 * @PackageName: com.luck.lizzie.factory
 * @ClassName: FactoryStrategy
 * @Version 1.0
 */
public interface FactoryStrategy<T> {

    /**
     * 获取业务标识?
     * @return
     */
    public T getStrategyId();

}
