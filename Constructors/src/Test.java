import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		Student S1 = new Student();
		Student S2 = new Student("Mike", 9);
		Student S3 = new Student(8);
		System.out.println("Default Constructor :");
		S1.Display();
		System.out.println("Parametrised Constructor :");
		S2.Display();
		System.out.println("Overloaded Constructor :");
		S3.Display();

	}

}
