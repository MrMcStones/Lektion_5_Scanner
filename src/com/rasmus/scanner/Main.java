package com.rasmus.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("input Number!");
            int result = sc.nextInt();

            System.out.println("You picked: " + result);

        } while (true);
    }
}
