/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fabien
 */
class Dungeon {
    
    // Instance variables
    private int length;
    private int height;
    // private int vampires;
    private int moves;
    private boolean vampiresMove;
    private List<Vampire> vampires;
    private Random random = new Random();
    Scanner reader = new Scanner(System.in);
    private int playerX;
    private int playerY;
    

    // Constructor
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.playerX = 0;
        this.playerY = 0;
        this.vampires = new ArrayList<Vampire>();
        for (int i = 0; i < vampires; i++) {
            int x = randomBoardX();
            int y = randomBoardY();
            if(x != 0 && y != 0 && !containsVampire(x, y)){
                this.vampires.add(new Vampire(x, y));
            } else{
                i--;
            }
            
        }
    }

    private int randomBoardX() {
        return random.nextInt(this.length + 1);
    }

    private int randomBoardY() {
        return random.nextInt(this.height + 1);
    }

    private boolean containsVampire(int x, int y) {
        for (Vampire vampire : vampires) {
            if(vampire.getX() == x && vampire.getY() == y){
                return true;
            }
        }
        return false;
    }
    
    public void run() {
        while(!vampires.isEmpty() && moves > 0) {
            System.out.println(moves);
            System.out.println("");
            System.out.println("@ " + playerX + " " + playerY);

            // vampires who run into player
            ArrayList<Vampire> toBeRemoved = new ArrayList<Vampire>();
            for(Vampire v : vampires) {
                if(containsPlayer(v.getX(), v.getY())) {
                    toBeRemoved.add(v);
                }
            }
            vampires.removeAll(toBeRemoved);
            toBeRemoved.clear();

            for(Vampire v : vampires) {
                System.out.println("v " + v.getX() + " " + v.getY());
            }
            
            System.out.println("");
            for(int h = 0; h < height; h++) {
                for(int l = 0; l < length; l++) {
                    if(containsVampire(l, h)) {
                        System.out.print("v");
                    } else if(containsPlayer(l, h)) {
                        System.out.print("@");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            
            // player moves
            String answer = reader.nextLine();
            for(char c : answer.toCharArray()) {
                if(c == 'a') {
                    playerX -= 1;
                }
                if(c == 's') {
                    playerY += 1;
                }
                if(c == 'w') {
                    playerY -= 1;
                }
                if(c == 'd') {
                    playerX += 1;
                }
            }
            if(playerX < 0) {
                playerX = 0;
            }
            if(playerY < 0) {
                playerY = 0;
            }
            if(playerX >= length) {
                playerX = length - 1;
            }
            if(playerY >= height) {
                playerY = height - 1;
            }

            // if hit vampire is cleared
            if(containsVampire(playerX, playerY)) {
                for(Vampire v : vampires) {
                    if(containsPlayer(v.getX(), v.getY())) {
                        toBeRemoved.add(v);
                    }
                }
            }
            vampires.removeAll(toBeRemoved);
            toBeRemoved.clear();

            // vampire moves
            for(Vampire v : vampires) {
                // 1: left, 2: up, 3: right, 4: down
                int n = randomMove();
                int left = v.getX() - 1;
                int up = v.getY() - 1;
                int right = v.getX() + 1;
                int down = v.getY() + 1;
                if(n == 1 && left >= 0 && !containsVampire(left, v.getY())) {
                    v.setX(left);
                } else if (n == 2 && up >= 0 && !containsVampire(v.getX(), up)){
                    v.setY(up);
                } else if (n == 3 && right < length && !containsVampire(right, v.getY())) {
                    v.setX(right);
                } else if (n == 4 && down < height && !containsVampire(v.getX(), down)) {
                    v.setY(down);
                }
            }

            moves--;
        }
        if(vampires.isEmpty()) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }

    private boolean containsPlayer(int x, int y) {
        return x == playerX && y == playerY;
    }

    private int randomMove() {
        return random.nextInt(4) + 1;
    }
}
