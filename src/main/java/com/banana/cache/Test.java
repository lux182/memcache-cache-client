package com.banana.cache;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-xmemcached.xml")
public class Test {
    @Autowired
    private TestDao2 testDao2;
    @Autowired
    private TestDao3 testDao3;

    @org.junit.Test
    public void x() {
        try {
            System.out.println(testDao2.getUserById(2l) + "------------------------");
            System.out.println(testDao2.getList("hello"));
            //配置文件中禁止清除所有缓存，所以此处会报错
            testDao3.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}