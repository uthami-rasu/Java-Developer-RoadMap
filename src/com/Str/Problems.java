package com.Str;

import java.util.Arrays;

import static  com.utils.utils.printn;
public class Problems {


    public static void main(String[] args) {


        // Sort words alphabetically by first character.

        sortWords("Red Green Black White Pink"); // ("Red Green Black White Pink") -> "Black Green Pink Red White"

    }


    static  void sortWords(String s){

        String[] words = s.split(" ");


        Arrays.sort(words);

        printn(
                words
        );

    }
}
