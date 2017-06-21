
public class Task4_1 {
	public static void main(String[] args) {
		Integer[][] array = new Integer[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = (int) (Math.random() * 100);
				System.out.print(String.format("%3d ", array[i][j]));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				boolean flag = false;
				for (int k = 0; k < 5; k++) {
					for (int l = 0; l < 5; l++) {
						if ((array[i][j] == array[k][l]) && (i != k) && (j != l)) {
							if (!flag) {
								System.out.print("The value (" + array[i][j] + ") of array elemnt with index[" + i + "][" + j + "] was also found in: ");
								flag = true;
							}
								
							System.out.print("[" + k + "][" + l + "], ");
						}
					}
				}
				if (flag)
					System.out.println();
				flag = false;
			}
		}
	}
}
