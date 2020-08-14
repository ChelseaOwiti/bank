/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author chelsea
 */
public class Account {
   private int id= 0;
   private double balance = 0;
   private double input = 0;
   private double withdraw = balance - input;
   private double deposit = balance + input;
   
//    
    public double getBalance(){
    
    return this.balance;
    }
    public double withdraw(double withdraw){
    String input = (String)JOptionPane.showInputDialog(null,"Enter amount to withdraw","Withdrawal",JOptionPane.PLAIN_MESSAGE, null, null,"");
    
    double withAm = 0;
        try{
            withAm = Double.parseDouble(input);
        } catch(NumberFormatException e){
            
        }
       return 0;
    
    }
    
//    public void testGitWorked(){
//        
//    }
//new function to test
//    public double deposit(){
//        return this.depost;
//        
//    }

//   
    
   
   
   
   
   
   
   
   
}
