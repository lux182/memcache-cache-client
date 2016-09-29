package com.banana.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author Louis
 * @version $Id:com.banana.cache, v 0.1 2016/9/29 11:56 liuxuesi Exp $
 */
@Component
public class TestDao3 {
    @CacheEvict(value = "defaultCache", allEntries = true)
    public void delete() {
        System.out.println("清楚所有缓存");
    }
}
