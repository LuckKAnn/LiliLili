package com.luck.lizzie.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author liukun.inspire
 * @Date 2023/9/18 00:03
 * @PackageName: com.luck.lizzie.factory
 * @ClassName: Strate
 * @Version 1.0
 */

public class StrategyFactory<T, S extends FactoryStrategy<T>> implements InitializingBean, ApplicationContextAware {


    private Map<T, S> strategyMap;

    private ApplicationContext applicationContext;


    public S getStrategy(T identity) {
        return strategyMap.get(identity);
    }

    protected Class<S> getStrategyType() {
        Type superclass = getClass().getGenericSuperclass();
        ParameterizedType type = (ParameterizedType) superclass;

        Type[] actualTypeArguments = type.getActualTypeArguments();

        System.out.println(actualTypeArguments[1]);

        @SuppressWarnings("unchecked")
        Class<S> result = (Class<S>) actualTypeArguments[1];
        return result;
        // return actualTypeArguments.getClass();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        Collection<S> actualStrategy = applicationContext.getBeansOfType(getStrategyType()).values();

        Map<T, S> mp = new HashMap<>();

        for (S strategy : actualStrategy) {
            T id = strategy.getStrategyId();
            mp.put(id, strategy);
        }
        strategyMap = mp;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
