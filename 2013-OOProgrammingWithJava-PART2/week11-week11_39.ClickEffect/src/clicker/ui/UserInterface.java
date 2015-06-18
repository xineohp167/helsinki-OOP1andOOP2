package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    // Constructor
    public UserInterface(Calculator calc){
        this.calc = calc;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        JLabel numClicks = new JLabel("0");
        JButton clickButton = new JButton("Click!");
        
        ClickListener clickListener = new ClickListener(calc, numClicks);
        clickButton.addActionListener(clickListener);
        
        container.add(numClicks, BorderLayout.NORTH);
        container.add(clickButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
