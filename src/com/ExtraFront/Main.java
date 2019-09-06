package com.ExtraFront;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hi, string please.");
        String input = reader.nextLine();

        System.out.println(ExtraFront.extraFont(input));
    }
}
