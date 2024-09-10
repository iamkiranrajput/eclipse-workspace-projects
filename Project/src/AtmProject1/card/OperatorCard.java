package AtmProject1.card;

import ATMProject.Interfaces.IATMServices;
import ATMProject.customExceptiion.InsufficientBalenceException;
import ATMProject.customExceptiion.InsufficientMachineBalanceException;
import ATMProject.customExceptiion.InvalidAmountException;
import ATMProject.customExceptiion.NotOperatorException;

public class OperatorCard implements IATMServices{

	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	
	
	
	public OperatorCard(long idNumber,int pin, String name) {
		this.id=idNumber;
		this.pinNumber=pin;
		this.name=name;
	}
	
	

	@Override
	public String getUserType() throws NotOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double amount)
			throws InvalidAmountException, InsufficientMachineBalanceException, InsufficientBalenceException {
		return 0;
	}

	@Override
	public void depositeAmount(double dptAmount) throws InvalidAmountException {
		
	}

	@Override
	public double checkAmountBalance() {
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber=pinNumber; 
		
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void decreaseChances() {
		
	}

	@Override
	public int getChances() {
		return 0;
	}

	@Override
	public void resetPinChances() {
		
	}

	@Override
	public void generateMiniStatement() {
		
	}
	
	
	
	
	
}
