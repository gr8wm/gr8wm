package temperatureConvrerter;

//import java.util.Scanner;

public class numbers {
	
		String text;
		int j =0;
		int i = 0;
		String numbs () {
		char[] s1 = new char[text.length()];
		s1 = text.toCharArray();
		char[] s2 = new char[text.length()+1];
		for (j = 0; j < text.length(); j++) {
			if (s1[j] == '-') {
				s2[0] = s1[j];
			} else if (Character.isDigit(s1[j]) || s1[j] == '.') {
				i++;
				s2[i] = s1[j];
			}
		}
		String numbers = new String(s2);
		numbers.replaceAll("\\s+","");
		System.out.println(numbers);
		return numbers;
	
		}
}		
		
