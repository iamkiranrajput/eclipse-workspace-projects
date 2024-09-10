package ATMProject.customExceptiion;

public class InvalidPinException extends Exception{
	public InvalidPinException(String errMsg) {
		super(errMsg);
	}

}
