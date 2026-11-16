package edu.zuj.vp.lecture3;

import java.util.Scanner;

public class SolExercise2Lecture3 {
    
    public static void main(String[] args) {
        System.out.println("please enter the number of n for triangle ???");
        Scanner s = new Scanner(System.in);  
        int n = s.nextInt();
        

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
    }
    
}
