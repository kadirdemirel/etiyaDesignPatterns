package org.example.creational.factory;

import org.example.creational.prototype.Brand;
import org.example.creational.prototype.Car;

public class Main {
    public static void main(String[] args) {
        PDF pdf = (PDF) DocumentFactory.getDocument(DocumentType.PDF);
        Excel excel = (Excel) DocumentFactory.getDocument(DocumentType.EXCEL);

    }

}
