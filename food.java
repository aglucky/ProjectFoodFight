public class food 
{
	private String name;	
	private double carbon;	

  public food(String a, double b)
	{
		name = a;
		carbon = b;
	}
	
	public food()
	{
		name = " ";
		carbon = 0;
	}
	

	public String getName()
	{
		return name;
	}
	

	public double getCarbon()
	{
		return carbon;
	}


	public double getScore(double quantity)
	{
		return(this.getCarbon()*quantity);

  }
}
