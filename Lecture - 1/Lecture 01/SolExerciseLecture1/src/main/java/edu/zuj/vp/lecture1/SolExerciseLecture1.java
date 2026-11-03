
package edu.zuj.vp.lecture1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SolExerciseLecture1 {

    public static void main(String[] args) {

        
    //    Execerise:
    //    1- Write a GUI application to sum two numbers ???
    

        Scanner s=new Scanner(System.in);
        
        String number1 = JOptionPane.showInputDialog("Enter The First Number");
        
        int n1 = Integer.parseInt(number1);
        
        String number2 = JOptionPane.showInputDialog("Enter The Second Number");
        
        int n2 = Integer.parseInt(number2);
        
        int sum = n1+n2;
        
        JOptionPane.showMessageDialog(null,"sum = "+sum);
        
    }
}
