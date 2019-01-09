/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Zhanel
 */
   
public class Client {
    
    
    public static String firstName;
    public static String lastName;
    public Client() {
        
    }
    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     public static String getName(){
       return (firstName+" "+ lastName);
    }  
}


