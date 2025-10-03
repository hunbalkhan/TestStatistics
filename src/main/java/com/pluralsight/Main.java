package com.pluralsight;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        int[] testScores = {67, 78, 42, 99, 23, 86, 77, 65,30,11};



        int highest = 0;
        int lowest = 100;
        int sum = 0;


        for(int score : testScores){
            sum += score;
            highest = Math.max(highest, score);
            lowest = Math.min(lowest, score);


        }

        int average = sum / testScores.length;

        System.out.println("The highest is: " + highest);
        System.out.println("The lowest is: " + lowest);
        System.out.println("The average is: " + average);
    }
}