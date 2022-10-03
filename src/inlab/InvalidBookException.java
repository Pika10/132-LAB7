package inlab;

public class InvalidBookException extends Exception {
	public InvalidBookException()
	{
		super();
	}
	public InvalidBookException(String msg,Throwable e)
	{
		super(msg,e);
	}
}
