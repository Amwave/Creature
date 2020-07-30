import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class MainPanel extends JPanel{
    
    private JPanel p1, p2, p3, p4, p5;
    JLabel l1, l2;
    JButton b1, b2;
    
    public MainPanel()
    {
        p1 = new JPanel();
        p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.WEST);
        add(p4, BorderLayout.CENTER);
        add(p5, BorderLayout.EAST);
        
        l1 = new JLabel("Demographic Survey");
        l2 = new JLabel("Please complete this form. Press the submit button when complete.");
        JPanel p11 = new JPanel(); p11.add(l1); p11.setBackground(Color.cyan);
        JPanel p12 = new JPanel(); p12.add(l2); p12.setBackground(Color.cyan);
        p1.add(p11); p1.add(p12);
        p1.setBackground(Color.cyan);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        
        b1 = new JButton("Clear");
        b2 = new JButton("Submit");
        p2.add(b1); p2.add(b2);
        p2.setBackground(Color.cyan);
        
        JPanel p31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p32 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p33 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p34 = new JPanel();
        JLabel l31 = new JLabel("First Name: "); l31.setHorizontalAlignment(JLabel.LEFT);
        JLabel l32 = new JLabel("Last Name: "); l32.setHorizontalAlignment(JLabel.LEFT);
        JLabel l33 = new JLabel("Middle Initial: "); l33.setHorizontalAlignment(JLabel.LEFT);
        JTextField tf1 = new JTextField(); tf1.setColumns(10);
        JTextField tf2 = new JTextField(); tf2.setColumns(10);
        JTextField tf3 = new JTextField(); tf3.setColumns(1);
        p31.add(l31); p31.add(tf1); p31.setBackground(Color.YELLOW);
        p32.add(l32); p32.add(tf2); p32.setBackground(Color.YELLOW);
        p33.add(l33, FlowLayout.LEFT); p33.add(tf3); p33.setBackground(Color.YELLOW);
        p3.add(p31); p3.add(p32); p3.add(p33);
        p3.setBackground(Color.YELLOW);
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p34.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Gender"));
        ButtonGroup G = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("Male"); 
        G.add(r1); r1.setBackground(Color.YELLOW);
        JRadioButton r2 = new JRadioButton("Female");
        G.add(r2); r2.setBackground(Color.YELLOW);
        p34.setLayout(new GridLayout(2, 1));
        p34.setBackground(Color.yellow);
        p34.add(r1); p34.add(r2); p3.add(p34);
        
        
        JCheckBox cb1 = new JCheckBox("Reading");  
        JCheckBox cb2 = new JCheckBox("Hiking");  
        JCheckBox cb3 = new JCheckBox("WoodWorking");          
        JCheckBox cb4 = new JCheckBox("Origami");    
        JCheckBox cb5 = new JCheckBox("Classic Sports");
        JCheckBox cb6 = new JCheckBox("Xtreme sports");  
        JLabel l41 = new JLabel("Other");
        JTextField tf41 = new JTextField();
        p4.add(cb1); cb1.setBackground(Color.YELLOW);
        p4.add(cb2); cb2.setBackground(Color.YELLOW);
        p4.add(cb3); cb3.setBackground(Color.YELLOW);
        p4.add(cb4); cb4.setBackground(Color.YELLOW);
        p4.add(cb5); cb5.setBackground(Color.YELLOW);
        p4.add(cb6); cb6.setBackground(Color.YELLOW);
        p4.add(l41);
        p4.add(tf41);
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        p4.setBackground(Color.YELLOW);
        p4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Hobbies"));
        
        
        JLabel l51 = new JLabel("Age:");
        l51.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        JSlider slider = new JSlider();
        slider.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        slider.setMinorTickSpacing(20); slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(Color.YELLOW);
        Hashtable position = new Hashtable();
        position.put(0, new JLabel("0"));
        position.put(20, new JLabel("20"));
        position.put(40, new JLabel("40"));
        position.put(60, new JLabel("60"));
        position.put(80, new JLabel("80"));
        position.put(100, new JLabel("100"));
        slider.setLabelTable(position); 
        JLabel l52 = new JLabel("Salary Range: ");
        l52.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        JComboBox<String> c1 = new JComboBox(); c1.addItem("Select...");
        c1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        p5.add(l51);
        p5.add(slider);
        p5.add(Box.createVerticalGlue());
        p5.add(l52);
        p5.add(Box.createHorizontalGlue());
        p5.add(c1);
        p5.add(Box.createHorizontalGlue());
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        p5.setBackground(Color.YELLOW);
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        p5.add(Box.createVerticalGlue());
        
        
        
        
    }
}
