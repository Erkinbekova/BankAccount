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
public class Transaction {
    
    private final int ID;
    private int type;
    private int amount;
    
    public Transaction(int ID, int type, int amount) {
        this.ID = ID;
        this.type = type;
        this.amount = amount;
    }
    
    public int getID() {
        return this.ID;
    }
    public int getType() {
        return this.type;
    }
    public int getAmount() {
        return this.amount;
    }
}


