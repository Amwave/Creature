import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;


public class ImagePanel extends JPanel{
	
	public int random(int min, int max) {

		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		}
	
	private JPanel panel; private int count; JLabel l2;
	private ImageIcon image = new ImageIcon("src/Creature.gif");

	
	private JButton caught; 
	
	public ImagePanel()
	{
		count = 0;
		caught = new JButton(image);
		caught.addActionListener(new ButtonListener());
		l2 = new JLabel("Caught: " + count);
		add(caught);
		add(l2);
		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.cyan);
		t.start();
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			l2.setText("Caught: " + count);
		}
	}

	Timer t = new Timer(500, new ActionListener()
			{
		public void actionPerformed(ActionEvent e) {
            caught.setLocation(random(300,40), random(300,40));
        }
			});
	

}



