package inlab;

public class BookStore {
	
	public static void main(String[] args) throws InvalidBookException {
		
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
				
				try {
				throw new InvalidBookException("Invalid yearPublished argument for the book!",e);
				}
				catch(InvalidBookException a)
				{
					System.out.println("Cannot create the book instance!");
					System.out.println(a);
					System.out.println("caused by "+a.getCause());
					System.out.println("Please modify the input argument");
					System.out.println();
				}
				
			}
			catch(IllegalArgumentException e)
			{
				try {
					throw new InvalidBookException("",e);
					}
					catch(InvalidBookException a)
					{
						System.out.println("Cannot create the book instance!");
						System.out.println(a+" "+e.getMessage());
						System.out.println("caused by "+e.getClass());
						System.out.println("Please modify the input arguments"); 
						System.out.println();
					}
				
			}
			
			
			

	}
	}}

