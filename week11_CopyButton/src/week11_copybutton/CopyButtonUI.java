/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week11_copybutton;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author Fabien
 */
public class CopyButtonUI implements Runnable{
    
    // Instance variables
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Swing on");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(1, 3);
        container.setLayout(layout);

        JTextArea textAreaLeft = new JTextArea("The Copier");
        JTextArea textAreaRight = new JTextArea();
        JButton copyButton = new JButton("Copy!");

        AreaCopier copier = new AreaCopier(textAreaLeft, textAreaRight);
        copyButton.addActionListener(copier);

        container.add(textAreaLeft);
        container.add(copyButton);
        textAreaRight.setEditable(false);
        container.add(textAreaRight);
        
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
