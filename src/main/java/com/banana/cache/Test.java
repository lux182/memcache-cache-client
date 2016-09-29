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

    @org.junit.Test
    public void x() {
        try {
            System.out.println(testDao2.getUserById(2l) + "------------------------");
            System.out.println(testDao2.getList("hello"));
            testDao2.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}