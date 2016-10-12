package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;	
		}
		else if(text.contains(","))
		{
			int sum = 0;
			String[] num = text.split(",");
			for(String n : num)
			{
				sum += Integer.parseInt(n);
			}
			return sum;
		}
		else
			return 1;
	}
}
