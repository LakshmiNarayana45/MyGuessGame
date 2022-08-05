package GuessGame;


import java.util.Scanner;
		class Guesser{
			
			public int Guesser(){
				Scanner sc = new Scanner(System.in);
				int Guessnumber;
				System.out.print("Guesser Kindly Enter the number from range 0 to 100 :");
				Guessnumber=sc.nextInt();
				return Guessnumber;
			}
		}
		class Player{
			
			public int guessNumber(){
			Scanner sc = new Scanner(System.in);
			int playerGuessno;
			System.out.print("Player kindly guess the number from range 0 to 100  :");
			playerGuessno = sc.nextInt();
			return playerGuessno;
			}	
		}
		class Umpire{
			int numFromGuesser;
			int numFromPlayer1;
			int numFromPlayer2;
			int numFromPlayer3;
			
			public void collectnumberFromGuesser(){
				Guesser gs = new Guesser();
				numFromGuesser=gs.Guesser();
			}
			
			public void collectnumberFromPlayers(){
				Player p1=new Player();
				Player p2=new Player();
				Player p3=new Player();
				numFromPlayer1=p1.guessNumber();
				numFromPlayer2=p2.guessNumber();
				numFromPlayer3=p3.guessNumber();
			}
			
			public void compare(){
				System.out.println();
		 
			if(numFromGuesser<=100) 
			{
				if(numFromPlayer1==numFromGuesser) 
				{
					if(numFromPlayer1==numFromPlayer2&&numFromPlayer1==numFromPlayer3)
					{
						System.out.println("Match got  tied");
					}
					else if(numFromPlayer1==numFromPlayer2) 
					{
						System.out.println("1 and 2 Players Won the game");
					}
					else if(numFromPlayer1==numFromPlayer3) 
					{
						System.out.println(" 1 and 3 Players won the game");
					}else 
					{
					System.out.println("1st Player won the Game");
					}
				}
				else if(numFromPlayer2==numFromGuesser) 
				{
					if(numFromPlayer2==numFromPlayer3)
					{
						System.out.println("2 and 3rd Players won the game");
					}
					else if(numFromPlayer2!=numFromGuesser) {
						System.out.println("2nd Player Better Luck Next Time");
					}
					else 
					{
					System.out.println("2nd Player won the game");
					}
				}
				else if(numFromPlayer3==numFromGuesser)
				{
					System.out.println("3rd Player won the game");
				}
				else
				{
					System.out.println("All Lost Please Try Again");
				}
				
				if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2&&numFromGuesser!=numFromPlayer3)
				{
					System.out.println();
					System.out.println("All Players - Better Luck Next Time ");
				}
				else if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2) 
				{
					System.out.println();
					System.out.println("1st and 2nd player - Better luck next time ");
				}
				else if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer3) 
				{
					System.out.println();
					System.out.println("1st and 3rd player - Better luck next time");
				}else if(numFromGuesser!=numFromPlayer2&&numFromGuesser!=numFromPlayer3) 
				{
					System.out.println();
					System.out.println("2nd and 3rd Players - Better Luck Next Time ");
				}
				else if(numFromGuesser!=numFromPlayer1) 
				{
					System.out.println();
					System.out.println("Player 1 - Better Luck next time ");
				}
				else if(numFromGuesser!=numFromPlayer2) 
				{
					System.out.println();
					System.out.println("Player 2 - Better Luck next time ");
				}
				else if(numFromGuesser!=numFromPlayer3) 
				{
					System.out.println();
					System.out.println("Player 3 - Better Luck next time ");
				}
				
			//3rd Condition
			if(numFromPlayer1>100) 
			{
				System.out.println();
				System.out.println("* Player 1 please guess the number from range 0-100 *");
				
			}
			if(numFromPlayer2>100) 
			{
				System.out.println();
				System.out.println("Player 2 please guess the number from range 0-100");
			}
			if(numFromPlayer3>100) 
			{
				System.out.println();
				System.out.println("Player 3 please guess the number from range 0-100");
			}
				
			}
			else 
			{
				System.out.println("Error - Guesser guessed the number above 100 that is not in range");
				
			}
		  }
		}
		public class MyGuessGame {

			public static void main(String[] args) {
				Umpire U1= new Umpire();
				U1.collectnumberFromGuesser();
				U1.collectnumberFromPlayers();
				U1.compare();
			}
		

	}


