/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }
    
    public void payEconomical() {
        // write code here
        if(this.balance >= 2.5){
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        // write code here
        if(this.balance >= 4.){
            this.balance -= 4.;
        }
    }
    
    public void loadMoney(double amount) {
        // write code here
        if(amount < 0){
            return;
        }
        if(this.balance + amount > 150){
            this.balance = 150;
        } else{
            this.balance += amount;
        }
    }
    

    @Override
    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
    
    
}
