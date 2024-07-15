
public class Student 
{
	String name;
	int ID;
	//Default Constructor
	public Student()
	{
		
	}
	//Parametrised Constructor
	public Student(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
	}
	//Overloaded Constructor
	public Student(int ID)
	{
		this.ID = ID;
	}
	
	public void Display()
	{
		System.out.println("Name: "+name+"\nID:"+ID);
		
	}
}
