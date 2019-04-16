package rocks.zipcode.io.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for(char ch: chars){
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for(Character ch: chars){
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String vowelsUpper ="aeiou";
        char[] voweCharUpper = vowelsUpper.toCharArray();
        String vowersLower = "AEIOU";
        char[] voweCharLower = vowersLower.toCharArray();

        List<Character> stringlist = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        char[] stringArray = string.toCharArray();
        for(Character ch : stringArray){
            stringlist.add(ch);
        }
        for (int i = 0; i < voweCharUpper.length ; i++) {
            stringlist.removeAll(Collections.singleton(voweCharUpper[i]));
            stringlist.removeAll(Collections.singleton(voweCharLower[i]));
        }


//        for (int i = 0; i <stringlist.size() ; i++) {
//            for (int j = 0; j < voweCharUpper.length; j++) {
//                for (int k = 0; k < vowersLower.length(); k++) {
//
//
//                    if (stringlist.get(i).equals(voweCharUpper[j])) {
//                        stringlist.remove(stringlist.get(i));
//                    } else if (stringlist.get(i).equals(vowelCharLower[k])) {
//                        stringlist.remove(stringlist.get(i));
//                    }
//
//                }
//
//            }
//        }

        for (int i = 0; i <stringlist.size() ; i++) {
            sb.append(stringlist.get(i));
        }
        return sb.toString();

    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        char[] chars = charactersToRemove.toCharArray();

        ArrayList<Character> chars1 = new ArrayList<>();
        char[] stringArray = string.toCharArray();
        for(Character ch : stringArray){
            chars1.add(ch);
        }
        for (int i = 0; i < chars.length ; i++) {
            chars1.removeAll(Collections.singleton(chars[i]));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <chars1.size() ; i++) {
            sb.append(chars1.get(i));
        }
        return sb.toString();

    }


}

