import java.util.Scanner;

public class driver 
{
	public static void main(String[] args)
	{
		//Input and Intial Variables
		Integer TempNumb = 0;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Number Conversion System");
		System.out.println("Type in a number you want converted.");
		Integer NumberInput = myobj.nextInt();
		String FinalNumber="";
		
		Integer OrginalInput = NumberInput;
		String FNumb = "";
		
		//Conversion
		while(NumberInput > 2)
		{
			TempNumb = NumberInput / 2;
			if(NumberInput%2 == 1)
			{
				FNumb = FNumb + 1;
				NumberInput = TempNumb;
			}
			else{
				FNumb = FNumb + 0;
				NumberInput = TempNumb;
			}
			
				
		}
		//Output
		for(int i = FNumb.length()-1; i >= 0; i--)
			{
				FinalNumber = FinalNumber + FNumb.charAt(i);
				
			}
			System.out.print("The Binary Number of: ");
			System.out.print(OrginalInput);
			System.out.println(" is");
			System.out.println(FinalNumber);
		
	}
}