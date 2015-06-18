
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Hand implements Comparable<Hand>{
    
    // Instance variables
    private List<Card> hands;
    
    // Constructor
    public Hand() {
        this.hands = new ArrayList<Card>();
    }
    
    public void add(Card card){
        if(!hands.contains(card)){
            hands.add(card);
        }
    }
    
    public void print(){
        for (Card card : hands) {
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hands);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hands, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand other) {
        int hand1 = 0;
        int hand2 = 0;
        
        for (Card card : this.hands) {
            hand1 += card.getValue();
        }
        for (Card card : other.hands) {
            hand2 += card.getValue();
        }
        
        return hand1 - hand2;
    }
    
    
}
