/*
 * Project #5
 * Source Code File: AnalyzeScores.java
 * Programmer: Arjun Suresh Kumar
 * Due: 11/22/21
 * Description: Takes in a series of scores
 * as input and outputs some statistics about
 * them, including the average.
 */

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        double[] inputArray = new double[100];
        double sum = 0;
        int count = 0;

        for(int i = 0; i < 100; i++){
            System.out.print("Enter score " + i + " (a negative score exits): ");
            double input = scanner.nextDouble();
            
            if(input < 0){
                count = i;
                break;
            }

            sum += input;
            inputArray[i] = input;
        }


        System.out.println("\nThe sorted scores: ");
        sort(inputArray, count);
        int aboveCount = 0;
        int belowCount = 0;
        for(int i = 0; i < count; i++){
            if(inputArray[i] < (sum/count)){
                belowCount++;
            } else {
                aboveCount++;
            }
            System.out.println(inputArray[i]);
        }
        System.out.println("\nThe average score is: " + sum/count);
        System.out.println("The number of scores above or equal to the average: " + aboveCount);
        System.out.println("The number of scores below the average: " + belowCount);
        scanner.close();

    }

    public static void sort(double[] array, int length){
        
        for (int i = 0; i < length - 1; i++){

            for (int j = 0; j < length - (i + 1); j++){

                if (array[j] > array[j + 1]){

                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
    }
}
