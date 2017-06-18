public class Task1_4 {

	public static void main(String[] args) {
		int array[][] = new int [5][8];
		int a = -99, b = 99;
		
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 8; j++)
				array[i][j] = a + (int) (Math.random() * (b - a));
				
		int max = array[0][0];
		
		System.out.println("Array content:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf("%4d ", array[i][j]);
				max = (max > array[i][j]) ? max : array[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Biggest array element: " + max);
	}
}