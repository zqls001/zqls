package com.duanxin.zqls;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.reger.dubbo.config.DubboAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        DubboAutoConfiguration.class,
        DruidDataSourceAutoConfigure.class
})
@MapperScan(basePackages = "com.duanxin.zqls.dao.mapper")
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
