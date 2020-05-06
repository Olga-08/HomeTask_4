package com.company;

import java.util.Calendar;

public class Task21 {

    static void choice() {
        long start, end;
        int count = 35_500;
        String example = "Бублик ";
        String str = "";
        StringBuilder b = new StringBuilder();

        start = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= count; i++) str += example;
        end = Calendar.getInstance().getTimeInMillis();
        System.out.println(end - start);

        start = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= count; i++) b.append(example);
        end = Calendar.getInstance().getTimeInMillis();
        System.out.println(end - start);
    }
}
