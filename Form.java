import javax.swing.*;
import java.awt.*;
public class Form {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel panel = new MainPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
    }
}
