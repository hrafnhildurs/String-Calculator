package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;	
		}
		else if(text.contains(","))
		{
			String[] num = text.split(",");

			return (Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
		}
		else
			return 1;
	}
}
