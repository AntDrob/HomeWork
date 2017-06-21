import java.util.Scanner;

public class Task4_3 {
	public static void main(String[] args) {
		int matrix[][] = {{ 15, 20, 40, 85, 100 }, 
						{ 20, 35, 80, 95, 110 },
						{ 30, 55, 95, 105, 130 },
						{ 40, 80, 100, 120, 134 },
						{ 50, 90, 110, 121, 140 } };
		
		System.out.println("Матрица по которой осуществляется поиск:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%4d ", matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("Введите значение для поиска: ");
		Scanner in = new Scanner(System.in);
		int query = in.nextInt();
		
		int border = -1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ((border != -1) && (j >= border))
					break;
				
				if (matrix[i][j] == query) {
					System.out.println("Искомое значение найдено в яцейке: [" + i + "][" + j + "]");
				}
				
				if (matrix[i][j] > query) {
					border = j;
					break;
				}
			}
		}
		
	}

}
