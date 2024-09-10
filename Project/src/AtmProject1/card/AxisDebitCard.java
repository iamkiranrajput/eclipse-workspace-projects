package AtmProject1.card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import ATMProject.Interfaces.IATMServices;
import ATMProject.customExceptiion.InsufficientBalenceException;
import ATMProject.customExceptiion.InsufficientMachineBalanceException;
import ATMProject.customExceptiion.InvalidAmountException;
import ATMProject.customExceptiion.NotOperatorException;

public class AxisDebitCard implements IATMServices{
	
	
	String name;
	long debitCardNumber;
	double AccountBalance;
	int pinNumber;

	ArrayList<String> statement;
	
	final String type="user";
	int chances;
	
	
	public AxisDebitCard (String name,long debitCardNumber,double AccountBalance,int pinNumber) {
		super();
		
		chances=3;
		this.name=name;
		this.pinNumber=pinNumber;
		this.AccountBalance=AccountBalance;
		
		statement=new ArrayList<>();
		
	}
	
	@Override
	public String getUserType() throws NotOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientMachineBalanceException, InsufficientBalenceException {
			
		
		if(withAmount<=0) {
			throw new InvalidAmountException("you cant enter zero amount to withdraw . so please enter valid amount ");
		}else if(withAmount>AccountBalance) {
			throw new InsufficientBalenceException("dont have sufficient balance to withdraw check the balance");
		}else {
			
			AccountBalance=AccountBalance-withAmount;
			statement.add("Debited :"+withAmount);
			return 0;
		}
		
	}

	@Override
	public void depositeAmount(double dptAmount) throws InvalidAmountException {
		
		if(dptAmount<=0 || dptAmount%10!=0) {
			throw new InvalidAmountException("Please deposite valid  amount, wich is multiple of 100");
		}else {
			AccountBalance=AccountBalance+dptAmount;
			
			statement.add("credited "+dptAmount);
		}
		
	}

	@Override
	public double checkAmountBalance() {
		return AccountBalance;
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
		--chances;
		
	}

	@Override
	public int getChances() {
		return chances;
	}

	@Override
	public void resetPinChances() {
		
	}

	@Override
	public void generateMiniStatement() {

		int count=5;
		if(statement.size()==0) {
			System.out.println( "There are no transaction happen in your account");
			return;
		}
		System.out.println("=========last five transaction  ==========");
		
		for(String trans:statement) {
		if(count==0) {
			break;	
		}
		
		System.out.println(trans);
		count--;
		}
		Collections.reverse(statement);
	}

}
