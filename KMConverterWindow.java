import javax.swing.*;
import java.awt.event.*;

	public class KMConverterWindow extends JFrame
	{
		private JPanel panel;
		
		private JLabel messageLabel;
		private JLabel messageLabel2;
		private JTextField KMTextField;
		private JTextField KMTextField2;
		private JButton calcButton;
		private JButton calcButton2;
		private final int WINDOW_W=620;
		private final int WINDOW_H=200;
		
		public KMConverterWindow ()
		{
			setTitle ("KM and M converter");
			
			setSize (WINDOW_W, WINDOW_H);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			buildpanel();
			
			
			add(panel);
			
			
			setVisible(true);
		}
		
		private void buildpanel()
		{
			messageLabel=new JLabel ("Enter a distance"+"in KM");
			messageLabel2=new JLabel ("Enter a distance"+"in M");
			
			KMTextField=new JTextField (10);
			KMTextField2=new JTextField (10);
			
			calcButton=new JButton ("Calculate miles");
			calcButton2=new JButton ("Calculate feet");
			
			calcButton.addActionListener(new CalcButtonListener());
			calcButton2.addActionListener(new CalcButtonListener2());
			panel=new JPanel ();
			
			panel.add(messageLabel);
			panel.add(KMTextField);
			panel.add(calcButton);
			panel.add(messageLabel2);
			panel.add(KMTextField2);
			panel.add(calcButton);
			panel.add(calcButton2);
		}
		
	
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			String input;
			String input2;
			double miles;
			double feet;
			
			
			input=KMTextField.getText();
			
			
			miles=Double.parseDouble(input)*0.6214;
			
			
			JOptionPane.showMessageDialog (null, input+"KM is"+miles+"miles" );
			
		}
	}
	private class CalcButtonListener2 implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			String input;
			String input2;
			double miles;
			double feet;
			
			
			
			input2=KMTextField2.getText();
			
			
			feet=Double.parseDouble(input2)*3.28084;
			
			JOptionPane.showMessageDialog (null,input2+"M is"+feet+"feet");
			
		}
	}
	}



