package com.banana.cache;

import org.springframework.cache.annotation.CacheEvict;
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

    @CacheEvict(value = "defaultCache", allEntries = true)
    public void delete() {
        System.out.println("清楚所有缓存");
    }
    /*@Caching(evict={@CacheEvict(value="defaultCache",allEntries=true)})
    public void delete(){
        System.out.println("清楚所有缓存");

    }*/

  /*  @CacheEvict(value="shops:detail",key="'id:'+#p0['id']",condition="#p0['id']>0")
    public Shop getById(Map<String, Object> param){

    }*/
}  