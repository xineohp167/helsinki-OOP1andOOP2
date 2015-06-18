
package week11_calculator;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
 
public class GraphicCalculator implements Runnable {
    private JFrame frame;
    int result;
 
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        createComponents(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    private void createComponents(Container container) {
        frame.setLayout(new GridLayout(3, 1));
        JTextField resultField = new JTextField("0");
        container.add(resultField);
        resultField.setEnabled(false);
        JTextField inputField = new JTextField("");
        container.add(inputField);
 
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");
 
        EventListener handler = new EventListener(plus, minus, reset, resultField, inputField);
 
        plus.addActionListener(handler);
        minus.addActionListener(handler);
        reset.addActionListener(handler);
        reset.setEnabled(false);
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(plus);
        panel.add(minus);
        panel.add(reset);
        container.add(panel);
    }
 
    public JFrame getFrame() {
        return frame;
    }
}