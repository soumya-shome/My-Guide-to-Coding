
//This class should inherit Exception class
public class InvalidPriceException extends Exception
{
    //Provide a single argument constructor
	public InvalidPriceException(String message){
        super(message);
    }
}