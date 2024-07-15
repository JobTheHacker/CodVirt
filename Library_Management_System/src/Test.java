import java.util.*;
public class Test 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		while(true)
		{
			System.out.println("Library Management System.");
			System.out.println("1. Add a book to the library");
			System.out.println("2. Search a book in the library");
			System.out.println("3. Check out a book");
			System.out.println("4. Return a book");
			System.out.println("5. Exit");
			
			int Choice = sc.nextInt();
			sc.nextLine();
			switch(Choice)
			{
			case 1:
				System.out.println("Enter the book's title:");
				String title = sc.nextLine();
				System.out.println("Enter the book's author:");
				String author = sc.nextLine();
				library.addBook(title, author);
				break;
			case 2:
				System.out.println("Enter the book's title:");
				title = sc.next();
				library.searchBook(title);
				break;
			case 3:
				System.out.println("Enter the book's title:");
				title = sc.next();
				library.checkedout(title);
				break;
			case 4:
				System.out.println("Enter the book's title:");
				title = sc.next();
				library.returnBook(title);
				break;
			case 5:
				System.out.println("Exiting the menu...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice, pelase enter again:");
			}
			
		}
	}

}
