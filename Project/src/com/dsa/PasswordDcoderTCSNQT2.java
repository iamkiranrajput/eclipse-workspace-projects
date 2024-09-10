package com.dsa;

public class PasswordDcoderTCSNQT2 {

    public static String encodeText(String text, int numColumns) {
        int length = text.length();
        int numRows = (int) Math.ceil((double) length / numColumns);
        char[][] matrix = new char[numRows][numColumns];
        
        // Fill the matrix row by row
        int k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (k < length) {
                    matrix[i][j] = text.charAt(k++);
                } else {
                    matrix[i][j] = ' '; // Fill the remaining cells with spaces if necessary
                }
            }
        }

        // Read the matrix column by column
        StringBuilder encodedText = new StringBuilder();
        for (int j = 0; j < numColumns; j++) {
            for (int i = 0; i < numRows; i++) {
                encodedText.append(matrix[i][j]);
            }
        }

        return encodedText.toString();
    }

    public static void main(String[] args) {
        String text = "encode this text in a matrix";
        int numColumns = 5;

        String encodedText = encodeText(text, numColumns);
        System.out.println("Original Text: " + text);
        System.out.println("Encoded Text: " + encodedText);
    }
}

