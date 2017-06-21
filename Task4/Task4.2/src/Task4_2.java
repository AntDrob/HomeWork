import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4_2 {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		
		List<String> strings = new ArrayList<String>();
		int maxLength = 0;
		
		System.out.println("Введите строки (с разным количеством слов), для окончания ввода введите строку содержащую только слово end");
		
		while (true) {
			String temp = consoleInput.nextLine().trim().replaceAll(" +", " ");
			if (temp.equals("end")) {
				break;
			} else {
				strings.add(temp);
				int length = (int) temp.chars().filter(ch -> ch == ' ').count() + 1;
				maxLength = (maxLength < length) ? length : maxLength;
			}
		}
		
		System.out.println("\nПолученная матрица:");
		
		String[][] words = new String[strings.size()][maxLength];
		for (int i = 0; i < strings.size(); i++) {
			String[] lineWords = strings.get(i).split(" ");
			
			for (int j = 0; j < lineWords.length; j++) {
				System.out.printf("%10s", lineWords[j] + "\t");
				words[i][j] = lineWords[j];
			}
			System.out.println();
		}
		
		System.out.print("\nВведите искомую подстроку: ");
		String query = consoleInput.next();
		System.out.println("Координаты этого слова: ");
		int s = 0;

		for (int i = 0; i < words.length; i++){
			for (int j = 0; j < words[i].length; j++) {
				if ((words[i][j] != null) && (-1 != words[i][j].indexOf(query))) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
