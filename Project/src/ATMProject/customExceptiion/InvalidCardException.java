package ATMProject.customExceptiion;

public class InvalidCardException extends Exception {
	public InvalidCardException(String errMsg) {
		super(errMsg);
	}
}
