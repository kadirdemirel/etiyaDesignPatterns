package org.example.creational.abstractfactory.factories;

import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.caching.RedisCaching;
import org.example.creational.abstractfactory.logging.DatabaseLogger;
import org.example.creational.abstractfactory.logging.LoggerBase;

public class FactoryOne extends CrossCuttingFactory{
    @Override
    public LoggerBase getLogger() {
        return new DatabaseLogger();
    }

    @Override
    public CachingBase getCaching() {
        return new RedisCaching();
    }
}
