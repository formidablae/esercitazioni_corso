package esercizi_compito.week8.colloquio3.dc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SubstringCompareTest {

    @Test
    void testGetSmallestAndLargest() {
        String s = "welcometojava";
        int k = 3;
        String expected = "stringa più 'lex-piccola' di " + k + " chars: " + "ava" + "\nstringa più 'lex-grande' di " + k + " chars: " + "wel";
        String result = SubstringCompare.getSmallestAndLargest(s, k);
        assertEquals(expected, result);
    }

    @Test
    void testGetSmallestAndLargest2() {
        String s = "welcometojava";
        int k = 4;
        String expected = "stringa più 'lex-piccola' di " + k + " chars: " + "come" + "\nstringa più 'lex-grande' di " + k + " chars: " + "welc";
        String result = SubstringCompare.getSmallestAndLargest(s, k);
        assertEquals(expected, result);
    }

    @Test
    void testOrdinaStringheLex() {
        ArrayList<String> arrayDiStringhe = new ArrayList<>();
        arrayDiStringhe.add("ciao");
        arrayDiStringhe.add("come");
        arrayDiStringhe.add("stai");
        // assert i due Arraylist sono uguali
        ArrayList<String> expected = new ArrayList<>();
        expected.add("ciao");
        expected.add("come");
        expected.add("stai");
        ArrayList<String> result = SubstringCompare.ordinaStringheLex(arrayDiStringhe);
        assertEquals(expected, result);
    }

    @Test
    void testOrdinaStringheLex2() {
        ArrayList<String> arrayDiStringhe = new ArrayList<>();
        arrayDiStringhe.add("nmg");
        arrayDiStringhe.add("come");
        arrayDiStringhe.add("stai");
        arrayDiStringhe.add("a");
        // assert i due Arraylist sono uguali
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("come");
        expected.add("nmg");
        expected.add("stai");

        ArrayList<String> result = SubstringCompare.ordinaStringheLex(arrayDiStringhe);
        assertEquals(expected, result);
    }
}