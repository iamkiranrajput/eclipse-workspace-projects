package com.task;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.playGame();
    }

    private LinkedList<Point> snake;
    private Point food;
    private char[][] board;
    private int score;
    private boolean gameOver;

    public SnakeGame() {
    	board = new char[10][10];
        snake = new LinkedList<>();
        snake.add(new Point(0, 0));
        food = generateFood();
        score = 0;
        gameOver = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        for (Point point : snake) {
            board[point.getY()][point.getX()] = 'O';
        }

        board[food.getY()][food.getX()] = 'F';
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.println("Score: " + score);
            System.out.print("Enter move (W/A/S/D): ");
            char move = scanner.next().charAt(0);
            moveSnake(move);
            checkCollision();
            checkFood();
        }

        System.out.println("Game Over! Your final score is: " + score);
        scanner.close();
    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void moveSnake(char direction) {
        Point head = snake.getFirst();
        Point newHead = new Point(head.getX(), head.getY());

        switch (direction) {
            case 'W':
                newHead.setY(newHead.getY() - 1);
                break;
            case 'A':
                newHead.setX(newHead.getX() - 1);
                break;
            case 'S':
                newHead.setY(newHead.getY() + 1);
                break;
            case 'D':
                newHead.setX(newHead.getX() + 1);
                break;
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            score++;
            food = generateFood();
        } else {
            snake.removeLast();
        }

        initializeBoard();
    }

    private void checkCollision() {
        Point head = snake.getFirst();

        // Check if snake hits the walls or itself
        if (head.getX() < 0 || head.getX() >= board.length ||
            head.getY() < 0 || head.getY() >= board[0].length || isSnakeCollision()) {
            gameOver = true;
        }
    }

    private boolean isSnakeCollision() {
        Point head = snake.getFirst();
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                return true;
            }
        }
        return false;
    }

    private void checkFood() {
        if (snake.getFirst().equals(food)) {
            score++;
            food = generateFood();
        }
    }

    private Point generateFood() {
        int x = (int) (Math.random() * board.length);
        int y = (int) (Math.random() * board[0].length);

        while (snake.contains(new Point(x, y))) {
            x = (int) (Math.random() * board.length);
            y = (int) (Math.random() * board[0].length);
        }

        return new Point(x, y);
    }

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

