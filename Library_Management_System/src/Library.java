import java.util.ArrayList;
public class Library 
{
	private ArrayList<Book> book;
	
	public Library()
	{
		this.book = new ArrayList<>();
	}
	public void addBook(String title, String author)
	{
		book.add(new Book(title, author));
		System.out.println("Book added to the library.");
	}
	
	public void searchBook(String title)
	{
		for(Book book: book)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				System.out.println("Found the following book :\n"+book);
				return;
			}
		}
		System.out.println("Book not found.");
	}
	
	public void checkedout(String title)
	{
		for(Book book:book)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				if(!book.getCheckedout())
				{
					book.setCheckedout(true);
					System.out.println("Book checked out");
				}
				else
				{
					System.out.println("Book is already checked out");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}
	public void returnBook(String title)
	{
		for(Book book:book)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				if(book.getCheckedout())
				{
					book.setCheckedout(false);
					System.out.println("Book returned");
				}
				else
				{
					System.out.println("Book is already returned to the library");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}
}
