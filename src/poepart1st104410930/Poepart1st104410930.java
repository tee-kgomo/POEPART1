/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1st104410930;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Poepart1st104410930 {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }

    public String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUsername(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            return "Registration successful!";
        }
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean loginStatus) {
        return loginStatus ? "Welcome " + firstName + " " + lastName + ", it is great to see you again!" : "Username or password incorrect, please try again";
    }
}
 


   


