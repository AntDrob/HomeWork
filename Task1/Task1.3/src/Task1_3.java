public class Task1_3 {

	public static void main(String[] args) {
		int array[][] = new int [8][5];
		int a = 10, b = 99;
		
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 5; j++)
				array[i][j] = a + (int) (Math.random() * (b - a));
				
		
		System.out.println("Array content:");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%4d ", array[i][j]);
			}
			System.out.println();
		}
	}
}