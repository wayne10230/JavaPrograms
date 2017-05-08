import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame 
{
private JTextField screen=new JTextField(10);
private final int WINDOW_WIDTH=400;
private final int WINDOW_HEIGHT=300;
//private GridWindow keypad= new GridWindow();
private String[] symbol= {"7","8","9","+", "4","5","6","-", "1","2","3","*", "c","0","=","/"}; 

public Calculator ()
{
	setTitle ("Border Layout");
	setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	setLayout (new BorderLayout ());
	
	JPanel panel=new JPanel();
	
	panel.setLayout (new GridLayout (4,4));
	
	JButton[] buttons=new JButton [16];
	
	
	for (int i=0;i<16;i++)
	{
		buttons[i]=new JButton (symbol[i]);
		panel.add (buttons[i]);
		buttons[i].addActionListener(new ButtonListener());
	}
	
	add (screen,BorderLayout.NORTH);
	add (panel,BorderLayout.CENTER);
	
	setVisible(true);
}
	
public static void main (String[]args)
{
	new Calculator ();
}

private class ButtonListener implements ActionListener
{
	public void actionPerformed (ActionEvent e)
	{
		String nameButton=e.getActionCommand();
		
		
		screen.setText(nameButton);
		
	}
}
}
