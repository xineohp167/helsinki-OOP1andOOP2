
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField output;
    private JTextField input;
    private JButton plusButton;
    private JButton minusButton;
    private JButton zButton;
    

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        output = new JTextField("0");
        output.setEnabled(false);
        input = new JTextField("0");
        container.add(output);
        container.add(input);
        container.add(createPanel());
    }
    
    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        zButton = new JButton("Z");
        zButton.setEnabled(false);
        
        plusButton.setActionCommand("Plus");
        minusButton.setActionCommand("Minus");
        zButton.setActionCommand("Z");
        
        
        
        CalcListener calcListener = new CalcListener(output, input, plusButton, minusButton, zButton);
        plusButton.addActionListener(calcListener);
        minusButton.addActionListener(calcListener);
        zButton.addActionListener(calcListener);
        
        
        
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(zButton);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}