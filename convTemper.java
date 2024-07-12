package temperatureConvrerter;

import java.awt.GridLayout;
import javax.swing.*;

public class convTemper {	
	
	JTextField forenNumb;
	JTextField celsNumb;
	JTextField kalvNumb;
	
	convTemper() {
		
		tempConv tempConv = new tempConv(this);
		
		JPanel panel = new JPanel();
		GridLayout g1 = new GridLayout(3,2,7,7);
		panel.setLayout(g1);
	
		JLabel celsius = new JLabel("     Celsius here ");
		celsNumb = new JFormattedTextField();
		celsNumb.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel forenheit = new JLabel("     Forenheit there ");
		forenNumb = new JFormattedTextField();
		forenNumb.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel kalvin = new JLabel("     and Kalvins  ");
		kalvNumb = new JFormattedTextField();
		kalvNumb.setHorizontalAlignment(JTextField.CENTER);
			
		panel.add(celsius);
		panel.add(celsNumb);
		panel.add(forenheit);
		panel.add(forenNumb);
		panel.add(kalvin); 
		panel.add(kalvNumb);
		
		celsNumb.addActionListener(tempConv);
		forenNumb.addActionListener(tempConv);
		kalvNumb.addActionListener(tempConv);
	
		JFrame frame = new JFrame("temperature converter");
		frame.setSize(320,130);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(panel);
		frame.setResizable(false);
		frame.setLocation(900, 500);
	}

public static void main(String[] args) {
	convTemper converter = new convTemper();
	}		
}
