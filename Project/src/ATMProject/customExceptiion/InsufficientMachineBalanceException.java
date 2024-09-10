package ATMProject.customExceptiion;

public class InsufficientMachineBalanceException extends Exception {
	public InsufficientMachineBalanceException(String errMsg) {
		super(errMsg);
	}
}
