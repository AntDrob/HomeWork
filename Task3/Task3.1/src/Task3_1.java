import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3_1 {
	public static void main(String[] args) {
		String text = new String("Жила-была коза с козлятами. Уходила коза в лес есть траву шелковую, пить воду студёную. Как только уйдет — козлятки запрут избушку и сами никуда не выходят. Воротится коза, постучится в дверь и запоёт: — Козлятки, ребятушки! Отопритеся, отворитеся! Ваша мать пришла — молока принесла; Бежит молоко по вымечку, Из вымечку по копытечку, Из копытечку во сыру землю! Козлятки отопрут дверь и впустят мать. Она их покормит, напоит и опять уйдет в лес, козлятки запрутся крепко-накрепко. Волк подслушал, как поёт коза. Вот раз коза ушла, волк побежал к избушке и закричал толстым голосом: — Вы, детушки! Вы, козлятки! Отопритеся, Отворитеся! Ваша мать пришла, Молока принесла. Полны копытца водицы!");
		String words[] = text.replaceAll("([—,!;:.])" , "").replaceAll("\\s{2}", " ").toLowerCase().split("\\s");
		
		System.out.println("Words array:");
		System.out.println(Arrays.toString(words));
		
		System.out.println("\nWord : count paired output:");
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String word : words) {
			int wordCount = wordsCount.get(word) != null ? wordsCount.get(word) + 1 : 1;
			wordsCount.put(word, wordCount);
		}
		
		
		for (String key : wordsCount.keySet()) {
			Integer value = wordsCount.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
}
