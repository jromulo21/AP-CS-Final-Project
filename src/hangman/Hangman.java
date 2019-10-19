package hangman;
import java.util.Scanner;

public class Hangman {
	public static boolean decision = true; //DETERMINES IF GAME WILL BE EXECUTED
	public static Scanner scanner = new Scanner(System.in);
	public static String playerName;
	
	public static void main(String[] args){
	
		//--------------------------------------------------------		
		
		System.out.print("Enter name: ");
		playerName = scanner.nextLine();
	
		//--------------------------------------------------------		

		while (true){
			if (decision == false){
				break;
			}else{
				executeGame(); //GAME EXECUTION	
			}
		}
		
		//--------------------------------------------------------		

	}
	
	//============================================================
	
	public static void executeGame(){

		//--------------------------------------------------------		
		
		Game play = new Game(playerName);
		play.mainProcess();
		
		//--------------------------------------------------------		
		
		while (true){
			System.out.print("Do you want to play again? (yes/no): ");
			String userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("no")){
				System.out.println("[Thanks for playing!]");
				decision = false;
				break;
			}else if (userInput.equalsIgnoreCase("yes")){
				System.out.println("[You said yes]");
				break;
			}else{
				System.out.println("----------------------------------------------");
				System.out.println("Enter valid response");
				System.out.println("----------------------------------------------");
			}
		}
		
		//--------------------------------------------------------		

	}
	
	//============================================================

}
