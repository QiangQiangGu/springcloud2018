package com.joe.cloud01;

import com.joe.cloud01.dao.DepDao;
import com.joe.cloud01.service.DepService;
import com.joe.cloud01.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    RedisUtil redisUtil;

    @Autowired
    DepService depService;

    @Resource
    DepDao depDao;

    @Test
    void contextLoads() {

        for (int i = 0; i < 10; i++) {
            System.out.println(depService.queryById(1L));
        }
    }

}
