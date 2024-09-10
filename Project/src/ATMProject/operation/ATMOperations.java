package ATMProject.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ATMProject.Interfaces.IATMServices;
import ATMProject.customExceptiion.IncorrectPinLimitException;
import ATMProject.customExceptiion.InsufficientBalenceException;
import ATMProject.customExceptiion.InsufficientMachineBalanceException;
import ATMProject.customExceptiion.InvalidAmountException;
import ATMProject.customExceptiion.InvalidCardException;
import ATMProject.customExceptiion.InvalidPinException;
import ATMProject.customExceptiion.NotOperatorException;
import AtmProject1.card.AxisDebitCard;
import AtmProject1.card.HDFCDebitCard;
import AtmProject1.card.OperatorCard;
import AtmProject1.card.SBIDebitCard;

public class ATMOperations {
	
	public static double ATM_MACHINE_BALANCE=100000.0d;
	public static ArrayList<String> ACTIVITY= new ArrayList<>();
	public static HashMap<Long, IATMServices> database=new HashMap<>();
	public static boolean MACHINE_ON=true;
	
	public static IATMServices card=null;
	
	//to validate the inserted card
	public static IATMServices validateCard(long cardNumber) throws InvalidCardException{
		
		if(database.containsKey(cardNumber)) {
			return database.get(cardNumber);

		}else {
			ACTIVITY.add("Access by "+ cardNumber+"is not compitable");
			throw new InvalidCardException("This is not valid card");
		}
		
		
	}
	public static void checkATMMachineActivities() {
		System.out.println("=====Activities Peraformed=====");
		for (String activity:ACTIVITY) {
			System.out.println();
			
			System.out.println(activity);
			System.out.println();
		}
		
	}
	
	public static void resetUserAttempts(IATMServices OperatorCard) {
		IATMServices card=null;
		int pin;
		long number;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter user card number");
		number=s.nextLong();
		
		try {
			card=validateCard(number);
			card.resetPinChances();
			
		}catch(InvalidCardException e) {
			System.out.println(e.getMessage());
		}
		ACTIVITY.add("Accessed by :"+OperatorCard.getUserName()+"to reset the number of chances for :"+card.getUserName());
		
	}
	public static IATMServices validateCredentials(long cardNumber, int pinNumbr) throws InvalidCardException, IncorrectPinLimitException,InvalidPinException {
		if(database.containsKey(cardNumber)) {
			card=database.get(cardNumber);
		}
		else {
			throw new InvalidCardException("This card is not valid card...");
		}
		
		try {
			if(card.getUserType().equals("operator")) {
				if(card.getPinNumber()!=pinNumbr){
					throw new InvalidPinException("Dear operator please enter valid pin number");
				}
				else {
					return card;
				}
			}
		}catch(NotOperatorException e) {
			e.printStackTrace();
		}
		
		if(card.getChances()<=0)
		{
			throw new IncorrectPinLimitException("you have exceeeded number of attempts");
		}
		if(card.getPinNumber()!=pinNumbr)
		{
			card.decreaseChances();
			throw new InvalidPinException("you have entered wrong pin");
		}
		else {
			return card;
		}
		
	}
	
	public static void validateAmount(double amount) throws InsufficientBalenceException{
		if(amount>ATM_MACHINE_BALANCE) {
			throw new InsufficientBalenceException("this machine dosent have sufficient balance to performt the operation");
		}
	}
	
	
	public static void validateDepositeAmount( double amount) throws InsufficientMachineBalanceException{
		if(amount+ATM_MACHINE_BALANCE>200000.0d) {
			throw new InsufficientMachineBalanceException("capacity Reached...");
		}
	}
	
	
	
	// this method is used for operator
	
	public static void operatorMode(IATMServices card) {
		Scanner s=new Scanner(System.in);
		double amount;
		boolean flag=true;
		while(flag) {
			System.out.println("operator mode: Operator Name"+card.getUserName());
			System.out.println("==============================================");
			System.out.println("||   0 to swtich of the machine  ||");
			
			System.out.println("||   1 to check the ATM machine Balance  ||");
			System.out.println("||   2 Deposite the ammount in the ATM Machine  ||");
			System.out.println("||   3 Reset the user Pin attempts ||");
			System.out.println("||   4 Activites performed on the  machine  ||");
			System.out.println("||   5 Exit the operator mode  || \n");
			
			System.out.println("Please enter the your choice");
			
			int option=s.nextInt();
			
			switch(option) {
			case 0 :MACHINE_ON=false;
					ACTIVITY.add("Accessed by :"+card.getUserName()+" Activity persformed : swtiched off machine" );
					flag =false;
					break;
					
			case 1 :
			ACTIVITY.add("Accessed by :"+card.getUserName()+" Activity persformed : checking the ATM Machine BAlance" );
			System.out.println("The balance of ATM machie is : "+ATM_MACHINE_BALANCE+ "cash");
			break;
			
			case 2 :
				System.out.println("please enter the ammount to fill in the machine ");
				ACTIVITY.add("Accessed by :"+card.getUserName()+" Activity persformed : Filling the Balance into the machine" );
				System.out.println("==============================================");
				System.out.println("======================= cash addded to the machine =======================");
				System.out.println("==============================================");
				break;
			
		case 3 :
			
			resetUserAttempts(card);
			
			System.out.println("==============================================");
			System.out.println("======================= user card attempts reset succesfully =======================");
			System.out.println("==============================================");
			
			ACTIVITY.add("Accessed by :"+card.getUserName()+" Activity persformed : Reseting the user pin attempts" );
			break;
			
		case 4:
			checkATMMachineActivities();
			break;
			
		case 5:
			flag=false;
			break;
			
		default : 
			System.out.println("Enter valid optiioin");
			}



			
			
			
			
			
		}
	}
	public static void main(String[] args) throws InvalidAmountException, InsufficientBalenceException{
			
		database.put((long) 123456789 , new HDFCDebitCard("kiran", 123456789,30000.0d,2222));
		database.put((long) 987654321 , new AxisDebitCard("raj", 987654321,90000.0d,33333));
		database.put((long) 235675123 , new SBIDebitCard("Ashish", 235675123,80000.0d,1111));
		database.put((long) 121212121 , new OperatorCard(121212121, 1111,"operator 1"));

		
		int option =0;
		String nextOption =null;
		long cardNumber =0;
		double depositeAmount =0.0d;
		double withdrawAmount =0.0d;
		int pin=0;
		
		Scanner s =new Scanner(System.in);
		while(MACHINE_ON) {
			System.out.println("Please Insert the debit card");
			cardNumber=s.nextLong();
			
			try {
				System.out.println("Pleas enter your pin number");
				pin=s.nextInt();
				card=validateCredentials(cardNumber,pin);
				ACTIVITY.add("Accessed by : "+card.getUserName()+" Status : Accessed Aproved");
				break;
				
			}catch(InvalidPinException e) {
				ACTIVITY.add("Accessed by : "+card.getUserName()+" Status : Accessed Denied");
				System.out.println(e.getMessage());
				continue;
				
			}catch(IncorrectPinLimitException ipl) {
				ACTIVITY.add("Accessed by : "+card.getUserName()+" Status : Accessed Denied due to attept exceed");
				System.out.println(ipl.getMessage());
				continue;

			}catch(InvalidCardException e) {
				ACTIVITY.add("Accessed by : "+card.getUserName()+" Status : Accessed Denied due to invalid card");
				System.out.println(e.getMessage());
				continue;
			}
		
	}
		try {
			if(card.getUserType().equals("operator")) {
				operatorMode(card);
			}
			
			start :while(true) {
				System.out.println("====================================");
				System.out.println("||   1 Withdraw Ammount   ||");
				System.out.println("||   2 Deposite AMount  ||");
				System.out.println("||   3 Check BAlance ||");
				System.out.println("||   4 Change Pin ||");
				System.out.println("||   5 Mini Statement  || \n");	
				System.out.println("Please valid choice");
				
				option =s.nextInt();
				
				try {
					switch(option) {
					case 1:
						System.out.println("Please enter the amount to withdraw");
						withdrawAmount=s.nextDouble();
						validateAmount(withdrawAmount);
						card.withdrawAmount(withdrawAmount);
						ATM_MACHINE_BALANCE=ATM_MACHINE_BALANCE-withdrawAmount;
						ACTIVITY.add("Accessed by : "+card.getUserName()+" Activity : Ammount is Wthdrawn"+withdrawAmount+" from the machine");
						break;
					case 2:System.out.println("please enter the amount to deposite");
							depositeAmount=s.nextDouble();
							validateAmount(depositeAmount);
							ATM_MACHINE_BALANCE=ATM_MACHINE_BALANCE+depositeAmount;
	
							card.depositeAmount(depositeAmount);
							ACTIVITY.add("Accessed by : "+card.getUserName()+" Activity : Ammount is deposited"+depositeAmount+" to the machine");
							break;
							
					case 3:System.out.println("your account balance "+ card.checkAmountBalance());
					ACTIVITY.add("Accessed by : "+card.getUserName()+" Activity : checked balance");
					break;
					
					case 4:
						System.out.println("enter a new Pin");
						pin=s.nextInt();
						card.changePinNumber(pin);
						ACTIVITY.add("Accessed by : "+card.getUserName()+" Activity : changed the pin number");
						break;
					case 5:
						ACTIVITY.add("Accessed by : "+card.getUserName()+" Activity : Genertate Mini Statement");
						card.generateMiniStatement();
						break;
					default: System.out.println("enter valid option");
					}
					System.out.println("do you want to continue");
					nextOption=s.next();
					
					if(nextOption.equalsIgnoreCase("N")) {
						break start;
					}
					
						
				}catch(InvalidAmountException IAE) {
					System.out.println(IAE.getMessage());
				}
				catch(InsufficientBalenceException ise) {
					System.out.println(ise.getMessage());
				}
			
			}
			
			
		}catch(Exception  e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("====================================");
		System.out.println("=============== THanks for visiting our ATM =====================");
		System.out.println("====================================");

	
}
}
