package edu.zuj.vp.lecture3;

import java.util.Scanner;

public class SolExercise3Lecture3 {
    
        public static void main(String[] args) {
        System.out.println("please enter the number of n for reverse triangle ???");
        Scanner s = new Scanner(System.in);  
        int n = s.nextInt();
        

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
    
}
