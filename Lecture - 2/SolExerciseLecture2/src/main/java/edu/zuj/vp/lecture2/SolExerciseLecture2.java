
package edu.zuj.vp.lecture2;

import javax.swing.JOptionPane;


public class SolExerciseLecture2 {

    public static void main(String[] args) {
        
        
        String number = JOptionPane.showInputDialog("Enter The Number Please");
        double n = Double.parseDouble(number);
        
        String msg = "Choose The Process Please \n";
        msg+= "--------------------------------------\n";
        msg+=" 1- Inche to CM \n";
        msg+=" 2- CM to Inche \n";
        msg+=" 3- Feet to Meter \n";
        msg+=" 4- Meter to Feet \n";
        msg+=" 5- Dunm to Hiktar \n";
        msg+=" 6- Hiktar to Dunm \n";
        msg+=" 7- Fenh to Cels \n";
        msg+=" 8- Cels to Fenh \n";
        msg+=" 9- Quit \n";
        msg+= "--------------------------------------\n";

        String process = JOptionPane.showInputDialog(msg);
        int pro = Integer.parseInt(process);
        
        switch (pro) {
            case 1: JOptionPane.showMessageDialog(null, n * 2.54);  break;
            case 2: JOptionPane.showMessageDialog(null, n / 2.54);  break;
            case 3: JOptionPane.showMessageDialog(null, n * 0.3048);  break;
            case 4: JOptionPane.showMessageDialog(null, n / 0.3048);  break;
            case 5: JOptionPane.showMessageDialog(null, n * 0.1);  break;
            case 6: JOptionPane.showMessageDialog(null, n * 10);  break;
            case 7: JOptionPane.showMessageDialog(null, (n - 32) * 5 / 9);  break;
            case 8: JOptionPane.showMessageDialog(null, (n * 9 / 5) + 32);  break;
            case 9: JOptionPane.showMessageDialog(null, "Good Bye End Process");  break;
            
            default: JOptionPane.showMessageDialog(null, "Invalid Process");
                
        }
        
        
    }
}
