package Project2;

public class PromptBank {

	static String [] questions; //questions = new String[   ];
	static String [] statements;
	static String BLANK1;
	static String BLANK2;

	public static void Promptbank() {
		
		questions = new String[5];
		statements = new String[5];
		BLANK1 = "";
		BLANK2 = "";
		
		//initialize your array to the correct length to match your number of questions you populate it with
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
		
	}

	public static void populateStatementsArray(String userSentence){
		
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Explain futher on BLANK1 and BLANK2";
		statements[4] = "BLANK1 and BLANK2 seem interesting.";
		
		/*statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public static void populateQuestionsArray(String userSentence){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "What are your thoughts on BLANK1 and BLANK2?";
		questions[4] = "Are BLANK1 and BLANK2 important to you?";
		
		/* questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
		
	}
	public static String getRandomStatementTrunk(){
		int Random = (int)(Math.random() * statements.length);
		return statements[Random];
		//=fill in the method so it randomly selects the statement template
		//from the questions array ... hint use Math.random() to get the random index
	}
	public static String getRandomQuestionTrunk(){
		int Random = (int)(Math.random() * questions.length);
		return questions[Random];
		
	}
	
	
	
}
