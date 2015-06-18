
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Team {
    
    // Instance variables
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    // Constructor
    public Team(String name){
        this.name = name;
        players = new ArrayList<Player>();
        maxSize = 16;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player){
        if(players.size() < this.maxSize){
            players.add(player);
        }
        
    }
    
    public void printPlayers(){
        for (Player player : players) {
            System.out.println(player);
        }
    }

    /**
     * @param maxSize the maximum number of players that the team can have
     */
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    /**
     * @return the number of players
     */
    public int size(){
        return players.size();
    }
    
    public int goals(){
        int allGoals = 0;
        for (Player player : players) {
            allGoals += player.goals();
        }
        return allGoals;
    }
}
