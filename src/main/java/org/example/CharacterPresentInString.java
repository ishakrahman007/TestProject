package org.example;

public class CharacterPresentInString {
    public static void main(String[] args) {

        //create a method that takes 2 parameters String and char. print total number of char present in the String
        String str = "Bangladesh";
        char ch = 'a';
        stringAndChar(str, ch);

    }

    public static void stringAndChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("'"+ch + "' appears in the word \"" + str + "\" " + count + " times");
    }
}
