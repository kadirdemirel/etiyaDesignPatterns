package org.example.creational.abstractfactory.services;

import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.factories.CrossCuttingFactory;
import org.example.creational.abstractfactory.logging.LoggerBase;

public class CustomerServiceImpl implements CustomerService {
    private final CachingBase cachingBase;
    private final LoggerBase loggerBase;

    public CustomerServiceImpl(CrossCuttingFactory factory) {
        cachingBase = factory.getCaching();
        loggerBase = factory.getLogger();
    }

    @Override
    public void add() {
        cachingBase.cache("Customer.Add");
        loggerBase.log("Customer.Add");
    }
}
