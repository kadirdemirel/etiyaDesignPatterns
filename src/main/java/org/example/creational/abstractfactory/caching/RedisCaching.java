package org.example.creational.abstractfactory.caching;

public class RedisCaching implements CachingBase {
    @Override
    public void cache(String cache) {
        System.out.println("Redis");
    }
}
