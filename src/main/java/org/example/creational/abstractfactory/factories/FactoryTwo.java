package org.example.creational.abstractfactory.factories;

import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.caching.InMemoryCaching;
import org.example.creational.abstractfactory.logging.FileLogger;
import org.example.creational.abstractfactory.logging.LoggerBase;

public class FactoryTwo extends CrossCuttingFactory {
    @Override
    public LoggerBase getLogger() {
        return new FileLogger();
    }

    @Override
    public CachingBase getCaching() {
        return new InMemoryCaching();
    }
}
