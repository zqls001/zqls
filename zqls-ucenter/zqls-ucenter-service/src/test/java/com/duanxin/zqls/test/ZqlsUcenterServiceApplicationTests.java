package com.duanxin.zqls.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest()
@Slf4j
public class ZqlsUcenterServiceApplicationTests {

    @Resource
    private DataSource dataSource;

    @Test
    public void contextLoads() {

        try {
            log.debug(">>>数据库{}<<<", dataSource);
            log.debug(">>>数据库连接{}<<<", dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
