package calculator;

public class StringCalculator {

	public int calculate(String number) {
		
		if(number=="")
		{
			return 0;
		}
		else
		{
			int num[]=new int[3];
			if(number.contains(",") || number.contains("\n"))
			{
				String str[]=number.split(",|\n");
				num[0]=Integer.parseInt(str[0]);
				
				num[1]=Integer.parseInt(str[1]);
				
				if(str.length==3)
				{
					num[2]=Integer.parseInt(str[2]);
				}
				return addingNumbers(num); 
				
			}
			return convertStringToInt(number); 
		}
		
	}
	private int convertStringToInt(String number)
	{
		int temp=Integer.parseInt(number);
		if(temp<0)
		{
			throw new NagativeNumberException("Nagative Number is Not Allowed!");
		}
		return temp;
		
	}
	private int addingNumbers(int[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				throw new NagativeNumberException("Nagative Number is Not Allowed!");
			}
			if(num[i]>1000)
			{
				continue;
			}
			sum=sum+num[i];
		}
		
		return sum;
		
	}
	

}
