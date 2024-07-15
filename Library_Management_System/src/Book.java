
public class Book 
{
	public String msg;
	private String title;
	private String author;
	private Boolean checkedout;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		checkedout = false;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setCheckedout(Boolean checkedout)
	{
		this.checkedout = checkedout;
	}
	
	public Boolean getCheckedout()
	{
		return checkedout;
	}
	
	public String toString()
	{
		if(!getCheckedout())
		{
			msg = "Book is not checked out";
		}
		else
		{
			msg = "Book is checked out";
		}
		return "Book's Title: "+title+"\nBook's Author: "+author+"\nBook's checkedout status: "+msg;
	}
}
