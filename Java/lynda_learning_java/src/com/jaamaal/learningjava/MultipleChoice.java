package com.jaamaal.learningjava;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";

        // multiple choices
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "venus";

        // answer
        String correctAnswer = choiceTwo;

        // print the question for user
        System.out.println(question);

        // print all the possible choices
        System.out.println("The following choices are: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        // take user input as answer
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        // check user input
        if (correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats! Your answer is correct.");
        } else {
            System.out.println("Sorry! You entered wrong answer. correct answer is " + choiceTwo);
        }
    }
}
