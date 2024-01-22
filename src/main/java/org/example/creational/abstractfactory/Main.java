package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.factories.FactoryOne;
import org.example.creational.abstractfactory.factories.FactoryTwo;
import org.example.creational.abstractfactory.services.CustomerService;
import org.example.creational.abstractfactory.services.CustomerServiceImpl;
import org.example.creational.abstractfactory.services.ProductService;
import org.example.creational.abstractfactory.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new FactoryOne());
        productService.add();
        CustomerService customerService = new CustomerServiceImpl(new FactoryTwo());
        customerService.add();
    }

}
