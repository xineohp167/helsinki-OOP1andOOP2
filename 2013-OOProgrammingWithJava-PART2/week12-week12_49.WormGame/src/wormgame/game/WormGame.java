package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        Random gen = new Random();
        int xApple = gen.nextInt(width + 1);
        while(xApple == width / 2){
            if(width < 2){
                break;
            }
            xApple = gen.nextInt(width + 1);
        }
        int yApple = gen.nextInt(height + 1);
        while(yApple == height / 2 || yApple == xApple){
            if(height < 2){
                break;
            }
            yApple = gen.nextInt(height + 1);
        }
        apple = new Apple(xApple, yApple);

    }

    public Worm getWorm() {
        return worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.worm.move();
        if(this.worm.runsInto(apple)){
            this.worm.grow();
            createApple();
        }
        if(this.worm.runsIntoItself()){
            continues =false;
        }
        // check for hitting right and left border
        if(this.worm.getX() <= 0 || this.worm.getX() >= this.width){
            continues =false;
        }
        // check for hitting up and down border
        if(this.worm.getY() <= 0 || this.worm.getY() >= this.height){
            continues =false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());
        if (!continues) {
            return;
        }

    }

    private void createApple() {
        Random gen = new Random();
        int xApple = gen.nextInt(width + 1);
        
        int yApple = gen.nextInt(height + 1);
        apple = new Apple(xApple, yApple);
        while(this.worm.runsInto(apple)){
            xApple = gen.nextInt(width + 1);
            yApple = gen.nextInt(height + 1);
            apple = new Apple(xApple, yApple);
        }
        this.setApple(apple);
    }

}