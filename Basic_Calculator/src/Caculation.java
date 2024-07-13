import java.util.*;
public class Caculation 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		double x,y,z = 0;
		String Op;
		System.out.println("Enter the first integer :");
		x = sc.nextDouble();
		System.out.println("Enter the second integer :");
		y = sc.nextDouble();
		do
		{
		System.out.println("Choose the opeartion you would like to preform (*,-,+,/) :");
		Op = sc.next();
		if((Op.equals("*")) || (Op.equals("+")) || (Op.equals("-")) || (Op.equals("/")))
		{
			break;
		}
		else if ((!Op.equals("*")) || (!Op.equals("+")) || (!Op.equals("-")) || (!Op.equals("/")))
		{
			System.out.println("The input is wrong, please try again.");
			
		}
		}while((!Op.equals("*")) || (!Op.equals("+")) || (!Op.equals("-")) || (!Op.equals("/")));
		
		switch(Op) 
		{
		case "*":
			System.out.println("The result is :"+(x*y));
			break;
		case "+":
			System.out.println("The result is :"+(x+y));
			break;
		case "/":
			System.out.println("The result is :"+(x/y));
			break;
		case "-":
			System.out.println("The result is :"+(x-y));
			break;
		}
			
		
		

	
	
}
}
