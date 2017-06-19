
public class Task3_2 {
	public static void main(String[] args) {
		String html = new String("1. <HTML> <HEAD>\n"
				+ "2. <TITLE>Управление разрывом строк </Title>\n"
				+ "3. </HEAD>\n"
				+ "4. <BODY>\n"
				+ "5. <marquee>Это моя учебная  страница.</marquee>\n" 
				+ "6. <H2>Меня зовут <kbd>Ольга. </kbd></H2>\n" 
				+ "7. <H3 align=\"center\">Я живу во <em>Владивостоке</em>.</H3>\n"
				+ "8. <H4 align=\"right\">Моя маленькая родина -  <font face=\"Academy\" color=\"Red\">Сахалин</font>. </H4>\n"
				+ "9. <H5 align=left>ДВГУ - ВУЗ в котором я работаю.</H5>\n"
				+ "10. <B>Здесь</B>\n"
				+ "11. <I>продемонстрированы</I>\n"
				+ "12. <Blink>различные</Blink>\n"
				+ "13. <U> способы </U>\n"
				+ "14. <KBD>управления </KBD>\n"
				+ "15. <FONT SIZE=5 COLOR=FF80C0>шрифтом:</FONT> его\n"
				+ "16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и\n"
				+ "17. <FONT SIZE=+3 COLOR=FF00FF>размером.</FONT>\n"
				+ "18. </BODY> </HTML>");
		String lowerCaseHtml = html.toLowerCase();
		
		System.out.println("a) Количество тэгов(открывающие и закрывающие считаются двумя отдельными тэгами): " + html.chars().filter(num -> num == '<').count());
		
		int start = html.indexOf("<marquee>") + "<marquee>".length();
		int end = html.indexOf("</marquee>");
		System.out.println("b) Текст бегущей строки: " + html.substring(start, end));
		
		start = 0;
		System.out.println("\nc) Использование тега <kbd>:");
		while (lowerCaseHtml.indexOf("<kbd>", start) != -1) {
			start = lowerCaseHtml.indexOf("<kbd>", start);
			end = lowerCaseHtml.indexOf("</kbd>", start);
			System.out.println(html.substring(start, end + 6));
			start = end;
		}
		
		start = 0;
		for (int i = 0; i < 15; i++) {
			start = html.indexOf("\n", start + 1);
		}
		start = html.indexOf("COLOR=", start) + "COLOR=".length();
		System.out.println("\nd) Цвет используемый в 16 строке html кода: " + html.substring(start, start + 6));
		
		
		start = 0;
		StringBuilder outputText = new StringBuilder();
		while (lowerCaseHtml.indexOf("<", start) != -1) {
			start = lowerCaseHtml.indexOf(">", start);
			end = lowerCaseHtml.indexOf("<", start);
			if (end != -1) {
				outputText.append(html.substring(start + 1, end));
				start = end;
			}
		}
		System.out.println("e) Текст выводимый на экран (одной строкой): ");
		System.out.println(outputText.toString().replaceAll("\r?\n\\d+. +", " ").replaceAll(" +", " ").replaceAll("^ ", ""));
		
		start = 0;
		end = 0;
		outputText = new StringBuilder();
		while (lowerCaseHtml.indexOf("<", end) != -1) {
			start = lowerCaseHtml.indexOf("<", end);
			
			outputText.append(html.substring(end, start));
			
			end = lowerCaseHtml.indexOf(">", start);
			int start1 = lowerCaseHtml.indexOf("=", start);
			
			if ((start1 != -1) && (start1 < end) && (html.charAt(start1 + 1) != '"')) {
				start1 += 1;
				outputText.append(html.substring(start, start1)).append("\"");
				int varEnd = Math.min(lowerCaseHtml.indexOf(" ", start1), end);
				outputText.append(html.substring(start1, varEnd)).append("\"").append(html.substring(varEnd, end));
			} else {
				outputText.append(html.substring(start, end));
			}
		}
		System.out.println("\nf) Пофикшенные теги: ");
		System.out.println(outputText.toString());
	}
}
