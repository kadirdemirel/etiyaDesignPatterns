package org.example.creational.abstractfactory.logging;

public class FileLogger implements LoggerBase{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı: " + message);
    }
}
