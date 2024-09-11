package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {
    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour");
        assertEquals("Bonjour", document.toString());
        document.ajouter(" tout le monde");
        assertEquals("Bonjour tout le monde", document.toString());
    }


    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("Bonjour tout le monde");
        document.majuscules(8, 12);
        assertEquals("Bonjour TOUT le monde", document.toString());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.ajouter("Bonjour tout le monde");
        document.clear();
        assertEquals("", document.toString());
    }



}
