package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//标记线程安全的类和写法

//声明注解时需要声明的两个属性
//Target注解作用的目标，TYPE使用类加注解
// 标注哪些类线程安全的哪些是不安全的
@Target(ElementType.TYPE)
//Retention注解存在的范围
@Retention(RetentionPolicy.SOURCE)
//retentionpolicy指定多个值source（编译时忽略，标识用）、class、
// runtime(注解未在class的字节码中存在，在运行时可以通过反射拿到，实际编程时使用)
public @interface ThreadSafe {
    String value() default "";
}
