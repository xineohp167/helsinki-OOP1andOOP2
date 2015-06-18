
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        double economicalLunch = 2.5;
        if(cashGiven < economicalLunch){
            return cashGiven;
        }
        this.cashInRegister += economicalLunch;
        this.economicalSold++;
        return cashGiven - economicalLunch;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gournetLunch = 4;
        if(cashGiven < gournetLunch){
            return cashGiven;
        }
        this.cashInRegister += gournetLunch;
        this.gourmetSold++;
        return cashGiven - gournetLunch;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
         double economicalLunch = 2.5;
         if(card.balance() < economicalLunch){
             return false;
         }
         this.economicalSold++;
         return card.pay(economicalLunch);
         
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double gournetLunch = 4;
         if(card.balance() < gournetLunch){
             return false;
         }
         this.gourmetSold++;
         return card.pay(gournetLunch);
         
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
       // ...
        if(sum <= 0){
            return;
        }else{
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}