package Morse;

import java.util.HashMap;

public class Morse {
    private HashMap<String, String> map1;
    private HashMap<String, String> map2;
    public Morse() {
        //konverterar bokstäver till morse
        map1 = new HashMap<>();
        map1.put("A", ".-");
        map1.put("B", "-...");
        map1.put("C", "-.-.");
        map1.put("D", "-..");
        map1.put("E", ".");
        map1.put("F", "..-.");
        map1.put("G", "--.");
        map1.put("H", "....");
        map1.put("I", "..");
        map1.put("J", ".---");
        map1.put("K", "-.-");
        map1.put("L", ".-..");
        map1.put("M", "--");
        map1.put("N", "-.");
        map1.put("O", "---");
        map1.put("P", ".--.");
        map1.put("Q", "--.-");
        map1.put("R", ".-.");
        map1.put("S", "...");
        map1.put("T", "-");
        map1.put("U", "..-");
        map1.put("V", "...-");
        map1.put("W", ".--");
        map1.put("X", "-..-");
        map1.put("Y", "-.--");
        map1.put("Z", "--..");
        map1.put("0", "-----");
        map1.put("1", ".----");
        map1.put("2", "..---");
        map1.put("3", "...--");
        map1.put("4", "....-");
        map1.put("5", ".....");
        map1.put("6", "-....");
        map1.put("7", "--...");
        map1.put("8", "---..");
        map1.put("9", "----.");
        map1.put("?", "..--..");

        //konverterar morse till bokstäver
        map2 = new HashMap<>();
        map2.put(".-", "A");
        map2.put("-...", "B");
        map2.put("-.-.", "C");
        map2.put("-..", "D");
        map2.put(".", "E");
        map2.put("..-.", "F");
        map2.put("--.", "G");
        map2.put("....", "H");
        map2.put("..", "I");
        map2.put(".---", "J");
        map2.put("-.-", "K");
        map2.put(".-..", "L");
        map2.put("--", "M");
        map2.put("-.", "N");
        map2.put("---", "O");
        map2.put(".--.", "P");
        map2.put("--.-", "Q");
        map2.put(".-.", "R");
        map2.put("...", "S");
        map2.put("-", "T");
        map2.put("..-", "U");
        map2.put("...-", "V");
        map2.put(".--", "W");
        map2.put("-..-", "X");
        map2.put("-.--", "Y");
        map2.put("--..", "Z");
        map2.put("-----", "0");
        map2.put(".----", "1");
        map2.put("..---", "2");
        map2.put("...--", "3");
        map2.put("....-", "4");
        map2.put(".....", "5");
        map2.put("-....", "6");
        map2.put("--...", "7");
        map2.put("---..", "8");
        map2.put("----.", "9");
        map2.put("..--..", "?");

    }

    //Metod för utskrift av morsekod med mellanslag "...." ska resultera i utskrift av "H" inte "II"
    public String convert(String input) {
        String result = "";
        String[] split = input.split(" "); //splittrar String med " " och lagrar delar i array
        for (String part : split) { //går igenom varje del av inmattad String
            if (map2.containsKey(part)) { //Kollar om tecken finns i map2
                result = result + map2.get(part); //Om morsekoden finns, lägg till dess motsvarande värde till result
            } else { //om karaktären inte finns i map2
                for (char c : part.toCharArray()) { //Kollar varje tecken i delen
                    result = result + map1.getOrDefault(String.valueOf(c), String.valueOf(c)) + " "; //Lägger till morsekodens representation av tecknet i result
                }
            }
        }

        return result; //returnerar String result
    }
}