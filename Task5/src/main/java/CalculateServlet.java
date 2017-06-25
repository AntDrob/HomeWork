import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import androb.finescalculator.model.*;

public class CalculateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		PaymentAbility paymentAbility = new PaymentAbility();
		try {
			paymentAbility.moneyAmount = Integer.parseInt(request.getParameter("moneyAmount"));
		} catch (NumberFormatException e) {
			response.getWriter().print("Некоректнон количество денег!");
			return;
		}
		paymentAbility.bribesEnabled = request.getParameter("bribes").equals("yes");
		paymentAbility.haveRogueDocuments = request.getParameter("documents").equals("yes");

		ArrayList<BaseFine> fines = new ArrayList<BaseFine>();

		int numberOfFines;

		try {
			numberOfFines = Integer.parseInt(request.getParameter("speed"));
		} catch (NumberFormatException e) {
			numberOfFines = 0;
		}
		for (int i = 0; i < numberOfFines; i++)
			fines.add(new SpeedFine());

		try {
			numberOfFines = Integer.parseInt(request.getParameter("alco"));
		} catch (NumberFormatException e) {
			numberOfFines = 0;
		}
		for (int i = 0; i < numberOfFines; i++)
			fines.add(new AlcoFine());

		try {
			numberOfFines = Integer.parseInt(request.getParameter("drugs"));
		} catch (NumberFormatException e) {
			numberOfFines = 0;
		}
		for (int i = 0; i < numberOfFines; i++)
			fines.add(new DrugsFine());

		try {
			numberOfFines = Integer.parseInt(request.getParameter("tonning"));
		} catch (NumberFormatException e) {
			numberOfFines = 0;
		}
		for (int i = 0; i < numberOfFines; i++)
			fines.add(new TonningFine());

		try {
			numberOfFines = Integer.parseInt(request.getParameter("base"));
		} catch (NumberFormatException e) {
			numberOfFines = 0;
		}
		for (int i = 0; i < numberOfFines; i++)
			fines.add(new BaseFine());

		int moneyAfterFines = paymentAbility.howMuchMoneyLeft(fines.toArray(new BaseFine[fines.size()]));

		if (moneyAfterFines >= 0) {
			response.getWriter().print(
					"Вам хватит денег на оплату штрафов! После оплаты у вас останется " + moneyAfterFines + " рублей.");
		} else {
			response.getWriter().print("Вам не хватит " + Math.abs(moneyAfterFines) + " рублей на оплату штрафов!");
		}
	}
}