package com.jc.dubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/11/20 14:45
 * @Version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class,args);
    }

}
