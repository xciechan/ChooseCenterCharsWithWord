package pl.java.github;

/**
 Created by xciechan
 on 2022-05-27

 The application selects and displays middle chars with entered word
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(downloadWord());

    }

    public static String downloadWord(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        return  word;

    }
}
