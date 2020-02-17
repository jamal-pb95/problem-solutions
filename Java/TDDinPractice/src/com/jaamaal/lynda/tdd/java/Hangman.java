package com.jaamaal.lynda.tdd.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hangman {

    public Set<String> usedWordsSet = new HashSet<>();
    public List<String> wordList = new ArrayList<>();
    private int x;

    public void loadWords() {
        String nextWord = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Projects\\problem-solving\\Java\\TDDinPractice\\src\\com\\jaamaal\\lynda\\tdd\\java\\WordsSet.txt"))) {
            while ((nextWord = bufferedReader.readLine()) != null) {
                wordList.add(nextWord);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fetchWord(int requestedLength) {
        String nextWord = null;
        int index = 0;
        while (true) {
            nextWord = wordList.get(index++);
            if (nextWord.length() != x) continue;
            if (usedWordsSet.add(nextWord)) break;
        }
        return nextWord;
    }
}
