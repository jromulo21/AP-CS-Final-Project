package hangman;

public class HangmanGrid {
	private String[][] hangmanGrid;
	private static String complete = "";
	
	public HangmanGrid(){
		hangmanGrid = new String[20][30];
	}
	//==================================================================== 
	
	public String topLevel(){
		String top= " ";
		for (int i = 0; i < hangmanGrid.length; i++){
			top += "-";
		}
		return top;
	}
	
	//==================================================================== 
	
	public String midLevel(int score){
		String mid = "";
		for (int i = 0; i < hangmanGrid.length; i++){ //ARRAYLENGTH
			for (int j = 0; j < hangmanGrid[0].length; j++){ //UPDATE TO ARRAYLENGTH
				//----------BODY PARTS
				if (j == 0 || (j == 19 && i < 4)){
					mid += "| "; //GRID
				}else if ((i > 4 && i < 7) && (j == 16 || j == 21) && score >= 1){ //ONLY DRAW IF SCORE >= 1
					mid += "| "; //HEAD PORTION
				}else if ((i == 4 || i == 7) && (j > 16 && j < 20) && score >= 1){ //ONLY DRAW IF SCORE >= 1
					mid += "- "; //HEAD PORTION
				}else if ((i > 7 && i < 12) && (j == 19) && score >= 2){ //ONLY DRAW IF SCORE >= 2
					mid += "|"; //TORSO
				//====================================================================================================================
				}else if (((i == 9 && j == 18) || (i == 10 && j == 17)) && score >= 3){ //ONLY DRAW IF SCORE >= 3
					mid += "/";  //LEFT ARM
				}else if (((i == 12 && j == 18) || (i == 13 && j == 17)) && score >= 4){ //ONLY DRAW IF SCORE >= 3
					mid += "/"; //LEFT LEG
				//--------------------------------------------------------------------------------------------------------------------
				}else if (((i == 12 && j == 20) || (i == 13 && j == 21)) && score >= 5){
					mid += "\\"; //RIGHT LEG
				}else if (((i == 9 && j == 20) || (i == 10 && j == 21)) && score >= 6){ //ONLY DRAW IF SCORE >= 4
					mid += "\\"; //RIGHT ARM
				//====================================================================================================================
				}else{
					mid += " "; //SPACES
				}
				//----------BODY PARTS
			}
			if (i < hangmanGrid.length - 1){
				mid += "\n"; //NEW LINES
			}
		}
		return mid;
	}
	
	//====================================================================

	public String bottomLevel(){
		String bottom = "";
		for (int i = 0; i < hangmanGrid[0].length; i++){
			bottom += "=";
		}
		return bottom;
	}
	
	//====================================================================	
	//====================================================================
	//====================================================================

	public String base(int score){
		String base = "";
		if (score >= 1){
			for (int i = 0; i < hangmanGrid.length; i++){ //ARRAYLENGTH
				for (int j = 0; j < hangmanGrid[0].length; j++){ //UPDATE TO ARRAYLENGTH
					//----------BODY PARTS
					if (j == 0 || (j == 20 && i < 4)){
						base += "| "; //GRID
					}else{
						base += " "; //SPACES
					}
				}
				if (i < hangmanGrid.length - 1){
					base += "\n"; //NEW LINES
				}
			}
			return topLevel() + "\n" + base + "\n" + bottomLevel();
		}
		return null;
	}

	//==================================================================== 
	
	public String returnComplete(int score){
		return topLevel() + "\n" + midLevel(score) + "\n" + bottomLevel();
	}
	
	//==================================================================== CLASS TESTING
	
	public static void main(String[] args){
		HangmanGrid grid = new HangmanGrid();
		System.out.println(grid.returnComplete(6));
	}
	
	//==================================================================== CLASS TESTING

}

//THREADS IN JAVA
