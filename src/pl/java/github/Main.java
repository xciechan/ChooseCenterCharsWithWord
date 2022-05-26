package pl.java.github;

/**
 Created by xciechan
 on 2022-05-27

 The application selects and displays middle chars with entered word
 For nonparity of chars - one char
 For parity of chars - two chars
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter word :)");
        System.out.println("Middle chars is: " + selectMiddleCharsWithWord(downloadWord()));

    }

    public static String downloadWord(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        return  word;

    }

    public static String selectMiddleCharsWithWord(String downloadedWord){
        String charsWithWord = "";

        if (downloadedWord.length() % 2 == 0){
            charsWithWord = downloadedWord.substring(downloadedWord.length()/2 - 1, downloadedWord.length()/2 + 1);
        }
        else {
            charsWithWord = downloadedWord.substring(downloadedWord.length()/2, downloadedWord.length()/2 + 1);
        }

        return charsWithWord;
    }
}
