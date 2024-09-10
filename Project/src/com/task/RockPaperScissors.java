package com.task;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors), or type 'exit' to end the game: ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            if (!isValidMove(playerMove)) {
                System.out.println("Invalid move. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            String computerMove = generateComputerMove();
            System.out.println("Computer chose: " + computerMove);

            String result = determineWinner(playerMove, computerMove);
            System.out.println(result);
        }

        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }

    private static String generateComputerMove() {
        int randomNum = new Random().nextInt(3);
        switch (randomNum) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock"; // This should never happen
        }
    }

    private static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                   (playerMove.equals("paper") && computerMove.equals("rock")) ||
                   (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}

