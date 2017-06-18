import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Программа для решения квадратных уравнений вида ax^2 + bx + c");
		System.out.println("Введите коэффиценты a, b и c:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println("Решаемое уравнение: (" + a + "x^2) + (" + b + "x) + (" + c + ")");
		
		double discreminant = Math.pow(b, 2) - 4 * a * c;
		if (discreminant < 0) {
			System.out.println("Уравнение не имеет корней");
		} else {
			System.out.printf("Корни уравнения: " + ((-b + Math.pow(discreminant, 0.5)) / (2 * a)) + "; " + ((-b - Math.pow(discreminant, 0.5)) / (2 * a)));
		}
	}

}
