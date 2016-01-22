public class Product
{
       
	private int pcode;

	private String pname;

	private double price;

	


	// accesors / getter()  -- retreive the values

	// mutators / setter() -- assign the values


	// setXXX() methods 

         public void setPcode(int pcode)
	{

		this.pcode = pcode;
	}       
	
	public void setPname(String pname)
	{
		this.pname = pname;

	}

	public void setPrice(double price)
	{
		this.price = price;
	}


	public int getPcode()

	{

		return pcode;
	}
	
	public String getName()
	{
		return pname;
	}
	
       public String getPname()
	{
		return pname;
	
	}

	public double getPrice()
	{

		return price;
	}


}