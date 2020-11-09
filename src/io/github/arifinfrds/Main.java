package io.github.arifinfrds;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {-4, 3, -9, 0, 4, 1};
        plusMinus(numbers);
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(n)
    
    // Complete the plusMinus function below.
    static void plusMinus(int[] numbers) {
        int positiveCount = 0;
        int neutralCount = 0;
        int negativeCount = 0;
        int numbersCount = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount += 1;
            }
            if (numbers[i] == 0) {
                neutralCount += 1;
            }
            if (numbers[i] < 0) {
                negativeCount += 1;
            }
        }

        double positiveRatio = (double) positiveCount / (double) numbersCount;
        double neutralRatio = (double) neutralCount / (double) numbersCount;
        double negativeRatio = (double) negativeCount / (double) numbersCount;

        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", neutralRatio);
    }
}
