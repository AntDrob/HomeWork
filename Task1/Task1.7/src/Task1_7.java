import java.util.Scanner;
import java.util.Arrays;

public class Task1_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input strings count:");
		int a = in.nextInt();
		String array[] = new String[a];
		
		System.out.println("Input dictionary with " + a + " strings:");
		for (int i = 0; i <= (a - 1); i++) {
			array[i] = in.next();
		}
		
		Arrays.sort(array);
		System.out.println();
		System.out.println("Your sorted dictionary:");
		for (int i = 0; i <= (a - 1); i++) {
			System.out.println(array[i] + " ");
		}
	}

}
