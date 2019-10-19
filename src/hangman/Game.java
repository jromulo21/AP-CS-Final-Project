package hangman;
import java.util.Random;
import java.util.Scanner;

public class Game extends Questions{
	private String playerName;
	
	//==================================================================== 
	
	public Game(String playerName){
		this.playerName = playerName;
	}
	
	//==================================================================== 
	//TO DO, MOVE THIS TO QUESTION GUESS / LETTER GUESS
	public void mainProcess(){
		//-------------------------
		assignQuestions(); //QUESTION ASSIGNMENT
		//-------------------------
		int score = 6; //STARTING SCORE
		//-------------------------
		for (int i = 0; i < 4; i++){
			System.out.print(". "); //WAITING DOT EFFECT
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); //FROM AUTO GENERATED CODE
			}
		}
		//-------------------------
		System.out.println(); //SPACING
		System.out.println("---------------------------------------------------------------");
		System.out.println("WELCOME " + this.playerName.toUpperCase() + ", TO REVERSE HANGMAN");
		System.out.println("---------------------------------------------------------------\n");
		
		//-----------------------------------------
		HangmanGrid grid = new HangmanGrid();
		int n = returnListLength(); //11
		//-----------------------------------------
		
		while (n > 0){
			Scanner scanner = new Scanner(System.in);
			//---------------------------------------------
			System.out.println("[current number of body parts: " + score + "]");
			//---------------------------------------------
			System.out.println(grid.returnComplete(score)); //PRINTS GRID
			//---------------------------------------------
			Random random = new Random();
			int r = random.nextInt(n);
			//---------------------------------------------
			String question = "[" + randomQuestionGenerator(r) + "]: ";
			String answer = returnRandomAnswer(r);
			System.out.print(question);
			//---------------------------------------------
			String userInput = scanner.nextLine();
			if (userInput.toLowerCase().equals(answer.toLowerCase())){
				System.out.println("===You got it right!===");
				if (score < 6){ //MAX SCORE == 6
					score++;
				}
				//----------------------------------------
				timeWait(2700);
				//----------------------------------------
			}else{
				System.out.println("===You got it wrong!===");
				String prompt = ("[The correct answer is: ");
				score--;
				//----------------------------------------
				printCoolWay(prompt);
				//----------------------------------------
				printCoolWay(answer);
				//----------------------------------------
				System.out.println("]");
				//----------------------------------------
				timeWait(2700);
				//----------------------------------------
			}
			if (score == 0){
				System.out.println("---------------------------------------------------------------");
				System.out.println("[GAME OVER]");
				System.out.println("---------------------------------------------------------------");
				removeEntireLists(); //RESETS LIST
				break;
			}else if (score > 0 && n == 1){ 
				System.out.println("---------------------------------------------------------------");
				System.out.println("[YOU SURVIVED!]");
				System.out.println("---------------------------------------------------------------");
				removeEntireLists(); //RESETS LIST
				break;
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			removeQuestion_Answer(r);
			n--;  
		}
	}
	
	//==================================================================== 

	public static void timeWait(int n){
		try {
			Thread.sleep(n); //WAITS
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//==================================================================== 

	public static void printCoolWay(String s){
		for (int i = 0; i < s.length(); i++){
			System.out.print(s.toUpperCase().charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace(); //FROM AUTO GENERATED CODE
			}
		}
	}
	
	//==================================================================== 
	
}
