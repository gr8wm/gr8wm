package temperatureConvrerter;

import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.event.*;

public class tempConv implements ActionListener {
	
	convTemper parent;
	String text;
	tempConv (convTemper parent) {
		this.parent = parent;
	}
	
	public void actionPerformed (ActionEvent e) {
		
		DecimalFormat dfT = new DecimalFormat ("#.##"); //округление чисел
		
		String celsText = parent.celsNumb.getText();
		String forenText = parent.forenNumb.getText();
		String kalvText = parent.kalvNumb.getText();
		System.out.println(" C " + celsText + " F " + forenText + " K " + kalvText);
		numbers num = new numbers(); // объявил класс numbers для сортировки данных
		
			if (!"".equals (celsText)) {
				
				num.text = celsText; // задал значение переменной для сортировки
				
				double displayC = Double.parseDouble (num.numbs()); // в скобках запустил метод из класса
				
				String tempC  = dfT.format(displayC);
				parent.celsNumb.setText(tempC);
								
				double displayF = (displayC * 1.8) + 32;
				String tempF = dfT.format(displayF);
				parent.forenNumb.setText(tempF);
			 
				double displayK = displayC + 273.15;
				String tempK = dfT.format(displayK);
				parent.kalvNumb.setText(tempK);
				
			} else if (!"".equals (forenText)) {
				
				num.text = forenText;
				
				double displayF = Double.parseDouble (num.numbs());
				String tempF =dfT.format(displayF);
				parent.forenNumb.setText(tempF);
				
				double displayC = (displayF - 32)/ 1.8;
				String tempC = dfT.format(displayC);
				parent.celsNumb.setText(tempC);
				
				double displayK = (displayF + 459.67) * 0.55;
				String tempK = dfT.format(displayK);
				parent.kalvNumb.setText(tempK);
				
			} else if (!"".equals (kalvText)) {
				
				num.text = kalvText;
				
				double displayK = Double.parseDouble (num.numbs());
				String tempK = dfT.format(displayK);
				parent.kalvNumb.setText(tempK);
				
				double displayC = displayK - 273.15;
				String tempC = dfT.format(displayC);
				parent.celsNumb.setText(tempC);
			 				
				double displayF = (displayK * 0.55) - 459.67;
				String tempF = dfT.format(displayF);
				parent.forenNumb.setText(tempF);
			}
		
		if (JOptionPane.showConfirmDialog(null, "ещё посчитаемся? ;)", "вопросик", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
			parent.celsNumb.setText("");
			parent.forenNumb.setText("");
			parent.kalvNumb.setText("");
		} else {
			System.exit(0);
		}
	}
}



	
	

