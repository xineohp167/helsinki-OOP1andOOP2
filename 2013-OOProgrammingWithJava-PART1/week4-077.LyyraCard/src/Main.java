
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.print("Pekka: ");
        System.out.println(cardPekka);
        System.out.print("Brian: ");
        System.out.println(cardBrian);
        
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.print("Pekka: ");
        System.out.println(cardPekka);
        System.out.print("Brian: ");
        System.out.println(cardBrian);
        
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        
        cardBrian.loadMoney(50);
        
        
        System.out.print("Pekka: ");
        System.out.println(cardPekka);
        System.out.print("Brian: ");
        System.out.println(cardBrian);

    }
}
