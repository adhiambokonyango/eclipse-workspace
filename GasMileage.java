package gasMilage;

public class GasMileage {
//instance
	private int miles;
	private int gallons;

	//end instance
	//constructor
	public GasMileage(int miles, int gallons)
	{
		this.miles=miles;
		this.gallons = gallons;
		
	}//end constructor
	//getters
	public int getMiles() {
		return miles;
	}//end getters
	

	public void setMiles(int miles) {
		this.miles = miles;
	}//end getters
	public int getGallons() {
		return gallons;
	}//end getters
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}//end getters
	//end getters
		//calculate miles per gallon
		public double milesPerGallon (int miles, int gallons)
		{
			double mPg = miles/gallons;
			return mPg;	
		}//end method
		
		/*
		//calculate miles total
				public int totalMiles (int miles)
				{
				int distanceInMiles= 0;
				 distanceInMiles = miles *trip;
				 return distanceInMiles;
				}//end method
		//end calculate
				//calculate miles total
				public int totalGallons (int gallons)
				{
				int litre= 0;
				litre  = gallons *trip;
				 return litre;
				}//end method
				//calculate miles per gallon
				public double totalMilesPerGallon (int distanceInMiles, int litre)
				{
					double tMpG = distanceInMiles/litre;
					return tMpG;	
				}//end method
		//end calculate**/
}//end class
