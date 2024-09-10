package ATMProject.customExceptiion;

public class InvalidAmountException extends Exception {

	public InvalidAmountException(String errMsg) {
		super(errMsg);
	}

}
