package com.luck.lizzie.aspect;

import java.lang.annotation.*;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:09
 * @PackageName: com.luck.lizzie.aspect
 * @ClassName: DetailLog
 * @Version 1.0
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DetailLog {
}
