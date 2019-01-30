package calculations;
import java.util.Scanner;
@interface author{
	String name();
}
@interface parameter{
	int num1();
	int num2();
	String operation();
}
@author (name="malak bawwab")
public class cal {
	public static void main(String[]args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int number1=s.nextInt();
	System.out.println("Enter the second number:");

	int number2=s.nextInt();
	System.out.println("Enter the operation:\n choose from these * , / , - ,+:");
	String operation=s.next();
	calculate(number1,number2,operation);
	}
	@parameter(num1=1,num2=1,operation="+")
	public static void calculate(int number1,int number2,String operation) {
if(operation.equals("+")) {
	int res=number1+number2;
	System.out.println("Result is "+res);

}
else if(operation.equals("-")) {
	int res=number1-number2;

	System.out.println("Result is "+res);

}
else if(operation.equals("*")) {
	int res=number1*number2;

	System.out.println("Result is "+res);

}
else if(operation.equals("/")) {
	if(number2!=0) {
		double res=(double)number1/number2;

	System.out.println("Result is "+res);

}
	else {
		System.out.println("divison over zero is not allowed");

	}
}
else {
	System.out.println("incorrect operation");

}
	}
}


