package com.banana.cache;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class TestDao2 {
    @CachePut(value = "defaultCache", key = "#id")
    public long getUserById(long id) throws Exception {
        System.out.println("没有缓存命中");
        return id;
    }

    @Cacheable(value = "defaultCache")
    public String getList(String author) throws Exception {
        //除第一次外，以后不触发以下的方法
        System.out.println("没有缓存命中");
        return author;
    }
}  