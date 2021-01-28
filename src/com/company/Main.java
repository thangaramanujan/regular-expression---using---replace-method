package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I","you");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeeeF12Ghhhhiiiiiijk99Z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeeee","yyyy"));
    }
}
