package org.muque.rdb.datasource.annotation;

import java.lang.annotation.Documented;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 动态数据源名称.
 * 
 * <p>
 * 需要在Repository接口或实现类指定.
 * </p>
 * 
 * @author caohao
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSourceName {
    
    String value();
}

