package androb.FinesCalculator.model;

public class BaseFine {
	protected int baseAmount = 5000;
	protected double bribesFactor = 0.5;
	protected double rogueDocumentsFactor = 0;
	
	public int returnFineAmount(boolean bribesEnabled, boolean haveRogueDocuments)
	{
		double factor = 1;
		
		if (bribesEnabled)
			factor *= this.bribesFactor;
		
		if (haveRogueDocuments) 
			factor *= this.rogueDocumentsFactor;
		
		return (int)(baseAmount * factor);
		
	}
}
