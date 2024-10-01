/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1st104410930;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
 public class login1 {
 public static void login() {
   
String username = JOptionPane.showInputDialog("Please enter username");
if(username.contains("_") && username.length() <= 5){
         JOptionPane.showMessageDialog(null,"Username captured successfully");
        }
        else{
        JOptionPane.showMessageDialog(null,"username is invalid, please ensure that your usernme contains" + "/n"
                + "an underscore and is less than 5 characters");
}
 
String password = JOptionPane.showInputDialog("Please enter password");
if(password != null && password.length()>= 8
  && password.matches(".*[A-Z]*.") && 
  password.matches(".*[0-9]*.") &&
  password.matches(".*[!@#$%^&*]*.")){
  JOptionPane.showMessageDialog(null,"password successfully captured");         
  }
  else{
  JOptionPane.showMessageDialog(null,"Password is not correctly formatted,"+"/n"+ "please ensure that the password contains atleast 8 characters"
  +"/n" + ", a capital letter, a number and a special character");
   } 
  
  JOptionPane.showMessageDialog(null,
          "/n" + "username :" + username +
         "\n" + "password :" + password);  
}
 
     }
 
 
 

