package com.dsa;
public class PasswordDecoder {

    public static String decodeText(String encodedText, int numColumns) {
        int length = encodedText.length();
        int numRows = (int) Math.ceil((double) length / numColumns);
        char[][] matrix = new char[numRows][numColumns];
        
        // Fill the matrix column by column
        int k = 0;
        for (int j = 0; j < numColumns; j++) {
            for (int i = 0; i < numRows; i++) {
                if (k < length) {
                    matrix[i][j] = encodedText.charAt(k++);
                } else {
                    matrix[i][j] = ' '; // Fill the remaining cells with spaces if necessary
                }
            }
        }

        // Read the matrix row by row
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                decodedText.append(matrix[i][j]);
            }
        }

        return decodedText.toString().trim(); // Remove trailing spaces if any
    }

    public static void main(String[] args) {
        String encodedText = "eet  incthtne  xetarhm ix";
        int numColumns = 5;

        String decodedText = decodeText(encodedText, numColumns);
        System.out.println("Encoded Text: " + encodedText);
        System.out.println("Decoded Text: " + decodedText);
    }
}
