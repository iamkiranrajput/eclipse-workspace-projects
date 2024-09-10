package ATMProject.Interfaces;

import ATMProject.customExceptiion.InsufficientBalenceException;
import ATMProject.customExceptiion.InsufficientMachineBalanceException;
import ATMProject.customExceptiion.InvalidAmountException;
import ATMProject.customExceptiion.NotOperatorException;

public interface IATMServices {

	// to get the user type,whether the user an operator or normal user
	public abstract String getUserType() throws NotOperatorException;

	// to withdraw the amount
	// Insufficient Amount Exception
	// Insufficient Machine Balance Exception
	// invalid amount Exception
	public abstract double withdrawAmount(double amount)throws InvalidAmountException, InsufficientMachineBalanceException,InsufficientBalenceException; 

//	to deposite the amount 
	public abstract void depositeAmount(double dptAmount) throws InvalidAmountException;
	
	//to checkt the balance
	public abstract double checkAmountBalance();
	
	//to change the pinnumber
	public  abstract void changePinNumber(int pinNumber);
	
	
//	to get the pin number
	public abstract int getPinNumber();
	
	// to get the user name
	public abstract String getUserName();
	
	//to check the number of attempts made by the user while entering the pin numeber
	public abstract void decreaseChances();
	
	
	//toget the remaining  chances of the pin
	public abstract int getChances();
	
	//to reset the chances by the operator  for the card which has been blocked by 3 time wrong pin number
	public abstract void resetPinChances();
	
	//toget the last 5 transaction
	public abstract void generateMiniStatement();
	
	
	
	
}
