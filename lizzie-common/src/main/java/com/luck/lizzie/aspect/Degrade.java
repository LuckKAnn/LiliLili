package com.luck.lizzie.aspect;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.*;

/**
 * @Author liukun.inspire
 * @Date 2023/10/11 17:10
 * @PackageName: com.luck.lizzie.aspect
 * @ClassName: Degrade
 * @Version 1.0
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Degrade {
}
