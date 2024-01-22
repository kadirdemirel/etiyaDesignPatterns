package org.example.creational.abstractfactory.caching;

public class InMemoryCaching implements CachingBase{
    @Override
    public void cache(String cache) {
        System.out.println("In memory");
    }
}
