package org.example.creational.abstractfactory.logging;

public class DatabaseLogger implements LoggerBase {
    @Override
    public void log(String message) {
        System.out.println("Db'ye loglandı: " + message);
    }
}
