package in.codekamp.wrestling;

public class Game156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wrestler wrestler1 = new Wrestler("Undertaker", 2, 10.5, 100.0, 40, 5);

		System.out.println(wrestler1.toString());
		//wrestler1.rank = 5;

		//System.out.println(wrestler1.toString());

		Wrestler wrestler2 = new Wrestler("Khali", 5, 12.5, 150.0, 10, 4);

		System.out.println(wrestler2.toString());
		
		Wrestler wrestler3 = new Wrestler("Seth Rollins", 10, 8.9, 189.0, 13, 8);

		System.out.println(wrestler3.toString());
		
		Wrestler wrestler4 = new Wrestler("Ryback", 15, 11.0, 99.0, 10, 6);

		System.out.println(wrestler4.toString());
		
		Wrestler wrestler5 = new Wrestler("John Cena", 7, 9.5, 159.0, 10, 2);

		System.out.println(wrestler5.toString());
		
		Wrestler wrestler6 = new Wrestler("Triple H", 4, 8.8, 200.0, 45, 7);

		System.out.println(wrestler6.toString());
		
		
		/*try {
			int wins = wrestler2.setMatchesWon(15);
			System.out.println("Matches won = " + wins);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		
		Wrestler[] wrestlers1 = {wrestler1, wrestler2,wrestler3, wrestler4,wrestler5, wrestler6};
		
		int randomNumber1=(int) (Math.random() * 6);
		System.out.println("\nPlayer 1 westler is=" +wrestlers1[randomNumber1]);
		
		
		
        Wrestler[] wrestlers2 = {wrestler1, wrestler2,wrestler3, wrestler4,wrestler5, wrestler6};
		
		int randomNumber2=(int) (Math.random() * 6);
		System.out.println("Player 2 westler is=" +wrestlers2[randomNumber2]);
		
	}

}
