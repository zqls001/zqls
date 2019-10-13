package com.duanxin.zqls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.duanxin.zqls.ucenter.mapper")
public class ZqlsUcenterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZqlsUcenterServiceApplication.class, args);
    }

}
