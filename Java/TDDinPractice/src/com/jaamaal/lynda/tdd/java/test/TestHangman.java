package com.jaamaal.lynda.tdd.java.test;

import com.jaamaal.lynda.tdd.java.Hangman;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestHangman {

    @Test
    void test_alphabetCountInAWord() {
        String word = "Pizza";
        char alphabet = 'a';

        Hangman hangman = new Hangman();

        int count = hangman.countAlphabet(word, alphabet);

        assertEquals(1, count);
    }

    @Test
    void test_lengthOfFetchWord() {
        Hangman hangman = new Hangman();
        String word = hangman.fetchWord();

        assertTrue(word.length() == 5);
    }

    @Test
    void test_lengthOfFetchWordRandom() {
        Random random = new Random();
        int requestedLenght = random.nextInt(6) + 5;
        Hangman hangman = new Hangman();
        String word = hangman.fetchWord(requestedLenght);

        assertTrue(requestedLenght == word.length());
    }

    @Test
    void test_uniquenessOfFetchWord() {
        Random random = new Random();
        int requestedLength = 0;
        Set<String> usedWordsSet = new HashSet<>();
        int round = 0;
        String word = null;
        Hangman hangman = new Hangman();

        while (round < 100) {
            requestedLength = random.nextInt(6) + 5;
            word = hangman.fetchWord(requestedLength);
            round++;
            assertTrue(usedWordsSet.add(word));
        }
    }
}
