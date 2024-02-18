package Morse;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void testAtoMorse() {
        Morse morse = new Morse();
        String input = "A";
        String expected = ".-"; //vad vi förväntas oss att få
        String actual = morse.convert(input); //metod för att ta reda på vad actual kommer att vara
        assertEquals(expected.trim(), actual.trim()); //jämförelse mellan expected och actual, trim tar bort blanksteg
    }
    @Test
    public void testMorsetoH() {
        Morse morse = new Morse();
        String input = "....";
        String expected = "H";
        String actual = morse.convert(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseSpace() {
        Morse morse = new Morse();
        String input = ".. ..";
        String expected = "II";
        String actual = morse.convert(input);
        assertEquals(expected, actual);
    }
}