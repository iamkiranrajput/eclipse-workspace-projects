package com.task;
import java.util.*;

//. Generate a random number within a specified range, such as 1 to 100.
//2. Prompt the user to enter their guess for the generated number.
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//You can incorporate additional details as follows:
//5. Limit the number of attempts the user has to guess the number.
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won

public class NumberGame {
	
	public static void main(String[] args) {
		
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int score=0;
		boolean flag;
		int matches=1;

		while(true) {
			flag=false;
			int randNum=r.nextInt(100);
		
			System.out.println("Enter the number between 1 to 100");

		for(int i =1; i<10; i++) {
			int userGuess=s.nextInt();
			
			if(randNum<userGuess) {
				System.out.println("your entered number is too high..");
				System.out.println("Enter the small number:");
			
			}else if(randNum>userGuess) {
				System.out.println("your entered number is too small");
				System.out.println("Enter the big number");
			}
			else if(randNum==userGuess) {
				System.out.println("great.. you guess the number in "+i+" iteration..");
				score++;
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("you reach the max iteration your score is: "+score+"/"+matches);
		}
		System.out.println("Do you want to play again ?");
		char dec=s.next().charAt(0);
		if(dec=='N'|| dec=='n') {
			break;
		}
		
		matches++;
		}
		
		System.out.println("Your score is: "+score+"/"+matches);
		
	}

}
