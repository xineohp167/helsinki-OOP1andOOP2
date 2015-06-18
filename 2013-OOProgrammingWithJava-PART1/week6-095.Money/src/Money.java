
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        int euro = this.euros() + added.euros();
        int cent = this.cents() + added.cents();
        if(cent >= 100){
            euro++;
            cent = cent - 100;
        }
        return new Money(euro, cent);
    }
    
    public boolean less(Money compared){
        if (this.euros < compared.euros) {
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }else{
            return false;
        }
    }
    
    public Money minus(Money decremented){
        if(this.less(decremented)){
            //int money = ((decremented.euros*100) + decremented.cents)-((this.euros * 100) + this.cents);
            return new Money(0, 0);
        }else{
            int money = ((this.euros*100) + this.cents)-((decremented.euros * 100) + decremented.cents);
            return new Money((money / 100), (money % 100));
        }
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
