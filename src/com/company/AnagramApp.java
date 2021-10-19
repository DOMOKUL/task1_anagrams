package com.company;

import java.util.Scanner;


public class AnagramApp {

    private static Anagram anagram = new Anagram();

    public static void setAnagram(Anagram anagram) {
        AnagramApp.anagram = anagram;
    }

    public static void main(String[] args) {
         System.out.println(anagram.process(anagram));

        }
    }
}
