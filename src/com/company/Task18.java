package com.company;

import java.util.regex.*;

public class Task18 {

    public static final String STR = "Я помню чудное мгновенье: передо мной явилась ты, как мимолётное виденье, как гений чистой красоты.";

    public static void punctuationMarks() {

        Pattern p = Pattern.compile("(?U)[^\\w\\s]");
        Matcher matcher = p.matcher(STR);
        int i = 0;
        while (matcher.find()) {
            i++;
        }
        System.out.println("Количество знаков препинания в строке равно " + i);
    }

    public static void punctuationMarks2() {

        char symbol;
        int n = 0;
        for (int i = 0; i < STR.length(); i++) {
            symbol = STR.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == '-' || symbol == ';' || symbol == ':' ||
                    symbol == '\"')
                n++;
        }
        System.out.println("Количество знаков препинания в строке равно " + n);
    }
}
