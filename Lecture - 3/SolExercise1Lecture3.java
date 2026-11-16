
package edu.zuj.vp.lecture3;

import java.util.Scanner;

public class SolExercise1Lecture3 {
    public static void main(String[] args) {
        
        System.out.println("please enter the number of n for square ???");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
                
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}