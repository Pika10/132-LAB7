package prelab;

public class BookStore {
	
	public static void main(String[] args) {
		
		BookStoreClerk clerk = new BookStoreClerk();
		
		while (true)
		{
			try
			{
				Book tempBook = clerk.readAndValidateBook();
				System.out.println(tempBook.toString());

				System.out.println("BookStore Registration Program ended");
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Cannot create the book instance!");
				System.out.println(e);
				System.out.println("Please modify the input yearPublished argument"); 
				System.out.println();
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Cannot create the book instance!");
				System.out.println(e);
				System.out.println("Please modify the input arguments"); 
				System.out.println();
				
			}
			
			
			

	}
	}}

