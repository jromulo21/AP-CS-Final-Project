package hangman;
import java.util.ArrayList;
import java.util.Random;

//LINK TO QUESTIONS: http://trivia.fyi/

public class Questions {
	
	private static ArrayList<String> triviaQuestions = new ArrayList<String>();
	private static ArrayList<String> answers = new ArrayList<String>();

	public static void assignQuestions(){
		triviaQuestions.add("What type of animal is known as the ship of the desert?");
		answers.add("camel");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What is the capital city of Croatia?");
		answers.add("Zagreb");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("One kilobyte is equal to how many bytes?");
		answers.add("1024");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What was the full name of British novelist C. S. Lewis?");
		answers.add("Clive Staples Lewis");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What do the letters HTML, a markup language used to create web pages, stand for?");
		answers.add("Hypertext Markup Language");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What does KFC stand for?");
		answers.add("Kentucky Fried Chicken");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What year was Facebook founded?");
		answers.add("2004");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("How many holes are there in a full round of golf? (answer in numbers)");
		answers.add("18"); //maybe add another one saying "eighteen"; main program, if answer == list[1] or list[2], update remaining answer by 1
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What is the white part of the inside of an egg called?");
		answers.add("albumen");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("Which team won the 2016 Super Bowl?");
		answers.add("Broncos");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What did the Hollywood sign in LA originally say");
		answers.add("HollywoodLand");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("In what year did the French revolution began? (answer in numbers)");
		answers.add("1789");
		//-------------------------------------------------------------------------------
		triviaQuestions.add("What is the name of the main antagonist in Street Fighter?");
		answers.add("M.Bison");
		//-------------------------------------------------------------------------------
	}

	//==================================================================== 

	public static String randomQuestionGenerator(int r){
		return triviaQuestions.get(r);
	}
	
	//==================================================================== 

	public static String returnRandomAnswer(int n){
		return answers.get(n);
	}
	
	//==================================================================== 

	public static void removeQuestion_Answer(int n){
		triviaQuestions.remove(n);
		answers.remove(n);
	}
	
	//====================================================================//TESTING METHOD

	public static void printQuestions(){
		System.out.println(triviaQuestions);
	}
	
	//====================================================================//TESTING METHOD

	public static void removeEntireLists(){
		triviaQuestions.clear();
		answers.clear();
	}
	
	//==================================================================== 
	
	public static int returnListLength(){ //RETURNS THE LENGTH OF ARRAYLIST TRIVIA_QUESTIONS
		return triviaQuestions.size();
	}
	
	//==================================================================== 

}