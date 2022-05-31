package Project2;

import java.util.Scanner;

public class ProjectEliza {
	
	static String userSentence = ""; //initialize
	static Scanner in = new Scanner(System.in); //to collect user input collected

	public static void main(String[] args) {
		
	System.out.println("ELIZA:    Hello, my name is Eliza. What is your name?");
	System.out.print("USER:     ");
	String userName = in.nextLine(); //user input collect
	if (userName.equalsIgnoreCase("EXIT")) { //calls on the EXIT class
		EXIT(userName);
	
		
	}
	
	System.out.println("ELIZA:    Hello, " + userName + ". Tell me what is on your mind today in 1 sentence."); //first question
	System.out.print("USER: "); 
	userSentence = in.nextLine(); //user input collect
	if (userSentence.equalsIgnoreCase("EXIT")) {
		EXIT(userSentence);	
	}
	else
	{communicate();
	
	}}
	
	private static void communicate() { 
	
		PromptBank.Promptbank(); //imports from Prompt bank folder

		
		while (!userSentence.equalsIgnoreCase("EXIT")) {
			if(userSentence.charAt(userSentence.length()-1) == '?') { // Check the 1/2word to see if there is a question mark
				//and replace
				
			PromptBank.populateQuestionsArray(userSentence); //question
				String question = PromptBank.getRandomQuestionTrunk(); // call the random class
				String arrofwords[] = userSentence.split(" ", 100); 
	
				String last = arrofwords[arrofwords.length-1];//last word 
				last = last.replace("?", "");     		//so you can replace BLANK1 and BLANK2 with the appropriate words
				String first = arrofwords[0]; //first word
				first = first.replace("?", "");	 //replace
				question = question.replace("BLANK1", first);
				question = question.replace("BLANK2", last);
			
				
				System.out.println("ELIZA:  " + question); //
			}
			
			else if (userSentence.charAt(userSentence.length()-1) == '!'){ // Check the 1/2words to see if there is a exclamation mark 
				//and  replace
			
			
				PromptBank.populateStatementsArray(userSentence);
				String statement = PromptBank.getRandomStatementTrunk();

				
			String arrofwords[] = userSentence.split(" ", 100);

			String last = arrofwords[arrofwords.length-1];
			last = last.replaceAll("!", "");
			String first = arrofwords[0];
			first = first.replaceAll("!", "");	
			statement = statement.replace("BLANK1", first);
			statement = statement.replace("BLANK2", last);
				

				System.out.println("ELIZA: WOW! Dramatic! " + statement);

	
	}
			
			else {
			PromptBank.populateStatementsArray(userSentence);
			String statement = PromptBank.getRandomStatementTrunk();
			
			String arrofwords[] = userSentence.split(" ", 20);

			String last = arrofwords[arrofwords.length-1];
	  	    last = last.replaceAll("[^a-zA-Z0-9]", ""); //// Check the last word to see if there is a special character
	  	    //and replace
	  	    String first = arrofwords[0];
			first = first.replaceAll("[^a-zA-Z0-9]", "");	
	        statement = statement.replace("BLANK1",first);
	     	statement = statement.replace("BLANK2",last);
			
			System.out.println("ELIZA: " + statement);

			}
			
			System.out.print("USER: ");
			userSentence = in.nextLine();
		}
		
		if (userSentence.equalsIgnoreCase("EXIT")) 
		{ EXIT(userSentence);
		}
		}

	public static void EXIT(String userSentence) {
		
	    Scanner in = new Scanner(System.in); 	
		System.out.println("ELIZA: Do you want to run the session again?");
		String stop = in.next();
		if(stop.equalsIgnoreCase("YES")) {
			ProjectEliza.main(null);
			
		}
           if(stop.equalsIgnoreCase("NO")) {
       		System.out.println("ELIZA: Goodbye, until next time");
       		System.exit(0);
        //  	in.close();

	}
          }
	
		
	}
	






