package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {

    public static void letters() {

        String str = "Show must go on Cuori in tempesta Во поле берёза стояла";
        Pattern p = Pattern.compile("(?U)\\w\\b");
        Matcher matcher = p.matcher(str);

        while (matcher.find()) System.out.print(matcher.group()+" ");
        System.out.println();
    }
}
