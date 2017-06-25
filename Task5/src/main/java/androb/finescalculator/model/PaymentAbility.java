package androb.finescalculator.model;

public class PaymentAbility {
	public Integer moneyAmount = 0;
	public boolean bribesEnabled = false;
	public boolean haveRogueDocuments = false;
	
	public int howMuchMoneyLeft(BaseFine fines[])
	{
		int finesAmount = 0;
		
		for (BaseFine fine : fines) {
			finesAmount += fine.returnFineAmount(this.bribesEnabled, this.haveRogueDocuments);
		}
		
		return this.moneyAmount - finesAmount;
	}
	
}
