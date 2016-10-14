package is.ru.stringcalculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;	
		}
		if(text.startsWith("//"))
		{
			String regEx = text.substring(2,3);
			String[] t = text.split("\n");
			text = t[1].toString();
			return sum(splitInput(text, regEx));

		}
		negative(splitInput(text));
		if(text.contains(",") || text.contains("\n"))
		{
			return sum(splitInput(text));
		}
		else
			return 1;
	}

	private static int toInt(String n){
		return Integer.parseInt(n);
	}
	private static String[] splitInput(String input){
		return input.split(",|\n");
	}

	private static String[] splitInput(String input, String regEx){
		return input.split(regEx);
	}

	private static int sum(String[] num){
		int sum = 0;
		for(String n : num)
		{
			if(toInt(n) > 1000)
			{
				sum += 0;
			}
			else
				sum += toInt(n);
		}
		return sum;
	}

	private static void negative(String[] num){
		List<Integer> negNum = new ArrayList<Integer>();
		for(String n : num)
		{
			if(Integer.parseInt(n) < 0)
			{
				negNum.add(toInt(n));
			}
		}
		if(!negNum.isEmpty())
		{
			String msg = "Negatives not allowed: ";
			for(Integer n : negNum)
			{
				msg += n + ",";
			}
			throw new IllegalArgumentException(msg);
		}
	} 

	
}
