import java.util.Scanner;
import java.util.ArrayList;

public class Task1_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input decimal number:");
		ArrayList<Character> arrost = new ArrayList<Character>();
		int decimal, rest, hexDigit, rank = 0;
		
		decimal = in.nextInt();

		while (decimal >= 16) {
			rank++;
			hexDigit = decimal / 16;
			rest = decimal - hexDigit * 16;
			decimal = hexDigit;

			if (rest < 10) {
				arrost.add((char) (rest + 48));
			} else {
				arrost.add((char) (rest + 55));
				
			}
		}

		if (decimal < 10) {
			arrost.add((char) (decimal + 48));
			
		} else {
			arrost.add((char) (decimal + 55));
		}
		
		System.out.println("Number converted to heximal:");
		for (int i = rank; i >= 0; i--){
			System.out.print(arrost.get(i));	
		}
		
		
	}
}