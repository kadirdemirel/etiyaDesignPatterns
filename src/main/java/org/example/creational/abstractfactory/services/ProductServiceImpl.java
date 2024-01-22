package org.example.creational.abstractfactory.services;

import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.factories.CrossCuttingFactory;
import org.example.creational.abstractfactory.logging.LoggerBase;

public class ProductServiceImpl implements ProductService {
    private final CachingBase cachingBase;
    private final LoggerBase loggerBase;

    public ProductServiceImpl(CrossCuttingFactory factory) {
        cachingBase = factory.getCaching();
        loggerBase = factory.getLogger();
    }
    @Override
    public void add() {
        cachingBase.cache("Product.Add");
        loggerBase.log("Product.Add");
    }
}
