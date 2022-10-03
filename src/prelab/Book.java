package prelab;

public class Book {

	// Instance variables:
	// name
	// authorName
	// yearPublished
	String name;
	String authorName;
	int yearPublished;
	
	public Book(String name,String authorName,int yearPublished)
	{
		this.name=name;
		this.authorName=authorName;
		this.yearPublished=yearPublished;
	}
	
	public String toString()
	{
		return "Book Name: "+name+"\n"+"Author Name: "+authorName+"\n"+"Year Published: "+yearPublished+"\n"+"\n";
	}
	
	// Methods:
	// Constructor
	// toString
	
}
