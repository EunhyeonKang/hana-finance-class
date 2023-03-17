package com.Example14;

public class Word {

    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }
    //i번째 글자가 모음인지 
    public boolean isVowel(int i) {
        return letters.substring(i, i + 1).equalsIgnoreCase("a") ||
                letters.substring(i, i + 1).equalsIgnoreCase("e") ||
                letters.substring(i, i + 1).equalsIgnoreCase("i") ||
                letters.substring(i, i + 1).equalsIgnoreCase("o") ||
                letters.substring(i, i + 1).equalsIgnoreCase("u");

    }
    //i번째 글자가 자음인지 
    public boolean isConsonant(int i) {
        return !isVowel(i);
    }

    public static void main(String[] args) {
        Word word = new Word("apple");
        for(int i=0;i<word.letters.length();i++) {
            //System.out.println(word.isVowel(i));
        }
        for(int i=0;i<word.letters.length();i++) {
            System.out.println(word.isConsonant(i));
        }


    }
}