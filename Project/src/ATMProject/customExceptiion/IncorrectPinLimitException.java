package ATMProject.customExceptiion;

public class IncorrectPinLimitException extends Exception{
	public IncorrectPinLimitException(String errMsg) {
		super(errMsg);
	}
}
