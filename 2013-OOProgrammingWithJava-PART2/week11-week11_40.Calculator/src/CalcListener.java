
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class CalcListener implements ActionListener{
    
    // Instance variables
    private JTextField output;
    private JTextField input;
    private JButton plusButton;
    private JButton minusButton;
    private JButton zButton;
    
    // Constructor
    public CalcListener(JTextField output, JTextField input, JButton plusButton, JButton minusButton, JButton zButton) {
        this.output = output;
        this.input = input;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.zButton = zButton;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!isValidInput()){
            this.input.setText("");
            if(e.getActionCommand() == "Z"){
                runZ();
            }
            return;
        }
        
        if(e.getActionCommand() == "Plus"){
            runPlus();
        }
        if(e.getActionCommand() == "Minus"){
            runMinus();
        }
        if(e.getActionCommand() == "Z"){
            runZ();
        }
        disableZ();
        this.input.setText("");
    }

    private void runPlus() {
        double i = Double.parseDouble(this.input.getText());
        int in = (int)i;
        
        double o = Double.parseDouble(this.output.getText());
        int out = (int)o;
        
        int result = in + out;
        
    
        this.output.setText("" + result);
    }

    private void runMinus() {
        double i = Double.parseDouble(this.input.getText());
        int in = (int)i;
        
        double o = Double.parseDouble(this.output.getText());
        int out = (int)o;
        
        int result = out - in;
        this.output.setText("" + result);
    }

    private void runZ() {
        this.output.setText("0");
    }

    private void disableZ() {
        double o = Double.parseDouble(this.output.getText());
        int out = (int)o;
        if(out == 0){
            zButton.setEnabled(false);
        } else{
            zButton.setEnabled(true);
        }
    }

    private boolean isValidInput() {
        try {
            double i = Double.parseDouble(this.input.getText());
            int in = (int)i;
            return true;
        } catch (Exception e) {
            return false;
        }
        //return true;
    }
    
}
