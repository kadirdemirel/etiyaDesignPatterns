package org.example.creational.factory;

public class DocumentFactory {
    public static Document getDocument(DocumentType type) {
        if (type == null) {
            throw new IllegalArgumentException("");
        }
        switch (type) {
            case PDF:
                return new PDF();
            case WORD:
                return new Word();
            case EXCEL:
                return new Excel();
            default:
                throw new IllegalArgumentException("");
        }
    }
}
