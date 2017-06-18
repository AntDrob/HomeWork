import java.util.Scanner;

public class Task1_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input 5 numbers:");
		double array[] = new double[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = in.nextDouble();
		}
		
		double difference = Math.abs(array[1]) + 10;
		double nearest = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print( array[i] + " ");
			if (Math.abs(10 - array[i]) < difference) {
				difference = Math.abs(10 - array[i]);
				nearest = array[i];
			}
		}
		
		System.out.println();
		System.out.print( "The nearest nuber to 10: " + nearest );
		in.close();
	}

}