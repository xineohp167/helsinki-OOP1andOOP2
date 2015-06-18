package survey;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox box1 = new JCheckBox("Yes!");
        JCheckBox box2 = new JCheckBox("No!");
        container.add(box1);
        container.add(box2);
        //Checkbox check1 = new Checkbox("Yes!"); 
        //Checkbox check2 = new Checkbox("No!");
        
//        CheckboxGroup cbg = new CheckboxGroup();
//        container.add(new Checkbox("Yes!.", cbg, true));
//        container.add(new Checkbox("No!", cbg, false));
        
        //container.add(check1);
        //container.add(check2);

        container.add(new JLabel("Why?"));

        JRadioButton meat = new JRadioButton("No reason.");
        JRadioButton fish = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(meat);
        buttonGroup.add(fish);

        container.add(meat);
        container.add(fish);
        
        container.add(new JButton("Done!"));
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
