package com.ExtraFront;

public class ExtraFront {
    public static String extraFont(String input) {
        StringBuilder sb = new StringBuilder();
        if (input.length() <= 2) {
            for (int i = 0; i <= 2; i++)
                sb.append(input);
            return sb.toString();
        }
        else
            for (int i=0; i<=2; i++)
                sb.append(input,0,2);
            return sb.toString();
    }
}