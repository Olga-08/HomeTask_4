package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {

    public static final String STR = " И  днём и   ночью кот   учёный всё ходит  по цепи  кругом  ";

    public static void wordsCount() {
        int count;
        String str1 = STR.trim();
        count = str1.split(" +").length;
        System.out.println("Количество слов в строке " + count);
    }

    public static void wordsCount2() {
        Pattern p = Pattern.compile("(?U)\\b\\w+");
        Matcher matcher = p.matcher(STR);
        int i = 0;
        for (; matcher.find(); i++) ;
        System.out.println("Количество слов в строке " + i);
    }
}
