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
public class registration {
    public static void main(String[]args){
        login login = new login();
        String FirstName = JOptionPane.showInputDialog("Please enter your first Name");
        String LastName = JOptionPane.showInputDialog("please enter your last Name");
        String username = JOptionPane.showInputDialog("Please enter your username");
        String password = JOptionPane.showInputDialog("Please enter your password");
        
        String registrationMessage = login.registerUser(username,password,FirstName,LastName);
        JOptionPane.showMessageDialog(null, registrationMessage);
        
        if(registrationMessage.equals("Registration successful!")){
            login.main(args);
            
        }
    }
}

    
