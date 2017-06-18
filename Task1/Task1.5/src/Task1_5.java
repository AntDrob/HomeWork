import java.util.Scanner;

public class Task1_5 {

	public static void main(String[] args) {
		short a,b;
		int max, min;
		Scanner in=new Scanner(System.in);
		System.out.println("Input 2 numbers:");
		a = in.nextShort();
		b = in.nextShort();
		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		
		System.out.println("Chars with numbers between two inputed numbers:");
		for (int i = min; i <= max; i++){
			System.out.print((char)i + " ");
		}
	}

}
