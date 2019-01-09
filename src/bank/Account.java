/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.ArrayList;
/**
 *
 * @author Zhanel
 */
public class Account {
    public Client firstName;
    public Client lastName;   
    private Client client;
    public int balance;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    public Account(Client firstName,Client lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance =balance;
    }
     public void convertToUSD() {
        System.out.println(getBalance() / 324);
    }
    public void convertToEUR() {
        System.out.println(getBalance() / 407);
    }
     public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public void getName(){
        System.out.println(client.firstName + " " +client.lastName);
    }
    
    public void getAccountBalance() {
        System.out.println(getBalance());
    }
    
    public void addTransaction(Transaction transaction) {
        if (transaction.getType() == 1) {
             setBalance(getBalance() + transaction.getAmount());
             System.out.printf("Счет пополнен на %d, \n Текущий счет: %d тг\n", transaction.getAmount(), getBalance());
        } else if(transaction.getType()  == 2) {
            setBalance(getBalance() - transaction.getAmount());
            System.out.printf("Со счета снято %d,\n Текущий счет: %d тг\n", transaction.getAmount(), getBalance());
        }
        this.transactions.add(transaction);
    }
    
    public void TransactionsHistory() {
            String type;
        for (Transaction transaction : transactions) {
            if (transaction.getType() == 1) {
                type = "Снятие со счета";
            } else {
                type = "Пополнение счета";
            }
            System.out.printf("id_транзакции: %d - %s на сумму: %d тг\n", transaction.getID(), type,transaction.getAmount());
        }
        
    }
    
    public void findByID(int ID){
        String type;
        for (Transaction transaction : transactions){
         if (transaction.getID() == ID){
            if (transaction.getType() == 1){
                 type = "Снятие со счета";
            } else {
                type = "Пополнение счета";
            }
            System.out.printf("id_транзакции: %d - %s на сумму: %d тг \n", transaction.getID(), type,transaction.getAmount());
            }
         else {System.out.println("Нет тразакции с таким ID");}
        }
    } 
}

    

