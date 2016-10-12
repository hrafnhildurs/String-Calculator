package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;	
		}
		else if(text.contains(","))
		{
			return sum(splitInput(text));
		}
		else
			return 1;
	}

	private static String[] splitInput(String input){
		return input.split(",");
	}

	private static int sum(String[] num){
		int sum = 0;
		for(String n : num)
		{
			sum += Integer.parseInt(n);
		}
		return sum;
	}
}
