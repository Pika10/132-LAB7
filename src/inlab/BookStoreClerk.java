package inlab;

import java.util.Scanner;

public class BookStoreClerk{
	

	// Partitions the single input String into 3 substrings depending 
	// on the occurrences of '-' char and returns a String[] containing 3 elements:
	// First element is the substring from index 0 to first occurrence of '-' character
	// Second element contains the substring from the first occurrence of '-' character to its second
	// Third element contains the substring from the second occurrence of '-' character to the end of the input
	// In case of not finding enough '-' chars (2 in this case) in the input string, should throw Exception.
	private String[] partitionString(String theString)
	{
		int counter=0;
		String[] theStringSplit = theString.split("");
		for (String i : theStringSplit)
		{
			if (i.equals("-"))
			{
				counter++;
			}
		}
		if (counter!=2)
		{
			throw new IllegalArgumentException("Invalid Input to partitionString method: Could not find seperator character '-'");
		}
		String[] lastVersionSplit = theString.split("-");	
		return lastVersionSplit;
	}	
	
	// Reads input bookInfo using a ScannerObject
	// Note that bookInfo should be in desired format, as it is explained in Lab Assignment Document
	// First checks whether input book info is blank or null, throws necessary exceptions
	// Then, calls partitionString method to partition input bookInfo into pieces
	// Saves the partitioned pieces into necessary variables
	// Finally, if all necessary info is valid,i.e., bookName, authorName and yearPublished, creates
	// a new book instance and returns it. If even one of them is invalid, throws Exception
	public Book readAndValidateBook() 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter information for book in required format:");
		String bookInfo = input.nextLine();
		
		if (bookInfo.isBlank() || bookInfo==null)
		{
			
			throw new IllegalArgumentException("Input BookInfo is empty!");
		}
		else
		{
			boolean controller=false;
			String[] save = partitionString(bookInfo);
			if (bookInfo.startsWith("-") ||  save[1].isBlank())
			{
				throw new IllegalArgumentException("Input BookInfo is invalid!");
			}
			if (bookInfo.endsWith("-"))
			{
				throw new NumberFormatException("For input string:"+'"'+'"');
			}
			
			
			char[] myArray = save[2].toCharArray();
			char[] myDigits={'0','1','2','3','4','5','6','7','8','9'};
			for (char i : myArray)
			{
				controller=false;
				for (char a:myDigits)
				{
					if (i==a)
					{
						controller=true;
					}
					
				}
				if (controller==false)
				{
					throw new NumberFormatException("For input string:"+ '"'+save[2]+'"');
				}
			}
			int theYear= Integer.parseInt(save[2]);
			Book myBook= new Book(save[0],save[1],theYear);
			return myBook;
			
			
			
			}
			
		}
		 
		
		}
	

