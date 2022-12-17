package com.jx.annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 22:58
 */

@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
}